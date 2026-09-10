package com.smartdigimkt.f3;

import android.text.TextUtils;
import com.smartdigimkt.c3.i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f35046c = "reward";
    private static final String d = "RewardSettingManager";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static Map<String, d> f35047e = new HashMap(3);
    private static volatile c f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Object f35048a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.smartdigimkt.f3.a f35049b;

    public class a implements i.e {
        public a() {
        }

        @Override // com.smartdigimkt.c3.i.b
        public void a(String str, String str2, boolean z2) {
        }

        @Override // com.smartdigimkt.c3.i.b
        public void b(String str, String str2) {
        }
    }

    private c() {
        this.f35049b = null;
        this.f35049b = a();
    }

    public static c b() {
        if (f == null) {
            synchronized (c.class) {
                try {
                    if (f == null) {
                        f = new c();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f;
    }

    public d a(String str, String str2, boolean z2) {
        d dVarA;
        synchronized (this.f35048a) {
            try {
                String str3 = "reward_" + str + "_" + str2;
                dVarA = f35047e.get(str3);
                if (dVarA == null) {
                    dVarA = a(z2);
                    f35047e.put(str3, dVarA);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return dVarA;
    }

    public com.smartdigimkt.f3.a c() {
        com.smartdigimkt.f3.a aVar = this.f35049b;
        return aVar == null ? a() : aVar;
    }

    public d b(String str, String str2) {
        synchronized (this.f35048a) {
            try {
                String str3 = "reward_" + str + "_" + str2;
                if (f35047e.containsKey(str3)) {
                    return f35047e.get(str3);
                }
                d dVarA = d.a(com.smartdigimkt.t.a.b().a(str3));
                f35047e.put(str3, dVarA);
                return dVarA;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final com.smartdigimkt.f3.a a() {
        com.smartdigimkt.f3.a aVar = new com.smartdigimkt.f3.a();
        HashMap map = new HashMap(5);
        map.put("1", 1000);
        map.put(b.j, 1000);
        map.put("8", 1000);
        HashMap map2 = new HashMap(3);
        map2.put("1", new com.smartdigimkt.d3.c("Virtual Item", 1));
        aVar.a(map);
        aVar.b(map2);
        aVar.c(43200L);
        aVar.e(5400L);
        aVar.d(com.smartdigimkt.o1.b.f37307P);
        aVar.b(com.smartdigimkt.o1.b.f37307P);
        aVar.f(5L);
        return aVar;
    }

    public void a(String str, boolean z2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        d dVarA = b().a(com.smartdigimkt.u.a.f().a(), str, z2);
        String strD = dVarA != null ? dVarA.d() : "";
        if (TextUtils.isEmpty(strD) || !TextUtils.isEmpty(i.a().c(strD))) {
            return;
        }
        a(strD, str);
    }

    private void a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        i.a().b(str, (i.b) new a());
    }

    public static boolean a(String str) {
        JSONArray jSONArrayOptJSONArray;
        try {
            if (!TextUtils.isEmpty(str) && (jSONArrayOptJSONArray = new JSONObject(str).optJSONArray("unitSetting")) != null) {
                String strOptString = jSONArrayOptJSONArray.optJSONObject(0).optString("unitId");
                if (jSONArrayOptJSONArray.length() > 0 && !TextUtils.isEmpty(strOptString)) {
                    return true;
                }
            }
            return false;
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }

    public static d a(boolean z2) {
        d dVar = new d();
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new com.smartdigimkt.d3.b(1, 60, null));
            dVar.a((List<com.smartdigimkt.d3.b>) arrayList);
            dVar.c(1);
            dVar.f(1);
            dVar.I(1);
            dVar.i(1);
            dVar.x(1);
            dVar.p(1);
            dVar.H(3);
            dVar.G(80);
            dVar.B(100);
            dVar.k(0);
            dVar.q(2);
            dVar.K(-1);
            dVar.r(70);
            dVar.L(2);
            if (z2) {
                dVar.M(5);
            } else {
                dVar.M(-1);
            }
            dVar.o(0);
            dVar.D(0);
            dVar.m(1);
            dVar.F(1);
            dVar.g(3);
            ArrayList<Integer> arrayList2 = new ArrayList<>();
            arrayList2.add(4);
            arrayList2.add(6);
            dVar.a(arrayList2);
            return dVar;
        } catch (Exception e2) {
            e2.printStackTrace();
            return dVar;
        }
    }
}
