package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class rw1 extends ss1 {
    private static final rw1 zzl;
    private static volatile tt1 zzm;
    private int zza;
    private cs1 zzb = cs1.f13248b;
    private ws1 zzc;
    private long zzd;
    private ws1 zze;
    private at1 zzf;
    private String zzg;
    private at1 zzh;
    private sw1 zzi;
    private uw1 zzj;
    private ar1 zzk;

    static {
        rw1 rw1Var = new rw1();
        zzl = rw1Var;
        ss1.t(rw1.class, rw1Var);
    }

    public rw1() {
        ts1 ts1Var = ts1.f20489e;
        this.zzc = ts1Var;
        this.zze = ts1Var;
        wt1 wt1Var = wt1.f21606e;
        this.zzf = wt1Var;
        this.zzg = "";
        this.zzh = wt1Var;
    }

    public static rw1 z(byte[] bArr, ks1 ks1Var) throws et1 {
        ss1 ss1VarX = ss1.x(zzl, bArr, bArr.length, ks1Var);
        ss1.y(ss1VarX);
        return (rw1) ss1VarX;
    }

    @Override // com.google.android.gms.internal.ads.ss1
    public final Object v(int i10, ss1 ss1Var) {
        tt1 rs1Var;
        int iC = v0.i.c(i10);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new xt1(zzl, "\u0001\n\u0000\u0001\u0001\u000f\n\u0000\u0004\u0000\u0001'\u0002ဂ\u0001\u0003'\u0004\u001b\u0005ဉ\u0003\u0007ဈ\u0002\tဉ\u0004\n\u001a\rည\u0000\u000fဉ\u0005", new Object[]{"zza", "zzc", "zzd", "zze", "zzh", nw1.class, "zzi", "zzg", "zzj", "zzf", "zzb", "zzk"});
        }
        if (iC == 3) {
            return new rw1();
        }
        if (iC == 4) {
            return new fu1(zzl);
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
        synchronized (rw1.class) {
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
