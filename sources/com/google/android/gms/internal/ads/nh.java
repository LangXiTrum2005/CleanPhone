package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class nh extends ss1 {
    private static final nh zzg;
    private static volatile tt1 zzh;
    private int zza;
    private String zzb = "";
    private String zzc = "";
    private long zzd;
    private long zze;
    private long zzf;

    static {
        nh nhVar = new nh();
        zzg = nhVar;
        ss1.t(nh.class, nhVar);
    }

    public static nh E(as1 as1Var) {
        nh nhVar = zzg;
        ks1 ks1Var = ks1.f16518a;
        int i10 = tr1.f20473a;
        ss1 ss1VarM = ss1.m(nhVar, as1Var, ks1.f16519b);
        ss1.y(ss1VarM);
        return (nh) ss1VarM;
    }

    public static nh F(as1 as1Var, ks1 ks1Var) {
        return (nh) ss1.m(zzg, as1Var, ks1Var);
    }

    public static mh G() {
        return (mh) zzg.q();
    }

    public static nh H() {
        return zzg;
    }

    public final String A() {
        return this.zzc;
    }

    public final long B() {
        return this.zzd;
    }

    public final long C() {
        return this.zze;
    }

    public final long D() {
        return this.zzf;
    }

    public final /* synthetic */ void I(String str) {
        str.getClass();
        this.zza |= 1;
        this.zzb = str;
    }

    public final /* synthetic */ void J(String str) {
        str.getClass();
        this.zza |= 2;
        this.zzc = str;
    }

    public final /* synthetic */ void K(long j10) {
        this.zza |= 4;
        this.zzd = j10;
    }

    public final /* synthetic */ void L(long j10) {
        this.zza |= 8;
        this.zze = j10;
    }

    public final /* synthetic */ void M(long j10) {
        this.zza |= 16;
        this.zzf = j10;
    }

    @Override // com.google.android.gms.internal.ads.ss1
    public final Object v(int i10, ss1 ss1Var) {
        tt1 rs1Var;
        int iC = v0.i.c(i10);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new xt1(zzg, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဃ\u0002\u0004ဃ\u0003\u0005ဃ\u0004", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf"});
        }
        if (iC == 3) {
            return new nh();
        }
        if (iC == 4) {
            return new mh(zzg);
        }
        if (iC == 5) {
            return zzg;
        }
        if (iC != 6) {
            throw null;
        }
        tt1 tt1Var = zzh;
        if (tt1Var != null) {
            return tt1Var;
        }
        synchronized (nh.class) {
            try {
                rs1Var = zzh;
                if (rs1Var == null) {
                    rs1Var = new rs1(zzg);
                    zzh = rs1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return rs1Var;
    }

    public final String z() {
        return this.zzb;
    }
}
