package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class uw0 extends ss1 {
    private static final uw0 zzi;
    private static volatile tt1 zzj;
    private long zzb;
    private long zzc;
    private boolean zzd;
    private long zze;
    private long zzf;
    private int zzh;
    private String zza = "";
    private String zzg = "";

    static {
        uw0 uw0Var = new uw0();
        zzi = uw0Var;
        ss1.t(uw0.class, uw0Var);
    }

    public static tw0 z() {
        return (tw0) zzi.q();
    }

    public final /* synthetic */ void A(String str) {
        str.getClass();
        this.zza = str;
    }

    public final /* synthetic */ void B(long j10) {
        this.zzb = j10;
    }

    public final /* synthetic */ void C(long j10) {
        this.zzc = j10;
    }

    public final /* synthetic */ void D(boolean z10) {
        this.zzd = z10;
    }

    public final /* synthetic */ void E(long j10) {
        this.zze = j10;
    }

    public final /* synthetic */ void F(long j10) {
        this.zzf = j10;
    }

    public final /* synthetic */ void G(String str) {
        str.getClass();
        this.zzg = str;
    }

    public final /* synthetic */ void H(int i10) {
        this.zzh = i10 - 2;
    }

    @Override // com.google.android.gms.internal.ads.ss1
    public final Object v(int i10, ss1 ss1Var) {
        tt1 rs1Var;
        int iC = v0.i.c(i10);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new xt1(zzi, "\u0004\b\u0000\u0000\u0001\b\b\u0000\u0000\u0000\u0001Ȉ\u0002\u0002\u0003\u0002\u0004\u0007\u0005\u0002\u0006\u0002\u0007Ȉ\b\f", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (iC == 3) {
            return new uw0();
        }
        if (iC == 4) {
            return new tw0(zzi);
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
        synchronized (uw0.class) {
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
