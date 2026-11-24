package com.classora.app;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.*;
import android.widget.Toast;
import java.io.OutputStream;
public class MainActivity extends Activity {
 private static final int PICK_FILE=4101, SAVE_FILE=4102;
 private ValueCallback<Uri[]> fileCallback;
 private String backupJson;
 private WebView webView;
 @Override public void onCreate(Bundle state){
  super.onCreate(state);
  getWindow().setStatusBarColor(0xFF080C17);
  getWindow().setNavigationBarColor(0xFF080C17);
  webView=new WebView(this); webView.setBackgroundColor(0xFF080C17);
  WebSettings s=webView.getSettings(); s.setJavaScriptEnabled(true); s.setDomStorageEnabled(true); s.setAllowFileAccess(true); s.setAllowContentAccess(true); s.setSupportZoom(false);
  webView.addJavascriptInterface(new BackupBridge(),"ClassoraBridge");
  webView.setWebChromeClient(new WebChromeClient(){
   @Override public boolean onShowFileChooser(WebView v,ValueCallback<Uri[]> cb,FileChooserParams params){
    if(fileCallback!=null)fileCallback.onReceiveValue(null); fileCallback=cb;
    Intent i=new Intent(Intent.ACTION_GET_CONTENT); i.addCategory(Intent.CATEGORY_OPENABLE); i.setType("application/json");
    startActivityForResult(Intent.createChooser(i,"Choose Classora backup"),PICK_FILE); return true;
   }
  });
  setContentView(webView); webView.loadUrl("file:///android_asset/www/index.html");
 }
 private class BackupBridge {
  @JavascriptInterface public void saveBackup(String json){runOnUiThread(()->{
   backupJson=json; Intent i=new Intent(Intent.ACTION_CREATE_DOCUMENT); i.addCategory(Intent.CATEGORY_OPENABLE); i.setType("application/json"); i.putExtra(Intent.EXTRA_TITLE,"classora-backup.json"); startActivityForResult(i,SAVE_FILE);
  });}
 }
 @Override protected void onActivityResult(int requestCode,int resultCode,Intent data){
  super.onActivityResult(requestCode,resultCode,data);
  if(requestCode==PICK_FILE && fileCallback!=null){
   Uri[] result=resultCode==RESULT_OK && data!=null && data.getData()!=null?new Uri[]{data.getData()}:null;
   fileCallback.onReceiveValue(result); fileCallback=null;
  } else if(requestCode==SAVE_FILE && resultCode==RESULT_OK && data!=null && data.getData()!=null){
   try(OutputStream out=getContentResolver().openOutputStream(data.getData())){out.write(backupJson.getBytes("UTF-8"));Toast.makeText(this,"Classora backup saved",Toast.LENGTH_SHORT).show();}
   catch(Exception e){Toast.makeText(this,"Could not save backup",Toast.LENGTH_LONG).show();}
   finally{backupJson=null;}
  }
 }
 @Override public void onBackPressed(){if(webView!=null&&webView.canGoBack())webView.goBack();else super.onBackPressed();}
}