package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class c5 extends w5 {
    private static final c5 zzb;
    private int zzd;
    private z5 zze = q6.f23172e;
    private w6 zzf;

    static {
        c5 c5Var = new c5();
        zzb = c5Var;
        w5.l(c5.class, c5Var);
    }

    @Override // com.google.android.gms.internal.consent_sdk.w5
    public final Object f(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new r6(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zzd", "zze", b5.class, "zzf"});
        }
        if (i11 == 3) {
            return new c5();
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
