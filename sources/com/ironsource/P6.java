package com.ironsource;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.adquality.AdQualityBridge;
import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class P6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC0674y7 f26997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ConcurrentHashMap<String, Object> f26998b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f26999c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AtomicBoolean f27000d;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f27001a;

        public a(Context context) {
            this.f27001a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                P6.this.e(this.f27001a);
            } catch (Exception e10) {
                C0474n4.d().a(e10);
                IronLog.INTERNAL.error(e10.toString());
            }
            P6.this.f26999c.set(false);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static volatile P6 f27003a = new P6(0);

        private b() {
        }
    }

    public /* synthetic */ P6(int i10) {
        this();
    }

    private void d(Context context) {
        if (context == null || this.f27000d.getAndSet(true)) {
            return;
        }
        a("auid", this.f26997a.e(context));
        a(O6.B, this.f26997a.l());
        a(O6.f26749t, this.f26997a.q());
        a(O6.F, this.f26997a.f());
        a(O6.f26738p, this.f26997a.L(context));
        String adQualitySdkVersion = AdQualityBridge.getAdQualitySdkVersion();
        if (!TextUtils.isEmpty(adQualitySdkVersion)) {
            a(O6.C1, adQualitySdkVersion);
        }
        String strI = this.f26997a.i();
        if (strI != null) {
            a(O6.G, strI.replaceAll("[^0-9/.]", ""));
            a(O6.J, strI);
        }
        a(O6.f26696a, String.valueOf(this.f26997a.e()));
        String strV = this.f26997a.v(context);
        if (!TextUtils.isEmpty(strV)) {
            a(O6.R0, strV);
        }
        String strE = E1.e(context);
        if (!TextUtils.isEmpty(strE)) {
            a(O6.f26735o, strE);
        }
        String strS = this.f26997a.s(context);
        if (!TextUtils.isEmpty(strS)) {
            a(O6.f26758w0, strS);
        }
        a("bid", context.getPackageName());
        a("mem", String.valueOf(this.f26997a.r(context)));
        a(O6.f26700b0, "2.0");
        a(O6.f26703c0, Long.valueOf(E1.f(context)));
        a(O6.f26697a0, Long.valueOf(E1.d(context)));
        a(O6.f26705d, E1.b(context));
        a(O6.O, Integer.valueOf(T3.f(context)));
        a(O6.Y, T3.g(context));
        a(O6.H, "android");
        a(O6.f26766z, this.f26997a.t());
        a("mThreshold", this.f26997a.a(this.f26997a.o(context)));
        a(O6.f26717h0, wj.c.f53275e.toString());
        a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(Context context) {
        if (context == null) {
            return;
        }
        try {
            String strI = this.f26997a.I(context);
            if (!TextUtils.isEmpty(strI)) {
                a(O6.X0, strI);
            }
            String strC = this.f26997a.c(context);
            if (TextUtils.isEmpty(strC)) {
                return;
            }
            a(O6.f26746s, Boolean.valueOf(Boolean.parseBoolean(strC)));
        } catch (Exception e10) {
            C0474n4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    private void f(Context context) {
        if (context == null) {
            return;
        }
        a(context);
        String strZ = this.f26997a.z(context);
        if (!TextUtils.isEmpty(strZ)) {
            a(O6.M0, strZ);
        } else if (a(O6.M0)) {
            b(O6.M0);
        }
        a("idfi", this.f26997a.j(context));
        String strD = this.f26997a.d(context);
        if (!TextUtils.isEmpty(strD)) {
            a(O6.f26741q, strD.toUpperCase(Locale.getDefault()));
        }
        a(O6.f26744r, this.f26997a.B(context));
        String strD2 = this.f26997a.d();
        if (!TextUtils.isEmpty(strD2)) {
            a("tz", strD2);
        }
        String strB = U3.b(context);
        if (!TextUtils.isEmpty(strB) && !strB.equals("none")) {
            a(O6.f26721j, strB);
        }
        String strD3 = U3.d(context);
        if (!TextUtils.isEmpty(strD3)) {
            a(O6.f26724k, strD3);
        }
        a("vpn", Boolean.valueOf(U3.e(context)));
        String strH = this.f26997a.H(context);
        if (!TextUtils.isEmpty(strH)) {
            a("icc", strH);
        }
        int iT = this.f26997a.t(context);
        if (iT >= 0) {
            a(O6.f26726k1, Integer.valueOf(iT));
        }
        a(O6.f26728l1, this.f26997a.w(context));
        a(O6.f26731m1, this.f26997a.G(context));
        a(O6.f26719i0, Float.valueOf(this.f26997a.F(context)));
        a(O6.f26729m, String.valueOf(this.f26997a.h()));
        a(O6.R, Integer.valueOf(this.f26997a.k()));
        a(O6.Q, Integer.valueOf(this.f26997a.c()));
        a(O6.Z0, String.valueOf(this.f26997a.a()));
        a(O6.h1, String.valueOf(this.f26997a.m()));
        a("mcc", Integer.valueOf(T3.b(context)));
        a("mnc", Integer.valueOf(T3.c(context)));
        a(O6.T, Boolean.valueOf(this.f26997a.j()));
        a(O6.f26714g, Boolean.valueOf(this.f26997a.D(context)));
        a(O6.f26716h, Integer.valueOf(this.f26997a.E(context)));
        a(O6.f26699b, Boolean.valueOf(this.f26997a.f(context)));
        a(O6.K, Boolean.valueOf(this.f26997a.i(context)));
        a("rt", Boolean.valueOf(this.f26997a.p()));
        a(O6.Z, String.valueOf(this.f26997a.r()));
        a(O6.f26708e, Integer.valueOf(this.f26997a.l(context)));
        a(O6.f26698a1, Boolean.valueOf(this.f26997a.J(context)));
        a(O6.f26702c, this.f26997a.n(context));
        a(O6.f26706d0, this.f26997a.s());
        A a8 = new A(Kb.Y().s());
        HashMap map = new HashMap();
        a8.a(map);
        a(O6.F0, map);
        a(O6.L, ConfigFile.getConfigFile().getPluginType());
        a(O6.M, ConfigFile.getConfigFile().getPluginVersion());
        a(O6.N, ConfigFile.getConfigFile().getPluginFrameworkVersion());
    }

    public void c(Context context) {
        try {
            d(context);
            f(context);
        } catch (Exception e10) {
            C0474n4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    private P6() {
        this.f26999c = new AtomicBoolean(false);
        this.f27000d = new AtomicBoolean(false);
        this.f26997a = Kb.Y().a();
        this.f26998b = new ConcurrentHashMap<>();
    }

    public static P6 b() {
        return b.f27003a;
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
        } catch (Exception e10) {
            C0474n4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    public void b(String str, Object obj) {
        a(str, obj);
    }

    public void b(String str) {
        if (str == null) {
            return;
        }
        try {
            this.f26998b.remove(str);
        } catch (Exception e10) {
            C0474n4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    public JSONObject b(Context context) throws JSONException {
        f(context);
        return new JSONObject(R6.a(this.f26998b));
    }

    public void a(String str, JSONArray jSONArray) {
        if (jSONArray == null) {
            return;
        }
        try {
            Object obj = this.f26998b.get(str);
            if (!(obj instanceof JSONArray)) {
                a(str, (Object) jSONArray);
                return;
            }
            JSONArray jSONArray2 = (JSONArray) obj;
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                jSONArray2.put(jSONArray.get(i10));
            }
            a(str, (Object) jSONArray2);
        } catch (Exception e10) {
            C0474n4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    public void a(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            Object obj = this.f26998b.get(str);
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
        } catch (Exception e10) {
            C0474n4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
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
            this.f26998b.put(str, obj);
        } catch (Exception e10) {
            C0474n4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    private boolean a(String str) {
        return str != null && this.f26998b.containsKey(str);
    }

    private void a(Context context) {
        if (this.f26999c.get()) {
            return;
        }
        try {
            this.f26999c.set(true);
            IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(new a(context));
        } catch (Exception e10) {
            C0474n4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            this.f26999c.set(false);
        }
    }

    private void a() {
        String strA = C0593tg.f30733a.a();
        if (strA != null) {
            HashMap mapN = com.applovin.impl.ca.n("sdk", strA);
            HashMap map = new HashMap();
            map.put(O6.H1, mapN);
            HashMap map2 = new HashMap();
            map2.put(O6.E1, map);
            a(map2);
        }
    }
}
