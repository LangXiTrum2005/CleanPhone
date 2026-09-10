package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class nk extends ss1 {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    private static final nk zzh;
    private static volatile tt1 zzi;
    private int zzd;
    private int zze;
    private qk zzf;
    private sk zzg;

    static {
        nk nkVar = new nk();
        zzh = nkVar;
        ss1.t(nk.class, nkVar);
    }

    public static mk A() {
        return (mk) zzh.q();
    }

    public final void B() {
        this.zze = v0.i.c(2);
        this.zzd |= 1;
    }

    public final void C(qk qkVar) {
        qkVar.getClass();
        this.zzf = qkVar;
        this.zzd |= 2;
    }

    @Override // com.google.android.gms.internal.ads.ss1
    public final Object v(int i10, ss1 ss1Var) {
        tt1 rs1Var;
        int iC = v0.i.c(i10);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new xt1(zzh, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzd", "zze", nd.f17772u, "zzf", "zzg"});
        }
        if (iC == 3) {
            return new nk();
        }
        if (iC == 4) {
            return new mk(zzh);
        }
        if (iC == 5) {
            return zzh;
        }
        if (iC != 6) {
            throw null;
        }
        tt1 tt1Var = zzi;
        if (tt1Var != null) {
            return tt1Var;
        }
        synchronized (nk.class) {
            try {
                rs1Var = zzi;
                if (rs1Var == null) {
                    rs1Var = new rs1(zzh);
                    zzi = rs1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return rs1Var;
    }

    public final void z(sk skVar) {
        this.zzg = skVar;
        this.zzd |= 4;
    }
}
