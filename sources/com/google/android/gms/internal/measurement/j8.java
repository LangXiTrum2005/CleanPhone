package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class j8 extends i1 {
    private static final j8 zzm;
    private static volatile j2 zzn;
    private int zzb;
    private int zze;
    private String zzf = "";
    private s1 zzg = m2.f23723e;
    private boolean zzh;
    private n8 zzi;
    private boolean zzj;
    private boolean zzk;
    private boolean zzl;

    static {
        j8 j8Var = new j8();
        zzm = j8Var;
        i1.p(j8.class, j8Var);
    }

    public static i8 G() {
        return (i8) zzm.k();
    }

    public final boolean A() {
        return (this.zzb & 8) != 0;
    }

    public final n8 B() {
        n8 n8Var = this.zzi;
        return n8Var == null ? n8.D() : n8Var;
    }

    public final boolean C() {
        return this.zzj;
    }

    public final boolean D() {
        return this.zzk;
    }

    public final boolean E() {
        return (this.zzb & 64) != 0;
    }

    public final boolean F() {
        return this.zzl;
    }

    public final /* synthetic */ void H(String str) {
        this.zzb |= 2;
        this.zzf = str;
    }

    public final void I(int i10, l8 l8Var) {
        s1 s1Var = this.zzg;
        if (!((m0) s1Var).f23719a) {
            this.zzg = f2.f(s1Var);
        }
        this.zzg.set(i10, l8Var);
    }

    @Override // com.google.android.gms.internal.measurement.i1
    public final Object t(int i10) {
        j2 h1Var;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new n2(zzm, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဇ\u0002\u0005ဉ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006", new Object[]{"zzb", "zze", "zzf", "zzg", l8.class, "zzh", "zzi", "zzj", "zzk", "zzl"});
        }
        if (i11 == 3) {
            return new j8();
        }
        if (i11 == 4) {
            return new i8(zzm);
        }
        if (i11 == 5) {
            return zzm;
        }
        if (i11 != 6) {
            throw null;
        }
        j2 j2Var = zzn;
        if (j2Var != null) {
            return j2Var;
        }
        synchronized (j8.class) {
            try {
                h1Var = zzn;
                if (h1Var == null) {
                    h1Var = new h1(zzm);
                    zzn = h1Var;
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

    public final String w() {
        return this.zzf;
    }

    public final List x() {
        return this.zzg;
    }

    public final int y() {
        return this.zzg.size();
    }

    public final l8 z(int i10) {
        return (l8) this.zzg.get(i10);
    }
}
