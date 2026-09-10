package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class bk extends ss1 {
    private static final bk zzB;
    private static volatile tt1 zzC = null;
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    public static final int zze = 5;
    public static final int zzf = 6;
    public static final int zzg = 7;
    public static final int zzh = 8;
    public static final int zzi = 9;
    public static final int zzj = 10;
    public static final int zzk = 11;
    private ck zzA;
    private int zzl;
    private int zzm = 1000;
    private int zzn = 1000;
    private int zzo;
    private int zzp;
    private int zzu;
    private int zzv;
    private int zzw;
    private int zzx;
    private int zzy;
    private int zzz;

    static {
        bk bkVar = new bk();
        zzB = bkVar;
        ss1.t(bk.class, bkVar);
    }

    @Override // com.google.android.gms.internal.ads.ss1
    public final Object v(int i10, ss1 ss1Var) {
        tt1 rs1Var;
        int iC = v0.i.c(i10);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            nd ndVar = nd.f17775x;
            return new xt1(zzB, "\u0004\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007င\u0006\bင\u0007\tင\b\nင\t\u000bဉ\n", new Object[]{"zzl", "zzm", ndVar, "zzn", ndVar, "zzo", "zzp", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA"});
        }
        if (iC == 3) {
            return new bk();
        }
        if (iC == 4) {
            return new qd(zzB);
        }
        if (iC == 5) {
            return zzB;
        }
        if (iC != 6) {
            throw null;
        }
        tt1 tt1Var = zzC;
        if (tt1Var != null) {
            return tt1Var;
        }
        synchronized (bk.class) {
            try {
                rs1Var = zzC;
                if (rs1Var == null) {
                    rs1Var = new rs1(zzB);
                    zzC = rs1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return rs1Var;
    }
}
