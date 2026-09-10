package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class tk extends ss1 {
    public static final int zza = 1;
    private static final tk zzc;
    private static volatile tt1 zzd;
    private at1 zzb = wt1.f21606e;

    static {
        tk tkVar = new tk();
        zzc = tkVar;
        ss1.t(tk.class, tkVar);
    }

    public static ok z() {
        return (ok) zzc.q();
    }

    public final void A(nk nkVar) {
        at1 at1Var = this.zzb;
        if (!((sr1) at1Var).f20043a) {
            int size = at1Var.size();
            this.zzb = at1Var.e(size + size);
        }
        this.zzb.add(nkVar);
    }

    @Override // com.google.android.gms.internal.ads.ss1
    public final Object v(int i10, ss1 ss1Var) {
        tt1 rs1Var;
        int iC = v0.i.c(i10);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new xt1(zzc, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzb", nk.class});
        }
        if (iC == 3) {
            return new tk();
        }
        if (iC == 4) {
            return new ok(zzc);
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
        synchronized (tk.class) {
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
