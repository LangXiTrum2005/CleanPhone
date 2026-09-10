package com.smartdigimkt.l8;

import android.text.TextUtils;
import com.smartdigimkt.n8.j;
import com.smartdigimkt.w6.g;
import com.thinkup.core.oo.m0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class e extends b {
    private static final String W = "PlaceStrategy";
    public static final int X = 0;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final int f36477Y = 1;
    public static final int Z = 2;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private JSONObject f36479B;
    private int C;
    private c D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private JSONObject f36480E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private int f36481F;
    private double H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private double f36482I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private String f36483J;
    private String K;
    private String L;
    private double M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private String f36484N;
    private int O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private List<com.smartdigimkt.z6.a> f36485P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private com.smartdigimkt.z6.c f36486Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private JSONArray f36487R;
    private Boolean S;
    private long T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private List<f> f36488U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private Map<String, f> f36489V;
    private final String f;
    private long g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f36490h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f36491i;
    private int j;
    private int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f36492l;
    private long m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f36493n;
    private int o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f36494p;
    private long q;
    private long r;
    private String s;
    private long t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private JSONArray f36495u;
    private JSONArray v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private double f36496w;
    private int x;
    private int y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private long f36497z;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private int f36478A = 0;
    private String G = "";

    public static class a {

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        public static final String f36498A = "s2s_bd_max";

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        public static final String f36499B = "adx_ext";
        public static final String C = "exch_rate_c2u";
        public static final String D = "asid";

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        public static final String f36500E = "updateTime";

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        public static final String f36501F = "addr_st";
        private static final String G = "u_n_f_sw";
        private static final String H = "m_o";

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        private static final String f36502I = "m_o_s";

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        private static final String f36503J = "m_o_ks";
        private static final String K = "p_m_o";
        public static final String L = "updateTime";
        private static final String M = "ug_list";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f36504a = "ps_ct";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f36505b = "ps_ct_out";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f36506c = "ps_ct_max";
        public static final String d = "pucs";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final String f36507e = "ad_delivery_sw";
        public static final String f = "session_id";
        public static final String g = "s_t";

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final String f36508h = "is_test";

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final String f36509i = "format";
        private static final String j = "auto_refresh";
        private static final String k = "auto_refresh_time";

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final String f36510l = "hb_bid_timeout";
        public static final String m = "addr_bid";

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final String f36511n = "s_ts";
        public static final String o = "adx_list";

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final String f36512p = "doffer_list";
        public static final String q = "bid_floor";
        public static final String r = "install_id_max";
        public static final String s = "exclude_id_max";
        public static final String t = "pl_wf_st_type";

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public static final String f36513u = "p_c";
        public static final String v = "e_key_data";

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public static final String f36514w = "unique_id";
        public static final String x = "c_pub_key";
        public static final String y = "s_id";

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public static final String f36515z = "c_id";
    }

    private e(String str) {
        this.f = str;
    }

    private boolean Y() {
        return System.currentTimeMillis() - this.f36497z > this.f36490h;
    }

    private static e a(String str, JSONObject jSONObject) {
        long jOptLong;
        e eVar = new e(str);
        eVar.T = System.currentTimeMillis();
        try {
            eVar.c(jSONObject);
            eVar.b(jSONObject);
            eVar.a(jSONObject);
            if (jSONObject.isNull("updateTime")) {
                eVar.a(0L);
                jOptLong = 0;
            } else {
                jOptLong = jSONObject.optLong("updateTime");
                eVar.a(jOptLong);
            }
            eVar.g = jSONObject.optLong(a.f36504a, 0L);
            eVar.f36490h = jSONObject.optLong("ps_ct_max", m0.om);
            eVar.f36491i = jSONObject.optLong(a.f36505b, 0L);
            eVar.j = jSONObject.optInt(a.d, 1);
            eVar.k = jSONObject.optInt(a.f36507e, 1);
            eVar.f36492l = jSONObject.optString("session_id");
            eVar.m = jSONObject.optLong(a.g, 900000L);
            eVar.f36493n = jSONObject.optInt("is_test", 2);
            eVar.o = jSONObject.optInt("format", 0);
            eVar.f36494p = jSONObject.optInt("auto_refresh", 0);
            eVar.q = jSONObject.optInt("auto_refresh_time", 0);
            eVar.r = jSONObject.optLong("hb_bid_timeout", 10000L);
            eVar.s = jSONObject.optString("addr_bid");
            eVar.t = jSONObject.optLong(a.f36511n);
            eVar.f36478A = jSONObject.optInt("pl_wf_st_type", 0);
            eVar.f36479B = jSONObject.optJSONObject("p_c");
            eVar.C = jSONObject.optInt("p_m_o", 0);
            eVar.b(jSONObject.optInt("u_n_f_sw", 0));
            eVar.a(com.smartdigimkt.z6.c.w(jSONObject.optString("m_o_s", "")));
            if (!jSONObject.isNull("m_o")) {
                eVar.a(com.smartdigimkt.z6.a.a(jSONObject.optString("m_o"), jSONObject.optString("m_o_ks"), jOptLong, eVar.D()));
            }
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("e_key_data");
            if (jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.length() > 0) {
                c cVarA = c.a();
                cVarA.d(jSONObject.optString("unique_id"));
                cVarA.a(jSONObjectOptJSONObject.optString("c_pub_key"));
                cVarA.b(jSONObjectOptJSONObject.optInt("s_id"));
                cVarA.a(jSONObjectOptJSONObject.optInt("c_id"));
                eVar.D = cVarA;
            }
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("addr_st");
            if (jSONObjectOptJSONObject2 != null) {
                eVar.f36480E = jSONObjectOptJSONObject2;
            }
            eVar.f36481F = jSONObject.optInt("s2s_bd_max", 0);
            eVar.G = jSONObject.optString("adx_ext");
            eVar.f36497z = jSONObject.optLong("updateTime", 0L);
            eVar.f36495u = jSONObject.optJSONArray("adx_list");
            eVar.v = jSONObject.optJSONArray("doffer_list");
            eVar.f36496w = jSONObject.optDouble("bid_floor", 0.0d);
            eVar.x = jSONObject.optInt("install_id_max", 0);
            eVar.y = jSONObject.optInt("exclude_id_max", 0);
            double dOptDouble = jSONObject.optDouble("exch_rate_c2u", 0.1614d);
            eVar.H = dOptDouble;
            if (dOptDouble >= 0.0d) {
                eVar.f36482I = 1.0d / dOptDouble;
            }
            j.a(dOptDouble);
            eVar.f36483J = jSONObject.optString("asid");
            if (jSONObject.isNull("ug_list")) {
                eVar.a(new JSONArray());
                return eVar;
            }
            eVar.a(jSONObject.optJSONArray("ug_list"));
            return eVar;
        } catch (Throwable unused) {
        }
    }

    public static e b(String str, JSONObject jSONObject) {
        e eVarA = a(str, jSONObject);
        if (eVarA != null) {
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
            ArrayList arrayList = new ArrayList();
            com.smartdigimkt.m8.b.a(eVarA, concurrentHashMap, arrayList);
            List<f> listA = com.smartdigimkt.m8.b.a(eVarA, eVarA.F(), 0, 1);
            arrayList.clear();
            if (listA != null && !listA.isEmpty()) {
                for (int i2 = 0; i2 < listA.size(); i2++) {
                    if (listA.get(i2).t0() == 35) {
                        arrayList.add(listA.get(i2));
                    }
                }
            }
            eVarA.b(arrayList);
            eVarA.a(concurrentHashMap);
        }
        return eVarA;
    }

    public int A() {
        return this.y;
    }

    public int B() {
        return this.x;
    }

    public List<com.smartdigimkt.z6.a> C() {
        return this.f36485P;
    }

    public com.smartdigimkt.z6.c D() {
        return this.f36486Q;
    }

    public List<f> E() {
        return this.f36488U;
    }

    public JSONArray F() {
        return this.f36487R;
    }

    public JSONObject G() {
        return this.f36479B;
    }

    public long H() {
        return this.T;
    }

    public String I() {
        return this.f;
    }

    public long J() {
        return this.m;
    }

    public double K() {
        return this.H;
    }

    public int L() {
        return this.f36481F;
    }

    public long M() {
        return this.t;
    }

    public String N() {
        return this.f36492l;
    }

    public int O() {
        return this.f36478A;
    }

    public Map<String, f> P() {
        return this.f36489V;
    }

    public long Q() {
        return this.f36491i;
    }

    public long R() {
        return this.f36497z;
    }

    public double S() {
        return this.f36482I;
    }

    public int T() {
        return this.O;
    }

    public boolean U() {
        return this.k == 1;
    }

    public boolean V() {
        return this.f36493n == 1;
    }

    public boolean W() {
        int i2 = this.f36478A;
        if (i2 != 0) {
            if (i2 == 1) {
                return false;
            }
            if (i2 != 2) {
                return true;
            }
        }
        return Y();
    }

    public boolean X() {
        return System.currentTimeMillis() - this.f36497z > this.g;
    }

    public boolean Z() {
        return this.f36478A == 0;
    }

    public boolean a0() {
        return this.j == 1;
    }

    public f c(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        List<f> listE = E();
        if (!listE.isEmpty()) {
            for (int i2 = 0; i2 < listE.size(); i2++) {
                if (TextUtils.equals(str, listE.get(i2).h())) {
                    return listE.get(i2);
                }
            }
        }
        return null;
    }

    public void d(String str) {
        this.f36484N = str;
    }

    public void e(String str) {
        this.L = str;
    }

    public void f(String str) {
        this.K = str;
    }

    public double g() {
        return this.M;
    }

    public JSONObject h() {
        return this.f36480E;
    }

    public String i() {
        return this.G;
    }

    public f j() {
        List<f> listA = com.smartdigimkt.m8.b.a(this, this.f36495u);
        if (listA.isEmpty()) {
            return null;
        }
        return listA.get(0);
    }

    public JSONArray k() {
        return this.f36495u;
    }

    public String l() {
        return this.f36483J;
    }

    public int m() {
        return this.f36494p;
    }

    public long n() {
        return this.q;
    }

    public String o() {
        return this.s;
    }

    public long p() {
        return this.f36490h;
    }

    public long q() {
        return this.g;
    }

    public String r() {
        return this.L;
    }

    public String s() {
        return this.K;
    }

    public JSONArray t() {
        return this.v;
    }

    public c u() {
        return this.D;
    }

    public int v() {
        return this.o;
    }

    public long w() {
        return this.r;
    }

    public double x() {
        return this.f36496w;
    }

    public Boolean y() {
        return this.S;
    }

    public int z() {
        return this.C;
    }

    public String f() {
        return this.f36484N;
    }

    public void b(List<f> list) {
        this.f36488U = list;
    }

    public void b(int i2) {
        this.O = i2;
    }

    public com.smartdigimkt.z6.a b(String str) {
        List<com.smartdigimkt.z6.a> list = this.f36485P;
        if (list == null) {
            return null;
        }
        for (com.smartdigimkt.z6.a aVar : list) {
            if (aVar.i() == null) {
                aVar.b((g) this.f36486Q);
            }
            if (TextUtils.equals(str, aVar.L()) && !aVar.b(this.f36486Q)) {
                return aVar;
            }
        }
        return null;
    }

    public f a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        List<f> listA = com.smartdigimkt.m8.b.a(this, t(), 7, 8);
        if (!listA.isEmpty()) {
            for (int i2 = 0; i2 < listA.size(); i2++) {
                if (TextUtils.equals(str, listA.get(i2).h())) {
                    return listA.get(i2);
                }
            }
        }
        return null;
    }

    public void a(Boolean bool) {
        this.S = bool;
    }

    public void a(long j) {
        this.f36497z = j;
    }

    public void a(int i2) {
        this.f36478A = i2;
    }

    public void a(Map<String, f> map) {
        this.f36489V = map;
    }

    public void a(double d) {
        this.M = d;
    }

    public void a(com.smartdigimkt.z6.c cVar) {
        this.f36486Q = cVar;
    }

    public void a(List<com.smartdigimkt.z6.a> list) {
        this.f36485P = list;
    }

    public void a(JSONArray jSONArray) {
        this.f36487R = jSONArray;
    }
}
