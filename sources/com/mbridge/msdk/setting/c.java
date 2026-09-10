package com.mbridge.msdk.setting;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class c {
    private String A;
    private int D;
    private int E;
    private int I;
    private String K;
    private int N;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<Integer> f35631b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<Integer> f35632c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f35633d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f35634e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f35635f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f35636g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f35637h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f35638i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f35640k;
    private long l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f35641m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f35642n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f35643o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private long f35644p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f35645q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f35646r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private String f35647s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f35648t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f35649u;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private String f35654z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f35630a = "";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f35639j = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f35650v = 30;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f35651w = 1;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f35652x = 10;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f35653y = 60;
    private int B = 1;
    private String C = "";
    private int F = 100;
    private int G = 60;
    private int H = 5000;
    private int J = 1;
    private String L = "";
    private String M = "";

    public static m a(JSONObject jSONObject) {
        m mVar = null;
        if (jSONObject != null) {
            try {
                m mVar2 = new m();
                try {
                    mVar2.e(jSONObject.optString("unitId"));
                    mVar2.a(jSONObject.optString("ab_id"));
                    mVar2.f(jSONObject.optString("rid"));
                    JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("adSourceList");
                    if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                        ArrayList arrayList = new ArrayList();
                        for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                            arrayList.add(Integer.valueOf(jSONArrayOptJSONArray.optInt(i10)));
                        }
                        mVar2.a(arrayList);
                    }
                    JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("ad_source_timeout");
                    if (jSONArrayOptJSONArray2 != null && jSONArrayOptJSONArray2.length() > 0) {
                        ArrayList arrayList2 = new ArrayList();
                        for (int i11 = 0; i11 < jSONArrayOptJSONArray2.length(); i11++) {
                            arrayList2.add(Integer.valueOf(jSONArrayOptJSONArray2.optInt(i11)));
                        }
                        mVar2.b(arrayList2);
                    }
                    mVar2.x(jSONObject.optInt("tpqn"));
                    mVar2.c(jSONObject.optInt("aqn"));
                    mVar2.b(jSONObject.optInt("acn"));
                    mVar2.z(jSONObject.optInt("wt"));
                    int i12 = 1;
                    mVar2.o(jSONObject.optInt("iscasf", 1));
                    mVar2.w(jSONObject.optInt("spmxrt", 5000));
                    mVar2.c(jSONObject.optLong("current_time"));
                    mVar2.r(jSONObject.optInt("offset"));
                    mVar2.d(jSONObject.optLong("dlct", 3600L));
                    mVar2.d(jSONObject.optInt("autoplay", 0));
                    mVar2.k(jSONObject.optInt("dlnet", 2));
                    mVar2.c(jSONObject.optString("no_offer"));
                    mVar2.f(jSONObject.optInt("cb_type"));
                    mVar2.b(jSONObject.optLong("clct", 86400L));
                    mVar2.a(jSONObject.optLong("clcq", 300L));
                    mVar2.u(jSONObject.optInt(CampaignEx.JSON_KEY_READY_RATE, 100));
                    mVar2.g(jSONObject.optInt("cd_rate", 0));
                    mVar2.i(jSONObject.optInt("content", 1));
                    mVar2.m(jSONObject.optInt("impt", 0));
                    mVar2.l(jSONObject.optInt("icon_type", 1));
                    mVar2.b(jSONObject.optString("no_ads_url", ""));
                    mVar2.t(jSONObject.optInt("playclosebtn_tm", -1));
                    mVar2.s(jSONObject.optInt("play_ctdown", 0));
                    mVar2.h(jSONObject.optInt("close_alert", 0));
                    mVar2.n(jSONObject.optInt("intershowlimit", 30));
                    mVar2.v(jSONObject.optInt("refreshFq", 60));
                    mVar2.e(jSONObject.optInt("closeBtn", 0));
                    int iOptInt = jSONObject.optInt("tmorl", 1);
                    if (iOptInt <= 2 && iOptInt > 0) {
                        i12 = iOptInt;
                    }
                    mVar2.y(i12);
                    mVar2.d(jSONObject.optString("placementid", ""));
                    mVar2.p(jSONObject.optInt("ltafemty", 10));
                    mVar2.q(jSONObject.optInt("ltorwc", 60));
                    mVar2.g(jSONObject.optString("vtag", ""));
                    return mVar2;
                } catch (Exception e10) {
                    e = e10;
                    mVar = mVar2;
                    e.printStackTrace();
                    return mVar;
                }
            } catch (Exception e11) {
                e = e11;
            }
        }
        return mVar;
    }

    public int A() {
        return this.D;
    }

    public int B() {
        return this.E;
    }

    public int C() {
        return this.F;
    }

    public int D() {
        return this.G;
    }

    public int E() {
        return this.H;
    }

    public int F() {
        return this.I;
    }

    public int G() {
        return this.J;
    }

    public String H() {
        return this.K;
    }

    public String I() {
        return this.L;
    }

    public String J() {
        return this.M;
    }

    public int K() {
        return this.N;
    }

    public int L() {
        return this.f35636g;
    }

    public JSONObject M() {
        JSONObject jSONObject = new JSONObject();
        try {
            List<Integer> listB = b();
            if (listB != null && listB.size() > 0) {
                int size = listB.size();
                JSONArray jSONArray = new JSONArray();
                for (int i10 = 0; i10 < size; i10++) {
                    jSONArray.put(listB.get(i10));
                }
                jSONObject.put("adSourceList", jSONArray);
            }
            List<Integer> listC = c();
            if (listC != null && listC.size() > 0) {
                int size2 = listC.size();
                JSONArray jSONArray2 = new JSONArray();
                for (int i11 = 0; i11 < size2; i11++) {
                    jSONArray2.put(listC.get(i11));
                }
                jSONObject.put("ad_source_timeout", jSONArray2);
            }
            jSONObject.put("tpqn", F());
            jSONObject.put("aqn", f());
            jSONObject.put("acn", e());
            jSONObject.put("wt", K());
            jSONObject.put("current_time", o());
            jSONObject.put("offset", y());
            jSONObject.put("dlct", p());
            jSONObject.put("autoplay", L());
            jSONObject.put("dlnet", q());
            jSONObject.put("no_offer", x());
            jSONObject.put("cb_type", h());
            jSONObject.put("clct", k());
            jSONObject.put("clcq", j());
            jSONObject.put(CampaignEx.JSON_KEY_READY_RATE, C());
            jSONObject.put("content", m());
            jSONObject.put("impt", s());
            jSONObject.put("icon_type", r());
            jSONObject.put("no_ads_url", w());
            jSONObject.put("playclosebtn_tm", B());
            jSONObject.put("play_ctdown", A());
            jSONObject.put("close_alert", l());
            jSONObject.put("closeBtn", g());
            jSONObject.put("refreshFq", D());
            jSONObject.put("countdown", n());
            jSONObject.put("allowSkip", d());
            jSONObject.put("tmorl", G());
            jSONObject.put("unitId", H());
            jSONObject.put("placementid", z());
            jSONObject.put("ltafemty", u());
            jSONObject.put("ltorwc", v());
            jSONObject.put("vtag", J());
            return jSONObject;
        } catch (Exception e10) {
            e10.printStackTrace();
            return jSONObject;
        }
    }

    public List<Integer> b() {
        return this.f35631b;
    }

    public void c(String str) {
        this.A = str;
    }

    public void d(int i10) {
        this.f35636g = i10;
    }

    public int e() {
        return this.f35634e;
    }

    public int f() {
        return this.f35635f;
    }

    public int g() {
        return this.f35637h;
    }

    public int h() {
        return this.f35638i;
    }

    public int i() {
        return this.f35639j;
    }

    public long j() {
        return this.f35640k;
    }

    public long k() {
        return this.l;
    }

    public int l() {
        return this.f35641m;
    }

    public int m() {
        return this.f35642n;
    }

    public int n() {
        return this.f35643o;
    }

    public long o() {
        return this.f35644p;
    }

    public long p() {
        return this.f35645q;
    }

    public int q() {
        return this.f35646r;
    }

    public int r() {
        return this.f35648t;
    }

    public int s() {
        return this.f35649u;
    }

    public int t() {
        return this.f35651w;
    }

    public String toString() {
        List<Integer> list = this.f35631b;
        String str = "";
        if (list != null && list.size() > 0) {
            Iterator<Integer> it = this.f35631b.iterator();
            while (it.hasNext()) {
                str = str + it.next() + ",";
            }
        }
        StringBuilder sb2 = new StringBuilder("offset = ");
        sb2.append(y());
        sb2.append(" unitId = ");
        sb2.append(this.K);
        sb2.append(" fbPlacementId = ");
        return defpackage.e.q(this.f35647s, str, sb2);
    }

    public int u() {
        return this.f35652x;
    }

    public int v() {
        return this.f35653y;
    }

    public String w() {
        return this.f35654z;
    }

    public String x() {
        return this.A;
    }

    public void y(int i10) {
        this.J = i10;
    }

    public String z() {
        return this.C;
    }

    public void b(List<Integer> list) {
        this.f35632c = list;
    }

    public List<Integer> c() {
        return this.f35632c;
    }

    public int d() {
        return this.f35633d;
    }

    public void e(int i10) {
        this.f35637h = i10;
    }

    public void f(int i10) {
        this.f35638i = i10;
    }

    public void g(int i10) {
        this.f35639j = i10;
    }

    public void h(int i10) {
        this.f35641m = i10;
    }

    public void i(int i10) {
        this.f35642n = i10;
    }

    public void j(int i10) {
        this.f35643o = i10;
    }

    public void k(int i10) {
        this.f35646r = i10;
    }

    public void l(int i10) {
        this.f35648t = i10;
    }

    public void m(int i10) {
        this.f35649u = i10;
    }

    public void n(int i10) {
        this.f35650v = i10;
    }

    public void o(int i10) {
        this.f35651w = i10;
    }

    public void p(int i10) {
        this.f35652x = i10;
    }

    public void q(int i10) {
        this.f35653y = i10;
    }

    public void r(int i10) {
        this.B = i10;
    }

    public void s(int i10) {
        this.D = i10;
    }

    public void t(int i10) {
        this.E = i10;
    }

    public void u(int i10) {
        this.F = i10;
    }

    public void v(int i10) {
        this.G = i10;
    }

    public void w(int i10) {
        this.H = i10;
    }

    public void x(int i10) {
        this.I = i10;
    }

    public int y() {
        return this.B;
    }

    public void z(int i10) {
        this.N = i10;
    }

    public void b(int i10) {
        this.f35634e = i10;
    }

    public void c(int i10) {
        this.f35635f = i10;
    }

    public void d(long j10) {
        this.f35645q = j10;
    }

    public void e(String str) {
        this.K = str;
    }

    public void f(String str) {
        this.L = str;
    }

    public void g(String str) {
        this.M = str;
    }

    public void b(long j10) {
        this.l = j10;
    }

    public void c(long j10) {
        this.f35644p = j10;
    }

    public void d(String str) {
        this.C = str;
    }

    public void b(String str) {
        this.f35654z = str;
    }

    public String a() {
        return this.f35630a;
    }

    public void a(String str) {
        this.f35630a = str;
        com.mbridge.msdk.foundation.controller.a.f33385r.put(this.K, str);
    }

    public void a(List<Integer> list) {
        this.f35631b = list;
    }

    public void a(int i10) {
        this.f35633d = i10;
    }

    public void a(long j10) {
        this.f35640k = j10;
    }
}
