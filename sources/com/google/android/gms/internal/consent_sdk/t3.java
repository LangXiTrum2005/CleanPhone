package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class t3 extends w5 {
    private static final t3 zzb;
    private y5 zzd = x5.f23267e;

    static {
        t3 t3Var = new t3();
        zzb = t3Var;
        w5.l(t3.class, t3Var);
    }

    @Override // com.google.android.gms.internal.consent_sdk.w5
    public final Object f(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new r6(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001ࠬ", new Object[]{"zzd", w0.A});
        }
        if (i11 == 3) {
            return new t3();
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
