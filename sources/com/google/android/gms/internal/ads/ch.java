package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ch extends ss1 {
    private static final ch zzd;
    private static volatile tt1 zze;
    private int zza;
    private kh zzb;
    private ws1 zzc = ts1.f20489e;

    static {
        ch chVar = new ch();
        zzd = chVar;
        ss1.t(ch.class, chVar);
    }

    public static ch B(byte[] bArr, ks1 ks1Var) throws et1 {
        ss1 ss1VarX = ss1.x(zzd, bArr, bArr.length, ks1Var);
        ss1.y(ss1VarX);
        return (ch) ss1VarX;
    }

    public final List A() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.ss1
    public final Object v(int i10, ss1 ss1Var) {
        tt1 rs1Var;
        int iC = v0.i.c(i10);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new xt1(zzd, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002'", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iC == 3) {
            return new ch();
        }
        if (iC == 4) {
            return new qd(zzd);
        }
        if (iC == 5) {
            return zzd;
        }
        if (iC != 6) {
            throw null;
        }
        tt1 tt1Var = zze;
        if (tt1Var != null) {
            return tt1Var;
        }
        synchronized (ch.class) {
            try {
                rs1Var = zze;
                if (rs1Var == null) {
                    rs1Var = new rs1(zzd);
                    zze = rs1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return rs1Var;
    }

    public final kh z() {
        kh khVar = this.zzb;
        return khVar == null ? kh.D() : khVar;
    }
}
