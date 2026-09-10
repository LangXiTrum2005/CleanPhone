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

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class Aa implements InterfaceC0687z2 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final a f25626n = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final UUID f25627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f25628b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final W2 f25629c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final LevelPlayBannerAdView.Config f25630d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C0506p0 f25631e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final R8 f25632f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final LevelPlayAdSize f25633g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private LevelPlayBannerAdViewListener f25634h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f25635i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private C0659xa f25636j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Boolean f25637k;
    private C0358gd l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f25638m;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final wj.f a(Context context, AttributeSet attributeSet) {
            kotlin.jvm.internal.n.f(context, "context");
            String str = "";
            if (attributeSet == null) {
                return new wj.f("", LevelPlayBannerAdView.Config.Companion.empty());
            }
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.LevelPlayBannerAdView);
            kotlin.jvm.internal.n.e(typedArrayObtainStyledAttributes, "context.obtainStyledAttr…le.LevelPlayBannerAdView)");
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
                return new wj.f(str, builder.build());
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        }

        private a() {
        }
    }

    public Aa(UUID adId, String adUnitId, W2 bannerContainer, LevelPlayBannerAdView.Config config, C0506p0 adTools) {
        kotlin.jvm.internal.n.f(adId, "adId");
        kotlin.jvm.internal.n.f(adUnitId, "adUnitId");
        kotlin.jvm.internal.n.f(bannerContainer, "bannerContainer");
        kotlin.jvm.internal.n.f(config, "config");
        kotlin.jvm.internal.n.f(adTools, "adTools");
        this.f25627a = adId;
        this.f25628b = adUnitId;
        this.f25629c = bannerContainer;
        this.f25630d = config;
        this.f25631e = adTools;
        this.f25632f = Kb.f26413u.d().A();
        LevelPlayAdSize adSize = config.getAdSize();
        this.f25633g = adSize == null ? LevelPlayAdSize.BANNER : adSize;
        String placementName = config.getPlacementName();
        this.f25635i = placementName == null ? "" : placementName;
        adTools.d().a(new C0469n(IronSource.a.BANNER, adId, adUnitId));
        Double bidFloor = config.getBidFloor();
        if (bidFloor != null) {
            adTools.d().f().a(bidFloor.doubleValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Aa this$0) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        if (!this$0.f25638m) {
            IronLog.INTERNAL.warning(C0506p0.a(this$0.f25631e, "Banner not loaded", (String) null, 2, (Object) null));
            return;
        }
        if (this$0.f25636j == null) {
            IronLog.INTERNAL.warning(C0506p0.a(this$0.f25631e, "Banner already destroyed", (String) null, 2, (Object) null));
            return;
        }
        C0624vb.a(this$0.f25631e, new kh(this$0, 0), 0L, 2, null);
        C0659xa c0659xa = this$0.f25636j;
        if (c0659xa != null) {
            c0659xa.c();
        }
        this$0.f25636j = null;
        this$0.f25637k = null;
        this$0.f25634h = null;
    }

    public final void b() {
        IronLog.API.info("LevelPlayBannerAdView.destroyBanner()");
        this.f25631e.c(new kh(this, 1));
    }

    public final String e() {
        return this.f25628b;
    }

    private final boolean h() {
        if (this.f25628b.length() == 0) {
            String string = this.f25627a.toString();
            kotlin.jvm.internal.n.e(string, "adId.toString()");
            a(new LevelPlayAdError(string, this.f25628b, LevelPlayAdError.ERROR_CODE_NO_AD_UNIT_ID_SPECIFIED, "Ad unit ID should be specified"));
            return false;
        }
        Va vaA = Kb.f26413u.d().f().a();
        if (vaA != null && vaA.a(this.f25628b, LevelPlay.AdFormat.BANNER)) {
            return true;
        }
        LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = this.f25634h;
        if (levelPlayBannerAdViewListener != null) {
            String string2 = this.f25627a.toString();
            kotlin.jvm.internal.n.e(string2, "adId.toString()");
            levelPlayBannerAdViewListener.onAdLoadFailed(new LevelPlayAdError(string2, this.f25628b, LevelPlayAdError.ERROR_CODE_INVALID_AD_UNIT_ID, "Invalid ad unit id"));
        }
        return false;
    }

    public final UUID c() {
        return this.f25627a;
    }

    public final LevelPlayAdSize d() {
        return this.f25633g;
    }

    @Override // com.ironsource.InterfaceC0687z2
    public void e(LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.n.f(adInfo, "adInfo");
        this.f25631e.d(new jh(adInfo, this, 4));
    }

    public final LevelPlayBannerAdViewListener f() {
        return this.f25634h;
    }

    public final String g() {
        return this.f25635i;
    }

    public final void i() {
        IronLog.API.info("LevelPlayBannerAdView.loadAd()");
        if (this.f25631e.f()) {
            this.f25631e.c(new kh(this, 2));
            return;
        }
        String string = this.f25627a.toString();
        kotlin.jvm.internal.n.e(string, "adId.toString()");
        a(new LevelPlayAdError(string, this.f25628b, LevelPlayAdError.ERROR_CODE_LOAD_BEFORE_INIT_SUCCESS_CALLBACK, "load must be called after init success callback"));
    }

    public final void j() {
        wj.r rVar;
        IronLog.API.info("LevelPlayBannerAdView.pauseAutoRefresh()");
        C0659xa c0659xa = this.f25636j;
        if (c0659xa != null) {
            this.f25631e.c(new ih(this, c0659xa, 0));
            rVar = wj.r.f53297a;
        } else {
            rVar = null;
        }
        if (rVar == null) {
            this.f25637k = Boolean.FALSE;
        }
    }

    public final void k() {
        wj.r rVar;
        IronLog.API.info("LevelPlayBannerAdView.resumeAutoRefresh()");
        C0659xa c0659xa = this.f25636j;
        if (c0659xa != null) {
            this.f25631e.c(new ih(this, c0659xa, 1));
            rVar = wj.r.f53297a;
        } else {
            rVar = null;
        }
        if (rVar == null) {
            this.f25637k = Boolean.TRUE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Aa this$0) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        this$0.f25629c.removeAllViews();
        ViewParent parent = this$0.f25629c.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(this$0.f25629c);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(Aa this$0) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        if (this$0.f25638m) {
            IronLog.INTERNAL.warning(C0506p0.a(this$0.f25631e, "Banner load already called", (String) null, 2, (Object) null));
            return;
        }
        this$0.f25638m = true;
        if (this$0.h()) {
            C0659xa c0659xaA = this$0.a();
            this$0.f25636j = c0659xaA;
            Boolean bool = this$0.f25637k;
            if (bool != null) {
                if (bool.booleanValue()) {
                    c0659xaA.f();
                } else {
                    c0659xaA.d();
                }
            }
            c0659xaA.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(LevelPlayAdInfo adInfo, Aa this$0) {
        kotlin.jvm.internal.n.f(adInfo, "$adInfo");
        kotlin.jvm.internal.n.f(this$0, "this$0");
        IronLog.CALLBACK.info("LevelPlayBannerAdViewListener.onBannerAdScreenPresented() adInfo: " + adInfo);
        LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = this$0.f25634h;
        if (levelPlayBannerAdViewListener != null) {
            levelPlayBannerAdViewListener.onAdExpanded(adInfo);
        }
    }

    @Override // com.ironsource.InterfaceC0687z2
    public void d(LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.n.f(adInfo, "adInfo");
        this.f25631e.d(new jh(adInfo, this, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(LevelPlayAdInfo adInfo, Aa this$0) {
        kotlin.jvm.internal.n.f(adInfo, "$adInfo");
        kotlin.jvm.internal.n.f(this$0, "this$0");
        IronLog.CALLBACK.info("LevelPlayBannerAdViewListener.onBannerAdScreenDismissed() adInfo: " + adInfo);
        LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = this$0.f25634h;
        if (levelPlayBannerAdViewListener != null) {
            levelPlayBannerAdViewListener.onAdCollapsed(adInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Aa this$0, C0659xa it) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        kotlin.jvm.internal.n.f(it, "$it");
        this$0.f25631e.d().f().c();
        it.f();
    }

    @Override // com.ironsource.InterfaceC0687z2
    public void b(LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.n.f(adInfo, "adInfo");
        this.f25631e.d(new jh(adInfo, this, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(LevelPlayAdInfo adInfo, Aa this$0) {
        kotlin.jvm.internal.n.f(adInfo, "$adInfo");
        kotlin.jvm.internal.n.f(this$0, "this$0");
        IronLog.CALLBACK.info("LevelPlayBannerAdViewListener.onBannerAdDisplayed() adInfo: " + adInfo);
        LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = this$0.f25634h;
        if (levelPlayBannerAdViewListener != null) {
            levelPlayBannerAdViewListener.onAdDisplayed(adInfo);
        }
    }

    public final void a(LevelPlayBannerAdViewListener levelPlayBannerAdViewListener) {
        IronLog.API.info("LevelPlayBannerAdView.setBannerListener()");
        this.f25631e.c(new ki(5, this, levelPlayBannerAdViewListener));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Aa this$0, LevelPlayBannerAdViewListener levelPlayBannerAdViewListener) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        this$0.f25634h = levelPlayBannerAdViewListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(LevelPlayAdInfo adInfo, Aa this$0) {
        kotlin.jvm.internal.n.f(adInfo, "$adInfo");
        kotlin.jvm.internal.n.f(this$0, "this$0");
        IronLog.CALLBACK.info("LevelPlayBannerAdViewListener.onBannerAdLeftApplication() adInfo: " + adInfo);
        LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = this$0.f25634h;
        if (levelPlayBannerAdViewListener != null) {
            levelPlayBannerAdViewListener.onAdLeftApplication(adInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Aa this$0, C0659xa it) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        kotlin.jvm.internal.n.f(it, "$it");
        this$0.f25631e.d().f().b();
        it.d();
    }

    public /* synthetic */ Aa(UUID uuid, String str, W2 w3, LevelPlayBannerAdView.Config config, C0506p0 c0506p0, int i10, kotlin.jvm.internal.g gVar) {
        this((i10 & 1) != 0 ? C0638w7.f30930a.a() : uuid, str, w3, config, (i10 & 16) != 0 ? new C0506p0(IronSource.a.BANNER, F0.b.MEDIATION) : c0506p0);
    }

    private final C0659xa a() {
        this.l = this.f25631e.a(this.f25635i);
        Context context = this.f25629c.getContext();
        if (context instanceof Activity) {
            ContextProvider.getInstance().updateActivity((Activity) context);
        }
        UUID uuid = this.f25627a;
        String str = this.f25628b;
        C0358gd c0358gd = this.l;
        if (c0358gd != null) {
            J2 j10 = new J2(uuid, str, c0358gd, this.f25633g, null, null, this.f25632f.a(), this.f25630d.getBidFloor(), 48, null);
            this.f25631e.d().a(new D0(this.f25631e, j10, null, 4, 0 == true ? 1 : 0));
            ISBannerSize iSBannerSizeA = this.f25631e.a(j10.i());
            C0690z5 c0690z5D = this.f25631e.d();
            C0506p0 c0506p0 = this.f25631e;
            C0358gd c0358gd2 = this.l;
            if (c0358gd2 != null) {
                c0690z5D.a(new Y2(c0506p0, iSBannerSizeA, c0358gd2.c()));
                return new C0659xa(this, this.f25631e, j10, this.f25629c);
            }
            kotlin.jvm.internal.n.l("bannerPlacement");
            throw null;
        }
        kotlin.jvm.internal.n.l("bannerPlacement");
        throw null;
    }

    @Override // com.ironsource.InterfaceC0687z2
    public void c(LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.n.f(adInfo, "adInfo");
        this.f25631e.d(new jh(adInfo, this, 1));
    }

    @Override // com.ironsource.InterfaceC0687z2
    public void a(LevelPlayAdInfo adInfo, boolean z10) {
        kotlin.jvm.internal.n.f(adInfo, "adInfo");
        this.f25631e.d(new cj.i(z10, adInfo, this, 4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(boolean z10, LevelPlayAdInfo adInfo, Aa this$0) {
        kotlin.jvm.internal.n.f(adInfo, "$adInfo");
        kotlin.jvm.internal.n.f(this$0, "this$0");
        IronLog.CALLBACK.info("LevelPlayBannerAdViewListener.onBannerAdLoaded() isReload: " + z10 + " adInfo: " + adInfo);
        LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = this$0.f25634h;
        if (levelPlayBannerAdViewListener != null) {
            levelPlayBannerAdViewListener.onAdLoaded(adInfo);
        }
    }

    @Override // com.ironsource.InterfaceC0687z2
    public void a(LevelPlayAdError levelPlayAdError) {
        if (levelPlayAdError != null) {
            this.f25631e.d(new ki(4, levelPlayAdError, this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(LevelPlayAdError it, Aa this$0) {
        kotlin.jvm.internal.n.f(it, "$it");
        kotlin.jvm.internal.n.f(this$0, "this$0");
        IronLog.CALLBACK.info("LevelPlayBannerAdViewListener.onBannerAdLoadFailed() error: " + it);
        LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = this$0.f25634h;
        if (levelPlayBannerAdViewListener != null) {
            levelPlayBannerAdViewListener.onAdLoadFailed(it);
        }
    }

    @Override // com.ironsource.InterfaceC0687z2
    public void a(LevelPlayAdInfo adInfo, LevelPlayAdError levelPlayAdError) {
        kotlin.jvm.internal.n.f(adInfo, "adInfo");
        if (levelPlayAdError != null) {
            this.f25631e.d(new androidx.fragment.app.d(adInfo, levelPlayAdError, this, 29));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(LevelPlayAdInfo adInfo, LevelPlayAdError it, Aa this$0) {
        kotlin.jvm.internal.n.f(adInfo, "$adInfo");
        kotlin.jvm.internal.n.f(it, "$it");
        kotlin.jvm.internal.n.f(this$0, "this$0");
        IronLog.CALLBACK.info("LevelPlayBannerAdViewListener.onBannerAdDisplayFailed() adInfo " + adInfo + " error: " + it);
        LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = this$0.f25634h;
        if (levelPlayBannerAdViewListener != null) {
            levelPlayBannerAdViewListener.onAdDisplayFailed(adInfo, it);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(LevelPlayAdInfo adInfo, Aa this$0) {
        kotlin.jvm.internal.n.f(adInfo, "$adInfo");
        kotlin.jvm.internal.n.f(this$0, "this$0");
        IronLog.CALLBACK.info("LevelPlayBannerAdViewListener.onBannerAdClicked() adInfo: " + adInfo);
        LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = this$0.f25634h;
        if (levelPlayBannerAdViewListener != null) {
            levelPlayBannerAdViewListener.onAdClicked(adInfo);
        }
    }

    @Override // com.ironsource.InterfaceC0687z2
    public void a(LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.n.f(adInfo, "adInfo");
        this.f25631e.d(new jh(adInfo, this, 3));
    }
}
