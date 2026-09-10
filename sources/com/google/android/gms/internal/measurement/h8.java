package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class h8 extends i1 {
    private static final h8 zzj;
    private static volatile j2 zzk;
    private int zzb;
    private int zze;
    private s1 zzf;
    private s1 zzg;
    private boolean zzh;
    private boolean zzi;

    static {
        h8 h8Var = new h8();
        zzj = h8Var;
        i1.p(h8.class, h8Var);
    }

    public h8() {
        m2 m2Var = m2.f23723e;
        this.zzf = m2Var;
        this.zzg = m2Var;
    }

    public final int A() {
        return this.zzg.size();
    }

    public final j8 B(int i10) {
        return (j8) this.zzg.get(i10);
    }

    public final void C(int i10, p8 p8Var) {
        s1 s1Var = this.zzf;
        if (!((m0) s1Var).f23719a) {
            this.zzf = f2.f(s1Var);
        }
        this.zzf.set(i10, p8Var);
    }

    public final void D(int i10, j8 j8Var) {
        s1 s1Var = this.zzg;
        if (!((m0) s1Var).f23719a) {
            this.zzg = f2.f(s1Var);
        }
        this.zzg.set(i10, j8Var);
    }

    @Override // com.google.android.gms.internal.measurement.i1
    public final Object t(int i10) {
        j2 h1Var;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new n2(zzj, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zzb", "zze", "zzf", p8.class, "zzg", j8.class, "zzh", "zzi"});
        }
        if (i11 == 3) {
            return new h8();
        }
        if (i11 == 4) {
            return new g8(zzj);
        }
        if (i11 == 5) {
            return zzj;
        }
        if (i11 != 6) {
            throw null;
        }
        j2 j2Var = zzk;
        if (j2Var != null) {
            return j2Var;
        }
        synchronized (h8.class) {
            try {
                h1Var = zzk;
                if (h1Var == null) {
                    h1Var = new h1(zzj);
                    zzk = h1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return h1Var;
    }

    public final boolean u() {
        return (this.zzb & 1) != 0;
    }

    public final int v() {
        return this.zze;
    }

    public final List w() {
        return this.zzf;
    }

    public final int x() {
        return this.zzf.size();
    }

    public final p8 y(int i10) {
        return (p8) this.zzf.get(i10);
    }

    public final s1 z() {
        return this.zzg;
    }
}
