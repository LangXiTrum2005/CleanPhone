package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class sj extends ss1 {
    private static final sj zzB;
    private static volatile tt1 zzC = null;
    public static final int zza = 7;
    public static final int zzb = 8;
    public static final int zzc = 9;
    public static final int zzd = 10;
    public static final int zze = 11;
    public static final int zzf = 12;
    public static final int zzg = 13;
    public static final int zzh = 14;
    public static final int zzi = 15;
    public static final int zzj = 16;
    public static final int zzk = 17;
    private at1 zzA;
    private int zzl;
    private int zzm;
    private int zzn = 1000;
    private el zzo;
    private gl zzp;
    private at1 zzu;
    private hl zzv;
    private bk zzw;
    private vj zzx;
    private pl zzy;
    private ql zzz;

    static {
        sj sjVar = new sj();
        zzB = sjVar;
        ss1.t(sj.class, sjVar);
    }

    public sj() {
        wt1 wt1Var = wt1.f21606e;
        this.zzu = wt1Var;
        this.zzA = wt1Var;
    }

    public static sj z() {
        return zzB;
    }

    public final void A(qj qjVar) {
        this.zzm = qjVar.f19106a;
        this.zzl |= 1;
    }

    public final void B(gl glVar) {
        this.zzp = glVar;
        this.zzl |= 8;
    }

    public final gl C() {
        gl glVar = this.zzp;
        return glVar == null ? gl.z() : glVar;
    }

    @Override // com.google.android.gms.internal.ads.ss1
    public final Object v(int i10, ss1 ss1Var) {
        tt1 rs1Var;
        int iC = v0.i.c(i10);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new xt1(zzB, "\u0004\u000b\u0000\u0001\u0007\u0011\u000b\u0000\u0002\u0000\u0007᠌\u0000\b᠌\u0001\tဉ\u0002\nဉ\u0003\u000b\u001b\fဉ\u0004\rဉ\u0005\u000eဉ\u0006\u000fဉ\u0007\u0010ဉ\b\u0011\u001b", new Object[]{"zzl", "zzm", nd.f17767p, "zzn", nd.f17775x, "zzo", "zzp", "zzu", dl.class, "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", ik.class});
        }
        if (iC == 3) {
            return new sj();
        }
        if (iC == 4) {
            return new rj(zzB);
        }
        if (iC == 5) {
            return zzB;
        }
        if (iC != 6) {
            throw null;
        }
        tt1 tt1Var = zzC;
        if (tt1Var != null) {
            return tt1Var;
        }
        synchronized (sj.class) {
            try {
                rs1Var = zzC;
                if (rs1Var == null) {
                    rs1Var = new rs1(zzB);
                    zzC = rs1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return rs1Var;
    }
}
