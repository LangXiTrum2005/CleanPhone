package com.startapp.sdk.adsbase;

import A.RunnableC0914v;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.applovin.shadow.okio.Segment;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.ads.admanager.AdManagerInterstitialAd;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import com.startapp.sdk.ads.external.config.AdUnitConfig;
import com.startapp.sdk.ads.external.config.ExternalAdConfig;
import com.startapp.sdk.ads.splash.SplashConfig;
import com.startapp.sdk.ads.splash.SplashHideListener;
import com.startapp.sdk.adsbase.adlisteners.AdDisplayListener;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason;
import com.startapp.sdk.adsbase.adrules.AdRulesResult;
import com.startapp.sdk.adsbase.cache.CacheKey;
import com.startapp.sdk.adsbase.model.AdDetails;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.internal.a0;
import com.startapp.sdk.internal.b2;
import com.startapp.sdk.internal.ca;
import com.startapp.sdk.internal.da;
import com.startapp.sdk.internal.e7;
import com.startapp.sdk.internal.g6;
import com.startapp.sdk.internal.g7;
import com.startapp.sdk.internal.g9;
import com.startapp.sdk.internal.gb;
import com.startapp.sdk.internal.h0;
import com.startapp.sdk.internal.h7;
import com.startapp.sdk.internal.ih;
import com.startapp.sdk.internal.ii;
import com.startapp.sdk.internal.jh;
import com.startapp.sdk.internal.k0;
import com.startapp.sdk.internal.l7;
import com.startapp.sdk.internal.lb;
import com.startapp.sdk.internal.m7;
import com.startapp.sdk.internal.ma;
import com.startapp.sdk.internal.n7;
import com.startapp.sdk.internal.o8;
import com.startapp.sdk.internal.p;
import com.startapp.sdk.internal.p7;
import com.startapp.sdk.internal.s;
import com.startapp.sdk.internal.sf;
import com.startapp.sdk.internal.t;
import com.startapp.sdk.internal.uf;
import com.startapp.sdk.internal.vf;
import com.startapp.sdk.internal.vi;
import com.startapp.sdk.internal.x0;
import com.startapp.sdk.internal.y;
import com.startapp.sdk.internal.y6;
import com.startapp.sdk.internal.z6;
import com.startapp.sdk.internal.zb;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class StartAppAd extends Ad {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final lb f40583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final lb f40584b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final lb f40585c;
    private CacheKey d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private f f40586e;
    private h7 f;
    private AdMode g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private AdPreferences f40587h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    com.startapp.sdk.adsbase.adlisteners.VideoListener f40588i;
    AdDisplayListener j;
    private final h k;

    public enum AdMode {
        AUTOMATIC,
        FULLPAGE,
        OFFERWALL,
        REWARDED_VIDEO,
        VIDEO,
        OVERLAY
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public StartAppAd(Context context) {
        lb lbVar = com.startapp.sdk.components.a.a(context).K;
        lb lbVar2 = com.startapp.sdk.components.a.a(context).j;
        lb lbVar3 = com.startapp.sdk.components.a.a(context).M;
        lb lbVar4 = com.startapp.sdk.components.a.a(context).f40730N;
        lb lbVar5 = com.startapp.sdk.components.a.a(context).f40735b;
        lb lbVar6 = com.startapp.sdk.components.a.a(context).f40741n;
        lb lbVar7 = com.startapp.sdk.components.a.a(context).f40724A;
        lb lbVar8 = com.startapp.sdk.components.a.a(context).f40744w;
        lb lbVar9 = com.startapp.sdk.components.a.a(context).f40736c;
        lb lbVar10 = com.startapp.sdk.components.a.a(context).f40734a;
        lb lbVar11 = com.startapp.sdk.components.a.a(context).G;
        lb lbVar12 = com.startapp.sdk.components.a.a(context).f40743u;
        super(context, null, lbVar, lbVar2, lbVar3, lbVar4, lbVar5, lbVar6, lbVar7, lbVar8, lbVar9);
        this.d = null;
        this.g = AdMode.AUTOMATIC;
        this.f40587h = null;
        this.f40588i = null;
        this.j = null;
        this.k = new h(this);
        this.f40583a = lbVar10;
        this.f40584b = lbVar11;
        this.f40585c = lbVar12;
        try {
            ((sf) lbVar12.a()).a(Segment.SIZE);
        } catch (Throwable unused) {
        }
    }

    public static void disableAutoInterstitial() {
        ma.f41248a.f40655a = false;
    }

    @Deprecated
    public static void disableSplash() {
    }

    public static void enableAutoInterstitial() {
        ma.f41248a.f40655a = true;
    }

    @Deprecated
    public static void enableConsent(Context context, boolean z2) {
        StartAppSDK.enableConsent(context, z2);
    }

    @Deprecated
    public static void init(Context context, String str, String str2) {
        StartAppSDK.init(context, str, str2);
    }

    public static void setAutoInterstitialPreferences(AutoInterstitialPreferences autoInterstitialPreferences) {
        e eVar = ma.f41248a;
        eVar.f40656b = autoInterstitialPreferences;
        eVar.f40657c = -1L;
        eVar.d = -1;
    }

    public static void setCommonAdsPreferences(Context context, SDKAdPreferences sDKAdPreferences) {
        Context contextA = x0.a(context);
        if (contextA != null) {
            ih.f41097a.f41152a = sDKAdPreferences;
            g7.b(contextA, "shared_prefs_sdk_ad_prefs", sDKAdPreferences);
        }
    }

    public static void setReturnAdsPreferences(AdPreferences adPreferences) {
    }

    @Deprecated
    public static void showSplash(Activity activity, Bundle bundle) {
    }

    @Deprecated
    public void close() {
        zb.a(this.context).a(this.k);
        zb.a(this.context).a(new Intent("com.startapp.android.CloseAdActivity"));
    }

    @Override // com.startapp.sdk.adsbase.Ad
    public final /* bridge */ /* synthetic */ b2 createService(AdPreferences adPreferences, AdEventListener adEventListener, String str) {
        return null;
    }

    @Override // com.startapp.sdk.adsbase.Ad
    public final String getAdId() {
        Object objA = ((p) this.adCacheManager.a()).a(this.d);
        if (objA instanceof o8) {
            return vi.a(((o8) objA).a(), "@adId@", "@adId@");
        }
        return null;
    }

    @Override // com.startapp.sdk.adsbase.Ad
    public final AdPreferences.Placement getPlacement() {
        AdPreferences.Placement placement = super.getPlacement();
        return (placement != null || this.d == null || ((p) this.adCacheManager.a()).a(this.d) == null) ? placement : ((Ad) ((p) this.adCacheManager.a()).a(this.d)).getPlacement();
    }

    @Override // com.startapp.sdk.adsbase.Ad
    public final Ad.AdState getState() {
        f fVarA = ((p) this.adCacheManager.a()).a(this.d);
        return fVarA != null ? fVarA.getState() : Ad.AdState.UN_INITIALIZED;
    }

    @Override // com.startapp.sdk.adsbase.Ad
    public final boolean isBelowMinCPM() {
        f fVarA = ((p) this.adCacheManager.a()).a(this.d);
        if (fVarA != null) {
            return fVarA.isBelowMinCPM();
        }
        return false;
    }

    @Override // com.startapp.sdk.adsbase.Ad
    @Deprecated
    public boolean isReady() {
        f fVarA = ((p) this.adCacheManager.a()).a(this.d);
        if (fVarA != null) {
            return fVarA.isReady();
        }
        return false;
    }

    @Override // com.startapp.sdk.adsbase.Ad
    @Deprecated
    public void load(AdPreferences adPreferences, AdEventListener adEventListener) {
        load(adPreferences, adEventListener, null);
    }

    public void loadAd() {
        loadAd(AdMode.AUTOMATIC, new AdPreferences(), (AdEventListener) null);
    }

    @Deprecated
    public void onBackPressed() {
        showAd("exit_ad");
        jh jhVar = ih.f41097a;
        jhVar.f41154c = false;
        jhVar.f41155e = true;
    }

    @Deprecated
    public void onPause() {
    }

    @Deprecated
    public void onRestoreInstanceState(Bundle bundle) {
        int i2 = bundle.getInt("AdMode");
        this.g = AdMode.AUTOMATIC;
        if (i2 == 1) {
            this.g = AdMode.FULLPAGE;
        } else if (i2 == 2) {
            this.g = AdMode.OFFERWALL;
        } else if (i2 == 3) {
            this.g = AdMode.OVERLAY;
        } else if (i2 == 4) {
            this.g = AdMode.REWARDED_VIDEO;
        } else if (i2 == 5) {
            this.g = AdMode.VIDEO;
        }
        Serializable serializable = bundle.getSerializable("AdPrefs");
        if (serializable != null) {
            this.f40587h = (AdPreferences) serializable;
        }
    }

    @Deprecated
    public void onResume() {
        if (isReady()) {
            return;
        }
        loadAd();
    }

    @Deprecated
    public void onSaveInstanceState(Bundle bundle) {
        int i2 = m.f40678a[this.g.ordinal()];
        int i3 = 1;
        if (i2 != 1) {
            i3 = 2;
            if (i2 != 2) {
                i3 = 3;
                if (i2 != 3) {
                    i3 = 4;
                    if (i2 != 4) {
                        i3 = 0;
                    }
                }
            }
        }
        AdPreferences adPreferences = this.f40587h;
        if (adPreferences != null) {
            bundle.putSerializable("AdPrefs", adPreferences);
        }
        bundle.putInt("AdMode", i3);
    }

    public void setVideoListener(com.startapp.sdk.adsbase.adlisteners.VideoListener videoListener) {
        this.f40588i = videoListener;
    }

    public boolean showAd() {
        return showAd(null, null);
    }

    @Deprecated
    public static void showSplash(Activity activity, Bundle bundle, SplashConfig splashConfig) {
    }

    @Override // com.startapp.sdk.adsbase.Ad
    @Deprecated
    public void load(AdPreferences adPreferences, AdEventListener adEventListener, String str) {
        String name;
        if (!canShowAd()) {
            if (adEventListener != null) {
                setErrorMessage("serving ads disabled");
                a0.a(this.context, adEventListener, this, false);
                return;
            }
            return;
        }
        if (adPreferences == null) {
            adPreferences = new AdPreferences();
        }
        if (adPreferences.getPlacementId() == null) {
            Context baseContext = this.context;
            String packageName = baseContext.getPackageName();
            String name2 = getClass().getName();
            while (true) {
                if (!(baseContext instanceof ContextWrapper)) {
                    name = null;
                    break;
                } else {
                    if (baseContext instanceof Activity) {
                        name = baseContext.getClass().getName();
                        break;
                    }
                    baseContext = ((ContextWrapper) baseContext).getBaseContext();
                }
            }
            adPreferences.setPlacementId(h0.a(packageName, name2, name, (String) null));
        }
        ((z6) ((y6) this.eventTracer.a())).a((Object) this, ii.f41104a);
        i iVar = new i(this, adEventListener);
        if (e7.a(false, adPreferences.getAdTag(), false, this.g == AdMode.REWARDED_VIDEO)) {
            b(new j(this, iVar), 1);
            return;
        }
        ((z6) ((y6) this.eventTracer.a())).c(this, ii.f41115z);
        AdPreferences adPreferences2 = this.f40587h;
        if (adPreferences2 == null) {
            adPreferences2 = new AdPreferences();
        }
        this.d = ((p) this.adCacheManager.a()).a(this, this.g, this.f40587h, new k(this, iVar, adPreferences2), str);
    }

    public void loadAd(AdPreferences adPreferences) {
        loadAd(AdMode.AUTOMATIC, adPreferences, (AdEventListener) null);
    }

    @Deprecated
    public boolean showAd(String str) {
        return showAd(str, null);
    }

    public static void a(StartAppAd startAppAd, i iVar) {
        ((z6) ((y6) startAppAd.eventTracer.a())).c(startAppAd, ii.f41115z);
        AdPreferences adPreferences = startAppAd.f40587h;
        if (adPreferences == null) {
            adPreferences = new AdPreferences();
        }
        startAppAd.d = ((p) startAppAd.adCacheManager.a()).a(startAppAd, startAppAd.g, startAppAd.f40587h, new k(startAppAd, iVar, adPreferences), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(AdEventListener adEventListener, int i2) {
        ((z6) ((y6) this.eventTracer.a())).c(this, ii.y);
        AdPreferences adPreferences = this.f40587h;
        if (adPreferences != null && !TextUtils.isEmpty(adPreferences.getAdTag())) {
            h0.a(new RunnableC0914v(this, adEventListener, i2, 9));
        } else {
            adEventListener.onFailedToReceiveAd(null);
        }
    }

    @Deprecated
    public static void showSplash(Activity activity, Bundle bundle, SplashConfig splashConfig, AdPreferences adPreferences) {
    }

    public void loadAd(AdEventListener adEventListener) {
        loadAd(adEventListener, (String) null);
    }

    public boolean showAd(AdDisplayListener adDisplayListener) {
        return showAd(null, adDisplayListener);
    }

    @Deprecated
    public static void showSplash(Activity activity, Bundle bundle, SplashConfig splashConfig, AdPreferences adPreferences, SplashHideListener splashHideListener) {
    }

    public void loadAd(AdEventListener adEventListener, String str) {
        loadAd(AdMode.AUTOMATIC, new AdPreferences(), adEventListener, str);
    }

    @Deprecated
    public boolean showAd(@Deprecated String str, AdDisplayListener adDisplayListener) {
        try {
            return a(str, adDisplayListener);
        } catch (Throwable th) {
            g9.a(th);
            setNotDisplayedReason(NotDisplayedReason.INTERNAL_ERROR);
            y.a(this.context, this.j, null);
            return false;
        }
    }

    @Deprecated
    public static void onBackPressed(Context context) {
        new StartAppAd(context).onBackPressed();
    }

    @Deprecated
    public static void showSplash(Activity activity, Bundle bundle, AdPreferences adPreferences) {
    }

    public void loadAd(AdPreferences adPreferences, AdEventListener adEventListener) {
        loadAd(AdMode.AUTOMATIC, adPreferences, adEventListener);
    }

    public void loadAd(AdMode adMode) {
        loadAd(adMode, new AdPreferences(), (AdEventListener) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(AdEventListener adEventListener, int i2) {
        AdEventListener adEventListener2;
        Throwable th;
        AdUnitConfig adUnitConfig;
        try {
            MetaData metaDataE = MetaData.E();
            ExternalAdConfig externalAdConfigV = metaDataE.v();
            if (externalAdConfigV != null) {
                try {
                    adUnitConfig = externalAdConfigV.getMapping().get(this.f40587h.getAdTag());
                } catch (Throwable th2) {
                    th = th2;
                    adEventListener2 = adEventListener;
                }
            } else {
                adUnitConfig = null;
            }
            if (adUnitConfig == null) {
                adEventListener.onFailedToReceiveAd(null);
                return;
            }
            adEventListener2 = adEventListener;
            try {
                ((k0) this.f40583a.a()).b(adUnitConfig, new com.startapp.sdk.ads.banner.bannerstandard.h(this, adEventListener2, adUnitConfig, i2, metaDataE, 1));
                return;
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
            adEventListener2 = adEventListener;
        }
        th = th;
        adEventListener2.onFailedToReceiveAd(null);
        g9.a(th);
    }

    public void loadAd(AdMode adMode, AdPreferences adPreferences) {
        loadAd(adMode, adPreferences, (AdEventListener) null);
    }

    @Deprecated
    public static boolean showAd(Context context) {
        if (context == null) {
            return false;
        }
        try {
            return new StartAppAd(context).showAd();
        } catch (Throwable th) {
            g9.a(th);
            return false;
        }
    }

    public void loadAd(AdMode adMode, AdEventListener adEventListener) {
        loadAd(adMode, new AdPreferences(), adEventListener);
    }

    public void loadAd(AdMode adMode, AdPreferences adPreferences, AdEventListener adEventListener) {
        loadAd(adMode, adPreferences, adEventListener, null);
    }

    public void loadAd(AdMode adMode, AdEventListener adEventListener, String str) {
        loadAd(adMode, new AdPreferences(), adEventListener, str);
    }

    public void loadAd(AdMode adMode, AdPreferences adPreferences, AdEventListener adEventListener, String str) {
        try {
            ((sf) this.f40585c.a()).a(16384);
        } catch (Throwable unused) {
        }
        this.g = adMode;
        this.f40587h = adPreferences;
        try {
            load(adPreferences, adEventListener, str);
        } catch (Throwable th) {
            g9.a(th);
            if (adEventListener != null) {
                a0.a(this.context, adEventListener, this, false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Unit a(AdEventListener adEventListener, AdUnitConfig adUnitConfig, int i2, MetaData metaData, h7 h7Var) {
        DisplayMetrics displayMetrics;
        Point point = new Point();
        Resources resources = this.context.getResources();
        if (resources != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            point.x = displayMetrics.widthPixels;
            point.y = displayMetrics.heightPixels;
        }
        Unit unit = Unit.f43263a;
        if (h7Var == null) {
            adEventListener.onFailedToReceiveAd(null);
            return unit;
        }
        this.f = h7Var;
        p7 p7Var = (p7) h7Var;
        p7Var.f41351c = new l(this, adEventListener, adUnitConfig, i2, metaData, point);
        boolean z2 = this.g == AdMode.REWARDED_VIDEO;
        AdManagerAdRequest.Builder builder = new AdManagerAdRequest.Builder();
        for (Map.Entry<String, List<String>> entry : p7Var.f41350b.getKeyValues().entrySet()) {
            builder.addCustomTargeting(entry.getKey(), entry.getValue());
        }
        AdManagerAdRequest adManagerAdRequestBuild = builder.build();
        Intrinsics.e(adManagerAdRequestBuild, "build(...)");
        if (z2) {
            RewardedAd.load(p7Var.f41349a, p7Var.f41350b.getAdUnitId(), adManagerAdRequestBuild, (RewardedAdLoadCallback) new l7(p7Var));
        } else {
            AdManagerInterstitialAd.load(p7Var.f41349a, p7Var.f41350b.getAdUnitId(), adManagerAdRequestBuild, new m7(p7Var));
        }
        return unit;
    }

    public static void a(StartAppAd startAppAd, boolean z2, String uuid, String originalTS, AdPreferences adPreferences, AdUnitConfig config, int i2) {
        Context context = startAppAd.context;
        AdPreferences.Placement placement = AdPreferences.Placement.INAPP_OVERLAY;
        lb lbVar = startAppAd.httpClient;
        lb lbVar2 = startAppAd.networkApiExecutor;
        lb lbVar3 = startAppAd.eventTracer;
        lb lbVar4 = startAppAd.motionProcessor;
        ca caVar = new ca(context, adPreferences, placement, lbVar, lbVar2, lbVar3, lbVar4);
        caVar.f40865a = startAppAd.g == AdMode.REWARDED_VIDEO;
        caVar.f40866b = z2;
        Intrinsics.f(uuid, "uuid");
        caVar.f40867c = uuid;
        Intrinsics.f(originalTS, "originalTS");
        caVar.f40868e = originalTS;
        Intrinsics.f(config, "config");
        caVar.d = config;
        caVar.f40869h = Integer.valueOf(i2);
        caVar.f40870i = config.getSioPrice();
        new da(context, adPreferences, placement, lbVar, lbVar2, lbVar3, lbVar4, caVar).a();
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0283 A[LOOP:0: B:98:0x027d->B:100:0x0283, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:102:0x029e  */
    /* JADX WARN: Code duplicated, block: B:104:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:105:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:107:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:108:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:110:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:112:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:115:0x02cc A[LOOP:1: B:113:0x02c6->B:115:0x02cc, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:117:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:121:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:67:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:70:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:78:0x01de  */
    /* JADX WARN: Code duplicated, block: B:80:0x023a  */
    /* JADX WARN: Code duplicated, block: B:82:0x0240  */
    /* JADX WARN: Code duplicated, block: B:85:0x0257 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:86:0x0259  */
    /* JADX WARN: Code duplicated, block: B:89:0x025f  */
    /* JADX WARN: Code duplicated, block: B:92:0x0265  */
    /* JADX WARN: Code duplicated, block: B:93:0x026a  */
    /* JADX WARN: Code duplicated, block: B:95:0x026e  */
    /* JADX WARN: Code duplicated, block: B:97:0x0279  */
    private boolean a(String str, AdDisplayListener adDisplayListener) {
        boolean z2;
        AdRulesResult adRulesResult;
        boolean zA;
        boolean zA2;
        NotDisplayedReason notDisplayedReason;
        Object objA;
        String[] strArr;
        List list;
        ArrayList arrayList;
        Iterator it;
        Object obj;
        String[] strArr2;
        List list2;
        ArrayList arrayList2;
        Iterator it2;
        Activity activityResolveActivityToShowAd;
        try {
            ((sf) this.f40585c.a()).a(32768);
        } catch (Throwable unused) {
        }
        setNotDisplayedReason(null);
        this.j = adDisplayListener;
        if (!canShowAd()) {
            setNotDisplayedReason(NotDisplayedReason.SERVING_ADS_DISABLED);
            y.a(this.context, this.j, this);
            return false;
        }
        if (this.f != null && (activityResolveActivityToShowAd = resolveActivityToShowAd()) != null) {
            h0.a(new com.google.android.exoplayer2.video.a(9, this, activityResolveActivityToShowAd));
            return true;
        }
        if (this.d == null) {
            loadAd(this.g, this.f40587h, (AdEventListener) null);
        }
        if (AdsCommonMetaData.k().L() && !vi.c(this.context)) {
            setNotDisplayedReason(NotDisplayedReason.APP_IN_BACKGROUND);
        } else {
            Context context = this.context;
            WeakHashMap weakHashMap = vi.f41589a;
            if (((g6) com.startapp.sdk.components.a.a(context).t.a()).b()) {
                if (isReady()) {
                    AdPreferences.Placement placement = getPlacement();
                    AdRulesResult adRulesResultA = AdsCommonMetaData.k().b().a(placement, str);
                    if (adRulesResultA.b()) {
                        f fVarB = ((p) this.adCacheManager.a()).b(this.d);
                        this.f40586e = fVarB;
                        if (fVarB != null) {
                            zA = fVarB.a(str);
                            if (zA) {
                                t.d.a(new s(placement, str));
                                AdPreferences adPreferences = this.f40587h;
                                if (adPreferences == null || adPreferences.equals(new AdPreferences())) {
                                    String str2 = "autoLoadNotShownAdPrefix" + this.g.name();
                                    uf ufVarA = ((vf) this.f40584b.a()).edit();
                                    ufVarA.a(str2, 0);
                                    ufVarA.f41545a.putInt(str2, 0);
                                    if (this.g == AdMode.AUTOMATIC) {
                                        String str3 = "autoLoadNotShownAdPrefix" + AdMode.FULLPAGE.name();
                                        ufVarA.a(str3, 0);
                                        ufVarA.f41545a.putInt(str3, 0);
                                        String str4 = "autoLoadNotShownAdPrefix" + AdMode.OFFERWALL.name();
                                        ufVarA.a(str4, 0);
                                        ufVarA.f41545a.putInt(str4, 0);
                                    }
                                    ufVarA.apply();
                                }
                            } else {
                                Object obj2 = this.f40586e;
                                if (obj2 instanceof Ad) {
                                    setNotDisplayedReason(((Ad) obj2).getNotDisplayedReason());
                                }
                            }
                            adRulesResult = adRulesResultA;
                            z2 = false;
                        }
                    } else {
                        setNotDisplayedReason(NotDisplayedReason.AD_RULES);
                    }
                    zA = false;
                    adRulesResult = adRulesResultA;
                    z2 = false;
                } else {
                    AdMode adMode = this.g;
                    if (adMode != AdMode.REWARDED_VIDEO && adMode != AdMode.VIDEO) {
                        if (canShowAd() && AdsCommonMetaData.k().F().r() && MetaData.E().f0()) {
                            AdPreferences adPreferences2 = this.f40587h;
                            if (adPreferences2 == null) {
                                adPreferences2 = new AdPreferences();
                            }
                            adPreferences2.setType(Ad.AdType.NON_VIDEO);
                            AdPreferences.Placement placement2 = getPlacement();
                            f fVarA = ((p) this.adCacheManager.a()).a(new CacheKey(placement2, adPreferences2));
                            if (fVarA != null && fVarA.isReady() && AdsCommonMetaData.k().b().a(placement2, str).b()) {
                                fVarA.setVideoCancelCallBack(true);
                                zA2 = fVarA.a(str);
                            } else {
                                zA2 = false;
                            }
                        } else {
                            zA2 = false;
                        }
                        z2 = zA2;
                    }
                    if (!z2) {
                        setNotDisplayedReason(NotDisplayedReason.AD_NOT_READY);
                    }
                    adRulesResult = null;
                    zA = false;
                }
            } else {
                setNotDisplayedReason(NotDisplayedReason.NETWORK_PROBLEM);
            }
            if (!zA || z2) {
                zb.a(this.context).a(this.k, new IntentFilter("com.startapp.android.HideDisplayBroadcastListener"));
                zb.a(this.context).a(this.k, new IntentFilter("com.startapp.android.ShowDisplayBroadcastListener"));
                zb.a(this.context).a(this.k, new IntentFilter("com.startapp.android.ShowFailedDisplayBroadcastListener"));
                zb.a(this.context).a(this.k, new IntentFilter("com.startapp.android.OnClickCallback"));
                zb.a(this.context).a(this.k, new IntentFilter("com.startapp.android.OnVideoCompleted"));
            }
            if (!zA) {
                notDisplayedReason = getNotDisplayedReason();
                if (notDisplayedReason == null) {
                    notDisplayedReason = NotDisplayedReason.INTERNAL_ERROR;
                    setNotDisplayedReason(notDisplayedReason);
                }
                objA = ((p) this.adCacheManager.a()).a(this.d);
                if (notDisplayedReason != NotDisplayedReason.AD_RULES) {
                    if (z2) {
                        notDisplayedReason = NotDisplayedReason.AD_NOT_READY_VIDEO_FALLBACK;
                    }
                    obj = this.f40586e;
                    if (obj != null) {
                        objA = obj;
                    }
                    if (objA instanceof o8) {
                        strArr2 = ((o8) objA).f41302i;
                    } else if (objA instanceof gb) {
                        list2 = ((gb) objA).f41005a;
                        arrayList2 = new ArrayList();
                        if (list2 != null) {
                            it2 = list2.iterator();
                            while (it2.hasNext()) {
                                arrayList2.addAll(Arrays.asList(((AdDetails) it2.next()).t()));
                            }
                        }
                        strArr2 = (String[]) arrayList2.toArray(new String[0]);
                    } else {
                        strArr2 = new String[0];
                    }
                    h0.a(strArr2, str, 0, notDisplayedReason.toString(), (JSONObject) null);
                } else if (adRulesResult != null) {
                    if (objA instanceof o8) {
                        strArr = ((o8) objA).f41302i;
                    } else if (objA instanceof gb) {
                        list = ((gb) objA).f41005a;
                        arrayList = new ArrayList();
                        if (list != null) {
                            it = list.iterator();
                            while (it.hasNext()) {
                                arrayList.addAll(Arrays.asList(((AdDetails) it.next()).t()));
                            }
                        }
                        strArr = (String[]) arrayList.toArray(new String[0]);
                    } else {
                        strArr = new String[0];
                    }
                    h0.a(strArr, str, 0, adRulesResult.a());
                }
                this.f40586e = null;
                if (!z2) {
                    y.a(this.context, this.j, this);
                }
            }
            return zA;
        }
        adRulesResult = null;
        z2 = false;
        zA = false;
        if (!zA) {
            zb.a(this.context).a(this.k, new IntentFilter("com.startapp.android.HideDisplayBroadcastListener"));
            zb.a(this.context).a(this.k, new IntentFilter("com.startapp.android.ShowDisplayBroadcastListener"));
            zb.a(this.context).a(this.k, new IntentFilter("com.startapp.android.ShowFailedDisplayBroadcastListener"));
            zb.a(this.context).a(this.k, new IntentFilter("com.startapp.android.OnClickCallback"));
            zb.a(this.context).a(this.k, new IntentFilter("com.startapp.android.OnVideoCompleted"));
        } else {
            zb.a(this.context).a(this.k, new IntentFilter("com.startapp.android.HideDisplayBroadcastListener"));
            zb.a(this.context).a(this.k, new IntentFilter("com.startapp.android.ShowDisplayBroadcastListener"));
            zb.a(this.context).a(this.k, new IntentFilter("com.startapp.android.ShowFailedDisplayBroadcastListener"));
            zb.a(this.context).a(this.k, new IntentFilter("com.startapp.android.OnClickCallback"));
            zb.a(this.context).a(this.k, new IntentFilter("com.startapp.android.OnVideoCompleted"));
        }
        if (!zA) {
            notDisplayedReason = getNotDisplayedReason();
            if (notDisplayedReason == null) {
                notDisplayedReason = NotDisplayedReason.INTERNAL_ERROR;
                setNotDisplayedReason(notDisplayedReason);
            }
            objA = ((p) this.adCacheManager.a()).a(this.d);
            if (notDisplayedReason != NotDisplayedReason.AD_RULES) {
                if (z2) {
                    notDisplayedReason = NotDisplayedReason.AD_NOT_READY_VIDEO_FALLBACK;
                }
                obj = this.f40586e;
                if (obj != null) {
                    objA = obj;
                }
                if (objA instanceof o8) {
                    strArr2 = ((o8) objA).f41302i;
                } else if (objA instanceof gb) {
                    list2 = ((gb) objA).f41005a;
                    arrayList2 = new ArrayList();
                    if (list2 != null) {
                        it2 = list2.iterator();
                        while (it2.hasNext()) {
                            arrayList2.addAll(Arrays.asList(((AdDetails) it2.next()).t()));
                        }
                    }
                    strArr2 = (String[]) arrayList2.toArray(new String[0]);
                } else {
                    strArr2 = new String[0];
                }
                h0.a(strArr2, str, 0, notDisplayedReason.toString(), (JSONObject) null);
            } else if (adRulesResult != null) {
                if (objA instanceof o8) {
                    strArr = ((o8) objA).f41302i;
                } else if (objA instanceof gb) {
                    list = ((gb) objA).f41005a;
                    arrayList = new ArrayList();
                    if (list != null) {
                        it = list.iterator();
                        while (it.hasNext()) {
                            arrayList.addAll(Arrays.asList(((AdDetails) it.next()).t()));
                        }
                    }
                    strArr = (String[]) arrayList.toArray(new String[0]);
                } else {
                    strArr = new String[0];
                }
                h0.a(strArr, str, 0, adRulesResult.a());
            }
            this.f40586e = null;
            if (!z2) {
                y.a(this.context, this.j, this);
            }
        }
        return zA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Activity activity) {
        p7 p7Var = (p7) this.f;
        p7Var.getClass();
        Intrinsics.f(activity, "activity");
        AdManagerInterstitialAd adManagerInterstitialAd = p7Var.d;
        if (adManagerInterstitialAd != null) {
            adManagerInterstitialAd.setFullScreenContentCallback(new n7(p7Var));
        }
        AdManagerInterstitialAd adManagerInterstitialAd2 = p7Var.d;
        if (adManagerInterstitialAd2 != null) {
            adManagerInterstitialAd2.show(activity);
        } else {
            p7Var.a(activity);
        }
    }
}
