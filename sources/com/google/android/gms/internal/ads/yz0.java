package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class yz0 extends ss1 {
    private static final yz0 zzf;
    private static volatile tt1 zzg;
    private int zza;
    private ws1 zzb = ts1.f20489e;
    private String zzc = "";
    private String zzd = "";
    private String zze = "";

    static {
        yz0 yz0Var = new yz0();
        zzf = yz0Var;
        ss1.t(yz0.class, yz0Var);
    }

    public static xz0 z() {
        return (xz0) zzf.q();
    }

    public final /* synthetic */ void A(String str) {
        str.getClass();
        this.zza |= 1;
        this.zzc = str;
    }

    public final void B(int i10) {
        List list = this.zzb;
        if (!((sr1) list).f20043a) {
            int size = list.size();
            this.zzb = ((ts1) list).e(size + size);
        }
        ((ts1) this.zzb).n(2);
    }

    @Override // com.google.android.gms.internal.ads.ss1
    public final Object v(int i10, ss1 ss1Var) {
        tt1 rs1Var;
        int iC = v0.i.c(i10);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new xt1(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ࠞ\u0002ဈ\u0000\u0003ဈ\u0001\u0004ဈ\u0002", new Object[]{"zza", "zzb", nd.f17776y, "zzc", "zzd", "zze"});
        }
        if (iC == 3) {
            return new yz0();
        }
        if (iC == 4) {
            return new xz0(zzf);
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
        synchronized (yz0.class) {
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
}
