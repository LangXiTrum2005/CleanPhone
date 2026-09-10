package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14171a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f14172b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f14173c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f14174d;

    public f2(c2 c2Var, e2 e2Var, long j10, long j11, long j12, long j13, long j14, int i10) {
        this.f14173c = e2Var;
        this.f14171a = i10;
        this.f14172b = new a2(c2Var, j10, j11, j12, j13, j14);
    }

    public static int b(n2.l lVar, long j10, q2 q2Var) {
        if (j10 == lVar.getPosition()) {
            return 0;
        }
        q2Var.f18888a = j10;
        return 1;
    }

    public static final int f(n2 n2Var, long j10, q2 q2Var) {
        if (j10 == n2Var.zzn()) {
            return 0;
        }
        q2Var.f18888a = j10;
        return 1;
    }

    public int a(n2.l lVar, q2 q2Var) {
        n2.f fVar = (n2.f) this.f14173c;
        while (true) {
            b2 b2Var = (b2) this.f14174d;
            b2Var.getClass();
            long j10 = b2Var.f12601f;
            long j11 = b2Var.f12602g;
            long j12 = b2Var.f12603h;
            if (j11 - j10 <= this.f14171a) {
                this.f14174d = null;
                fVar.b();
                return b(lVar, j10, q2Var);
            }
            long position = j12 - lVar.getPosition();
            if (position < 0 || position > 262144) {
                return b(lVar, j12, q2Var);
            }
            lVar.skipFully((int) position);
            lVar.resetPeekPosition();
            n2.e eVarA = fVar.a(lVar, b2Var.f12597b);
            int i10 = eVarA.f46454a;
            long j13 = eVarA.f46455b;
            long j14 = eVarA.f46456c;
            if (i10 == -3) {
                this.f14174d = null;
                fVar.b();
                return b(lVar, j12, q2Var);
            }
            if (i10 == -2) {
                b2Var.f12599d = j13;
                b2Var.f12601f = j14;
                b2Var.f12603h = b2.a(b2Var.f12597b, j13, b2Var.f12600e, j14, b2Var.f12602g, b2Var.f12598c);
            } else {
                if (i10 != -1) {
                    if (i10 != 0) {
                        throw new IllegalStateException("Invalid case");
                    }
                    long position2 = j14 - lVar.getPosition();
                    if (position2 >= 0 && position2 <= 262144) {
                        lVar.skipFully((int) position2);
                    }
                    this.f14174d = null;
                    fVar.b();
                    return b(lVar, j14, q2Var);
                }
                b2Var.f12600e = j13;
                b2Var.f12602g = j14;
                b2Var.f12603h = b2.a(b2Var.f12597b, b2Var.f12599d, j13, b2Var.f12601f, j14, b2Var.f12598c);
            }
        }
    }

    public void c(long j10) {
        b2 b2Var = (b2) this.f14174d;
        if (b2Var == null || b2Var.f12596a != j10) {
            n2.c cVar = (n2.c) this.f14172b;
            this.f14174d = new b2(j10, cVar.f46447a.b(j10), cVar.f46449c, cVar.f46450d, cVar.f46451e, cVar.f46452f, 2);
        }
    }

    public void d(long j10) {
        b2 b2Var = (b2) this.f14174d;
        if (b2Var == null || b2Var.f12596a != j10) {
            a2 a2Var = (a2) this.f14172b;
            this.f14174d = new b2(j10, a2Var.f11798a.c(j10), a2Var.f11800c, a2Var.f11801d, a2Var.f11802e, a2Var.f11803f, 0);
        }
    }

    public int e(n2 n2Var, q2 q2Var) {
        e2 e2Var = (e2) this.f14173c;
        while (true) {
            b2 b2Var = (b2) this.f14174d;
            b2Var.getClass();
            long j10 = b2Var.f12601f;
            long j11 = b2Var.f12602g;
            long j12 = b2Var.f12603h;
            if (j11 - j10 <= this.f14171a) {
                this.f14174d = null;
                e2Var.zzb();
                return f(n2Var, j10, q2Var);
            }
            long jZzn = j12 - n2Var.zzn();
            if (jZzn < 0 || jZzn > 262144) {
                return f(n2Var, j12, q2Var);
            }
            n2Var.zzf((int) jZzn);
            n2Var.zzl();
            d2 d2VarA = e2Var.a(n2Var, b2Var.f12597b);
            int i10 = d2VarA.f13362a;
            long j13 = d2VarA.f13363b;
            long j14 = d2VarA.f13364c;
            if (i10 == -3) {
                this.f14174d = null;
                e2Var.zzb();
                return f(n2Var, j12, q2Var);
            }
            if (i10 == -2) {
                b2Var.f12599d = j13;
                b2Var.f12601f = j14;
                b2Var.f12603h = b2.b(b2Var.f12597b, j13, b2Var.f12600e, j14, b2Var.f12602g, b2Var.f12598c);
            } else {
                if (i10 != -1) {
                    long jZzn2 = j14 - n2Var.zzn();
                    if (jZzn2 >= 0 && jZzn2 <= 262144) {
                        n2Var.zzf((int) jZzn2);
                    }
                    this.f14174d = null;
                    e2Var.zzb();
                    return f(n2Var, j14, q2Var);
                }
                b2Var.f12600e = j13;
                b2Var.f12602g = j14;
                b2Var.f12603h = b2.b(b2Var.f12597b, b2Var.f12599d, j13, b2Var.f12601f, j14, b2Var.f12598c);
            }
        }
    }

    public f2(n2.d dVar, n2.f fVar, long j10, long j11, long j12, long j13, long j14, int i10) {
        this.f14173c = fVar;
        this.f14171a = i10;
        this.f14172b = new n2.c(dVar, j10, j11, j12, j13, j14);
    }
}
