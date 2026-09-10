package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class xv1 extends ss1 {
    private static final xv1 zzl;
    private static volatile tt1 zzm;
    private int zza;
    private int zzb;
    private nv1 zzd;
    private pv1 zze;
    private int zzf;
    private int zzi;
    private byte zzk = 2;
    private String zzc = "";
    private ws1 zzg = ts1.f20489e;
    private String zzh = "";
    private at1 zzj = wt1.f21606e;

    static {
        xv1 xv1Var = new xv1();
        zzl = xv1Var;
        ss1.t(xv1.class, xv1Var);
    }

    public static wv1 B() {
        return (wv1) zzl.q();
    }

    public final int A() {
        return this.zzj.size();
    }

    public final /* synthetic */ void C(int i10) {
        this.zza |= 1;
        this.zzb = i10;
    }

    public final /* synthetic */ void D(String str) {
        str.getClass();
        this.zza |= 2;
        this.zzc = str;
    }

    public final /* synthetic */ void E(nv1 nv1Var) {
        this.zzd = nv1Var;
        this.zza |= 4;
    }

    public final void F(String str) {
        str.getClass();
        at1 at1Var = this.zzj;
        if (!((sr1) at1Var).f20043a) {
            int size = at1Var.size();
            this.zzj = at1Var.e(size + size);
        }
        this.zzj.add(str);
    }

    public final /* synthetic */ void G(int i10) {
        this.zzi = i10 - 1;
        this.zza |= 64;
    }

    @Override // com.google.android.gms.internal.ads.ss1
    public final Object v(int i10, ss1 ss1Var) {
        tt1 rs1Var;
        switch (v0.i.c(i10)) {
            case 0:
                return Byte.valueOf(this.zzk);
            case 1:
                this.zzk = ss1Var == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return new xt1(zzl, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0002\u0003\u0001ᔄ\u0000\u0002ဈ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005င\u0004\u0006\u0016\u0007ဈ\u0005\b᠌\u0006\t\u001a", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", bv1.l, "zzj"});
            case 3:
                return new xv1();
            case 4:
                return new wv1(zzl);
            case 5:
                return zzl;
            case 6:
                tt1 tt1Var = zzm;
                if (tt1Var != null) {
                    return tt1Var;
                }
                synchronized (xv1.class) {
                    try {
                        rs1Var = zzm;
                        if (rs1Var == null) {
                            rs1Var = new rs1(zzl);
                            zzm = rs1Var;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                return rs1Var;
            default:
                throw null;
        }
    }

    public final String z() {
        return this.zzc;
    }
}
