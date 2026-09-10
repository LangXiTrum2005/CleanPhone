package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class j3 extends w5 {
    private static final j3 zzb;
    private int zzd;
    private int zze;
    private i3 zzf;

    static {
        j3 j3Var = new j3();
        zzb = j3Var;
        w5.l(j3.class, j3Var);
    }

    @Override // com.google.android.gms.internal.consent_sdk.w5
    public final Object f(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new r6(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001", new Object[]{"zzd", "zze", w0.f23257x, "zzf"});
        }
        if (i11 == 3) {
            return new j3();
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
