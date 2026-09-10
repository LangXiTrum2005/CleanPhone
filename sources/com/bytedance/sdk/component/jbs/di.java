package com.bytedance.sdk.component.jbs;

import android.content.Context;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.DownloadListener;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.AbsListView;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ScrollView;
import com.bytedance.sdk.component.utils.ay;
import com.bytedance.sdk.component.utils.zf;
import com.ironsource.L6;
import com.ironsource.X3;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.b;
import com.unity3d.services.UnityAdsConstants;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class di extends FrameLayout {
    private static ka jc;
    private boolean ac;
    private boolean aw;
    private boolean ay;
    private volatile WebView bgr;
    private com.bytedance.sdk.component.jbs.ri bu;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    private long f18054co;
    private JSONObject di;
    private float dw;
    private Context dzy;
    private long feb;
    private String fi;
    private WebViewClient fr;
    private lr hcw;
    private AtomicBoolean ig;
    private float igq;
    private boolean ihz;
    public int ik;
    private float jbs;
    private com.bytedance.sdk.component.jbs.lr.ri ka;
    private long kt;
    public int lr;
    private float mj;
    private List<String> nr;
    private ay oh;
    private int ory;
    private AtomicBoolean pv;
    private AtomicBoolean qd;
    private long qt;
    public int ri;
    private long sf;
    private com.bytedance.sdk.component.jbs.ri.InterfaceC0211ri slm;
    private fi srn;
    private ik su;
    private com.bytedance.sdk.component.jbs.ka tan;
    private boolean uq;
    private View vr;
    private boolean wjv;
    private AttributeSet xd;
    private boolean xha;
    private float zf;

    public interface fi {
    }

    public enum ik {
        ADS(b.JSON_KEY_ADS),
        ADS_V3("ads_v3"),
        ENDCARD(CampaignEx.JSON_NATIVE_VIDEO_ENDCARD),
        USER_AGENT(L6.d0),
        PLAYABLE("playable"),
        DSP("dsp"),
        PRIVACY("privacy"),
        VAST_ENDCARD("vast_endcard"),
        EASY_PLAYABLE("easy_playable"),
        LANDING_PAGE("landing_page"),
        LANDING_PAGE_LOADING("lp_loading"),
        LANDING_PAGE_PRE_RENDER("lp_pre_render");

        public final String aw;

        ik(String str) {
            this.aw = str;
        }
    }

    public interface ka {
        WebView ri(Context context, AttributeSet attributeSet, int i, ik ikVar);
    }

    public interface lr {
    }

    public static class ri extends WebViewClient {
        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(final WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            if (Build.VERSION.SDK_INT < 26) {
                return super.onRenderProcessGone(webView, renderProcessGoneDetail);
            }
            if (webView == null) {
                return true;
            }
            webView.post(new Runnable() { // from class: com.bytedance.sdk.component.jbs.di.ri.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        ViewGroup viewGroup = (ViewGroup) webView.getParent();
                        if (viewGroup != null) {
                            viewGroup.removeView(webView);
                        }
                        webView.destroy();
                    } catch (Exception unused) {
                    }
                }
            });
            return true;
        }
    }

    public di(Context context, ik ikVar) {
        this(ri(context), false, ikVar);
    }

    private void ac() {
        try {
            WebSettings settings = this.bgr.getSettings();
            if (settings != null) {
                settings.setSavePassword(false);
            }
        } catch (Throwable unused) {
        }
    }

    private void ihz() {
        if (this.oh == null) {
            this.qd.set(false);
            this.oh = new ay(getContext());
        }
        new Object() { // from class: com.bytedance.sdk.component.jbs.di.1
        };
        this.qd.set(true);
    }

    private static void ik(Context context) {
    }

    private static Context ri(Context context) {
        return context;
    }

    public static void setDataDirectorySuffix(String str) {
        if (Build.VERSION.SDK_INT >= 28) {
            WebView.setDataDirectorySuffix(str);
        }
    }

    public static void setWebViewProvider(ka kaVar) {
        jc = kaVar;
    }

    private void tan() {
        if (this.bgr == null) {
            return;
        }
        try {
            this.bgr.removeJavascriptInterface("searchBoxJavaBridge_");
            this.bgr.removeJavascriptInterface("accessibility");
            this.bgr.removeJavascriptInterface("accessibilityTraversal");
        } catch (Throwable unused) {
        }
    }

    public void a_(String str) {
        try {
            setJavaScriptEnabled(str);
            this.bgr.loadUrl(str);
        } catch (Throwable unused) {
        }
    }

    public void aw() {
        if (this.bgr != null) {
            this.bgr.onResume();
        }
    }

    public void b_(String str) {
        try {
            this.bgr.removeJavascriptInterface(str);
        } catch (Throwable unused) {
        }
    }

    public void bgr() {
        try {
            this.bgr.clearHistory();
        } catch (Throwable unused) {
        }
    }

    public void bu() {
        try {
            this.bgr.clearView();
        } catch (Throwable unused) {
        }
    }

    public void co() {
        try {
            this.bgr.goForward();
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.bgr == null) {
            return;
        }
        try {
            this.bgr.computeScroll();
        } catch (Throwable unused) {
        }
    }

    public void di() {
        if (this.bgr != null) {
            removeAllViews();
            setBackground(null);
            try {
                this.bgr.setId(520093704);
            } catch (Throwable unused) {
            }
            addView(this.bgr, new FrameLayout.LayoutParams(-1, -1));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        try {
            return super.dispatchTouchEvent(motionEvent);
        } catch (Exception unused) {
            return false;
        }
    }

    public void fi() {
        try {
            if (this.bgr == null) {
                this.bgr = ri(this.xd, 0);
            }
            di();
            lr(ri(this.dzy));
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public View getArbitrageLoadingView() {
        return this.vr;
    }

    public int getContentHeight() {
        if (this.bgr == null) {
            return 0;
        }
        try {
            return this.bgr.getContentHeight();
        } catch (Throwable unused) {
            return 1;
        }
    }

    public long getLandingPageClickBegin() {
        return this.kt;
    }

    public long getLandingPageClickEnd() {
        return this.feb;
    }

    public com.bytedance.sdk.component.jbs.lr.ri getMaterialMeta() {
        return this.ka;
    }

    public String getOriginalUrl() {
        String url;
        if (this.bgr == null) {
            return null;
        }
        try {
            String originalUrl = this.bgr.getOriginalUrl();
            return (originalUrl == null || !originalUrl.startsWith("data:text/html") || (url = this.bgr.getUrl()) == null || !url.startsWith(monacal.attabal.FILE_SCHEME)) ? originalUrl : url;
        } catch (Throwable unused) {
            return null;
        }
    }

    public int getProgress() {
        if (this.bgr == null) {
            return 0;
        }
        try {
            return this.bgr.getProgress();
        } catch (Throwable unused) {
            return 100;
        }
    }

    public ik getScene() {
        return this.su;
    }

    public String getUrl() {
        if (this.bgr == null) {
            return null;
        }
        try {
            return this.bgr.getUrl();
        } catch (Throwable unused) {
            return null;
        }
    }

    public String getUserAgentString() {
        if (this.bgr == null) {
            return "";
        }
        try {
            return this.bgr.getSettings().getUserAgentString();
        } catch (Throwable unused) {
            return "";
        }
    }

    public WebView getWebView() {
        return this.bgr;
    }

    public WebViewClient getWebViewClient() {
        return this.fr;
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return false;
    }

    public boolean jbs() {
        if (this.bgr == null) {
            return false;
        }
        try {
            return this.bgr.canGoBack();
        } catch (Throwable unused) {
            return false;
        }
    }

    public boolean k_() {
        return this.ac;
    }

    public boolean ka() {
        return this.wjv;
    }

    public boolean lr() {
        return this.ihz;
    }

    public void mj() {
        try {
            this.bgr.reload();
        } catch (Throwable unused) {
        }
    }

    public void nr() {
        try {
            this.bgr.pauseTimers();
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.pv.set(true);
        if (!this.ig.get() || this.qd.get()) {
            return;
        }
        ihz();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.pv.set(false);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ViewParent viewParentRi;
        try {
            ri(motionEvent);
            boolean zOnInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
            if ((motionEvent.getActionMasked() == 2 || motionEvent.getActionMasked() == 0) && this.aw && (viewParentRi = ri(this)) != null) {
                viewParentRi.requestDisallowInterceptTouchEvent(true);
            }
            return zOnInterceptTouchEvent;
        } catch (Throwable unused) {
            return super.onInterceptTouchEvent(motionEvent);
        }
    }

    public void qt() {
        try {
            this.bgr.goBack();
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.ViewGroup
    public void removeAllViews() {
        try {
            this.bgr.removeAllViews();
        } catch (Throwable unused) {
        }
    }

    public void setAllowFileAccess(boolean z) {
        try {
            this.bgr.getSettings().setAllowFileAccess(z);
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.View
    public void setAlpha(float f) {
        try {
            super.setAlpha(f);
            this.bgr.setAlpha(f);
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        try {
            this.bgr.setBackgroundColor(i);
        } catch (Throwable unused) {
        }
    }

    public void setBuiltInZoomControls(boolean z) {
        try {
            this.bgr.getSettings().setBuiltInZoomControls(z);
        } catch (Throwable unused) {
        }
    }

    public void setCacheMode(int i) {
        try {
            this.bgr.getSettings().setCacheMode(i);
        } catch (Throwable unused) {
        }
    }

    public void setCalculationMethod(int i) {
        this.ory = i;
    }

    public void setDatabaseEnabled(boolean z) {
        try {
            this.bgr.getSettings().setDatabaseEnabled(z);
        } catch (Throwable unused) {
        }
    }

    public void setDeepShakeValue(float f) {
        this.zf = f;
    }

    public void setDefaultFontSize(int i) {
        try {
            this.bgr.getSettings().setDefaultFontSize(i);
        } catch (Throwable unused) {
        }
    }

    public void setDefaultTextEncodingName(String str) {
        try {
            this.bgr.getSettings().setDefaultTextEncodingName(str);
        } catch (Throwable unused) {
        }
    }

    public void setDisplayZoomControls(boolean z) {
        try {
            this.bgr.getSettings().setDisplayZoomControls(z);
        } catch (Throwable unused) {
        }
    }

    public void setDomStorageEnabled(boolean z) {
        try {
            this.bgr.getSettings().setDomStorageEnabled(z);
        } catch (Throwable unused) {
        }
    }

    public void setDownloadListener(DownloadListener downloadListener) {
        try {
            this.bgr.setDownloadListener(downloadListener);
        } catch (Throwable unused) {
        }
    }

    public void setIsPreventTouchEvent(boolean z) {
        this.aw = z;
    }

    public void setJavaScriptCanOpenWindowsAutomatically(boolean z) {
        try {
            this.bgr.getSettings().setJavaScriptCanOpenWindowsAutomatically(z);
        } catch (Throwable unused) {
        }
    }

    public void setJavaScriptEnabled(boolean z) {
        try {
            this.bgr.getSettings().setJavaScriptEnabled(z);
        } catch (Throwable unused) {
        }
    }

    public void setLandingPage(boolean z) {
        this.xha = z;
    }

    public void setLandingPageClickBegin(long j) {
        this.kt = j;
    }

    public void setLandingPageClickEnd(long j) {
        this.feb = j;
    }

    @Override // android.view.View
    public void setLayerType(int i, Paint paint) {
        try {
            this.bgr.setLayerType(i, paint);
        } catch (Throwable unused) {
        }
    }

    public void setLayoutAlgorithm(WebSettings.LayoutAlgorithm layoutAlgorithm) {
        try {
            this.bgr.getSettings().setLayoutAlgorithm(layoutAlgorithm);
        } catch (Throwable unused) {
        }
    }

    public void setLoadWithOverviewMode(boolean z) {
        try {
            this.bgr.getSettings().setLoadWithOverviewMode(z);
        } catch (Throwable unused) {
        }
    }

    public void setLpPreRender(boolean z) {
        this.ac = z;
    }

    public void setMaterialMeta(com.bytedance.sdk.component.jbs.lr.ri riVar) {
        this.ka = riVar;
    }

    public void setMixedContentMode(int i) {
        try {
            this.bgr.getSettings().setMixedContentMode(i);
        } catch (Throwable unused) {
        }
    }

    public void setNetworkAvailable(boolean z) {
        try {
            this.bgr.setNetworkAvailable(z);
        } catch (Throwable unused) {
        }
    }

    public void setOnShakeListener(lr lrVar) {
        this.hcw = lrVar;
    }

    @Override // android.view.View
    public void setOverScrollMode(int i) {
        try {
            this.bgr.setOverScrollMode(i);
            super.setOverScrollMode(i);
        } catch (Throwable unused) {
        }
    }

    public void setPreError(boolean z) {
        this.ay = z;
    }

    public void setPreFinish(boolean z) {
        this.uq = z;
    }

    public void setPreProgressHundred(boolean z) {
        this.wjv = z;
    }

    public void setPreStart(boolean z) {
        this.ihz = z;
    }

    public void setRecycler(boolean z) {
        if (this.bgr == null || !(this.bgr instanceof com.bytedance.sdk.component.jbs.fi)) {
            return;
        }
        ((com.bytedance.sdk.component.jbs.fi) this.bgr).setRecycler(z);
    }

    public void setShakeValue(float f) {
        this.igq = f;
    }

    public void setSupportZoom(boolean z) {
        try {
            this.bgr.getSettings().setSupportZoom(z);
        } catch (Throwable unused) {
        }
    }

    public void setTag(String str) {
        this.fi = str;
        com.bytedance.sdk.component.jbs.ri riVar = this.bu;
        if (riVar != null) {
            riVar.ri(str);
        }
        com.bytedance.sdk.component.jbs.ka kaVar = this.tan;
        if (kaVar != null) {
            kaVar.ri(str);
        }
    }

    public void setTouchStateListener(fi fiVar) {
        this.srn = fiVar;
    }

    public void setUseWideViewPort(boolean z) {
        try {
            this.bgr.getSettings().setUseWideViewPort(z);
        } catch (Throwable unused) {
        }
    }

    public void setUserAgentString(String str) {
        try {
            this.bgr.getSettings().setUserAgentString(str);
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        try {
            super.setVisibility(i);
            this.bgr.setVisibility(i);
        } catch (Throwable unused) {
        }
    }

    public void setWebChromeClient(WebChromeClient webChromeClient) {
        try {
            this.bgr.setWebChromeClient(webChromeClient);
        } catch (Throwable unused) {
        }
    }

    public void setWebView(WebView webView) {
        this.bgr = webView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setWebViewClient(WebViewClient webViewClient) {
        try {
            if (webViewClient instanceof fi) {
                setTouchStateListener((fi) webViewClient);
            } else {
                setTouchStateListener(null);
            }
            if (webViewClient == 0) {
                webViewClient = new ri();
            }
            this.fr = webViewClient;
            this.bgr.setWebViewClient(new xha(this.slm, webViewClient, this.nr));
        } catch (Throwable unused) {
        }
    }

    public void setWriggleValue(float f) {
        this.dw = f;
    }

    public boolean sf() {
        if (this.bgr == null) {
            return false;
        }
        try {
            return this.bgr.canGoForward();
        } catch (Throwable unused) {
            return false;
        }
    }

    public void slm() {
        if (this.bgr == null) {
            return;
        }
        ik ikVar = this.su;
        if (ikVar != ik.ADS && ikVar != ik.ADS_V3) {
            zf.ri(this);
        } else {
            try {
                this.bgr.destroy();
            } catch (Throwable unused) {
            }
        }
    }

    public void vr() {
        if (this.bgr == null) {
            return;
        }
        try {
            this.bgr.onPause();
        } catch (Throwable unused) {
        }
    }

    public void xha() {
        try {
            this.bgr.stopLoading();
        } catch (Throwable unused) {
        }
    }

    public di(Context context, boolean z, ik ikVar) {
        super(ri(context));
        this.mj = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.jbs = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.qt = 0L;
        this.sf = 0L;
        this.f18054co = 0L;
        this.aw = false;
        this.igq = 20.0f;
        this.dw = 50.0f;
        this.pv = new AtomicBoolean();
        this.ig = new AtomicBoolean();
        this.qd = new AtomicBoolean();
        this.dzy = context;
        this.su = ikVar;
        if (z) {
            return;
        }
        try {
            this.bgr = ri((AttributeSet) null, 0);
            di();
        } catch (Throwable unused) {
        }
        lr(ri(context));
    }

    private void lr(Context context) {
        ik(context);
        ac();
        tan();
    }

    private void setJavaScriptEnabled(String str) {
        WebSettings settings;
        try {
            if (!TextUtils.isEmpty(str) && (settings = this.bgr.getSettings()) != null) {
                if (Uri.parse(str).getScheme().equalsIgnoreCase(X3.i.b)) {
                    settings.setJavaScriptEnabled(false);
                } else {
                    settings.setJavaScriptEnabled(true);
                }
            }
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.View
    public String getTag() {
        return this.fi;
    }

    public boolean ik() {
        return this.uq;
    }

    public void ri(boolean z, int i, int i2, List<Integer> list, int i3, List<String> list2) {
        if (z && this.bgr != null && (this.bgr instanceof com.bytedance.sdk.component.jbs.fi)) {
            this.bu = new com.bytedance.sdk.component.jbs.ri(this.dzy, i, i2, list, i3);
            this.nr = list2;
            if (!TextUtils.isEmpty(this.fi)) {
                this.bu.ri(this.fi);
            }
            ((com.bytedance.sdk.component.jbs.fi) this.bgr).setTouchListenerProxy(this.bu);
            this.slm = this.bu.ri();
        }
    }

    private static boolean ik(View view) {
        try {
            Class<?> clsLoadClass = view.getClass().getClassLoader().loadClass("android.support.v4.view.ScrollingView");
            if (clsLoadClass != null && clsLoadClass.isInstance(view)) {
                return true;
            }
        } catch (Throwable unused) {
        }
        try {
            Class<?> clsLoadClass2 = view.getClass().getClassLoader().loadClass("androidx.core.view.ScrollingView");
            return clsLoadClass2 != null && clsLoadClass2.isInstance(view);
        } catch (Throwable unused2) {
            return false;
        }
    }

    private static boolean lr(View view) {
        try {
            Class<?> clsLoadClass = view.getClass().getClassLoader().loadClass("android.support.v4.view.ViewPager");
            if (clsLoadClass != null && clsLoadClass.isInstance(view)) {
                return true;
            }
        } catch (Throwable unused) {
        }
        try {
            Class<?> clsLoadClass2 = view.getClass().getClassLoader().loadClass("androidx.viewpager.widget.ViewPager");
            return clsLoadClass2 != null && clsLoadClass2.isInstance(view);
        } catch (Throwable unused2) {
            return false;
        }
    }

    public void ri(int i, long j) {
        if (this.bgr == null || !(this.bgr instanceof com.bytedance.sdk.component.jbs.fi)) {
            return;
        }
        this.tan = new com.bytedance.sdk.component.jbs.ka(this.dzy, this.bu, i, j, this);
        if (!TextUtils.isEmpty(this.fi)) {
            this.tan.ri(this.fi);
        }
        ((com.bytedance.sdk.component.jbs.fi) this.bgr).setTouchListenerProxy(this.tan);
    }

    public void ri(boolean z, View view) {
        if (z) {
            this.vr = view;
            view.setVisibility(8);
            View view2 = this.vr;
            if (view2 == null || view2.getParent() != null) {
                return;
            }
            addView(this.vr, new FrameLayout.LayoutParams(-1, -1));
        }
    }

    private WebView ri(AttributeSet attributeSet, int i) {
        ka kaVar = jc;
        if (kaVar != null) {
            return kaVar.ri(getContext(), attributeSet, i, this.su);
        }
        if (attributeSet == null) {
            return new WebView(ri(this.dzy));
        }
        return new WebView(ri(this.dzy), attributeSet);
    }

    public void ri(String str, Map<String, String> map) {
        try {
            setJavaScriptEnabled(str);
            this.bgr.loadUrl(str, map);
        } catch (Throwable unused) {
        }
    }

    public void ri(String str, String str2, String str3, String str4, String str5) {
        try {
            setJavaScriptEnabled(str);
            this.bgr.loadDataWithBaseURL(str, str2, str3, str4, str5);
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
    }

    public void ri(boolean z) {
        try {
            this.bgr.clearCache(z);
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ViewParent ri(View view) {
        ViewParent parent = view.getParent();
        if ((parent instanceof AbsListView) || (parent instanceof ScrollView) || (parent instanceof HorizontalScrollView) || !(parent instanceof View)) {
            return parent;
        }
        View view2 = (View) parent;
        return (lr(view2) || ik(view2)) ? parent : ri(view2);
    }

    public void ri(Object obj, String str) {
        try {
            this.bgr.addJavascriptInterface(obj, str);
        } catch (Throwable unused) {
        }
    }

    private void ri(MotionEvent motionEvent) {
        if (!this.xha || this.ka == null) {
            return;
        }
        if ((this.fi == null && this.di == null) || motionEvent == null) {
            return;
        }
        try {
            int action = motionEvent.getAction();
            if (action == 0) {
                this.mj = motionEvent.getRawX();
                this.jbs = motionEvent.getRawY();
                this.qt = System.currentTimeMillis();
                this.di = new JSONObject();
                if (this.bgr != null) {
                    this.kt = this.qt;
                    return;
                }
                return;
            }
            if (action == 1 || action == 3) {
                this.di.put("start_x", String.valueOf(this.mj));
                this.di.put("start_y", String.valueOf(this.jbs));
                this.di.put("offset_x", String.valueOf(motionEvent.getRawX() - this.mj));
                this.di.put("offset_y", String.valueOf(motionEvent.getRawY() - this.jbs));
                this.di.put("url", String.valueOf(getUrl()));
                this.di.put("tag", "");
                this.sf = System.currentTimeMillis();
                if (this.bgr != null) {
                    this.feb = this.sf;
                }
                this.di.put("down_time", this.qt);
                this.di.put("up_time", this.sf);
                if (com.bytedance.sdk.component.jbs.ri.ri.ri().lr() != null) {
                    long j = this.f18054co;
                    long j2 = this.qt;
                    if (j != j2) {
                        this.f18054co = j2;
                        com.bytedance.sdk.component.jbs.ri.ri.ri().lr().ri(this.ka, this.fi, "in_web_click", this.di, this.sf - this.qt);
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }
}
