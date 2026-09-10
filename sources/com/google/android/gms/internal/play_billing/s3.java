package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class s3 extends t1 {
    private static final s3 zzb;
    private int zzd;
    private int zze;

    static {
        s3 s3Var = new s3();
        zzb = s3Var;
        t1.k(s3.class, s3Var);
    }

    public static /* synthetic */ void n(s3 s3Var, int i10) {
        s3Var.zze = i10 - 1;
        s3Var.zzd |= 1;
    }

    public static r3 o() {
        return (r3) zzb.f();
    }

    @Override // com.google.android.gms.internal.play_billing.t1
    public final Object d(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new r2(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", b1.f24227g});
        }
        if (i11 == 3) {
            return new s3();
        }
        if (i11 == 4) {
            return new r3(zzb);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
