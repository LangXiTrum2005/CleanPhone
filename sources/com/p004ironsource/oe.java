package com.p004ironsource;

import android.content.Context;
import android.text.TextUtils;
import com.p004ironsource.environment.thread.IronSourceThreadManager;
import com.p004ironsource.mediationsdk.adquality.AdQualityBridge;
import com.p004ironsource.mediationsdk.config.ConfigFile;
import com.p004ironsource.mediationsdk.logger.IronLog;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class oe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final vf f26366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ConcurrentHashMap<String, Object> f26367b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f26368c;
    private final AtomicBoolean d;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f26369a;

        public a(Context context) {
            this.f26369a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                oe.this.e(this.f26369a);
            } catch (Exception e2) {
                q9.d().a(e2);
                IronLog.INTERNAL.error(e2.toString());
            }
            oe.this.f26368c.set(false);
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static volatile oe f26371a = new oe(null);

        private b() {
        }
    }

    private oe() {
        this.f26368c = new AtomicBoolean(false);
        this.d = new AtomicBoolean(false);
        this.f26366a = on.U().f();
        this.f26367b = new ConcurrentHashMap<>();
    }

    public static oe b() {
        return b.f26371a;
    }

    private void d(Context context) {
        if (context == null || this.d.getAndSet(true)) {
            return;
        }
        a("auid", this.f26366a.t(context));
        a("model", this.f26366a.e());
        a(ne.t, this.f26366a.g());
        a(ne.f26256E, this.f26366a.m());
        a(ne.f26278p, this.f26366a.r(context));
        String adQualitySdkVersion = AdQualityBridge.getAdQualitySdkVersion();
        if (!TextUtils.isEmpty(adQualitySdkVersion)) {
            a(ne.A1, adQualitySdkVersion);
        }
        String strP = this.f26366a.p();
        if (strP != null) {
            a(ne.f26257F, strP.replaceAll("[^0-9/.]", ""));
            a(ne.f26258I, strP);
        }
        a(ne.f26267a, String.valueOf(this.f26366a.l()));
        String strJ = this.f26366a.j(context);
        if (!TextUtils.isEmpty(strJ)) {
            a(ne.O0, strJ);
        }
        String strE = b4.e(context);
        if (!TextUtils.isEmpty(strE)) {
            a(ne.o, strE);
        }
        String strI = this.f26366a.i(context);
        if (!TextUtils.isEmpty(strI)) {
            a(ne.u0, strI);
        }
        a("bid", context.getPackageName());
        a(ne.v, String.valueOf(this.f26366a.h(context)));
        a("tkv", "2.0");
        a(ne.f26269b0, Long.valueOf(b4.f(context)));
        a(ne.Z, Long.valueOf(b4.d(context)));
        a(ne.d, b4.b(context));
        a(ne.f26260N, Integer.valueOf(z8.f(context)));
        a(ne.X, z8.g(context));
        a("stid", fq.c(context));
        a("platform", "android");
        a(ne.f26281z, this.f26366a.i());
        a(ne.y, this.f26366a.a(this.f26366a.z(context)));
        a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(Context context) {
        if (context == null) {
            return;
        }
        try {
            String strP = this.f26366a.p(context);
            if (!TextUtils.isEmpty(strP)) {
                a("gaid", strP);
            }
            String strA = this.f26366a.a(context);
            if (TextUtils.isEmpty(strA)) {
                return;
            }
            a("lat", Boolean.valueOf(Boolean.parseBoolean(strA)));
        } catch (Exception e2) {
            q9.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
        }
    }

    private void f(Context context) {
        if (context == null) {
            return;
        }
        a(context);
        String strG = this.f26366a.G(context);
        if (!TextUtils.isEmpty(strG)) {
            a("asid", strG);
        } else if (a("asid")) {
            b("asid");
        }
        a("idfi", this.f26366a.w(context));
        String strB = this.f26366a.b(context);
        if (!TextUtils.isEmpty(strB)) {
            a("lang", strB.toUpperCase(Locale.getDefault()));
        }
        a(ne.r, this.f26366a.I(context));
        String strB2 = this.f26366a.b();
        if (!TextUtils.isEmpty(strB2)) {
            a("tz", strB2);
        }
        String strB3 = a9.b(context);
        if (!TextUtils.isEmpty(strB3) && !strB3.equals("none")) {
            a(ne.j, strB3);
        }
        String strD = a9.d(context);
        if (!TextUtils.isEmpty(strD)) {
            a(ne.k, strD);
        }
        a("vpn", Boolean.valueOf(a9.e(context)));
        String strN = this.f26366a.n(context);
        if (!TextUtils.isEmpty(strN)) {
            a("icc", strN);
        }
        int iB = this.f26366a.B(context);
        if (iB >= 0) {
            a(ne.i1, Integer.valueOf(iB));
        }
        a(ne.j1, this.f26366a.D(context));
        a(ne.k1, this.f26366a.K(context));
        a(ne.g0, Float.valueOf(this.f26366a.m(context)));
        a(ne.m, String.valueOf(this.f26366a.o()));
        a(ne.f26262Q, Integer.valueOf(this.f26366a.d()));
        a(ne.f26261P, Integer.valueOf(this.f26366a.k()));
        a(ne.W0, String.valueOf(this.f26366a.j()));
        a(ne.f1, String.valueOf(this.f26366a.q()));
        a("mcc", Integer.valueOf(z8.b(context)));
        a("mnc", Integer.valueOf(z8.c(context)));
        a(ne.S, Boolean.valueOf(this.f26366a.c()));
        a(ne.g, Boolean.valueOf(this.f26366a.J(context)));
        a(ne.f26274h, Integer.valueOf(this.f26366a.l(context)));
        a(ne.f26268b, Boolean.valueOf(this.f26366a.c(context)));
        a(ne.f26259J, Boolean.valueOf(this.f26366a.d(context)));
        a("rt", Boolean.valueOf(this.f26366a.f()));
        a(ne.f26266Y, String.valueOf(this.f26366a.h()));
        a(ne.f26273e, Integer.valueOf(this.f26366a.y(context)));
        a(ne.X0, Boolean.valueOf(this.f26366a.q(context)));
        a(ne.f26270c, this.f26366a.f(context));
        a("ua", this.f26366a.t());
        C3388y c3388y = new C3388y(on.U().k());
        HashMap map = new HashMap();
        c3388y.a(map);
        a(ne.C0, map);
        a(ne.K, ConfigFile.getConfigFile().getPluginType());
        a(ne.L, ConfigFile.getConfigFile().getPluginVersion());
        a(ne.M, ConfigFile.getConfigFile().getPluginFrameworkVersion());
    }

    public void c(Context context) {
        try {
            d(context);
            f(context);
        } catch (Exception e2) {
            q9.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
        }
    }

    public /* synthetic */ oe(a aVar) {
        this();
    }

    private void a() {
        String strA = ow.f26420a.a();
        if (strA != null) {
            HashMap mapS = androidx.media3.extractor.text.ttml.a.s("sdk", strA);
            HashMap map = new HashMap();
            map.put(ne.F1, mapS);
            HashMap map2 = new HashMap();
            map2.put(ne.C1, map);
            a(map2);
        }
    }

    public JSONObject b(Context context) throws JSONException {
        f(context);
        return new JSONObject(qe.a(this.f26367b));
    }

    public void b(String str) {
        if (str == null) {
            return;
        }
        try {
            this.f26367b.remove(str);
        } catch (Exception e2) {
            q9.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
        }
    }

    public void b(String str, Object obj) {
        a(str, obj);
    }

    private void a(Context context) {
        if (this.f26368c.get()) {
            return;
        }
        try {
            this.f26368c.set(true);
            IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(new a(context));
        } catch (Exception e2) {
            q9.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
            this.f26368c.set(false);
        }
    }

    private void a(String str, Object obj) {
        if (str == null || obj == null) {
            return;
        }
        try {
            if (obj instanceof Boolean) {
                obj = Integer.valueOf(((Boolean) obj).booleanValue() ? 1 : 0);
            }
            this.f26367b.put(str, obj);
        } catch (Exception e2) {
            q9.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
        }
    }

    public void a(String str, JSONArray jSONArray) {
        if (jSONArray == null) {
            return;
        }
        try {
            Object obj = this.f26367b.get(str);
            if (!(obj instanceof JSONArray)) {
                a(str, (Object) jSONArray);
                return;
            }
            JSONArray jSONArray2 = (JSONArray) obj;
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                jSONArray2.put(jSONArray.get(i2));
            }
            a(str, (Object) jSONArray2);
        } catch (Exception e2) {
            q9.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
        }
    }

    public void a(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            Object obj = this.f26367b.get(str);
            if (!(obj instanceof JSONObject)) {
                a(str, (Object) jSONObject);
                return;
            }
            JSONObject jSONObject2 = (JSONObject) obj;
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                jSONObject2.putOpt(next, jSONObject.opt(next));
            }
            a(str, (Object) jSONObject2);
        } catch (Exception e2) {
            q9.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
        }
    }

    public void a(Map<String, Object> map) {
        if (map == null) {
            return;
        }
        try {
            for (String str : map.keySet()) {
                if (map.containsKey(str)) {
                    a(str, map.get(str));
                }
            }
        } catch (Exception e2) {
            q9.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
        }
    }

    private boolean a(String str) {
        return str != null && this.f26367b.containsKey(str);
    }
}
