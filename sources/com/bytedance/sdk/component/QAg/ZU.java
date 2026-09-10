package com.bytedance.sdk.component.QAg;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Configuration;
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
import com.bytedance.sdk.component.utils.DY;
import com.bytedance.sdk.component.utils.sLN;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4980x2;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class ZU extends FrameLayout {
    private static lk KPU;
    private AtomicBoolean CSn;
    private LD DY;
    private AttributeSet HD;
    private List<String> IeN;
    private long Ivz;
    private volatile WebView JVA;
    private float JXs;
    private String LD;
    private com.bytedance.sdk.component.QAg.LD.Lxb Lxb;
    private com.bytedance.sdk.component.QAg.Lxb.InterfaceC0051Lxb NXR;
    private long OY;
    private long QAg;
    private com.bytedance.sdk.component.QAg.Lxb STP;
    private DY Sfi;
    private float VVE;
    private boolean ZU;
    private AtomicBoolean aH;
    private float brP;
    private Context eK;
    private long ebl;
    private InterfaceC0052ZU foI;
    private AtomicBoolean id;
    private float kqm;
    private float lc;
    private JSONObject lk;
    private boolean nBu;
    private long nE;
    private View sLN;
    private int tD;

    public interface LD {
    }

    public static class Lxb extends WebViewClient {
        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(final WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            if (Build.VERSION.SDK_INT < 26) {
                return super.onRenderProcessGone(webView, renderProcessGoneDetail);
            }
            if (webView == null) {
                return true;
            }
            webView.post(new Runnable() { // from class: com.bytedance.sdk.component.QAg.ZU.Lxb.1
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

    /* JADX INFO: renamed from: com.bytedance.sdk.component.QAg.ZU$ZU, reason: collision with other inner class name */
    public interface InterfaceC0052ZU {
    }

    public interface lk {
        WebView createWebView(Context context, AttributeSet attributeSet, int i);
    }

    public ZU(Context context) {
        this(Lxb(context), false);
    }

    private void IeN() {
        if (this.JVA == null) {
            return;
        }
        try {
            this.JVA.removeJavascriptInterface("searchBoxJavaBridge_");
            this.JVA.removeJavascriptInterface("accessibility");
            this.JVA.removeJavascriptInterface("accessibilityTraversal");
        } catch (Throwable unused) {
        }
    }

    private void VVE() {
        try {
            WebSettings settings = this.JVA.getSettings();
            if (settings != null) {
                settings.setSavePassword(false);
            }
        } catch (Throwable unused) {
        }
    }

    private void kqm() {
        if (this.Sfi == null) {
            this.id.set(false);
            this.Sfi = new DY(getContext());
        }
        new Object() { // from class: com.bytedance.sdk.component.QAg.ZU.1
        };
        this.id.set(true);
    }

    private static void lk(Context context) {
    }

    public static void setDataDirectorySuffix(String str) {
        if (Build.VERSION.SDK_INT >= 28) {
            WebView.setDataDirectorySuffix(str);
        }
    }

    public static void setWebViewProvider(lk lkVar) {
        KPU = lkVar;
    }

    public void JVA() {
        if (this.JVA == null) {
            return;
        }
        try {
            this.JVA.onPause();
        } catch (Throwable unused) {
        }
    }

    public boolean JXs() {
        if (this.JVA == null) {
            return false;
        }
        try {
            return this.JVA.canGoBack();
        } catch (Throwable unused) {
            return false;
        }
    }

    public void LD() {
        if (this.JVA != null) {
            removeAllViews();
            setBackground(null);
            try {
                this.JVA.setId(520093704);
            } catch (Throwable unused) {
            }
            addView(this.JVA, new FrameLayout.LayoutParams(-1, -1));
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void Lxb(boolean z, int i, int i2, List<Integer> list, int i3, List<String> list2) {
        if (z && this.JVA != null && (this.JVA instanceof com.bytedance.sdk.component.QAg.lk)) {
            this.STP = new com.bytedance.sdk.component.QAg.Lxb(this.eK, i, i2, list, i3);
            this.IeN = list2;
            if (!TextUtils.isEmpty(this.LD)) {
                this.STP.Lxb(this.LD);
            }
            ((com.bytedance.sdk.component.QAg.lk) this.JVA).setArbitrageTouchListener(this.STP);
            this.NXR = this.STP.Lxb();
        }
    }

    public void NXR() {
        try {
            this.JVA.clearView();
        } catch (Throwable unused) {
        }
    }

    public void OY() {
        try {
            this.JVA.goForward();
        } catch (Throwable unused) {
        }
    }

    public void QAg() {
        if (this.JVA != null) {
            this.JVA.onResume();
        }
    }

    public void STP() {
        try {
            this.JVA.pauseTimers();
        } catch (Throwable unused) {
        }
    }

    public void ZU() {
        try {
            this.JVA.reload();
        } catch (Throwable unused) {
        }
    }

    public void a_(String str) {
        try {
            setJavaScriptEnabled(str);
            this.JVA.loadUrl(str);
        } catch (Throwable unused) {
        }
    }

    public void b_(String str) {
        try {
            this.JVA.removeJavascriptInterface(str);
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.JVA == null) {
            return;
        }
        try {
            this.JVA.computeScroll();
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return super.dispatchTouchEvent(motionEvent);
    }

    public boolean ebl() {
        if (this.JVA == null) {
            return false;
        }
        try {
            return this.JVA.canGoForward();
        } catch (Throwable unused) {
            return false;
        }
    }

    public void f_() {
        try {
            this.JVA = Lxb(this.HD, 0);
            LD();
            LD(Lxb(this.eK));
        } catch (Throwable th) {
            sLN.Lxb("SSWebView.TAG", "initWebview: " + th.getMessage());
        }
    }

    public View getArbitrageLoadingView() {
        return this.sLN;
    }

    public int getContentHeight() {
        if (this.JVA == null) {
            return 0;
        }
        try {
            return this.JVA.getContentHeight();
        } catch (Throwable unused) {
            return 1;
        }
    }

    public long getLandingPageClickBegin() {
        return this.Ivz;
    }

    public long getLandingPageClickEnd() {
        return this.nE;
    }

    public com.bytedance.sdk.component.QAg.LD.Lxb getMaterialMeta() {
        return this.Lxb;
    }

    public String getOriginalUrl() {
        String url;
        if (this.JVA == null) {
            return null;
        }
        try {
            String originalUrl = this.JVA.getOriginalUrl();
            return (originalUrl == null || !originalUrl.startsWith("data:text/html") || (url = this.JVA.getUrl()) == null || !url.startsWith(C4980x2.FILE_SCHEME)) ? originalUrl : url;
        } catch (Throwable unused) {
            return null;
        }
    }

    public int getProgress() {
        if (this.JVA == null) {
            return 0;
        }
        try {
            return this.JVA.getProgress();
        } catch (Throwable unused) {
            return 100;
        }
    }

    public String getUrl() {
        if (this.JVA == null) {
            return null;
        }
        try {
            return this.JVA.getUrl();
        } catch (Throwable unused) {
            return null;
        }
    }

    public String getUserAgentString() {
        if (this.JVA == null) {
            return "";
        }
        try {
            return this.JVA.getSettings().getUserAgentString();
        } catch (Throwable unused) {
            return "";
        }
    }

    public WebView getWebView() {
        return this.JVA;
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return false;
    }

    public void lc() {
        try {
            this.JVA.goBack();
        } catch (Throwable unused) {
        }
    }

    public void nBu() {
        try {
            this.JVA.clearHistory();
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.aH.set(true);
        if (!this.CSn.get() || this.id.get()) {
            return;
        }
        kqm();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.aH.set(false);
    }

    @Override // android.view.ViewGroup
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ViewParent viewParentLxb;
        try {
            Lxb(motionEvent);
            boolean zOnInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
            if ((motionEvent.getActionMasked() == 2 || motionEvent.getActionMasked() == 0) && this.nBu && (viewParentLxb = Lxb(this)) != null) {
                viewParentLxb.requestDisallowInterceptTouchEvent(true);
            }
            return zOnInterceptTouchEvent;
        } catch (Throwable unused) {
            return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
    }

    @Override // android.view.ViewGroup
    public void removeAllViews() {
        try {
            this.JVA.removeAllViews();
        } catch (Throwable unused) {
        }
    }

    public void sLN() {
        if (this.JVA == null) {
            return;
        }
        try {
            this.JVA.destroy();
        } catch (Throwable unused) {
        }
    }

    public void setAllowFileAccess(boolean z) {
        try {
            this.JVA.getSettings().setAllowFileAccess(z);
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.View
    public void setAlpha(float f) {
        try {
            super.setAlpha(f);
            this.JVA.setAlpha(f);
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        try {
            this.JVA.setBackgroundColor(i);
        } catch (Throwable unused) {
        }
    }

    public void setBuiltInZoomControls(boolean z) {
        try {
            this.JVA.getSettings().setBuiltInZoomControls(z);
        } catch (Throwable unused) {
        }
    }

    public void setCacheMode(int i) {
        try {
            this.JVA.getSettings().setCacheMode(i);
        } catch (Throwable unused) {
        }
    }

    public void setCalculationMethod(int i) {
        this.tD = i;
    }

    public void setDatabaseEnabled(boolean z) {
        try {
            this.JVA.getSettings().setDatabaseEnabled(z);
        } catch (Throwable unused) {
        }
    }

    public void setDeepShakeValue(float f) {
        this.kqm = f;
    }

    public void setDefaultFontSize(int i) {
        try {
            this.JVA.getSettings().setDefaultFontSize(i);
        } catch (Throwable unused) {
        }
    }

    public void setDefaultTextEncodingName(String str) {
        try {
            this.JVA.getSettings().setDefaultTextEncodingName(str);
        } catch (Throwable unused) {
        }
    }

    public void setDisplayZoomControls(boolean z) {
        try {
            this.JVA.getSettings().setDisplayZoomControls(z);
        } catch (Throwable unused) {
        }
    }

    public void setDomStorageEnabled(boolean z) {
        try {
            this.JVA.getSettings().setDomStorageEnabled(z);
        } catch (Throwable unused) {
        }
    }

    public void setDownloadListener(DownloadListener downloadListener) {
        try {
            this.JVA.setDownloadListener(downloadListener);
        } catch (Throwable unused) {
        }
    }

    public void setIsPreventTouchEvent(boolean z) {
        this.nBu = z;
    }

    public void setJavaScriptCanOpenWindowsAutomatically(boolean z) {
        try {
            this.JVA.getSettings().setJavaScriptCanOpenWindowsAutomatically(z);
        } catch (Throwable unused) {
        }
    }

    public void setJavaScriptEnabled(boolean z) {
        try {
            this.JVA.getSettings().setJavaScriptEnabled(z);
        } catch (Throwable unused) {
        }
    }

    public void setLandingPage(boolean z) {
        this.ZU = z;
    }

    public void setLandingPageClickBegin(long j) {
        this.Ivz = j;
    }

    public void setLandingPageClickEnd(long j) {
        this.nE = j;
    }

    @Override // android.view.View
    public void setLayerType(int i, Paint paint) {
        try {
            this.JVA.setLayerType(i, paint);
        } catch (Throwable unused) {
        }
    }

    public void setLayoutAlgorithm(WebSettings.LayoutAlgorithm layoutAlgorithm) {
        try {
            this.JVA.getSettings().setLayoutAlgorithm(layoutAlgorithm);
        } catch (Throwable unused) {
        }
    }

    public void setLoadWithOverviewMode(boolean z) {
        try {
            this.JVA.getSettings().setLoadWithOverviewMode(z);
        } catch (Throwable unused) {
        }
    }

    public void setMaterialMeta(com.bytedance.sdk.component.QAg.LD.Lxb lxb) {
        this.Lxb = lxb;
    }

    public void setMixedContentMode(int i) {
        try {
            this.JVA.getSettings().setMixedContentMode(i);
        } catch (Throwable unused) {
        }
    }

    public void setNetworkAvailable(boolean z) {
        try {
            this.JVA.setNetworkAvailable(z);
        } catch (Throwable unused) {
        }
    }

    public void setOnShakeListener(LD ld) {
        this.DY = ld;
    }

    @Override // android.view.View
    public void setOverScrollMode(int i) {
        try {
            this.JVA.setOverScrollMode(i);
            super.setOverScrollMode(i);
        } catch (Throwable unused) {
        }
    }

    public void setRecycler(boolean z) {
        if (this.JVA == null || !(this.JVA instanceof com.bytedance.sdk.component.QAg.lk)) {
            return;
        }
        ((com.bytedance.sdk.component.QAg.lk) this.JVA).setRecycler(z);
    }

    public void setShakeValue(float f) {
        this.VVE = f;
    }

    public void setSupportZoom(boolean z) {
        try {
            this.JVA.getSettings().setSupportZoom(z);
        } catch (Throwable unused) {
        }
    }

    public void setTag(String str) {
        this.LD = str;
        com.bytedance.sdk.component.QAg.Lxb lxb = this.STP;
        if (lxb != null) {
            lxb.Lxb(str);
        }
    }

    public void setTouchStateListener(InterfaceC0052ZU interfaceC0052ZU) {
        this.foI = interfaceC0052ZU;
    }

    public void setUseWideViewPort(boolean z) {
        try {
            this.JVA.getSettings().setUseWideViewPort(z);
        } catch (Throwable unused) {
        }
    }

    public void setUserAgentString(String str) {
        try {
            this.JVA.getSettings().setUserAgentString(str);
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        try {
            super.setVisibility(i);
            this.JVA.setVisibility(i);
        } catch (Throwable unused) {
        }
    }

    public void setWebChromeClient(WebChromeClient webChromeClient) {
        try {
            this.JVA.setWebChromeClient(webChromeClient);
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setWebViewClient(WebViewClient webViewClient) {
        try {
            if (webViewClient instanceof InterfaceC0052ZU) {
                setTouchStateListener((InterfaceC0052ZU) webViewClient);
            } else {
                setTouchStateListener(null);
            }
            if (webViewClient == 0) {
                webViewClient = new Lxb();
            }
            this.JVA.setWebViewClient(new JXs(this.NXR, webViewClient, this.IeN));
        } catch (Throwable unused) {
        }
    }

    public void setWriggleValue(float f) {
        this.brP = f;
    }

    public ZU(Context context, boolean z) {
        super(Lxb(context));
        this.JXs = 0.0f;
        this.lc = 0.0f;
        this.ebl = 0L;
        this.OY = 0L;
        this.QAg = 0L;
        this.nBu = false;
        this.VVE = 20.0f;
        this.brP = 50.0f;
        this.aH = new AtomicBoolean();
        this.CSn = new AtomicBoolean();
        this.id = new AtomicBoolean();
        this.eK = context;
        if (z) {
            return;
        }
        try {
            this.JVA = Lxb((AttributeSet) null, 0);
            LD();
        } catch (Throwable unused) {
        }
        LD(Lxb(context));
    }

    private void setJavaScriptEnabled(String str) {
        WebSettings settings;
        try {
            if (TextUtils.isEmpty(str) || (settings = this.JVA.getSettings()) == null) {
                return;
            }
            if (Uri.parse(str).getScheme().equalsIgnoreCase("file")) {
                settings.setJavaScriptEnabled(false);
            } else {
                settings.setJavaScriptEnabled(true);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.View
    public String getTag() {
        return this.LD;
    }

    public void lk() {
        try {
            this.JVA.stopLoading();
        } catch (Throwable unused) {
        }
    }

    private static boolean lk(View view) {
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

    private void LD(Context context) {
        lk(context);
        VVE();
        IeN();
    }

    public void Lxb(boolean z, View view) {
        if (z) {
            this.sLN = view;
            if (view == null || view.getParent() != null) {
                return;
            }
            addView(this.sLN, new FrameLayout.LayoutParams(-1, -1));
        }
    }

    private static boolean LD(View view) {
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

    private WebView Lxb(AttributeSet attributeSet, int i) {
        lk lkVar = KPU;
        if (lkVar != null) {
            return lkVar.createWebView(getContext(), attributeSet, i);
        }
        if (attributeSet == null) {
            return new WebView(Lxb(this.eK));
        }
        return new WebView(Lxb(this.eK), attributeSet);
    }

    private static Context Lxb(Context context) {
        return Build.VERSION.SDK_INT < 23 ? context.createConfigurationContext(new Configuration()) : context;
    }

    @TargetApi(19)
    public void Lxb(String str, Map<String, String> map) {
        try {
            setJavaScriptEnabled(str);
            this.JVA.loadUrl(str, map);
        } catch (Throwable unused) {
        }
    }

    public void Lxb(String str, String str2, String str3, String str4, String str5) {
        try {
            setJavaScriptEnabled(str);
            this.JVA.loadDataWithBaseURL(str, str2, str3, str4, str5);
        } catch (Throwable unused) {
        }
    }

    public void Lxb(boolean z) {
        try {
            this.JVA.clearCache(z);
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ViewParent Lxb(View view) {
        ViewParent parent = view.getParent();
        if ((parent instanceof AbsListView) || (parent instanceof ScrollView) || (parent instanceof HorizontalScrollView) || !(parent instanceof View)) {
            return parent;
        }
        View view2 = (View) parent;
        return (LD(view2) || lk(view2)) ? parent : Lxb(view2);
    }

    @SuppressLint({"JavascriptInterface"})
    public void Lxb(Object obj, String str) {
        try {
            this.JVA.addJavascriptInterface(obj, str);
        } catch (Throwable unused) {
        }
    }

    private void Lxb(MotionEvent motionEvent) {
        if (!this.ZU || this.Lxb == null) {
            return;
        }
        if ((this.LD == null && this.lk == null) || motionEvent == null) {
            return;
        }
        try {
            int action = motionEvent.getAction();
            if (action == 0) {
                this.JXs = motionEvent.getRawX();
                this.lc = motionEvent.getRawY();
                this.ebl = System.currentTimeMillis();
                this.lk = new JSONObject();
                if (this.JVA != null) {
                    this.Ivz = this.ebl;
                    return;
                }
                return;
            }
            if (action == 1 || action == 3) {
                this.lk.put("start_x", String.valueOf(this.JXs));
                this.lk.put("start_y", String.valueOf(this.lc));
                this.lk.put("offset_x", String.valueOf(motionEvent.getRawX() - this.JXs));
                this.lk.put("offset_y", String.valueOf(motionEvent.getRawY() - this.lc));
                this.lk.put("url", String.valueOf(getUrl()));
                this.lk.put("tag", "");
                this.OY = System.currentTimeMillis();
                if (this.JVA != null) {
                    this.nE = this.OY;
                }
                this.lk.put("down_time", this.ebl);
                this.lk.put("up_time", this.OY);
                if (com.bytedance.sdk.component.QAg.Lxb.Lxb.Lxb().LD() != null) {
                    long j = this.QAg;
                    long j2 = this.ebl;
                    if (j != j2) {
                        this.QAg = j2;
                        com.bytedance.sdk.component.QAg.Lxb.Lxb.Lxb().LD().Lxb(this.Lxb, this.LD, "in_web_click", this.lk, this.OY - this.ebl);
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }
}
