package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class a5 extends w5 {
    private static final a5 zzb;
    private int zzd;
    private String zze = "";

    static {
        a5 a5Var = new a5();
        zzb = a5Var;
        w5.l(a5.class, a5Var);
    }

    @Override // com.google.android.gms.internal.consent_sdk.w5
    public final Object f(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new r6(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i11 == 3) {
            return new a5();
        }
        if (i11 == 4) {
            return new x3(zzb);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
