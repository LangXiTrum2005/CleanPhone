package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class l9 extends i1 {
    private static final l9 zzl;
    private static volatile j2 zzm;
    private int zzb;
    private boolean zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;

    static {
        l9 l9Var = new l9();
        zzl = l9Var;
        i1.p(l9.class, l9Var);
    }

    public static k9 B() {
        return (k9) zzl.k();
    }

    public static l9 C() {
        return zzl;
    }

    public final boolean A() {
        return this.zzk;
    }

    public final /* synthetic */ void D(boolean z10) {
        this.zzb |= 1;
        this.zze = z10;
    }

    public final /* synthetic */ void E(boolean z10) {
        this.zzb |= 2;
        this.zzf = z10;
    }

    public final /* synthetic */ void F(boolean z10) {
        this.zzb |= 4;
        this.zzg = z10;
    }

    public final /* synthetic */ void G(boolean z10) {
        this.zzb |= 8;
        this.zzh = z10;
    }

    public final /* synthetic */ void H(boolean z10) {
        this.zzb |= 16;
        this.zzi = z10;
    }

    public final /* synthetic */ void I(boolean z10) {
        this.zzb |= 32;
        this.zzj = z10;
    }

    public final /* synthetic */ void J(boolean z10) {
        this.zzb |= 64;
        this.zzk = z10;
    }

    @Override // com.google.android.gms.internal.measurement.i1
    public final Object t(int i10) {
        j2 h1Var;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new n2(zzl, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဇ\u0006", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i11 == 3) {
            return new l9();
        }
        if (i11 == 4) {
            return new k9(zzl);
        }
        if (i11 == 5) {
            return zzl;
        }
        if (i11 != 6) {
            throw null;
        }
        j2 j2Var = zzm;
        if (j2Var != null) {
            return j2Var;
        }
        synchronized (l9.class) {
            try {
                h1Var = zzm;
                if (h1Var == null) {
                    h1Var = new h1(zzl);
                    zzm = h1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return h1Var;
    }

    public final boolean u() {
        return this.zze;
    }

    public final boolean v() {
        return this.zzf;
    }

    public final boolean w() {
        return this.zzg;
    }

    public final boolean x() {
        return this.zzh;
    }

    public final boolean y() {
        return this.zzi;
    }

    public final boolean z() {
        return this.zzj;
    }
}
