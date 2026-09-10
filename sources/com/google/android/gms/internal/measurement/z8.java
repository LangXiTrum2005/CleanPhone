package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class z8 extends i1 {
    private static final z8 zzw;
    private static volatile j2 zzx;
    private int zzb;
    private long zze;
    private String zzf = "";
    private int zzg;
    private s1 zzh;
    private s1 zzi;
    private s1 zzj;
    private String zzk;
    private boolean zzl;
    private s1 zzm;
    private s1 zzn;
    private String zzo;
    private String zzp;
    private u8 zzq;
    private b9 zzr;
    private e9 zzs;
    private c9 zzt;
    private a9 zzu;
    private n1 zzv;

    static {
        z8 z8Var = new z8();
        zzw = z8Var;
        i1.p(z8.class, z8Var);
    }

    public z8() {
        m2 m2Var = m2.f23723e;
        this.zzh = m2Var;
        this.zzi = m2Var;
        this.zzj = m2Var;
        this.zzk = "";
        this.zzm = m2Var;
        this.zzn = m2Var;
        this.zzo = "";
        this.zzp = "";
        this.zzv = j1.f23610e;
    }

    public static y8 L() {
        return (y8) zzw.k();
    }

    public static z8 M() {
        return zzw;
    }

    public final x8 A(int i10) {
        return (x8) this.zzi.get(i10);
    }

    public final List B() {
        return this.zzj;
    }

    public final s1 C() {
        return this.zzm;
    }

    public final int D() {
        return this.zzm.size();
    }

    public final s1 E() {
        return this.zzn;
    }

    public final String F() {
        return this.zzo;
    }

    public final boolean G() {
        return (this.zzb & 128) != 0;
    }

    public final u8 H() {
        u8 u8Var = this.zzq;
        return u8Var == null ? u8.A() : u8Var;
    }

    public final boolean I() {
        return (this.zzb & 512) != 0;
    }

    public final e9 J() {
        e9 e9Var = this.zzs;
        return e9Var == null ? e9.w() : e9Var;
    }

    public final n1 K() {
        return this.zzv;
    }

    public final void N(int i10, x8 x8Var) {
        s1 s1Var = this.zzi;
        if (!((m0) s1Var).f23719a) {
            this.zzi = f2.f(s1Var);
        }
        this.zzi.set(i10, x8Var);
    }

    public final void O() {
        this.zzj = m2.f23723e;
    }

    public final void P() {
        this.zzm = m2.f23723e;
    }

    @Override // com.google.android.gms.internal.measurement.i1
    public final Object t(int i10) {
        j2 h1Var;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new n2(zzw, "\u0004\u0012\u0000\u0001\u0001\u0014\u0012\u0000\u0006\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007ဈ\u0003\bဇ\u0004\t\u001b\n\u001b\u000bဈ\u0005\u000eဈ\u0006\u000fဉ\u0007\u0010ဉ\b\u0011ဉ\t\u0012ဉ\n\u0013ဉ\u000b\u0014+", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", d9.class, "zzi", x8.class, "zzj", h8.class, "zzk", "zzl", "zzm", pa.class, "zzn", v8.class, "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv"});
        }
        if (i11 == 3) {
            return new z8();
        }
        if (i11 == 4) {
            return new y8(zzw);
        }
        if (i11 == 5) {
            return zzw;
        }
        if (i11 != 6) {
            throw null;
        }
        j2 j2Var = zzx;
        if (j2Var != null) {
            return j2Var;
        }
        synchronized (z8.class) {
            try {
                h1Var = zzx;
                if (h1Var == null) {
                    h1Var = new h1(zzw);
                    zzx = h1Var;
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

    public final long v() {
        return this.zze;
    }

    public final boolean w() {
        return (this.zzb & 2) != 0;
    }

    public final String x() {
        return this.zzf;
    }

    public final s1 y() {
        return this.zzh;
    }

    public final int z() {
        return this.zzi.size();
    }
}
