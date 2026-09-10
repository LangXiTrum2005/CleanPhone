package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class c2 extends w5 {
    private static final c2 zzb;
    private int zzd;
    private int zze;
    private String zzf = "";
    private long zzg;

    static {
        c2 c2Var = new c2();
        zzb = c2Var;
        w5.l(c2.class, c2Var);
    }

    public static b2 m() {
        return (b2) zzb.g();
    }

    public static /* synthetic */ void n(c2 c2Var, String str) {
        c2Var.zzd |= 2;
        c2Var.zzf = str;
    }

    public static /* synthetic */ void o(c2 c2Var, long j10) {
        c2Var.zzd |= 4;
        c2Var.zzg = j10;
    }

    public static /* synthetic */ void p(c2 c2Var, int i10) {
        c2Var.zze = i10 - 2;
        c2Var.zzd |= 1;
    }

    @Override // com.google.android.gms.internal.consent_sdk.w5
    public final Object f(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new r6(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ለ\u0001\u0003ဂ\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new c2();
        }
        if (i11 == 4) {
            return new b2(zzb);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
