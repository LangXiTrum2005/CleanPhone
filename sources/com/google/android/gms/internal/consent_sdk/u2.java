package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class u2 extends w5 {
    private static final u2 zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private long zzg;
    private int zzh;

    static {
        u2 u2Var = new u2();
        zzb = u2Var;
        w5.l(u2.class, u2Var);
    }

    public static t2 m() {
        return (t2) zzb.g();
    }

    public static /* synthetic */ void n(u2 u2Var, g2 g2Var) {
        u2Var.zzf = g2Var;
        u2Var.zze = 38;
    }

    public static /* synthetic */ void o(u2 u2Var, long j10) {
        u2Var.zzd |= 1;
        u2Var.zzg = j10;
    }

    @Override // com.google.android.gms.internal.consent_sdk.w5
    public final Object f(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new r6(zzb, "\u0004\u0019\u0001\u0001\b&\u0019\u0000\u0000\u0000\b<\u0000\tဂ\u0000\u000b<\u0000\f<\u0000\r<\u0000\u000f<\u0000\u0011<\u0000\u0012<\u0000\u0013<\u0000\u0014<\u0000\u0015<\u0000\u0016<\u0000\u0019<\u0000\u001a<\u0000\u001b<\u0000\u001dင\u0001\u001e<\u0000\u001f<\u0000 <\u0000!<\u0000\"<\u0000#<\u0000$<\u0000%<\u0000&<\u0000", new Object[]{"zzf", "zze", "zzd", w3.class, "zzg", i4.class, a3.class, f1.class, l3.class, l1.class, s2.class, i1.class, s1.class, d3.class, f3.class, y4.class, d4.class, f5.class, "zzh", e5.class, l4.class, v1.class, u4.class, s4.class, m1.class, h5.class, z4.class, g2.class});
        }
        if (i11 == 3) {
            return new u2();
        }
        if (i11 == 4) {
            return new t2(zzb);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
