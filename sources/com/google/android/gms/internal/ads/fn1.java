package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class fn1 extends ss1 {
    private static final fn1 zzc;
    private static volatile tt1 zzd;
    private int zza;
    private at1 zzb = wt1.f21606e;

    static {
        fn1 fn1Var = new fn1();
        zzc = fn1Var;
        ss1.t(fn1.class, fn1Var);
    }

    public static cn1 z() {
        return (cn1) zzc.q();
    }

    public final /* synthetic */ void A(int i10) {
        this.zza = i10;
    }

    public final void B(en1 en1Var) {
        at1 at1Var = this.zzb;
        if (!((sr1) at1Var).f20043a) {
            int size = at1Var.size();
            this.zzb = at1Var.e(size + size);
        }
        this.zzb.add(en1Var);
    }

    @Override // com.google.android.gms.internal.ads.ss1
    public final Object v(int i10, ss1 ss1Var) {
        tt1 rs1Var;
        int iC = v0.i.c(i10);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new xt1(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zza", "zzb", en1.class});
        }
        if (iC == 3) {
            return new fn1();
        }
        if (iC == 4) {
            return new cn1(zzc);
        }
        if (iC == 5) {
            return zzc;
        }
        if (iC != 6) {
            throw null;
        }
        tt1 tt1Var = zzd;
        if (tt1Var != null) {
            return tt1Var;
        }
        synchronized (fn1.class) {
            try {
                rs1Var = zzd;
                if (rs1Var == null) {
                    rs1Var = new rs1(zzc);
                    zzd = rs1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return rs1Var;
    }
}
