package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ka extends i1 {
    private static final ka zzh;
    private static volatile j2 zzi;
    private int zzb;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        ka kaVar = new ka();
        zzh = kaVar;
        i1.p(ka.class, kaVar);
    }

    public static ja v() {
        return (ja) zzh.k();
    }

    public static ka w() {
        return zzh;
    }

    public final /* synthetic */ void A(int i10) {
        this.zze = i10 - 1;
        this.zzb |= 1;
    }

    public final /* synthetic */ void B(int i10) {
        this.zzg = i10 - 1;
        this.zzb |= 4;
    }

    @Override // com.google.android.gms.internal.measurement.i1
    public final Object t(int i10) {
        j2 h1Var;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new n2(zzh, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"zzb", "zze", i0.f23567o, "zzf", i0.f23565m, "zzg", i0.f23566n});
        }
        if (i11 == 3) {
            return new ka();
        }
        if (i11 == 4) {
            return new ja(zzh);
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
        synchronized (ka.class) {
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
        int iA = f2.a(this.zzf);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }

    public final void x(int i10) {
        this.zzf = f2.b(i10);
        this.zzb |= 2;
    }

    public final int y() {
        int i10;
        int i11 = this.zze;
        if (i11 != 0) {
            i10 = 2;
            if (i11 != 1) {
                if (i11 != 2) {
                    i10 = 4;
                    if (i11 != 3) {
                        i10 = i11 != 4 ? 0 : 5;
                    }
                } else {
                    i10 = 3;
                }
            }
        } else {
            i10 = 1;
        }
        if (i10 == 0) {
            return 1;
        }
        return i10;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0017 A[PHI: r2
  0x0017: PHI (r2v1 int) = (r2v0 int), (r2v2 int) binds: [B:7:0x0009, B:11:0x000f] A[DONT_GENERATE, DONT_INLINE]] */
    public final int z() {
        int i10;
        int i11 = this.zzg;
        if (i11 != 0) {
            i10 = 2;
            if (i11 != 1) {
                int i12 = 3;
                if (i11 != 2) {
                    i10 = 4;
                    if (i11 != 3) {
                        i12 = 5;
                        if (i11 != 4) {
                            i10 = i11 != 5 ? 0 : 6;
                        } else {
                            i10 = i12;
                        }
                    }
                } else {
                    i10 = i12;
                }
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
