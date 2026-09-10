package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class x1 extends w5 {
    private static final x1 zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";

    static {
        x1 x1Var = new x1();
        zzb = x1Var;
        w5.l(x1.class, x1Var);
    }

    public static w1 m() {
        return (w1) zzb.g();
    }

    public static /* synthetic */ void n(x1 x1Var, String str) {
        str.getClass();
        x1Var.zzd |= 1;
        x1Var.zze = str;
    }

    public static /* synthetic */ void o(x1 x1Var, String str) {
        str.getClass();
        x1Var.zzd |= 2;
        x1Var.zzf = str;
    }

    @Override // com.google.android.gms.internal.consent_sdk.w5
    public final Object f(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new r6(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new x1();
        }
        if (i11 == 4) {
            return new w1(zzb);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
