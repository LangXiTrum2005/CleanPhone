package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class vd extends i1 {
    private static final vd zze;
    private static volatile j2 zzf;
    private s1 zzb = m2.f23723e;

    static {
        vd vdVar = new vd();
        zze = vdVar;
        i1.p(vd.class, vdVar);
    }

    public static vd v(byte[] bArr, z0 z0Var) {
        return (vd) i1.e(zze, bArr, z0Var);
    }

    @Override // com.google.android.gms.internal.measurement.i1
    public final Object t(int i10) {
        j2 h1Var;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new n2(zze, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"zzb"});
        }
        if (i11 == 3) {
            return new vd();
        }
        if (i11 == 4) {
            return new m8(zze);
        }
        if (i11 == 5) {
            return zze;
        }
        if (i11 != 6) {
            throw null;
        }
        j2 j2Var = zzf;
        if (j2Var != null) {
            return j2Var;
        }
        synchronized (vd.class) {
            try {
                h1Var = zzf;
                if (h1Var == null) {
                    h1Var = new h1(zze);
                    zzf = h1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return h1Var;
    }

    public final List u() {
        return this.zzb;
    }
}
