package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class n9 extends i1 {
    private static final n9 zzi;
    private static volatile j2 zzj;
    private int zzb;
    private int zze;
    private ga zzf;
    private ga zzg;
    private boolean zzh;

    static {
        n9 n9Var = new n9();
        zzi = n9Var;
        i1.p(n9.class, n9Var);
    }

    public static m9 B() {
        return (m9) zzi.k();
    }

    public final boolean A() {
        return this.zzh;
    }

    public final /* synthetic */ void C(int i10) {
        this.zzb |= 1;
        this.zze = i10;
    }

    public final /* synthetic */ void D(ga gaVar) {
        this.zzf = gaVar;
        this.zzb |= 2;
    }

    public final /* synthetic */ void E(ga gaVar) {
        this.zzg = gaVar;
        this.zzb |= 4;
    }

    public final /* synthetic */ void F(boolean z10) {
        this.zzb |= 8;
        this.zzh = z10;
    }

    @Override // com.google.android.gms.internal.measurement.i1
    public final Object t(int i10) {
        j2 h1Var;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new n2(zzi, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new n9();
        }
        if (i11 == 4) {
            return new m9(zzi);
        }
        if (i11 == 5) {
            return zzi;
        }
        if (i11 != 6) {
            throw null;
        }
        j2 j2Var = zzj;
        if (j2Var != null) {
            return j2Var;
        }
        synchronized (n9.class) {
            try {
                h1Var = zzj;
                if (h1Var == null) {
                    h1Var = new h1(zzi);
                    zzj = h1Var;
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

    public final ga w() {
        ga gaVar = this.zzf;
        return gaVar == null ? ga.D() : gaVar;
    }

    public final boolean x() {
        return (this.zzb & 4) != 0;
    }

    public final ga y() {
        ga gaVar = this.zzg;
        return gaVar == null ? ga.D() : gaVar;
    }

    public final boolean z() {
        return (this.zzb & 8) != 0;
    }
}
