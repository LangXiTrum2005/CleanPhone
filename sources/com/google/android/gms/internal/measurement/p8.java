package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class p8 extends i1 {
    private static final p8 zzk;
    private static volatile j2 zzl;
    private int zzb;
    private int zze;
    private String zzf = "";
    private l8 zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;

    static {
        p8 p8Var = new p8();
        zzk = p8Var;
        i1.p(p8.class, p8Var);
    }

    public static o8 C() {
        return (o8) zzk.k();
    }

    public final boolean A() {
        return (this.zzb & 32) != 0;
    }

    public final boolean B() {
        return this.zzj;
    }

    public final /* synthetic */ void D(String str) {
        this.zzb |= 2;
        this.zzf = str;
    }

    @Override // com.google.android.gms.internal.measurement.i1
    public final Object t(int i10) {
        j2 h1Var;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new n2(zzk, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i11 == 3) {
            return new p8();
        }
        if (i11 == 4) {
            return new o8(zzk);
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
        synchronized (p8.class) {
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

    public final boolean u() {
        return (this.zzb & 1) != 0;
    }

    public final int v() {
        return this.zze;
    }

    public final String w() {
        return this.zzf;
    }

    public final l8 x() {
        l8 l8Var = this.zzg;
        return l8Var == null ? l8.C() : l8Var;
    }

    public final boolean y() {
        return this.zzh;
    }

    public final boolean z() {
        return this.zzi;
    }
}
