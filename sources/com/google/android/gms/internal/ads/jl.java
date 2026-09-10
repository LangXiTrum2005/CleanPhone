package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class jl extends ss1 {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    public static final int zze = 5;
    public static final int zzf = 6;
    public static final int zzg = 7;
    public static final int zzh = 8;
    private static final jl zzv;
    private static volatile tt1 zzw;
    private int zzi;
    private fk zzk;
    private int zzl;
    private hk zzm;
    private int zzn;
    private String zzj = "";
    private int zzo = 1000;
    private int zzp = 1000;
    private int zzu = 1000;

    static {
        jl jlVar = new jl();
        zzv = jlVar;
        ss1.t(jl.class, jlVar);
    }

    public static jl z() {
        return zzv;
    }

    public final void A(String str) {
        this.zzi |= 1;
        this.zzj = str;
    }

    public final void B(hk hkVar) {
        this.zzm = hkVar;
        this.zzi |= 8;
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
            return new xt1(zzv, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003င\u0002\u0004ဉ\u0003\u0005င\u0004\u0006᠌\u0005\u0007᠌\u0006\b᠌\u0007", new Object[]{"zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", ndVar, "zzp", ndVar, "zzu", ndVar});
        }
        if (iC == 3) {
            return new jl();
        }
        if (iC == 4) {
            return new il(zzv);
        }
        if (iC == 5) {
            return zzv;
        }
        if (iC != 6) {
            throw null;
        }
        tt1 tt1Var = zzw;
        if (tt1Var != null) {
            return tt1Var;
        }
        synchronized (jl.class) {
            try {
                rs1Var = zzw;
                if (rs1Var == null) {
                    rs1Var = new rs1(zzv);
                    zzw = rs1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return rs1Var;
    }
}
