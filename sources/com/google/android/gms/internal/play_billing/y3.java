package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class y3 extends t1 {
    private static final y3 zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private p3 zzg;
    private q3 zzh;

    static {
        y3 y3Var = new y3();
        zzb = y3Var;
        t1.k(y3.class, y3Var);
    }

    public static /* synthetic */ void n(y3 y3Var, f3 f3Var) {
        y3Var.zzf = f3Var;
        y3Var.zze = 2;
    }

    public static /* synthetic */ void o(y3 y3Var, h3 h3Var) {
        y3Var.zzf = h3Var;
        y3Var.zze = 3;
    }

    public static /* synthetic */ void p(y3 y3Var, l3 l3Var) {
        l3Var.getClass();
        y3Var.zzf = l3Var;
        y3Var.zze = 7;
    }

    public static /* synthetic */ void q(y3 y3Var, p3 p3Var) {
        p3Var.getClass();
        y3Var.zzg = p3Var;
        y3Var.zzd |= 1;
    }

    public static /* synthetic */ void r(y3 y3Var, b4 b4Var) {
        y3Var.zzf = b4Var;
        y3Var.zze = 8;
    }

    public static /* synthetic */ void s(y3 y3Var, c4 c4Var) {
        y3Var.zzf = c4Var;
        y3Var.zze = 4;
    }

    public static x3 t() {
        return (x3) zzb.f();
    }

    @Override // com.google.android.gms.internal.play_billing.t1
    public final Object d(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new r2(zzb, "\u0004\b\u0001\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဉ\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006ဉ\u0001\u0007<\u0000\b<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", f3.class, h3.class, c4.class, n3.class, "zzh", l3.class, b4.class});
        }
        if (i11 == 3) {
            return new y3();
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
