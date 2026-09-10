package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class nv1 extends ss1 {
    private static final nv1 zzh;
    private static volatile tt1 zzi;
    private int zza;
    private mv1 zzb;
    private cs1 zzd;
    private cs1 zze;
    private int zzf;
    private byte zzg = 2;
    private at1 zzc = wt1.f21606e;

    static {
        nv1 nv1Var = new nv1();
        zzh = nv1Var;
        ss1.t(nv1.class, nv1Var);
    }

    public nv1() {
        as1 as1Var = cs1.f13248b;
        this.zzd = as1Var;
        this.zze = as1Var;
    }

    public static lv1 z() {
        return (lv1) zzh.q();
    }

    public final void A(kv1 kv1Var) {
        at1 at1Var = this.zzc;
        if (!((sr1) at1Var).f20043a) {
            int size = at1Var.size();
            this.zzc = at1Var.e(size + size);
        }
        this.zzc.add(kv1Var);
    }

    @Override // com.google.android.gms.internal.ads.ss1
    public final Object v(int i10, ss1 ss1Var) {
        tt1 rs1Var;
        switch (v0.i.c(i10)) {
            case 0:
                return Byte.valueOf(this.zzg);
            case 1:
                this.zzg = ss1Var == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return new xt1(zzh, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003", new Object[]{"zza", "zzb", "zzc", kv1.class, "zzd", "zze", "zzf"});
            case 3:
                return new nv1();
            case 4:
                return new lv1(zzh);
            case 5:
                return zzh;
            case 6:
                tt1 tt1Var = zzi;
                if (tt1Var != null) {
                    return tt1Var;
                }
                synchronized (nv1.class) {
                    try {
                        rs1Var = zzi;
                        if (rs1Var == null) {
                            rs1Var = new rs1(zzh);
                            zzi = rs1Var;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                return rs1Var;
            default:
                throw null;
        }
    }
}
