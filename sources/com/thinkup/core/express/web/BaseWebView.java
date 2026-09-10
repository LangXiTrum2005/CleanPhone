package com.thinkup.core.express.web;

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
import com.thinkup.core.common.n.o0n;
import com.thinkup.core.common.ooo.mm;
import com.thinkup.core.common.ooo.o00;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class BaseWebView extends WebView {
    public long lastTouchTime;
    private boolean m;
    public m mWebViewClient;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private View.OnTouchListener f42389n;
    protected Context o;
    private View.OnTouchListener o0;

    public BaseWebView(Context context) {
        super(context);
        this.lastTouchTime = 0L;
        this.m = false;
        this.f42389n = new View.OnTouchListener() { // from class: com.thinkup.core.express.web.BaseWebView.1
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == 0) {
                    BaseWebView.this.lastTouchTime = System.currentTimeMillis();
                }
                if (BaseWebView.this.o0 != null) {
                    return BaseWebView.this.o0.onTouch(view, motionEvent);
                }
                return false;
            }
        };
        this.o = context.getApplicationContext();
        o();
    }

    public static /* synthetic */ boolean m(BaseWebView baseWebView) {
        baseWebView.m = true;
        return true;
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
            if (!TextUtils.isEmpty(path) && path.contains(com.thinkup.core.common.res.o0.o(o0n.m().on()).o())) {
                return str;
            }
        }
        Log.e("tpn_thinkup_express", "illegal URL: ".concat(String.valueOf(str)));
        return "about:blank";
    }

    public m getBaseWebViewClient() {
        return this.mWebViewClient;
    }

    public boolean isDestroyed() {
        return this.m;
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
                context = o0n.m().on();
            }
            float fN = o00.n(context);
            if (fN != 0.0f) {
                o0n.m().o(new Runnable() { // from class: com.thinkup.core.express.web.BaseWebView.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        BaseWebView.m(BaseWebView.this);
                        BaseWebView.this.destroy();
                    }
                }, (long) (fN * 1000.0f));
            } else {
                this.m = true;
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

    public void setFilter(o oVar) {
        m mVar = this.mWebViewClient;
        if (mVar == null || mVar == null) {
            return;
        }
        this.mWebViewClient.o(oVar);
    }

    @Override // android.view.View
    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.o0 = onTouchListener;
    }

    public void setTransparent() {
        setLayerType(1, null);
        setBackgroundColor(0);
    }

    @Override // android.webkit.WebView
    public void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        if (webViewClient instanceof m) {
            this.mWebViewClient = (m) webViewClient;
        }
    }

    private void o() {
        Class cls = Boolean.TYPE;
        if (this.mWebViewClient == null) {
            m mVar = new m();
            this.mWebViewClient = mVar;
            setWebViewClient(mVar);
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
            Method declaredMethod = WebSettings.class.getDeclaredMethod(mm.m("c2V0TWl4ZWRDb250ZW50TW9kZQ=="), Integer.TYPE);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(settings, 0);
        } catch (Throwable unused2) {
        }
        settings.setDatabaseEnabled(true);
        String path = this.o.getDir("database", 0).getPath();
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
            Method declaredMethod3 = WebSettings.class.getDeclaredMethod(mm.m("c2V0QWxsb3dVbml2ZXJzYWxBY2Nlc3NGcm9tRmlsZVVSTHM="), cls);
            declaredMethod3.setAccessible(true);
            declaredMethod3.invoke(settings, Boolean.TRUE);
        } catch (Throwable unused4) {
        }
        super.setOnTouchListener(this.f42389n);
    }

    @Override // android.webkit.WebView
    public void loadUrl(String str, Map<String, String> map) {
        super.loadUrl(checkToGetUrl(str), map);
    }

    public BaseWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.lastTouchTime = 0L;
        this.m = false;
        this.f42389n = new View.OnTouchListener() { // from class: com.thinkup.core.express.web.BaseWebView.1
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == 0) {
                    BaseWebView.this.lastTouchTime = System.currentTimeMillis();
                }
                if (BaseWebView.this.o0 != null) {
                    return BaseWebView.this.o0.onTouch(view, motionEvent);
                }
                return false;
            }
        };
        this.o = context.getApplicationContext();
        o();
    }

    public BaseWebView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.lastTouchTime = 0L;
        this.m = false;
        this.f42389n = new View.OnTouchListener() { // from class: com.thinkup.core.express.web.BaseWebView.1
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == 0) {
                    BaseWebView.this.lastTouchTime = System.currentTimeMillis();
                }
                if (BaseWebView.this.o0 != null) {
                    return BaseWebView.this.o0.onTouch(view, motionEvent);
                }
                return false;
            }
        };
        this.o = context.getApplicationContext();
        o();
    }
}
