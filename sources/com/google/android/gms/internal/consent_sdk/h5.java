package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class h5 extends w5 {
    private static final h5 zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private y5 zzg = x5.f23267e;

    static {
        h5 h5Var = new h5();
        zzb = h5Var;
        w5.l(h5.class, h5Var);
    }

    @Override // com.google.android.gms.internal.consent_sdk.w5
    public final Object f(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            o4 o4Var = o4.f23142p;
            return new r6(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001င\u0000\u0002ࠬ\u0003᠌\u0001", new Object[]{"zzd", "zze", "zzg", o4Var, "zzf", o4Var});
        }
        if (i11 == 3) {
            return new h5();
        }
        if (i11 == 4) {
            return new g5(zzb);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
