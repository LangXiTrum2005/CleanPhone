package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class we1 extends ss1 {
    private static final we1 zzb;
    private static volatile tt1 zzc;
    private at1 zza = wt1.f21606e;

    static {
        we1 we1Var = new we1();
        zzb = we1Var;
        ss1.t(we1.class, we1Var);
    }

    public static te1 A() {
        return (te1) zzb.q();
    }

    public final void B(ve1 ve1Var) {
        at1 at1Var = this.zza;
        if (!((sr1) at1Var).f20043a) {
            int size = at1Var.size();
            this.zza = at1Var.e(size + size);
        }
        this.zza.add(ve1Var);
    }

    @Override // com.google.android.gms.internal.ads.ss1
    public final Object v(int i10, ss1 ss1Var) {
        tt1 rs1Var;
        int iC = v0.i.c(i10);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new xt1(zzb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zza", ve1.class});
        }
        if (iC == 3) {
            return new we1();
        }
        if (iC == 4) {
            return new te1(zzb);
        }
        if (iC == 5) {
            return zzb;
        }
        if (iC != 6) {
            throw null;
        }
        tt1 tt1Var = zzc;
        if (tt1Var != null) {
            return tt1Var;
        }
        synchronized (we1.class) {
            try {
                rs1Var = zzc;
                if (rs1Var == null) {
                    rs1Var = new rs1(zzb);
                    zzc = rs1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return rs1Var;
    }

    public final int z() {
        return this.zza.size();
    }
}
