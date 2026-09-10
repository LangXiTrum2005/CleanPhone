package com.google.android.gms.internal.ads;

import java.io.ByteArrayInputStream;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class bn1 extends ss1 {
    private static final bn1 zzc;
    private static volatile tt1 zzd;
    private int zza;
    private at1 zzb = wt1.f21606e;

    static {
        bn1 bn1Var = new bn1();
        zzc = bn1Var;
        ss1.t(bn1.class, bn1Var);
    }

    public static bn1 D(byte[] bArr, ks1 ks1Var) {
        ss1 ss1VarX = ss1.x(zzc, bArr, bArr.length, ks1Var);
        ss1.y(ss1VarX);
        return (bn1) ss1VarX;
    }

    public static bn1 E(ByteArrayInputStream byteArrayInputStream, ks1 ks1Var) throws et1 {
        ss1 ss1VarL = ss1.l(zzc, new es1(byteArrayInputStream), ks1Var);
        ss1.y(ss1VarL);
        return (bn1) ss1VarL;
    }

    public static ym1 F() {
        return (ym1) zzc.q();
    }

    public final List A() {
        return this.zzb;
    }

    public final int B() {
        return this.zzb.size();
    }

    public final an1 C(int i10) {
        return (an1) this.zzb.get(i10);
    }

    public final /* synthetic */ void G(int i10) {
        this.zza = i10;
    }

    public final void H(an1 an1Var) {
        at1 at1Var = this.zzb;
        if (!((sr1) at1Var).f20043a) {
            int size = at1Var.size();
            this.zzb = at1Var.e(size + size);
        }
        this.zzb.add(an1Var);
    }

    @Override // com.google.android.gms.internal.ads.ss1
    public final Object v(int i10, ss1 ss1Var) {
        tt1 rs1Var;
        int iC = v0.i.c(i10);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new xt1(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zza", "zzb", an1.class});
        }
        if (iC == 3) {
            return new bn1();
        }
        if (iC == 4) {
            return new ym1(zzc);
        }
        if (iC == 5) {
            return zzc;
        }
        if (iC != 6) {
            throw null;
        }
        tt1 tt1Var = zzd;
        if (tt1Var != null) {
            return tt1Var;
        }
        synchronized (bn1.class) {
            try {
                rs1Var = zzd;
                if (rs1Var == null) {
                    rs1Var = new rs1(zzc);
                    zzd = rs1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return rs1Var;
    }

    public final int z() {
        return this.zza;
    }
}
