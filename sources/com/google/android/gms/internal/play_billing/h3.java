package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class h3 extends t1 {
    private static final h3 zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private int zzg;
    private int zzh;

    static {
        h3 h3Var = new h3();
        zzb = h3Var;
        t1.k(h3.class, h3Var);
    }

    public static void o(h3 h3Var, m3 m3Var) {
        h3Var.zzh = m3Var.f24425a;
        h3Var.zzd |= 2;
    }

    public static /* synthetic */ void p(h3 h3Var, s3 s3Var) {
        h3Var.zzf = s3Var;
        h3Var.zze = 2;
    }

    public static /* synthetic */ void q(h3 h3Var, w3 w3Var) {
        h3Var.zzf = w3Var;
        h3Var.zze = 4;
    }

    public static /* synthetic */ void r(h3 h3Var, e4 e4Var) {
        h3Var.zzf = e4Var;
        h3Var.zze = 3;
    }

    public static /* synthetic */ void s(h3 h3Var, int i10) {
        h3Var.zzg = i10 - 1;
        h3Var.zzd |= 1;
    }

    public static g3 t() {
        return (g3) zzb.f();
    }

    @Override // com.google.android.gms.internal.play_billing.t1
    public final Object d(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new r2(zzb, "\u0004\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005᠌\u0001", new Object[]{"zzf", "zze", "zzd", "zzg", b1.f24223c, s3.class, e4.class, w3.class, "zzh", b1.f24225e});
        }
        if (i11 == 3) {
            return new h3();
        }
        if (i11 == 4) {
            return new g3(zzb);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }

    public final w3 n() {
        return this.zze == 4 ? (w3) this.zzf : w3.o();
    }
}
