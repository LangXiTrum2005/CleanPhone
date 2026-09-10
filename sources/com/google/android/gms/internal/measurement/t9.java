package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class t9 extends i1 {
    private static final t9 zzg;
    private static volatile j2 zzh;
    private int zzb;
    private int zze;
    private long zzf;

    static {
        t9 t9Var = new t9();
        zzg = t9Var;
        i1.p(t9.class, t9Var);
    }

    public static s9 y() {
        return (s9) zzg.k();
    }

    public final /* synthetic */ void A(long j10) {
        this.zzb |= 2;
        this.zzf = j10;
    }

    @Override // com.google.android.gms.internal.measurement.i1
    public final Object t(int i10) {
        j2 h1Var;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new n2(zzg, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new t9();
        }
        if (i11 == 4) {
            return new s9(zzg);
        }
        if (i11 == 5) {
            return zzg;
        }
        if (i11 != 6) {
            throw null;
        }
        j2 j2Var = zzh;
        if (j2Var != null) {
            return j2Var;
        }
        synchronized (t9.class) {
            try {
                h1Var = zzh;
                if (h1Var == null) {
                    h1Var = new h1(zzg);
                    zzh = h1Var;
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

    public final int v() {
        return this.zze;
    }

    public final boolean w() {
        return (this.zzb & 2) != 0;
    }

    public final long x() {
        return this.zzf;
    }

    public final /* synthetic */ void z(int i10) {
        this.zzb |= 1;
        this.zze = i10;
    }
}
