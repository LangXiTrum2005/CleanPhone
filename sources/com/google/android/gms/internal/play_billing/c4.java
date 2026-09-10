package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class c4 extends t1 {
    private static final c4 zzb;
    private int zzd;
    private int zze;

    static {
        c4 c4Var = new c4();
        zzb = c4Var;
        t1.k(c4.class, c4Var);
    }

    public static c4 n() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.play_billing.t1
    public final Object d(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new r2(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", b1.f24229i});
        }
        if (i11 == 3) {
            return new c4();
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
