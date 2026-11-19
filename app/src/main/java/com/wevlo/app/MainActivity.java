package com.wevlo.app;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
public class MainActivity extends Activity {
    @Override protected void onCreate(Bundle b) {
        super.onCreate(b);
        WebView w = new WebView(this);
        w.getSettings().setJavaScriptEnabled(true);
        w.getSettings().setDomStorageEnabled(true);
        w.loadDataWithBaseURL(null, "<!DOCTYPE html><html><head><meta name=\"viewport\" content=\"width=device-width,initial-scale=1\"><style>body{font-family:sans-serif;background:#f6f6fb;display:grid;place-items:center;min-height:100vh;margin:0}.card{background:#fff;padding:28px;border-radius:20px;text-align:center;box-shadow:0 10px 25px rgba(109,40,217,.1)}button{background:#6d28d9;color:#fff;border:none;padding:10px 22px;border-radius:99px;font-weight:bold}</style></head><body><div class=\"card\">  <h1>Hi</h1>  <p>Built with Wevlo</p>  <button onclick=\"go()\">Get Started</button></div><script>function go(){  alert(\"Hello from Hi!\");}</script></body></html>", "text/html", "UTF-8", null);
        setContentView(w);
    }
}