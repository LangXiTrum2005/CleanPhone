package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class gl extends ss1 {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    public static final int zze = 5;
    private static final gl zzl;
    private static volatile tt1 zzm;
    private int zzf;
    private String zzg = "";
    private at1 zzh = wt1.f21606e;
    private int zzi = 1000;
    private int zzj = 1000;
    private int zzk = 1000;

    static {
        gl glVar = new gl();
        zzl = glVar;
        ss1.t(gl.class, glVar);
    }

    public static gl z() {
        return zzl;
    }

    public final void A(String str) {
        str.getClass();
        this.zzf |= 1;
        this.zzg = str;
    }

    @Override // com.google.android.gms.internal.ads.ss1
    public final Object v(int i10, ss1 ss1Var) {
        tt1 rs1Var;
        int iC = v0.i.c(i10);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            nd ndVar = nd.f17775x;
            return new xt1(zzl, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003᠌\u0001\u0004᠌\u0002\u0005᠌\u0003", new Object[]{"zzf", "zzg", "zzh", dl.class, "zzi", ndVar, "zzj", ndVar, "zzk", ndVar});
        }
        if (iC == 3) {
            return new gl();
        }
        if (iC == 4) {
            return new fl(zzl);
        }
        if (iC == 5) {
            return zzl;
        }
        if (iC != 6) {
            throw null;
        }
        tt1 tt1Var = zzm;
        if (tt1Var != null) {
            return tt1Var;
        }
        synchronized (gl.class) {
            try {
                rs1Var = zzm;
                if (rs1Var == null) {
                    rs1Var = new rs1(zzl);
                    zzm = rs1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return rs1Var;
    }
}
