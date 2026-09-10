package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class el1 extends ss1 {
    private static final el1 zzd;
    private static volatile tt1 zze;
    private int zza;
    private gl1 zzb;
    private int zzc;

    static {
        el1 el1Var = new el1();
        zzd = el1Var;
        ss1.t(el1.class, el1Var);
    }

    public static dl1 B() {
        return (dl1) zzd.q();
    }

    public static el1 C() {
        return zzd;
    }

    public final int A() {
        return this.zzc;
    }

    public final /* synthetic */ void D(gl1 gl1Var) {
        this.zzb = gl1Var;
        this.zza |= 1;
    }

    public final /* synthetic */ void E(int i10) {
        this.zzc = i10;
    }

    @Override // com.google.android.gms.internal.ads.ss1
    public final Object v(int i10, ss1 ss1Var) {
        tt1 rs1Var;
        int iC = v0.i.c(i10);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new xt1(zzd, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iC == 3) {
            return new el1();
        }
        if (iC == 4) {
            return new dl1(zzd);
        }
        if (iC == 5) {
            return zzd;
        }
        if (iC != 6) {
            throw null;
        }
        tt1 tt1Var = zze;
        if (tt1Var != null) {
            return tt1Var;
        }
        synchronized (el1.class) {
            try {
                rs1Var = zze;
                if (rs1Var == null) {
                    rs1Var = new rs1(zzd);
                    zze = rs1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return rs1Var;
    }

    public final gl1 z() {
        gl1 gl1Var = this.zzb;
        return gl1Var == null ? gl1.B() : gl1Var;
    }
}
