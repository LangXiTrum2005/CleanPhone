package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class n3 extends t1 {
    private static final n3 zzb;
    private int zzd;
    private int zzf;
    private k3 zzi;
    private boolean zzj;
    private boolean zzk;
    private String zze = "";
    private x1 zzg = u1.f24482e;
    private y1 zzh = q2.f24453e;

    static {
        n3 n3Var = new n3();
        zzb = n3Var;
        t1.k(n3.class, n3Var);
    }

    @Override // com.google.android.gms.internal.play_billing.t1
    public final Object d(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new r2(zzb, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0002\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003ࠬ\u0004\u001b\u0005ဉ\u0002\u0006ဇ\u0003\u0007ဇ\u0004", new Object[]{"zzd", "zze", "zzf", b1.f24226f, "zzg", b1.f24225e, "zzh", z3.class, "zzi", "zzj", "zzk"});
        }
        if (i11 == 3) {
            return new n3();
        }
        if (i11 == 4) {
            return new w0(zzb);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
