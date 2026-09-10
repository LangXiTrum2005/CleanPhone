package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class dc extends i1 {
    private static final dc zzl;
    private static volatile j2 zzm;
    private int zzb;
    private String zze = "";
    private s0 zzf = s0.f23949b;
    private String zzg = "";
    private s1 zzh;
    private s1 zzi;
    private boolean zzj;
    private long zzk;

    static {
        dc dcVar = new dc();
        zzl = dcVar;
        i1.p(dc.class, dcVar);
    }

    public dc() {
        m2 m2Var = m2.f23723e;
        this.zzh = m2Var;
        this.zzi = m2Var;
    }

    public static cc A() {
        return (cc) zzl.k();
    }

    public final /* synthetic */ void B(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zze = str;
    }

    public final /* synthetic */ void C(r0 r0Var) {
        r0Var.getClass();
        this.zzb |= 2;
        this.zzf = r0Var;
    }

    public final /* synthetic */ void D(String str) {
        str.getClass();
        this.zzb |= 4;
        this.zzg = str;
    }

    public final void E(fc fcVar) {
        s1 s1Var = this.zzh;
        if (!((m0) s1Var).f23719a) {
            this.zzh = f2.f(s1Var);
        }
        this.zzh.add(fcVar);
    }

    public final void F(String str) {
        str.getClass();
        s1 s1Var = this.zzi;
        if (!((m0) s1Var).f23719a) {
            this.zzi = f2.f(s1Var);
        }
        this.zzi.add(str);
    }

    public final /* synthetic */ void G(boolean z10) {
        this.zzb |= 8;
        this.zzj = z10;
    }

    public final /* synthetic */ void H(long j10) {
        this.zzb |= 16;
        this.zzk = j10;
    }

    @Override // com.google.android.gms.internal.measurement.i1
    public final Object t(int i10) {
        j2 h1Var;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new n2(zzl, "\u0004\u0007\u0000\u0001\u0001\t\u0007\u0000\u0002\u0000\u0001ဈ\u0002\u0002ဈ\u0000\u0003ည\u0001\u0004\u001b\u0005\u001a\bဇ\u0003\tဂ\u0004", new Object[]{"zzb", "zzg", "zze", "zzf", "zzh", fc.class, "zzi", "zzj", "zzk"});
        }
        if (i11 == 3) {
            return new dc();
        }
        if (i11 == 4) {
            return new cc(zzl);
        }
        if (i11 == 5) {
            return zzl;
        }
        if (i11 != 6) {
            throw null;
        }
        j2 j2Var = zzm;
        if (j2Var != null) {
            return j2Var;
        }
        synchronized (dc.class) {
            try {
                h1Var = zzm;
                if (h1Var == null) {
                    h1Var = new h1(zzl);
                    zzm = h1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return h1Var;
    }

    public final String u() {
        return this.zze;
    }

    public final boolean v() {
        return (this.zzb & 2) != 0;
    }

    public final s0 w() {
        return this.zzf;
    }

    public final String x() {
        return this.zzg;
    }

    public final s1 y() {
        return this.zzh;
    }

    public final long z() {
        return this.zzk;
    }
}
