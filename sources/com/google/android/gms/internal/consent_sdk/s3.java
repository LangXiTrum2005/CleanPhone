package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class s3 extends w5 {
    private static final s3 zzb;
    private int zzd;
    private boolean zze;
    private boolean zzf;

    static {
        s3 s3Var = new s3();
        zzb = s3Var;
        w5.l(s3.class, s3Var);
    }

    @Override // com.google.android.gms.internal.consent_sdk.w5
    public final Object f(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new r6(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new s3();
        }
        if (i11 == 4) {
            return new m2(zzb);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
