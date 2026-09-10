package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class f2 extends w5 {
    private static final f2 zzb;
    private int zzd;
    private String zze = "";

    static {
        f2 f2Var = new f2();
        zzb = f2Var;
        w5.l(f2.class, f2Var);
    }

    public static d2 m() {
        return (d2) zzb.g();
    }

    public static /* synthetic */ void n(f2 f2Var) {
        f2Var.zzd |= 1;
        f2Var.zze = "4.0.0";
    }

    @Override // com.google.android.gms.internal.consent_sdk.w5
    public final Object f(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new r6(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ለ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i11 == 3) {
            return new f2();
        }
        if (i11 == 4) {
            return new d2(zzb);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
