package com.mbridge.msdk.config.dynamic.baseview.webview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.measurement.f2;
import com.mbridge.msdk.config.dynamic.baseview.cusview.XMLView;
import com.mbridge.msdk.config.dynamic.baseview.inter.a;
import com.mbridge.msdk.config.dynamic.baseview.webview.client.b;
import com.mbridge.msdk.config.dynamic.utils.d;
import com.mbridge.msdk.config.dynamic.utils.f;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class ComponentWebView extends WebView implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f32693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private b f32694b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.mbridge.msdk.config.dynamic.baseview.webview.client.a f32695c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f32696d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private XMLView f32697e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f32698f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f32699g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f32700h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f32701i;

    public ComponentWebView(@NonNull Context context) {
        super(context);
        this.f32693a = "ComponentWebView";
        this.f32700h = -1L;
        a();
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    private void b() {
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        WebSettings settings = getSettings();
        settings.setUserAgentString(settings.getUserAgentString() + " WindVane/3.0.2");
        settings.setJavaScriptEnabled(true);
        settings.setCacheMode(-1);
        settings.setAllowFileAccess(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setDomStorageEnabled(true);
        settings.setSupportZoom(false);
        settings.setBuiltInZoomControls(true);
        settings.setDisplayZoomControls(false);
        settings.setSavePassword(false);
        settings.setDatabaseEnabled(true);
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);
        settings.setRenderPriority(WebSettings.RenderPriority.HIGH);
        settings.setSafeBrowsingEnabled(false);
        settings.setMediaPlaybackRequiresUserGesture(false);
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setMixedContentMode(0);
        settings.setDatabaseEnabled(true);
        String path = getContext().getDir("database", 0).getPath();
        settings.setDatabasePath(path);
        settings.setGeolocationEnabled(true);
        settings.setGeolocationDatabasePath(path);
    }

    @Override // android.webkit.WebView
    public void destroy() {
        if (this.f32696d) {
            return;
        }
        try {
            this.f32696d = true;
            setVisibility(8);
            removeAllViews();
            setDownloadListener(null);
            destroy();
        } catch (Throwable th2) {
            q0.b("ComponentWebView", th2.getMessage());
        }
    }

    public long getClickTimeStamp() {
        return this.f32700h;
    }

    public float getxInScreen() {
        return this.f32698f;
    }

    public float getyInScreen() {
        return this.f32699g;
    }

    public boolean hasXmlUrl() {
        return !TextUtils.isEmpty(this.f32701i);
    }

    public boolean isDestroyed() {
        return this.f32696d;
    }

    public void loadXMLUrl() {
        if (TextUtils.isEmpty(this.f32701i)) {
            return;
        }
        loadUrl(this.f32701i);
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f32697e = d.a((View) this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        destroy();
    }

    @Override // android.webkit.WebView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        try {
            if (motionEvent.getAction() == 0) {
                this.f32698f = motionEvent.getRawX();
                this.f32699g = motionEvent.getRawY();
                this.f32700h = System.currentTimeMillis();
            }
        } catch (Exception e10) {
            f2.q(e10, new StringBuilder("处理触摸事件异常: "), "ComponentWebView");
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setViewClickListener() {
        setOnClickListener(new com.applovin.mediation.nativeAds.a(this, 14));
    }

    public void setWebViewEventListener(com.mbridge.msdk.config.dynamic.baseview.webview.listener.a aVar) {
        b bVar = this.f32694b;
        if (bVar != null) {
            bVar.a(aVar);
        }
        com.mbridge.msdk.config.dynamic.baseview.webview.client.a aVar2 = this.f32695c;
        if (aVar2 != null) {
            aVar2.a(aVar);
        }
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.inter.a
    public void setXmlData(Map<String, Object> map) {
        if (map == null) {
            return;
        }
        try {
            String strValueOf = String.valueOf(map.get("clickable"));
            if (!TextUtils.isEmpty(strValueOf) && strValueOf.equals(com.ironsource.mediationsdk.metadata.a.f29610g)) {
                setViewClickListener();
            }
            Object obj = map.get("data");
            if (obj instanceof String) {
                setXmlUrl(String.valueOf(obj));
            }
        } catch (Exception e10) {
            f2.q(e10, new StringBuilder("setXmlData异常: "), "ComponentWebView");
        }
    }

    public void setXmlUrl(String str) {
        this.f32701i = str;
    }

    private void a() {
        b();
        b bVar = new b();
        this.f32694b = bVar;
        setWebViewClient(bVar);
        com.mbridge.msdk.config.dynamic.baseview.webview.client.a aVar = new com.mbridge.msdk.config.dynamic.baseview.webview.client.a();
        this.f32695c = aVar;
        setWebChromeClient(aVar);
    }

    public ComponentWebView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context);
        this.f32693a = "ComponentWebView";
        this.f32700h = -1L;
        a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        XMLView xMLView = this.f32697e;
        if (xMLView != null) {
            xMLView.updateTouchView(view);
        }
        f.a(this.f32697e, view.getTag(), null);
    }

    public ComponentWebView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f32693a = "ComponentWebView";
        this.f32700h = -1L;
        a();
    }

    public ComponentWebView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f32693a = "ComponentWebView";
        this.f32700h = -1L;
        a();
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.inter.a
    public void updateBindData(String str, Object obj) {
    }
}
