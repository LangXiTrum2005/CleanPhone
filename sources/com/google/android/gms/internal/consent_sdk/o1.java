package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class o1 extends w5 {
    private static final o1 zzb;

    static {
        o1 o1Var = new o1();
        zzb = o1Var;
        w5.l(o1.class, o1Var);
    }

    @Override // com.google.android.gms.internal.consent_sdk.w5
    public final Object f(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new r6(zzb, "\u0004\u0000", null);
        }
        if (i11 == 3) {
            return new o1();
        }
        if (i11 == 4) {
            return new x0(zzb);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
