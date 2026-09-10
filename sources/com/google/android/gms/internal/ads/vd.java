package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class vd extends ss1 {
    private static final vd zzi;
    private static volatile tt1 zzj;
    private int zza;
    private long zzb;
    private long zzc;
    private int zzd;
    private long zzg;
    private String zze = "";
    private String zzf = "";
    private String zzh = "";

    static {
        vd vdVar = new vd();
        zzi = vdVar;
        ss1.t(vd.class, vdVar);
    }

    public static ud z() {
        return (ud) zzi.q();
    }

    public final /* synthetic */ void A(long j10) {
        this.zza |= 1;
        this.zzb = j10;
    }

    public final /* synthetic */ void B(long j10) {
        this.zza |= 2;
        this.zzc = j10;
    }

    public final /* synthetic */ void C(String str) {
        this.zza |= 8;
        this.zze = str;
    }

    public final /* synthetic */ void D(String str) {
        str.getClass();
        this.zza |= 16;
        this.zzf = str;
    }

    public final /* synthetic */ void E(long j10) {
        this.zza |= 32;
        this.zzg = j10;
    }

    public final /* synthetic */ void F(String str) {
        this.zza |= 64;
        this.zzh = str;
    }

    public final /* synthetic */ void G(int i10) {
        this.zzd = i10 - 1;
        this.zza |= 4;
    }

    @Override // com.google.android.gms.internal.ads.ss1
    public final Object v(int i10, ss1 ss1Var) {
        tt1 rs1Var;
        int iC = v0.i.c(i10);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new xt1(zzi, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003᠌\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဂ\u0005\u0007ဈ\u0006", new Object[]{"zza", "zzb", "zzc", "zzd", nd.f17757e, "zze", "zzf", "zzg", "zzh"});
        }
        if (iC == 3) {
            return new vd();
        }
        if (iC == 4) {
            return new ud(zzi);
        }
        if (iC == 5) {
            return zzi;
        }
        if (iC != 6) {
            throw null;
        }
        tt1 tt1Var = zzj;
        if (tt1Var != null) {
            return tt1Var;
        }
        synchronized (vd.class) {
            try {
                rs1Var = zzj;
                if (rs1Var == null) {
                    rs1Var = new rs1(zzi);
                    zzj = rs1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return rs1Var;
    }
}
