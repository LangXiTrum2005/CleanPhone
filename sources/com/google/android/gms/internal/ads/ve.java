package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ve extends ss1 {
    private static final ve zzf;
    private static volatile tt1 zzg;
    private int zza;
    private at1 zzb = wt1.f21606e;
    private cs1 zzc = cs1.f13248b;
    private int zzd = 1;
    private int zze = 1;

    static {
        ve veVar = new ve();
        zzf = veVar;
        ss1.t(ve.class, veVar);
    }

    public static ue z() {
        return (ue) zzf.q();
    }

    public final void A(cs1 cs1Var) {
        cs1Var.getClass();
        at1 at1Var = this.zzb;
        if (!((sr1) at1Var).f20043a) {
            int size = at1Var.size();
            this.zzb = at1Var.e(size + size);
        }
        this.zzb.add(cs1Var);
    }

    public final /* synthetic */ void B(cs1 cs1Var) {
        cs1Var.getClass();
        this.zza |= 1;
        this.zzc = cs1Var;
    }

    public final /* synthetic */ void C(int i10) {
        this.zzd = 4;
        this.zza |= 2;
    }

    public final /* synthetic */ void D(int i10) {
        this.zze = i10 - 1;
        this.zza |= 4;
    }

    @Override // com.google.android.gms.internal.ads.ss1
    public final Object v(int i10, ss1 ss1Var) {
        tt1 rs1Var;
        int iC = v0.i.c(i10);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new xt1(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001c\u0002ည\u0000\u0003᠌\u0001\u0004᠌\u0002", new Object[]{"zza", "zzb", "zzc", "zzd", nd.f17765n, "zze", nd.l});
        }
        if (iC == 3) {
            return new ve();
        }
        if (iC == 4) {
            return new ue(zzf);
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
        synchronized (ve.class) {
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
