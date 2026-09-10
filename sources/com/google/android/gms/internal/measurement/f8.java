package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class f8 extends i1 {
    private static final f8 zzi;
    private static volatile j2 zzj;
    private int zzb;
    private boolean zzf;
    private long zzh;
    private String zze = "";
    private String zzg = "";

    static {
        f8 f8Var = new f8();
        zzi = f8Var;
        i1.p(f8.class, f8Var);
    }

    public static e8 u() {
        return (e8) zzi.k();
    }

    @Override // com.google.android.gms.internal.measurement.i1
    public final Object t(int i10) {
        j2 h1Var;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new n2(zzi, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဂ\u0003", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new f8();
        }
        if (i11 == 4) {
            return new e8(zzi);
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
        synchronized (f8.class) {
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

    public final /* synthetic */ void v(String str) {
        this.zzb |= 1;
        this.zze = str;
    }

    public final /* synthetic */ void w() {
        this.zzb |= 2;
        this.zzf = true;
    }

    public final /* synthetic */ void x(String str) {
        this.zzb |= 4;
        this.zzg = str;
    }

    public final /* synthetic */ void y(long j10) {
        this.zzb |= 8;
        this.zzh = j10;
    }
}
