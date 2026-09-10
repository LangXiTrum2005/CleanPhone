package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class fc extends i1 {
    private static final fc zzh;
    private static volatile j2 zzi;
    private int zzb;
    private Object zzf;
    private int zze = 0;
    private String zzg = "";

    static {
        fc fcVar = new fc();
        zzh = fcVar;
        i1.p(fc.class, fcVar);
    }

    public static ec A() {
        return (ec) zzh.k();
    }

    public static fc B() {
        return zzh;
    }

    public final /* synthetic */ void C(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zzg = str;
    }

    public final /* synthetic */ void D(long j10) {
        this.zze = 1;
        this.zzf = Long.valueOf(j10);
    }

    public final /* synthetic */ void E(boolean z10) {
        this.zze = 2;
        this.zzf = Boolean.valueOf(z10);
    }

    public final /* synthetic */ void F(double d10) {
        this.zze = 3;
        this.zzf = Double.valueOf(d10);
    }

    public final /* synthetic */ void G(String str) {
        str.getClass();
        this.zze = 4;
        this.zzf = str;
    }

    public final /* synthetic */ void H(r0 r0Var) {
        r0Var.getClass();
        this.zze = 5;
        this.zzf = r0Var;
    }

    public final int I() {
        int i10 = this.zze;
        if (i10 == 0) {
            return 6;
        }
        int i11 = 1;
        if (i10 != 1) {
            i11 = 2;
            if (i10 != 2) {
                i11 = 3;
                if (i10 != 3) {
                    i11 = 4;
                    if (i10 != 4) {
                        i11 = 5;
                        if (i10 != 5) {
                            return 0;
                        }
                    }
                }
            }
        }
        return i11;
    }

    @Override // com.google.android.gms.internal.measurement.i1
    public final Object t(int i10) {
        j2 h1Var;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new n2(zzh, "\u0004\u0006\u0001\u0001\u0001\n\u0006\u0000\u0000\u0000\u00018\u0000\u0002:\u0000\u00033\u0000\u0004;\u0000\u0005=\u0000\nဈ\u0000", new Object[]{"zzf", "zze", "zzb", "zzg"});
        }
        if (i11 == 3) {
            return new fc();
        }
        if (i11 == 4) {
            return new ec(zzh);
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
        synchronized (fc.class) {
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

    public final String u() {
        return this.zzg;
    }

    public final long v() {
        if (this.zze == 1) {
            return ((Long) this.zzf).longValue();
        }
        return 0L;
    }

    public final boolean w() {
        if (this.zze == 2) {
            return ((Boolean) this.zzf).booleanValue();
        }
        return false;
    }

    public final double x() {
        if (this.zze == 3) {
            return ((Double) this.zzf).doubleValue();
        }
        return 0.0d;
    }

    public final String y() {
        return this.zze == 4 ? (String) this.zzf : "";
    }

    public final s0 z() {
        return this.zze == 5 ? (s0) this.zzf : s0.f23949b;
    }
}
