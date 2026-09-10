package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class b4 extends t1 {
    private static final b4 zzb;
    private int zzd;
    private k3 zze;
    private long zzf;

    static {
        b4 b4Var = new b4();
        zzb = b4Var;
        t1.k(b4.class, b4Var);
    }

    public static /* synthetic */ void n(b4 b4Var, k3 k3Var) {
        b4Var.zze = k3Var;
        b4Var.zzd |= 1;
    }

    public static /* synthetic */ void o(b4 b4Var, long j10) {
        b4Var.zzd |= 2;
        b4Var.zzf = j10;
    }

    public static a4 p() {
        return (a4) zzb.f();
    }

    @Override // com.google.android.gms.internal.play_billing.t1
    public final Object d(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new r2(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဂ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new b4();
        }
        if (i11 == 4) {
            return new a4(zzb);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
