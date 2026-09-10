package com.applovin.impl.mediation;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.applovin.impl.a3;
import com.applovin.impl.b5;
import com.applovin.impl.c3;
import com.applovin.impl.d5;
import com.applovin.impl.d6;
import com.applovin.impl.e3;
import com.applovin.impl.e5;
import com.applovin.impl.f2;
import com.applovin.impl.f5;
import com.applovin.impl.f6;
import com.applovin.impl.h2;
import com.applovin.impl.j3;
import com.applovin.impl.k5;
import com.applovin.impl.l6;
import com.applovin.impl.m3;
import com.applovin.impl.q6;
import com.applovin.impl.q7;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.t3;
import com.applovin.impl.u3;
import com.applovin.impl.u4;
import com.applovin.impl.v2;
import com.applovin.impl.v3;
import com.applovin.impl.x6;
import com.applovin.impl.y3;
import com.applovin.impl.z4;
import com.applovin.impl.z8;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdRequestListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxMediatedNetworkInfo;
import com.applovin.mediation.MaxNetworkResponseInfo;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.MaxRewardedAdListener;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class MediationServiceImpl implements AppLovinBroadcastManager.Receiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.l f8460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.p f8461b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d5 f8462c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AtomicReference f8463d = new AtomicReference();

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f8464a;

        static {
            int[] iArr = new int[MaxAdapter.InitializationStatus.values().length];
            f8464a = iArr;
            try {
                iArr[MaxAdapter.InitializationStatus.DOES_NOT_APPLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8464a[MaxAdapter.InitializationStatus.INITIALIZED_SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8464a[MaxAdapter.InitializationStatus.INITIALIZED_UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f8464a[MaxAdapter.InitializationStatus.INITIALIZED_FAILURE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f8464a[MaxAdapter.InitializationStatus.NOT_INITIALIZED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f8464a[MaxAdapter.InitializationStatus.INITIALIZING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class b implements MaxAdListener, MaxRewardedAdListener, MaxAdViewAdListener, MaxAdRevenueListener, com.applovin.impl.mediation.ads.a.InterfaceC0010a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final a3 f8465a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private com.applovin.impl.mediation.ads.a.InterfaceC0010a f8466b;

        public b(a3 a3Var, com.applovin.impl.mediation.ads.a.InterfaceC0010a interfaceC0010a) {
            this.f8465a = a3Var;
            this.f8466b = interfaceC0010a;
        }

        public void b(MaxAd maxAd, Bundle bundle) {
            this.f8465a.a(bundle);
            v2.b(this.f8466b, maxAd);
        }

        public void c(MaxAd maxAd, Bundle bundle) {
            this.f8465a.a(bundle);
            this.f8465a.e0();
            com.applovin.impl.sdk.p unused = MediationServiceImpl.this.f8461b;
            if (com.applovin.impl.sdk.p.a()) {
                MediationServiceImpl.this.f8461b.a("MediationService", "Scheduling impression for ad via callback...");
            }
            MediationServiceImpl.this.processCallbackAdImpressionPostback(this.f8465a, this.f8466b);
            if (!((Boolean) MediationServiceImpl.this.f8460a.a(t3.D8)).booleanValue() || this.f8465a.u().compareAndSet(false, true)) {
                MediationServiceImpl.this.f8460a.m().a(this.f8465a, com.applovin.impl.sdk.h.c.SHOW);
                MediationServiceImpl.this.f8460a.u().b(this.f8465a, "DID_DISPLAY");
                if (maxAd.getFormat().isFullscreenAd()) {
                    MediationServiceImpl.this.f8460a.J().a(this.f8465a);
                }
                v2.c(this.f8466b, maxAd);
            }
        }

        public void d(MaxAd maxAd, Bundle bundle) {
            this.f8465a.a(bundle);
            v2.d(this.f8466b, maxAd);
        }

        public void e(MaxAd maxAd, Bundle bundle) {
            this.f8465a.a(bundle);
            this.f8465a.f0();
            MediationServiceImpl.this.f8460a.m().a(this.f8465a, com.applovin.impl.sdk.h.c.HIDE);
            MediationServiceImpl.this.a(this.f8465a);
            AppLovinSdkUtils.runOnUiThreadDelayed(new s(1, this, maxAd), maxAd instanceof e3 ? ((e3) maxAd).o0() : 0L);
        }

        public void f(MaxAd maxAd, Bundle bundle) {
            this.f8465a.a(bundle);
            this.f8465a.h0();
            MediationServiceImpl.this.f8460a.m().a(this.f8465a, com.applovin.impl.sdk.h.c.LOAD);
            MediationServiceImpl.this.b(this.f8465a);
            v2.f(this.f8466b, maxAd);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdClicked(MaxAd maxAd) {
            a(maxAd, (Bundle) null);
        }

        @Override // com.applovin.mediation.MaxAdViewAdListener
        public void onAdCollapsed(MaxAd maxAd) {
            b(maxAd, null);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
            a(maxAd, maxError, (Bundle) null);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayed(MaxAd maxAd) {
            c(maxAd, null);
        }

        @Override // com.applovin.mediation.MaxAdViewAdListener
        public void onAdExpanded(MaxAd maxAd) {
            d(maxAd, null);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdHidden(MaxAd maxAd) {
            e(maxAd, null);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoadFailed(String str, MaxError maxError) {
            this.f8465a.h0();
            MediationServiceImpl.this.b(this.f8465a, maxError, this.f8466b);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoaded(MaxAd maxAd) {
            f(maxAd, null);
        }

        @Override // com.applovin.mediation.MaxRewardedAdListener
        public void onUserRewarded(MaxAd maxAd, MaxReward maxReward) {
            a(maxAd, maxReward, (Bundle) null);
        }

        public void a(com.applovin.impl.mediation.ads.a.InterfaceC0010a interfaceC0010a) {
            this.f8466b = interfaceC0010a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(MaxAd maxAd) {
            if (maxAd.getFormat().isFullscreenAd()) {
                MediationServiceImpl.this.f8460a.J().b(maxAd);
            }
            v2.e(this.f8466b, maxAd);
        }

        public void a(MaxAd maxAd, Bundle bundle) {
            this.f8465a.a(bundle);
            MediationServiceImpl.this.f8460a.m().a(this.f8465a, com.applovin.impl.sdk.h.c.CLICK);
            MediationServiceImpl.this.a(this.f8465a, this.f8466b);
            v2.a((MaxAdListener) this.f8466b, maxAd);
        }

        public void a(MaxAd maxAd, MaxError maxError, Bundle bundle) {
            this.f8465a.a(bundle);
            this.f8465a.d0();
            MediationServiceImpl.this.a(this.f8465a, maxError, this.f8466b);
            if (maxAd.getFormat() == MaxAdFormat.REWARDED && (maxAd instanceof e3)) {
                ((e3) maxAd).m0();
            }
        }

        public void a(MaxAd maxAd, MaxReward maxReward, Bundle bundle) {
            this.f8465a.a(bundle);
            v2.a(this.f8466b, maxAd, maxReward);
            MediationServiceImpl.this.f8460a.s0().a((k5) new q6((e3) maxAd, MediationServiceImpl.this.f8460a), f6.b.OTHER);
        }

        @Override // com.applovin.mediation.MaxAdRequestListener
        public void onAdRequestStarted(String str) {
        }

        @Override // com.applovin.mediation.MaxAdRevenueListener
        public void onAdRevenuePaid(MaxAd maxAd) {
        }
    }

    public MediationServiceImpl(com.applovin.impl.sdk.l lVar) {
        this.f8460a = lVar;
        this.f8461b = lVar.Q();
        this.f8462c = new d5(lVar);
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.render_process_gone"));
    }

    public void collectSignal(final f5 f5Var, Context context, final e5.a aVar) {
        if (f5Var == null) {
            throw new IllegalArgumentException("No spec specified");
        }
        if (context == null) {
            throw new IllegalArgumentException("No context specified");
        }
        if (aVar == null) {
            throw new IllegalArgumentException("No callback specified");
        }
        c3 c3VarU = f5Var.u();
        final String strB = c3VarU.b();
        final MaxAdFormat maxAdFormatA = c3VarU.a();
        e5 e5VarB = this.f8462c.b(f5Var, strB, maxAdFormatA);
        if (e5VarB != null) {
            aVar.a(e5.a(e5VarB));
            return;
        }
        final h hVarA = this.f8460a.V().a(f5Var, f5Var.A());
        if (hVarA == null) {
            aVar.a(e5.a(f5Var, new MaxErrorImpl("Could not load adapter")));
            return;
        }
        u4 u4Var = new u4("SignalCollection:" + f5Var.c());
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        Executor executor = u4.f9832j;
        u4Var.a(executor, new u4.b() { // from class: com.applovin.impl.mediation.k
            @Override // com.applovin.impl.u4.b
            public final void a(boolean z10, Object obj, Object obj2) {
                this.f8747a.a(jElapsedRealtime, hVarA, strB, f5Var, maxAdFormatA, aVar, z10, (String) obj, (MaxError) obj2);
            }
        });
        l6.a(f5Var.m(), u4Var, new MaxErrorImpl(MaxAdapterError.ERROR_CODE_SIGNAL_COLLECTION_TIMEOUT, "The adapter (" + f5Var.c() + ") timed out collecting signal"), "MediationService", this.f8460a);
        Activity activityW0 = context instanceof Activity ? (Activity) context : this.f8460a.w0();
        MaxAdapterParametersImpl maxAdapterParametersImplA = MaxAdapterParametersImpl.a(f5Var, strB, maxAdFormatA);
        if (f5Var.w()) {
            u4 u4VarA = this.f8460a.U().a(f5Var, activityW0);
            u4VarA.a(executor, new l(this, u4Var, hVarA, maxAdapterParametersImplA, f5Var, activityW0, 0));
            u4VarA.a(executor, new m(this, hVarA, u4Var, 0));
            return;
        }
        if (f5Var.x()) {
            u4 u4VarA2 = this.f8460a.U().a(f5Var, activityW0);
            if (u4VarA2.e() && !f5Var.z()) {
                if (com.applovin.impl.sdk.p.a()) {
                    this.f8461b.b("MediationService", "Skip collecting signal for failed-initialized adapter: " + hVarA.g());
                }
                u4Var.a(new MaxErrorImpl("Could not initialize adapter: " + ((String) u4VarA2.b())));
                return;
            }
        }
        if (com.applovin.impl.sdk.p.a()) {
            this.f8461b.a("MediationService", "Collecting signal for adapter: " + hVarA.g());
        }
        hVarA.a(maxAdapterParametersImplA, f5Var, activityW0, u4Var);
    }

    public void destroyAd(MaxAd maxAd) {
        if (maxAd instanceof a3) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f8461b.d("MediationService", "Destroying " + maxAd);
            }
            a3 a3Var = (a3) maxAd;
            h hVarB = a3Var.B();
            if (hVarB != null) {
                hVarB.a();
                a3Var.t();
            }
            this.f8460a.k().c(a3Var.T());
            this.f8460a.m().a(a3Var, com.applovin.impl.sdk.h.c.DESTROY);
        }
    }

    public JSONObject getAndResetCustomPostBodyData() {
        return (JSONObject) this.f8463d.getAndSet(null);
    }

    public void loadAd(String str, @Nullable String str2, MaxAdFormat maxAdFormat, com.applovin.impl.i iVar, Map<String, Object> map, Map<String, Object> map2, Context context, com.applovin.impl.mediation.ads.a.InterfaceC0010a interfaceC0010a) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("No Ad Unit ID specified");
        }
        if (context == null) {
            throw new IllegalArgumentException("No context specified");
        }
        if (interfaceC0010a == null) {
            throw new IllegalArgumentException("No listener specified");
        }
        if (TextUtils.isEmpty(this.f8460a.X())) {
            com.applovin.impl.sdk.p.h("AppLovinSdk", "Mediation provider is null. Please set the mediation provider in the AppLovinSdkInitializationConfiguration.Builder when initializing the AppLovinSDK.");
        }
        if (!this.f8460a.D0()) {
            com.applovin.impl.sdk.p.j("AppLovinSdk", "Attempted to load ad before SDK initialization. Please wait until after the SDK has initialized, e.g. AppLovinSdk.initializeSdk(Context, SdkInitializationListener).");
        }
        List<String> adUnitIds = this.f8460a.L() != null ? this.f8460a.L().getAdUnitIds() : null;
        boolean zStartsWith = str.startsWith("test_mode");
        if (adUnitIds != null && adUnitIds.size() > 0 && !adUnitIds.contains(str) && !zStartsWith) {
            if (q7.c(this.f8460a)) {
                String strO = defpackage.e.o("Ad Unit ID ", str, " has not been initialized. When you use selective init, any ad units that you do not explicitly specify are excluded from serving ads for the current session. For more information visit our docs: https://support.axon.ai/en/max/android/overview/advanced-settings#selective-init");
                if (((Boolean) this.f8460a.a(z4.F6)).booleanValue()) {
                    throw new RuntimeException(strO);
                }
                if (com.applovin.impl.sdk.p.a()) {
                    this.f8461b.b("MediationService", strO);
                }
            }
            this.f8460a.E().a(f2.f7836a1, "uninitialized_ad_unit_id", CollectionUtils.hashMap("ad_unit_id", str), "uninitialized_ad_unit_id".concat(str));
        }
        this.f8460a.c();
        if (str.length() != 16 && !zStartsWith && !this.f8460a.k0().startsWith("05TMD")) {
            com.applovin.impl.sdk.p.h("MediationService", "Ad unit ID provided for " + maxAdFormat.getLabel() + " is invalid (" + str + "). Expected length: 16 characters.\n\nStack trace:\n" + Log.getStackTraceString(new Throwable()));
        }
        if (this.f8460a.a(maxAdFormat)) {
            com.applovin.impl.sdk.p.h("MediationService", "Ad load failed due to disabled ad format " + maxAdFormat.getLabel());
            v2.a(interfaceC0010a, str, new MaxErrorImpl(-1, "Disabled ad format " + maxAdFormat.getLabel()));
            return;
        }
        this.f8460a.W0();
        v2.a((MaxAdRequestListener) interfaceC0010a, str, true);
        if (this.f8460a.T() != null) {
            this.f8460a.T().a(str, str2, maxAdFormat, iVar, map, map2, context, interfaceC0010a);
        } else {
            this.f8460a.S().a(str, str2, maxAdFormat, iVar, map, map2, context, interfaceC0010a);
        }
    }

    public void loadThirdPartyMediatedAd(String str, a3 a3Var, Activity activity, com.applovin.impl.mediation.ads.a.InterfaceC0010a interfaceC0010a) {
        u4 u4VarA;
        if (a3Var == null) {
            throw new IllegalArgumentException("No mediated ad specified");
        }
        if (com.applovin.impl.sdk.p.a()) {
            this.f8461b.a("MediationService", "Loading " + a3Var + "...");
        }
        this.f8460a.R().a(f2.f7864l0, a3Var, CollectionUtils.hashMap("details", "sdk_initialized=" + this.f8460a.D0()));
        this.f8460a.m().a(a3Var, com.applovin.impl.sdk.h.c.LOADING);
        this.f8460a.u().b(a3Var, "WILL_LOAD");
        h hVarA = this.f8460a.V().a(a3Var);
        if (hVarA == null) {
            String str2 = "Failed to load " + a3Var + ": adapter not loaded";
            com.applovin.impl.sdk.p.h("MediationService", str2);
            b(a3Var, new MaxErrorImpl(-5001, str2), interfaceC0010a);
            return;
        }
        MaxAdapterParametersImpl maxAdapterParametersImplA = MaxAdapterParametersImpl.a(a3Var);
        if (a3Var.b0()) {
            u4VarA = this.f8460a.U().a(a3Var, activity);
        } else {
            if (a3Var.c0()) {
                this.f8460a.U().a(a3Var, activity);
            }
            u4VarA = null;
        }
        a3 a3VarA = a3Var.a(hVarA);
        hVarA.a(str, a3VarA);
        a3VarA.i0();
        if (u4VarA == null) {
            hVarA.a(str, maxAdapterParametersImplA, a3VarA, activity, new b(a3VarA, interfaceC0010a));
            return;
        }
        Executor executor = u4.f9832j;
        u4VarA.a(executor, new m(this, a3Var, interfaceC0010a, 1));
        u4VarA.a(executor, new j(this, hVarA, str, maxAdapterParametersImplA, a3VarA, activity, interfaceC0010a));
    }

    public void maybeFireAppKilledWhilePlayingMediatedAdPostback() {
        String str = (String) this.f8460a.b(b5.R);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        JSONObject jSONObjectJsonObjectFromJsonString = JsonUtils.jsonObjectFromJsonString(str, new JSONObject());
        if (a(JsonUtils.getLong(jSONObjectJsonObjectFromJsonString, "timestamp_ms", 0L))) {
            Long l = (Long) this.f8460a.b(b5.S);
            String string = l != null ? l.toString() : "";
            JSONObject jSONObject = JsonUtils.getJSONObject(jSONObjectJsonObjectFromJsonString, "ad_info");
            Map mapTryToStringMap = jSONObject != null ? JsonUtils.tryToStringMap(jSONObject) : new HashMap(1);
            CollectionUtils.putStringIfValid("duration_ms", string, mapTryToStringMap);
            this.f8460a.E().d(f2.Q0, mapTryToStringMap);
            List list = JsonUtils.getList(jSONObjectJsonObjectFromJsonString, "app_killed_urls", Collections.EMPTY_LIST);
            if (CollectionUtils.isEmpty(list)) {
                if (com.applovin.impl.sdk.p.a()) {
                    this.f8461b.k("MediationService", "Unable to track app killed during mediated ad from previous run. Missing app killed tracking URLs.");
                }
            } else {
                JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObjectJsonObjectFromJsonString, "user_info");
                Map<String, String> mapTryToStringMap2 = jSONObject2 != null ? JsonUtils.tryToStringMap(jSONObject2) : y3.c(this.f8460a);
                mapTryToStringMap2.put("{IMP_DURATION_MS}", string);
                JSONObject jSONObject3 = JsonUtils.getJSONObject(jSONObjectJsonObjectFromJsonString, "postback_body");
                a("mappk", list, (Map) mapTryToStringMap2, (Map) (jSONObject3 != null ? JsonUtils.tryToStringObjectMap(jSONObject3) : null), (MaxError) null, (m3) null, true);
            }
        }
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, @Nullable Map<String, Object> map) {
        if ("com.applovin.render_process_gone".equals(intent.getAction())) {
            Object objA = this.f8460a.J().a();
            if (objA instanceof a3) {
                a((MaxError) MaxAdapterError.WEBVIEW_ERROR, (a3) objA, true);
            }
        }
    }

    public void processAdDisplayErrorPostbackForUserError(MaxError maxError, a3 a3Var) {
        a(maxError, a3Var, false);
    }

    public void processAdapterInitializationPostback(m3 m3Var, long j10, MaxAdapter.InitializationStatus initializationStatus, String str) {
        HashMap map = new HashMap(2);
        map.put("{INIT_STATUS}", String.valueOf(initializationStatus.getCode()));
        map.put("{INIT_TIME_MS}", String.valueOf(j10));
        a("minit", map, new MaxErrorImpl(str), m3Var);
        Map mapA = h2.a(m3Var);
        CollectionUtils.putStringIfValid("adapter_init_status", String.valueOf(initializationStatus.getCode()), mapA);
        CollectionUtils.putStringIfValid("error_message", str, mapA);
        CollectionUtils.putStringIfValid("duration_ms", String.valueOf(j10), mapA);
        switch (a.f8464a[initializationStatus.ordinal()]) {
            case 1:
            case 2:
            case 3:
                this.f8460a.R().d(f2.f7846e0, mapA);
                break;
            case 4:
                this.f8460a.R().d(f2.f7849f0, mapA);
                break;
            case 5:
            case 6:
                this.f8460a.Q();
                if (com.applovin.impl.sdk.p.a()) {
                    this.f8460a.Q().k("MediationService", "Adapter init postback called while the adapter is not fully initialized.");
                }
                this.f8460a.E().a(f2.f7842d, "adapterNotInitializedForPostback", mapA);
                break;
        }
    }

    public void processCallbackAdImpressionPostback(a3 a3Var, com.applovin.impl.mediation.ads.a.InterfaceC0010a interfaceC0010a) {
        if (a3Var.R().endsWith("cimp")) {
            this.f8460a.u().b(a3Var);
            v2.a((MaxAdRevenueListener) interfaceC0010a, (MaxAd) a3Var);
        }
        HashMap map = new HashMap(2);
        if (a3Var instanceof e3) {
            map.put("{PREVIOUS_FAILED_NETWORK_NAME}", StringUtils.emptyIfNull(((e3) a3Var).x0()));
        }
        String strEmptyIfNull = StringUtils.emptyIfNull(this.f8460a.y0().e());
        if (!((Boolean) this.f8460a.a(z4.N3)).booleanValue()) {
            strEmptyIfNull = "";
        }
        map.put("{CUID}", strEmptyIfNull);
        a("mcimp", map, a3Var);
        this.f8460a.R().a(f2.f7876q0, a3Var);
    }

    public void processRawAdImpression(a3 a3Var, com.applovin.impl.mediation.ads.a.InterfaceC0010a interfaceC0010a) {
        this.f8460a.u().b(a3Var, "WILL_DISPLAY");
        if (a3Var.R().endsWith("mimp")) {
            this.f8460a.u().b(a3Var);
            v2.a((MaxAdRevenueListener) interfaceC0010a, (MaxAd) a3Var);
        }
        if (((Boolean) this.f8460a.a(z4.R4)).booleanValue()) {
            this.f8460a.a0().a(u3.f9824g, v3.a(a3Var), Long.valueOf(System.currentTimeMillis() - this.f8460a.M()));
        }
        HashMap map = new HashMap(3);
        if (a3Var instanceof e3) {
            e3 e3Var = (e3) a3Var;
            map.put("{TIME_TO_SHOW_MS}", String.valueOf(e3Var.s0()));
            map.put("{PREVIOUS_FAILED_NETWORK_NAME}", StringUtils.emptyIfNull(e3Var.x0()));
        }
        String strEmptyIfNull = StringUtils.emptyIfNull(this.f8460a.y0().e());
        if (!((Boolean) this.f8460a.a(z4.N3)).booleanValue()) {
            strEmptyIfNull = "";
        }
        map.put("{CUID}", strEmptyIfNull);
        a("mimp", map, a3Var);
        this.f8460a.R().a(f2.f7874p0, a3Var);
    }

    public void processViewabilityAdImpressionPostback(j3 j3Var, long j10, com.applovin.impl.mediation.ads.a.InterfaceC0010a interfaceC0010a) {
        if (j3Var.R().endsWith("vimp")) {
            this.f8460a.u().b(j3Var);
            v2.a((MaxAdRevenueListener) interfaceC0010a, (MaxAd) j3Var);
        }
        HashMap map = new HashMap(3);
        map.put("{VIEWABILITY_FLAGS}", String.valueOf(j10));
        map.put("{USED_VIEWABILITY_TIMER}", String.valueOf(j3Var.t0()));
        String strEmptyIfNull = StringUtils.emptyIfNull(this.f8460a.y0().e());
        if (!((Boolean) this.f8460a.a(z4.N3)).booleanValue()) {
            strEmptyIfNull = "";
        }
        map.put("{CUID}", strEmptyIfNull);
        a("mvimp", map, j3Var);
        this.f8460a.R().a(f2.r0, j3Var);
    }

    public void processWaterfallInfoPostback(MaxAdWaterfallInfoImpl maxAdWaterfallInfoImpl, @Nullable MaxError maxError, long j10, long j11) {
        c3 requestParameters = maxAdWaterfallInfoImpl.getRequestParameters();
        String strB = requestParameters.b();
        MaxAdFormat maxAdFormatA = requestParameters.a();
        HashMap map = new HashMap();
        CollectionUtils.putStringIfValid("ad_format", maxAdFormatA.getLabel(), map);
        CollectionUtils.putStringIfValid("ad_unit_id", strB, map);
        CollectionUtils.putStringIfValid("duration_ms", String.valueOf(j11), map);
        CollectionUtils.putStringIfValid("ad_event_id", maxAdWaterfallInfoImpl.getEventId(), map);
        if (maxError != null) {
            map.putAll(h2.a(maxError));
        }
        this.f8460a.R().d(f2.f7872o0, map);
        if (CollectionUtils.isEmpty(maxAdWaterfallInfoImpl.getPostbackUrls())) {
            return;
        }
        HashMap map2 = new HashMap(8);
        CollectionUtils.putStringIfValid("mcode", maxAdWaterfallInfoImpl.getMCode(), map2);
        CollectionUtils.putStringIfValid("ad_unit_id", strB, map2);
        CollectionUtils.putStringIfValid("ad_format", maxAdFormatA.getLabel(), map2);
        CollectionUtils.putStringIfValid("name", maxAdWaterfallInfoImpl.getName(), map2);
        CollectionUtils.putLongIfValid("request_latency_ms", Long.valueOf(j11), map2);
        CollectionUtils.putLongIfValid("request_start_timestamp_ms", Long.valueOf(j10), map2);
        CollectionUtils.putLongIfValid("wf_latency_ms", Long.valueOf(maxAdWaterfallInfoImpl.getLatencyMillis()), map2);
        map2.put("arn_info", requestParameters.f().e());
        List<MaxNetworkResponseInfo> networkResponses = maxAdWaterfallInfoImpl.getNetworkResponses();
        ArrayList arrayList = new ArrayList(networkResponses.size());
        for (MaxNetworkResponseInfo maxNetworkResponseInfo : networkResponses) {
            MaxMediatedNetworkInfo mediatedNetwork = maxNetworkResponseInfo.getMediatedNetwork();
            HashMap map3 = new HashMap(5);
            CollectionUtils.putStringIfValid("bcode", ((MaxNetworkResponseInfoImpl) maxNetworkResponseInfo).getBCode(), map3);
            map3.put("name", mediatedNetwork.getName());
            CollectionUtils.putLongIfValid("latency_ms", Long.valueOf(maxNetworkResponseInfo.getLatencyMillis()), map3);
            map3.put("load_state", Integer.valueOf(maxNetworkResponseInfo.getAdLoadState().ordinal()));
            MaxErrorImpl maxErrorImpl = (MaxErrorImpl) maxNetworkResponseInfo.getError();
            if (maxErrorImpl != null) {
                HashMap map4 = new HashMap(4);
                map4.put("error_code", Integer.valueOf(maxErrorImpl.getCode()));
                map4.put("error_message", maxErrorImpl.getMessage());
                map4.put("third_party_sdk_error_code", Integer.valueOf(maxErrorImpl.getMediatedNetworkErrorCode()));
                map4.put("third_party_sdk_error_message", maxErrorImpl.getMediatedNetworkErrorMessage());
                map3.put("error_info", map4);
            }
            arrayList.add(map3);
        }
        map2.put("ads_info", arrayList);
        a("mwf_info", maxAdWaterfallInfoImpl.getPostbackUrls(), Collections.EMPTY_MAP, (Map) map2, (MaxError) null, (m3) null, false);
    }

    public void setCustomPostBodyData(JSONObject jSONObject) {
        this.f8463d.set(jSONObject);
    }

    public void showFullscreenAd(e3 e3Var, Activity activity, Map<String, Object> map, Map<String, Object> map2, com.applovin.impl.mediation.ads.a.InterfaceC0010a interfaceC0010a) {
        if (e3Var == null) {
            throw new IllegalArgumentException("No ad specified");
        }
        if (activity == null && MaxAdFormat.APP_OPEN != e3Var.getFormat()) {
            throw new IllegalArgumentException("No activity specified");
        }
        this.f8460a.J().a(true);
        h hVarB = b(e3Var);
        long jU0 = e3Var.u0();
        if (com.applovin.impl.sdk.p.a()) {
            this.f8461b.d("MediationService", "Showing ad " + e3Var.getAdUnitId() + " with delay of " + jU0 + "ms...");
        }
        AppLovinSdkUtils.runOnUiThreadDelayed(new j(this, e3Var, hVarB, activity, interfaceC0010a, map, map2, 0), jU0);
    }

    private h b(e3 e3Var) {
        h hVarB = e3Var.B();
        if (hVarB != null) {
            return hVarB;
        }
        this.f8460a.J().a(false);
        if (com.applovin.impl.sdk.p.a()) {
            this.f8461b.k("MediationService", "Failed to show " + e3Var + ": adapter not found");
        }
        com.applovin.impl.sdk.p.h("MediationService", "There may be an integration problem with the adapter for Ad Unit ID '" + e3Var.getAdUnitId() + "'. Please check if you have a supported version of that SDK integrated into your project.");
        throw new IllegalStateException("Could not find adapter for provided ad");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(e3 e3Var, h hVar, Activity activity, com.applovin.impl.mediation.ads.a.InterfaceC0010a interfaceC0010a, Map map, Map map2) {
        a(e3Var);
        hVar.b(e3Var, activity);
        a(e3Var, interfaceC0010a, activity, map, map2);
    }

    public void showFullscreenAd(final e3 e3Var, final ViewGroup viewGroup, final androidx.lifecycle.o oVar, final Activity activity, final Map<String, Object> map, final Map<String, Object> map2, final com.applovin.impl.mediation.ads.a.InterfaceC0010a interfaceC0010a) {
        if (e3Var == null) {
            throw new IllegalArgumentException("No ad specified");
        }
        if (activity != null) {
            this.f8460a.J().a(true);
            final h hVarB = b(e3Var);
            long jU0 = e3Var.u0();
            if (com.applovin.impl.sdk.p.a()) {
                this.f8461b.d("MediationService", "Showing ad " + e3Var.getAdUnitId() + " with delay of " + jU0 + "ms...");
            }
            AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.mediation.i
                @Override // java.lang.Runnable
                public final void run() {
                    this.f8730a.a(e3Var, hVarB, viewGroup, oVar, activity, interfaceC0010a, map, map2);
                }
            }, jU0);
            return;
        }
        throw new IllegalArgumentException("No activity specified");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(e3 e3Var, h hVar, ViewGroup viewGroup, androidx.lifecycle.o oVar, Activity activity, com.applovin.impl.mediation.ads.a.InterfaceC0010a interfaceC0010a, Map map, Map map2) {
        a(e3Var);
        hVar.a(e3Var, viewGroup, oVar, activity);
        a(e3Var, interfaceC0010a, activity, map, map2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(a3 a3Var, MaxError maxError, MaxAdListener maxAdListener) {
        a(maxError, a3Var);
        destroyAd(a3Var);
        v2.a(maxAdListener, a3Var.getAdUnitId(), maxError);
    }

    private void a(e3 e3Var) {
        if (e3Var.getFormat() == MaxAdFormat.REWARDED) {
            this.f8460a.s0().a((k5) new x6(e3Var, this.f8460a), f6.b.OTHER);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(a3 a3Var) {
        this.f8460a.u().b(a3Var, "DID_LOAD");
        if (a3Var.R().endsWith("load")) {
            this.f8460a.u().b(a3Var);
        }
        HashMap map = new HashMap(3);
        long jI = a3Var.I();
        map.put("{LOAD_TIME_MS}", String.valueOf(jI));
        if (a3Var.getFormat().isFullscreenAd()) {
            com.applovin.impl.sdk.o.a aVarB = this.f8460a.J().b(a3Var.getAdUnitId());
            map.put("{SHOW_ATTEMPT_COUNT}", String.valueOf(aVarB.a()));
            map.put("{SHOW_ATTEMPT_TIMESTAMP_MS}", String.valueOf(aVarB.b()));
            map.put("{FAILOVER_LOAD}", String.valueOf(((e3) a3Var).z0()));
        }
        a("load", map, a3Var);
        Map mapA = h2.a(a3Var);
        mapA.put("duration_ms", String.valueOf(jI));
        mapA.put("details", "sdk_initialized=" + this.f8460a.D0());
        this.f8460a.R().d(f2.f7867m0, mapA);
    }

    private void a(e3 e3Var, com.applovin.impl.mediation.ads.a.InterfaceC0010a interfaceC0010a, Activity activity, Map map, Map map2) {
        this.f8460a.J().a(false);
        a(e3Var, (MaxAdListener) interfaceC0010a);
        if (com.applovin.impl.sdk.p.a()) {
            this.f8461b.a("MediationService", "Scheduling impression for ad manually...");
        }
        processRawAdImpression(e3Var, interfaceC0010a);
        if (((Boolean) this.f8460a.a(t3.k8)).booleanValue() && this.f8460a.T() == null && this.f8460a.S().a((MaxAd) e3Var)) {
            AppLovinSdkUtils.runOnUiThreadDelayed(new z8(this, e3Var, map, map2, activity, 2), ((Long) this.f8460a.a(t3.f9773l8)).longValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(e3 e3Var, Map map, Map map2, Activity activity) {
        this.f8460a.S().a(e3Var.getAdUnitId(), (String) null, e3Var.getFormat(), com.applovin.impl.i.SEQUENTIAL_OR_PRECACHE, map, map2, activity, (com.applovin.impl.mediation.ads.a.InterfaceC0010a) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(a3 a3Var, com.applovin.impl.mediation.ads.a.InterfaceC0010a interfaceC0010a, String str) {
        String str2 = "Failed to load " + a3Var + ": adapter init failed with error: " + str;
        if (com.applovin.impl.sdk.p.a()) {
            this.f8461b.k("MediationService", str2);
        }
        b(a3Var, new MaxErrorImpl(MaxAdapterError.NOT_INITIALIZED.getErrorCode(), "Adapter initialization failed"), interfaceC0010a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(h hVar, String str, MaxAdapterParametersImpl maxAdapterParametersImpl, a3 a3Var, Activity activity, com.applovin.impl.mediation.ads.a.InterfaceC0010a interfaceC0010a) {
        hVar.a(str, maxAdapterParametersImpl, a3Var, activity, new b(a3Var, interfaceC0010a));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(long j10, h hVar, String str, f5 f5Var, MaxAdFormat maxAdFormat, e5.a aVar, boolean z10, String str2, MaxError maxError) {
        e5 e5VarA;
        String str3;
        long jElapsedRealtime = SystemClock.elapsedRealtime() - j10;
        if (z10) {
            if (com.applovin.impl.sdk.p.a()) {
                com.applovin.impl.sdk.p pVar = this.f8461b;
                StringBuilder sb2 = new StringBuilder("Signal collection successful from: ");
                sb2.append(hVar.g());
                sb2.append(" for Ad Unit ID: ");
                sb2.append(str);
                sb2.append(" with signal: \"");
                str3 = str2;
                sb2.append(str3);
                sb2.append("\"");
                pVar.a("MediationService", sb2.toString());
            } else {
                str3 = str2;
            }
            e5VarA = e5.a(f5Var, hVar, str3, j10, jElapsedRealtime);
            this.f8462c.a(e5VarA, f5Var, str, maxAdFormat);
            HashMap map = new HashMap();
            CollectionUtils.putStringIfValid("network_name", f5Var.c(), map);
            CollectionUtils.putStringIfValid("adapter_class", f5Var.b(), map);
            CollectionUtils.putStringIfValid("adapter_version", hVar.b(), map);
            CollectionUtils.putStringIfValid("duration_ms", String.valueOf(jElapsedRealtime), map);
            CollectionUtils.putStringIfValid("ad_format", String.valueOf(maxAdFormat.getLabel()), map);
            CollectionUtils.putStringIfValid("ad_unit_id", str, map);
            this.f8460a.R().d(f2.g0, map);
        } else {
            if (com.applovin.impl.sdk.p.a()) {
                this.f8461b.b("MediationService", "Signal collection failed from: " + hVar.g() + " for Ad Unit ID: " + str + " with error message: \"" + maxError.getMessage() + "\"");
            }
            e5VarA = e5.a(f5Var, hVar, maxError, j10, jElapsedRealtime);
            a(e5VarA, f5Var, hVar);
        }
        aVar.a(e5VarA);
        hVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(u4 u4Var, h hVar, MaxAdapterParametersImpl maxAdapterParametersImpl, f5 f5Var, Activity activity) {
        if (u4Var.d()) {
            return;
        }
        if (com.applovin.impl.sdk.p.a()) {
            this.f8461b.a("MediationService", "Collecting signal for now-initialized adapter: " + hVar.g());
        }
        hVar.a(maxAdapterParametersImpl, f5Var, activity, u4Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(h hVar, u4 u4Var, String str) {
        if (com.applovin.impl.sdk.p.a()) {
            this.f8461b.b("MediationService", "Skip collecting signal for failed-initialized adapter: " + hVar.g());
        }
        u4Var.a(new MaxErrorImpl(MaxAdapterError.ERROR_CODE_NOT_INITIALIZED, defpackage.e.n("Could not initialize adapter: ", str)));
    }

    private void a(e3 e3Var, MaxAdListener maxAdListener) {
        Long l = (Long) this.f8460a.a(t3.Z7);
        if (l.longValue() <= 0) {
            return;
        }
        AppLovinSdkUtils.runOnUiThreadDelayed(new w(this, e3Var, l, maxAdListener, 2), l.longValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(e3 e3Var, Long l, MaxAdListener maxAdListener) {
        if (e3Var.u().get()) {
            return;
        }
        String str = "Ad (" + e3Var.k() + ") has not been displayed after " + l + "ms. Failing ad display...";
        com.applovin.impl.sdk.p.h("MediationService", str);
        a(e3Var, new MaxErrorImpl(-1, str), maxAdListener);
        this.f8460a.J().b(e3Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(a3 a3Var, MaxError maxError, MaxAdListener maxAdListener) {
        this.f8460a.m().a(a3Var, com.applovin.impl.sdk.h.c.SHOW_ERROR);
        this.f8460a.u().b(a3Var, "DID_FAIL_DISPLAY");
        a(maxError, a3Var, true);
        if (a3Var.u().compareAndSet(false, true)) {
            v2.a(maxAdListener, a3Var, maxError);
        }
    }

    private void a(MaxError maxError, a3 a3Var) {
        HashMap map = new HashMap(3);
        long jI = a3Var.I();
        map.put("{LOAD_TIME_MS}", String.valueOf(jI));
        if (a3Var.getFormat().isFullscreenAd()) {
            com.applovin.impl.sdk.o.a aVarB = this.f8460a.J().b(a3Var.getAdUnitId());
            map.put("{SHOW_ATTEMPT_COUNT}", String.valueOf(aVarB.a()));
            map.put("{SHOW_ATTEMPT_TIMESTAMP_MS}", String.valueOf(aVarB.b()));
            map.put("{FAILOVER_LOAD}", String.valueOf(((e3) a3Var).z0()));
        }
        a("mlerr", map, maxError, a3Var);
        Map mapA = h2.a(a3Var);
        mapA.putAll(h2.a(maxError));
        mapA.put("duration_ms", String.valueOf(jI));
        mapA.put("details", "sdk_initialized=" + this.f8460a.D0());
        this.f8460a.R().d(f2.f7870n0, mapA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(a3 a3Var) {
        MediationServiceImpl mediationServiceImpl;
        a3 a3Var2;
        this.f8460a.u().b(a3Var, "DID_HIDE");
        HashMap map = new HashMap(1);
        String strEmptyIfNull = StringUtils.emptyIfNull(this.f8460a.y0().e());
        if (!((Boolean) this.f8460a.a(z4.N3)).booleanValue()) {
            strEmptyIfNull = "";
        }
        map.put("{CUID}", strEmptyIfNull);
        boolean z10 = a3Var.w().get();
        if (((Boolean) this.f8460a.a(z4.W2)).booleanValue()) {
            HashMap map2 = new HashMap();
            map2.put("ad_hidden_callback_manually_invoked", Boolean.valueOf(z10));
            mediationServiceImpl = this;
            a3Var2 = a3Var;
            mediationServiceImpl.a("mclose", (List) null, (Map) map, (Map) map2, (MaxError) null, (m3) a3Var2, true);
        } else {
            mediationServiceImpl = this;
            a3Var2 = a3Var;
            mediationServiceImpl.a("mclose", map, a3Var2);
        }
        long jV = a3Var2.V();
        long jK = a3Var2.K();
        Map map3 = CollectionUtils.map("duration_ms", String.valueOf(jV));
        map3.put("details", "foreground_duration_ms=" + jK + ",ad_hidden_callback_manually_invoked=" + z10);
        mediationServiceImpl.f8460a.R().a(f2.t0, a3Var2, map3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(a3 a3Var, com.applovin.impl.mediation.ads.a.InterfaceC0010a interfaceC0010a) {
        this.f8460a.u().b(a3Var, "DID_CLICKED");
        this.f8460a.u().b(a3Var, "DID_CLICK");
        if (a3Var.R().endsWith("click")) {
            this.f8460a.u().b(a3Var);
            v2.a((MaxAdRevenueListener) interfaceC0010a, (MaxAd) a3Var);
        }
        HashMap map = new HashMap(1);
        String strEmptyIfNull = StringUtils.emptyIfNull(this.f8460a.y0().e());
        if (!((Boolean) this.f8460a.a(z4.N3)).booleanValue()) {
            strEmptyIfNull = "";
        }
        map.put("{CUID}", strEmptyIfNull);
        a("mclick", map, a3Var);
    }

    private void a(MaxError maxError, a3 a3Var, boolean z10) {
        HashMap map = new HashMap(1);
        if (a3Var instanceof e3) {
            map.put("{PREVIOUS_FAILED_NETWORK_NAME}", StringUtils.emptyIfNull(((e3) a3Var).x0()));
        }
        a("mierr", map, maxError, a3Var, z10);
        if (!z10 || a3Var == null) {
            return;
        }
        this.f8460a.R().a(f2.f7879s0, a3Var, maxError, CollectionUtils.map("duration_ms", String.valueOf(a3Var.G())));
    }

    private void a(e5 e5Var, f5 f5Var, h hVar) {
        long jB = e5Var.b();
        HashMap map = new HashMap(3);
        map.put("{LOAD_TIME_MS}", String.valueOf(jB));
        CollectionUtils.putStringIfValid("{ADAPTER_VERSION}", hVar.b(), map);
        CollectionUtils.putStringIfValid("{SDK_VERSION}", hVar.i(), map);
        a("serr", map, e5Var.c(), f5Var);
        Map mapA = h2.a(e5Var.c());
        CollectionUtils.putStringIfValid("network_name", f5Var.c(), mapA);
        CollectionUtils.putStringIfValid("adapter_class", f5Var.b(), mapA);
        CollectionUtils.putStringIfValid("adapter_version", hVar.b(), mapA);
        CollectionUtils.putStringIfValid("duration_ms", String.valueOf(jB), mapA);
        this.f8460a.R().d(f2.f7854h0, mapA);
    }

    private void a(String str, Map map, m3 m3Var) {
        a(str, map, (MaxError) null, m3Var);
    }

    private void a(String str, Map map, MaxError maxError, m3 m3Var) {
        a(str, map, maxError, m3Var, true);
    }

    private void a(String str, Map map, MaxError maxError, m3 m3Var, boolean z10) {
        String strEmptyIfNull;
        Map map2 = CollectionUtils.map(map);
        String strEmptyIfNull2 = "";
        map2.put("{PLACEMENT}", z10 ? StringUtils.emptyIfNull(m3Var.getPlacement()) : "");
        if (!z10) {
            strEmptyIfNull = "";
        } else {
            strEmptyIfNull = StringUtils.emptyIfNull(m3Var.e());
        }
        map2.put("{CUSTOM_DATA}", strEmptyIfNull);
        if (m3Var instanceof a3) {
            a3 a3Var = (a3) m3Var;
            if (z10) {
                strEmptyIfNull2 = StringUtils.emptyIfNull(a3Var.getCreativeId());
            }
            map2.put("{CREATIVE_ID}", strEmptyIfNull2);
        }
        a(str, (List) null, map2, (Map) null, maxError, m3Var, z10);
    }

    private void a(String str, List list, Map map, Map map2, MaxError maxError, m3 m3Var, boolean z10) {
        this.f8460a.s0().a((k5) new d6(str, list, map, map2, maxError, m3Var, this.f8460a, z10), f6.b.OTHER);
    }

    private boolean a(long j10) {
        return System.currentTimeMillis() - j10 <= ((Long) this.f8460a.a(z4.I2)).longValue();
    }
}
