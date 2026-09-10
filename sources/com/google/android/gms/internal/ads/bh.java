package com.google.android.gms.internal.ads;

import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class bh extends ss1 {
    private static final bh zzj;
    private static volatile tt1 zzk;
    private int zza;
    private long zzc;
    private long zzf;
    private int zzh;
    private int zzi;
    private cs1 zzb = cs1.f13248b;
    private String zzd = "";
    private String zze = "";
    private String zzg = "";

    static {
        bh bhVar = new bh();
        zzj = bhVar;
        ss1.t(bh.class, bhVar);
    }

    public static ah z() {
        return (ah) zzj.q();
    }

    public final /* synthetic */ void A(cs1 cs1Var) {
        cs1Var.getClass();
        this.zza |= 1;
        this.zzb = cs1Var;
    }

    public final /* synthetic */ void B(long j10) {
        this.zza |= 2;
        this.zzc = j10;
    }

    public final /* synthetic */ void C(String str) {
        String str2 = Build.MODEL;
        str2.getClass();
        this.zza |= 4;
        this.zzd = str2;
    }

    public final /* synthetic */ void D(String str) {
        str.getClass();
        this.zza |= 8;
        this.zze = str;
    }

    public final /* synthetic */ void E(long j10) {
        this.zza |= 16;
        this.zzf = j10;
    }

    public final /* synthetic */ void F(String str) {
        str.getClass();
        this.zza |= 32;
        this.zzg = str;
    }

    public final /* synthetic */ void G(int i10) {
        this.zzh = 1;
        this.zza |= 64;
    }

    public final void H(int i10) {
        this.zzi = i10 - 2;
        this.zza |= 128;
    }

    @Override // com.google.android.gms.internal.ads.ss1
    public final Object v(int i10, ss1 ss1Var) {
        tt1 rs1Var;
        int iC = v0.i.c(i10);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new xt1(zzj, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ည\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဂ\u0004\u0006ဈ\u0005\u0007ဌ\u0006\bဌ\u0007", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (iC == 3) {
            return new bh();
        }
        if (iC == 4) {
            return new ah(zzj);
        }
        if (iC == 5) {
            return zzj;
        }
        if (iC != 6) {
            throw null;
        }
        tt1 tt1Var = zzk;
        if (tt1Var != null) {
            return tt1Var;
        }
        synchronized (bh.class) {
            try {
                rs1Var = zzk;
                if (rs1Var == null) {
                    rs1Var = new rs1(zzj);
                    zzk = rs1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return rs1Var;
    }
}
