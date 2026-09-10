package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class kv1 extends ss1 {
    private static final kv1 zze;
    private static volatile tt1 zzf;
    private int zza;
    private cs1 zzb;
    private cs1 zzc;
    private byte zzd = 2;

    static {
        kv1 kv1Var = new kv1();
        zze = kv1Var;
        ss1.t(kv1.class, kv1Var);
    }

    public kv1() {
        as1 as1Var = cs1.f13248b;
        this.zzb = as1Var;
        this.zzc = as1Var;
    }

    public static jv1 z() {
        return (jv1) zze.q();
    }

    public final /* synthetic */ void A(as1 as1Var) {
        as1Var.getClass();
        this.zza |= 1;
        this.zzb = as1Var;
    }

    public final /* synthetic */ void B(cs1 cs1Var) {
        cs1Var.getClass();
        this.zza |= 2;
        this.zzc = cs1Var;
    }

    @Override // com.google.android.gms.internal.ads.ss1
    public final Object v(int i10, ss1 ss1Var) {
        tt1 rs1Var;
        switch (v0.i.c(i10)) {
            case 0:
                return Byte.valueOf(this.zzd);
            case 1:
                this.zzd = ss1Var == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return new xt1(zze, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᔊ\u0000\u0002ည\u0001", new Object[]{"zza", "zzb", "zzc"});
            case 3:
                return new kv1();
            case 4:
                return new jv1(zze);
            case 5:
                return zze;
            case 6:
                tt1 tt1Var = zzf;
                if (tt1Var != null) {
                    return tt1Var;
                }
                synchronized (kv1.class) {
                    try {
                        rs1Var = zzf;
                        if (rs1Var == null) {
                            rs1Var = new rs1(zze);
                            zzf = rs1Var;
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
