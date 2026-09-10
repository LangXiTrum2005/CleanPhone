package p1;

import com.ironsource.Xa;
import m0.s1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a implements y0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f47906b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c1 f47908d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f47909e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public q1.j f47910f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public l1.u f47911g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f47912h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public f2.c1 f47913i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public i1.p[] f47914j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f47915k;
    public long l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f47917n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f47918o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public f2.c0 f47920q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public i2.p f47921r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f47905a = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s1 f47907c = new s1(12, false);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f47916m = Long.MIN_VALUE;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public i1.p0 f47919p = i1.p0.f42656a;

    public a(int i10) {
        this.f47906b = i10;
    }

    public static int c(int i10, int i11, int i12, int i13) {
        return i10 | i11 | i12 | 128 | i13;
    }

    public static boolean k(int i10, boolean z10) {
        int i11 = i10 & 7;
        if (i11 != 4) {
            return z10 && i11 == 3;
        }
        return true;
    }

    public abstract int A(i1.p pVar);

    public int B() {
        return 0;
    }

    public boolean C(long j10) {
        return false;
    }

    public final h d(Exception exc, i1.p pVar, boolean z10, int i10) {
        int iA;
        if (pVar == null || this.f47918o) {
            iA = 4;
        } else {
            this.f47918o = true;
            try {
                iA = A(pVar) & 7;
                this.f47918o = false;
            } catch (h unused) {
                this.f47918o = false;
                iA = 4;
            } catch (Throwable th2) {
                this.f47918o = false;
                throw th2;
            }
        }
        return new h(1, exc, i10, h(), this.f47909e, pVar, pVar == null ? 4 : iA, this.f47920q, z10);
    }

    public long f(long j10, long j11) {
        if (this.f47912h != 1) {
            return Xa.f27908s;
        }
        if (l() || j()) {
            return 1000000L;
        }
        return Xa.f27908s;
    }

    public l0 g() {
        return null;
    }

    public abstract String h();

    public final boolean i() {
        return this.f47916m == Long.MIN_VALUE;
    }

    public abstract boolean j();

    public abstract boolean l();

    public abstract void m();

    public abstract void o(long j10, boolean z10, boolean z11);

    public final int v(s1 s1Var, o1.d dVar, int i10) {
        f2.c1 c1Var = this.f47913i;
        c1Var.getClass();
        int iH = c1Var.h(s1Var, dVar, i10);
        if (iH == -4) {
            if (dVar.c(4)) {
                this.f47916m = Long.MIN_VALUE;
                return this.f47917n ? -4 : -3;
            }
            long j10 = dVar.f47037g + this.f47915k;
            dVar.f47037g = j10;
            this.f47916m = Math.max(this.f47916m, j10);
            return iH;
        }
        if (iH == -5) {
            i1.p pVar = (i1.p) s1Var.f45752c;
            pVar.getClass();
            long j11 = pVar.f42648s;
            if (j11 != Long.MAX_VALUE) {
                i1.o oVarA = pVar.a();
                oVarA.f42605r = j11 + this.f47915k;
                s1Var.f45752c = new i1.p(oVarA);
            }
        }
        return iH;
    }

    public abstract void w(long j10, long j11);

    public final void x(i1.p[] pVarArr, f2.c1 c1Var, long j10, long j11, f2.c0 c0Var) {
        go.k.t(!this.f47917n);
        this.f47913i = c1Var;
        this.f47920q = c0Var;
        if (this.f47916m == Long.MIN_VALUE) {
            this.f47916m = j10;
        }
        this.f47914j = pVarArr;
        this.f47915k = j11;
        t(pVarArr, j10, j11, c0Var);
    }

    public final void y(long j10, boolean z10, boolean z11) {
        this.f47917n = false;
        this.l = j10;
        this.f47916m = j10;
        if (!z11) {
            f2.c1 c1Var = this.f47913i;
            c1Var.getClass();
            z11 = c1Var.skipData(j10 - this.f47915k) != 0;
        }
        o(j10, z10, z11);
    }

    public void e() {
    }

    public void p() {
    }

    public void q() {
    }

    public void r() {
    }

    public void s() {
    }

    public void u() {
    }

    @Override // p1.y0
    public void handleMessage(int i10, Object obj) {
    }

    public void n(boolean z10, boolean z11) {
    }

    public void z(float f10, float f11) {
    }

    public void t(i1.p[] pVarArr, long j10, long j11, f2.c0 c0Var) {
    }
}
