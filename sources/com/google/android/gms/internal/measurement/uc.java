package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class uc extends i1 {
    private static final o1 zzl = new f1(13);
    private static final uc zzq;
    private static volatile j2 zzr;
    private int zzb;
    private boolean zzf;
    private long zzh;
    private s1 zzi;
    private s1 zzj;
    private n1 zzk;
    private wc zzm;
    private boolean zzn;
    private boolean zzo;
    private sc zzp;
    private s0 zze = s0.f23949b;
    private String zzg = "";

    static {
        uc ucVar = new uc();
        zzq = ucVar;
        i1.p(uc.class, ucVar);
    }

    public uc() {
        m2 m2Var = m2.f23723e;
        this.zzi = m2Var;
        this.zzj = m2Var;
        this.zzk = j1.f23610e;
    }

    public static tc H() {
        return (tc) zzq.k();
    }

    public static uc I() {
        return zzq;
    }

    public final s1 A() {
        return this.zzj;
    }

    public final List B() {
        return new p1(this.zzk, zzl);
    }

    public final boolean C() {
        return (this.zzb & 16) != 0;
    }

    public final wc D() {
        wc wcVar = this.zzm;
        return wcVar == null ? wc.w() : wcVar;
    }

    public final boolean E() {
        return this.zzn;
    }

    public final boolean F() {
        return this.zzo;
    }

    public final sc G() {
        sc scVar = this.zzp;
        return scVar == null ? sc.v() : scVar;
    }

    public final /* synthetic */ void J(long j10) {
        this.zzb |= 8;
        this.zzh = j10;
    }

    @Override // com.google.android.gms.internal.measurement.i1
    public final Object t(int i10) {
        j2 h1Var;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new n2(zzq, "\u0004\u000b\u0000\u0001\u0001\f\u000b\u0000\u0003\u0000\u0001ည\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005\u001a\u0006\u001a\u0007ࠬ\bဉ\u0004\nဇ\u0005\u000bဇ\u0006\fဉ\u0007", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", i0.f23555b, "zzm", "zzn", "zzo", "zzp"});
        }
        if (i11 == 3) {
            return new uc();
        }
        if (i11 == 4) {
            return new tc(zzq);
        }
        if (i11 == 5) {
            return zzq;
        }
        if (i11 != 6) {
            throw null;
        }
        j2 j2Var = zzr;
        if (j2Var != null) {
            return j2Var;
        }
        synchronized (uc.class) {
            try {
                h1Var = zzr;
                if (h1Var == null) {
                    h1Var = new h1(zzq);
                    zzr = h1Var;
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

    public final s0 v() {
        return this.zze;
    }

    public final boolean w() {
        return this.zzf;
    }

    public final String x() {
        return this.zzg;
    }

    public final long y() {
        return this.zzh;
    }

    public final s1 z() {
        return this.zzi;
    }
}
