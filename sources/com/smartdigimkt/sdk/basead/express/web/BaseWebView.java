package com.smartdigimkt.sdk.basead.express.web;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.p004ironsource.d9;
import com.smartdigimkt.d7.d;
import com.smartdigimkt.n8.h;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class BaseWebView extends WebView {
    protected Context e0;
    private boolean f0;
    private View.OnTouchListener g0;
    private View.OnTouchListener h0;
    public long lastTouchTime;
    public com.smartdigimkt.u4.b mWebViewClient;

    public class a implements View.OnTouchListener {
        public a() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0) {
                BaseWebView.this.lastTouchTime = System.currentTimeMillis();
            }
            if (BaseWebView.this.h0 != null) {
                return BaseWebView.this.h0.onTouch(view, motionEvent);
            }
            return false;
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BaseWebView.this.f0 = true;
            BaseWebView.this.destroy();
        }
    }

    public BaseWebView(Context context) {
        super(context);
        this.lastTouchTime = 0L;
        this.f0 = false;
        this.g0 = new a();
        this.e0 = context.getApplicationContext();
        a();
    }

    public String checkToGetUrl(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        if (!str.contains("../")) {
            if (!str.startsWith(d9.h.f24719b)) {
                return str;
            }
            String path = Uri.parse(str).getPath();
            if (!TextUtils.isEmpty(path) && path.contains(d.c().d())) {
                return str;
            }
        }
        Log.e("sdm_express", "illegal URL: ".concat(str));
        return "about:blank";
    }

    public com.smartdigimkt.u4.b getBaseWebViewClient() {
        return this.mWebViewClient;
    }

    public boolean isDestroyed() {
        return this.f0;
    }

    @Override // android.webkit.WebView
    public void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        super.loadDataWithBaseURL(checkToGetUrl(str), str2, str3, str4, str5);
    }

    @Override // android.webkit.WebView
    public void loadUrl(String str) {
        super.loadUrl(checkToGetUrl(str));
    }

    public void release() {
        try {
            removeAllViews();
            setDownloadListener(null);
            Context context = getContext();
            if (context == null) {
                context = com.smartdigimkt.m6.b.p().k();
            }
            float fA = h.a(context);
            if (fA != 0.0f) {
                com.smartdigimkt.l7.b.a().b(new b(), (long) (fA * 1000.0f));
            } else {
                this.f0 = true;
                destroy();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // android.webkit.WebView
    public void reload() {
        super.reload();
    }

    public void setFilter(com.smartdigimkt.u4.a aVar) {
        com.smartdigimkt.u4.b bVar = this.mWebViewClient;
        if (bVar != null) {
            bVar.a(aVar);
        }
    }

    @Override // android.view.View
    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.h0 = onTouchListener;
    }

    public void setTransparent() {
        setLayerType(1, null);
        setBackgroundColor(0);
    }

    @Override // android.webkit.WebView
    public void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        if (webViewClient instanceof com.smartdigimkt.u4.b) {
            this.mWebViewClient = (com.smartdigimkt.u4.b) webViewClient;
        }
    }

    @Override // android.webkit.WebView
    public void loadUrl(String str, Map<String, String> map) {
        super.loadUrl(checkToGetUrl(str), map);
    }

    public void a() {
        Class cls = Boolean.TYPE;
        if (this.mWebViewClient == null) {
            com.smartdigimkt.u4.b bVar = new com.smartdigimkt.u4.b();
            this.mWebViewClient = bVar;
            setWebViewClient(bVar);
        }
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        requestFocus();
        WebSettings settings = getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setCacheMode(-1);
        settings.setAllowFileAccess(true);
        settings.setBuiltInZoomControls(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setDomStorageEnabled(true);
        settings.setSupportZoom(false);
        settings.setSavePassword(false);
        settings.setDatabaseEnabled(true);
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);
        settings.setRenderPriority(WebSettings.RenderPriority.HIGH);
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                settings.setSafeBrowsingEnabled(false);
            }
        } catch (Throwable unused) {
        }
        settings.setMediaPlaybackRequiresUserGesture(false);
        try {
            settings.setAllowUniversalAccessFromFileURLs(false);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        try {
            settings.setMixedContentMode(1);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        try {
            Method declaredMethod = WebSettings.class.getDeclaredMethod(com.smartdigimkt.n8.b.a("c2V0TWl4ZWRDb250ZW50TW9kZQ=="), Integer.TYPE);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(settings, 0);
        } catch (Throwable unused2) {
        }
        settings.setDatabaseEnabled(true);
        String path = this.e0.getDir("database", 0).getPath();
        settings.setDatabasePath(path);
        settings.setGeolocationEnabled(true);
        settings.setGeolocationDatabasePath(path);
        try {
            Method declaredMethod2 = WebSettings.class.getDeclaredMethod("setDisplayZoomControls", cls);
            declaredMethod2.setAccessible(true);
            declaredMethod2.invoke(settings, Boolean.FALSE);
        } catch (Throwable unused3) {
        }
        try {
            Method declaredMethod3 = WebSettings.class.getDeclaredMethod(com.smartdigimkt.n8.b.a("c2V0QWxsb3dVbml2ZXJzYWxBY2Nlc3NGcm9tRmlsZVVSTHM="), cls);
            declaredMethod3.setAccessible(true);
            declaredMethod3.invoke(settings, Boolean.TRUE);
        } catch (Throwable unused4) {
        }
        super.setOnTouchListener(this.g0);
    }

    public BaseWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.lastTouchTime = 0L;
        this.f0 = false;
        this.g0 = new a();
        this.e0 = context.getApplicationContext();
        a();
    }

    public BaseWebView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.lastTouchTime = 0L;
        this.f0 = false;
        this.g0 = new a();
        this.e0 = context.getApplicationContext();
        a();
    }
}
