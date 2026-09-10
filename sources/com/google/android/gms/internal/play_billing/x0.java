package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class x0 extends t1 {
    private static final x0 zzb;
    private int zzd;
    private a1 zze;
    private a1 zzf;
    private int zzg;

    static {
        x0 x0Var = new x0();
        zzb = x0Var;
        t1.k(x0.class, x0Var);
    }

    @Override // com.google.android.gms.internal.play_billing.t1
    public final Object d(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new r2(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003᠌\u0002", new Object[]{"zzd", "zze", "zzf", "zzg", b1.f24222b});
        }
        if (i11 == 3) {
            return new x0();
        }
        if (i11 == 4) {
            return new w0(zzb);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
