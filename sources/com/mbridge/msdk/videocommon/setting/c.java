package com.mbridge.msdk.videocommon.setting;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.db.g;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.RewardPlus;
import com.mbridge.msdk.foundation.tools.k0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public class c {
    private static g W;
    public static String X;
    private int E;
    private int G;
    private JSONArray U;
    private JSONObject V;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f38313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f38314b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<com.mbridge.msdk.videocommon.entity.b> f38315c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f38316d;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private ArrayList<Integer> f38331t;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f38317e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f38318f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f38319g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f38320h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f38321i = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f38322j = 1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f38323k = 1;
    private int l = 5;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f38324m = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f38325n = 3;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f38326o = 80;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f38327p = 100;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f38328q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private double f38329r = 1.0d;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f38330s = -1;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f38332u = 3;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f38333v = 1;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f38334w = 100;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f38335x = 60;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f38336y = 0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f38337z = 70;
    private int A = 0;
    private int B = -1;
    private int C = -1;
    private int D = -1;
    private int F = 20;
    private int H = 0;
    private int I = 1;
    private String J = "";
    private int K = 1;
    private String L = "";
    private int M = 1;
    private String N = "Virtual Item";
    private String O = "";
    private String P = "";
    private int Q = 0;
    private int R = 1;
    private int S = 60;
    private String T = "";

    public void A(int i10) {
        this.f38336y = i10;
    }

    public void B(int i10) {
        this.f38333v = i10;
    }

    public void C(int i10) {
        this.f38326o = i10;
    }

    public int D() {
        return this.D;
    }

    public int E() {
        return this.C;
    }

    public int F() {
        return this.B;
    }

    public void G(int i10) {
        this.D = i10;
    }

    public void H(int i10) {
        this.C = i10;
    }

    public void I(int i10) {
        this.B = i10;
    }

    public void a(ArrayList<Integer> arrayList) {
        this.f38331t = arrayList;
    }

    public void b(String str) {
        this.O = str;
        com.mbridge.msdk.foundation.controller.a.f33385r.put(this.f38313a, str);
    }

    public void c(int i10) {
        if (i10 <= 0) {
            this.K = 1;
        } else {
            this.K = i10;
        }
    }

    public void d(int i10) {
        this.H = i10;
    }

    public void e(String str) {
        if (TextUtils.isEmpty(str)) {
            this.N = this.J;
        } else {
            this.N = str;
        }
    }

    public void f(String str) {
        this.f38314b = str;
    }

    public void g(String str) {
        this.P = str;
    }

    public int h() {
        return this.f38319g;
    }

    public void i(String str) {
        this.J = str;
    }

    public void j(int i10) {
        this.f38319g = i10;
    }

    public int k() {
        return this.A;
    }

    public void l(int i10) {
        this.M = i10;
    }

    public void m(int i10) {
        this.A = i10;
    }

    public void n(int i10) {
        this.f38324m = i10;
    }

    public void o(int i10) {
        this.G = i10;
    }

    public int p() {
        return this.f38334w;
    }

    public int q() {
        return this.f38335x;
    }

    public int r() {
        return this.l;
    }

    public void s(int i10) {
        this.f38334w = i10;
    }

    public void t(int i10) {
        this.f38335x = i10;
    }

    public int u() {
        return this.f38317e;
    }

    public void v(int i10) {
        this.f38318f = i10;
    }

    public void w(int i10) {
        this.f38317e = i10;
    }

    public String x() {
        return this.P;
    }

    public int y() {
        return this.f38336y;
    }

    public void z(int i10) {
        this.f38330s = i10;
    }

    public int A() {
        return this.f38333v;
    }

    public JSONArray B() {
        return this.U;
    }

    public int C() {
        return this.R;
    }

    public void D(int i10) {
        this.f38325n = i10;
    }

    public void E(int i10) {
        this.f38323k = i10;
    }

    public void F(int i10) {
        this.R = i10;
    }

    public String G() {
        return this.T;
    }

    public JSONObject H() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("unitId", this.f38313a);
            jSONObject.put("callbackType", this.f38320h);
            List<com.mbridge.msdk.videocommon.entity.b> list = this.f38315c;
            if (list != null && list.size() > 0) {
                JSONArray jSONArray = new JSONArray();
                for (com.mbridge.msdk.videocommon.entity.b bVar : this.f38315c) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("id", bVar.a());
                    jSONObject2.put("timeout", bVar.b());
                    jSONArray.put(jSONObject2);
                }
                jSONObject.put("adSourceList", jSONArray);
            }
            jSONObject.put("aqn", this.f38321i);
            jSONObject.put("acn", this.f38322j);
            jSONObject.put("vcn", this.f38323k);
            jSONObject.put("offset", this.l);
            jSONObject.put("dlnet", this.f38324m);
            jSONObject.put("tv_start", this.f38325n);
            jSONObject.put("tv_end", this.f38326o);
            jSONObject.put(CampaignEx.JSON_KEY_READY_RATE, this.f38327p);
            jSONObject.put("endscreen_type", this.G);
            jSONObject.put("daily_play_cap", this.A);
            jSONObject.put("video_skip_time", this.B);
            jSONObject.put("video_skip_result", this.C);
            jSONObject.put("video_interactive_type", this.D);
            jSONObject.put("orientation", this.f38336y);
            jSONObject.put("close_button_delay", this.E);
            jSONObject.put("playclosebtn_tm", this.f38317e);
            jSONObject.put("play_ctdown", this.f38318f);
            jSONObject.put("close_alert", this.f38319g);
            jSONObject.put("rfpv", this.f38330s);
            jSONObject.put("vdcmp", this.f38329r);
            JSONArray jSONArray2 = new JSONArray();
            ArrayList<Integer> arrayList = this.f38331t;
            if (arrayList != null) {
                if (arrayList.size() > 0) {
                    Iterator<Integer> it = this.f38331t.iterator();
                    while (it.hasNext()) {
                        jSONArray2.put(it.next());
                    }
                }
                jSONObject.put("atl_type", jSONArray2);
            }
            jSONObject.put("atl_dyt", this.f38332u);
            jSONObject.put("tmorl", this.f38333v);
            jSONObject.put("placementid", this.f38314b);
            jSONObject.put("ltafemty", this.f38334w);
            jSONObject.put("ltorwc", this.f38335x);
            jSONObject.put(RewardPlus.AMOUNT_MAX, this.H);
            jSONObject.put(RewardPlus.CALLBACK_RULE, this.I);
            jSONObject.put(RewardPlus.VIRTUAL_CURRENCY, this.J);
            jSONObject.put("amount", this.K);
            jSONObject.put("icon", this.L);
            jSONObject.put(RewardPlus.CURRENCY_ID, this.M);
            jSONObject.put("name", this.N);
            jSONObject.put("isDefault", this.Q);
            jSONObject.put("video_error_rule", this.R);
            jSONObject.put("loadtmo", this.S);
            jSONObject.put("vtag", this.T);
            return jSONObject;
        } catch (Exception e10) {
            e10.printStackTrace();
            return jSONObject;
        }
    }

    public String a() {
        return this.O;
    }

    public int d() {
        return this.K;
    }

    public int f() {
        return this.f38332u;
    }

    public void g(int i10) {
        this.I = i10;
    }

    public void h(int i10) {
        this.f38320h = i10;
    }

    public int i() {
        return this.E;
    }

    public void j(String str) {
        this.T = str;
    }

    public void k(int i10) {
        this.E = i10;
    }

    public int l() {
        return this.f38324m;
    }

    public int m() {
        return this.G;
    }

    public int n() {
        return this.f38337z;
    }

    public int o() {
        return this.S;
    }

    public void p(int i10) {
        this.f38337z = i10;
    }

    public void q(int i10) {
        this.Q = i10;
    }

    public void r(int i10) {
        this.S = i10;
    }

    public String s() {
        return this.N;
    }

    public String t() {
        return this.f38314b;
    }

    public void u(int i10) {
        this.l = i10;
    }

    public int v() {
        return this.F;
    }

    public int w() {
        return this.f38327p;
    }

    public void x(int i10) {
        this.F = i10;
    }

    public void y(int i10) {
        this.f38327p = i10;
    }

    public Queue<Integer> z() {
        LinkedList linkedList = null;
        try {
            List<com.mbridge.msdk.videocommon.entity.b> list = this.f38315c;
            if (list == null || list.size() <= 0) {
                return null;
            }
            LinkedList linkedList2 = new LinkedList();
            for (int i10 = 0; i10 < this.f38315c.size(); i10++) {
                try {
                    linkedList2.add(Integer.valueOf(this.f38315c.get(i10).b()));
                } catch (Exception e10) {
                    e = e10;
                    linkedList = linkedList2;
                }
            }
            return linkedList2;
        } catch (Exception e11) {
            e = e11;
        }
        e.printStackTrace();
        return linkedList;
    }

    public void a(long j10) {
        this.f38316d = j10;
    }

    public int b() {
        return this.f38322j;
    }

    public String c() {
        return X;
    }

    public void d(String str) {
        this.L = str;
    }

    public void f(int i10) {
        this.f38332u = i10;
    }

    public int g() {
        return this.f38328q;
    }

    public void h(String str) {
        this.f38313a = str;
    }

    public void i(int i10) {
        this.f38328q = i10;
    }

    public long j() {
        return this.f38316d;
    }

    public void a(List<com.mbridge.msdk.videocommon.entity.b> list) {
        this.f38315c = list;
    }

    public void b(int i10) {
        this.f38322j = i10;
    }

    public void c(String str) {
        X = str;
    }

    public int e() {
        return this.f38321i;
    }

    public void a(double d10) {
        this.f38329r = d10;
    }

    public void b(JSONObject jSONObject) {
        this.V = jSONObject;
    }

    public void e(int i10) {
        this.f38321i = i10;
    }

    public boolean a(int i10) {
        ArrayList<Integer> arrayList = this.f38331t;
        if (arrayList == null || arrayList.size() <= 0) {
            return false;
        }
        return this.f38331t.contains(Integer.valueOf(i10));
    }

    public static c a(String str) {
        JSONObject jSONObjectOptJSONObject;
        if (W == null) {
            W = g.a(com.mbridge.msdk.foundation.controller.c.n().d());
        }
        c cVar = null;
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                String strOptString = jSONObject.optString("vtag", "");
                String strOptString2 = jSONObject.optString("rid", "");
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("unitSetting");
                if (jSONArrayOptJSONArray != null && (jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(0)) != null) {
                    String strOptString3 = jSONObjectOptJSONObject.optString("unitId");
                    if (!TextUtils.isEmpty(strOptString3)) {
                        c cVar2 = new c();
                        try {
                            cVar2.j(strOptString);
                            cVar2.g(strOptString2);
                            List<com.mbridge.msdk.videocommon.entity.b> listA = com.mbridge.msdk.videocommon.entity.b.a(jSONObjectOptJSONObject.optJSONArray("adSourceList"));
                            cVar2.h(strOptString3);
                            cVar2.a(listA);
                            cVar2.h(jSONObjectOptJSONObject.optInt("callbackType"));
                            int iOptInt = jSONObjectOptJSONObject.optInt("aqn", 1);
                            if (iOptInt <= 0) {
                                iOptInt = 1;
                            }
                            cVar2.e(iOptInt);
                            int iOptInt2 = jSONObjectOptJSONObject.optInt("acn", 1);
                            if (iOptInt2 < 0) {
                                iOptInt2 = 1;
                            }
                            cVar2.b(iOptInt2);
                            cVar2.E(jSONObjectOptJSONObject.optInt("vcn", 5));
                            cVar2.u(jSONObjectOptJSONObject.optInt("offset", 5));
                            cVar2.n(jSONObjectOptJSONObject.optInt("dlnet", 1));
                            cVar2.o(jSONObjectOptJSONObject.optInt("endscreen_type", 2));
                            cVar2.D(jSONObjectOptJSONObject.optInt("tv_start", 3));
                            cVar2.C(jSONObjectOptJSONObject.optInt("tv_end", 80));
                            cVar2.y(jSONObjectOptJSONObject.optInt(CampaignEx.JSON_KEY_READY_RATE, 100));
                            cVar2.i(jSONObjectOptJSONObject.optInt("cd_rate", 0));
                            cVar2.a(jSONObject.optLong("current_time"));
                            cVar2.A(jSONObjectOptJSONObject.optInt("orientation", 0));
                            cVar2.m(jSONObjectOptJSONObject.optInt("daily_play_cap", 0));
                            cVar2.I(jSONObjectOptJSONObject.optInt("video_skip_time", -1));
                            cVar2.H(jSONObjectOptJSONObject.optInt("video_skip_result", 2));
                            cVar2.G(jSONObjectOptJSONObject.optInt("video_interactive_type", -1));
                            cVar2.k(jSONObjectOptJSONObject.optInt("close_button_delay", 1));
                            cVar2.w(jSONObjectOptJSONObject.optInt("playclosebtn_tm", -1));
                            cVar2.v(jSONObjectOptJSONObject.optInt("play_ctdown", 0));
                            cVar2.j(jSONObjectOptJSONObject.optInt("close_alert", 0));
                            cVar2.x(jSONObjectOptJSONObject.optInt("rdrct", 20));
                            cVar2.p(jSONObjectOptJSONObject.optInt("load_global_timeout", 70));
                            cVar2.z(jSONObjectOptJSONObject.optInt("rfpv", -1));
                            cVar2.a(jSONObjectOptJSONObject.optDouble("vdcmp", 1.0d));
                            cVar2.c(jSONObjectOptJSONObject.optString("atzu"));
                            JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject.optJSONArray("atl_type");
                            ArrayList<Integer> arrayList = new ArrayList<>();
                            try {
                                if (jSONArrayOptJSONArray2 != null) {
                                    for (int i10 = 0; i10 < jSONArrayOptJSONArray2.length(); i10++) {
                                        arrayList.add(Integer.valueOf(jSONArrayOptJSONArray2.getInt(i10)));
                                    }
                                } else {
                                    arrayList.add(4);
                                    arrayList.add(6);
                                }
                                cVar2.a(arrayList);
                            } catch (Exception e10) {
                                e10.printStackTrace();
                            }
                            int iOptInt3 = jSONObjectOptJSONObject.optInt("atl_dyt", 0);
                            cVar2.f(iOptInt3 > 0 ? iOptInt3 : 3);
                            int iOptInt4 = jSONObjectOptJSONObject.optInt("tmorl", 1);
                            if (iOptInt4 > 2 || iOptInt4 <= 0) {
                                iOptInt4 = 1;
                            }
                            cVar2.B(iOptInt4);
                            cVar2.f(jSONObjectOptJSONObject.optString("placementid"));
                            cVar2.s(jSONObjectOptJSONObject.optInt("ltafemty", 10));
                            cVar2.t(jSONObjectOptJSONObject.optInt("ltorwc", 60));
                            cVar2.b(jSONObjectOptJSONObject.optString("ab_id"));
                            cVar2.d(jSONObjectOptJSONObject.optInt(RewardPlus.AMOUNT_MAX, 0));
                            cVar2.g(jSONObjectOptJSONObject.optInt(RewardPlus.CALLBACK_RULE, 1));
                            cVar2.i(jSONObjectOptJSONObject.optString(RewardPlus.VIRTUAL_CURRENCY, ""));
                            cVar2.c(jSONObjectOptJSONObject.optInt("amount", 1));
                            cVar2.d(jSONObjectOptJSONObject.optString("icon", ""));
                            cVar2.l(jSONObjectOptJSONObject.optInt(RewardPlus.CURRENCY_ID, 1));
                            cVar2.e(jSONObjectOptJSONObject.optString("name", "Virtual Item"));
                            cVar2.F(jSONObjectOptJSONObject.optInt("video_error_rule", 1));
                            cVar2.r(jSONObjectOptJSONObject.optInt("loadtmo", 60));
                            cVar2.a(jSONObjectOptJSONObject.optJSONArray("local_cache_info"));
                            try {
                                String strOptString4 = jSONObjectOptJSONObject.optString("retry_strategy");
                                if (!TextUtils.isEmpty(strOptString4)) {
                                    String strA = k0.a(strOptString4);
                                    if (!TextUtils.isEmpty(strA)) {
                                        cVar2.b(new JSONObject(strA));
                                    }
                                }
                            } catch (Exception unused) {
                            }
                            return cVar2;
                        } catch (Exception e11) {
                            e = e11;
                            cVar = cVar2;
                            e.printStackTrace();
                            return cVar;
                        }
                    }
                }
            } catch (Exception e12) {
                e = e12;
            }
        }
        return cVar;
    }

    public static c a(JSONObject jSONObject) {
        c cVar = null;
        if (jSONObject != null) {
            try {
                c cVar2 = new c();
                try {
                    cVar2.a(com.mbridge.msdk.videocommon.entity.b.a(jSONObject.optJSONArray("adSourceList")));
                    cVar2.h(jSONObject.optInt("callbackType"));
                    int iOptInt = jSONObject.optInt("aqn", 1);
                    if (iOptInt <= 0) {
                        iOptInt = 1;
                    }
                    cVar2.e(iOptInt);
                    int iOptInt2 = jSONObject.optInt("acn", 1);
                    if (iOptInt2 < 0) {
                        iOptInt2 = 1;
                    }
                    cVar2.b(iOptInt2);
                    cVar2.E(jSONObject.optInt("vcn", 5));
                    cVar2.u(jSONObject.optInt("offset", 5));
                    cVar2.n(jSONObject.optInt("dlnet", 1));
                    cVar2.o(jSONObject.optInt("endscreen_type", 2));
                    cVar2.D(jSONObject.optInt("tv_start", 3));
                    cVar2.C(jSONObject.optInt("tv_end", 80));
                    cVar2.y(jSONObject.optInt(CampaignEx.JSON_KEY_READY_RATE, 100));
                    cVar2.a(jSONObject.optLong("current_time"));
                    cVar2.A(jSONObject.optInt("orientation", 0));
                    cVar2.m(jSONObject.optInt("daily_play_cap", 0));
                    cVar2.I(jSONObject.optInt("video_skip_time", -1));
                    cVar2.H(jSONObject.optInt("video_skip_result", 2));
                    cVar2.G(jSONObject.optInt("video_interactive_type", -1));
                    cVar2.k(jSONObject.optInt("close_button_delay", 1));
                    cVar2.w(jSONObject.optInt("playclosebtn_tm", -1));
                    cVar2.v(jSONObject.optInt("play_ctdown", 0));
                    cVar2.j(jSONObject.optInt("close_alert", 0));
                    cVar2.x(jSONObject.optInt("rdrct", 20));
                    cVar2.z(jSONObject.optInt("rfpv", -1));
                    cVar2.a(jSONObject.optDouble("vdcmp", 1.0d));
                    cVar2.p(jSONObject.optInt("load_global_timeout", 70));
                    JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("atl_type");
                    ArrayList<Integer> arrayList = new ArrayList<>();
                    try {
                        if (jSONArrayOptJSONArray != null) {
                            for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                                arrayList.add(Integer.valueOf(jSONArrayOptJSONArray.getInt(i10)));
                            }
                        } else {
                            arrayList.add(4);
                            arrayList.add(6);
                        }
                        cVar2.a(arrayList);
                    } catch (Exception e10) {
                        e10.printStackTrace();
                    }
                    cVar2.f(jSONObject.optInt("atl_dyt", 3));
                    int iOptInt3 = jSONObject.optInt("tmorl", 1);
                    if (iOptInt3 > 2 || iOptInt3 <= 0) {
                        iOptInt3 = 1;
                    }
                    cVar2.B(iOptInt3);
                    cVar2.f(jSONObject.optString("placementid"));
                    cVar2.s(jSONObject.optInt("ltafemty", 10));
                    cVar2.t(jSONObject.optInt("ltorwc", 60));
                    cVar2.b(jSONObject.optString("ab_id"));
                    cVar2.g(jSONObject.optString("rid", ""));
                    cVar2.d(jSONObject.optInt(RewardPlus.AMOUNT_MAX, 0));
                    cVar2.g(jSONObject.optInt(RewardPlus.CALLBACK_RULE, 1));
                    cVar2.i(jSONObject.optString(RewardPlus.VIRTUAL_CURRENCY, ""));
                    cVar2.c(jSONObject.optInt("amount", 1));
                    cVar2.d(jSONObject.optString("icon", ""));
                    cVar2.l(jSONObject.optInt(RewardPlus.CURRENCY_ID, 1));
                    cVar2.e(jSONObject.optString("name", "Virtual Item"));
                    cVar2.F(jSONObject.optInt("video_error_rule", 1));
                    cVar2.r(jSONObject.optInt("loadtmo", 60));
                    cVar2.j(jSONObject.optString("vtag", ""));
                    cVar2.a(jSONObject.optJSONArray("local_cache_info"));
                    try {
                        String strOptString = jSONObject.optString("retry_strategy");
                        if (!TextUtils.isEmpty(strOptString)) {
                            String strA = k0.a(strOptString);
                            if (!TextUtils.isEmpty(strA)) {
                                cVar2.b(new JSONObject(strA));
                            }
                        }
                    } catch (Exception unused) {
                    }
                    return cVar2;
                } catch (Exception e11) {
                    e = e11;
                    cVar = cVar2;
                    e.printStackTrace();
                    return cVar;
                }
            } catch (Exception e12) {
                e = e12;
            }
        }
        return cVar;
    }

    public void a(JSONArray jSONArray) {
        this.U = jSONArray;
    }
}
