package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class g2 extends w5 {
    private static final g2 zzb;
    private int zzd;
    private c2 zze;
    private f2 zzg;
    private a2 zzh;
    private x1 zzi;
    private String zzf = "";
    private z5 zzj = q6.f23172e;

    static {
        g2 g2Var = new g2();
        zzb = g2Var;
        w5.l(g2.class, g2Var);
    }

    public static y1 m() {
        return (y1) zzb.g();
    }

    public static void n(g2 g2Var, String str) {
        str.getClass();
        z5 z5Var = g2Var.zzj;
        if (!((j5) z5Var).f23059a) {
            int size = z5Var.size();
            g2Var.zzj = z5Var.f(size + size);
        }
        g2Var.zzj.add(str);
    }

    public static /* synthetic */ void o(g2 g2Var, String str) {
        g2Var.zzd |= 2;
        g2Var.zzf = str;
    }

    public static /* synthetic */ void p(g2 g2Var, x1 x1Var) {
        g2Var.zzi = x1Var;
        g2Var.zzd |= 16;
    }

    public static /* synthetic */ void q(g2 g2Var, a2 a2Var) {
        g2Var.zzh = a2Var;
        g2Var.zzd |= 8;
    }

    public static /* synthetic */ void r(g2 g2Var, c2 c2Var) {
        g2Var.zze = c2Var;
        g2Var.zzd |= 1;
    }

    public static /* synthetic */ void s(g2 g2Var, f2 f2Var) {
        g2Var.zzg = f2Var;
        g2Var.zzd |= 4;
    }

    @Override // com.google.android.gms.internal.consent_sdk.w5
    public final Object f(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new r6(zzb, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဉ\u0000\u0002ለ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006Ț", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i11 == 3) {
            return new g2();
        }
        if (i11 == 4) {
            return new y1(zzb);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
