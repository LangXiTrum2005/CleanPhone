package com.applovin.impl;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.StrictMode;
import android.view.ViewGroup;
import com.applovin.adview.AppLovinFullscreenActivity;
import com.applovin.adview.AppLovinFullscreenAdViewObserver;
import com.applovin.adview.AppLovinFullscreenImmersiveActivity;
import com.applovin.adview.AppLovinInterstitialAdDialog;
import com.applovin.impl.adview.activity.AppRestartDuringAdDetectionService;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class p2 implements AppLovinInterstitialAdDialog {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final com.applovin.impl.sdk.l f8950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final WeakReference f8951b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f8952c = defpackage.e.w();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile AppLovinAdLoadListener f8953d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile AppLovinAdDisplayListener f8954e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile AppLovinAdVideoPlaybackListener f8955f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private volatile AppLovinAdClickListener f8956g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile com.applovin.impl.sdk.ad.b f8957h;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a implements AppLovinAdLoadListener {
        public a() {
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void adReceived(AppLovinAd appLovinAd) {
            p2.this.b(appLovinAd);
            p2.this.showAndRender(appLovinAd);
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void failedToReceiveAd(int i10) {
            p2.this.b(i10);
        }
    }

    public p2(AppLovinSdk appLovinSdk, Context context) {
        if (appLovinSdk == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        if (context == null) {
            throw new IllegalArgumentException("No context specified");
        }
        this.f8950a = appLovinSdk.a();
        this.f8951b = new WeakReference(context);
    }

    private long g() {
        String str = this.f8950a.p0().getExtraParameters().get("fullscreen_ad_display_delay_enabled");
        if (str == null || Boolean.parseBoolean(str)) {
            return Math.max(0L, ((Long) this.f8950a.a(z4.Z1)).longValue());
        }
        return 0L;
    }

    public Map h() {
        return this.f8952c;
    }

    public boolean i() {
        com.applovin.impl.sdk.ad.b bVar = this.f8957h;
        if (bVar == null) {
            return false;
        }
        if (!((Boolean) this.f8950a.a(z4.U6)).booleanValue()) {
            bVar.p0();
        }
        bVar.setHasShown(false);
        AppLovinSdkUtils.runOnUiThread(true, new x8(15, this, bVar));
        return true;
    }

    @Override // com.applovin.adview.AppLovinInterstitialAdDialog
    public void setAdClickListener(AppLovinAdClickListener appLovinAdClickListener) {
        this.f8956g = appLovinAdClickListener;
    }

    @Override // com.applovin.adview.AppLovinInterstitialAdDialog
    public void setAdDisplayListener(AppLovinAdDisplayListener appLovinAdDisplayListener) {
        this.f8954e = appLovinAdDisplayListener;
    }

    @Override // com.applovin.adview.AppLovinInterstitialAdDialog
    public void setAdLoadListener(AppLovinAdLoadListener appLovinAdLoadListener) {
        this.f8953d = appLovinAdLoadListener;
    }

    @Override // com.applovin.adview.AppLovinInterstitialAdDialog
    public void setAdVideoPlaybackListener(AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        this.f8955f = appLovinAdVideoPlaybackListener;
    }

    @Override // com.applovin.adview.AppLovinInterstitialAdDialog
    public void setExtraInfo(String str, Object obj) {
        if (str == null) {
            throw new IllegalArgumentException("No key specified");
        }
        this.f8952c.put(str, obj);
    }

    @Override // com.applovin.adview.AppLovinInterstitialAdDialog
    public void show() {
        a(new a());
    }

    @Override // com.applovin.adview.AppLovinInterstitialAdDialog
    public void showAndRender(AppLovinAd appLovinAd) {
        if (appLovinAd.getType() != AppLovinAdType.INCENTIVIZED) {
            Map mapA = h2.a((AppLovinAdImpl) appLovinAd);
            CollectionUtils.putStringIfValid("source", "showInterstitialAd", mapA);
            this.f8950a.g().d(f2.D, mapA);
        }
        AppLovinAd appLovinAdA = q7.a(appLovinAd, this.f8950a);
        Context contextE = e();
        String strA = a(appLovinAdA, appLovinAd, contextE);
        if (StringUtils.isValidString(strA)) {
            a("interstitialAdShowFailed", strA, appLovinAd);
        } else {
            if (((Boolean) this.f8950a.a(z4.f10128d6)).booleanValue() && a((com.applovin.impl.sdk.ad.b) appLovinAdA)) {
                return;
            }
            a((com.applovin.impl.sdk.ad.b) appLovinAdA, contextE);
        }
    }

    public String toString() {
        return "AppLovinInterstitialAdDialog{}";
    }

    private Context e() {
        return (Context) this.f8951b.get();
    }

    public AppLovinAdDisplayListener c() {
        return this.f8954e;
    }

    public AppLovinAdVideoPlaybackListener d() {
        return this.f8955f;
    }

    public com.applovin.impl.sdk.ad.b f() {
        return this.f8957h;
    }

    public AppLovinAdClickListener b() {
        return this.f8956g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(com.applovin.impl.sdk.ad.b bVar) {
        if (((Boolean) this.f8950a.a(z4.U6)).booleanValue()) {
            if (AppRestartDuringAdDetectionService.a()) {
                this.f8950a.x0().a(f2.f7869n);
                return;
            }
            bVar.p0();
        }
        this.f8950a.Q();
        if (com.applovin.impl.sdk.p.a()) {
            this.f8950a.Q().a("InterstitialAdDialogWrapper", "Re-showing the current ad after app launch.");
        }
        showAndRender(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(androidx.lifecycle.o oVar, AppLovinAd appLovinAd, ViewGroup viewGroup, Activity activity) {
        a((com.applovin.impl.sdk.ad.b) appLovinAd, viewGroup, new AppLovinFullscreenAdViewObserver(oVar, this), activity);
    }

    public boolean a(com.applovin.impl.sdk.ad.b bVar) {
        List listA = q7.a(!bVar.A0(), bVar, this.f8950a, com.applovin.impl.sdk.l.p());
        if (listA.isEmpty()) {
            return false;
        }
        if (((Boolean) this.f8950a.a(z4.X0)).booleanValue() && !q7.a(listA, bVar)) {
            a(listA, (com.applovin.impl.sdk.ad.a) bVar);
            return false;
        }
        String str = "Missing ad resources: " + listA;
        if (((Boolean) this.f8950a.a(z4.Z5)).booleanValue()) {
            com.applovin.impl.sdk.p.h("InterstitialAdDialogWrapper", "Failing ad display due to missing resources: " + listA);
            a("missingCachedAdResources", str, bVar);
            HashMap<String, String> mapHashMap = CollectionUtils.hashMap("error_message", str);
            CollectionUtils.putStringIfValid("details", "Failing ad display", mapHashMap);
            this.f8950a.E().a(f2.U0, "missingCachedAdResources", mapHashMap);
            return true;
        }
        com.applovin.impl.sdk.p.h("InterstitialAdDialogWrapper", "Streaming ad due to missing ad resources: " + listA);
        bVar.C0();
        HashMap<String, String> mapHashMap2 = CollectionUtils.hashMap("error_message", str);
        CollectionUtils.putStringIfValid("details", "Streaming ad", mapHashMap2);
        this.f8950a.E().a(f2.U0, "missingCachedAdResources", mapHashMap2);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(com.applovin.impl.sdk.ad.b bVar, AppLovinAdDisplayListener appLovinAdDisplayListener, String str, Throwable th2, AppLovinFullscreenAdViewObserver appLovinFullscreenAdViewObserver) {
        appLovinFullscreenAdViewObserver.onDestroy();
        a(bVar, appLovinAdDisplayListener, str, th2, (AppLovinFullscreenActivity) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(Context context) {
        Intent intent = new Intent(context, (Class<?>) (this.f8957h.H0() ? AppLovinFullscreenImmersiveActivity.class : AppLovinFullscreenActivity.class));
        intent.putExtra("com.applovin.interstitial.sdk_key", this.f8950a.k0());
        AppLovinFullscreenActivity.parentInterstitialWrapper = this;
        if (this.f8950a.e().a() == null && ((Boolean) this.f8950a.a(z4.f10246s2)).booleanValue()) {
            intent.addFlags(8388608);
        }
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        if (context instanceof Activity) {
            context.startActivity(intent);
            ((Activity) context).overridePendingTransition(0, 0);
        } else {
            intent.addFlags(268435456);
            context.startActivity(intent);
        }
        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
    }

    @Override // com.applovin.adview.AppLovinInterstitialAdDialog
    public void showAndRender(AppLovinAd appLovinAd, ViewGroup viewGroup, androidx.lifecycle.o oVar) {
        if (appLovinAd.getType() != AppLovinAdType.INCENTIVIZED) {
            Map mapA = h2.a((AppLovinAdImpl) appLovinAd);
            CollectionUtils.putStringIfValid("source", "showInterstitialAdView", mapA);
            this.f8950a.g().d(f2.D, mapA);
        }
        if (viewGroup != null && oVar != null) {
            AppLovinAd appLovinAdA = q7.a(appLovinAd, this.f8950a);
            Activity activityW0 = this.f8950a.w0();
            String strA = a(appLovinAdA, appLovinAd, activityW0);
            if (StringUtils.isValidString(strA)) {
                a("interstitialAdShowFailed", strA, appLovinAd);
                return;
            } else {
                if (((Boolean) this.f8950a.a(z4.f10128d6)).booleanValue() && a((com.applovin.impl.sdk.ad.b) appLovinAdA)) {
                    return;
                }
                AppLovinSdkUtils.runOnUiThread(new z8(this, oVar, appLovinAdA, viewGroup, activityW0, 3));
                return;
            }
        }
        com.applovin.impl.sdk.p.h("InterstitialAdDialogWrapper", "Failed to show interstitial: attempting to show ad with null container view or lifecycle object");
        a("interstitialAdShowFailed", "Failed to show interstitial: attempting to show ad with null container view or lifecycle object", appLovinAd);
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class b implements y1.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Activity f8959a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ AppLovinFullscreenAdViewObserver f8960b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ViewGroup f8961c;

        public b(Activity activity, AppLovinFullscreenAdViewObserver appLovinFullscreenAdViewObserver, ViewGroup viewGroup) {
            this.f8959a = activity;
            this.f8960b = appLovinFullscreenAdViewObserver;
            this.f8961c = viewGroup;
        }

        @Override // com.applovin.impl.y1.g
        public void a(y1 y1Var) {
            if (d.d(this.f8959a)) {
                com.applovin.impl.sdk.p.h("InterstitialAdDialogWrapper", "Failed to show interstitial: attempting to show ad when parent activity is finishing");
                p2.b(p2.this.f8957h, p2.this.f8954e, "Failed to show interstitial: attempting to show ad when parent activity is finishing", null, this.f8960b);
                HashMap<String, String> mapHashMap = CollectionUtils.hashMap("source", "invalidActivity");
                CollectionUtils.putStringIfValid("error_message", "Failed to show interstitial: attempting to show ad when parent activity is finishing", mapHashMap);
                p2.this.f8950a.g().a(f2.G, p2.this.f8957h, mapHashMap);
                return;
            }
            this.f8960b.setPresenter(y1Var);
            try {
                y1Var.a(this.f8961c);
            } catch (Throwable th2) {
                String str = "Failed to show interstitial: presenter threw exception " + th2;
                com.applovin.impl.sdk.p.h("InterstitialAdDialogWrapper", str);
                p2.b(p2.this.f8957h, p2.this.f8954e, str, th2, this.f8960b);
                HashMap<String, String> mapHashMap2 = CollectionUtils.hashMap("source", "presentContainerView");
                CollectionUtils.putStringIfValid("error_message", str, mapHashMap2);
                CollectionUtils.putStringIfValid("top_main_method", th2.toString(), mapHashMap2);
                p2.this.f8950a.g().a(f2.G, p2.this.f8957h, mapHashMap2);
            }
        }

        @Override // com.applovin.impl.y1.g
        public void a(String str, Throwable th2) {
            p2.b(p2.this.f8957h, p2.this.f8954e, str, th2, this.f8960b);
            HashMap<String, String> mapHashMap = CollectionUtils.hashMap("source", "renderInterstitialAdView");
            CollectionUtils.putStringIfValid("error_message", str, mapHashMap);
            CollectionUtils.putStringIfValid("top_main_method", th2.toString(), mapHashMap);
            p2.this.f8950a.g().a(f2.G, p2.this.f8957h, mapHashMap);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(AppLovinAd appLovinAd) {
        AppLovinSdkUtils.runOnUiThread(new x8(14, this, appLovinAd));
    }

    private void a(List list, com.applovin.impl.sdk.ad.a aVar) {
        this.f8950a.Q();
        if (com.applovin.impl.sdk.p.a()) {
            this.f8950a.Q().a("InterstitialAdDialogWrapper", "Restoring original URLs for missing non-required cached resources: " + list);
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        aVar.b(list);
        HashMap<String, String> mapHashMap = CollectionUtils.hashMap("duration_ms", String.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
        CollectionUtils.putStringIfValid("details", list.toString(), mapHashMap);
        this.f8950a.g().a(f2.L, aVar, mapHashMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i10) {
        AppLovinSdkUtils.runOnUiThread(new l9(i10, 1, this));
    }

    public static void a(com.applovin.impl.sdk.ad.b bVar, AppLovinAdDisplayListener appLovinAdDisplayListener, String str, Throwable th2, AppLovinFullscreenActivity appLovinFullscreenActivity) {
        com.applovin.impl.sdk.p.c("InterstitialAdDialogWrapper", str, th2);
        if (appLovinAdDisplayListener instanceof n2) {
            v2.a(appLovinAdDisplayListener, str);
        } else {
            v2.b(appLovinAdDisplayListener, bVar);
        }
        if (appLovinFullscreenActivity != null) {
            appLovinFullscreenActivity.dismiss("failed_to_display_ad");
        }
    }

    public void a() {
        this.f8956g = null;
        this.f8953d = null;
        this.f8955f = null;
        this.f8954e = null;
    }

    private void a(AppLovinAdLoadListener appLovinAdLoadListener) {
        this.f8950a.l().loadNextAd(AppLovinAdSize.INTERSTITIAL, appLovinAdLoadListener);
    }

    private String a(AppLovinAd appLovinAd, AppLovinAd appLovinAd2, Context context) {
        if (context == null) {
            com.applovin.impl.sdk.p.h("InterstitialAdDialogWrapper", "Failed to show interstitial: stale activity reference provided");
            return "Failed to show interstitial: stale activity reference provided";
        }
        if (appLovinAd == null) {
            com.applovin.impl.sdk.p.h("InterstitialAdDialogWrapper", "Unable to retrieve the loaded ad: " + appLovinAd2);
            return "Unable to retrieve the loaded ad";
        }
        if (!((AppLovinAdImpl) appLovinAd).hasShown() || !((Boolean) this.f8950a.a(z4.M1)).booleanValue()) {
            return null;
        }
        com.applovin.impl.sdk.p.h("InterstitialAdDialogWrapper", "Attempting to show ad again: " + appLovinAd);
        return "Attempting to show ad again";
    }

    private void a(com.applovin.impl.sdk.ad.b bVar, Context context) {
        this.f8950a.f().a(bVar);
        this.f8957h = bVar;
        long jG = g();
        this.f8950a.Q();
        if (com.applovin.impl.sdk.p.a()) {
            this.f8950a.Q().a("InterstitialAdDialogWrapper", defpackage.e.j(jG, "Presenting ad with delay ", "ms..."));
        }
        if (((Boolean) this.f8950a.a(z4.f10107b1)).booleanValue()) {
            this.f8950a.i().a(this.f8957h);
        }
        new Handler(Looper.getMainLooper()).postDelayed(new x8(16, this, context), jG);
    }

    private void a(com.applovin.impl.sdk.ad.b bVar, ViewGroup viewGroup, AppLovinFullscreenAdViewObserver appLovinFullscreenAdViewObserver, Activity activity) {
        this.f8950a.f().a(bVar);
        this.f8957h = bVar;
        long jG = g();
        this.f8950a.Q();
        if (com.applovin.impl.sdk.p.a()) {
            this.f8950a.Q().a("InterstitialAdDialogWrapper", defpackage.e.j(jG, "Presenting ad with delay ", "ms..."));
        }
        if (((Boolean) this.f8950a.a(z4.f10107b1)).booleanValue()) {
            this.f8950a.i().a(this.f8957h);
        }
        new Handler(Looper.getMainLooper()).postDelayed(new bc.r(this, viewGroup, activity, appLovinFullscreenAdViewObserver, 8), jG);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(ViewGroup viewGroup, Activity activity, AppLovinFullscreenAdViewObserver appLovinFullscreenAdViewObserver) {
        this.f8950a.Q();
        if (com.applovin.impl.sdk.p.a()) {
            this.f8950a.Q().a("InterstitialAdDialogWrapper", "Presenting ad in a containerView(" + viewGroup + ")");
        }
        viewGroup.setBackgroundColor(-16777216);
        y1.a(this.f8957h, this.f8956g, this.f8954e, this.f8955f, this.f8952c, this.f8950a, activity, new b(activity, appLovinFullscreenAdViewObserver, viewGroup));
    }

    private void a(String str, String str2, AppLovinAd appLovinAd) {
        if (this.f8954e != null) {
            if (this.f8954e instanceof n2) {
                ((n2) this.f8954e).onAdDisplayFailed(str2);
            } else {
                this.f8954e.adHidden(appLovinAd);
            }
        }
        Map mapA = h2.a((AppLovinAdImpl) appLovinAd);
        CollectionUtils.putStringIfValid("source", str, mapA);
        CollectionUtils.putStringIfValid("error_message", str2, mapA);
        this.f8950a.g().d(f2.G, mapA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(AppLovinAd appLovinAd) {
        if (this.f8953d != null) {
            this.f8953d.adReceived(appLovinAd);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(int i10) {
        if (this.f8953d != null) {
            this.f8953d.failedToReceiveAd(i10);
        }
    }
}
