package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class r9 extends i1 {
    private static final r9 zze;
    private static volatile j2 zzf;
    private s1 zzb = m2.f23723e;

    static {
        r9 r9Var = new r9();
        zze = r9Var;
        i1.p(r9.class, r9Var);
    }

    public static o9 v() {
        return (o9) zze.k();
    }

    public static r9 w() {
        return zze;
    }

    @Override // com.google.android.gms.internal.measurement.i1
    public final Object t(int i10) {
        j2 h1Var;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new n2(zze, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzb", q9.class});
        }
        if (i11 == 3) {
            return new r9();
        }
        if (i11 == 4) {
            return new o9(zze);
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
        synchronized (r9.class) {
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

    public final void x(ArrayList arrayList) {
        s1 s1Var = this.zzb;
        if (!((m0) s1Var).f23719a) {
            this.zzb = f2.f(s1Var);
        }
        l0.d(arrayList, this.zzb);
    }
}
