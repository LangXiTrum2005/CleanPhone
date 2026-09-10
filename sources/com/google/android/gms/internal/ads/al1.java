package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class al1 extends ss1 {
    private static final al1 zzd;
    private static volatile tt1 zze;
    private int zza;
    private el1 zzb;
    private qm1 zzc;

    static {
        al1 al1Var = new al1();
        zzd = al1Var;
        ss1.t(al1.class, al1Var);
    }

    public static al1 B(cs1 cs1Var, ks1 ks1Var) {
        return (al1) ss1.m(zzd, cs1Var, ks1Var);
    }

    public static zk1 C() {
        return (zk1) zzd.q();
    }

    public final qm1 A() {
        qm1 qm1Var = this.zzc;
        return qm1Var == null ? qm1.E() : qm1Var;
    }

    public final /* synthetic */ void D(el1 el1Var) {
        this.zzb = el1Var;
        this.zza |= 1;
    }

    public final /* synthetic */ void E(qm1 qm1Var) {
        this.zzc = qm1Var;
        this.zza |= 2;
    }

    @Override // com.google.android.gms.internal.ads.ss1
    public final Object v(int i10, ss1 ss1Var) {
        tt1 rs1Var;
        int iC = v0.i.c(i10);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new xt1(zzd, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iC == 3) {
            return new al1();
        }
        if (iC == 4) {
            return new zk1(zzd);
        }
        if (iC == 5) {
            return zzd;
        }
        if (iC != 6) {
            throw null;
        }
        tt1 tt1Var = zze;
        if (tt1Var != null) {
            return tt1Var;
        }
        synchronized (al1.class) {
            try {
                rs1Var = zze;
                if (rs1Var == null) {
                    rs1Var = new rs1(zzd);
                    zze = rs1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return rs1Var;
    }

    public final el1 z() {
        el1 el1Var = this.zzb;
        return el1Var == null ? el1.C() : el1Var;
    }
}
