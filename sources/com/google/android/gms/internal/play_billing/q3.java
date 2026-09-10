package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class q3 extends t1 {
    private static final q3 zzb;
    private int zzd;
    private boolean zze;
    private boolean zzf;

    static {
        q3 q3Var = new q3();
        zzb = q3Var;
        t1.k(q3.class, q3Var);
    }

    @Override // com.google.android.gms.internal.play_billing.t1
    public final Object d(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new r2(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new q3();
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
