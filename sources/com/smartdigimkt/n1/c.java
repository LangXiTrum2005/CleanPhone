package com.smartdigimkt.n1;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class c {

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public static final int f36954N = 1;
    public static final int O = 2;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public static final int f36955P = 3;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public static final int f36956Q = 3;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private int f36958B;
    private int C;
    private int D;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private int f36962J;
    private int L;
    private int M;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f36963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f36964b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f36965c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f36966e;
    private String f;
    private List<Integer> g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f36967h;
    private int j;
    private List<Integer> k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f36969l;
    private int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f36970n;
    private int o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f36971p;
    private int q;
    private int t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f36972u;
    private long v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private String f36973w;
    private int x;
    private long y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private long f36974z;
    private int d = 30;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f36968i = 1;
    private int r = 1;
    private int s = 5000;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private int f36957A = 60;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private String f36959E = "";

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private int f36960F = 10;
    private int G = 60;
    private double H = 1.0d;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private int f36961I = 1;
    private int K = 0;

    public static c p() {
        return new c();
    }

    public void A(int i2) {
        this.o = i2;
    }

    public String B() {
        return this.f36959E;
    }

    public int C() {
        return this.f36964b;
    }

    public int D() {
        return this.f36963a;
    }

    public int E() {
        return this.f36962J;
    }

    public int F() {
        return this.f36957A;
    }

    public int G() {
        return this.s;
    }

    public int H() {
        return this.f36969l;
    }

    public int I() {
        return this.f36961I;
    }

    public int J() {
        return this.j;
    }

    public String K() {
        return this.f36966e;
    }

    public int L() {
        return this.o;
    }

    public int M() {
        return this.t;
    }

    public JSONObject N() {
        JSONObject jSONObject = new JSONObject();
        try {
            List<Integer> list = this.g;
            if (list != null && list.size() > 0) {
                int size = this.g.size();
                JSONArray jSONArray = new JSONArray();
                for (int i2 = 0; i2 < size; i2++) {
                    jSONArray.put(this.g.get(i2));
                }
                jSONObject.put("adSourceList", jSONArray);
            }
            List<Integer> list2 = this.k;
            if (list2 != null && list2.size() > 0) {
                int size2 = this.k.size();
                JSONArray jSONArray2 = new JSONArray();
                for (int i3 = 0; i3 < size2; i3++) {
                    jSONArray2.put(this.k.get(i3));
                }
                jSONObject.put("ad_source_timeout", jSONArray2);
            }
            jSONObject.put(com.smartdigimkt.o1.b.f37305J, this.f36969l);
            jSONObject.put("aqn", this.m);
            jSONObject.put("acn", this.f36970n);
            jSONObject.put(com.smartdigimkt.o1.b.f37309R, this.o);
            jSONObject.put("current_time", this.f36967h);
            jSONObject.put("offset", this.f36968i);
            jSONObject.put("dlct", this.v);
            jSONObject.put(com.smartdigimkt.o1.b.X0, this.t);
            jSONObject.put("dlnet", this.f36972u);
            jSONObject.put(com.smartdigimkt.o1.b.L0, this.f36973w);
            jSONObject.put(com.smartdigimkt.o1.b.M0, this.x);
            jSONObject.put(com.smartdigimkt.o1.b.N0, this.y);
            jSONObject.put(com.smartdigimkt.o1.b.O0, this.f36974z);
            jSONObject.put("ready_rate", this.f36962J);
            jSONObject.put("content", this.L);
            jSONObject.put(com.smartdigimkt.o1.b.D1, this.M);
            jSONObject.put(com.smartdigimkt.o1.b.g2, this.q);
            jSONObject.put(com.smartdigimkt.o1.b.e2, this.f36971p);
            jSONObject.put("playclosebtn_tm", this.f36963a);
            jSONObject.put("play_ctdown", this.f36964b);
            jSONObject.put("close_alert", this.f36965c);
            jSONObject.put(com.smartdigimkt.o1.b.e3, this.f36958B);
            jSONObject.put(com.smartdigimkt.o1.b.c3, this.f36957A);
            jSONObject.put(com.smartdigimkt.o1.b.l3, this.D);
            jSONObject.put(com.smartdigimkt.o1.b.n3, this.C);
            jSONObject.put("tmorl", this.f36961I);
            jSONObject.put("unitId", this.f36966e);
            jSONObject.put("placementid", this.f36959E);
            jSONObject.put("ltafemty", this.f36960F);
            jSONObject.put("ltorwc", this.G);
            return jSONObject;
        } catch (Exception e2) {
            e2.printStackTrace();
            return jSONObject;
        }
    }

    public void a(double d) {
        this.H = d;
    }

    public void b(long j) {
        this.y = j;
    }

    public int c() {
        return this.C;
    }

    public void d(int i2) {
        this.t = i2;
    }

    public void e(int i2) {
        this.f36958B = i2;
    }

    public int f() {
        return this.f36958B;
    }

    public void g(int i2) {
        try {
            this.K = i2;
        } catch (Exception unused) {
            this.K = 0;
        }
    }

    public double h() {
        return this.H;
    }

    public int i() {
        return this.K;
    }

    public void j(int i2) {
        this.D = i2;
    }

    public long k() {
        return this.y;
    }

    public void l(int i2) {
        this.q = i2;
    }

    public void m(int i2) {
        this.M = i2;
    }

    public int n() {
        return this.D;
    }

    public void o(int i2) {
        this.r = i2;
    }

    public long q() {
        return this.v;
    }

    public int r() {
        return this.f36972u;
    }

    public int s() {
        return this.q;
    }

    public int t() {
        return this.M;
    }

    public String toString() {
        List<Integer> list = this.g;
        String str = "";
        if (list != null && list.size() > 0) {
            Iterator<Integer> it = this.g.iterator();
            while (it.hasNext()) {
                str = str + it.next() + ",";
            }
        }
        StringBuilder sb = new StringBuilder("offset = ");
        sb.append(A());
        sb.append(" unitId = ");
        sb.append(this.f36966e);
        sb.append(" fbPlacementId = ");
        return android.support.v4.media.a.r(sb, this.f, str);
    }

    public void u(int i2) {
        try {
            this.f36962J = i2;
        } catch (Exception unused) {
            this.f36962J = 100;
        }
    }

    public void v(int i2) {
        this.f36957A = i2;
    }

    public void w(int i2) {
        this.s = i2;
    }

    public void x(int i2) {
        this.f36969l = i2;
    }

    public void y(int i2) {
        this.f36961I = i2;
    }

    public String z() {
        return this.f36973w;
    }

    public int A() {
        return this.f36968i;
    }

    public void a(int i2) {
        this.C = i2;
    }

    public void b(int i2) {
        this.f36970n = i2;
    }

    public void c(int i2) {
        this.m = i2;
    }

    public void d(long j) {
        this.v = j;
    }

    public void e(String str) {
        this.f36971p = str;
    }

    public void f(String str) {
        this.f36973w = str;
    }

    public void h(int i2) {
        this.f36965c = i2;
    }

    public void i(int i2) {
        this.L = i2;
    }

    public long j() {
        return this.f36974z;
    }

    public void k(int i2) {
        this.f36972u = i2;
    }

    public int l() {
        return this.f36965c;
    }

    public int m() {
        return this.L;
    }

    public void n(int i2) {
        this.d = i2;
    }

    public long o() {
        return this.f36967h;
    }

    public void p(int i2) {
        this.f36960F = i2;
    }

    public void q(int i2) {
        this.G = i2;
    }

    public void r(int i2) {
        this.f36968i = i2;
    }

    public void s(int i2) {
        this.f36964b = i2;
    }

    public void t(int i2) {
        this.f36963a = i2;
    }

    public int v() {
        return this.r;
    }

    public int w() {
        return this.f36960F;
    }

    public int x() {
        return this.G;
    }

    public String y() {
        return this.f36971p;
    }

    public void z(int i2) {
        this.j = i2;
    }

    public void a(long j) {
        this.f36974z = j;
    }

    public List<Integer> b() {
        return this.k;
    }

    public void c(List<Integer> list) {
        this.g = list;
    }

    public int d() {
        return this.f36970n;
    }

    public int e() {
        return this.m;
    }

    public void f(int i2) {
        this.x = i2;
    }

    public int g() {
        return this.x;
    }

    public void h(String str) {
        this.f36966e = str;
    }

    public int u() {
        int i2 = this.d;
        if (i2 <= 0 || i2 > 100) {
            this.d = 30;
        }
        return this.d;
    }

    public static c b(String str) {
        c cVar = new c();
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.add(1);
            cVar.c(arrayList);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(30);
            cVar.d(arrayList2);
            cVar.h(str);
            cVar.r(1);
            cVar.x(1);
            cVar.b(-2);
            cVar.c(-2);
            cVar.A(5);
            cVar.d(com.smartdigimkt.o1.b.f37307P);
            cVar.k(2);
            cVar.d(3);
            return cVar;
        } catch (Exception e2) {
            e2.printStackTrace();
            return cVar;
        }
    }

    public List<Integer> a() {
        return this.g;
    }

    public void c(long j) {
        this.f36967h = j;
    }

    public void d(List<Integer> list) {
        this.k = list;
    }

    public void g(String str) {
        this.f36959E = str;
    }

    public static c a(String str) {
        c cVar = new c();
        ArrayList arrayList = new ArrayList();
        arrayList.add(1);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(8);
        arrayList2.add(8);
        cVar.r(1);
        cVar.h(str);
        cVar.c(arrayList);
        cVar.d(arrayList2);
        cVar.x(1);
        cVar.b(-2);
        cVar.c(-2);
        cVar.A(5);
        cVar.d(com.smartdigimkt.o1.b.f37307P);
        cVar.k(2);
        cVar.d(1);
        cVar.u(100);
        cVar.g(0);
        cVar.i(1);
        cVar.m(0);
        cVar.v(60);
        cVar.p(10);
        cVar.q(60);
        return cVar;
    }

    public static c c(String str) {
        c cVarP = p();
        cVarP.d(0);
        return cVarP;
    }

    public static c d(String str) {
        c cVar = null;
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            c cVar2 = new c();
            try {
                JSONObject jSONObject = new JSONObject(str);
                cVar2.h(jSONObject.optString("unitId"));
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("adSourceList");
                if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                    ArrayList arrayList = new ArrayList();
                    for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                        arrayList.add(Integer.valueOf(jSONArrayOptJSONArray.optInt(i2)));
                    }
                    cVar2.c(arrayList);
                }
                JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("ad_source_timeout");
                if (jSONArrayOptJSONArray2 != null && jSONArrayOptJSONArray2.length() > 0) {
                    ArrayList arrayList2 = new ArrayList();
                    for (int i3 = 0; i3 < jSONArrayOptJSONArray2.length(); i3++) {
                        arrayList2.add(Integer.valueOf(jSONArrayOptJSONArray2.optInt(i3)));
                    }
                    cVar2.d(arrayList2);
                }
                cVar2.x(jSONObject.optInt(com.smartdigimkt.o1.b.f37305J));
                cVar2.c(jSONObject.optInt("aqn"));
                cVar2.b(jSONObject.optInt("acn"));
                cVar2.A(jSONObject.optInt(com.smartdigimkt.o1.b.f37309R));
                int i4 = 1;
                cVar2.o(jSONObject.optInt(com.smartdigimkt.o1.b.S, 1));
                cVar2.w(jSONObject.optInt(com.smartdigimkt.o1.b.T, 5000));
                cVar2.c(jSONObject.optLong("current_time"));
                cVar2.r(jSONObject.optInt("offset"));
                cVar2.d(jSONObject.optLong("dlct", com.smartdigimkt.o1.b.f37307P));
                cVar2.d(jSONObject.optInt(com.smartdigimkt.o1.b.X0, 0));
                cVar2.k(jSONObject.optInt("dlnet", 2));
                cVar2.f(jSONObject.optString(com.smartdigimkt.o1.b.L0));
                cVar2.f(jSONObject.optInt(com.smartdigimkt.o1.b.M0));
                cVar2.b(jSONObject.optLong(com.smartdigimkt.o1.b.N0, 86400L));
                cVar2.a(jSONObject.optLong(com.smartdigimkt.o1.b.O0, 300L));
                cVar2.u(jSONObject.optInt("ready_rate", 100));
                cVar2.g(jSONObject.optInt("cd_rate", 0));
                cVar2.i(jSONObject.optInt("content", 1));
                cVar2.m(jSONObject.optInt(com.smartdigimkt.o1.b.D1, 0));
                cVar2.l(jSONObject.optInt(com.smartdigimkt.o1.b.g2, 1));
                cVar2.e(jSONObject.optString(com.smartdigimkt.o1.b.e2, ""));
                cVar2.t(jSONObject.optInt("playclosebtn_tm", -1));
                cVar2.s(jSONObject.optInt("play_ctdown", 0));
                cVar2.h(jSONObject.optInt("close_alert", 0));
                cVar2.n(jSONObject.optInt(com.smartdigimkt.o1.b.s2, 30));
                cVar2.v(jSONObject.optInt(com.smartdigimkt.o1.b.c3, 60));
                cVar2.e(jSONObject.optInt(com.smartdigimkt.o1.b.e3, 0));
                int iOptInt = jSONObject.optInt("tmorl", 1);
                if (iOptInt <= 2 && iOptInt > 0) {
                    i4 = iOptInt;
                }
                cVar2.y(i4);
                cVar2.g(jSONObject.optString("placementid", ""));
                cVar2.p(jSONObject.optInt("ltafemty", 10));
                cVar2.q(jSONObject.optInt("ltorwc", 60));
                return cVar2;
            } catch (Exception e2) {
                e = e2;
                cVar = cVar2;
            }
        } catch (Exception e3) {
            e = e3;
        }
        e.printStackTrace();
        return cVar;
    }

    public Queue<Integer> b(List<Integer> list) {
        LinkedList linkedList = new LinkedList();
        try {
            List<Integer> list2 = this.g;
            if (list2 != null && list2.size() > 0) {
                for (Integer num : list) {
                    if (num != null) {
                        linkedList.add(Integer.valueOf(num.intValue() * 1000));
                    }
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return linkedList;
    }

    public Queue<Integer> a(List<Integer> list) {
        LinkedList linkedList = new LinkedList();
        if (list != null) {
            try {
                if (list.size() > 0) {
                    for (Integer num : list) {
                        if (num != null) {
                            linkedList.add(num);
                        }
                    }
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return linkedList;
    }
}
