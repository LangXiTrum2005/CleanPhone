package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.vungle.ads.ServiceLocator$Companion;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes4.dex */
public final class PQ extends X8 {
    public static final int BOTTOM_LEFT = 2;
    public static final int BOTTOM_RIGHT = 3;
    public static final FQ Companion = new FQ(null);
    private static final String TAG = "NativeAd";
    public static final int TOP_LEFT = 0;
    public static final int TOP_RIGHT = 1;
    private SO adContentView;
    private ImageView adIconView;
    private int adOptionsPosition;
    private XQ adOptionsView;
    private final HQ adPlayCallback;
    private FrameLayout adRootView;
    private float aspectRatio;
    private Collection<? extends View> clickableViews;
    private final InterfaceC3069bH executors$delegate;
    private final InterfaceC3069bH imageLoader$delegate;
    private final InterfaceC3069bH impressionTracker$delegate;
    private final AtomicBoolean isInvisibleLogged;
    private Map<String, String> nativeAdAssetMap;
    private C3520gR presenter;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PQ(Context context, String str) {
        this(context, str, new C3573h1());
        AbstractC2995aW.q(context, com.umeng.analytics.pro.f.X);
        AbstractC2995aW.q(str, HandleInvocationsFromAdViewer.KEY_PLACEMENT_ID);
    }

    private final void createMediaAspectRatio() {
        getImageLoader().getImageSize(getMainImagePath(), new IQ(this));
    }

