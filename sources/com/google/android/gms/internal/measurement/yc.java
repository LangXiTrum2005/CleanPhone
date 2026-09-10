package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class yc extends i1 {
    private static final yc zzg;
    private static volatile j2 zzh;
    private int zzb;
    private uc zze;
    private vc zzf;

    static {
        yc ycVar = new yc();
        zzg = ycVar;
        i1.p(yc.class, ycVar);
    }

    public static yc w(byte[] bArr, z0 z0Var) {
        return (yc) i1.e(zzg, bArr, z0Var);
    }

    public static xc x() {
        return (xc) zzg.k();
    }

    @Override // com.google.android.gms.internal.measurement.i1
    public final Object t(int i10) {
        j2 h1Var;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new n2(zzg, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new yc();
        }
        if (i11 == 4) {
            return new xc(zzg);
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
        synchronized (yc.class) {
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

    public final uc u() {
        uc ucVar = this.zze;
        return ucVar == null ? uc.I() : ucVar;
    }

    public final vc v() {
        vc vcVar = this.zzf;
        return vcVar == null ? vc.u() : vcVar;
    }

    public final /* synthetic */ void y(uc ucVar) {
        this.zze = ucVar;
        this.zzb |= 1;
    }
}
