package com.applovin.impl;

import android.content.Context;
import android.view.ViewGroup;
import com.applovin.adview.AppLovinInterstitialAd;
import com.applovin.adview.AppLovinInterstitialAdDialog;
import com.applovin.impl.sdk.AppLovinAdServiceImpl;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdRewardListener;
import com.applovin.sdk.AppLovinAdType;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinErrorCodes;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class k2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final com.applovin.impl.sdk.l f8278b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final AppLovinAdServiceImpl f8279c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private AppLovinAd f8280d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f8281e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private SoftReference f8282f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile String f8284h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private volatile double f8286j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f8277a = defpackage.e.w();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Object f8283g = new Object();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private volatile boolean f8285i = false;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a implements AppLovinAdRewardListener {
        public a() {
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void userOverQuota(AppLovinAd appLovinAd, Map map) {
            k2.this.f8278b.Q();
            if (com.applovin.impl.sdk.p.a()) {
                k2.this.f8278b.Q().b("IncentivizedAdController", "User over quota: " + map);
            }
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void userRewardRejected(AppLovinAd appLovinAd, Map map) {
            k2.this.f8278b.Q();
            if (com.applovin.impl.sdk.p.a()) {
                k2.this.f8278b.Q().b("IncentivizedAdController", "Reward rejected: " + map);
            }
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void userRewardVerified(AppLovinAd appLovinAd, Map map) {
            k2.this.f8278b.Q();
            if (com.applovin.impl.sdk.p.a()) {
                k2.this.f8278b.Q().a("IncentivizedAdController", "Reward validated: " + map);
            }
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void validationRequestFailed(AppLovinAd appLovinAd, int i10) {
            k2.this.f8278b.Q();
            if (com.applovin.impl.sdk.p.a()) {
                k2.this.f8278b.Q().b("IncentivizedAdController", "Reward validation failed: " + i10);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class b implements AppLovinAdLoadListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AppLovinAdLoadListener f8288a;

        public b(AppLovinAdLoadListener appLovinAdLoadListener) {
            this.f8288a = appLovinAdLoadListener;
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void adReceived(AppLovinAd appLovinAd) {
            k2.this.f8280d = appLovinAd;
            if (this.f8288a != null) {
                AppLovinSdkUtils.runOnUiThread(new x8(2, this, appLovinAd));
            }
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void failedToReceiveAd(int i10) {
            if (this.f8288a != null) {
                AppLovinSdkUtils.runOnUiThread(new l9(i10, 0, this));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(AppLovinAd appLovinAd) {
            try {
                this.f8288a.adReceived(appLovinAd);
            } catch (Throwable th2) {
                com.applovin.impl.sdk.p.c("AppLovinIncentivizedInterstitial", "Unable to notify ad listener about a newly loaded ad", th2);
                k2.this.f8278b.E().a("IncentivizedAdController", "adLoaded", th2);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(int i10) {
            try {
                this.f8288a.failedToReceiveAd(i10);
            } catch (Throwable th2) {
                com.applovin.impl.sdk.p.c("AppLovinIncentivizedInterstitial", "Unable to notify listener about ad load failure", th2);
                k2.this.f8278b.E().a("IncentivizedAdController", "adLoadFailed", th2);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class c implements n2, AppLovinAdVideoPlaybackListener, AppLovinAdRewardListener, AppLovinAdClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AppLovinAd f8290a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final AppLovinAdDisplayListener f8291b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final AppLovinAdClickListener f8292c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final AppLovinAdVideoPlaybackListener f8293d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final AppLovinAdRewardListener f8294e;

        public /* synthetic */ c(k2 k2Var, AppLovinAd appLovinAd, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener, a aVar) {
            this(appLovinAd, appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener);
        }

        private void a(com.applovin.impl.sdk.ad.b bVar, String str) {
            int i10;
            k2.this.f8278b.Q();
            if (com.applovin.impl.sdk.p.a()) {
                k2.this.f8278b.Q().a("IncentivizedAdController", "Finishing direct ad...");
            }
            String strB = k2.this.b();
            if (!StringUtils.isValidString(strB) || !k2.this.f8285i) {
                k2.this.f8278b.Q();
                if (com.applovin.impl.sdk.p.a()) {
                    com.applovin.impl.sdk.p pVarQ = k2.this.f8278b.Q();
                    StringBuilder sbK = d5.u.k("Invalid reward state - result: ", strB, " and wasFullyEngaged: ");
                    sbK.append(k2.this.f8285i);
                    pVarQ.b("IncentivizedAdController", sbK.toString());
                }
                k2.this.f8278b.Q();
                if (com.applovin.impl.sdk.p.a()) {
                    k2.this.f8278b.Q().a("IncentivizedAdController", "Cancelling any incoming reward requests for this ad");
                }
                bVar.d();
                if (k2.this.f8285i) {
                    k2.this.f8278b.Q();
                    if (com.applovin.impl.sdk.p.a()) {
                        k2.this.f8278b.Q().b("IncentivizedAdController", "User closed the ad after fully watching but reward validation task did not return on time");
                    }
                    str = "network_timeout";
                    i10 = AppLovinErrorCodes.INCENTIVIZED_SERVER_TIMEOUT;
                } else {
                    if (str == null) {
                        str = "unknown_early_dismissal_source";
                    }
                    k2.this.f8278b.Q();
                    if (com.applovin.impl.sdk.p.a()) {
                        k2.this.f8278b.Q().b("IncentivizedAdController", "Ad closed prematurely from source: ".concat(str));
                    }
                    i10 = AppLovinErrorCodes.INCENTIVIZED_USER_CLOSED_VIDEO;
                }
                bVar.a(q4.a(str));
                k2.this.f8278b.Q();
                if (com.applovin.impl.sdk.p.a()) {
                    k2.this.f8278b.Q().a("IncentivizedAdController", "Notifying listener of reward validation failure");
                }
                v2.a(this.f8294e, bVar, i10);
                HashMap<String, String> mapHashMap = CollectionUtils.hashMap("details", String.valueOf(k2.this.f8286j));
                CollectionUtils.putStringIfValid("source", str, mapHashMap);
                k2.this.f8278b.g().a(f2.K, bVar, mapHashMap);
            }
            if (bVar.x0().getAndSet(true)) {
                return;
            }
            k2.this.f8278b.Q();
            if (com.applovin.impl.sdk.p.a()) {
                k2.this.f8278b.Q().a("IncentivizedAdController", "Scheduling report rewarded ad...");
            }
            k2.this.f8278b.s0().a((k5) new p6(bVar, k2.this.f8278b), f6.b.OTHER);
        }

        @Override // com.applovin.sdk.AppLovinAdClickListener
        public void adClicked(AppLovinAd appLovinAd) {
            v2.a(this.f8292c, appLovinAd);
        }

        @Override // com.applovin.sdk.AppLovinAdDisplayListener
        public void adDisplayed(AppLovinAd appLovinAd) {
            v2.a(this.f8291b, appLovinAd);
        }

        @Override // com.applovin.sdk.AppLovinAdDisplayListener
        public void adHidden(AppLovinAd appLovinAd) {
            String str;
            AppLovinAd appLovinAdF = appLovinAd instanceof com.applovin.impl.sdk.ad.c ? ((com.applovin.impl.sdk.ad.c) appLovinAd).f() : appLovinAd;
            if (appLovinAdF instanceof com.applovin.impl.sdk.ad.b) {
                com.applovin.impl.sdk.ad.b bVar = (com.applovin.impl.sdk.ad.b) appLovinAdF;
                a(bVar, a(bVar, false));
            } else {
                if (appLovinAdF == null) {
                    str = "null/expired ad";
                } else {
                    str = "invalid ad of type: " + appLovinAdF;
                }
                k2.this.f8278b.Q();
                if (com.applovin.impl.sdk.p.a()) {
                    k2.this.f8278b.Q().b("IncentivizedAdController", "Received `adHidden` callback for " + str);
                }
            }
            k2.this.a(appLovinAdF);
            k2.this.f8278b.Q();
            if (com.applovin.impl.sdk.p.a()) {
                k2.this.f8278b.Q().a("IncentivizedAdController", "Notifying listener of rewarded ad dismissal");
            }
            v2.b(this.f8291b, appLovinAd);
        }

        @Override // com.applovin.impl.n2
        public void onAdDisplayFailed(String str) {
            String str2;
            AppLovinAd appLovinAdF = this.f8290a;
            if (appLovinAdF instanceof com.applovin.impl.sdk.ad.c) {
                appLovinAdF = ((com.applovin.impl.sdk.ad.c) appLovinAdF).f();
            }
            boolean z10 = this.f8291b instanceof n2;
            if (appLovinAdF instanceof com.applovin.impl.sdk.ad.b) {
                com.applovin.impl.sdk.ad.b bVar = (com.applovin.impl.sdk.ad.b) appLovinAdF;
                a(bVar, a(bVar, StringUtils.isValidString(str)));
            } else {
                if (appLovinAdF == null) {
                    str2 = "null/expired ad";
                } else {
                    str2 = "invalid ad of type: " + appLovinAdF;
                }
                k2.this.f8278b.Q();
                if (com.applovin.impl.sdk.p.a()) {
                    k2.this.f8278b.Q().b("IncentivizedAdController", q4.a.j(new StringBuilder("Received `"), z10 ? "adDisplayFailed" : "adHidden", "` callback for ", str2));
                }
            }
            k2.this.a(appLovinAdF);
            if (z10) {
                v2.a(this.f8291b, str);
            } else {
                v2.b(this.f8291b, this.f8290a);
            }
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void userOverQuota(AppLovinAd appLovinAd, Map map) {
            k2.this.a("quota_exceeded");
            v2.b(this.f8294e, appLovinAd, map);
            k2.this.f8278b.g().a(f2.J, (com.applovin.impl.sdk.ad.b) appLovinAd, CollectionUtils.hashMap("error_message", "quota_exceeded"));
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void userRewardRejected(AppLovinAd appLovinAd, Map map) {
            k2.this.a("rejected");
            v2.a(this.f8294e, appLovinAd, map);
            k2.this.f8278b.g().a(f2.J, (com.applovin.impl.sdk.ad.b) appLovinAd, CollectionUtils.hashMap("error_message", "rejected"));
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void userRewardVerified(AppLovinAd appLovinAd, Map map) {
            k2.this.a("accepted");
            v2.c(this.f8294e, appLovinAd, map);
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void validationRequestFailed(AppLovinAd appLovinAd, int i10) {
            k2.this.a("network_timeout");
            v2.a(this.f8294e, appLovinAd, i10);
            HashMap<String, String> mapHashMap = CollectionUtils.hashMap("error_message", "network_timeout");
            mapHashMap.put("code", String.valueOf(i10));
            k2.this.f8278b.g().a(f2.J, (com.applovin.impl.sdk.ad.b) appLovinAd, mapHashMap);
        }

        @Override // com.applovin.sdk.AppLovinAdVideoPlaybackListener
        public void videoPlaybackBegan(AppLovinAd appLovinAd) {
            v2.a(this.f8293d, appLovinAd);
        }

        @Override // com.applovin.sdk.AppLovinAdVideoPlaybackListener
        public void videoPlaybackEnded(AppLovinAd appLovinAd, double d10, boolean z10) {
            AppLovinAd appLovinAdF = appLovinAd instanceof com.applovin.impl.sdk.ad.c ? ((com.applovin.impl.sdk.ad.c) appLovinAd).f() : appLovinAd;
            boolean z11 = (appLovinAdF instanceof com.applovin.impl.sdk.ad.b) && ((com.applovin.impl.sdk.ad.b) appLovinAdF).E0();
            k2 k2Var = k2.this;
            if (z11) {
                d10 = 100.0d;
            }
            k2Var.f8286j = d10;
            k2.this.f8285i = z10 || z11;
            v2.a(this.f8293d, appLovinAd, k2.this.f8286j, k2.this.f8285i);
        }

        private c(AppLovinAd appLovinAd, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
            this.f8290a = appLovinAd;
            this.f8291b = appLovinAdDisplayListener;
            this.f8292c = appLovinAdClickListener;
            this.f8293d = appLovinAdVideoPlaybackListener;
            this.f8294e = appLovinAdRewardListener;
        }

        private String a(com.applovin.impl.sdk.ad.b bVar, boolean z10) {
            if (StringUtils.isValidString(bVar.v())) {
                return bVar.v();
            }
            if (z10) {
                return "ad_display_failure";
            }
            return null;
        }
    }

    public k2(String str, AppLovinSdk appLovinSdk) {
        this.f8278b = appLovinSdk.a();
        this.f8279c = (AppLovinAdServiceImpl) appLovinSdk.getAdService();
        this.f8281e = str;
    }

    private void e() {
        AppLovinAdLoadListener appLovinAdLoadListener;
        SoftReference softReference = this.f8282f;
        if (softReference == null || (appLovinAdLoadListener = (AppLovinAdLoadListener) softReference.get()) == null) {
            return;
        }
        appLovinAdLoadListener.failedToReceiveAd(AppLovinErrorCodes.INCENTIVIZED_NO_AD_PRELOADED);
    }

    public boolean d() {
        return this.f8280d != null;
    }

    public String c() {
        return this.f8281e;
    }

    public void b(AppLovinAdLoadListener appLovinAdLoadListener) {
        this.f8278b.Q();
        if (com.applovin.impl.sdk.p.a()) {
            this.f8278b.Q().a("IncentivizedAdController", "User requested preload of incentivized ad...");
        }
        this.f8282f = new SoftReference(appLovinAdLoadListener);
        if (d()) {
            com.applovin.impl.sdk.p.h("IncentivizedAdController", "Attempted to call preloadAndNotify: while an ad was already loaded or currently being played. Do not call preloadAndNotify: again until the last ad has been closed (adHidden).");
            if (appLovinAdLoadListener != null) {
                appLovinAdLoadListener.adReceived(this.f8280d);
                return;
            }
            return;
        }
        a(new b(appLovinAdLoadListener));
    }

    private void a(AppLovinAdLoadListener appLovinAdLoadListener) {
        this.f8279c.loadNextIncentivizedAd(this.f8281e, appLovinAdLoadListener);
    }

    private void a(AppLovinAd appLovinAd, Context context, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        AppLovinAdImpl appLovinAdImpl;
        if (appLovinAd != null) {
            appLovinAdImpl = (AppLovinAdImpl) appLovinAd;
        } else {
            appLovinAdImpl = (AppLovinAdImpl) this.f8280d;
        }
        AppLovinAdImpl appLovinAdImpl2 = appLovinAdImpl;
        if (appLovinAdImpl2 != null) {
            a(appLovinAdImpl2, context, appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener);
        } else {
            com.applovin.impl.sdk.p.h("IncentivizedAdController", "Skipping incentivized video playback: user attempted to play an incentivized video before one was preloaded.");
            e();
        }
    }

    public void b(AppLovinAd appLovinAd, Context context, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        if (appLovinAdRewardListener == null) {
            appLovinAdRewardListener = a();
        }
        a(appLovinAd, context, appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener);
    }

    public void b(AppLovinAd appLovinAd, ViewGroup viewGroup, androidx.lifecycle.o oVar, Context context, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        if (appLovinAdRewardListener == null) {
            appLovinAdRewardListener = a();
        }
        a(appLovinAd, viewGroup, oVar, context, appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener);
    }

    private void a(AppLovinAd appLovinAd, ViewGroup viewGroup, androidx.lifecycle.o oVar, Context context, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        AppLovinAdImpl appLovinAdImpl;
        if (appLovinAd != null) {
            appLovinAdImpl = (AppLovinAdImpl) appLovinAd;
        } else {
            appLovinAdImpl = (AppLovinAdImpl) this.f8280d;
        }
        AppLovinAdImpl appLovinAdImpl2 = appLovinAdImpl;
        if (appLovinAdImpl2 != null) {
            a(appLovinAdImpl2, viewGroup, oVar, context, appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener);
        } else {
            com.applovin.impl.sdk.p.h("IncentivizedAdController", "Skipping incentivized video playback: user attempted to play an incentivized video before one was preloaded.");
            e();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String b() {
        String str;
        synchronized (this.f8283g) {
            str = this.f8284h;
        }
        return str;
    }

    private void a(com.applovin.impl.sdk.ad.b bVar, AppLovinAdRewardListener appLovinAdRewardListener) {
        this.f8278b.s0().a((k5) new w6(bVar, appLovinAdRewardListener, this.f8278b), f6.b.OTHER);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        synchronized (this.f8283g) {
            this.f8284h = str;
        }
    }

    public void a(String str, Object obj) {
        this.f8277a.put(str, obj);
    }

    private void a(AppLovinAdImpl appLovinAdImpl, Context context, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        Map mapA = h2.a(appLovinAdImpl);
        CollectionUtils.putStringIfValid("source", "showRewardedAd", mapA);
        this.f8278b.g().d(f2.D, mapA);
        c cVar = new c(this, appLovinAdImpl, appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener, null);
        AppLovinAd appLovinAdA = q7.a(appLovinAdImpl, this.f8278b);
        String strA = a(appLovinAdA, appLovinAdImpl);
        if (StringUtils.isValidString(strA)) {
            a(appLovinAdImpl, strA, cVar, cVar);
            return;
        }
        AppLovinInterstitialAdDialog appLovinInterstitialAdDialogCreate = AppLovinInterstitialAd.create(this.f8278b.A0(), context);
        for (String str : this.f8277a.keySet()) {
            appLovinInterstitialAdDialogCreate.setExtraInfo(str, this.f8277a.get(str));
        }
        appLovinInterstitialAdDialogCreate.setAdDisplayListener(cVar);
        appLovinInterstitialAdDialogCreate.setAdVideoPlaybackListener(cVar);
        appLovinInterstitialAdDialogCreate.setAdClickListener(cVar);
        appLovinInterstitialAdDialogCreate.showAndRender(appLovinAdA);
        a((com.applovin.impl.sdk.ad.b) appLovinAdA, cVar);
    }

    private void a(AppLovinAdImpl appLovinAdImpl, ViewGroup viewGroup, androidx.lifecycle.o oVar, Context context, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        Map mapA = h2.a(appLovinAdImpl);
        CollectionUtils.putStringIfValid("source", "showRewardedAdView", mapA);
        this.f8278b.g().d(f2.D, mapA);
        c cVar = new c(this, appLovinAdImpl, appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener, null);
        AppLovinAd appLovinAdA = q7.a(appLovinAdImpl, this.f8278b);
        String strA = a(appLovinAdA, appLovinAdImpl);
        if (StringUtils.isValidString(strA)) {
            a(appLovinAdImpl, strA, cVar, cVar);
            return;
        }
        AppLovinInterstitialAdDialog appLovinInterstitialAdDialogCreate = AppLovinInterstitialAd.create(this.f8278b.A0(), context);
        for (String str : this.f8277a.keySet()) {
            appLovinInterstitialAdDialogCreate.setExtraInfo(str, this.f8277a.get(str));
        }
        appLovinInterstitialAdDialogCreate.setAdDisplayListener(cVar);
        appLovinInterstitialAdDialogCreate.setAdVideoPlaybackListener(cVar);
        appLovinInterstitialAdDialogCreate.setAdClickListener(cVar);
        appLovinInterstitialAdDialogCreate.showAndRender(appLovinAdA, viewGroup, oVar);
        a((com.applovin.impl.sdk.ad.b) appLovinAdA, cVar);
    }

    private String a(AppLovinAd appLovinAd, AppLovinAd appLovinAd2) {
        if (appLovinAd == null) {
            com.applovin.impl.sdk.p.h("IncentivizedAdController", "Unable to retrieve the loaded ad. This can occur when attempting to show an expired ad.: " + appLovinAd2);
            return "Unable to retrieve the loaded ad. This can occur when attempting to show an expired ad.";
        }
        if (appLovinAd2.getType() == AppLovinAdType.INCENTIVIZED) {
            return null;
        }
        com.applovin.impl.sdk.p.h("IncentivizedAdController", "Attempting to display ad with invalid ad type: " + appLovinAd2.getType());
        return "Attempting to display ad with invalid ad type";
    }

    private void a(AppLovinAd appLovinAd, String str, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, n2 n2Var) {
        v2.a(appLovinAdVideoPlaybackListener, appLovinAd, 0.0d, false);
        v2.a(n2Var, str);
        Map mapA = h2.a((AppLovinAdImpl) appLovinAd);
        CollectionUtils.putStringIfValid("source", "rewardedAdShowFailed", mapA);
        CollectionUtils.putStringIfValid("error_message", str, mapA);
        this.f8278b.g().d(f2.G, mapA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(AppLovinAd appLovinAd) {
        AppLovinAd appLovinAd2 = this.f8280d;
        if (appLovinAd2 == null) {
            return;
        }
        if (!(appLovinAd2 instanceof com.applovin.impl.sdk.ad.c)) {
            if (appLovinAd == appLovinAd2) {
                this.f8280d = null;
            }
        } else {
            com.applovin.impl.sdk.ad.c cVar = (com.applovin.impl.sdk.ad.c) appLovinAd2;
            if (cVar.f() == null || appLovinAd == cVar.f()) {
                this.f8280d = null;
            }
        }
    }

    private AppLovinAdRewardListener a() {
        return new a();
    }
}
