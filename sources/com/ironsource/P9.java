package com.ironsource;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.controller.FeaturesManager;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class P9 implements InterfaceC0412je, InterfaceC0599u4, InterfaceC0581t4, InterfaceC0545r4, InterfaceC0563s4, V9, Nc {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f27005m = "IronSourceAdsPublisherAgent";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static P9 f27006n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.ironsource.sdk.controller.e f27007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f27008b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f27009c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private U4 f27010d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private C0500oc f27011e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private C0241a4 f27013g;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f27012f = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private FeaturesManager f27014h = FeaturesManager.getInstance();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private N8.a f27015i = Kb.Q().j();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Q.a f27016j = Kb.Q().G();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Q f27017k = Kb.Y().I();
    private InterfaceC0478n8 l = Kb.Y().t();

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f27018a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f27019b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ T4 f27020c;

        public a(String str, String str2, T4 t10) {
            this.f27018a = str;
            this.f27019b = str2;
            this.f27020c = t10;
        }

        @Override // java.lang.Runnable
        public void run() {
            P9 p10 = P9.this;
            p10.f27007a.a(this.f27018a, this.f27019b, this.f27020c, (InterfaceC0599u4) p10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ JSONObject f27022a;

        public b(JSONObject jSONObject) {
            this.f27022a = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            P9 p10 = P9.this;
            p10.f27007a.a(this.f27022a, (InterfaceC0599u4) p10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f27024a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f27025b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ T4 f27026c;

        public c(String str, String str2, T4 t10) {
            this.f27024a = str;
            this.f27025b = str2;
            this.f27026c = t10;
        }

        @Override // java.lang.Runnable
        public void run() {
            P9 p10 = P9.this;
            p10.f27007a.a(this.f27024a, this.f27025b, this.f27026c, (InterfaceC0581t4) p10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f27028a;

        public d(String str) {
            this.f27028a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            P9 p10 = P9.this;
            p10.f27007a.a(this.f27028a, p10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ JSONObject f27030a;

        public e(JSONObject jSONObject) {
            this.f27030a = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            P9 p10 = P9.this;
            p10.f27007a.a(this.f27030a, (InterfaceC0581t4) p10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ K9 f27032a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Map f27033b;

        public f(K9 k10, Map map) {
            this.f27032a = k10;
            this.f27033b = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0514p8.e eVar = this.f27032a.i() ? C0514p8.e.Banner : C0514p8.e.Interstitial;
            T4 t4A = P9.this.f27010d.a(eVar, this.f27032a);
            C0549r8 c0549r8 = new C0549r8();
            c0549r8.a(B5.f25710x, Boolean.valueOf(this.f27032a.j())).a(B5.G, Boolean.valueOf(this.f27032a.m())).a(B5.f25708v, this.f27032a.g()).a(B5.f25709w, W9.a(this.f27032a)).a(B5.I, Long.valueOf(N.f26615a.b(this.f27032a.e())));
            C0639w8.a(C0377he.f28809h, c0549r8.a());
            if (eVar == C0514p8.e.Banner) {
                P9 p10 = P9.this;
                p10.f27007a.a(p10.f27008b, p10.f27009c, t4A, (InterfaceC0563s4) p10);
                P9 p11 = P9.this;
                p11.f27007a.a(t4A, this.f27033b, (InterfaceC0563s4) p11);
                return;
            }
            P9 p12 = P9.this;
            p12.f27007a.a(p12.f27008b, p12.f27009c, t4A, (InterfaceC0581t4) p12);
            P9 p13 = P9.this;
            p13.f27007a.b(t4A, this.f27033b, p13);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class g implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ T4 f27035a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Map f27036b;

        public g(T4 t10, Map map) {
            this.f27035a = t10;
            this.f27036b = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            P9 p10 = P9.this;
            p10.f27007a.a(this.f27035a, this.f27036b, (InterfaceC0581t4) p10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class h implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ K9 f27038a;

        public h(K9 k10) {
            this.f27038a = k10;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0514p8.e eVar = this.f27038a.i() ? C0514p8.e.Banner : C0514p8.e.Interstitial;
            T4 t4A = P9.this.f27010d.a(eVar, this.f27038a);
            C0549r8 c0549r8 = new C0549r8();
            c0549r8.a(B5.f25710x, Boolean.valueOf(this.f27038a.j())).a(B5.f25708v, this.f27038a.g()).a(B5.f25709w, W9.a(this.f27038a)).a("isMultipleAdObjects", Boolean.valueOf(this.f27038a.l()));
            C0639w8.a(C0377he.f28813m, c0549r8.a());
            if (eVar == C0514p8.e.Banner) {
                P9.this.f27007a.a(t4A);
            } else {
                t4A.a(false);
                P9.this.f27007a.b(t4A);
            }
        }
    }

    private P9(Context context, int i10) {
        c(context);
    }

    @Override // com.ironsource.Nc
    public void e(Activity activity) {
        this.f27013g.a(activity);
        this.f27007a.g();
        this.f27007a.b(activity);
    }

    @Override // com.ironsource.InterfaceC0581t4
    public void onInterstitialAdRewarded(String str, int i10) {
        T4 t4D = d(C0514p8.e.Interstitial, str);
        Kc kcB = b(t4D);
        if (t4D == null || kcB == null) {
            return;
        }
        kcB.onInterstitialAdRewarded(str, i10);
    }

    public static V9 a(Context context, String str, String str2) {
        return a(str, str2, context);
    }

    public static synchronized P9 b(Context context) throws Exception {
        return a(context, 0);
    }

    private void c(Context context) {
        try {
            SDKUtils.getNetworkConfiguration();
            C0301da.a(context);
            IronSourceStorageUtils.initializeCacheDirectory(context, new Bf(SDKUtils.getNetworkConfiguration().optJSONObject(X3.a.f27676k)));
            C0301da.e().d(SDKUtils.getSDKVersion());
            this.f27010d = new U4();
            C0241a4 c0241a4 = new C0241a4();
            this.f27013g = c0241a4;
            if (context instanceof Activity) {
                c0241a4.a((Activity) context);
            }
            int debugMode = this.f27014h.getDebugMode();
            this.f27011e = new C0500oc();
            this.f27007a = new com.ironsource.sdk.controller.e(context, this.f27013g, this.f27010d, R7.f27125a, debugMode, this.f27014h.getDataManagerConfig(), this.f27008b, this.f27009c, this.f27011e);
            Logger.enableLogging(debugMode);
            Logger.i(f27005m, "C'tor");
            a(context);
            this.f27011e.d();
            this.f27011e.e();
            this.f27011e.a(context);
            this.f27011e.b();
            this.f27011e.a();
            this.f27011e.c();
        } catch (Exception e10) {
            C0474n4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    @Override // com.ironsource.InterfaceC0581t4
    public void d(String str, String str2) {
        T4 t4D = d(C0514p8.e.Interstitial, str);
        if (t4D != null) {
            K9 k9C = t4D.c();
            this.f27016j.a(EnumC0488o0.SHOW_FAIL, k9C.e());
            if (c(k9C)) {
                this.f27015i.a(new C0431kf(this.f27017k.a(k9C.e())));
            }
            Kc kcB = b(t4D);
            if (kcB != null) {
                kcB.onInterstitialShowFailed(str2);
            }
        }
    }

    public static synchronized V9 a(String str, String str2, Context context) {
        try {
            if (f27006n == null) {
                C0639w8.a(C0377he.f28802a);
                f27006n = new P9(str, str2, context);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f27006n;
    }

    private Kc b(T4 t10) {
        if (t10 == null) {
            return null;
        }
        return (Kc) t10.i();
    }

    @Override // com.ironsource.InterfaceC0412je
    public void b(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        String strOptString = jSONObject.optString("demandSourceName");
        if (TextUtils.isEmpty(strOptString)) {
            return;
        }
        this.f27007a.a(new d(strOptString));
    }

    public static synchronized P9 a(Context context, int i10) throws Exception {
        try {
            Logger.i(f27005m, "getInstance()");
            if (f27006n == null) {
                f27006n = new P9(context, i10);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f27006n;
    }

    @Override // com.ironsource.InterfaceC0412je, com.ironsource.V9
    public void b(Activity activity) {
        if (this.f27012f) {
            return;
        }
        d(activity);
    }

    public P9(String str, String str2, Context context) {
        this.f27008b = str;
        this.f27009c = str2;
        c(context);
    }

    @Override // com.ironsource.InterfaceC0545r4
    public void b(C0514p8.e eVar, String str) {
        Kc kcB;
        T4 t4D = d(eVar, str);
        if (t4D != null) {
            if (eVar == C0514p8.e.RewardedVideo) {
                Pc pcC = c(t4D);
                if (pcC != null) {
                    pcC.d();
                    return;
                }
                return;
            }
            if (eVar != C0514p8.e.Interstitial || (kcB = b(t4D)) == null) {
                return;
            }
            kcB.onInterstitialClose();
        }
    }

    @Override // com.ironsource.V9
    public com.ironsource.sdk.controller.e a() {
        return this.f27007a;
    }

    private Ic a(T4 t10) {
        if (t10 == null) {
            return null;
        }
        return (Ic) t10.i();
    }

    private T4 d(C0514p8.e eVar, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.f27010d.a(eVar, str);
    }

    @Override // com.ironsource.InterfaceC0412je
    public void a(String str, String str2, String str3, Map<String, String> map, Pc pc2) {
        this.f27008b = str;
        this.f27009c = str2;
        this.f27007a.a(new a(str, str2, this.f27010d.a(C0514p8.e.RewardedVideo, str3, map, pc2)));
    }

    @Override // com.ironsource.Nc
    public void d(Activity activity) {
        try {
            this.f27007a.e();
            this.f27007a.a((Context) activity);
        } catch (Exception e10) {
            C0474n4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    @Override // com.ironsource.InterfaceC0599u4
    public void b(String str, String str2) {
        Pc pcC;
        T4 t4D = d(C0514p8.e.RewardedVideo, str);
        if (t4D == null || (pcC = c(t4D)) == null) {
            return;
        }
        pcC.a(str2);
    }

    @Override // com.ironsource.InterfaceC0412je
    public void a(JSONObject jSONObject) {
        this.f27007a.a(new b(jSONObject));
    }

    @Override // com.ironsource.InterfaceC0412je
    public void a(String str, String str2, String str3, Map<String, String> map, Kc kc2) {
        this.f27008b = str;
        this.f27009c = str2;
        this.f27007a.a(new c(str, str2, this.f27010d.a(C0514p8.e.Interstitial, str3, map, kc2)));
    }

    @Override // com.ironsource.InterfaceC0581t4
    public void b(String str) {
        T4 t4D = d(C0514p8.e.Interstitial, str);
        if (t4D != null) {
            K9 k9C = t4D.c();
            this.f27016j.a(EnumC0488o0.SHOW_SUCCESS, k9C.e());
            if (c(k9C)) {
                this.f27015i.a(new C0449lf(this.f27017k.a(k9C.e())));
            }
            Kc kcB = b(t4D);
            if (kcB != null) {
                kcB.onInterstitialShowSuccess();
            }
        }
    }

    @Override // com.ironsource.InterfaceC0412je
    public boolean a(String str) {
        return this.f27007a.a(str);
    }

    @Override // com.ironsource.InterfaceC0412je, com.ironsource.V9
    public void a(Activity activity) {
        if (this.f27012f) {
            return;
        }
        e(activity);
    }

    @Override // com.ironsource.InterfaceC0545r4
    public void a(C0514p8.e eVar, String str, C0256b1 c0256b1) {
        Ic icA;
        T4 t4D = d(eVar, str);
        if (t4D != null) {
            t4D.b(2);
            if (eVar == C0514p8.e.RewardedVideo) {
                Pc pcC = c(t4D);
                if (pcC != null) {
                    pcC.a(c0256b1);
                    return;
                }
                return;
            }
            if (eVar == C0514p8.e.Interstitial) {
                Kc kcB = b(t4D);
                if (kcB != null) {
                    kcB.onInterstitialInitSuccess();
                    return;
                }
                return;
            }
            if (eVar != C0514p8.e.Banner || (icA = a(t4D)) == null) {
                return;
            }
            icA.onBannerInitSuccess();
        }
    }

    private Pc c(T4 t10) {
        if (t10 == null) {
            return null;
        }
        return (Pc) t10.i();
    }

    @Override // com.ironsource.InterfaceC0412je
    public void c(JSONObject jSONObject) {
        this.f27007a.a(new e(jSONObject));
    }

    @Override // com.ironsource.X9
    public void b(Activity activity, K9 k10, Map<String, String> map) {
        if (Kb.Y().h().j()) {
            this.f27013g.a(activity);
        }
        a(k10, map);
    }

    @Override // com.ironsource.InterfaceC0412je, com.ironsource.V9
    public void c(Activity activity) {
        try {
            Logger.i(f27005m, "release()");
            X4.g();
            this.f27013g.b();
            this.f27007a.a((Context) activity);
            this.f27007a.a();
            this.f27007a = null;
        } catch (Exception e10) {
            C0474n4.d().a(e10);
        }
        f27006n = null;
    }

    private void b(K9 k10, Map<String, String> map) {
        Logger.d(f27005m, "loadOnNewInstance " + k10.e());
        this.f27007a.a(new f(k10, map));
    }

    @Override // com.ironsource.X9
    public void b(K9 k10) {
        Logger.d(f27005m, "destroyInstance " + k10.e());
        if (c(k10)) {
            this.f27016j.a(EnumC0488o0.DESTROYED, k10.e());
            this.f27015i.a(new C0378hf(this.f27017k.a(k10.e())));
        }
        this.f27007a.a(new h(k10));
    }

    @Override // com.ironsource.InterfaceC0545r4
    public void a(C0514p8.e eVar, String str, String str2) {
        Ic icA;
        T4 t4D = d(eVar, str);
        C0549r8 c0549r8A = new C0549r8().a(B5.f25708v, str).a(B5.f25709w, eVar).a(B5.A, str2);
        if (t4D != null) {
            N n3 = N.f26615a;
            c0549r8A.a(B5.I, Long.valueOf(n3.b(t4D.h())));
            c0549r8A.a(B5.f25710x, Boolean.valueOf(C0657x8.a(t4D)));
            n3.a(t4D.h());
            t4D.b(3);
            if (eVar == C0514p8.e.RewardedVideo) {
                Pc pcC = c(t4D);
                if (pcC != null) {
                    pcC.b(str2);
                }
            } else if (eVar == C0514p8.e.Interstitial) {
                Kc kcB = b(t4D);
                if (kcB != null) {
                    kcB.onInterstitialInitFailed(str2);
                }
            } else if (eVar == C0514p8.e.Banner && (icA = a(t4D)) != null) {
                icA.onBannerLoadFail(str2);
            }
        }
        C0639w8.a(C0377he.f28810i, c0549r8A.a());
    }

    @Override // com.ironsource.InterfaceC0599u4
    public void c(String str) {
        Pc pcC;
        T4 t4D = d(C0514p8.e.RewardedVideo, str);
        if (t4D == null || (pcC = c(t4D)) == null) {
            return;
        }
        pcC.c();
    }

    @Override // com.ironsource.InterfaceC0545r4
    public void c(C0514p8.e eVar, String str) {
        Pc pcC;
        T4 t4D = d(eVar, str);
        if (t4D != null) {
            if (eVar == C0514p8.e.Interstitial) {
                Kc kcB = b(t4D);
                if (kcB != null) {
                    kcB.onInterstitialOpen();
                    return;
                }
                return;
            }
            if (eVar != C0514p8.e.RewardedVideo || (pcC = c(t4D)) == null) {
                return;
            }
            pcC.b();
        }
    }

    @Override // com.ironsource.InterfaceC0563s4
    public void c(String str, String str2) {
        Ic icA;
        T4 t4D = d(C0514p8.e.Banner, str);
        if (t4D == null || (icA = a(t4D)) == null) {
            return;
        }
        icA.onBannerLoadFail(str2);
    }

    private void c(K9 k10, Map<String, String> map) {
        try {
            map = a(map);
        } catch (Exception e10) {
            C0474n4.d().a(e10);
            C0549r8 c0549r8A = new C0549r8().a(B5.A, e10.getMessage()).a(B5.f25710x, Boolean.valueOf(k10.j())).a(B5.G, Boolean.valueOf(k10.m())).a(B5.f25708v, k10.g()).a(B5.f25709w, W9.a(k10)).a(B5.I, Long.valueOf(N.f26615a.b(k10.e())));
            N.f26615a.a(k10.e());
            C0639w8.a(C0377he.f28812k, c0549r8A.a());
            IronLog.INTERNAL.error(e10.toString());
            Logger.d(f27005m, "loadInAppBiddingAd failed decoding  ADM " + e10.getMessage());
        }
        b(k10, map);
    }

    @Override // com.ironsource.InterfaceC0599u4
    public void a(String str, int i10) {
        Pc pcC;
        T4 t4D = d(C0514p8.e.RewardedVideo, str);
        if (t4D == null || (pcC = c(t4D)) == null) {
            return;
        }
        pcC.a(i10);
    }

    @Override // com.ironsource.InterfaceC0545r4
    public void a(C0514p8.e eVar, String str) {
        Ic icA;
        T4 t4D = d(eVar, str);
        if (t4D != null) {
            if (eVar == C0514p8.e.RewardedVideo) {
                Pc pcC = c(t4D);
                if (pcC != null) {
                    pcC.a();
                    return;
                }
                return;
            }
            if (eVar == C0514p8.e.Interstitial) {
                Kc kcB = b(t4D);
                if (kcB != null) {
                    kcB.onInterstitialClick();
                    return;
                }
                return;
            }
            if (eVar != C0514p8.e.Banner || (icA = a(t4D)) == null) {
                return;
            }
            icA.onBannerClick();
        }
    }

    public boolean c(K9 k10) {
        return k10.l() && !k10.i() && a(k10);
    }

    @Override // com.ironsource.InterfaceC0545r4
    public void a(C0514p8.e eVar, String str, String str2, JSONObject jSONObject) {
        Ic icA;
        T4 t4D = d(eVar, str);
        if (t4D == null || TextUtils.isEmpty(str2)) {
            return;
        }
        try {
            Logger.i(f27005m, "Received Event Notification: " + str2 + " for demand source: " + t4D.f());
            if (eVar == C0514p8.e.Interstitial) {
                Kc kcB = b(t4D);
                if (kcB != null) {
                    jSONObject.put("demandSourceName", str);
                    kcB.onInterstitialEventNotificationReceived(str2, jSONObject);
                    return;
                }
                return;
            }
            if (eVar == C0514p8.e.RewardedVideo) {
                Pc pcC = c(t4D);
                if (pcC != null) {
                    jSONObject.put("demandSourceName", str);
                    pcC.a(str2, jSONObject);
                    return;
                }
                return;
            }
            if (eVar != C0514p8.e.Banner || (icA = a(t4D)) == null) {
                return;
            }
            jSONObject.put("demandSourceName", str);
            if (str2.equalsIgnoreCase("impressions")) {
                icA.onBannerShowSuccess();
            }
        } catch (JSONException e10) {
            C0474n4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    @Override // com.ironsource.InterfaceC0581t4
    public void a(String str, JSONObject jSONObject) {
        C0514p8.e eVar = C0514p8.e.Interstitial;
        T4 t4D = d(eVar, str);
        C0549r8 c0549r8A = new C0549r8().a(B5.f25708v, str);
        if (t4D != null) {
            K9 k9C = t4D.c();
            this.f27016j.a(jSONObject, EnumC0488o0.LOAD_SUCCESS, k9C.e());
            if (c(k9C)) {
                this.f27015i.a(new C0413jf(this.f27017k.a(k9C.e())));
            }
            C0549r8 c0549r8A2 = c0549r8A.a(B5.f25709w, C0657x8.a(t4D, eVar)).a(B5.f25710x, Boolean.valueOf(C0657x8.a(t4D)));
            N n3 = N.f26615a;
            c0549r8A2.a(B5.I, Long.valueOf(n3.b(t4D.h())));
            n3.a(t4D.h());
            Kc kcB = b(t4D);
            if (kcB != null) {
                kcB.onInterstitialLoadSuccess(t4D.c());
            }
        }
        C0639w8.a(C0377he.l, c0549r8A.a());
    }

    @Override // com.ironsource.InterfaceC0581t4
    public void a(String str, String str2) {
        Object obj;
        C0514p8.e eVar = C0514p8.e.Interstitial;
        T4 t4D = d(eVar, str);
        C0549r8 c0549r8 = new C0549r8();
        c0549r8.a(B5.A, str2).a(B5.f25708v, str);
        if (t4D != null) {
            C0549r8 c0549r8A = c0549r8.a(B5.f25709w, C0657x8.a(t4D, eVar));
            if (t4D.e() == 2) {
                obj = B5.E;
            } else {
                obj = B5.F;
            }
            C0549r8 c0549r8A2 = c0549r8A.a(B5.f25711y, obj).a(B5.f25710x, Boolean.valueOf(C0657x8.a(t4D)));
            N n3 = N.f26615a;
            c0549r8A2.a(B5.I, Long.valueOf(n3.b(t4D.h())));
            n3.a(t4D.h());
            Kc kcB = b(t4D);
            if (kcB != null) {
                kcB.onInterstitialLoadFailed(str2);
            }
        }
        C0639w8.a(C0377he.f28808g, c0549r8.a());
    }

    @Override // com.ironsource.InterfaceC0412je
    public void a(String str, String str2, int i10) {
        C0514p8.e productType;
        T4 t4A;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || (productType = SDKUtils.getProductType(str)) == null || (t4A = this.f27010d.a(productType, str2)) == null) {
            return;
        }
        t4A.c(i10);
    }

    @Override // com.ironsource.InterfaceC0563s4
    public void a(String str, C0353g8 c0353g8) {
        Ic icA;
        T4 t4D = d(C0514p8.e.Banner, str);
        if (t4D == null || (icA = a(t4D)) == null) {
            return;
        }
        icA.onBannerLoadSuccess(t4D.c(), c0353g8);
    }

    @Override // com.ironsource.X9
    public void a(K9 k10, Map<String, String> map) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        map.put(X3.i.f27825y0, String.valueOf(jCurrentTimeMillis));
        N.f26615a.a(k10.e(), jCurrentTimeMillis);
        C0549r8 c0549r8 = new C0549r8();
        c0549r8.a(B5.f25710x, Boolean.valueOf(k10.j())).a(B5.G, Boolean.valueOf(k10.m())).a(B5.f25708v, k10.g()).a(B5.f25709w, W9.a(k10)).a(B5.I, Long.valueOf(jCurrentTimeMillis));
        C0639w8.a(C0377he.f28807f, c0549r8.a());
        Logger.d(f27005m, "loadAd " + k10.e());
        P p10 = new P(k10);
        this.f27016j.a(p10);
        this.f27016j.a(new JSONObject(map), EnumC0488o0.LOAD_REQUEST, p10.c());
        if (c(k10)) {
            this.f27015i.a(new Cif(p10));
        }
        if (k10.k()) {
            c(k10, map);
        } else {
            b(k10, map);
        }
    }

    private Map<String, String> a(Map<String, String> map) {
        map.put("adm", SDKUtils.decodeString(map.get("adm")));
        return map;
    }

    @Override // com.ironsource.X9
    public void a(Activity activity, K9 k10, Map<String, String> map) {
        this.f27013g.a(activity);
        Logger.i(f27005m, "showAd " + k10.e());
        T4 t4A = this.f27010d.a(C0514p8.e.Interstitial, k10.e());
        if (t4A == null) {
            return;
        }
        this.f27007a.a(new g(t4A, map));
    }

    @Override // com.ironsource.X9
    public boolean a(K9 k10) {
        Logger.d(f27005m, "isAdAvailable " + k10.e());
        T4 t4A = this.f27010d.a(C0514p8.e.Interstitial, k10.e());
        if (t4A == null) {
            return false;
        }
        return t4A.d();
    }

    public void a(Context context) {
        this.f27012f = false;
        Boolean boolC = this.l.c(X3.a.f27672g);
        if (boolC == null) {
            boolC = Boolean.FALSE;
        }
        boolean zBooleanValue = boolC.booleanValue();
        this.f27012f = zBooleanValue;
        if (zBooleanValue) {
            try {
                ((Application) context).registerActivityLifecycleCallbacks(new C0380i(this));
            } catch (Throwable th2) {
                C0474n4.d().a(th2);
                C0549r8 c0549r8 = new C0549r8();
                c0549r8.a(B5.f25711y, th2.getMessage());
                C0639w8.a(C0377he.f28821u, c0549r8.a());
            }
        }
    }
}
