package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class vc extends i1 {
    private static final vc zzo;
    private static volatile j2 zzp;
    private int zzb;
    private boolean zzf;
    private s1 zzh;
    private s1 zzi;
    private n1 zzj;
    private wc zzk;
    private boolean zzl;
    private boolean zzm;
    private sc zzn;
    private s0 zze = s0.f23949b;
    private String zzg = "";

    static {
        vc vcVar = new vc();
        zzo = vcVar;
        i1.p(vc.class, vcVar);
    }

    public vc() {
        m2 m2Var = m2.f23723e;
        this.zzh = m2Var;
        this.zzi = m2Var;
        this.zzj = j1.f23610e;
    }

    public static vc u() {
        return zzo;
    }

    @Override // com.google.android.gms.internal.measurement.i1
    public final Object t(int i10) {
        j2 h1Var;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new n2(zzo, "\u0004\n\u0000\u0001\u0001\f\n\u0000\u0003\u0000\u0001ည\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004\u001a\u0005\u001a\u0007ࠬ\bဉ\u0003\nဇ\u0004\u000bဇ\u0005\fဉ\u0006", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", i0.f23555b, "zzk", "zzl", "zzm", "zzn"});
        }
        if (i11 == 3) {
            return new vc();
        }
        if (i11 == 4) {
            return new m8(zzo);
        }
        if (i11 == 5) {
            return zzo;
        }
        if (i11 != 6) {
            throw null;
        }
        j2 j2Var = zzp;
        if (j2Var != null) {
            return j2Var;
        }
        synchronized (vc.class) {
            try {
                h1Var = zzp;
                if (h1Var == null) {
                    h1Var = new h1(zzo);
                    zzp = h1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return h1Var;
    }
}
