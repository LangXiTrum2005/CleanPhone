package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class u8 extends i1 {
    private static final u8 zzj;
    private static volatile j2 zzk;
    private int zzb;
    private s1 zze;
    private s1 zzf;
    private s1 zzg;
    private boolean zzh;
    private s1 zzi;

    static {
        u8 u8Var = new u8();
        zzj = u8Var;
        i1.p(u8.class, u8Var);
    }

    public u8() {
        m2 m2Var = m2.f23723e;
        this.zze = m2Var;
        this.zzf = m2Var;
        this.zzg = m2Var;
        this.zzi = m2Var;
    }

    public static u8 A() {
        return zzj;
    }

    @Override // com.google.android.gms.internal.measurement.i1
    public final Object t(int i10) {
        j2 h1Var;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new n2(zzj, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0004\u0000\u0001\u001b\u0002\u001b\u0003\u001b\u0004ဇ\u0000\u0005\u001b", new Object[]{"zzb", "zze", r8.class, "zzf", s8.class, "zzg", t8.class, "zzh", "zzi", r8.class});
        }
        if (i11 == 3) {
            return new u8();
        }
        if (i11 == 4) {
            return new m8(zzj);
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
        synchronized (u8.class) {
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

    public final List u() {
        return this.zze;
    }

    public final List v() {
        return this.zzf;
    }

    public final List w() {
        return this.zzg;
    }

    public final boolean x() {
        return (this.zzb & 1) != 0;
    }

    public final boolean y() {
        return this.zzh;
    }

    public final s1 z() {
        return this.zzi;
    }
}
