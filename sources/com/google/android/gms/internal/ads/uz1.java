package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class uz1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f20970c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f20972e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f20973f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f20971d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f20968a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f20969b = false;

    public /* synthetic */ uz1(int i10, Object obj, Object obj2) {
        this.f20972e = obj;
        this.f20970c = i10;
        this.f20973f = obj2;
    }

    public static final void A(ux1 ux1Var) {
        int i10 = ux1Var.f20948h;
        if (i10 == 2) {
            ps1.c0(i10 == 2);
            ux1Var.f20948h = 1;
            ux1Var.e();
        }
    }

    public static void b(p1.a aVar) {
        int i10 = aVar.f47912h;
        if (i10 == 2) {
            go.k.t(i10 == 2);
            aVar.f47912h = 1;
            aVar.s();
        }
    }

    public static boolean h(p1.a aVar) {
        return aVar.f47912h != 0;
    }

    public static void l(p1.a aVar, long j10) {
        aVar.f47917n = true;
        if (aVar instanceof h2.f) {
            h2.f fVar = (h2.f) aVar;
            go.k.t(fVar.f47917n);
            fVar.K = j10;
        }
    }

    public static boolean y(ux1 ux1Var) {
        return ux1Var.f20948h != 0;
    }

    public boolean B() {
        return ((ux1) this.f20973f) != null;
    }

    public void C() {
        int i10;
        ps1.c0(!D());
        if (y((ux1) this.f20972e)) {
            i10 = 3;
        } else {
            ux1 ux1Var = (ux1) this.f20973f;
            i10 = (ux1Var == null || ux1Var.f20948h == 0) ? 2 : 4;
        }
        this.f20971d = i10;
    }

    public boolean D() {
        int i10 = this.f20971d;
        return i10 == 2 || i10 == 4 || i10 == 3;
    }

    public int E() {
        ux1 ux1Var = (ux1) this.f20973f;
        boolean zY = y((ux1) this.f20972e);
        int i10 = 0;
        if (ux1Var != null && ux1Var.f20948h != 0) {
            i10 = 1;
        }
        return (zY ? 1 : 0) + i10;
    }

    public void F() {
        int i10 = ((ux1) this.f20972e).f20942b;
    }

    public boolean G(dz1 dz1Var) {
        ux1 ux1VarZ = z(dz1Var);
        ux1VarZ.getClass();
        return ux1VarZ.x();
    }

    public void H(dz1 dz1Var) {
        ux1 ux1VarZ = z(dz1Var);
        ux1VarZ.getClass();
        ux1VarZ.f20953n = true;
    }

    public void I(s sVar, s sVar2) {
        int i10;
        ux1 ux1Var = (ux1) this.f20972e;
        int i11 = this.f20970c;
        boolean zB = sVar.b(i11);
        boolean zB2 = sVar2.b(i11);
        ux1 ux1Var2 = (ux1) this.f20973f;
        if (ux1Var2 == null || (i10 = this.f20971d) == 3 || (i10 == 0 && y(ux1Var))) {
            ux1Var2 = ux1Var;
        }
        if (!zB || ux1Var2.f20953n) {
            return;
        }
        int i12 = ux1Var.f20942b;
        tz1 tz1Var = ((tz1[]) sVar.f19743b)[i11];
        tz1 tz1Var2 = ((tz1[]) sVar2.f19743b)[i11];
        if (zB2 && Objects.equals(tz1Var2, tz1Var) && !D()) {
            return;
        }
        ux1Var2.f20953n = true;
    }

    public void J() {
        int i10;
        ux1 ux1Var = (ux1) this.f20972e;
        if (y(ux1Var) && (i10 = this.f20971d) != 4 && i10 != 2) {
            ux1Var.f20953n = true;
        }
        ux1 ux1Var2 = (ux1) this.f20973f;
        if (ux1Var2 == null || ux1Var2.f20948h == 0 || this.f20971d == 3) {
            return;
        }
        ux1Var2.f20953n = true;
    }

    public void K() {
        ux1 ux1Var = (ux1) this.f20972e;
        if (y(ux1Var)) {
            ux1Var.o();
            return;
        }
        ux1 ux1Var2 = (ux1) this.f20973f;
        if (ux1Var2 == null || ux1Var2.f20948h == 0) {
            return;
        }
        ux1Var2.o();
    }

    public boolean L() {
        ux1 ux1Var = (ux1) this.f20972e;
        boolean zR = y(ux1Var) ? ux1Var.r() : true;
        ux1 ux1Var2 = (ux1) this.f20973f;
        return (ux1Var2 == null || ux1Var2.f20948h == 0) ? zR : ux1Var2.r() & zR;
    }

    public boolean M(dz1 dz1Var) {
        int i10 = this.f20971d;
        return ((i10 == 2 || i10 == 4) && z(dz1Var) == ((ux1) this.f20972e)) || (this.f20971d == 3 && z(dz1Var) == ((ux1) this.f20973f));
    }

    public boolean N(dz1 dz1Var) {
        return u(dz1Var, (ux1) this.f20972e) && u(dz1Var, (ux1) this.f20973f);
    }

    public void O(long j10, long j11) {
        ux1 ux1Var = (ux1) this.f20972e;
        if (y(ux1Var)) {
            ux1Var.p(j10, j11);
        }
        ux1 ux1Var2 = (ux1) this.f20973f;
        if (ux1Var2 == null || ux1Var2.f20948h == 0) {
            return;
        }
        ux1Var2.p(j10, j11);
    }

    public boolean P(dz1 dz1Var) {
        ux1 ux1VarZ = z(dz1Var);
        return ux1VarZ == null || ux1VarZ.x() || ux1VarZ.q() || ux1VarZ.r();
    }

    public void Q() {
        int i10;
        ux1 ux1Var = (ux1) this.f20972e;
        int i11 = ux1Var.f20948h;
        if (i11 == 1 && this.f20971d != 4) {
            ps1.c0(i11 == 1);
            ux1Var.f20948h = 2;
            ux1Var.d();
            return;
        }
        ux1 ux1Var2 = (ux1) this.f20973f;
        if (ux1Var2 == null || (i10 = ux1Var2.f20948h) != 1 || this.f20971d == 3) {
            return;
        }
        ps1.c0(i10 == 1);
        ux1Var2.f20948h = 2;
        ux1Var2.d();
    }

    public void a(p1.a aVar, sr0 sr0Var) {
        go.k.t(((p1.a) this.f20972e) == aVar || ((p1.a) this.f20973f) == aVar);
        if (h(aVar)) {
            if (aVar == ((p1.a) sr0Var.f20041e)) {
                sr0Var.f20042f = null;
                sr0Var.f20041e = null;
                sr0Var.f20037a = true;
            }
            b(aVar);
            go.k.t(aVar.f47912h == 1);
            aVar.f47907c.c();
            aVar.f47912h = 0;
            aVar.f47913i = null;
            aVar.f47914j = null;
            aVar.f47917n = false;
            aVar.m();
            aVar.f47920q = null;
        }
    }

    public int c() {
        boolean zH = h((p1.a) this.f20972e);
        p1.a aVar = (p1.a) this.f20973f;
        return (zH ? 1 : 0) + ((aVar == null || !h(aVar)) ? 0 : 1);
    }

    public p1.a d(p1.m0 m0Var) {
        f2.c1 c1Var;
        if (m0Var != null && (c1Var = m0Var.f48112c[this.f20970c]) != null) {
            p1.a aVar = (p1.a) this.f20972e;
            if (aVar.f47913i == c1Var) {
                return aVar;
            }
            p1.a aVar2 = (p1.a) this.f20973f;
            if (aVar2 != null && aVar2.f47913i == c1Var) {
                return aVar2;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x003a  */
    public boolean e(p1.m0 m0Var, p1.a aVar) {
        p1.m0 m0Var2;
        int i10 = this.f20970c;
        if (aVar != null) {
            f2.c1 c1Var = m0Var.f48112c[i10];
            f2.c1 c1Var2 = aVar.f47913i;
            if (c1Var2 != null) {
                if (c1Var2 != c1Var) {
                    m0Var2 = m0Var.f48121m;
                    if (m0Var2 != null || m0Var2.f48112c[i10] != aVar.f47913i) {
                    }
                } else if (c1Var != null && !aVar.i()) {
                    p1.m0 m0Var3 = m0Var.f48121m;
                    if (!m0Var.f48116g.f48132g || m0Var3 == null || !m0Var3.f48114e || (!(aVar instanceof h2.f) && !(aVar instanceof z1.b) && aVar.f47916m < m0Var3.e())) {
                        m0Var2 = m0Var.f48121m;
                        return m0Var2 != null ? false : false;
                    }
                }
            }
        }
        return true;
    }

    public boolean f() {
        int i10 = this.f20971d;
        return i10 == 2 || i10 == 4 || i10 == 3;
    }

    public boolean g() {
        int i10 = this.f20971d;
        if (i10 == 0 || i10 == 2 || i10 == 4) {
            return h((p1.a) this.f20972e);
        }
        p1.a aVar = (p1.a) this.f20973f;
        aVar.getClass();
        return aVar.f47912h != 0;
    }

    public void i(boolean z10) {
        if (z10) {
            if (this.f20968a) {
                p1.a aVar = (p1.a) this.f20972e;
                go.k.t(aVar.f47912h == 0);
                aVar.f47907c.c();
                aVar.q();
                this.f20968a = false;
                return;
            }
            return;
        }
        if (this.f20969b) {
            p1.a aVar2 = (p1.a) this.f20973f;
            aVar2.getClass();
            go.k.t(aVar2.f47912h == 0);
            aVar2.f47907c.c();
            aVar2.q();
            this.f20969b = false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int j(p1.a aVar, p1.m0 m0Var, i2.v vVar, sr0 sr0Var) {
        int i10;
        p1.a aVar2 = (p1.a) this.f20972e;
        int i11 = this.f20970c;
        if (aVar == null || aVar.f47912h == 0 || (aVar == aVar2 && ((i10 = this.f20971d) == 2 || i10 == 4))) {
            return 1;
        }
        if (aVar == ((p1.a) this.f20973f) && this.f20971d == 3) {
            return 1;
        }
        byte b10 = aVar.f47913i != m0Var.f48112c[i11];
        boolean zB = vVar.b(i11);
        if (!zB || b10 != false) {
            if (!aVar.f47917n) {
                i2.r rVar = vVar.f42839c[i11];
                int length = rVar != null ? rVar.length() : 0;
                i1.p[] pVarArr = new i1.p[length];
                for (int i12 = 0; i12 < length; i12++) {
                    rVar.getClass();
                    pVarArr[i12] = rVar.getFormat(i12);
                }
                f2.c1 c1Var = m0Var.f48112c[i11];
                c1Var.getClass();
                aVar.x(pVarArr, c1Var, m0Var.e(), m0Var.f48124p, m0Var.f48116g.f48126a);
                return 3;
            }
            if (!aVar.j()) {
                return 0;
            }
            a(aVar, sr0Var);
            if (!zB || f()) {
                i(aVar == aVar2);
                return 1;
            }
        }
        return 1;
    }

    public void k() {
        if (!h((p1.a) this.f20972e)) {
            i(true);
        }
        p1.a aVar = (p1.a) this.f20973f;
        if (aVar == null || aVar.f47912h != 0) {
            return;
        }
        i(false);
    }

    public void m() {
        int i10;
        p1.a aVar = (p1.a) this.f20972e;
        int i11 = aVar.f47912h;
        if (i11 == 1 && this.f20971d != 4) {
            go.k.t(i11 == 1);
            aVar.f47912h = 2;
            aVar.r();
            return;
        }
        p1.a aVar2 = (p1.a) this.f20973f;
        if (aVar2 == null || (i10 = aVar2.f47912h) != 1 || this.f20971d == 3) {
            return;
        }
        go.k.t(i10 == 1);
        aVar2.f47912h = 2;
        aVar2.r();
    }

    public void n() {
        int i10 = this.f20971d;
        if (i10 != 3 && i10 != 4) {
            if (i10 == 2) {
                this.f20971d = 0;
                return;
            }
            return;
        }
        boolean z10 = i10 == 4;
        ux1 ux1Var = (ux1) this.f20972e;
        ux1 ux1Var2 = (ux1) this.f20973f;
        if (z10) {
            ux1Var2.getClass();
            ux1Var2.b(17, ux1Var);
        } else {
            ux1Var2.getClass();
            ux1Var.b(17, ux1Var2);
        }
        this.f20971d = this.f20971d != 4 ? 1 : 0;
    }

    public void o() {
        if (!y((ux1) this.f20972e)) {
            w(true);
        }
        ux1 ux1Var = (ux1) this.f20973f;
        if (ux1Var == null || ux1Var.f20948h != 0) {
            return;
        }
        w(false);
    }

    public int p(dz1 dz1Var, s sVar, sr0 sr0Var) {
        int iX = x((ux1) this.f20972e, dz1Var, sVar, sr0Var);
        return iX == 1 ? x((ux1) this.f20973f, dz1Var, sVar, sr0Var) : iX;
    }

    public void q() {
        ux1 ux1Var = (ux1) this.f20972e;
        ps1.c0(ux1Var.f20948h == 0);
        ux1Var.h();
        this.f20968a = false;
        ux1 ux1Var2 = (ux1) this.f20973f;
        if (ux1Var2 != null) {
            ps1.c0(ux1Var2.f20948h == 0);
            ux1Var2.h();
            this.f20969b = false;
        }
    }

    public void r(Object obj) {
        ux1 ux1Var = (ux1) this.f20972e;
        if (ux1Var.f20942b != 2) {
            return;
        }
        int i10 = this.f20971d;
        if (i10 != 4 && i10 != 1) {
            ux1Var.b(1, obj);
            return;
        }
        ux1 ux1Var2 = (ux1) this.f20973f;
        ux1Var2.getClass();
        ux1Var2.b(1, obj);
    }

    public void s(d1 d1Var) {
        ux1 ux1Var = (ux1) this.f20972e;
        if (ux1Var.f20942b != 2) {
            return;
        }
        ux1Var.b(7, d1Var);
        ux1 ux1Var2 = (ux1) this.f20973f;
        if (ux1Var2 != null) {
            ux1Var2.b(7, d1Var);
        }
    }

    public boolean t() {
        int i10 = this.f20971d;
        if (i10 == 0 || i10 == 2 || i10 == 4) {
            return y((ux1) this.f20972e);
        }
        ux1 ux1Var = (ux1) this.f20973f;
        ux1Var.getClass();
        return ux1Var.f20948h != 0;
    }

    public boolean u(dz1 dz1Var, ux1 ux1Var) {
        if (ux1Var == null) {
            return true;
        }
        o42[] o42VarArr = dz1Var.f13776c;
        int i10 = this.f20970c;
        o42 o42Var = o42VarArr[i10];
        o42 o42Var2 = ux1Var.f20949i;
        if (o42Var2 == null) {
            return true;
        }
        if (o42Var2 == o42Var && (o42Var == null || ux1Var.x())) {
            return true;
        }
        dz1 dz1Var2 = dz1Var.f13785m;
        return dz1Var2 != null && dz1Var2.f13776c[i10] == ux1Var.f20949i;
    }

    public void v(ux1 ux1Var, sr0 sr0Var) {
        ps1.c0(((ux1) this.f20972e) == ux1Var || ((ux1) this.f20973f) == ux1Var);
        if (y(ux1Var)) {
            if (ux1Var == ((ux1) sr0Var.f20041e)) {
                sr0Var.f20042f = null;
                sr0Var.f20041e = null;
                sr0Var.f20037a = true;
            }
            A(ux1Var);
            ps1.c0(ux1Var.f20948h == 1);
            f81 f81Var = ux1Var.f20943c;
            f81Var.f14317b = null;
            f81Var.f14318c = null;
            ux1Var.f20948h = 0;
            ux1Var.f20949i = null;
            ux1Var.f20950j = null;
            ux1Var.f20953n = false;
            ux1Var.f();
            ux1Var.f20956q = null;
            ux1Var.f20957r = C.TIME_UNSET;
        }
    }

    public void w(boolean z10) {
        if (z10) {
            if (this.f20968a) {
                ux1 ux1Var = (ux1) this.f20972e;
                ps1.c0(ux1Var.f20948h == 0);
                f81 f81Var = ux1Var.f20943c;
                f81Var.f14317b = null;
                f81Var.f14318c = null;
                ux1Var.g();
                this.f20968a = false;
                return;
            }
            return;
        }
        if (this.f20969b) {
            ux1 ux1Var2 = (ux1) this.f20973f;
            ux1Var2.getClass();
            ps1.c0(ux1Var2.f20948h == 0);
            f81 f81Var2 = ux1Var2.f20943c;
            f81Var2.f14317b = null;
            f81Var2.f14318c = null;
            ux1Var2.g();
            this.f20969b = false;
        }
    }

    public int x(ux1 ux1Var, dz1 dz1Var, s sVar, sr0 sr0Var) {
        int i10;
        if (ux1Var != null && ux1Var.f20948h != 0) {
            ux1 ux1Var2 = (ux1) this.f20972e;
            boolean z10 = ux1Var != ux1Var2;
            if (ux1Var == ux1Var2 && ((i10 = this.f20971d) == 2 || i10 == 4)) {
                return 1;
            }
            if (ux1Var == ((ux1) this.f20973f) && this.f20971d == 3) {
                return 1;
            }
            o42 o42Var = ux1Var.f20949i;
            o42[] o42VarArr = dz1Var.f13776c;
            int i11 = this.f20970c;
            o42 o42Var2 = o42VarArr[i11];
            boolean zB = sVar.b(i11);
            if (!zB || o42Var != o42Var2) {
                if (!ux1Var.f20953n) {
                    p pVar = ((p[]) sVar.f19744c)[i11];
                    int iZze = pVar != null ? pVar.zze() : 0;
                    g22[] g22VarArr = new g22[iZze];
                    for (int i12 = 0; i12 < iZze; i12++) {
                        pVar.getClass();
                        g22VarArr[i12] = pVar.zzb(i12);
                    }
                    o42 o42Var3 = o42VarArr[i11];
                    o42Var3.getClass();
                    ux1Var.w(g22VarArr, o42Var3, dz1Var.a(), dz1Var.f13788p, dz1Var.f13780g.f14116a);
                    return 3;
                }
                if (!ux1Var.r()) {
                    return 0;
                }
                v(ux1Var, sr0Var);
                if (!zB || D()) {
                    w(!z10);
                    return 1;
                }
            }
        }
        return 1;
    }

    public ux1 z(dz1 dz1Var) {
        if (dz1Var != null) {
            o42 o42Var = dz1Var.f13776c[this.f20970c];
            if (o42Var != null) {
                ux1 ux1Var = (ux1) this.f20972e;
                if (ux1Var.f20949i == o42Var) {
                    return ux1Var;
                }
                ux1 ux1Var2 = (ux1) this.f20973f;
                if (ux1Var2 != null && ux1Var2.f20949i == o42Var) {
                    return ux1Var2;
                }
            }
        }
        return null;
    }
}
