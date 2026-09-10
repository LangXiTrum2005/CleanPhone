package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ia extends i1 {
    private static final ia zzg;
    private static volatile j2 zzh;
    private int zzb;
    private int zze;
    private r1 zzf = y1.f24163e;

    static {
        ia iaVar = new ia();
        zzg = iaVar;
        i1.p(ia.class, iaVar);
    }

    public static ha z() {
        return (ha) zzg.k();
    }

    public final /* synthetic */ void A(int i10) {
        this.zzb |= 1;
        this.zze = i10;
    }

    public final void B(List list) {
        s1 s1Var = this.zzf;
        if (!((m0) s1Var).f23719a) {
            int size = s1Var.size();
            this.zzf = ((y1) s1Var).g(size + size);
        }
        l0.d(list, this.zzf);
    }

    @Override // com.google.android.gms.internal.measurement.i1
    public final Object t(int i10) {
        j2 h1Var;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new n2(zzg, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new ia();
        }
        if (i11 == 4) {
            return new ha(zzg);
        }
        if (i11 == 5) {
            return zzg;
        }
        if (i11 != 6) {
            throw null;
        }
        j2 j2Var = zzh;
        if (j2Var != null) {
            return j2Var;
        }
        synchronized (ia.class) {
            try {
                h1Var = zzh;
                if (h1Var == null) {
                    h1Var = new h1(zzg);
                    zzh = h1Var;
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

    public final long y(int i10) {
        return ((y1) this.zzf).h(i10);
    }
}
