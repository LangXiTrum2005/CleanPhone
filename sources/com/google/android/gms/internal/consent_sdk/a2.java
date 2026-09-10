package com.google.android.gms.internal.consent_sdk;

import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class a2 extends w5 {
    private static final a2 zzb;
    private int zzd;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private int zzh;

    static {
        a2 a2Var = new a2();
        zzb = a2Var;
        w5.l(a2.class, a2Var);
    }

    public static z1 m() {
        return (z1) zzb.g();
    }

    public static /* synthetic */ void n(a2 a2Var, int i10) {
        a2Var.zzd |= 8;
        a2Var.zzh = i10;
    }

    public static /* synthetic */ void o(a2 a2Var) {
        String str = Build.MODEL;
        str.getClass();
        a2Var.zzd |= 4;
        a2Var.zzg = str;
    }

    public static /* synthetic */ void p(a2 a2Var) {
        String str = Build.VERSION.RELEASE;
        str.getClass();
        a2Var.zzd |= 2;
        a2Var.zzf = str;
    }

    public static /* synthetic */ void q(a2 a2Var) {
        a2Var.zze = 1;
        a2Var.zzd = 1 | a2Var.zzd;
    }

    @Override // com.google.android.gms.internal.consent_sdk.w5
    public final Object f(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new r6(zzb, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ለ\u0001\u0003ለ\u0002\u0004င\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new a2();
        }
        if (i11 == 4) {
            return new z1(zzb);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
