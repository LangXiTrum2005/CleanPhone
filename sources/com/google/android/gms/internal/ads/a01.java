package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class a01 extends ss1 {
    private static final a01 zzf;
    private static volatile tt1 zzg;
    private int zza;
    private int zzb;
    private String zzc = "";
    private String zzd = "";
    private yz0 zze;

    static {
        a01 a01Var = new a01();
        zzf = a01Var;
        ss1.t(a01.class, a01Var);
    }

    public static zz0 z() {
        return (zz0) zzf.q();
    }

    public final /* synthetic */ void A(String str) {
        str.getClass();
        this.zza |= 2;
        this.zzc = str;
    }

    public final /* synthetic */ void B(yz0 yz0Var) {
        this.zze = yz0Var;
        this.zza |= 8;
    }

    public final /* synthetic */ void C(int i10) {
        this.zzb = 1;
        this.zza = 1 | this.zza;
    }

    @Override // com.google.android.gms.internal.ads.ss1
    public final Object v(int i10, ss1 ss1Var) {
        tt1 rs1Var;
        int iC = v0.i.c(i10);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new xt1(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဉ\u0003", new Object[]{"zza", "zzb", nd.f17777z, "zzc", "zzd", "zze"});
        }
        if (iC == 3) {
            return new a01();
        }
        if (iC == 4) {
            return new zz0(zzf);
        }
        if (iC == 5) {
            return zzf;
        }
        if (iC != 6) {
            throw null;
        }
        tt1 tt1Var = zzg;
        if (tt1Var != null) {
            return tt1Var;
        }
        synchronized (a01.class) {
            try {
                rs1Var = zzg;
                if (rs1Var == null) {
                    rs1Var = new rs1(zzf);
                    zzg = rs1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return rs1Var;
    }
}
