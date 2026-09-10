package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ve1 extends ss1 {
    private static final ve1 zzf;
    private static volatile tt1 zzg;
    private int zza;
    private se1 zzb;
    private gu1 zzc;
    private at1 zzd = wt1.f21606e;
    private zs1 zze = jt1.f16181e;

    static {
        ve1 ve1Var = new ve1();
        zzf = ve1Var;
        ss1.t(ve1.class, ve1Var);
    }

    public static ue1 z() {
        return (ue1) zzf.q();
    }

    public final /* synthetic */ void A(se1 se1Var) {
        this.zzb = se1Var;
        this.zza |= 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void B(ArrayDeque arrayDeque) {
        zs1 zs1Var = this.zze;
        if (!((sr1) zs1Var).f20043a) {
            this.zze = ss1.k(zs1Var);
        }
        rr1.e(arrayDeque, this.zze);
    }

    @Override // com.google.android.gms.internal.ads.ss1
    public final Object v(int i10, ss1 ss1Var) {
        tt1 rs1Var;
        int iC = v0.i.c(i10);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new xt1(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u001b\u0004%", new Object[]{"zza", "zzb", "zzc", "zzd", gu1.class, "zze"});
        }
        if (iC == 3) {
            return new ve1();
        }
        if (iC == 4) {
            return new ue1(zzf);
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
        synchronized (ve1.class) {
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
