package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class en1 extends ss1 {
    private static final en1 zze;
    private static volatile tt1 zzf;
    private String zza = "";
    private int zzb;
    private int zzc;
    private int zzd;

    static {
        en1 en1Var = new en1();
        zze = en1Var;
        ss1.t(en1.class, en1Var);
    }

    public static dn1 z() {
        return (dn1) zze.q();
    }

    public final /* synthetic */ void A(String str) {
        str.getClass();
        this.zza = str;
    }

    public final /* synthetic */ void B(int i10) {
        this.zzc = i10;
    }

    public final /* synthetic */ void C(on1 on1Var) {
        this.zzd = on1Var.zza();
    }

    public final void D(int i10) {
        if (i10 != 1) {
            this.zzb = i10 - 2;
        } else {
            bt1.a();
            throw null;
        }
    }

    @Override // com.google.android.gms.internal.ads.ss1
    public final Object v(int i10, ss1 ss1Var) {
        tt1 rs1Var;
        int iC = v0.i.c(i10);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new xt1(zze, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (iC == 3) {
            return new en1();
        }
        if (iC == 4) {
            return new dn1(zze);
        }
        if (iC == 5) {
            return zze;
        }
        if (iC != 6) {
            throw null;
        }
        tt1 tt1Var = zzf;
        if (tt1Var != null) {
            return tt1Var;
        }
        synchronized (en1.class) {
            try {
                rs1Var = zzf;
                if (rs1Var == null) {
                    rs1Var = new rs1(zze);
                    zzf = rs1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return rs1Var;
    }
}
