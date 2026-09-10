package com.applovin.impl.sdk;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.net.Uri;
import android.os.StrictMode;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.applovin.adview.AppLovinAdView;
import com.applovin.impl.a6;
import com.applovin.impl.b5;
import com.applovin.impl.c6;
import com.applovin.impl.f2;
import com.applovin.impl.f6;
import com.applovin.impl.g6;
import com.applovin.impl.g8;
import com.applovin.impl.k5;
import com.applovin.impl.n7;
import com.applovin.impl.o2;
import com.applovin.impl.p0;
import com.applovin.impl.q7;
import com.applovin.impl.s0;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.u1;
import com.applovin.impl.v2;
import com.applovin.impl.y1;
import com.applovin.impl.z4;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdService;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import com.applovin.sdk.AppLovinBidTokenCollectionListener;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class AppLovinAdServiceImpl implements AppLovinAdService, com.applovin.impl.sdk.a.InterfaceC0015a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l f9259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p f9260b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f9261c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f9262d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map f9263e = defpackage.e.w();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final AtomicReference f9264f = new AtomicReference();

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class b implements o2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c f9265a;

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void adReceived(AppLovinAd appLovinAd) {
            if (!(appLovinAd instanceof com.applovin.impl.sdk.ad.c)) {
                AppLovinAdImpl appLovinAdImpl = (AppLovinAdImpl) appLovinAd;
                AppLovinAdServiceImpl.this.f9259a.j().a(appLovinAdImpl);
                if (appLovinAdImpl.canExpire()) {
                    AppLovinAdServiceImpl.this.f9259a.f().a(appLovinAdImpl, AppLovinAdServiceImpl.this);
                }
                appLovinAd = new com.applovin.impl.sdk.ad.c(appLovinAdImpl.getAdZone(), AppLovinAdServiceImpl.this.f9259a);
            }
            Collection hashSet = Collections.EMPTY_SET;
            synchronized (this.f9265a.f9267a) {
                try {
                    if (!this.f9265a.f9269c) {
                        hashSet = new HashSet(this.f9265a.f9270d);
                        this.f9265a.f9270d.clear();
                    }
                    c cVar = this.f9265a;
                    cVar.f9268b = false;
                    cVar.f9269c = false;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                AppLovinAdServiceImpl.this.a(appLovinAd, (AppLovinAdLoadListener) it.next());
            }
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void failedToReceiveAd(int i10) {
            failedToReceiveAdV2(new AppLovinError(i10, ""));
        }

        @Override // com.applovin.impl.o2
        public void failedToReceiveAdV2(AppLovinError appLovinError) {
            Collection hashSet = Collections.EMPTY_SET;
            synchronized (this.f9265a.f9267a) {
                try {
                    if (!this.f9265a.f9269c) {
                        hashSet = new HashSet(this.f9265a.f9270d);
                        this.f9265a.f9270d.clear();
                    }
                    c cVar = this.f9265a;
                    cVar.f9268b = false;
                    cVar.f9269c = false;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                AppLovinAdServiceImpl.this.b(appLovinError, (AppLovinAdLoadListener) it.next());
            }
        }

        private b(c cVar) {
            this.f9265a = cVar;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Object f9267a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f9268b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f9269c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final Collection f9270d;

        private c() {
            this.f9267a = new Object();
            this.f9270d = new HashSet();
        }

        public String toString() {
            return "AdLoadState{, isWaitingForAd=" + this.f9268b + ", isReloadingExpiredAd=" + this.f9269c + ", pendingAdListeners=" + this.f9270d + '}';
        }
    }

    public AppLovinAdServiceImpl(l lVar) {
        this.f9259a = lVar;
        this.f9260b = lVar.Q();
        HashMap map = new HashMap(6);
        this.f9261c = map;
        map.put(com.applovin.impl.u.c(), new c());
        map.put(com.applovin.impl.u.k(), new c());
        map.put(com.applovin.impl.u.j(), new c());
        map.put(com.applovin.impl.u.m(), new c());
        map.put(com.applovin.impl.u.b(), new c());
        map.put(com.applovin.impl.u.h(), new c());
    }

    public void addCustomQueryParams(Map<String, String> map) {
        this.f9263e.putAll(map);
    }

    @Override // com.applovin.sdk.AppLovinAdService
    public void collectBidToken(AppLovinBidTokenCollectionListener appLovinBidTokenCollectionListener) {
        if (p.a()) {
            this.f9260b.a("AppLovinAdService", "collectBidToken(listener=" + appLovinBidTokenCollectionListener + ")");
        }
        this.f9259a.B().a(appLovinBidTokenCollectionListener);
    }

    public AppLovinAd dequeueAd(com.applovin.impl.u uVar) {
        AppLovinAdImpl appLovinAdImplA = this.f9259a.j().a(uVar);
        if (p.a()) {
            this.f9260b.a("AppLovinAdService", "Dequeued ad: " + appLovinAdImplA + " for zone: " + uVar + "...");
        }
        return appLovinAdImplA;
    }

    public JSONObject getAndResetCustomPostBody() {
        return (JSONObject) this.f9264f.getAndSet(null);
    }

    public Map<String, String> getAndResetCustomQueryParams() {
        Map<String, String> map;
        synchronized (this.f9263e) {
            map = CollectionUtils.map(this.f9263e);
            this.f9263e.clear();
        }
        return map;
    }

    @Override // com.applovin.sdk.AppLovinAdService
    public String getBidToken() {
        if (p.a()) {
            this.f9260b.a("AppLovinAdService", "getBidToken()");
        }
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        String strI = this.f9259a.B().I();
        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        if (StringUtils.isValidString(strI) && p.a()) {
            this.f9260b.a("AppLovinAdService", "Successfully retrieved bid token");
        }
        return strI;
    }

    @Override // com.applovin.sdk.AppLovinAdService
    public void loadNextAd(AppLovinAdSize appLovinAdSize, AppLovinAdLoadListener appLovinAdLoadListener) {
        a(com.applovin.impl.u.a(appLovinAdSize, AppLovinAdType.REGULAR), appLovinAdLoadListener);
    }

    @Override // com.applovin.sdk.AppLovinAdService
    public void loadNextAdForAdToken(String str, final AppLovinAdLoadListener appLovinAdLoadListener) {
        String strTrim = str != null ? str.trim() : null;
        if (TextUtils.isEmpty(strTrim)) {
            p.h("AppLovinAdService", "Empty ad token");
            c(new AppLovinError(-8, "Empty ad token"), appLovinAdLoadListener);
            return;
        }
        com.applovin.impl.k kVar = new com.applovin.impl.k(strTrim, this.f9259a);
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (kVar.c() == com.applovin.impl.k.a.REGULAR) {
            if (p.a()) {
                this.f9260b.a("AppLovinAdService", "Loading next ad for token: " + kVar);
            }
            a(new c6(kVar, jElapsedRealtime, appLovinAdLoadListener, this.f9259a));
            return;
        }
        if (kVar.c() != com.applovin.impl.k.a.AD_RESPONSE_JSON) {
            AppLovinError appLovinError = new AppLovinError(-8, "Invalid token type");
            p.h("AppLovinAdService", "Invalid token type");
            c(appLovinError, appLovinAdLoadListener);
            return;
        }
        final JSONObject jSONObjectA = kVar.a();
        if (jSONObjectA == null) {
            String str2 = "Unable to retrieve ad response JSON from token: " + kVar.b();
            AppLovinError appLovinError2 = new AppLovinError(-8, str2);
            p.h("AppLovinAdService", str2);
            c(appLovinError2, appLovinAdLoadListener);
            return;
        }
        s0.c(jSONObjectA, this.f9259a);
        s0.b(jSONObjectA, this.f9259a);
        s0.a(jSONObjectA, this.f9259a);
        this.f9259a.n().a();
        if (JsonUtils.getJSONArray(jSONObjectA, com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS, new JSONArray()).length() <= 0) {
            if (p.a()) {
                this.f9260b.b("AppLovinAdService", "No ad returned from the server for token: " + kVar);
            }
            c(AppLovinError.NO_FILL, appLovinAdLoadListener);
            return;
        }
        if (p.a()) {
            this.f9260b.a("AppLovinAdService", "Rendering ad for token: " + kVar);
        }
        final com.applovin.impl.u uVarA = q7.a(jSONObjectA, this.f9259a);
        MaxAdFormat maxAdFormatD = uVarA.d();
        if (((Boolean) this.f9259a.a(z4.f10107b1)).booleanValue() && maxAdFormatD != null && maxAdFormatD.isFullscreenAd()) {
            this.f9259a.i().a(uVarA, new e.a() { // from class: com.applovin.impl.sdk.t
                @Override // com.applovin.impl.sdk.e.a
                public final void a(com.applovin.impl.sdk.ad.b bVar) {
                    this.f9692a.a(appLovinAdLoadListener, jSONObjectA, uVarA, jElapsedRealtime, bVar);
                }
            });
        } else {
            a(new g6(jSONObjectA, uVarA, jElapsedRealtime, appLovinAdLoadListener, this.f9259a));
        }
    }

    @Override // com.applovin.sdk.AppLovinAdService
    public void loadNextAdForZoneId(String str, AppLovinAdLoadListener appLovinAdLoadListener) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("No zone id specified");
        }
        if (p.a()) {
            this.f9260b.a("AppLovinAdService", "Loading next ad of zone {" + str + "}");
        }
        a(com.applovin.impl.u.a(str), appLovinAdLoadListener);
    }

    public void loadNextIncentivizedAd(String str, AppLovinAdLoadListener appLovinAdLoadListener) {
        if (p.a()) {
            this.f9260b.a("AppLovinAdService", "Loading next incentivized ad of zone {" + str + "}");
        }
        a(com.applovin.impl.u.b(str), appLovinAdLoadListener);
    }

    public void maybeFireAppKilledWhilePlayingAdPostback() {
        Long l;
        if (((Boolean) this.f9259a.a(z4.B2)).booleanValue() && (l = (Long) this.f9259a.b(b5.N)) != null && System.currentTimeMillis() - l.longValue() <= ((Long) this.f9259a.a(z4.F2)).longValue()) {
            if (((Boolean) this.f9259a.a(z4.E2)).booleanValue() || b()) {
                a();
            }
        }
    }

    public void maybeSubmitPersistentPostbacks(List<com.applovin.impl.e> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Iterator<com.applovin.impl.e> it = list.iterator();
        while (it.hasNext()) {
            a(it.next());
        }
    }

    @Override // com.applovin.impl.sdk.a.InterfaceC0015a
    public void onAdExpired(u1 u1Var) {
        AppLovinAdImpl appLovinAdImpl = (AppLovinAdImpl) u1Var;
        com.applovin.impl.u adZone = appLovinAdImpl.getAdZone();
        if (p.a()) {
            this.f9260b.k("AppLovinAdService", "Ad expired for zone: " + adZone);
        }
        this.f9259a.j().b(appLovinAdImpl);
        if (this.f9259a.I0() || !((Boolean) this.f9259a.a(z4.h1)).booleanValue()) {
            return;
        }
        c cVarA = a(adZone);
        synchronized (cVarA.f9267a) {
            try {
                if (!cVarA.f9268b) {
                    this.f9259a.Q();
                    if (p.a()) {
                        this.f9259a.Q().a("AppLovinAdService", "Reloading ad after expiration for zone {" + adZone + "}...");
                    }
                    cVarA.f9268b = true;
                    cVarA.f9269c = true;
                    a(adZone, new b(cVarA));
                } else if (p.a()) {
                    this.f9260b.a("AppLovinAdService", "Cancelled expired ad reload. Already waiting on an ad load...");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void setCustomPostBody(JSONObject jSONObject) {
        this.f9264f.set(jSONObject);
    }

    @NonNull
    public String toString() {
        return "AppLovinAdService{adLoadStates=" + this.f9261c + '}';
    }

    public void trackAndLaunchClick(com.applovin.impl.sdk.ad.b bVar, AppLovinAdView appLovinAdView, com.applovin.impl.adview.a aVar, Uri uri, @Nullable MotionEvent motionEvent) {
        if (bVar == null) {
            if (p.a()) {
                this.f9260b.b("AppLovinAdService", "Unable to track ad view click. No ad specified");
                return;
            }
            return;
        }
        if (p.a()) {
            this.f9260b.a("AppLovinAdService", "Tracking click on an ad...");
        }
        maybeSubmitPersistentPostbacks(bVar.a(motionEvent));
        if (appLovinAdView != null && uri != null) {
            a(bVar, appLovinAdView, aVar, uri);
        } else if (p.a()) {
            this.f9260b.b("AppLovinAdService", "Unable to launch click - adView has been prematurely destroyed");
        }
    }

    public void trackAndLaunchVideoClick(com.applovin.impl.sdk.ad.b bVar, Uri uri, MotionEvent motionEvent, y1 y1Var, Context context) {
        if (bVar == null) {
            if (p.a()) {
                this.f9260b.b("AppLovinAdService", "Unable to track video click. No ad specified");
            }
        } else {
            if (p.a()) {
                this.f9260b.a("AppLovinAdService", "Tracking VIDEO click on an ad...");
            }
            maybeSubmitPersistentPostbacks(bVar.b(motionEvent));
            a(y1Var.b().getController(), uri, context);
        }
    }

    public void trackCustomTabsNavigationAborted(com.applovin.impl.sdk.ad.b bVar) {
        if (p.a()) {
            this.f9260b.a("AppLovinAdService", "Tracking Custom Tabs navigation aborted on ad...");
        }
        maybeSubmitPersistentPostbacks(bVar.getCustomTabsNavigationAbortedPostbacks());
    }

    public void trackCustomTabsNavigationFailed(com.applovin.impl.sdk.ad.b bVar) {
        if (p.a()) {
            this.f9260b.a("AppLovinAdService", "Tracking Custom Tabs navigation failed on ad...");
        }
        maybeSubmitPersistentPostbacks(bVar.getCustomTabsNavigationFailedPostbacks());
    }

    public void trackCustomTabsNavigationFinished(com.applovin.impl.sdk.ad.b bVar) {
        if (p.a()) {
            this.f9260b.a("AppLovinAdService", "Tracking Custom Tabs navigation finished on ad...");
        }
        maybeSubmitPersistentPostbacks(bVar.getCustomTabsNavigationFinishedPostbacks());
    }

    public void trackCustomTabsNavigationStarted(com.applovin.impl.sdk.ad.b bVar) {
        if (p.a()) {
            this.f9260b.a("AppLovinAdService", "Tracking Custom Tabs navigation started on ad...");
        }
        maybeSubmitPersistentPostbacks(bVar.getCustomTabsNavigationStartedPostbacks());
    }

    public void trackCustomTabsTabHidden(com.applovin.impl.sdk.ad.b bVar) {
        if (p.a()) {
            this.f9260b.a("AppLovinAdService", "Tracking Custom Tabs tab hidden on ad...");
        }
        maybeSubmitPersistentPostbacks(bVar.getCustomTabsTabHiddenPostbacks());
    }

    public void trackCustomTabsTabShown(com.applovin.impl.sdk.ad.b bVar) {
        if (p.a()) {
            this.f9260b.a("AppLovinAdService", "Tracking Custom Tabs tab shown on ad...");
        }
        maybeSubmitPersistentPostbacks(bVar.getCustomTabsTabShownPostbacks());
    }

    public void trackFullScreenAdClosed(com.applovin.impl.sdk.ad.b bVar, long j10, List<Long> list, long j11, boolean z10, int i10) {
        if (bVar == null) {
            if (p.a()) {
                this.f9260b.b("AppLovinAdService", "Unable to track ad closed. No ad specified.");
                return;
            }
            return;
        }
        if (p.a()) {
            this.f9260b.a("AppLovinAdService", "Tracking ad closed...");
        }
        List<com.applovin.impl.e> listE = bVar.e();
        if (listE == null || listE.isEmpty()) {
            if (p.a()) {
                this.f9260b.k("AppLovinAdService", "Unable to track ad closed for AD #" + bVar.getAdIdNumber() + ". Missing ad close tracking URL." + bVar.getAdIdNumber());
                return;
            }
            return;
        }
        for (com.applovin.impl.e eVar : listE) {
            String strA = a(eVar.c(), j10, j11, list, bVar.v(), z10, i10);
            String strA2 = a(eVar.a(), j10, j11, list, bVar.v(), z10, i10);
            if (StringUtils.isValidString(strA)) {
                a(new com.applovin.impl.e(strA, strA2));
            } else if (p.a()) {
                this.f9260b.b("AppLovinAdService", "Failed to parse url: " + eVar.c());
            }
        }
    }

    public void trackImpression(com.applovin.impl.sdk.ad.b bVar) {
        if (bVar == null) {
            if (p.a()) {
                this.f9260b.b("AppLovinAdService", "Unable to track impression click. No ad specified");
            }
        } else {
            if (p.a()) {
                this.f9260b.a("AppLovinAdService", "Tracking impression on ad...");
            }
            maybeSubmitPersistentPostbacks(bVar.A());
        }
    }

    public void trackNativeAdCustomTabsNavigationAborted(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        if (p.a()) {
            this.f9260b.a("AppLovinAdService", "Tracking Custom Tabs navigation aborted on native ad...");
        }
        maybeSubmitPersistentPostbacks(appLovinNativeAdImpl.getCustomTabsNavigationAbortedPostbacks());
    }

    public void trackNativeAdCustomTabsNavigationFailed(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        if (p.a()) {
            this.f9260b.a("AppLovinAdService", "Tracking Custom Tabs navigation failed on native ad...");
        }
        maybeSubmitPersistentPostbacks(appLovinNativeAdImpl.getCustomTabsNavigationFailedPostbacks());
    }

    public void trackNativeAdCustomTabsNavigationFinished(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        if (p.a()) {
            this.f9260b.a("AppLovinAdService", "Tracking Custom Tabs navigation finished on native ad...");
        }
        maybeSubmitPersistentPostbacks(appLovinNativeAdImpl.getCustomTabsNavigationFinishedPostbacks());
    }

    public void trackNativeAdCustomTabsNavigationStarted(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        if (p.a()) {
            this.f9260b.a("AppLovinAdService", "Tracking Custom Tabs navigation started on native ad...");
        }
        maybeSubmitPersistentPostbacks(appLovinNativeAdImpl.getCustomTabsNavigationStartedPostbacks());
    }

    public void trackNativeAdCustomTabsTabHidden(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        if (p.a()) {
            this.f9260b.a("AppLovinAdService", "Tracking Custom Tabs tab hidden on native ad...");
        }
        maybeSubmitPersistentPostbacks(appLovinNativeAdImpl.getCustomTabsTabHiddenPostbacks());
    }

    public void trackNativeAdCustomTabsTabShown(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        if (p.a()) {
            this.f9260b.a("AppLovinAdService", "Tracking Custom Tabs tab shown on native ad...");
        }
        maybeSubmitPersistentPostbacks(appLovinNativeAdImpl.getCustomTabsTabShownPostbacks());
    }

    public void trackVideoEnd(com.applovin.impl.sdk.ad.b bVar, long j10, int i10, boolean z10) {
        if (bVar == null) {
            if (p.a()) {
                this.f9260b.b("AppLovinAdService", "Unable to track video end. No ad specified");
                return;
            }
            return;
        }
        if (p.a()) {
            this.f9260b.a("AppLovinAdService", "Tracking video end on ad...");
        }
        List<com.applovin.impl.e> listF0 = bVar.f0();
        if (listF0 == null || listF0.isEmpty()) {
            if (p.a()) {
                this.f9260b.k("AppLovinAdService", "Unable to submit persistent postback for AD #" + bVar.getAdIdNumber() + ". Missing video end tracking URL.");
                return;
            }
            return;
        }
        String string = Long.toString(System.currentTimeMillis());
        for (com.applovin.impl.e eVar : listF0) {
            if (StringUtils.isValidString(eVar.c())) {
                String strA = a(eVar.c(), j10, i10, string, z10);
                String strA2 = a(eVar.a(), j10, i10, string, z10);
                if (strA != null) {
                    a(new com.applovin.impl.e(strA, strA2));
                } else if (p.a()) {
                    this.f9260b.b("AppLovinAdService", "Failed to parse url: " + eVar.c());
                }
            } else if (p.a()) {
                this.f9260b.k("AppLovinAdService", "Requested a postback dispatch for an empty video end URL; nothing to do...");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(AppLovinError appLovinError, AppLovinAdLoadListener appLovinAdLoadListener) {
        AppLovinSdkUtils.runOnUiThread(true, new androidx.fragment.app.d(this, appLovinError, appLovinAdLoadListener, 20));
    }

    private void c(AppLovinError appLovinError, AppLovinAdLoadListener appLovinAdLoadListener) {
        if (appLovinAdLoadListener instanceof o2) {
            ((o2) appLovinAdLoadListener).failedToReceiveAdV2(appLovinError);
        } else {
            appLovinAdLoadListener.failedToReceiveAd(appLovinError.getCode());
        }
    }

    public void loadNextAd(String str, AppLovinAdSize appLovinAdSize, AppLovinAdLoadListener appLovinAdLoadListener) {
        if (p.a()) {
            this.f9260b.a("AppLovinAdService", "Loading next ad of zone {" + str + "} with size " + appLovinAdSize);
        }
        a(com.applovin.impl.u.a(appLovinAdSize, AppLovinAdType.REGULAR, str), appLovinAdLoadListener);
    }

    private Uri b(Uri uri, String str) {
        try {
            return Uri.parse(uri.getQueryParameter(str));
        } catch (Throwable th2) {
            this.f9259a.Q();
            if (p.a()) {
                this.f9259a.Q().k("AppLovinAdService", "Unable to parse query parameter into Uri: " + str);
            }
            this.f9259a.E().a("AppLovinAdService", "buildDeepLinkPlusUrl", th2);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(AppLovinAdLoadListener appLovinAdLoadListener, JSONObject jSONObject, com.applovin.impl.u uVar, long j10, com.applovin.impl.sdk.ad.b bVar) {
        if (bVar != null) {
            AppLovinSdkUtils.runOnUiThread(new s(1, appLovinAdLoadListener, bVar));
        } else {
            a(new g6(jSONObject, uVar, j10, appLovinAdLoadListener, this.f9259a));
        }
    }

    private boolean b() {
        if (!p0.b()) {
            return true;
        }
        Context contextP = l.p();
        ApplicationExitInfo applicationExitInfo = ((ActivityManager) contextP.getSystemService("activity")).getHistoricalProcessExitReasons(contextP.getPackageName(), 0, 1).get(0);
        return applicationExitInfo.getReason() == 10 || applicationExitInfo.getReason() == 11;
    }

    private void a(com.applovin.impl.u uVar, AppLovinAdLoadListener appLovinAdLoadListener) {
        if (uVar == null) {
            throw new IllegalArgumentException("No zone specified");
        }
        if (appLovinAdLoadListener != null) {
            this.f9259a.Q();
            if (p.a()) {
                this.f9259a.Q().a("AppLovinAdService", "Loading next ad of zone {" + uVar + "}...");
            }
            c cVarA = a(uVar);
            synchronized (cVarA.f9267a) {
                try {
                    cVarA.f9270d.add(appLovinAdLoadListener);
                    if (!cVarA.f9268b) {
                        cVarA.f9268b = true;
                        a(uVar, new b(cVarA));
                    } else if (p.a()) {
                        this.f9260b.a("AppLovinAdService", "Already waiting on an ad load...");
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return;
        }
        throw new IllegalArgumentException("No callback specified");
    }

    private void a(k5 k5Var) {
        if (!this.f9259a.D0()) {
            p.j("AppLovinSdk", "Attempted to load ad before SDK initialization. Please wait until after the SDK has initialized, e.g. AppLovinSdk.initializeSdk(Context, SdkInitializationListener).");
        }
        this.f9259a.c();
        this.f9259a.s0().a(k5Var, f6.b.CORE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(AppLovinAd appLovinAd, AppLovinAdLoadListener appLovinAdLoadListener) {
        AppLovinSdkUtils.runOnUiThread(true, new androidx.fragment.app.d(this, appLovinAdLoadListener, appLovinAd, 19));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(AppLovinAdLoadListener appLovinAdLoadListener, AppLovinAd appLovinAd) {
        try {
            appLovinAdLoadListener.adReceived(appLovinAd);
        } catch (Throwable th2) {
            p.c("AppLovinAdService", "Unable to notify listener about a newly loaded ad", th2);
            this.f9259a.E().a("AppLovinAdService", "notifyAdLoadedCallback", th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(AppLovinError appLovinError, AppLovinAdLoadListener appLovinAdLoadListener) {
        try {
            c(appLovinError, appLovinAdLoadListener);
        } catch (Throwable th2) {
            p.c("AppLovinAdService", "Unable to notify listener about ad load failure", th2);
            this.f9259a.E().a("AppLovinAdService", "notifyAdLoadFailedCallback".concat(appLovinAdLoadListener instanceof o2 ? "V2" : ""), th2);
        }
    }

    private void a(com.applovin.impl.adview.a aVar, Uri uri, Context context) {
        com.applovin.impl.sdk.ad.b bVarG = aVar.g();
        if (n7.a(uri)) {
            a(uri, bVarG, aVar.i(), aVar, context, this.f9259a);
        } else if (bVarG != null && bVarG.isCustomTabsEnabled()) {
            this.f9259a.A().a(uri, aVar, this.f9259a.w0());
        } else {
            n7.b(uri, bVarG, context, this.f9259a);
        }
    }

    private void a(com.applovin.impl.sdk.ad.b bVar, AppLovinAdView appLovinAdView, com.applovin.impl.adview.a aVar, Uri uri) {
        Context context;
        if (!((Boolean) this.f9259a.a(z4.f10272w)).booleanValue() || (context = g8.b(appLovinAdView, this.f9259a)) == null) {
            context = appLovinAdView.getContext();
        }
        Context context2 = context;
        if (n7.a(uri)) {
            a(uri, bVar, appLovinAdView, aVar, context2, this.f9259a);
        } else if (bVar != null && bVar.isCustomTabsEnabled()) {
            this.f9259a.A().a(uri, aVar, this.f9259a.w0());
        } else {
            a(uri, bVar, appLovinAdView, aVar, context2);
        }
    }

    private String a(String str, long j10, int i10, String str2, boolean z10) {
        try {
            if (!StringUtils.isValidString(str)) {
                return null;
            }
            if (i10 < 0 || i10 > 100) {
                i10 = 0;
            }
            return Uri.parse(str).buildUpon().appendQueryParameter("et_s", Long.toString(j10)).appendQueryParameter("pv", Integer.toString(i10)).appendQueryParameter("vid_ts", str2).appendQueryParameter("uvs", Boolean.toString(z10)).build().toString();
        } catch (Throwable th2) {
            if (p.a()) {
                this.f9260b.a("AppLovinAdService", "Unknown error parsing the video end url: " + str, th2);
            }
            this.f9259a.E().a("AppLovinAdService", "buildVideoEndUrl", th2);
            return null;
        }
    }

    private void a(Uri uri, com.applovin.impl.sdk.ad.b bVar, AppLovinAdView appLovinAdView, com.applovin.impl.adview.a aVar, Context context) {
        if (n7.b(uri, bVar, context, this.f9259a)) {
            v2.b(aVar.e(), bVar, appLovinAdView);
        }
        aVar.w();
    }

    private void a(Uri uri, com.applovin.impl.sdk.ad.b bVar, AppLovinAdView appLovinAdView, com.applovin.impl.adview.a aVar, Context context, l lVar) {
        if (uri != null && StringUtils.isValidString(uri.getQuery())) {
            Uri uriB = b(uri, "primaryUrl");
            List listA = a(uri, "primaryTrackingUrl");
            Uri uriB2 = b(uri, "fallbackUrl");
            List listA2 = a(uri, "fallbackTrackingUrl");
            if (uriB == null && uriB2 == null) {
                lVar.Q();
                if (p.a()) {
                    lVar.Q().b("AppLovinAdService", "Failed to parse both primary and backup URLs for Deep Link+ command");
                    return;
                }
                return;
            }
            if (!a(uriB, "primary", listA, bVar, appLovinAdView, aVar, context, lVar)) {
                a(uriB2, "backup", listA2, bVar, appLovinAdView, aVar, context, lVar);
            }
            if (aVar != null) {
                aVar.w();
                return;
            }
            return;
        }
        lVar.Q();
        if (p.a()) {
            lVar.Q().b("AppLovinAdService", "Failed to execute Deep Link+ command - no query parameters found");
        }
    }

    private boolean a(Uri uri, String str, List list, com.applovin.impl.sdk.ad.b bVar, AppLovinAdView appLovinAdView, com.applovin.impl.adview.a aVar, Context context, l lVar) {
        lVar.Q();
        if (p.a()) {
            lVar.Q().a("AppLovinAdService", "Opening " + str + " URL: " + uri);
        }
        boolean zB = n7.b(uri, bVar, context, lVar);
        if (zB) {
            lVar.Q();
            if (p.a()) {
                lVar.Q().a("AppLovinAdService", "URL opened successfully, dispatching tracking URLs: " + list);
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                lVar.i0().dispatchPostbackAsync(((Uri) it.next()).toString(), null);
            }
            if (aVar != null) {
                v2.b(aVar.e(), bVar, appLovinAdView);
                return zB;
            }
        } else {
            lVar.Q();
            if (p.a()) {
                lVar.Q().b("AppLovinAdService", "URL failed to open");
            }
        }
        return zB;
    }

    private List a(Uri uri, String str) {
        List<String> queryParameters = uri.getQueryParameters(str);
        ArrayList arrayList = new ArrayList(queryParameters.size());
        Iterator<String> it = queryParameters.iterator();
        while (it.hasNext()) {
            try {
                arrayList.add(Uri.parse(it.next()));
            } catch (Throwable th2) {
                this.f9259a.Q();
                if (p.a()) {
                    this.f9259a.Q().k("AppLovinAdService", "Unable to parse query parameter into Uri: " + str);
                }
                this.f9259a.E().a("AppLovinAdService", "buildDeepLinkPlusUrlList", th2);
            }
        }
        return arrayList;
    }

    private String a(String str, long j10, long j11, List list, String str2, boolean z10, int i10) {
        if (!StringUtils.isValidString(str)) {
            return null;
        }
        Uri.Builder builderAppendQueryParameter = Uri.parse(str).buildUpon().appendQueryParameter("et_ms", Long.toString(j10)).appendQueryParameter("vs_ms", Long.toString(j11));
        if (list != null && list.size() > 0) {
            builderAppendQueryParameter.appendQueryParameter("ec_ms", list.toString());
        }
        if (StringUtils.isValidString(str2)) {
            builderAppendQueryParameter.appendQueryParameter("ds", str2);
        }
        if (i10 != j.f9463h) {
            builderAppendQueryParameter.appendQueryParameter("musw_ch", Boolean.toString(z10));
            builderAppendQueryParameter.appendQueryParameter("musw_st", Boolean.toString(j.a(i10)));
        }
        return builderAppendQueryParameter.build().toString();
    }

    private void a() {
        Map<String, String> mapTryToStringMap;
        if (p.a()) {
            this.f9260b.a("AppLovinAdService", "Tracking app killed during ad from previous run.");
        }
        String str = (String) this.f9259a.b(b5.Q);
        if (TextUtils.isEmpty(str)) {
            if (p.a()) {
                this.f9260b.a("AppLovinAdService", "Couldn't get last ad data. Tracking event with empty data.");
            }
            mapTryToStringMap = null;
        } else {
            mapTryToStringMap = JsonUtils.tryToStringMap(JsonUtils.jsonObjectFromJsonString(str, new JSONObject()));
        }
        this.f9259a.E().d(f2.P0, mapTryToStringMap);
        String str2 = (String) this.f9259a.b(b5.P);
        if (str2 != null) {
            JSONObject jSONObjectJsonObjectFromJsonString = JsonUtils.jsonObjectFromJsonString(str2, null);
            String string = JsonUtils.getString(jSONObjectJsonObjectFromJsonString, "app_killed_postback_url", null);
            String string2 = JsonUtils.getString(jSONObjectJsonObjectFromJsonString, "app_killed_postback_backup_url", null);
            Long l = (Long) this.f9259a.b(b5.O);
            if (l != null) {
                string = StringUtils.appendQueryParameter(string, "imp_duration_ms", String.valueOf(l));
                string2 = StringUtils.appendQueryParameter(string2, "imp_duration_ms", String.valueOf(l));
            }
            a(new com.applovin.impl.e(string, string2));
            return;
        }
        if (p.a()) {
            this.f9260b.k("AppLovinAdService", "Unable to track app killed during ad from previous run. Missing app killed tracking URLs.");
        }
    }

    private void a(com.applovin.impl.e eVar) {
        if (StringUtils.isValidString(eVar.c())) {
            this.f9259a.h0().e(com.applovin.impl.sdk.network.d.b().d(eVar.c()).a(StringUtils.isValidString(eVar.a()) ? eVar.a() : null).a(eVar.b()).a(false).b(eVar.d()).a());
        } else if (p.a()) {
            this.f9260b.k("AppLovinAdService", "Requested a postback dispatch for a null URL; nothing to do...");
        }
    }

    private void a(final com.applovin.impl.u uVar, final b bVar) {
        AppLovinAdImpl appLovinAdImplE = this.f9259a.j().e(uVar);
        if (appLovinAdImplE != null && !appLovinAdImplE.isExpired()) {
            if (p.a()) {
                this.f9260b.a("AppLovinAdService", "Using pre-loaded ad: " + appLovinAdImplE + " for " + uVar);
            }
            bVar.adReceived(appLovinAdImplE);
            return;
        }
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        MaxAdFormat maxAdFormatD = uVar.d();
        if (((Boolean) this.f9259a.a(z4.f10107b1)).booleanValue() && maxAdFormatD != null && maxAdFormatD.isFullscreenAd()) {
            this.f9259a.i().a(uVar, new e.a() { // from class: com.applovin.impl.sdk.u
                @Override // com.applovin.impl.sdk.e.a
                public final void a(com.applovin.impl.sdk.ad.b bVar2) {
                    this.f9697a.a(bVar, uVar, jElapsedRealtime, bVar2);
                }
            });
        } else {
            a(new a6(uVar, jElapsedRealtime, bVar, this.f9259a));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(b bVar, com.applovin.impl.u uVar, long j10, com.applovin.impl.sdk.ad.b bVar2) {
        if (bVar2 != null) {
            AppLovinSdkUtils.runOnUiThread(new s(0, bVar, bVar2));
        } else {
            a(new a6(uVar, j10, bVar, this.f9259a));
        }
    }

    private c a(com.applovin.impl.u uVar) {
        c cVar;
        synchronized (this.f9262d) {
            try {
                cVar = (c) this.f9261c.get(uVar);
                if (cVar == null) {
                    cVar = new c();
                    this.f9261c.put(uVar, cVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return cVar;
    }
}
