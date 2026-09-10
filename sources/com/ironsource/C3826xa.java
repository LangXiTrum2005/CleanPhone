package com.ironsource;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.mediation.R;
import com.unity3d.mediation.LevelPlay;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.mediation.LevelPlayAdSize;
import com.unity3d.mediation.banner.LevelPlayBannerAdView;
import com.unity3d.mediation.banner.LevelPlayBannerAdViewListener;
import java.util.UUID;
import p002kotlin.Pair;
import p002kotlin.Unit;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.xa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3826xa implements InterfaceC3852z2 {
    public static final a n = new a(null);
    private final UUID a;
    private final String b;
    private final W2 c;
    private final LevelPlayBannerAdView.Config d;
    private final C3681p0 e;
    private final P8 f;
    private final LevelPlayAdSize g;
    private LevelPlayBannerAdViewListener h;
    private final String i;
    private C3775ua j;
    private Boolean k;
    private C3461cd l;
    private boolean m;

    /* JADX INFO: renamed from: com.ironsource.xa$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Pair<String, LevelPlayBannerAdView.Config> a(Context context, AttributeSet attributeSet) {
            Intrinsics.checkNotNullParameter(context, "context");
            String str = "";
            if (attributeSet == null) {
                return patroclinal.formularize.attabal("", LevelPlayBannerAdView.Config.Companion.empty());
            }
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.LevelPlayBannerAdView);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "context.obtainStyledAttr…le.LevelPlayBannerAdView)");
            try {
                LevelPlayBannerAdView.Config.Builder builder = new LevelPlayBannerAdView.Config.Builder();
                if (typedArrayObtainStyledAttributes.hasValue(R.styleable.LevelPlayBannerAdView_bidFloor)) {
                    builder.setBidFloor(typedArrayObtainStyledAttributes.getFloat(R.styleable.LevelPlayBannerAdView_bidFloor, -1.0f));
                }
                String string = typedArrayObtainStyledAttributes.getString(R.styleable.LevelPlayBannerAdView_adSize);
                if (string != null) {
                    builder.setAdSize(LevelPlayAdSize.Companion.createAdSize$mediationsdk_release(string));
                }
                String string2 = typedArrayObtainStyledAttributes.getString(R.styleable.LevelPlayBannerAdView_adUnitId);
                if (string2 != null) {
                    str = string2;
                }
                return patroclinal.formularize.attabal(str, builder.build());
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        }

        private a() {
        }
    }

    public C3826xa(UUID adId, String adUnitId, W2 bannerContainer, LevelPlayBannerAdView.Config config, C3681p0 adTools) {
        Intrinsics.checkNotNullParameter(adId, "adId");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(bannerContainer, "bannerContainer");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        this.a = adId;
        this.b = adUnitId;
        this.c = bannerContainer;
        this.d = config;
        this.e = adTools;
        this.f = Gb.s.d().A();
        LevelPlayAdSize adSize = config.getAdSize();
        this.g = adSize == null ? LevelPlayAdSize.BANNER : adSize;
        String placementName = config.getPlacementName();
        this.i = placementName == null ? "" : placementName;
        adTools.e().a(new C3644n(IronSource.a.BANNER, adId, adUnitId));
        Double bidFloor = config.getBidFloor();
        if (bidFloor != null) {
            adTools.e().f().a(bidFloor.doubleValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(final C3826xa this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!this$0.m) {
            IronLog.INTERNAL.warning(C3681p0.a(this$0.e, "Banner not loaded", (String) null, 2, (Object) null));
            return;
        }
        if (this$0.j == null) {
            IronLog.INTERNAL.warning(C3681p0.a(this$0.e, "Banner already destroyed", (String) null, 2, (Object) null));
            return;
        }
        C3725rb.a(this$0.e, new Runnable() { // from class: com.ironsource.rsp
            @Override // java.lang.Runnable
            public final void run() {
                C3826xa.b(this.f23400kowloon);
            }
        }, 0L, 2, (Object) null);
        C3775ua c3775ua = this$0.j;
        if (c3775ua != null) {
            c3775ua.c();
        }
        this$0.j = null;
        this$0.k = null;
        this$0.h = null;
    }

    private final boolean h() {
        if (this.b.length() == 0) {
            String string = this.a.toString();
            Intrinsics.checkNotNullExpressionValue(string, "adId.toString()");
            a(new LevelPlayAdError(string, this.b, LevelPlayAdError.ERROR_CODE_NO_AD_UNIT_ID_SPECIFIED, "Ad unit ID should be specified"));
            return false;
        }
        if (!this.e.g()) {
            String string2 = this.a.toString();
            Intrinsics.checkNotNullExpressionValue(string2, "adId.toString()");
            a(new LevelPlayAdError(string2, this.b, LevelPlayAdError.ERROR_CODE_LOAD_BEFORE_INIT_SUCCESS_CALLBACK, "load must be called after init success callback"));
            return false;
        }
        Sa saA = Gb.s.d().f().a();
        if (saA != null && saA.a(this.b, LevelPlay.AdFormat.BANNER)) {
            return true;
        }
        LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = this.h;
        if (levelPlayBannerAdViewListener != null) {
            String string3 = this.a.toString();
            Intrinsics.checkNotNullExpressionValue(string3, "adId.toString()");
            levelPlayBannerAdViewListener.onAdLoadFailed(new LevelPlayAdError(string3, this.b, LevelPlayAdError.ERROR_CODE_INVALID_AD_UNIT_ID, "Invalid ad unit id"));
        }
        return false;
    }

    public final void b() {
        IronLog.API.info("LevelPlayBannerAdView.destroyBanner()");
        this.e.d(new Runnable() { // from class: com.ironsource.nattier
            @Override // java.lang.Runnable
            public final void run() {
                C3826xa.a(this.f23353kowloon);
            }
        });
    }

    public final UUID c() {
        return this.a;
    }

    public final LevelPlayAdSize d() {
        return this.g;
    }

    public final String e() {
        return this.b;
    }

    public final LevelPlayBannerAdViewListener f() {
        return this.h;
    }

    public final String g() {
        return this.i;
    }

    public final void i() {
        IronLog.API.info("LevelPlayBannerAdView.loadAd()");
        this.e.d(new Runnable() { // from class: com.ironsource.astrogate
            @Override // java.lang.Runnable
            public final void run() {
                C3826xa.c(this.f23140kowloon);
            }
        });
    }

    public final void j() {
        Unit unit;
        IronLog.API.info("LevelPlayBannerAdView.pauseAutoRefresh()");
        final C3775ua c3775ua = this.j;
        if (c3775ua != null) {
            this.e.d(new Runnable() { // from class: com.ironsource.crock
                @Override // java.lang.Runnable
                public final void run() {
                    C3826xa.a(this.f23192kowloon, c3775ua);
                }
            });
            unit = Unit.f29295attabal;
        } else {
            unit = null;
        }
        if (unit == null) {
            this.k = Boolean.FALSE;
        }
    }

    public final void k() {
        Unit unit;
        IronLog.API.info("LevelPlayBannerAdView.resumeAutoRefresh()");
        final C3775ua c3775ua = this.j;
        if (c3775ua != null) {
            this.e.d(new Runnable() { // from class: com.ironsource.bleacherite
                @Override // java.lang.Runnable
                public final void run() {
                    C3826xa.b(this.f23156kowloon, c3775ua);
                }
            });
            unit = Unit.f29295attabal;
        } else {
            unit = null;
        }
        if (unit == null) {
            this.k = Boolean.TRUE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(C3826xa this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.m) {
            IronLog.INTERNAL.warning(C3681p0.a(this$0.e, "Banner load already called", (String) null, 2, (Object) null));
            return;
        }
        this$0.m = true;
        if (this$0.h()) {
            C3775ua c3775uaA = this$0.a();
            this$0.j = c3775uaA;
            Boolean bool = this$0.k;
            if (bool != null) {
                if (bool.booleanValue()) {
                    c3775uaA.f();
                } else {
                    c3775uaA.d();
                }
            }
            c3775uaA.b();
        }
    }

    @Override // com.ironsource.InterfaceC3852z2
    public void d(final LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.e.e(new Runnable() { // from class: com.ironsource.bavaria
            @Override // java.lang.Runnable
            public final void run() {
                C3826xa.a(adInfo, this);
            }
        });
    }

    @Override // com.ironsource.InterfaceC3852z2
    public void e(final LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.e.e(new Runnable() { // from class: com.ironsource.philabeg
            @Override // java.lang.Runnable
            public final void run() {
                C3826xa.c(adInfo, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C3826xa this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.c.removeAllViews();
        ViewParent parent = this$0.c.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(this$0.c);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(LevelPlayAdInfo adInfo, C3826xa this$0) {
        Intrinsics.checkNotNullParameter(adInfo, "$adInfo");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        IronLog.CALLBACK.info("LevelPlayBannerAdViewListener.onBannerAdScreenDismissed() adInfo: " + adInfo);
        LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = this$0.h;
        if (levelPlayBannerAdViewListener != null) {
            levelPlayBannerAdViewListener.onAdCollapsed(adInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(LevelPlayAdInfo adInfo, C3826xa this$0) {
        Intrinsics.checkNotNullParameter(adInfo, "$adInfo");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        IronLog.CALLBACK.info("LevelPlayBannerAdViewListener.onBannerAdScreenPresented() adInfo: " + adInfo);
        LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = this$0.h;
        if (levelPlayBannerAdViewListener != null) {
            levelPlayBannerAdViewListener.onAdExpanded(adInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C3826xa this$0, C3775ua it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "$it");
        this$0.e.e().f().c();
        it.f();
    }

    @Override // com.ironsource.InterfaceC3852z2
    public void b(final LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.e.e(new Runnable() { // from class: com.ironsource.irani
            @Override // java.lang.Runnable
            public final void run() {
                C3826xa.b(adInfo, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(LevelPlayAdInfo adInfo, C3826xa this$0) {
        Intrinsics.checkNotNullParameter(adInfo, "$adInfo");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        IronLog.CALLBACK.info("LevelPlayBannerAdViewListener.onBannerAdDisplayed() adInfo: " + adInfo);
        LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = this$0.h;
        if (levelPlayBannerAdViewListener != null) {
            levelPlayBannerAdViewListener.onAdDisplayed(adInfo);
        }
    }

    public final void a(final LevelPlayBannerAdViewListener levelPlayBannerAdViewListener) {
        IronLog.API.info("LevelPlayBannerAdView.setBannerListener()");
        this.e.d(new Runnable() { // from class: com.ironsource.estragon
            @Override // java.lang.Runnable
            public final void run() {
                C3826xa.a(this.f23235kowloon, levelPlayBannerAdViewListener);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(LevelPlayAdInfo adInfo, C3826xa this$0) {
        Intrinsics.checkNotNullParameter(adInfo, "$adInfo");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        IronLog.CALLBACK.info("LevelPlayBannerAdViewListener.onBannerAdLeftApplication() adInfo: " + adInfo);
        LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = this$0.h;
        if (levelPlayBannerAdViewListener != null) {
            levelPlayBannerAdViewListener.onAdLeftApplication(adInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C3826xa this$0, LevelPlayBannerAdViewListener levelPlayBannerAdViewListener) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.h = levelPlayBannerAdViewListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C3826xa this$0, C3775ua it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "$it");
        this$0.e.e().f().b();
        it.d();
    }

    public /* synthetic */ C3826xa(UUID uuid, String str, W2 w2, LevelPlayBannerAdView.Config config, C3681p0 c3681p0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C3772u7.a.a() : uuid, str, w2, config, (i & 16) != 0 ? new C3681p0(IronSource.a.BANNER, F0.b.MEDIATION) : c3681p0);
    }

    private final C3775ua a() {
        C3461cd c3461cd;
        this.l = this.e.a(this.i);
        Context context = this.c.getContext();
        if (context instanceof Activity) {
            ContextProvider.getInstance().updateActivity((Activity) context);
        }
        UUID uuid = this.a;
        String str = this.b;
        C3461cd c3461cd2 = this.l;
        C3461cd c3461cd3 = null;
        if (c3461cd2 == null) {
            Intrinsics.preprohormone("bannerPlacement");
            c3461cd = null;
        } else {
            c3461cd = c3461cd2;
        }
        J2 j2 = new J2(uuid, str, c3461cd, this.g, null, null, this.f.a(), this.d.getBidFloor(), 48, null);
        this.e.e().a(new D0(this.e, j2, null, 4, null));
        ISBannerSize iSBannerSizeA = this.e.a(j2.i());
        C3838y5 c3838y5E = this.e.e();
        C3681p0 c3681p0 = this.e;
        C3461cd c3461cd4 = this.l;
        if (c3461cd4 == null) {
            Intrinsics.preprohormone("bannerPlacement");
        } else {
            c3461cd3 = c3461cd4;
        }
        c3838y5E.a(new Y2(c3681p0, iSBannerSizeA, c3461cd3.c()));
        return new C3775ua(this, this.e, j2, this.c);
    }

    @Override // com.ironsource.InterfaceC3852z2
    public void c(final LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.e.e(new Runnable() { // from class: com.ironsource.ghoulish
            @Override // java.lang.Runnable
            public final void run() {
                C3826xa.d(adInfo, this);
            }
        });
    }

    @Override // com.ironsource.InterfaceC3852z2
    public void a(final LevelPlayAdInfo adInfo, final boolean z) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.e.e(new Runnable() { // from class: com.ironsource.transformable
            @Override // java.lang.Runnable
            public final void run() {
                C3826xa.a(z, adInfo, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(boolean z, LevelPlayAdInfo adInfo, C3826xa this$0) {
        Intrinsics.checkNotNullParameter(adInfo, "$adInfo");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        IronLog.CALLBACK.info("LevelPlayBannerAdViewListener.onBannerAdLoaded() isReload: " + z + " adInfo: " + adInfo);
        LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = this$0.h;
        if (levelPlayBannerAdViewListener != null) {
            levelPlayBannerAdViewListener.onAdLoaded(adInfo);
        }
    }

    @Override // com.ironsource.InterfaceC3852z2
    public void a(final LevelPlayAdError levelPlayAdError) {
        if (levelPlayAdError != null) {
            this.e.e(new Runnable() { // from class: com.ironsource.electropaint
                @Override // java.lang.Runnable
                public final void run() {
                    C3826xa.a(levelPlayAdError, this);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(LevelPlayAdError it, C3826xa this$0) {
        Intrinsics.checkNotNullParameter(it, "$it");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        IronLog.CALLBACK.info("LevelPlayBannerAdViewListener.onBannerAdLoadFailed() error: " + it);
        LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = this$0.h;
        if (levelPlayBannerAdViewListener != null) {
            levelPlayBannerAdViewListener.onAdLoadFailed(it);
        }
    }

    @Override // com.ironsource.InterfaceC3852z2
    public void a(final LevelPlayAdInfo adInfo, final LevelPlayAdError levelPlayAdError) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        if (levelPlayAdError != null) {
            this.e.e(new Runnable() { // from class: com.ironsource.mef
                @Override // java.lang.Runnable
                public final void run() {
                    C3826xa.a(adInfo, levelPlayAdError, this);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(LevelPlayAdInfo adInfo, LevelPlayAdError it, C3826xa this$0) {
        Intrinsics.checkNotNullParameter(adInfo, "$adInfo");
        Intrinsics.checkNotNullParameter(it, "$it");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        IronLog.CALLBACK.info("LevelPlayBannerAdViewListener.onBannerAdDisplayFailed() adInfo " + adInfo + " error: " + it);
        LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = this$0.h;
        if (levelPlayBannerAdViewListener != null) {
            levelPlayBannerAdViewListener.onAdDisplayFailed(adInfo, it);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(LevelPlayAdInfo adInfo, C3826xa this$0) {
        Intrinsics.checkNotNullParameter(adInfo, "$adInfo");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        IronLog.CALLBACK.info("LevelPlayBannerAdViewListener.onBannerAdClicked() adInfo: " + adInfo);
        LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = this$0.h;
        if (levelPlayBannerAdViewListener != null) {
            levelPlayBannerAdViewListener.onAdClicked(adInfo);
        }
    }

    @Override // com.ironsource.InterfaceC3852z2
    public void a(final LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.e.e(new Runnable() { // from class: com.ironsource.strother
            @Override // java.lang.Runnable
            public final void run() {
                C3826xa.e(adInfo, this);
            }
        });
    }
}