    private final void displayImage(String str, ImageView imageView) {
        getImageLoader().displayImage(str, new JQ(imageView));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC4615ss getExecutors() {
        return (InterfaceC4615ss) this.executors$delegate.getValue();
    }

    private final C4470rC getImageLoader() {
        return (C4470rC) this.imageLoader$delegate.getValue();
    }

    private final QC getImpressionTracker() {
        return (QC) this.impressionTracker$delegate.getValue();
    }

    private final String getMainImagePath() {
        String str;
        Map<String, String> map = this.nativeAdAssetMap;
        return (map == null || (str = map.get(SQ.TOKEN_MAIN_IMAGE)) == null) ? "" : str;
    }

    /* JADX INFO: renamed from: registerViewForInteraction$lambda-1, reason: not valid java name */
    private static final InterfaceC5016xU m185registerViewForInteraction$lambda1(InterfaceC3069bH interfaceC3069bH) {
        return (InterfaceC5016xU) interfaceC3069bH.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: registerViewForInteraction$lambda-2, reason: not valid java name */
    public static final void m186registerViewForInteraction$lambda2(PQ pq, View view) {
        AbstractC2995aW.q(pq, "this$0");
        C3520gR c3520gR = pq.presenter;
        if (c3520gR != null) {
            c3520gR.processCommand("openPrivacy", pq.getPrivacyUrl$vungle_ads_release());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: registerViewForInteraction$lambda-4$lambda-3, reason: not valid java name */
    public static final void m187registerViewForInteraction$lambda4$lambda3(PQ pq, View view) {
        AbstractC2995aW.q(pq, "this$0");
        C3520gR c3520gR = pq.presenter;
        if (c3520gR != null) {
            c3520gR.processCommand(C3520gR.DOWNLOAD, pq.getCtaUrl$vungle_ads_release());
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.X8
    public SQ constructAdInternal$vungle_ads_release(Context context) {
        AbstractC2995aW.q(context, com.umeng.analytics.pro.f.X);
        return new SQ(context);
    }

    public final String getAdBodyText() {
        String str;
        Map<String, String> map = this.nativeAdAssetMap;
        return (map == null || (str = map.get(SQ.TOKEN_APP_DESCRIPTION)) == null) ? "" : str;
    }

    public final String getAdCallToActionText() {
        String str;
        Map<String, String> map = this.nativeAdAssetMap;
        return (map == null || (str = map.get(SQ.TOKEN_CTA_BUTTON_TEXT)) == null) ? "" : str;
    }

    public final int getAdOptionsPosition() {
        return this.adOptionsPosition;
    }

    public final String getAdSponsoredText() {
        String str;
        Map<String, String> map = this.nativeAdAssetMap;
        return (map == null || (str = map.get(SQ.TOKEN_SPONSORED_BY)) == null) ? "" : str;
    }

    public final Double getAdStarRating() {
        String str;
        Map<String, String> map = this.nativeAdAssetMap;
        if (map == null || (str = map.get(SQ.TOKEN_APP_RATING_VALUE)) == null) {
            str = "";
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return Double.valueOf(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public final String getAdTitle() {
        String str;
        Map<String, String> map = this.nativeAdAssetMap;
        return (map == null || (str = map.get(SQ.TOKEN_APP_NAME)) == null) ? "" : str;
    }

    public final String getAppIcon() {
        String str;
        Map<String, String> map = this.nativeAdAssetMap;
        return (map == null || (str = map.get(SQ.TOKEN_APP_ICON)) == null) ? "" : str;
    }

    public final String getCtaUrl$vungle_ads_release() {
        String str;
        Map<String, String> map = this.nativeAdAssetMap;
        return (map == null || (str = map.get(SQ.TOKEN_CTA_BUTTON_URL)) == null) ? "" : str;
    }

    public final float getMediaAspectRatio() {
        return this.aspectRatio;
    }

    public final String getPrivacyIconUrl$vungle_ads_release() {
        String str;
        Map<String, String> map = this.nativeAdAssetMap;
        return (map == null || (str = map.get(SQ.TOKEN_VUNGLE_PRIVACY_ICON_URL)) == null) ? "" : str;
    }

    public final String getPrivacyUrl$vungle_ads_release() {
        String str;
        Map<String, String> map = this.nativeAdAssetMap;
        return (map == null || (str = map.get(SQ.TOKEN_VUNGLE_PRIVACY_URL)) == null) ? "" : str;
    }

    public final boolean hasCallToAction() {
        return getCtaUrl$vungle_ads_release().length() > 0;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.X8
    public void onAdLoaded$vungle_ads_release(C4980x2 c4980x2) {
        AbstractC2995aW.q(c4980x2, "advertisement");
        super.onAdLoaded$vungle_ads_release(c4980x2);
        this.nativeAdAssetMap = c4980x2.getMRAIDArgsInMap();
        createMediaAspectRatio();
    }

    public final void performCTA() {
        C3520gR c3520gR = this.presenter;
        if (c3520gR != null) {
            c3520gR.processCommand(C3520gR.DOWNLOAD, getCtaUrl$vungle_ads_release());
        }
    }

    public final void registerViewForInteraction(FrameLayout frameLayout, SO so, ImageView imageView, Collection<? extends View> collection) {
        String str;
        AbstractC2995aW.q(frameLayout, "rootView");
        AbstractC2995aW.q(so, "mediaView");
        C2961a4 c2961a4 = C2961a4.INSTANCE;
        C2961a4.logMetric$vungle_ads_release$default(c2961a4, new C3586h70(B30.PLAY_AD_API), getLogEntry$vungle_ads_release(), (String) null, 4, (Object) null);
        getResponseToShowMetric$vungle_ads_release().markEnd();
        C2961a4.logMetric$vungle_ads_release$default(c2961a4, getResponseToShowMetric$vungle_ads_release(), getLogEntry$vungle_ads_release(), (String) null, 4, (Object) null);
        getAdInternal$vungle_ads_release().getShowToValidationMetric$vungle_ads_release().markStart();
        getShowToFailMetric$vungle_ads_release().markStart();
        getShowToCloseMetric$vungle_ads_release().markStart();
        final int i = 1;
        Ei0 ei0CanPlayAd = getAdInternal$vungle_ads_release().canPlayAd(true);
        if (ei0CanPlayAd != null) {
            if (getAdInternal$vungle_ads_release().isErrorTerminal$vungle_ads_release(ei0CanPlayAd.getCode())) {
                getAdInternal$vungle_ads_release().setAdState(B1.ERROR);
                Map<String, String> map = this.nativeAdAssetMap;
                if (map != null) {
                    map.clear();
                }
            }
            Y8 adListener = getAdListener();
            if (adListener != null) {
                adListener.onAdFailedToPlay(this, ei0CanPlayAd);
                return;
            }
            return;
        }
        this.adRootView = frameLayout;
        this.adContentView = so;
        this.adIconView = imageView;
        this.clickableViews = collection;
        ServiceLocator$Companion serviceLocator$Companion = C3756j50.Companion;
        InterfaceC3069bH interfaceC3069bHH = AbstractC2340Cl.H(EnumC4124nH.f4736a, new MQ(getContext()));
        Context context = getContext();
        Object adInternal$vungle_ads_release = getAdInternal$vungle_ads_release();
        AbstractC2995aW.o(adInternal$vungle_ads_release, "null cannot be cast to non-null type com.vungle.ads.internal.presenter.NativePresenterDelegate");
        this.presenter = new C3520gR(context, (InterfaceC4046mR) adInternal$vungle_ads_release, getAdInternal$vungle_ads_release().getAdvertisement(), ((C4893w20) getExecutors()).getJobExecutor(), m185registerViewForInteraction$lambda1(interfaceC3069bHH));
        Map<String, String> map2 = this.nativeAdAssetMap;
        if (map2 == null || (str = map2.get(SQ.TOKEN_OM_SDK_DATA)) == null) {
            str = "";
        }
        C3520gR c3520gR = this.presenter;
        if (c3520gR != null) {
            c3520gR.initOMTracker(str);
        }
        C3520gR c3520gR2 = this.presenter;
        if (c3520gR2 != null) {
            c3520gR2.startTracking(frameLayout);
        }
        C3520gR c3520gR3 = this.presenter;
        if (c3520gR3 != null) {
            c3520gR3.setEventListener(new C4099n1(this.adPlayCallback, getAdInternal$vungle_ads_release().getPlacement()));
        }
        XQ xq = this.adOptionsView;
        if (xq != null) {
            final int i2 = 0;
            xq.setOnClickListener(new View.OnClickListener(this) { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EQ
                public final /* synthetic */ PQ b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i3 = i2;
                    PQ pq = this.b;
                    switch (i3) {
                        case 0:
                            PQ.m186registerViewForInteraction$lambda2(pq, view);
                            break;
                        default:
                            PQ.m187registerViewForInteraction$lambda4$lambda3(pq, view);
                            break;
                    }
                }
            });
        }
        if (collection == null) {
            collection = AbstractC2340Cl.J(so);
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setOnClickListener(new View.OnClickListener(this) { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EQ
                public final /* synthetic */ PQ b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i3 = i;
                    PQ pq = this.b;
                    switch (i3) {
                        case 0:
                            PQ.m186registerViewForInteraction$lambda2(pq, view);
                            break;
                        default:
                            PQ.m187registerViewForInteraction$lambda4$lambda3(pq, view);
                            break;
                    }
                }
            });
        }
        XQ xq2 = this.adOptionsView;
        if (xq2 != null) {
            xq2.renderTo(frameLayout, this.adOptionsPosition);
        }
        getImpressionTracker().addView(frameLayout, new NQ(this));
        displayImage(getMainImagePath(), so.getMainImage$vungle_ads_release());
        displayImage(getAppIcon(), imageView);
        String privacyIconUrl$vungle_ads_release = getPrivacyIconUrl$vungle_ads_release();
        XQ xq3 = this.adOptionsView;
        displayImage(privacyIconUrl$vungle_ads_release, xq3 != null ? xq3.getPrivacyIcon$vungle_ads_release() : null);
        String watermark$vungle_ads_release = getAdConfig().getWatermark$vungle_ads_release();
        if (watermark$vungle_ads_release != null) {
            Context context2 = frameLayout.getContext();
            AbstractC2995aW.p(context2, "rootView.context");
            Cj0 cj0 = new Cj0(context2, watermark$vungle_ads_release);
            frameLayout.addView(cj0);
            cj0.bringToFront();
        }
        getAdInternal$vungle_ads_release().getShowToValidationMetric$vungle_ads_release().markEnd();
        C2961a4.logMetric$vungle_ads_release$default(C2961a4.INSTANCE, getAdInternal$vungle_ads_release().getShowToValidationMetric$vungle_ads_release(), getLogEntry$vungle_ads_release(), (String) null, 4, (Object) null);
        getAdInternal$vungle_ads_release().getValidationToPresentMetric$vungle_ads_release().markStart();
        C3520gR c3520gR4 = this.presenter;
        if (c3520gR4 != null) {
            c3520gR4.prepare();
        }
    }

    public final void setAdOptionsPosition(int i) {
        this.adOptionsPosition = i;
    }

    public final void unregisterView() {
        if (getAdInternal$vungle_ads_release().getAdState() == B1.FINISHED) {
            return;
        }
        Collection<? extends View> collection = this.clickableViews;
        if (collection != null) {
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                ((View) it.next()).setOnClickListener(null);
            }
        }
        this.clickableViews = null;
        Map<String, String> map = this.nativeAdAssetMap;
        if (map != null) {
            map.clear();
        }
        getImpressionTracker().destroy();
        SO so = this.adContentView;
        if (so != null) {
            so.destroy();
        }
        this.adContentView = null;
        XQ xq = this.adOptionsView;
        if (xq != null) {
            xq.destroy();
        }
        this.adOptionsView = null;
        try {
            ImageView imageView = this.adIconView;
            Drawable drawable = imageView != null ? imageView.getDrawable() : null;
            if (drawable instanceof BitmapDrawable) {
                Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
                if (!bitmap.isRecycled()) {
                    bitmap.recycle();
                }
            }
        } catch (Exception e) {
            C4917wJ.Companion.w(TAG, "error msg: " + e.getLocalizedMessage());
        }
        ImageView imageView2 = this.adIconView;
        if (imageView2 != null) {
            imageView2.setImageDrawable(null);
        }
        this.adIconView = null;
        C3520gR c3520gR = this.presenter;
        if (c3520gR != null) {
            c3520gR.detach();
        }
    }

    private PQ(Context context, String str, C3573h1 c3573h1) {
        super(context, str, c3573h1);
        this.imageLoader$delegate = AbstractC2340Cl.I(new KQ(this));
        ServiceLocator$Companion serviceLocator$Companion = C3756j50.Companion;
        this.executors$delegate = AbstractC2340Cl.H(EnumC4124nH.f4736a, new OQ(context));
        this.impressionTracker$delegate = AbstractC2340Cl.I(new LQ(context));
        this.isInvisibleLogged = new AtomicBoolean(false);
        this.adOptionsPosition = 1;
        this.adOptionsView = new XQ(context);
        this.adPlayCallback = new HQ(this);
    }

    public static /* synthetic */ void getAdOptionsPosition$annotations() {
    }
}
