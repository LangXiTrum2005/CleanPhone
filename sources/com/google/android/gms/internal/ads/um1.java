package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class um1 extends ss1 {
    private static final um1 zzd;
    private static volatile tt1 zze;
    private String zza = "";
    private cs1 zzb = cs1.f13248b;
    private int zzc;

    static {
        um1 um1Var = new um1();
        zzd = um1Var;
        ss1.t(um1.class, um1Var);
    }

    public static tm1 C() {
        return (tm1) zzd.q();
    }

    public static um1 D() {
        return zzd;
    }

    public final cs1 A() {
        return this.zzb;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0014 A[PHI: r1
  0x0014: PHI (r1v1 int) = (r1v0 int), (r1v2 int) binds: [B:5:0x0006, B:9:0x000c] A[DONT_GENERATE, DONT_INLINE]] */
    public final int B() {
        int i10 = this.zzc;
        int i11 = 1;
        if (i10 != 0) {
            int i12 = 2;
            if (i10 != 1) {
                i11 = 3;
                if (i10 != 2) {
                    i12 = 4;
                    if (i10 != 3) {
                        i11 = i10 != 4 ? 0 : 5;
                    } else {
                        i11 = i12;
                    }
                }
            } else {
                i11 = i12;
            }
        }
        if (i11 == 0) {
            return 6;
        }
        return i11;
    }

    public final /* synthetic */ void E(String str) {
        str.getClass();
        this.zza = str;
    }

    public final /* synthetic */ void F(cs1 cs1Var) {
        cs1Var.getClass();
        this.zzb = cs1Var;
    }

    public final void G(int i10) {
        int i11;
        if (i10 == 6) {
            bt1.a();
            throw null;
        }
        switch (i10) {
            case 1:
                i11 = 0;
                break;
            case 2:
                i11 = 1;
                break;
            case 3:
                i11 = 2;
                break;
            case 4:
                i11 = 3;
                break;
            case 5:
                i11 = 4;
                break;
            case 6:
                i11 = -1;
                break;
            default:
                throw null;
        }
        this.zzc = i11;
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
            return new um1();
        }
        if (iC == 4) {
            return new tm1(zzd);
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
        synchronized (um1.class) {
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
