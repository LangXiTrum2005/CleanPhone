package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class wm1 extends ss1 {
    private static final wm1 zzd;
    private static volatile tt1 zze;
    private String zza = "";
    private cs1 zzb = cs1.f13248b;
    private int zzc;

    static {
        wm1 wm1Var = new wm1();
        zzd = wm1Var;
        ss1.t(wm1.class, wm1Var);
    }

    public static wm1 C(byte[] bArr, ks1 ks1Var) {
        ss1 ss1VarX = ss1.x(zzd, bArr, bArr.length, ks1Var);
        ss1.y(ss1VarX);
        return (wm1) ss1VarX;
    }

    public static vm1 D() {
        return (vm1) zzd.q();
    }

    public static wm1 E() {
        return zzd;
    }

    public final cs1 A() {
        return this.zzb;
    }

    public final on1 B() {
        on1 on1VarA = on1.a(this.zzc);
        return on1VarA == null ? on1.UNRECOGNIZED : on1VarA;
    }

    public final /* synthetic */ void F(String str) {
        str.getClass();
        this.zza = str;
    }

    public final /* synthetic */ void G(cs1 cs1Var) {
        cs1Var.getClass();
        this.zzb = cs1Var;
    }

    public final /* synthetic */ void H(on1 on1Var) {
        this.zzc = on1Var.zza();
    }

    @Override // com.google.android.gms.internal.ads.ss1
    public final Object v(int i10, ss1 ss1Var) {
        tt1 rs1Var;
        int iC = v0.i.c(i10);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new xt1(zzd, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iC == 3) {
            return new wm1();
        }
        if (iC == 4) {
            return new vm1(zzd);
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
        synchronized (wm1.class) {
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

    public final String z() {
        return this.zza;
    }
}
