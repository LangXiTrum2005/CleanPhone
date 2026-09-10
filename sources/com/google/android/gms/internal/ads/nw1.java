package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class nw1 extends ss1 {
    private static final nw1 zzn;
    private static volatile tt1 zzo;
    private int zza;
    private int zzd;
    private boolean zzf;
    private boolean zzh;
    private int zzi;
    private int zzj;
    private pw1 zzk;
    private mw1 zzm;
    private String zzb = "";
    private String zzc = "";
    private int zze = 1;
    private String zzg = "";
    private String zzl = "";

    static {
        nw1 nw1Var = new nw1();
        zzn = nw1Var;
        ss1.t(nw1.class, nw1Var);
    }

    @Override // com.google.android.gms.internal.ads.ss1
    public final Object v(int i10, ss1 ss1Var) {
        tt1 rs1Var;
        int iC = v0.i.c(i10);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new xt1(zzn, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003᠌\u0002\u0004᠌\u0003\u0005ဇ\u0004\u0006ဈ\u0005\u0007ဇ\u0006\bင\u0007\t᠌\b\nဉ\t\u000bဈ\n\fဉ\u000b", new Object[]{"zza", "zzb", "zzc", "zzd", bv1.f12915u, "zze", bv1.f12914t, "zzf", "zzg", "zzh", "zzi", "zzj", bv1.f12913s, "zzk", "zzl", "zzm"});
        }
        if (iC == 3) {
            return new nw1();
        }
        if (iC == 4) {
            return new fu1(zzn);
        }
        if (iC == 5) {
            return zzn;
        }
        if (iC != 6) {
            throw null;
        }
        tt1 tt1Var = zzo;
        if (tt1Var != null) {
            return tt1Var;
        }
        synchronized (nw1.class) {
            try {
                rs1Var = zzo;
                if (rs1Var == null) {
                    rs1Var = new rs1(zzn);
                    zzo = rs1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return rs1Var;
    }
}
