package com.p004ironsource;

import A.RunnableC0899k;
import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.applovin.impl.H0;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.p004ironsource.environment.ContextProvider;
import com.p004ironsource.mediationsdk.ISBannerSize;
import com.p004ironsource.mediationsdk.IronSource;
import com.p004ironsource.mediationsdk.logger.IronLog;
import com.p004ironsource.mediationsdk.model.Placement;
import com.p004ironsource.sdk.controller.f;
import com.p004ironsource.sdk.mediation.R;
import com.smartdigimkt.m3.h;
import com.smartdigimkt.q0.b;
import com.smartdigimkt.q8.i;
import com.smartdigimkt.y4.g;
import com.unity3d.mediation.LevelPlay;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.mediation.LevelPlayAdSize;
import com.unity3d.mediation.banner.LevelPlayBannerAdView;
import com.unity3d.mediation.banner.LevelPlayBannerAdViewListener;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 A2\u00020\u0001:\u0001\u0005B3\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0019\u0012\u0006\u0010\u001f\u001a\u00020\r\u0012\u0006\u0010\"\u001a\u00020 \u0012\u0006\u0010%\u001a\u00020#\u0012\b\b\u0002\u0010(\u001a\u00020&¢\u0006\u0004\b?\u0010@J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\u0006\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\b\u001a\u00020\u0006J\u0010\u0010\u0005\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tJ\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bJ\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rJ\u0006\u0010\u000f\u001a\u00020\u0006J\u0006\u0010\u0010\u001a\u00020\u0006J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0002H\u0016J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u001a\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016J\u0010\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0010\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0010\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0016R\u001a\u0010\u001c\u001a\u00020\u00198\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u0018\u0010\u001bR\u001a\u0010\u001f\u001a\u00020\r8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b\u0017\u0010\u001eR\u0014\u0010\"\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010!R\u0014\u0010%\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010$R\u0014\u0010(\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010'R\u0014\u0010,\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R$\u0010\f\u001a\u00020\u000b2\u0006\u0010-\u001a\u00020\u000b8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b\u0016\u00100R(\u00103\u001a\u0004\u0018\u00010\t2\b\u0010-\u001a\u0004\u0018\u00010\t8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0003\u00101\u001a\u0004\b*\u00102R$\u0010\u000e\u001a\u00020\r2\u0006\u0010-\u001a\u00020\r8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b.\u0010\u001eR\u0018\u00105\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u00104R\u0018\u00107\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u00106R\u0016\u0010;\u001a\u0002088\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010>\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=¨\u0006B"}, d2 = {"Lcom/ironsource/ml;", "Lcom/ironsource/w5;", "", h.f36614b, "Lcom/ironsource/v5;", "a", "", i.f37957c, "b", "Lcom/unity3d/mediation/banner/LevelPlayBannerAdViewListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/unity3d/mediation/LevelPlayAdSize;", d9.h.O, "", "placementName", "j", "k", "Lcom/unity3d/mediation/LevelPlayAdInfo;", "adInfo", "isReload", "Lcom/unity3d/mediation/LevelPlayAdError;", "error", "d", "e", "c", "Ljava/util/UUID;", "Ljava/util/UUID;", "()Ljava/util/UUID;", f.b.AD_ID, "Ljava/lang/String;", "()Ljava/lang/String;", "adUnitId", "Lcom/ironsource/w6;", "Lcom/ironsource/w6;", "bannerContainer", "Lcom/unity3d/mediation/banner/LevelPlayBannerAdView$Config;", "Lcom/unity3d/mediation/banner/LevelPlayBannerAdView$Config;", b.i0, "Lcom/ironsource/m1;", "Lcom/ironsource/m1;", "adTools", "Lcom/ironsource/ni;", com.smartdigimkt.h5.f.j, "Lcom/ironsource/ni;", "testSuiteLoadConfigService", "<set-?>", g.f40227p, "Lcom/unity3d/mediation/LevelPlayAdSize;", "()Lcom/unity3d/mediation/LevelPlayAdSize;", "Lcom/unity3d/mediation/banner/LevelPlayBannerAdViewListener;", "()Lcom/unity3d/mediation/banner/LevelPlayBannerAdViewListener;", "bannerListener", "Lcom/ironsource/v5;", "bannerAdController", "Ljava/lang/Boolean;", "isAutoRefreshEnabled", "Lcom/ironsource/mediationsdk/model/Placement;", "l", "Lcom/ironsource/mediationsdk/model/Placement;", "bannerPlacement", "m", "Z", "isLoadAdCalled", "<init>", "(Ljava/util/UUID;Ljava/lang/String;Lcom/ironsource/w6;Lcom/unity3d/mediation/banner/LevelPlayBannerAdView$Config;Lcom/ironsource/m1;)V", dc.q, "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class ml implements w5 {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final UUID adId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String adUnitId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final w6 bannerContainer;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final LevelPlayBannerAdView.Config config;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final m1 adTools;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final ni testSuiteLoadConfigService;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private LevelPlayAdSize adSize;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private LevelPlayBannerAdViewListener bannerListener;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private String placementName;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private v5 bannerAdController;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private Boolean isAutoRefreshEnabled;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private Placement bannerPlacement;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private boolean isLoadAdCalled;

    /* JADX INFO: renamed from: com.ironsource.ml$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ-\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/ironsource/ml$a;", "", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "Lkotlin/Pair;", "", "Lcom/unity3d/mediation/banner/LevelPlayBannerAdView$Config;", "a", "(Landroid/content/Context;Landroid/util/AttributeSet;)Lkotlin/Pair;", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        private Companion() {
        }

        public final Pair<String, LevelPlayBannerAdView.Config> a(Context context, AttributeSet attributeSet) {
            Intrinsics.f(context, "context");
            String str = "";
            if (attributeSet == null) {
                return new Pair<>("", LevelPlayBannerAdView.Config.INSTANCE.empty());
            }
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.LevelPlayBannerAdView);
            Intrinsics.e(typedArrayObtainStyledAttributes, "context.obtainStyledAttr…le.LevelPlayBannerAdView)");
            try {
                LevelPlayBannerAdView.Config.Builder builder = new LevelPlayBannerAdView.Config.Builder();
                if (typedArrayObtainStyledAttributes.hasValue(R.styleable.LevelPlayBannerAdView_bidFloor)) {
                    builder.setBidFloor(typedArrayObtainStyledAttributes.getFloat(R.styleable.LevelPlayBannerAdView_bidFloor, -1.0f));
                }
                String string = typedArrayObtainStyledAttributes.getString(R.styleable.LevelPlayBannerAdView_adSize);
                if (string != null) {
                    builder.setAdSize(LevelPlayAdSize.INSTANCE.createAdSize$mediationsdk_release(string));
                }
                String string2 = typedArrayObtainStyledAttributes.getString(R.styleable.LevelPlayBannerAdView_adUnitId);
                if (string2 != null) {
                    str = string2;
                }
                return new Pair<>(str, builder.build());
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public ml(UUID adId, String adUnitId, w6 bannerContainer, LevelPlayBannerAdView.Config config, m1 adTools) {
        Intrinsics.f(adId, "adId");
        Intrinsics.f(adUnitId, "adUnitId");
        Intrinsics.f(bannerContainer, "bannerContainer");
        Intrinsics.f(config, "config");
        Intrinsics.f(adTools, "adTools");
        this.adId = adId;
        this.adUnitId = adUnitId;
        this.bannerContainer = bannerContainer;
        this.config = config;
        this.adTools = adTools;
        this.testSuiteLoadConfigService = on.INSTANCE.d().o();
        LevelPlayAdSize adSize = config.getAdSize();
        this.adSize = adSize == null ? LevelPlayAdSize.BANNER : adSize;
        String placementName = config.getPlacementName();
        this.placementName = placementName == null ? "" : placementName;
        adTools.getEventSender().a(new C3372n(IronSource.AD_UNIT.BANNER, adId, adUnitId));
        Double bidFloor = config.getBidFloor();
        if (bidFloor != null) {
            adTools.getEventSender().getOperational().a(bidFloor.doubleValue());
        }
    }

    private final v5 a() {
        this.bannerPlacement = this.adTools.a(this.placementName);
        Context context = this.bannerContainer.getContext();
        if (context instanceof Activity) {
            ContextProvider.getInstance().updateActivity((Activity) context);
        }
        UUID uuid = this.adId;
        String str = this.adUnitId;
        Placement placement = this.bannerPlacement;
        if (placement == null) {
            Intrinsics.m("bannerPlacement");
            throw null;
        }
        j6 j6Var = new j6(uuid, str, placement, this.adSize, null, null, this.testSuiteLoadConfigService.getTestSuiteLoadAdConfigInternal(), this.config.getBidFloor(), 48, null);
        this.adTools.getEventSender().a(new a2(this.adTools, j6Var, null, 4, 0 == true ? 1 : 0));
        ISBannerSize iSBannerSizeA = this.adTools.a(j6Var.getAdSize());
        bc eventSender = this.adTools.getEventSender();
        m1 m1Var = this.adTools;
        Placement placement2 = this.bannerPlacement;
        if (placement2 != null) {
            eventSender.a(new y6(m1Var, iSBannerSizeA, placement2.getPlacementName()));
            return new v5(this, this.adTools, j6Var, this.bannerContainer);
        }
        Intrinsics.m("bannerPlacement");
        throw null;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final LevelPlayAdSize getAdSize() {
        return this.adSize;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getAdUnitId() {
        return this.adUnitId;
    }

    public /* synthetic */ ml(UUID uuid, String str, w6 w6Var, LevelPlayBannerAdView.Config config, m1 m1Var, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? tf.f27296a.a() : uuid, str, w6Var, config, (i2 & 16) != 0 ? new m1(IronSource.AD_UNIT.BANNER, c2.b.MEDIATION) : m1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(ml this$0) {
        Intrinsics.f(this$0, "this$0");
        if (!this$0.isLoadAdCalled) {
            IronLog.INTERNAL.warning(m1.a(this$0.adTools, "Banner not loaded", (String) null, 2, (Object) null));
            return;
        }
        if (this$0.bannerAdController == null) {
            IronLog.INTERNAL.warning(m1.a(this$0.adTools, "Banner already destroyed", (String) null, 2, (Object) null));
            return;
        }
        xm.a(this$0.adTools, new U(this$0, 4), 0L, 2, (Object) null);
        v5 v5Var = this$0.bannerAdController;
        if (v5Var != null) {
            v5Var.g();
        }
        this$0.bannerAdController = null;
        this$0.isAutoRefreshEnabled = null;
        this$0.bannerListener = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(ml this$0) {
        Intrinsics.f(this$0, "this$0");
        this$0.adTools.getEventSender().getOperational().b();
        v5 v5Var = this$0.bannerAdController;
        if (v5Var != null) {
            v5Var.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(ml this$0) {
        Intrinsics.f(this$0, "this$0");
        this$0.adTools.getEventSender().getOperational().c();
        v5 v5Var = this$0.bannerAdController;
        if (v5Var != null) {
            v5Var.e();
        }
    }

    private final boolean h() {
        LevelPlayAdError levelPlayAdError;
        if (this.adUnitId.length() == 0) {
            String string = this.adId.toString();
            Intrinsics.e(string, "adId.toString()");
            levelPlayAdError = new LevelPlayAdError(string, this.adUnitId, LevelPlayAdError.ERROR_CODE_NO_AD_UNIT_ID_SPECIFIED, "Ad unit ID should be specified");
        } else {
            if (this.adTools.g()) {
                fm fmVarA = on.INSTANCE.d().t().a();
                if (fmVarA != null && fmVarA.a(this.adUnitId, LevelPlay.AdFormat.BANNER)) {
                    return true;
                }
                LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = this.bannerListener;
                if (levelPlayBannerAdViewListener != null) {
                    String string2 = this.adId.toString();
                    Intrinsics.e(string2, "adId.toString()");
                    levelPlayBannerAdViewListener.onAdLoadFailed(new LevelPlayAdError(string2, this.adUnitId, LevelPlayAdError.ERROR_CODE_INVALID_AD_UNIT_ID, "Invalid ad unit id"));
                }
                return false;
            }
            String string3 = this.adId.toString();
            Intrinsics.e(string3, "adId.toString()");
            levelPlayAdError = new LevelPlayAdError(string3, this.adUnitId, LevelPlayAdError.ERROR_CODE_LOAD_BEFORE_INIT_SUCCESS_CALLBACK, "load must be called after init success callback");
        }
        a(levelPlayAdError);
        return false;
    }

    public final void b() {
        IronLog.API.info("LevelPlayBannerAdView.destroyBanner()");
        this.adTools.d(new U(this, 1));
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final UUID getAdId() {
        return this.adId;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final LevelPlayBannerAdViewListener getBannerListener() {
        return this.bannerListener;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getPlacementName() {
        return this.placementName;
    }

    public final void i() {
        IronLog.API.info("LevelPlayBannerAdView.loadAd()");
        this.adTools.d(new U(this, 2));
    }

    public final void j() {
        Unit unit;
        IronLog.API.info("LevelPlayBannerAdView.pauseAutoRefresh()");
        if (this.bannerAdController != null) {
            this.adTools.d(new U(this, 0));
            unit = Unit.f43263a;
        } else {
            unit = null;
        }
        if (unit == null) {
            this.isAutoRefreshEnabled = Boolean.FALSE;
        }
    }

    public final void k() {
        Unit unit;
        IronLog.API.info("LevelPlayBannerAdView.resumeAutoRefresh()");
        if (this.bannerAdController != null) {
            this.adTools.d(new U(this, 3));
            unit = Unit.f43263a;
        } else {
            unit = null;
        }
        if (unit == null) {
            this.isAutoRefreshEnabled = Boolean.TRUE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(ml this$0, LevelPlayAdSize adSize) {
        Intrinsics.f(this$0, "this$0");
        Intrinsics.f(adSize, "$adSize");
        if (this$0.isLoadAdCalled) {
            return;
        }
        this$0.adSize = adSize;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(ml this$0) {
        Intrinsics.f(this$0, "this$0");
        this$0.bannerContainer.removeAllViews();
        ViewParent parent = this$0.bannerContainer.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(this$0.bannerContainer);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(ml this$0) {
        Intrinsics.f(this$0, "this$0");
        if (this$0.isLoadAdCalled) {
            IronLog.INTERNAL.warning(m1.a(this$0.adTools, "Banner load already called", (String) null, 2, (Object) null));
            return;
        }
        this$0.isLoadAdCalled = true;
        if (this$0.h()) {
            v5 v5VarA = this$0.a();
            Boolean bool = this$0.isAutoRefreshEnabled;
            if (bool != null) {
                if (bool.booleanValue()) {
                    v5VarA.e();
                } else {
                    v5VarA.c();
                }
            }
            v5VarA.f();
            this$0.bannerAdController = v5VarA;
        }
    }

    @Override // com.p004ironsource.w5
    public void d(LevelPlayAdInfo adInfo) {
        Intrinsics.f(adInfo, "adInfo");
        this.adTools.e(new V(adInfo, this, 4));
    }

    @Override // com.p004ironsource.w5
    public void e(LevelPlayAdInfo adInfo) {
        Intrinsics.f(adInfo, "adInfo");
        this.adTools.e(new V(adInfo, this, 3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(ml this$0, LevelPlayBannerAdViewListener levelPlayBannerAdViewListener) {
        Intrinsics.f(this$0, "this$0");
        this$0.bannerListener = levelPlayBannerAdViewListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(LevelPlayAdInfo adInfo, ml this$0) {
        Intrinsics.f(adInfo, "$adInfo");
        Intrinsics.f(this$0, "this$0");
        IronLog.CALLBACK.info("LevelPlayBannerAdViewListener.onBannerAdScreenDismissed() adInfo: " + adInfo);
        LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = this$0.bannerListener;
        if (levelPlayBannerAdViewListener != null) {
            levelPlayBannerAdViewListener.onAdCollapsed(adInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(LevelPlayAdInfo adInfo, ml this$0) {
        Intrinsics.f(adInfo, "$adInfo");
        Intrinsics.f(this$0, "this$0");
        IronLog.CALLBACK.info("LevelPlayBannerAdViewListener.onBannerAdScreenPresented() adInfo: " + adInfo);
        LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = this$0.bannerListener;
        if (levelPlayBannerAdViewListener != null) {
            levelPlayBannerAdViewListener.onAdExpanded(adInfo);
        }
    }

    @Override // com.p004ironsource.w5
    public void b(LevelPlayAdInfo adInfo) {
        Intrinsics.f(adInfo, "adInfo");
        this.adTools.e(new V(adInfo, this, 2));
    }

    @Override // com.p004ironsource.w5
    public void c(LevelPlayAdInfo adInfo) {
        Intrinsics.f(adInfo, "adInfo");
        this.adTools.e(new V(adInfo, this, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(ml this$0, String placementName) {
        Intrinsics.f(this$0, "this$0");
        Intrinsics.f(placementName, "$placementName");
        if (this$0.isLoadAdCalled) {
            return;
        }
        this$0.placementName = placementName;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(LevelPlayAdInfo adInfo, ml this$0) {
        Intrinsics.f(adInfo, "$adInfo");
        Intrinsics.f(this$0, "this$0");
        IronLog.CALLBACK.info("LevelPlayBannerAdViewListener.onBannerAdDisplayed() adInfo: " + adInfo);
        LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = this$0.bannerListener;
        if (levelPlayBannerAdViewListener != null) {
            levelPlayBannerAdViewListener.onAdDisplayed(adInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(LevelPlayAdInfo adInfo, ml this$0) {
        Intrinsics.f(adInfo, "$adInfo");
        Intrinsics.f(this$0, "this$0");
        IronLog.CALLBACK.info("LevelPlayBannerAdViewListener.onBannerAdLeftApplication() adInfo: " + adInfo);
        LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = this$0.bannerListener;
        if (levelPlayBannerAdViewListener != null) {
            levelPlayBannerAdViewListener.onAdLeftApplication(adInfo);
        }
    }

    @Override // com.p004ironsource.w5
    public void a(LevelPlayAdError error) {
        if (error != null) {
            this.adTools.e(new G0(16, error, this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(LevelPlayAdError it, ml this$0) {
        Intrinsics.f(it, "$it");
        Intrinsics.f(this$0, "this$0");
        IronLog.CALLBACK.info("LevelPlayBannerAdViewListener.onBannerAdLoadFailed() error: " + it);
        LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = this$0.bannerListener;
        if (levelPlayBannerAdViewListener != null) {
            levelPlayBannerAdViewListener.onAdLoadFailed(it);
        }
    }

    @Override // com.p004ironsource.w5
    public void a(LevelPlayAdInfo adInfo) {
        Intrinsics.f(adInfo, "adInfo");
        this.adTools.e(new V(adInfo, this, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(LevelPlayAdInfo adInfo, ml this$0) {
        Intrinsics.f(adInfo, "$adInfo");
        Intrinsics.f(this$0, "this$0");
        IronLog.CALLBACK.info("LevelPlayBannerAdViewListener.onBannerAdClicked() adInfo: " + adInfo);
        LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = this$0.bannerListener;
        if (levelPlayBannerAdViewListener != null) {
            levelPlayBannerAdViewListener.onAdClicked(adInfo);
        }
    }

    @Override // com.p004ironsource.w5
    public void a(LevelPlayAdInfo adInfo, LevelPlayAdError error) {
        Intrinsics.f(adInfo, "adInfo");
        if (error != null) {
            this.adTools.e(new H0(adInfo, error, this, 19));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(LevelPlayAdInfo adInfo, LevelPlayAdError it, ml this$0) {
        Intrinsics.f(adInfo, "$adInfo");
        Intrinsics.f(it, "$it");
        Intrinsics.f(this$0, "this$0");
        IronLog.CALLBACK.info("LevelPlayBannerAdViewListener.onBannerAdDisplayFailed() adInfo " + adInfo + " error: " + it);
        LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = this$0.bannerListener;
        if (levelPlayBannerAdViewListener != null) {
            levelPlayBannerAdViewListener.onAdDisplayFailed(adInfo, it);
        }
    }

    @Override // com.p004ironsource.w5
    public void a(LevelPlayAdInfo adInfo, boolean isReload) {
        Intrinsics.f(adInfo, "adInfo");
        this.adTools.e(new RunnableC0899k(isReload, adInfo, this, 6));
    }

    public final void a(LevelPlayAdSize adSize) {
        Intrinsics.f(adSize, "adSize");
        IronLog.API.info("LevelPlayBannerAdView.setBannerAdSize() adSize: " + adSize);
        this.adTools.d(new G0(19, this, adSize));
    }

    public final void a(LevelPlayBannerAdViewListener listener) {
        IronLog.API.info("LevelPlayBannerAdView.setBannerListener()");
        this.adTools.d(new G0(17, this, listener));
    }

    public final void a(String placementName) {
        Intrinsics.f(placementName, "placementName");
        IronLog.API.info("LevelPlayBannerAdView.setPlacementName() placementName: ".concat(placementName));
        this.adTools.d(new G0(18, this, placementName));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(boolean z2, LevelPlayAdInfo adInfo, ml this$0) {
        Intrinsics.f(adInfo, "$adInfo");
        Intrinsics.f(this$0, "this$0");
        IronLog.CALLBACK.info("LevelPlayBannerAdViewListener.onBannerAdLoaded() isReload: " + z2 + " adInfo: " + adInfo);
        LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = this$0.bannerListener;
        if (levelPlayBannerAdViewListener != null) {
            levelPlayBannerAdViewListener.onAdLoaded(adInfo);
        }
    }
}
