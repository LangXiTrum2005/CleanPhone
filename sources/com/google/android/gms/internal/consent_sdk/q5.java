package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class q5 extends w5 {
    private static final q5 zzb;
    private long zzd;
    private int zze;

    static {
        q5 q5Var = new q5();
        zzb = q5Var;
        w5.l(q5.class, q5Var);
    }

    @Override // com.google.android.gms.internal.consent_sdk.w5
    public final Object f(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new r6(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", new Object[]{"zzd", "zze"});
        }
        if (i11 == 3) {
            return new q5();
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
