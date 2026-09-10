package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class l8 extends i1 {
    private static final l8 zzi;
    private static volatile j2 zzj;
    private int zzb;
    private q8 zze;
    private n8 zzf;
    private boolean zzg;
    private String zzh = "";

    static {
        l8 l8Var = new l8();
        zzi = l8Var;
        i1.p(l8.class, l8Var);
    }

    public static l8 C() {
        return zzi;
    }

    public final boolean A() {
        return (this.zzb & 8) != 0;
    }

    public final String B() {
        return this.zzh;
    }

    public final /* synthetic */ void D(String str) {
        this.zzb |= 8;
        this.zzh = str;
    }

    @Override // com.google.android.gms.internal.measurement.i1
    public final Object t(int i10) {
        j2 h1Var;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new n2(zzi, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new l8();
        }
        if (i11 == 4) {
            return new k8(zzi);
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
        synchronized (l8.class) {
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

    public final q8 v() {
        q8 q8Var = this.zze;
        return q8Var == null ? q8.B() : q8Var;
    }

    public final boolean w() {
        return (this.zzb & 2) != 0;
    }

    public final n8 x() {
        n8 n8Var = this.zzf;
        return n8Var == null ? n8.D() : n8Var;
    }

    public final boolean y() {
        return (this.zzb & 4) != 0;
    }

    public final boolean z() {
        return this.zzg;
    }
}
