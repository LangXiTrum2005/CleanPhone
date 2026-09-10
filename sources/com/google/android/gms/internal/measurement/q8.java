package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class q8 extends i1 {
    private static final q8 zzi;
    private static volatile j2 zzj;
    private int zzb;
    private int zze;
    private boolean zzg;
    private String zzf = "";
    private s1 zzh = m2.f23723e;

    static {
        q8 q8Var = new q8();
        zzi = q8Var;
        i1.p(q8.class, q8Var);
    }

    public static q8 B() {
        return zzi;
    }

    public final int A() {
        return this.zzh.size();
    }

    public final int C() {
        int i10;
        switch (this.zze) {
            case 0:
                i10 = 1;
                break;
            case 1:
                i10 = 2;
                break;
            case 2:
                i10 = 3;
                break;
            case 3:
                i10 = 4;
                break;
            case 4:
                i10 = 5;
                break;
            case 5:
                i10 = 6;
                break;
            case 6:
                i10 = 7;
                break;
            default:
                i10 = 0;
                break;
        }
        if (i10 == 0) {
            return 1;
        }
        return i10;
    }

    @Override // com.google.android.gms.internal.measurement.i1
    public final Object t(int i10) {
        j2 h1Var;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new n2(zzi, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004\u001a", new Object[]{"zzb", "zze", i0.f23557d, "zzf", "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new q8();
        }
        if (i11 == 4) {
            return new m8(zzi);
        }
        if (i11 == 5) {
            return zzi;
        }
        if (i11 != 6) {
            throw null;
        }
        j2 j2Var = zzj;
        if (j2Var != null) {
            return j2Var;
        }
        synchronized (q8.class) {
            try {
                h1Var = zzj;
                if (h1Var == null) {
                    h1Var = new h1(zzi);
                    zzj = h1Var;
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

    public final boolean v() {
        return (this.zzb & 2) != 0;
    }

    public final String w() {
        return this.zzf;
    }

    public final boolean x() {
        return (this.zzb & 4) != 0;
    }

    public final boolean y() {
        return this.zzg;
    }

    public final s1 z() {
        return this.zzh;
    }
}
