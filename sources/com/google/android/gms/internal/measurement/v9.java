package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class v9 extends i1 {
    private static final v9 zzm;
    private static volatile j2 zzn;
    private int zzb;
    private s1 zze = m2.f23723e;
    private String zzf = "";
    private long zzg;
    private long zzh;
    private int zzi;
    private long zzj;
    private long zzk;
    private long zzl;

    static {
        v9 v9Var = new v9();
        zzm = v9Var;
        i1.p(v9.class, v9Var);
    }

    public static u9 K() {
        return (u9) zzm.k();
    }

    public final boolean A() {
        return (this.zzb & 2) != 0;
    }

    public final long B() {
        return this.zzg;
    }

    public final boolean C() {
        return (this.zzb & 4) != 0;
    }

    public final long D() {
        return this.zzh;
    }

    public final boolean E() {
        return (this.zzb & 8) != 0;
    }

    public final int F() {
        return this.zzi;
    }

    public final boolean G() {
        return (this.zzb & 32) != 0;
    }

    public final long H() {
        return this.zzk;
    }

    public final boolean I() {
        return (this.zzb & 64) != 0;
    }

    public final long J() {
        return this.zzl;
    }

    public final /* synthetic */ void L(int i10, y9 y9Var) {
        v();
        this.zze.set(i10, y9Var);
    }

    public final /* synthetic */ void M(y9 y9Var) {
        y9Var.getClass();
        v();
        this.zze.add(y9Var);
    }

    public final /* synthetic */ void N(Iterable iterable) {
        v();
        l0.d(iterable, this.zze);
    }

    public final void O() {
        this.zze = m2.f23723e;
    }

    public final /* synthetic */ void P(int i10) {
        v();
        this.zze.remove(i10);
    }

    public final /* synthetic */ void Q(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zzf = str;
    }

    public final /* synthetic */ void R(long j10) {
        this.zzb |= 2;
        this.zzg = j10;
    }

    public final /* synthetic */ void S(long j10) {
        this.zzb |= 4;
        this.zzh = j10;
    }

    public final /* synthetic */ void T(long j10) {
        this.zzb |= 16;
        this.zzj = j10;
    }

    public final /* synthetic */ void U(long j10) {
        this.zzb |= 32;
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
            return new n2(zzm, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003\u0006ဂ\u0004\u0007ဂ\u0005\bဂ\u0006", new Object[]{"zzb", "zze", y9.class, "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
        }
        if (i11 == 3) {
            return new v9();
        }
        if (i11 == 4) {
            return new u9(zzm);
        }
        if (i11 == 5) {
            return zzm;
        }
        if (i11 != 6) {
            throw null;
        }
        j2 j2Var = zzn;
        if (j2Var != null) {
            return j2Var;
        }
        synchronized (v9.class) {
            try {
                h1Var = zzn;
                if (h1Var == null) {
                    h1Var = new h1(zzm);
                    zzn = h1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return h1Var;
    }

    public final /* synthetic */ void u(long j10) {
        this.zzb |= 64;
        this.zzl = j10;
    }

    public final void v() {
        s1 s1Var = this.zze;
        if (((m0) s1Var).f23719a) {
            return;
        }
        this.zze = f2.f(s1Var);
    }

    public final List w() {
        return this.zze;
    }

    public final int x() {
        return this.zze.size();
    }

    public final y9 y(int i10) {
        return (y9) this.zze.get(i10);
    }

    public final String z() {
        return this.zzf;
    }
}
