package com.smartdigimkt.u2;

import android.content.Context;
import android.text.TextUtils;
import com.smartdigimkt.v0.y;
import com.smartdigimkt.x.t;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class k extends f {
    public static final int j0 = 1;
    public static final int k0 = 2;
    private static final String l0 = "camp_position";
    protected boolean W;
    protected com.smartdigimkt.x.d X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    protected List<com.smartdigimkt.x.d> f38795Y;
    protected boolean Z;
    protected com.smartdigimkt.c3.c a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    protected com.smartdigimkt.d3.c f38796b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    protected String f38797c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    protected String f38798d0;
    protected com.smartdigimkt.t2.a e0;
    protected int f0;
    private boolean g0 = false;
    private boolean h0 = false;
    private boolean i0 = false;

    public k(com.smartdigimkt.x.d dVar, com.smartdigimkt.c3.c cVar, com.smartdigimkt.d3.c cVar2, String str, String str2, com.smartdigimkt.t2.a aVar, int i2, boolean z2) {
        this.Z = false;
        this.e0 = new f();
        this.f0 = 1;
        if (!z2 && dVar != null && y.b(str2) && cVar != null && aVar != null) {
            this.X = dVar;
            this.f38798d0 = str;
            this.f38797c0 = str2;
            this.a0 = cVar;
            this.f38796b0 = cVar2;
            this.e0 = aVar;
            this.W = true;
            this.f0 = i2;
            this.Z = false;
            return;
        }
        if (!z2 || dVar == null || !y.b(str2) || aVar == null) {
            return;
        }
        this.X = dVar;
        this.f38798d0 = str;
        this.f38797c0 = str2;
        this.a0 = cVar;
        this.f38796b0 = cVar2;
        this.e0 = aVar;
        this.W = true;
        this.f0 = i2;
        this.Z = true;
    }

    private void d() {
        if (!this.W || com.smartdigimkt.c0.f.f34030l == null || TextUtils.isEmpty(this.X.j())) {
            return;
        }
        com.smartdigimkt.c0.f.a(this.f38797c0, this.X, "reward");
    }

    private void f() {
    }

    private void m() {
    }

    public void a(com.smartdigimkt.x.d dVar) {
        this.X = dVar;
    }

    public void b() {
    }

    public void c() {
    }

    public void e() {
    }

    public void g() {
        if (!this.W || this.X == null) {
            return;
        }
        new t(t.f39834b0, this.X.j(), this.X.N1(), this.X.O1(), this.f38797c0, com.smartdigimkt.v0.n.h(com.smartdigimkt.m6.b.p().k())).e(this.X.K2() ? t.B1 : t.C1);
    }

    public void h() {
        String str;
        try {
            if (!this.W || this.g0 || TextUtils.isEmpty(this.X.P0())) {
                return;
            }
            this.g0 = true;
            if (this.X.D2()) {
                f();
            }
            String strP0 = this.X.P0();
            if (this.X.a2() == 1) {
                str = strP0 + "&to=1&cbt=" + this.X.m0() + "&tmorl=" + this.f0;
            } else {
                str = strP0 + "&to=0&cbt=" + this.X.m0() + "&tmorl=" + this.f0;
            }
            com.smartdigimkt.o.a.a(com.smartdigimkt.m6.b.p().k(), this.X, this.f38797c0, str, false, true, com.smartdigimkt.q.a.f37742p);
            com.smartdigimkt.v2.a.g(com.smartdigimkt.m6.b.p().k(), this.X);
            m();
            d();
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public void i() {
        Map<String, Long> map;
        String str;
        try {
            com.smartdigimkt.x.d dVar = this.X;
            if (dVar != null && dVar.H2() && this.Z && !this.X.G2()) {
                this.h0 = true;
                return;
            }
            if (!this.W || TextUtils.isEmpty(this.X.y1()) || (map = com.smartdigimkt.c0.f.f34029i) == null || map.containsKey(this.X.y1()) || this.h0) {
                return;
            }
            com.smartdigimkt.c0.f.f34029i.put(this.X.y1(), Long.valueOf(System.currentTimeMillis()));
            String strY1 = this.X.y1();
            if (this.X.a2() == 1) {
                str = strY1 + "&to=1&cbt=" + this.X.m0() + "&tmorl=" + this.f0;
            } else {
                str = strY1 + "&to=0&cbt=" + this.X.m0() + "&tmorl=" + this.f0;
            }
            String str2 = str;
            if (!this.Z) {
                com.smartdigimkt.o.a.a(com.smartdigimkt.m6.b.p().k(), this.X, this.f38797c0, str2, false, true);
                b();
            } else if (this.X.G2()) {
                com.smartdigimkt.o.a.a(com.smartdigimkt.m6.b.p().k(), this.X, this.f38797c0, str2, false, true, com.smartdigimkt.q.a.q);
                b();
            }
            this.h0 = true;
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void j() {
        com.smartdigimkt.x.d dVar;
        List<String> listH1;
        try {
            if (!this.W || this.i0 || (dVar = this.X) == null) {
                return;
            }
            this.i0 = true;
            if ((dVar.H2() && this.Z && !this.X.G2()) || this.Z || (listH1 = this.X.H1()) == null || listH1.size() <= 0) {
                return;
            }
            Iterator<String> it = listH1.iterator();
            while (it.hasNext()) {
                com.smartdigimkt.o.a.a(com.smartdigimkt.m6.b.p().k(), this.X, this.f38797c0, it.next(), false, true);
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public void k() {
        com.smartdigimkt.x.d dVar = this.X;
        if (dVar == null || TextUtils.isEmpty(dVar.i0()) || this.X.p1() == null || this.X.p1().j() == null) {
            return;
        }
        Context contextK = com.smartdigimkt.m6.b.p().k();
        com.smartdigimkt.x.d dVar2 = this.X;
        com.smartdigimkt.o.a.a(contextK, dVar2, dVar2.i0(), this.X.p1().j(), false, false);
    }

    public void l() {
        com.smartdigimkt.c3.c cVar = this.a0;
        if (cVar != null) {
            cVar.e(true);
        }
    }

    public void a(List<com.smartdigimkt.x.d> list) {
        this.f38795Y = list;
    }

    public void b(String str) {
    }

    @Override // com.smartdigimkt.u2.f, com.smartdigimkt.t2.a
    public void a(int i2, Object obj) {
        super.a(i2, obj);
        this.e0.a(i2, obj);
    }

    public void b(int i2) {
        if (this.X != null) {
            if (i2 == 1 || i2 == 2) {
                com.smartdigimkt.v2.a.a(com.smartdigimkt.m6.b.p().k(), this.X, i2, this.f0);
            }
        }
    }

    public void a(int i2, String str) {
        if (this.X != null) {
            new t(t.f39835c0, this.X.j(), this.X.N1(), this.X.O1(), this.f38797c0, com.smartdigimkt.v0.n.h(com.smartdigimkt.m6.b.p().k()), i2, str);
        }
    }

    public void a(int i2) {
        com.smartdigimkt.x.d dVar = this.X;
        if (dVar != null) {
            String strR1 = dVar.r1();
            if (TextUtils.isEmpty(strR1)) {
                return;
            }
            if (i2 == 1 || i2 == 2) {
                if (!strR1.contains("endscreen_type")) {
                    StringBuilder sb = new StringBuilder(strR1);
                    if (strR1.contains("?")) {
                        sb.append("&endscreen_type=");
                        sb.append(i2);
                    } else {
                        sb.append("?endscreen_type=");
                        sb.append(i2);
                    }
                    strR1 = sb.toString();
                } else if (i2 == 2) {
                    if (strR1.contains("endscreen_type=1")) {
                        strR1 = strR1.replace("endscreen_type=1", "endscreen_type=2");
                    }
                } else if (strR1.contains("endscreen_type=2")) {
                    strR1 = strR1.replace("endscreen_type=2", "endscreen_type=1");
                }
                this.X.g0(strR1);
            }
        }
    }

    public void a() {
        com.smartdigimkt.c3.e.a().a(false);
    }

    public void a(String str) {
        List<com.smartdigimkt.x.d> list;
        if (this.X == null || (list = this.f38795Y) == null || list.size() == 0) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has(l0)) {
                this.X = this.f38795Y.get(jSONObject.getInt(l0));
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }
}
