package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class c11 extends ss1 {
    private static final c11 zzn;
    private static volatile tt1 zzo;
    private int zza;
    private String zzb = "";
    private long zzc;
    private int zzd;
    private boolean zze;
    private boolean zzf;
    private long zzg;
    private long zzh;
    private long zzi;
    private long zzj;
    private zs1 zzk;
    private zs1 zzl;
    private zs1 zzm;

    static {
        c11 c11Var = new c11();
        zzn = c11Var;
        ss1.t(c11.class, c11Var);
    }

    public c11() {
        jt1 jt1Var = jt1.f16181e;
        this.zzk = jt1Var;
        this.zzl = jt1Var;
        this.zzm = jt1Var;
    }

    public static c11 Q() {
        return zzn;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A(long j10) {
        zs1 zs1Var = this.zzm;
        if (!((sr1) zs1Var).f20043a) {
            this.zzm = ss1.k(zs1Var);
        }
        ((jt1) this.zzm).m(j10);
    }

    public final void B() {
        this.zzm = jt1.f16181e;
    }

    public final String C() {
        return this.zzb;
    }

    public final long D() {
        return this.zzc;
    }

    public final int E() {
        return this.zzd;
    }

    public final boolean F() {
        return this.zze;
    }

    public final boolean G() {
        return this.zzf;
    }

    public final long H() {
        return this.zzg;
    }

    public final long I() {
        return this.zzh;
    }

    public final long J() {
        return this.zzi;
    }

    public final boolean K() {
        return (this.zza & 64) != 0;
    }

    public final zs1 L() {
        return this.zzk;
    }

    public final int M() {
        return this.zzk.size();
    }

    public final int N() {
        return this.zzl.size();
    }

    public final zs1 O() {
        return this.zzm;
    }

    public final int P() {
        return this.zzm.size();
    }

    public final /* synthetic */ void R(String str) {
        str.getClass();
        this.zzb = str;
    }

    public final /* synthetic */ void S(long j10) {
        this.zza |= 1;
        this.zzc = j10;
    }

    public final /* synthetic */ void T(int i10) {
        this.zza |= 2;
        this.zzd = i10;
    }

    public final /* synthetic */ void U() {
        this.zza |= 4;
        this.zze = true;
    }

    public final /* synthetic */ void V(boolean z10) {
        this.zza |= 8;
        this.zzf = true;
    }

    public final /* synthetic */ void W(long j10) {
        this.zza |= 16;
        this.zzg = j10;
    }

    public final /* synthetic */ void X(long j10) {
        this.zzh = j10;
    }

    public final /* synthetic */ void Y(long j10) {
        this.zza |= 32;
        this.zzi = j10;
    }

    public final /* synthetic */ void Z(long j10) {
        this.zza |= 64;
        this.zzj = j10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a0(long j10) {
        zs1 zs1Var = this.zzk;
        if (!((sr1) zs1Var).f20043a) {
            this.zzk = ss1.k(zs1Var);
        }
        ((jt1) this.zzk).m(j10);
    }

    @Override // com.google.android.gms.internal.ads.ss1
    public final Object v(int i10, ss1 ss1Var) {
        tt1 rs1Var;
        int iC = v0.i.c(i10);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new xt1(zzn, "\u0004\f\u0000\u0001\u0001\f\f\u0000\u0003\u0000\u0001Ȉ\u0002ဂ\u0000\u0003င\u0001\u0004ဇ\u0002\u0005ဇ\u0003\u0006ဂ\u0004\u0007\u0002\bဂ\u0005\tဂ\u0006\n%\u000b%\f%", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm"});
        }
        if (iC == 3) {
            return new c11();
        }
        if (iC == 4) {
            return new b11(zzn);
        }
        if (iC == 5) {
            return zzn;
        }
        if (iC != 6) {
            throw null;
        }
        tt1 tt1Var = zzo;
        if (tt1Var != null) {
            return tt1Var;
        }
        synchronized (c11.class) {
            try {
                rs1Var = zzo;
                if (rs1Var == null) {
                    rs1Var = new rs1(zzn);
                    zzo = rs1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return rs1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void z(long j10) {
        zs1 zs1Var = this.zzl;
        if (!((sr1) zs1Var).f20043a) {
            this.zzl = ss1.k(zs1Var);
        }
        ((jt1) this.zzl).m(j10);
    }
}
