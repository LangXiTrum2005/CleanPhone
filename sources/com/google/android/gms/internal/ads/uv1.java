package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class uv1 extends ss1 {
    private static final uv1 zzf;
    private static volatile tt1 zzg;
    private int zza;
    private int zzb;
    private String zzc = "";
    private cs1 zzd;
    private cs1 zze;

    static {
        uv1 uv1Var = new uv1();
        zzf = uv1Var;
        ss1.t(uv1.class, uv1Var);
    }

    public uv1() {
        as1 as1Var = cs1.f13248b;
        this.zzd = as1Var;
        this.zze = as1Var;
    }

    public static tv1 z() {
        return (tv1) zzf.q();
    }

    public final /* synthetic */ void A(String str) {
        this.zza |= 2;
        this.zzc = "image/png";
    }

    public final /* synthetic */ void B(cs1 cs1Var) {
        cs1Var.getClass();
        this.zza |= 4;
        this.zzd = cs1Var;
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
            return new xt1(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"zza", "zzb", bv1.f12905j, "zzc", "zzd", "zze"});
        }
        if (iC == 3) {
            return new uv1();
        }
        if (iC == 4) {
            return new tv1(zzf);
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
        synchronized (uv1.class) {
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
