package com.p004ironsource;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.p004ironsource.mediationsdk.logger.IronLog;
import com.p004ironsource.sdk.controller.FeaturesManager;
import com.p004ironsource.sdk.utils.IronSourceStorageUtils;
import com.p004ironsource.sdk.utils.Logger;
import com.p004ironsource.sdk.utils.SDKUtils;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class dk implements js, x9, w9, u9, v9, ik, qp {
    private static final String m = "IronSourceAdsPublisherAgent";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static dk f24804n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.p004ironsource.sdk.controller.e f24805a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f24806b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f24807c;
    private wa d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ro f24808e;
    private g9 g;
    private boolean f = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private FeaturesManager f24809h = FeaturesManager.getInstance();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ji.a f24810i = on.O().g();
    private InterfaceC3375o0.a j = on.O().F();
    private InterfaceC3375o0 k = on.U().G();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private kh f24811l = on.U().A();

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f24812a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f24813b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ va f24814c;

        public a(String str, String str2, va vaVar) {
            this.f24812a = str;
            this.f24813b = str2;
            this.f24814c = vaVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            dk.this.f24805a.a(this.f24812a, this.f24813b, this.f24814c, (x9) dk.this);
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ JSONObject f24815a;

        public b(JSONObject jSONObject) {
            this.f24815a = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            dk.this.f24805a.a(this.f24815a, (x9) dk.this);
        }
    }

    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f24817a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f24818b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ va f24819c;

        public c(String str, String str2, va vaVar) {
            this.f24817a = str;
            this.f24818b = str2;
            this.f24819c = vaVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            dk.this.f24805a.a(this.f24817a, this.f24818b, this.f24819c, (w9) dk.this);
        }
    }

    public class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f24820a;

        public d(String str) {
            this.f24820a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            dk.this.f24805a.a(this.f24820a, dk.this);
        }
    }

    public class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ JSONObject f24822a;

        public e(JSONObject jSONObject) {
            this.f24822a = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            dk.this.f24805a.a(this.f24822a, (w9) dk.this);
        }
    }

    public class f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ zj f24824a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Map f24825b;

        public f(zj zjVar, Map map) {
            this.f24824a = zjVar;
            this.f24825b = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            mh.e eVar = this.f24824a.i() ? mh.e.Banner : mh.e.Interstitial;
            va vaVarA = dk.this.d.a(eVar, this.f24824a);
            oh ohVar = new oh();
            ohVar.a(dc.x, Boolean.valueOf(this.f24824a.j())).a(dc.G, Boolean.valueOf(this.f24824a.m())).a(dc.v, this.f24824a.g()).a(dc.f24790w, jk.a(this.f24824a)).a(dc.f24773I, Long.valueOf(C3367l0.f25553a.b(this.f24824a.e())));
            th.a(hs.f25278h, ohVar.a());
            if (eVar == mh.e.Banner) {
                dk.this.f24805a.a(dk.this.f24806b, dk.this.f24807c, vaVarA, (v9) dk.this);
                dk.this.f24805a.a(vaVarA, this.f24825b, (v9) dk.this);
            } else {
                dk.this.f24805a.a(dk.this.f24806b, dk.this.f24807c, vaVarA, (w9) dk.this);
                dk.this.f24805a.b(vaVarA, this.f24825b, dk.this);
            }
        }
    }

    public class g implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ va f24827a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Map f24828b;

        public g(va vaVar, Map map) {
            this.f24827a = vaVar;
            this.f24828b = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            dk.this.f24805a.a(this.f24827a, this.f24828b, (w9) dk.this);
        }
    }

    public class h implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ zj f24830a;

        public h(zj zjVar) {
            this.f24830a = zjVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            mh.e eVar = this.f24830a.i() ? mh.e.Banner : mh.e.Interstitial;
            va vaVarA = dk.this.d.a(eVar, this.f24830a);
            oh ohVar = new oh();
            ohVar.a(dc.x, Boolean.valueOf(this.f24830a.j())).a(dc.v, this.f24830a.g()).a(dc.f24790w, jk.a(this.f24830a)).a("isMultipleAdObjects", Boolean.valueOf(this.f24830a.l()));
            th.a(hs.m, ohVar.a());
            if (eVar == mh.e.Banner) {
                dk.this.f24805a.a(vaVarA);
            } else {
                vaVarA.a(false);
                dk.this.f24805a.b(vaVarA);
            }
        }
    }

    private dk(Context context, int i2) {
        c(context);
    }

    public static synchronized dk a(Context context, int i2) throws Exception {
        try {
            Logger.i(m, "getInstance()");
            if (f24804n == null) {
                f24804n = new dk(context, i2);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f24804n;
    }

    public static synchronized dk b(Context context) throws Exception {
        return a(context, 0);
    }

    private sp c(va vaVar) {
        if (vaVar == null) {
            return null;
        }
        return (sp) vaVar.i();
    }

    private va d(mh.e eVar, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.d.a(eVar, str);
    }

    @Override // com.p004ironsource.w9
    public void onInterstitialAdRewarded(String str, int i2) {
        va vaVarD = d(mh.e.Interstitial, str);
        np npVarB = b(vaVarD);
        if (vaVarD == null || npVarB == null) {
            return;
        }
        npVarB.onInterstitialAdRewarded(str, i2);
    }

    @Override // com.p004ironsource.js, com.p004ironsource.ik
    public void onPause(Activity activity) {
        if (this.f) {
            return;
        }
        b(activity);
    }

    @Override // com.p004ironsource.js, com.p004ironsource.ik
    public void onResume(Activity activity) {
        if (this.f) {
            return;
        }
        c(activity);
    }

    public dk(String str, String str2, Context context) {
        this.f24806b = str;
        this.f24807c = str2;
        c(context);
    }

    public static ik a(Context context, String str, String str2) {
        return a(str, str2, context);
    }

    private np b(va vaVar) {
        if (vaVar == null) {
            return null;
        }
        return (np) vaVar.i();
    }

    public static synchronized ik a(String str, String str2, Context context) {
        try {
            if (f24804n == null) {
                th.a(hs.f25274a);
                f24804n = new dk(str, str2, context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f24804n;
    }

    @Override // com.p004ironsource.qp
    public void c(Activity activity) {
        this.g.a(activity);
        this.f24805a.f();
        this.f24805a.b(activity);
    }

    @Override // com.p004ironsource.x9
    public void d(String str, String str2) {
        sp spVarC;
        va vaVarD = d(mh.e.RewardedVideo, str);
        if (vaVarD == null || (spVarC = c(vaVarD)) == null) {
            return;
        }
        spVarC.a(str2);
    }

    private lp a(va vaVar) {
        if (vaVar == null) {
            return null;
        }
        return (lp) vaVar.i();
    }

    private void c(Context context) {
        try {
            SDKUtils.getNetworkConfiguration();
            pk.a(context);
            IronSourceStorageUtils.initializeCacheDirectory(context, new vu(SDKUtils.getNetworkConfiguration().optJSONObject(d9.a.k)));
            pk.e().d(SDKUtils.getSDKVersion());
            this.d = new wa();
            g9 g9Var = new g9();
            this.g = g9Var;
            if (context instanceof Activity) {
                g9Var.a((Activity) context);
            }
            int debugMode = this.f24809h.getDebugMode();
            this.f24808e = new ro();
            this.f24805a = new com.p004ironsource.sdk.controller.e(context, this.g, this.d, pg.f26494a, debugMode, this.f24809h.getDataManagerConfig(), this.f24806b, this.f24807c, this.f24808e);
            Logger.enableLogging(debugMode);
            Logger.i(m, "C'tor");
            a(context);
            this.f24808e.d();
            this.f24808e.e();
            this.f24808e.a(context);
            this.f24808e.b();
            this.f24808e.a();
            this.f24808e.b(context);
            this.f24808e.c();
        } catch (Exception e2) {
            q9.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
        }
    }

    @Override // com.p004ironsource.qp
    public void b(Activity activity) {
        try {
            this.f24805a.d();
            this.f24805a.a((Context) activity);
        } catch (Exception e2) {
            q9.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
        }
    }

    @Override // com.p004ironsource.ik
    public com.p004ironsource.sdk.controller.e a() {
        return this.f24805a;
    }

    @Override // com.p004ironsource.kk
    public void b(Activity activity, zj zjVar, Map<String, String> map) {
        if (on.U().d().f()) {
            this.g.a(activity);
        }
        a(zjVar, map);
    }

    @Override // com.p004ironsource.u9
    public void c(mh.e eVar, String str) {
        lp lpVarA;
        va vaVarD = d(eVar, str);
        if (vaVarD != null) {
            if (eVar == mh.e.RewardedVideo) {
                sp spVarC = c(vaVarD);
                if (spVarC != null) {
                    spVarC.d();
                    return;
                }
                return;
            }
            if (eVar == mh.e.Interstitial) {
                np npVarB = b(vaVarD);
                if (npVarB != null) {
                    npVarB.onInterstitialClick();
                    return;
                }
                return;
            }
            if (eVar != mh.e.Banner || (lpVarA = a(vaVarD)) == null) {
                return;
            }
            lpVarA.onBannerClick();
        }
    }

    private void c(zj zjVar, Map<String, String> map) {
        try {
            map = a(map);
        } catch (Exception e2) {
            q9.d().a(e2);
            oh ohVarA = new oh().a(dc.f24769A, e2.getMessage()).a(dc.x, Boolean.valueOf(zjVar.j())).a(dc.G, Boolean.valueOf(zjVar.m())).a(dc.v, zjVar.g()).a(dc.f24790w, jk.a(zjVar)).a(dc.f24773I, Long.valueOf(C3367l0.f25553a.b(zjVar.e())));
            C3367l0.f25553a.a(zjVar.e());
            th.a(hs.k, ohVarA.a());
            IronLog.INTERNAL.error(e2.toString());
            Logger.d(m, "loadInAppBiddingAd failed decoding  ADM " + e2.getMessage());
        }
        b(zjVar, map);
    }

    @Override // com.p004ironsource.u9
    public void b(mh.e eVar, String str) {
        sp spVarC;
        va vaVarD = d(eVar, str);
        if (vaVarD != null) {
            if (eVar == mh.e.Interstitial) {
                np npVarB = b(vaVarD);
                if (npVarB != null) {
                    npVarB.onInterstitialOpen();
                    return;
                }
                return;
            }
            if (eVar != mh.e.RewardedVideo || (spVarC = c(vaVarD)) == null) {
                return;
            }
            spVarC.a();
        }
    }

    private Map<String, String> a(Map<String, String> map) {
        map.put("adm", SDKUtils.decodeString(map.get("adm")));
        return map;
    }

    @Override // com.p004ironsource.kk
    public void b(zj zjVar) {
        Logger.d(m, "destroyInstance " + zjVar.e());
        if (c(zjVar)) {
            this.j.a(l1.DESTROYED, zjVar.e());
            this.f24810i.a(new bu(this.k.a(zjVar.e())));
        }
        this.f24805a.a(new h(zjVar));
    }

    @Override // com.p004ironsource.x9
    public void c(String str) {
        sp spVarC;
        va vaVarD = d(mh.e.RewardedVideo, str);
        if (vaVarD == null || (spVarC = c(vaVarD)) == null) {
            return;
        }
        spVarC.b();
    }

    private void b(zj zjVar, Map<String, String> map) {
        Logger.d(m, "loadOnNewInstance " + zjVar.e());
        this.f24805a.a(new f(zjVar, map));
    }

    @Override // com.p004ironsource.js, com.p004ironsource.ik
    public void a(Activity activity) {
        try {
            Logger.i(m, "release()");
            za.g();
            this.g.b();
            this.f24805a.a((Context) activity);
            this.f24805a.destroy();
            this.f24805a = null;
        } catch (Exception e2) {
            q9.d().a(e2);
        }
        f24804n = null;
    }

    @Override // com.p004ironsource.w9
    public void c(String str, String str2) {
        mh.e eVar = mh.e.Interstitial;
        va vaVarD = d(eVar, str);
        oh ohVar = new oh();
        ohVar.a(dc.f24769A, str2).a(dc.v, str);
        if (vaVarD != null) {
            oh ohVarA = ohVar.a(dc.f24790w, uh.a(vaVarD, eVar)).a(dc.y, vaVarD.e() == 2 ? dc.f24771E : dc.f24772F).a(dc.x, Boolean.valueOf(uh.a(vaVarD)));
            C3367l0 c3367l0 = C3367l0.f25553a;
            ohVarA.a(dc.f24773I, Long.valueOf(c3367l0.b(vaVarD.h())));
            c3367l0.a(vaVarD.h());
            np npVarB = b(vaVarD);
            if (npVarB != null) {
                npVarB.onInterstitialLoadFailed(str2);
            }
        }
        th.a(hs.g, ohVar.a());
    }

    @Override // com.p004ironsource.kk
    public void a(Activity activity, zj zjVar, Map<String, String> map) {
        this.g.a(activity);
        Logger.i(m, "showAd " + zjVar.e());
        va vaVarA = this.d.a(mh.e.Interstitial, zjVar.e());
        if (vaVarA == null) {
            return;
        }
        this.f24805a.a(new g(vaVarA, map));
    }

    @Override // com.p004ironsource.w9
    public void b(String str) {
        va vaVarD = d(mh.e.Interstitial, str);
        if (vaVarD != null) {
            zj zjVarC = vaVarD.c();
            this.j.a(l1.SHOW_SUCCESS, zjVarC.e());
            if (c(zjVarC)) {
                this.f24810i.a(new fu(this.k.a(zjVarC.e())));
            }
            np npVarB = b(vaVarD);
            if (npVarB != null) {
                npVarB.onInterstitialShowSuccess();
            }
        }
    }

    @Override // com.p004ironsource.js
    public void c(JSONObject jSONObject) {
        this.f24805a.a(new e(jSONObject));
    }

    public void a(Context context) {
        this.f = false;
        Boolean boolC = this.f24811l.c(d9.a.g);
        if (boolC == null) {
            boolC = Boolean.FALSE;
        }
        boolean zBooleanValue = boolC.booleanValue();
        this.f = zBooleanValue;
        if (zBooleanValue) {
            try {
                ((Application) context).registerActivityLifecycleCallbacks(new C3360i(this));
            } catch (Throwable th) {
                q9.d().a(th);
                oh ohVar = new oh();
                ohVar.a(dc.y, th.getMessage());
                th.a(hs.f25283u, ohVar.a());
            }
        }
    }

    @Override // com.p004ironsource.w9
    public void b(String str, String str2) {
        va vaVarD = d(mh.e.Interstitial, str);
        if (vaVarD != null) {
            zj zjVarC = vaVarD.c();
            this.j.a(l1.SHOW_FAIL, zjVarC.e());
            if (c(zjVarC)) {
                this.f24810i.a(new eu(this.k.a(zjVarC.e())));
            }
            np npVarB = b(vaVarD);
            if (npVarB != null) {
                npVarB.onInterstitialShowFailed(str2);
            }
        }
    }

    public boolean c(zj zjVar) {
        return zjVar.l() && !zjVar.i() && a(zjVar);
    }

    @Override // com.p004ironsource.u9
    public void a(mh.e eVar, String str) {
        np npVarB;
        va vaVarD = d(eVar, str);
        if (vaVarD != null) {
            if (eVar == mh.e.RewardedVideo) {
                sp spVarC = c(vaVarD);
                if (spVarC != null) {
                    spVarC.c();
                    return;
                }
                return;
            }
            if (eVar != mh.e.Interstitial || (npVarB = b(vaVarD)) == null) {
                return;
            }
            npVarB.onInterstitialClose();
        }
    }

    @Override // com.p004ironsource.js
    public void b(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        String strOptString = jSONObject.optString("demandSourceName");
        if (TextUtils.isEmpty(strOptString)) {
            return;
        }
        this.f24805a.a(new d(strOptString));
    }

    @Override // com.p004ironsource.u9
    public void a(mh.e eVar, String str, x2 x2Var) {
        lp lpVarA;
        va vaVarD = d(eVar, str);
        if (vaVarD != null) {
            vaVarD.b(2);
            if (eVar == mh.e.RewardedVideo) {
                sp spVarC = c(vaVarD);
                if (spVarC != null) {
                    spVarC.a(x2Var);
                    return;
                }
                return;
            }
            if (eVar == mh.e.Interstitial) {
                np npVarB = b(vaVarD);
                if (npVarB != null) {
                    npVarB.onInterstitialInitSuccess();
                    return;
                }
                return;
            }
            if (eVar != mh.e.Banner || (lpVarA = a(vaVarD)) == null) {
                return;
            }
            lpVarA.onBannerInitSuccess();
        }
    }

    @Override // com.p004ironsource.u9
    public void a(mh.e eVar, String str, String str2) {
        lp lpVarA;
        va vaVarD = d(eVar, str);
        oh ohVarA = new oh().a(dc.v, str).a(dc.f24790w, eVar).a(dc.f24769A, str2);
        if (vaVarD != null) {
            C3367l0 c3367l0 = C3367l0.f25553a;
            ohVarA.a(dc.f24773I, Long.valueOf(c3367l0.b(vaVarD.h())));
            ohVarA.a(dc.x, Boolean.valueOf(uh.a(vaVarD)));
            c3367l0.a(vaVarD.h());
            vaVarD.b(3);
            if (eVar == mh.e.RewardedVideo) {
                sp spVarC = c(vaVarD);
                if (spVarC != null) {
                    spVarC.b(str2);
                }
            } else if (eVar == mh.e.Interstitial) {
                np npVarB = b(vaVarD);
                if (npVarB != null) {
                    npVarB.onInterstitialInitFailed(str2);
                }
            } else if (eVar == mh.e.Banner && (lpVarA = a(vaVarD)) != null) {
                lpVarA.onBannerLoadFail(str2);
            }
        }
        th.a(hs.f25279i, ohVarA.a());
    }

    @Override // com.p004ironsource.u9
    public void a(mh.e eVar, String str, String str2, JSONObject jSONObject) {
        lp lpVarA;
        va vaVarD = d(eVar, str);
        if (vaVarD == null || TextUtils.isEmpty(str2)) {
            return;
        }
        try {
            Logger.i(m, "Received Event Notification: " + str2 + " for demand source: " + vaVarD.f());
            if (eVar == mh.e.Interstitial) {
                np npVarB = b(vaVarD);
                if (npVarB != null) {
                    jSONObject.put("demandSourceName", str);
                    npVarB.onInterstitialEventNotificationReceived(str2, jSONObject);
                    return;
                }
                return;
            }
            if (eVar == mh.e.RewardedVideo) {
                sp spVarC = c(vaVarD);
                if (spVarC != null) {
                    jSONObject.put("demandSourceName", str);
                    spVarC.a(str2, jSONObject);
                    return;
                }
                return;
            }
            if (eVar != mh.e.Banner || (lpVarA = a(vaVarD)) == null) {
                return;
            }
            jSONObject.put("demandSourceName", str);
            if (str2.equalsIgnoreCase("impressions")) {
                lpVarA.onBannerShowSuccess();
            }
        } catch (JSONException e2) {
            q9.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
        }
    }

    @Override // com.p004ironsource.kk
    public void a(zj zjVar, Map<String, String> map) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        map.put(d9.h.y0, String.valueOf(jCurrentTimeMillis));
        C3367l0.f25553a.a(zjVar.e(), jCurrentTimeMillis);
        oh ohVar = new oh();
        ohVar.a(dc.x, Boolean.valueOf(zjVar.j())).a(dc.G, Boolean.valueOf(zjVar.m())).a(dc.v, zjVar.g()).a(dc.f24790w, jk.a(zjVar)).a(dc.f24773I, Long.valueOf(jCurrentTimeMillis));
        th.a(hs.f, ohVar.a());
        Logger.d(m, "loadAd " + zjVar.e());
        C3373n0 c3373n0 = new C3373n0(zjVar);
        this.j.a(c3373n0);
        this.j.a(new JSONObject(map), l1.LOAD_REQUEST, c3373n0.c());
        if (c(zjVar)) {
            this.f24810i.a(new cu(c3373n0));
        }
        if (zjVar.k()) {
            c(zjVar, map);
        } else {
            b(zjVar, map);
        }
    }

    @Override // com.p004ironsource.x9
    public void a(String str, int i2) {
        sp spVarC;
        va vaVarD = d(mh.e.RewardedVideo, str);
        if (vaVarD == null || (spVarC = c(vaVarD)) == null) {
            return;
        }
        spVarC.a(i2);
    }

    @Override // com.p004ironsource.v9
    public void a(String str, dh dhVar) {
        lp lpVarA;
        va vaVarD = d(mh.e.Banner, str);
        if (vaVarD == null || (lpVarA = a(vaVarD)) == null) {
            return;
        }
        lpVarA.onBannerLoadSuccess(vaVarD.c(), dhVar);
    }

    @Override // com.p004ironsource.v9
    public void a(String str, String str2) {
        lp lpVarA;
        va vaVarD = d(mh.e.Banner, str);
        if (vaVarD == null || (lpVarA = a(vaVarD)) == null) {
            return;
        }
        lpVarA.onBannerLoadFail(str2);
    }

    @Override // com.p004ironsource.js
    public void a(String str, String str2, int i2) {
        mh.e productType;
        va vaVarA;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || (productType = SDKUtils.getProductType(str)) == null || (vaVarA = this.d.a(productType, str2)) == null) {
            return;
        }
        vaVarA.c(i2);
    }

    @Override // com.p004ironsource.js
    public void a(String str, String str2, String str3, Map<String, String> map, np npVar) {
        this.f24806b = str;
        this.f24807c = str2;
        this.f24805a.a(new c(str, str2, this.d.a(mh.e.Interstitial, str3, map, npVar)));
    }

    @Override // com.p004ironsource.js
    public void a(String str, String str2, String str3, Map<String, String> map, sp spVar) {
        this.f24806b = str;
        this.f24807c = str2;
        this.f24805a.a(new a(str, str2, this.d.a(mh.e.RewardedVideo, str3, map, spVar)));
    }

    @Override // com.p004ironsource.w9
    public void a(String str, JSONObject jSONObject) {
        mh.e eVar = mh.e.Interstitial;
        va vaVarD = d(eVar, str);
        oh ohVarA = new oh().a(dc.v, str);
        if (vaVarD != null) {
            zj zjVarC = vaVarD.c();
            this.j.a(jSONObject, l1.LOAD_SUCCESS, zjVarC.e());
            if (c(zjVarC)) {
                this.f24810i.a(new du(this.k.a(zjVarC.e())));
            }
            oh ohVarA2 = ohVarA.a(dc.f24790w, uh.a(vaVarD, eVar)).a(dc.x, Boolean.valueOf(uh.a(vaVarD)));
            C3367l0 c3367l0 = C3367l0.f25553a;
            ohVarA2.a(dc.f24773I, Long.valueOf(c3367l0.b(vaVarD.h())));
            c3367l0.a(vaVarD.h());
            np npVarB = b(vaVarD);
            if (npVarB != null) {
                npVarB.onInterstitialLoadSuccess(vaVarD.c());
            }
        }
        th.a(hs.f25280l, ohVarA.a());
    }

    @Override // com.p004ironsource.js
    public void a(JSONObject jSONObject) {
        this.f24805a.a(new b(jSONObject));
    }

    @Override // com.p004ironsource.kk
    public boolean a(zj zjVar) {
        Logger.d(m, "isAdAvailable " + zjVar.e());
        va vaVarA = this.d.a(mh.e.Interstitial, zjVar.e());
        if (vaVarA == null) {
            return false;
        }
        return vaVarA.d();
    }

    @Override // com.p004ironsource.js
    public boolean a(String str) {
        return this.f24805a.a(str);
    }
}
