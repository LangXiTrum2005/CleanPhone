package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class l31 extends ss1 {
    private static final l31 zzf;
    private static volatile tt1 zzg;
    private int zza;
    private Object zzc;
    private int zzd;
    private int zzb = 0;
    private ws1 zze = ts1.f20489e;

    static {
        l31 l31Var = new l31();
        zzf = l31Var;
        ss1.t(l31.class, l31Var);
    }

    public static l31 D(as1 as1Var) {
        l31 l31Var = zzf;
        ks1 ks1Var = ks1.f16518a;
        int i10 = tr1.f20473a;
        ss1 ss1VarM = ss1.m(l31Var, as1Var, ks1.f16519b);
        ss1.y(ss1VarM);
        return (l31) ss1VarM;
    }

    public static k31 E() {
        return (k31) zzf.q();
    }

    public static l31 F() {
        return zzf;
    }

    public final lh A() {
        return this.zzb == 2 ? (lh) this.zzc : lh.C();
    }

    public final hh B() {
        hh hhVarA = hh.a(this.zzd);
        return hhVarA == null ? hh.UNSUPPORTED : hhVarA;
    }

    public final List C() {
        return this.zze;
    }

    public final /* synthetic */ void G(nh nhVar) {
        nhVar.getClass();
        this.zzc = nhVar;
        this.zzb = 1;
    }

    public final /* synthetic */ void H(lh lhVar) {
        lhVar.getClass();
        this.zzc = lhVar;
        this.zzb = 2;
    }

    public final void I(hh hhVar) {
        this.zzd = hhVar.f15291a;
        this.zza |= 1;
    }

    public final void J(ws1 ws1Var) {
        List list = this.zze;
        if (!((sr1) list).f20043a) {
            int size = list.size();
            this.zze = ((ts1) list).e(size + size);
        }
        rr1.e(ws1Var, this.zze);
    }

    @Override // com.google.android.gms.internal.ads.ss1
    public final Object v(int i10, ss1 ss1Var) {
        tt1 rs1Var;
        int iC = v0.i.c(i10);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new xt1(zzf, "\u0004\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001<\u0000\u0002<\u0000\u0003᠌\u0000\u0004'", new Object[]{"zzc", "zzb", "zza", nh.class, lh.class, "zzd", nd.f17766o, "zze"});
        }
        if (iC == 3) {
            return new l31();
        }
        if (iC == 4) {
            return new k31(zzf);
        }
        if (iC == 5) {
            return zzf;
        }
        if (iC != 6) {
            throw null;
        }
        tt1 tt1Var = zzg;
        if (tt1Var != null) {
            return tt1Var;
        }
        synchronized (l31.class) {
            try {
                rs1Var = zzg;
                if (rs1Var == null) {
                    rs1Var = new rs1(zzf);
                    zzg = rs1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return rs1Var;
    }

    public final nh z() {
        return this.zzb == 1 ? (nh) this.zzc : nh.H();
    }
}
