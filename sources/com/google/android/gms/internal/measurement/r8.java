package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class r8 extends i1 {
    private static final r8 zzh;
    private static volatile j2 zzi;
    private int zzb;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        r8 r8Var = new r8();
        zzh = r8Var;
        i1.p(r8.class, r8Var);
    }

    @Override // com.google.android.gms.internal.measurement.i1
    public final Object t(int i10) {
        j2 h1Var;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new n2(zzh, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"zzb", "zze", i0.f23559f, "zzf", i0.f23558e, "zzg", i0.f23560g});
        }
        if (i11 == 3) {
            return new r8();
        }
        if (i11 == 4) {
            return new m8(zzh);
        }
        if (i11 == 5) {
            return zzh;
        }
        if (i11 != 6) {
            throw null;
        }
        j2 j2Var = zzi;
        if (j2Var != null) {
            return j2Var;
        }
        synchronized (r8.class) {
            try {
                h1Var = zzi;
                if (h1Var == null) {
                    h1Var = new h1(zzh);
                    zzi = h1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return h1Var;
    }

    public final int u() {
        int iA = mb.a(this.zze);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }

    public final int v() {
        int i10;
        int i11 = this.zzf;
        if (i11 != 0) {
            i10 = 2;
            if (i11 != 1) {
                i10 = i11 != 2 ? 0 : 3;
            }
        } else {
            i10 = 1;
        }
        if (i10 == 0) {
            return 1;
        }
        return i10;
    }

    public final int w() {
        int i10;
        int i11 = this.zzg;
        if (i11 != 0) {
            i10 = 2;
            if (i11 != 1) {
                i10 = i11 != 2 ? 0 : 3;
            }
        } else {
            i10 = 1;
        }
        if (i10 == 0) {
            return 1;
        }
        return i10;
    }
}
