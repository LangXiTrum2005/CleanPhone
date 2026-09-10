package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ne extends i1 {
    private static final ne zzh;
    private static volatile j2 zzi;
    private int zzb;
    private Object zzf;
    private int zze = 0;
    private String zzg = "";

    static {
        ne neVar = new ne();
        zzh = neVar;
        i1.p(ne.class, neVar);
    }

    public static me A() {
        return (me) zzh.k();
    }

    public final /* synthetic */ void B(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zzg = str;
    }

    public final /* synthetic */ void C(long j10) {
        this.zze = 2;
        this.zzf = Long.valueOf(j10);
    }

    public final /* synthetic */ void D(boolean z10) {
        this.zze = 3;
        this.zzf = Boolean.valueOf(z10);
    }

    public final /* synthetic */ void E(double d10) {
        this.zze = 4;
        this.zzf = Double.valueOf(d10);
    }

    public final /* synthetic */ void F(String str) {
        str.getClass();
        this.zze = 5;
        this.zzf = str;
    }

    public final /* synthetic */ void G(s0 s0Var) {
        s0Var.getClass();
        this.zze = 6;
        this.zzf = s0Var;
    }

    public final int H() {
        int i10 = this.zze;
        if (i10 == 0) {
            return 6;
        }
        if (i10 == 2) {
            return 1;
        }
        if (i10 == 3) {
            return 2;
        }
        if (i10 == 4) {
            return 3;
        }
        if (i10 != 5) {
            return i10 != 6 ? 0 : 5;
        }
        return 4;
    }

    @Override // com.google.android.gms.internal.measurement.i1
    public final Object t(int i10) {
        j2 h1Var;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new n2(zzh, "\u0004\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u00025\u0000\u0003:\u0000\u00043\u0000\u0005;\u0000\u0006=\u0000", new Object[]{"zzf", "zze", "zzb", "zzg"});
        }
        if (i11 == 3) {
            return new ne();
        }
        if (i11 == 4) {
            return new me(zzh);
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
        synchronized (ne.class) {
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
        if (this.zze == 2) {
            return ((Long) this.zzf).longValue();
        }
        return 0L;
    }

    public final boolean w() {
        if (this.zze == 3) {
            return ((Boolean) this.zzf).booleanValue();
        }
        return false;
    }

    public final double x() {
        if (this.zze == 4) {
            return ((Double) this.zzf).doubleValue();
        }
        return 0.0d;
    }

    public final String y() {
        return this.zze == 5 ? (String) this.zzf : "";
    }

    public final s0 z() {
        return this.zze == 6 ? (s0) this.zzf : s0.f23949b;
    }
}
