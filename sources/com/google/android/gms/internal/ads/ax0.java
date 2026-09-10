package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ax0 extends ss1 {
    private static final ax0 zzc;
    private static volatile tt1 zzd;
    private at1 zza = wt1.f21606e;
    private long zzb;

    static {
        ax0 ax0Var = new ax0();
        zzc = ax0Var;
        ss1.t(ax0.class, ax0Var);
    }

    public static zw0 z() {
        return (zw0) zzc.q();
    }

    public final void A(dw0 dw0Var) {
        at1 at1Var = this.zza;
        if (!((sr1) at1Var).f20043a) {
            int size = at1Var.size();
            this.zza = at1Var.e(size + size);
        }
        this.zza.add(dw0Var);
    }

    public final /* synthetic */ void B(long j10) {
        this.zzb = j10;
    }

    @Override // com.google.android.gms.internal.ads.ss1
    public final Object v(int i10, ss1 ss1Var) {
        tt1 rs1Var;
        int iC = v0.i.c(i10);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new xt1(zzc, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u0002", new Object[]{"zza", dw0.class, "zzb"});
        }
        if (iC == 3) {
            return new ax0();
        }
        if (iC == 4) {
            return new zw0(zzc);
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
        synchronized (ax0.class) {
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
