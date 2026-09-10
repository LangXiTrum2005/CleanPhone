package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class rw0 extends ss1 {
    private static final rw0 zzd;
    private static volatile tt1 zze;
    private int zza;
    private at1 zzb = wt1.f21606e;
    private uu1 zzc;

    static {
        rw0 rw0Var = new rw0();
        zzd = rw0Var;
        ss1.t(rw0.class, rw0Var);
    }

    public static ow0 A() {
        return (ow0) zzd.q();
    }

    public final void B(qw0 qw0Var) {
        at1 at1Var = this.zzb;
        if (!((sr1) at1Var).f20043a) {
            int size = at1Var.size();
            this.zzb = at1Var.e(size + size);
        }
        this.zzb.add(qw0Var);
    }

    public final void C() {
        this.zzb = wt1.f21606e;
    }

    @Override // com.google.android.gms.internal.ads.ss1
    public final Object v(int i10, ss1 ss1Var) {
        tt1 rs1Var;
        int iC = v0.i.c(i10);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new xt1(zzd, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zza", "zzb", qw0.class, "zzc"});
        }
        if (iC == 3) {
            return new rw0();
        }
        if (iC == 4) {
            return new ow0(zzd);
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
        synchronized (rw0.class) {
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

    public final int z() {
        return this.zzb.size();
    }
}
