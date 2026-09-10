package com.google.android.gms.internal.measurement;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class y9 extends i1 {
    private static final y9 zzk;
    private static volatile j2 zzl;
    private int zzb;
    private long zzg;
    private float zzh;
    private double zzi;
    private String zze = "";
    private String zzf = "";
    private s1 zzj = m2.f23723e;

    static {
        y9 y9Var = new y9();
        zzk = y9Var;
        i1.p(y9.class, y9Var);
    }

    public static x9 G() {
        return (x9) zzk.k();
    }

    public final boolean A() {
        return (this.zzb & 8) != 0;
    }

    public final float B() {
        return this.zzh;
    }

    public final boolean C() {
        return (this.zzb & 16) != 0;
    }

    public final double D() {
        return this.zzi;
    }

    public final s1 E() {
        return this.zzj;
    }

    public final int F() {
        return this.zzj.size();
    }

    public final /* synthetic */ void H(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zze = str;
    }

    public final /* synthetic */ void I(String str) {
        str.getClass();
        this.zzb |= 2;
        this.zzf = str;
    }

    public final /* synthetic */ void J() {
        this.zzb &= -3;
        this.zzf = zzk.zzf;
    }

    public final /* synthetic */ void K(long j10) {
        this.zzb |= 4;
        this.zzg = j10;
    }

    public final /* synthetic */ void L() {
        this.zzb &= -5;
        this.zzg = 0L;
    }

    public final /* synthetic */ void M(double d10) {
        this.zzb |= 16;
        this.zzi = d10;
    }

    public final /* synthetic */ void N() {
        this.zzb &= -17;
        this.zzi = 0.0d;
    }

    public final void O(y9 y9Var) {
        s1 s1Var = this.zzj;
        if (!((m0) s1Var).f23719a) {
            this.zzj = f2.f(s1Var);
        }
        this.zzj.add(y9Var);
    }

    public final void P(ArrayList arrayList) {
        s1 s1Var = this.zzj;
        if (!((m0) s1Var).f23719a) {
            this.zzj = f2.f(s1Var);
        }
        l0.d(arrayList, this.zzj);
    }

    public final void Q() {
        this.zzj = m2.f23723e;
    }

    @Override // com.google.android.gms.internal.measurement.i1
    public final Object t(int i10) {
        j2 h1Var;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new n2(zzk, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ခ\u0003\u0005က\u0004\u0006\u001b", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", y9.class});
        }
        if (i11 == 3) {
            return new y9();
        }
        if (i11 == 4) {
            return new x9(zzk);
        }
        if (i11 == 5) {
            return zzk;
        }
        if (i11 != 6) {
            throw null;
        }
        j2 j2Var = zzl;
        if (j2Var != null) {
            return j2Var;
        }
        synchronized (y9.class) {
            try {
                h1Var = zzl;
                if (h1Var == null) {
                    h1Var = new h1(zzk);
                    zzl = h1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return h1Var;
    }

    public final boolean u() {
        return (this.zzb & 1) != 0;
    }

    public final String v() {
        return this.zze;
    }

    public final boolean w() {
        return (this.zzb & 2) != 0;
    }

    public final String x() {
        return this.zzf;
    }

    public final boolean y() {
        return (this.zzb & 4) != 0;
    }

    public final long z() {
        return this.zzg;
    }
}
