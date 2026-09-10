package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class dd extends i1 {
    private static final dd zze;
    private static volatile j2 zzf;
    private a2 zzb = a2.f23290b;

    static {
        dd ddVar = new dd();
        zze = ddVar;
        i1.p(dd.class, ddVar);
    }

    public static dd v() {
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
            return new n2(zze, "\u0004\u0001\u0000\u0000\u0002\u0002\u0001\u0001\u0000\u0000\u00022", new Object[]{"zzb", bd.f23318a});
        }
        if (i11 == 3) {
            return new dd();
        }
        if (i11 == 4) {
            return new cd(zze);
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
        synchronized (dd.class) {
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

    public final ad u(String str, ad adVar) {
        str.getClass();
        ad adVar2 = (ad) this.zzb.get(str);
        return adVar2 != null ? adVar2 : adVar;
    }

    public final a2 w() {
        a2 a2Var = this.zzb;
        if (!a2Var.f23291a) {
            this.zzb = a2Var.g();
        }
        return this.zzb;
    }
}
