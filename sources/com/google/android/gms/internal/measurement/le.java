package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class le extends i1 {
    private static final le zzj;
    private static volatile j2 zzk;
    private int zzb;
    private long zzh;
    private String zze = "";
    private s0 zzf = s0.f23949b;
    private String zzg = "";
    private s1 zzi = m2.f23723e;

    static {
        le leVar = new le();
        zzj = leVar;
        i1.p(le.class, leVar);
    }

    public static ke A() {
        return (ke) zzj.k();
    }

    public static le B() {
        return zzj;
    }

    public final /* synthetic */ void C(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zze = str;
    }

    public final /* synthetic */ void D(s0 s0Var) {
        s0Var.getClass();
        this.zzb |= 2;
        this.zzf = s0Var;
    }

    public final /* synthetic */ void E(String str) {
        str.getClass();
        this.zzb |= 4;
        this.zzg = str;
    }

    public final /* synthetic */ void F(long j10) {
        this.zzb |= 8;
        this.zzh = j10;
    }

    public final void G(ne neVar) {
        s1 s1Var = this.zzi;
        if (!((m0) s1Var).f23719a) {
            this.zzi = f2.f(s1Var);
        }
        this.zzi.add(neVar);
    }

    @Override // com.google.android.gms.internal.measurement.i1
    public final Object t(int i10) {
        j2 h1Var;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new n2(zzj, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005\u001b", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", ne.class});
        }
        if (i11 == 3) {
            return new le();
        }
        if (i11 == 4) {
            return new ke(zzj);
        }
        if (i11 == 5) {
            return zzj;
        }
        if (i11 != 6) {
            throw null;
        }
        j2 j2Var = zzk;
        if (j2Var != null) {
            return j2Var;
        }
        synchronized (le.class) {
            try {
                h1Var = zzk;
                if (h1Var == null) {
                    h1Var = new h1(zzj);
                    zzk = h1Var;
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

    public final s0 v() {
        return this.zzf;
    }

    public final String w() {
        return this.zzg;
    }

    public final long x() {
        return this.zzh;
    }

    public final s1 y() {
        return this.zzi;
    }

    public final int z() {
        return this.zzi.size();
    }
}
