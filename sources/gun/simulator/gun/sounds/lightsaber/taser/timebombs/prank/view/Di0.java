package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import android.content.IntentFilter;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.vungle.ads.ServiceLocator$Companion;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes4.dex */
public final class Di0 extends RelativeLayout {
    public static final C4775ui0 Companion = new C4775ui0(null);
    private static final String TAG = "VungleBannerView";
    private O8 adListener;
    private final C3105bi0 adSize;
    private final K8 adViewImpl;
    private C2984aL adWidget;
    private int calculatedPixelHeight;
    private int calculatedPixelWidth;
    private final AtomicBoolean destroyed;
    private Cj0 imageView;
    private final InterfaceC3069bH impressionTracker$delegate;
    private final AtomicBoolean isAdAttachedToWindow;
    private final AtomicBoolean isAdDownloaded;
    private final AtomicBoolean isInvisibleLogged;
    private boolean isOnImpressionCalled;
    private boolean isReceiverRegistered;
    private final String placementId;
    private C4304pL presenter;
    private final AtomicBoolean presenterStarted;
    private final C3308e00 ringerModeReceiver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Di0(Context context, String str, C3105bi0 c3105bi0) {
        super(context);
        AbstractC2995aW.q(context, com.umeng.analytics.pro.f.X);
        AbstractC2995aW.q(str, HandleInvocationsFromAdViewer.KEY_PLACEMENT_ID);
        AbstractC2995aW.q(c3105bi0, "adSize");
        this.placementId = str;
        this.adSize = c3105bi0;
        this.ringerModeReceiver = new C3308e00();
        K8 k8 = new K8(context, str, c3105bi0, new C3573h1());
        this.adViewImpl = k8;
        this.destroyed = new AtomicBoolean(false);
        this.presenterStarted = new AtomicBoolean(false);
        this.isAdDownloaded = new AtomicBoolean(false);
        this.isAdAttachedToWindow = new AtomicBoolean(false);
        this.isInvisibleLogged = new AtomicBoolean(false);
        this.impressionTracker$delegate = AbstractC2340Cl.I(new C4863vi0(context));
        k8.setAdListener(new C4687ti0(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkHardwareAcceleration() {
        C4917wJ.Companion.w(TAG, "hardwareAccelerated = " + isHardwareAccelerated());
        if (isHardwareAccelerated()) {
            return;
        }
        C2961a4.logMetric$vungle_ads_release$default(C2961a4.INSTANCE, B30.HARDWARE_ACCELERATE_DISABLED, 0L, this.adViewImpl.getLogEntry$vungle_ads_release(), null, 10, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void finishAdInternal(boolean z) {
        if (this.destroyed.get()) {
            return;
        }
        this.destroyed.set(true);
        int i = (z ? 4 : 0) | 2;
        C4304pL c4304pL = this.presenter;
        if (c4304pL != null) {
            c4304pL.stop();
        }
        C4304pL c4304pL2 = this.presenter;
        if (c4304pL2 != null) {
            c4304pL2.detach(i);
        }
        getImpressionTracker().destroy();
        try {
            ViewParent parent = getParent();
            if (parent != null && (parent instanceof ViewGroup)) {
                ((ViewGroup) parent).removeView(this);
            }
            removeAllViews();
        } catch (Exception e) {
            C4917wJ.Companion.d(TAG, "Removing webView error: " + e);
        }
    }

    private final QC getImpressionTracker() {
        return (QC) this.impressionTracker$delegate.getValue();
    }

    public static /* synthetic */ void load$default(Di0 di0, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        di0.load(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logViewInvisibleOnPlay() {
        if (this.isInvisibleLogged.getAndSet(true)) {
            return;
        }
        C4917wJ.Companion.d(TAG, "ImpressionTracker checked the banner view invisible on play. " + hashCode());
        C2961a4.logMetric$vungle_ads_release$default(C2961a4.INSTANCE, new C3586h70(B30.VIEW_NOT_VISIBLE_ON_PLAY), this.adViewImpl.getLogEntry$vungle_ads_release(), (String) null, 4, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onBannerAdLoaded(X8 x8) {
        C2961a4 c2961a4 = C2961a4.INSTANCE;
        C2961a4.logMetric$vungle_ads_release$default(c2961a4, new C3586h70(B30.PLAY_AD_API), this.adViewImpl.getLogEntry$vungle_ads_release(), (String) null, 4, (Object) null);
        this.adViewImpl.getAdInternal$vungle_ads_release().getShowToValidationMetric$vungle_ads_release().markStart();
        Ei0 ei0CanPlayAd = this.adViewImpl.getAdInternal$vungle_ads_release().canPlayAd(true);
        if (ei0CanPlayAd != null) {
            if (this.adViewImpl.getAdInternal$vungle_ads_release().isErrorTerminal$vungle_ads_release(ei0CanPlayAd.getCode())) {
                this.adViewImpl.getAdInternal$vungle_ads_release().setAdState(B1.ERROR);
            }
            O8 o8 = this.adListener;
            if (o8 != null) {
                o8.onAdFailedToPlay(x8, ei0CanPlayAd);
                return;
            }
            return;
        }
        C4980x2 advertisement = this.adViewImpl.getAdInternal$vungle_ads_release().getAdvertisement();
        C4664tU placement = this.adViewImpl.getAdInternal$vungle_ads_release().getPlacement();
        if (advertisement == null || placement == null) {
            O8 o9 = this.adListener;
            if (o9 != null) {
                o9.onAdFailedToPlay(x8, new X1("Ad or Placement is null").setLogEntry$vungle_ads_release(this.adViewImpl.getLogEntry$vungle_ads_release()).logError$vungle_ads_release());
                return;
            }
            return;
        }
        this.adViewImpl.getAdInternal$vungle_ads_release().cancelDownload$vungle_ads_release();
        try {
            willPresentAdView(advertisement, placement, getAdViewSize());
            this.adViewImpl.getResponseToShowMetric$vungle_ads_release().markEnd();
            C2961a4.logMetric$vungle_ads_release$default(c2961a4, this.adViewImpl.getResponseToShowMetric$vungle_ads_release(), this.adViewImpl.getLogEntry$vungle_ads_release(), (String) null, 4, (Object) null);
            this.adViewImpl.getShowToCloseMetric$vungle_ads_release().markStart();
            this.adViewImpl.getShowToFailMetric$vungle_ads_release().markStart();
            this.isAdDownloaded.set(true);
            O8 o10 = this.adListener;
            if (o10 != null) {
                o10.onAdLoaded(x8);
            }
            renderAd();
        } catch (InstantiationException unused) {
        }
    }

    private final void renderAd() {
        if (this.destroyed.get()) {
            C4917wJ.Companion.w(TAG, "renderAd() - destroyed");
            return;
        }
        if (!this.isAdDownloaded.get()) {
            C4917wJ.Companion.d(TAG, "renderAd() - not ready: not downloaded.");
            return;
        }
        if (!this.isAdAttachedToWindow.get()) {
            C4917wJ.Companion.d(TAG, "renderAd() - not ready: not attached.");
            logViewInvisibleOnPlay();
            return;
        }
        if (!this.presenterStarted.getAndSet(true)) {
            this.adViewImpl.getAdInternal$vungle_ads_release().getShowToValidationMetric$vungle_ads_release().markEnd();
            C2961a4.logMetric$vungle_ads_release$default(C2961a4.INSTANCE, this.adViewImpl.getAdInternal$vungle_ads_release().getShowToValidationMetric$vungle_ads_release(), this.adViewImpl.getLogEntry$vungle_ads_release(), (String) null, 4, (Object) null);
            this.adViewImpl.getAdInternal$vungle_ads_release().getValidationToPresentMetric$vungle_ads_release().markStart();
            C4304pL c4304pL = this.presenter;
            if (c4304pL != null) {
                c4304pL.prepare();
            }
            getImpressionTracker().addView(this, new C4951wi0(this));
        }
        C2984aL c2984aL = this.adWidget;
        if (c2984aL != null) {
            if (!AbstractC2995aW.i(c2984aL != null ? c2984aL.getParent() : null, this)) {
                addView(this.adWidget, this.calculatedPixelWidth, this.calculatedPixelHeight);
                Cj0 cj0 = this.imageView;
                if (cj0 != null) {
                    addView(cj0, this.calculatedPixelWidth, this.calculatedPixelHeight);
                    Cj0 cj1 = this.imageView;
                    if (cj1 != null) {
                        cj1.bringToFront();
                    }
                }
            }
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = this.calculatedPixelHeight;
            layoutParams.width = this.calculatedPixelWidth;
            requestLayout();
        }
    }

    private final void setAdVisibility(boolean z) {
        C4304pL c4304pL;
        if (!this.isOnImpressionCalled || this.destroyed.get() || (c4304pL = this.presenter) == null) {
            return;
        }
        c4304pL.setAdVisibility(z);
    }

    private final void willPresentAdView(C4980x2 c4980x2, C4664tU c4664tU, C3105bi0 c3105bi0) throws InstantiationException {
        Th0 th0 = Th0.INSTANCE;
        Context context = getContext();
        AbstractC2995aW.p(context, com.umeng.analytics.pro.f.X);
        this.calculatedPixelHeight = th0.dpToPixels(context, c3105bi0.getHeight());
        Context context2 = getContext();
        AbstractC2995aW.p(context2, com.umeng.analytics.pro.f.X);
        this.calculatedPixelWidth = th0.dpToPixels(context2, c3105bi0.getWidth());
        Ci0 ci0 = new Ci0(this.adViewImpl.getAdPlayCallback$vungle_ads_release(), this.adViewImpl.getAdInternal$vungle_ads_release().getPlacement());
        try {
            Context context3 = getContext();
            AbstractC2995aW.p(context3, com.umeng.analytics.pro.f.X);
            C2984aL c2984aL = new C2984aL(context3);
            this.adWidget = c2984aL;
            c2984aL.setCloseDelegate(new Ai0(this));
            c2984aL.setOnViewTouchListener(new Bi0(this));
            ServiceLocator$Companion serviceLocator$Companion = C3756j50.Companion;
            Context context4 = getContext();
            AbstractC2995aW.p(context4, com.umeng.analytics.pro.f.X);
            EnumC4124nH enumC4124nH = EnumC4124nH.f4736a;
            InterfaceC3069bH interfaceC3069bHH = AbstractC2340Cl.H(enumC4124nH, new C5039xi0(context4));
            Context context5 = getContext();
            AbstractC2995aW.p(context5, com.umeng.analytics.pro.f.X);
            C3345eS c3345eSMake = m161willPresentAdView$lambda2(AbstractC2340Cl.H(enumC4124nH, new C5127yi0(context5))).make(C3457fi.INSTANCE.omEnabled() && c4980x2.omEnabled());
            Context context6 = getContext();
            AbstractC2995aW.p(context6, com.umeng.analytics.pro.f.X);
            InterfaceC3069bH interfaceC3069bHH2 = AbstractC2340Cl.H(enumC4124nH, new C5215zi0(context6));
            C5041xj0 c5041xj0 = new C5041xj0(c4980x2, c4664tU, ((C4893w20) m160willPresentAdView$lambda1(interfaceC3069bHH)).getOffloadExecutor(), null, m162willPresentAdView$lambda3(interfaceC3069bHH2), 8, null);
            this.ringerModeReceiver.setWebClient(c5041xj0);
            c5041xj0.setWebViewObserver(c3345eSMake);
            C4304pL c4304pL = new C4304pL(c2984aL, c4980x2, c4664tU, c5041xj0, ((C4893w20) m160willPresentAdView$lambda1(interfaceC3069bHH)).getJobExecutor(), c3345eSMake, this.adViewImpl.getAdInternal$vungle_ads_release().getBidPayload(), m162willPresentAdView$lambda3(interfaceC3069bHH2));
            c4304pL.setEventListener(ci0);
            this.presenter = c4304pL;
            String watermark$vungle_ads_release = getAdConfig().getWatermark$vungle_ads_release();
            if (watermark$vungle_ads_release != null) {
                Context context7 = getContext();
                AbstractC2995aW.p(context7, com.umeng.analytics.pro.f.X);
                this.imageView = new Cj0(context7, watermark$vungle_ads_release);
            }
        } catch (InstantiationException e) {
            ci0.onError(new C3132c1().setLogEntry$vungle_ads_release(this.adViewImpl.getLogEntry$vungle_ads_release()).logError$vungle_ads_release(), this.placementId);
            throw e;
        }
    }

    /* JADX INFO: renamed from: willPresentAdView$lambda-1, reason: not valid java name */
    private static final InterfaceC4615ss m160willPresentAdView$lambda1(InterfaceC3069bH interfaceC3069bH) {
        return (InterfaceC4615ss) interfaceC3069bH.getValue();
    }

    /* JADX INFO: renamed from: willPresentAdView$lambda-2, reason: not valid java name */
    private static final C3257dS m161willPresentAdView$lambda2(InterfaceC3069bH interfaceC3069bH) {
        return (C3257dS) interfaceC3069bH.getValue();
    }

    /* JADX INFO: renamed from: willPresentAdView$lambda-3, reason: not valid java name */
    private static final InterfaceC5016xU m162willPresentAdView$lambda3(InterfaceC3069bH interfaceC3069bH) {
        return (InterfaceC5016xU) interfaceC3069bH.getValue();
    }

    public final void finishAd() {
        finishAdInternal(true);
    }

    public final C3573h1 getAdConfig() {
        return this.adViewImpl.getAdConfig();
    }

    public final O8 getAdListener() {
        return this.adListener;
    }

    public final C3105bi0 getAdSize() {
        return this.adSize;
    }

    public final C3105bi0 getAdViewSize() {
        return this.adViewImpl.getAdViewSize();
    }

    public final String getCreativeId() {
        return this.adViewImpl.getCreativeId();
    }

    public final String getEventId() {
        return this.adViewImpl.getEventId();
    }

    public final String getPlacementId() {
        return this.placementId;
    }

    public final void load(String str) {
        this.adViewImpl.load(str);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C4829vJ c4829vJ = C4917wJ.Companion;
        c4829vJ.d(TAG, "onAttachedToWindow(): " + hashCode());
        this.isAdAttachedToWindow.set(true);
        if (this.adViewImpl.getAdInternal$vungle_ads_release().getPlacement() != null) {
            try {
                if (!this.isReceiverRegistered) {
                    getContext().registerReceiver(this.ringerModeReceiver, new IntentFilter("android.media.RINGER_MODE_CHANGED"));
                    this.isReceiverRegistered = true;
                    c4829vJ.d(TAG, "registerReceiver(): " + this.ringerModeReceiver.hashCode());
                }
            } catch (Exception e) {
                C4917wJ.Companion.e(TAG, "registerReceiver error: " + e.getLocalizedMessage());
            }
        }
        renderAd();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C4917wJ.Companion.d(TAG, "onDetachedFromWindow(): " + hashCode());
        this.isAdAttachedToWindow.set(false);
        if (this.adViewImpl.getAdInternal$vungle_ads_release().getPlacement() != null) {
            try {
                if (this.isReceiverRegistered) {
                    getContext().unregisterReceiver(this.ringerModeReceiver);
                    this.isReceiverRegistered = false;
                }
            } catch (Exception e) {
                C4917wJ.Companion.e(TAG, "unregisterReceiver error: " + e.getLocalizedMessage());
            }
        }
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        setAdVisibility(i == 0);
    }

    public final void setAdListener(O8 o8) {
        this.adListener = o8;
    }
}
