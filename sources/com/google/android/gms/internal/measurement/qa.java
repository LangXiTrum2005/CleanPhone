package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class qa extends i1 {
    private static final qa zzk;
    private static volatile j2 zzl;
    private int zzb;
    private int zze;
    private s1 zzf = m2.f23723e;
    private String zzg = "";
    private String zzh = "";
    private boolean zzi;
    private double zzj;

    static {
        qa qaVar = new qa();
        zzk = qaVar;
        i1.p(qa.class, qaVar);
    }

    public final boolean A() {
        return (this.zzb & 16) != 0;
    }

    public final double B() {
        return this.zzj;
    }

    public final int C() {
        int i10;
        int i11 = this.zze;
        if (i11 != 0) {
            i10 = 2;
            if (i11 != 1) {
                if (i11 != 2) {
                    i10 = 4;
                    if (i11 != 3) {
                        i10 = i11 != 4 ? 0 : 5;
                    }
                } else {
                    i10 = 3;
                }
            }
        } else {
            i10 = 1;
        }
        if (i10 == 0) {
            return 1;
        }
        return i10;
    }

    @Override // com.google.android.gms.internal.measurement.i1
    public final Object t(int i10) {
        j2 h1Var;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new n2(zzk, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဇ\u0003\u0006က\u0004", new Object[]{"zzb", "zze", i0.f23568p, "zzf", qa.class, "zzg", "zzh", "zzi", "zzj"});
        }
        if (i11 == 3) {
            return new qa();
        }
        if (i11 == 4) {
            return new m8(zzk);
        }
        if (i11 == 5) {
            return zzk;
        }
        if (i11 != 6) {
            throw null;
        }
        j2 j2Var = zzl;
        if (j2Var != null) {
            return j2Var;
        }
        synchronized (qa.class) {
            try {
                h1Var = zzl;
                if (h1Var == null) {
                    h1Var = new h1(zzk);
                    zzl = h1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return h1Var;
    }

    public final List u() {
        return this.zzf;
    }

    public final String v() {
        return this.zzg;
    }

    public final boolean w() {
        return (this.zzb & 4) != 0;
    }

    public final String x() {
        return this.zzh;
    }

    public final boolean y() {
        return (this.zzb & 8) != 0;
    }

    public final boolean z() {
        return this.zzi;
    }
}
