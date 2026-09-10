package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class w3 extends t1 {
    private static final w3 zzb;
    private int zzd;
    private y1 zze = q2.f24453e;
    private String zzf = "";
    private boolean zzg;

    static {
        w3 w3Var = new w3();
        zzb = w3Var;
        t1.k(w3.class, w3Var);
    }

    public static /* synthetic */ void n(w3 w3Var, boolean z10) {
        w3Var.zzd |= 2;
        w3Var.zzg = z10;
    }

    public static w3 o() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.play_billing.t1
    public final Object d(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new r2(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဇ\u0001", new Object[]{"zzd", "zze", v3.class, "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new w3();
        }
        if (i11 == 4) {
            return new u3(zzb);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
