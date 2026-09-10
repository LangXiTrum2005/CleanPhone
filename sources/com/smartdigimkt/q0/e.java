package com.smartdigimkt.q0;

import android.text.TextUtils;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class e implements Serializable, Cloneable {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private boolean f37828A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private com.smartdigimkt.x.d f37829B;
    private List<com.smartdigimkt.x.d> C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f37830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map<String, Map<String, String>> f37831b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map<String, Map<String, String>> f37832c;
    private Map<String, Long> d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.smartdigimkt.y.c f37833e;
    private String f;
    private List<com.smartdigimkt.x.d> g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f37834h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f37835i;
    private int j;
    private String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f37836l;
    private String m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f37837n;
    private String o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f37838p;
    private String q;
    private String r;
    private String s;
    private String t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private String f37839u;
    private int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f37840w;
    private boolean x;
    private boolean y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f37841z;

    public e() {
        this.f37830a = false;
        this.f37831b = new HashMap();
        this.f37832c = new HashMap();
        this.d = new HashMap();
        this.f = "";
        this.v = -1;
        this.x = false;
        this.f37841z = false;
    }

    private void a(f fVar) {
    }

    public void A() {
        Map<String, Map<String, String>> map = this.f37831b;
        if (map != null) {
            map.clear();
        }
        Map<String, Map<String, String>> map2 = this.f37832c;
        if (map2 != null) {
            map2.clear();
        }
        List<com.smartdigimkt.x.d> list = this.C;
        if (list != null) {
            list.clear();
        }
        this.f = "";
    }

    public void b(int i2) {
        this.v = i2;
    }

    public String c() {
        return this.t;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String d() {
        return this.k;
    }

    public List<com.smartdigimkt.x.d> e() {
        return this.g;
    }

    public void f(String str) {
        this.t = str;
    }

    public List<com.smartdigimkt.x.d> g() {
        return this.C;
    }

    public int h() {
        return this.v;
    }

    public void i(String str) {
        this.f = str;
    }

    public void j(String str) {
        this.f37839u = str;
    }

    public String k() {
        return this.f;
    }

    public void l(String str) {
        this.q = str;
    }

    public void m(String str) {
        this.f37837n = str;
    }

    public void n(String str) {
        this.f37835i = str;
    }

    public String o() {
        return this.f37839u;
    }

    public String p() {
        return this.f37836l;
    }

    public String q() {
        return this.q;
    }

    public String r() {
        return this.f37837n;
    }

    public long s() {
        return this.f37834h;
    }

    public String t() {
        Map<String, String> map;
        if (!TextUtils.isEmpty(this.f37835i)) {
            return this.f37835i;
        }
        try {
            if (TextUtils.isEmpty(this.f37835i)) {
                String str = this.f + this.f37839u;
                Map<String, Map<String, String>> map2 = this.f37831b;
                if (map2 != null && map2.containsKey(str) && (map = this.f37831b.get(str)) != null && map.containsKey("unit_id")) {
                    this.f37835i = map.get("unit_id");
                }
            }
        } catch (Exception e2) {
            if (com.smartdigimkt.b.b.f33800a) {
                e2.printStackTrace();
            }
        }
        return this.f37835i;
    }

    public String u() {
        return this.o;
    }

    public boolean v() {
        return this.x;
    }

    public boolean w() {
        return this.f37841z;
    }

    public boolean x() {
        return this.y;
    }

    public boolean y() {
        return this.f37828A;
    }

    public boolean z() {
        return this.f37830a;
    }

    public void a(boolean z2) {
        this.x = z2;
    }

    public void b(List<com.smartdigimkt.x.d> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        this.C = list;
    }

    public void c(int i2) {
        this.f37840w = i2;
    }

    public void d(String str) {
        if (this.d == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.d.put(str, Long.valueOf(System.currentTimeMillis()));
    }

    public void e(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            String str2 = this.f + str;
            Map<String, Map<String, String>> map = this.f37831b;
            if (map == null || !map.containsKey(str2)) {
                return;
            }
            this.f37831b.remove(str2);
        } catch (Exception e2) {
            if (com.smartdigimkt.b.b.f33800a) {
                e2.printStackTrace();
            }
        }
    }

    public com.smartdigimkt.x.d f() {
        return this.f37829B;
    }

    public void g(String str) {
        this.k = str;
    }

    public void h(String str) {
        this.r = str;
    }

    public int i() {
        return this.f37840w;
    }

    public String j() {
        return this.r;
    }

    public void k(String str) {
        this.f37836l = str;
    }

    public com.smartdigimkt.y.c l() {
        return this.f37833e;
    }

    public Map<String, Map<String, String>> m() {
        return this.f37832c;
    }

    public Map<String, Map<String, String>> n() {
        return this.f37831b;
    }

    public void o(String str) {
        this.o = str;
    }

    public void a(List<com.smartdigimkt.x.d> list) {
        this.g = list;
    }

    public Map<String, String> c(String str) {
        com.smartdigimkt.y.c cVarL;
        com.smartdigimkt.y.c cVarL2;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        f fVar = new f();
        try {
            this.f37839u = str;
            fVar.a("ts", Long.valueOf(System.currentTimeMillis()));
            if (!TextUtils.isEmpty(t())) {
                fVar.a("unit_id", t());
            }
            if (this.j != 0) {
                fVar.a(b.f37780e, Integer.valueOf(b()));
            }
            if (!TextUtils.isEmpty(j())) {
                fVar.a("hb", j());
            }
            if (!TextUtils.isEmpty(d())) {
                fVar.a(b.q, d());
            }
            if (!TextUtils.isEmpty(str)) {
                fVar.a("key", str);
            }
            if (Arrays.asList(d.f37823l).contains(str)) {
                fVar.a(b.R0, v() ? "1" : "2");
            }
            if (c.D.contains(str) && (cVarL2 = l()) != null) {
                fVar.a("type", Integer.valueOf(cVarL2.e()));
                fVar.a("reason", cVarL2.j());
                if (!TextUtils.isEmpty(cVarL2.l())) {
                    fVar.a(b.m0, cVarL2.l());
                    fVar.a(b.l0, Integer.valueOf(cVarL2.p()));
                }
            }
            if (c.f37791E.contains(str) && (cVarL = l()) != null && !TextUtils.isEmpty(cVarL.l())) {
                fVar.a("type", Integer.valueOf(cVarL.p()));
                fVar.a("reason", cVarL.l());
            }
            a(fVar);
        } catch (Exception e2) {
            if (com.smartdigimkt.b.b.f33800a) {
                e2.printStackTrace();
            }
        }
        return fVar.a();
    }

    public void a(com.smartdigimkt.x.d dVar) {
        this.f37829B = dVar;
    }

    public int b() {
        return this.j;
    }

    public void d(boolean z2) {
        this.f37828A = z2;
    }

    public void a(long j) {
        this.f37834h = j;
    }

    public long b(String str) {
        Map<String, Long> map;
        try {
            if (!TextUtils.isEmpty(str) && (map = this.d) != null && map.containsKey(str)) {
                Long l2 = this.d.get(str);
                return System.currentTimeMillis() - (l2 != null ? l2.longValue() : 0L);
            }
        } catch (Exception e2) {
            if (com.smartdigimkt.b.b.f33800a) {
                e2.printStackTrace();
            }
        }
        return 0L;
    }

    public void a(int i2) {
        this.j = i2;
    }

    public void a(String str, f fVar) {
        Map<String, String> map;
        if (TextUtils.isEmpty(str) || fVar == null) {
            return;
        }
        try {
            String str2 = this.f + str;
            Map<String, Map<String, String>> map2 = this.f37831b;
            if (map2 != null) {
                if (map2.containsKey(str2) && (map = this.f37831b.get(str2)) != null) {
                    map.putAll(fVar.a());
                } else {
                    this.f37831b.put(str2, fVar.a());
                }
            }
        } catch (Exception e2) {
            if (com.smartdigimkt.b.b.f33800a) {
                e2.printStackTrace();
            }
        }
    }

    public e(boolean z2) {
        this.f37830a = false;
        this.f37831b = new HashMap();
        this.f37832c = new HashMap();
        this.d = new HashMap();
        this.f = "";
        this.v = -1;
        this.x = false;
        this.f37841z = false;
        this.f37830a = z2;
    }

    public void b(boolean z2) {
        this.f37841z = z2;
    }

    public void a(String str, f fVar, int i2) {
        Map<String, String> map;
        if (TextUtils.isEmpty(str) || fVar == null) {
            return;
        }
        try {
            String str2 = this.f + "_" + i2 + "_" + str;
            Map<String, Map<String, String>> map2 = this.f37832c;
            if (map2 != null) {
                if (map2.containsKey(str2) && (map = this.f37832c.get(str2)) != null) {
                    map.putAll(fVar.a());
                } else {
                    this.f37832c.put(str2, fVar.a());
                }
            }
        } catch (Exception e2) {
            if (com.smartdigimkt.b.b.f33800a) {
                e2.printStackTrace();
            }
        }
    }

    public void a(com.smartdigimkt.y.c cVar) {
        this.f37833e = cVar;
    }

    public void c(boolean z2) {
        this.y = z2;
    }
}
