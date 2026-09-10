package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class r2 extends w5 {
    private static final r2 zzb;
    private int zzd;
    private int zze;

    static {
        r2 r2Var = new r2();
        zzb = r2Var;
        w5.l(r2.class, r2Var);
    }

    @Override // com.google.android.gms.internal.consent_sdk.w5
    public final Object f(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new r6(zzb, "\u0004\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002᠌\u0000", new Object[]{"zzd", "zze", w0.f23245k});
        }
        if (i11 == 3) {
            return new r2();
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
