package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class bc extends i1 {
    private static final bc zzh;
    private static volatile j2 zzi;
    private int zzb;
    private ac zzf;
    private String zze = "";
    private String zzg = "";

    static {
        bc bcVar = new bc();
        zzh = bcVar;
        i1.p(bc.class, bcVar);
    }

    public static yb v() {
        return (yb) zzh.k();
    }

    @Override // com.google.android.gms.internal.measurement.i1
    public final Object t(int i10) {
        j2 h1Var;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new n2(zzh, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဈ\u0002", new Object[]{"zzb", "zze", "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new bc();
        }
        if (i11 == 4) {
            return new yb(zzh);
        }
        if (i11 == 5) {
            return zzh;
        }
        if (i11 != 6) {
            throw null;
        }
        j2 j2Var = zzi;
        if (j2Var != null) {
            return j2Var;
        }
        synchronized (bc.class) {
            try {
                h1Var = zzi;
                if (h1Var == null) {
                    h1Var = new h1(zzh);
                    zzi = h1Var;
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

    public final /* synthetic */ void w(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zze = str;
    }

    public final /* synthetic */ void x(ac acVar) {
        this.zzf = acVar;
        this.zzb |= 2;
    }

    public final /* synthetic */ void y(String str) {
        str.getClass();
        this.zzb |= 4;
        this.zzg = str;
    }
}
