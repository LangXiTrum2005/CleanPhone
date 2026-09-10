package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.RelativeLayout;
import androidx.annotation.VisibleForTesting;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.aL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2984aL extends RelativeLayout {
    public static final WK Companion = new WK(null);
    private static final String TAG = "MRAIDAdWidget";
    private VK closeDelegate;
    private YK onViewTouchListener;
    private ZK orientationDelegate;
    private WebView webView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2984aL(Context context) throws InstantiationException {
        super(context);
        AbstractC2995aW.q(context, com.umeng.analytics.pro.f.X);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        setLayoutParams(layoutParams);
        WebView webView = Th0.INSTANCE.getWebView(context);
        this.webView = webView;
        if (webView != null) {
            webView.setLayoutParams(layoutParams);
        }
        WebView webView2 = this.webView;
        if (webView2 != null) {
            webView2.setTag("VungleWebView");
        }
        addView(this.webView, layoutParams);
        bindListeners();
        prepare();
    }

    private final void applyDefault(WebView webView) {
        WebSettings settings = webView.getSettings();
        AbstractC2995aW.p(settings, "webView.settings");
        settings.setBuiltInZoomControls(false);
        settings.setJavaScriptEnabled(true);
        settings.setLoadWithOverviewMode(true);
        settings.setSaveFormData(true);
        settings.setUseWideViewPort(false);
        settings.setAllowFileAccess(true);
        settings.setAllowFileAccessFromFileURLs(true);
        settings.setAllowUniversalAccessFromFileURLs(true);
        webView.setVisibility(4);
        settings.setMediaPlaybackRequiresUserGesture(false);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private final void bindListeners() {
        WebView webView = this.webView;
        if (webView != null) {
            webView.setOnTouchListener(new UK(this, 0));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: bindListeners$lambda-0, reason: not valid java name */
    public static final boolean m232bindListeners$lambda0(C2984aL c2984aL, View view, MotionEvent motionEvent) {
        AbstractC2995aW.q(c2984aL, "this$0");
        YK yk = c2984aL.onViewTouchListener;
        if (yk != null) {
            return yk.onTouch(motionEvent);
        }
        return false;
    }

    private final void prepare() {
        WebView webView = this.webView;
        if (webView != null) {
            webView.setLayerType(2, null);
            webView.setBackgroundColor(0);
            webView.setVisibility(8);
        }
    }

    public final void close() {
        VK vk = this.closeDelegate;
        if (vk != null) {
            vk.close();
        }
    }

    public final void destroyWebView(long j) {
        if (j <= 0) {
            new XK(this).run();
        } else {
            new C3393ez().schedule(new XK(this), j);
        }
    }

    public final VK getCloseDelegate$vungle_ads_release() {
        return this.closeDelegate;
    }

    public final YK getOnViewTouchListener$vungle_ads_release() {
        return this.onViewTouchListener;
    }

    public final ZK getOrientationDelegate$vungle_ads_release() {
        return this.orientationDelegate;
    }

    public final String getUrl() {
        WebView webView = this.webView;
        if (webView != null) {
            return webView.getUrl();
        }
        return null;
    }

    public final void linkWebView(WebViewClient webViewClient) {
        AbstractC2995aW.q(webViewClient, "vngWebViewClient");
        WebView webView = this.webView;
        if (webView != null) {
            applyDefault(webView);
            webView.setWebViewClient(webViewClient);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        ViewGroup.LayoutParams layoutParams;
        super.onAttachedToWindow();
        ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
        if (layoutParams2 != null) {
            layoutParams2.height = -1;
            layoutParams2.width = -1;
        }
        WebView webView = this.webView;
        if (webView == null || (layoutParams = webView.getLayoutParams()) == null) {
            return;
        }
        layoutParams.height = -1;
        layoutParams.width = -1;
    }

    public final void pauseWeb() {
        WebView webView = this.webView;
        if (webView != null) {
            webView.onPause();
        }
    }

    public final void resumeWeb() {
        WebView webView = this.webView;
        if (webView != null) {
            webView.onResume();
        }
    }

    public final void setCloseDelegate(VK vk) {
        AbstractC2995aW.q(vk, "closeDelegate");
        this.closeDelegate = vk;
    }

    public final void setCloseDelegate$vungle_ads_release(VK vk) {
        this.closeDelegate = vk;
    }

    public final void setOnViewTouchListener(YK yk) {
        this.onViewTouchListener = yk;
    }

    public final void setOnViewTouchListener$vungle_ads_release(YK yk) {
        this.onViewTouchListener = yk;
    }

    public final void setOrientation(int i) {
        ZK zk = this.orientationDelegate;
        if (zk != null) {
            ((I0) zk).setOrientation(i);
        }
    }

    public final void setOrientationDelegate(ZK zk) {
        this.orientationDelegate = zk;
    }

    public final void setOrientationDelegate$vungle_ads_release(ZK zk) {
        this.orientationDelegate = zk;
    }

    public final void showWebsite(String str) {
        AbstractC2995aW.q(str, "url");
        C4917wJ.Companion.d(TAG, "loadUrl: ".concat(str));
        WebView webView = this.webView;
        if (webView != null) {
            webView.setVisibility(0);
            webView.loadUrl(str);
        }
    }

    @VisibleForTesting
    public static /* synthetic */ void getCloseDelegate$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getOnViewTouchListener$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getOrientationDelegate$vungle_ads_release$annotations() {
    }
}
