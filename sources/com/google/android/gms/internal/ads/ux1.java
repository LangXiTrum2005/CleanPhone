package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ux1 implements pz1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f20942b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public tz1 f20944d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f20945e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public j02 f20946f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public s6 f20947g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f20948h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public o42 f20949i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public g22[] f20950j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f20951k;
    public long l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f20953n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f20954o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public r32 f20956q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public m f20958s;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f20941a = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f81 f20943c = new f81(8, false);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f20952m = Long.MIN_VALUE;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ci f20955p = ci.f13168a;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f20957r = C.TIME_UNSET;

    public ux1(int i10) {
        this.f20942b = i10;
    }

    public static boolean s(int i10, boolean z10) {
        int i11 = i10 & 7;
        if (i11 != 4) {
            return z10 && i11 == 3;
        }
        return true;
    }

    public abstract void A(boolean z10, boolean z11);

    public abstract void B(g22[] g22VarArr, long j10, long j11, r32 r32Var);

    public abstract void a(long j10, boolean z10, boolean z11);

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public abstract void g();

    public abstract void h();

    public final void i() {
        this.f20944d.getClass();
    }

    public final dy1 j(Exception exc, g22 g22Var, boolean z10, int i10) {
        int iT;
        if (g22Var == null || this.f20954o) {
            iT = 4;
        } else {
            this.f20954o = true;
            try {
                iT = t(g22Var) & 7;
                this.f20954o = false;
            } catch (dy1 unused) {
                this.f20954o = false;
                iT = 4;
            } catch (Throwable th2) {
                this.f20954o = false;
                throw th2;
            }
        }
        return new dy1(1, exc, i10, l(), this.f20945e, g22Var, g22Var == null ? 4 : iT, this.f20956q, z10);
    }

    public final int k(f81 f81Var, tx1 tx1Var, int i10) {
        o42 o42Var = this.f20949i;
        o42Var.getClass();
        int iB = o42Var.b(f81Var, tx1Var, i10);
        if (iB == -4) {
            int i11 = i10 & 1;
            if (tx1Var.f(4)) {
                if (i11 == 0) {
                    this.f20952m = Long.MIN_VALUE;
                }
                return this.f20953n ? -4 : -3;
            }
            long j10 = tx1Var.f20524f + this.f20951k;
            tx1Var.f20524f = j10;
            if (i11 == 0) {
                this.f20952m = Math.max(this.f20952m, j10);
                return -4;
            }
        } else if (iB == -5) {
            g22 g22Var = (g22) f81Var.f14318c;
            g22Var.getClass();
            long j11 = g22Var.f14683t;
            if (j11 != Long.MAX_VALUE) {
                i12 i12Var = new i12(g22Var);
                i12Var.f15516s = j11 + this.f20951k;
                f81Var.f14318c = new g22(i12Var);
                return -5;
            }
        }
        return iB;
    }

    public abstract String l();

    public boolean m(long j10) {
        return false;
    }

    public abstract void n(float f10, float f11);

    public abstract void p(long j10, long j11);

    public abstract boolean q();

    public abstract boolean r();

    public abstract int t(g22 g22Var);

    public final void u(long j10, boolean z10, boolean z11) {
        this.f20953n = false;
        this.l = j10;
        this.f20952m = j10;
        if (!z11) {
            o42 o42Var = this.f20949i;
            o42Var.getClass();
            z11 = o42Var.a(j10 - this.f20951k) != 0;
        }
        a(j10, z10, z11);
    }

    public final void v() {
        r32 r32Var;
        int iE;
        if (this.f20955p.g() || (r32Var = this.f20956q) == null || (iE = this.f20955p.e(r32Var.f19359a)) == -1) {
            this.f20957r = C.TIME_UNSET;
        } else {
            this.f20957r = this.f20955p.d(iE, new ug(), false).f20773d;
        }
    }

    public final void w(g22[] g22VarArr, o42 o42Var, long j10, long j11, r32 r32Var) {
        ps1.c0(!this.f20953n);
        this.f20949i = o42Var;
        this.f20956q = r32Var;
        v();
        if (this.f20952m == Long.MIN_VALUE) {
            this.f20952m = j10;
        }
        this.f20950j = g22VarArr;
        this.f20951k = j11;
        B(g22VarArr, j10, j11, r32Var);
    }

    public final boolean x() {
        return this.f20952m == Long.MIN_VALUE;
    }

    public cz1 y() {
        return null;
    }

    public final void z() {
        synchronized (this.f20941a) {
            this.f20958s = null;
        }
    }

    public void o() {
    }
}
