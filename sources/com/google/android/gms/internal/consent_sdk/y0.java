package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class y0 extends w5 {
    private static final y0 zzb;
    private int zzd;
    private long zze;
    private long zzf;

    static {
        y0 y0Var = new y0();
        zzb = y0Var;
        w5.l(y0.class, y0Var);
    }

    @Override // com.google.android.gms.internal.consent_sdk.w5
    public final Object f(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new r6(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new y0();
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
