package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class n21 extends ss1 {
    private static final n21 zzl;
    private static volatile tt1 zzm;
    private int zza;
    private boolean zzc;
    private boolean zzd;
    private long zzh;
    private boolean zzi;
    private boolean zzb = true;
    private long zze = 600000;
    private long zzf = 3600000;
    private String zzg = "https://pagead2.googlesyndication.com/mads/asp";
    private long zzj = 5;
    private long zzk = ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS;

    static {
        n21 n21Var = new n21();
        zzl = n21Var;
        ss1.t(n21.class, n21Var);
    }

    public static m21 G() {
        return (m21) zzl.q();
    }

    public static n21 H() {
        return zzl;
    }

    public final long A() {
        return this.zzf;
    }

    public final String B() {
        return this.zzg;
    }

    public final long C() {
        return this.zzh;
    }

    public final boolean D() {
        return this.zzi;
    }

    public final long E() {
        return this.zzj;
    }

    public final long F() {
        return this.zzk;
    }

    public final /* synthetic */ void I(boolean z10) {
        this.zza |= 4;
        this.zzd = z10;
    }

    public final /* synthetic */ void J(long j10) {
        this.zza |= 64;
        this.zzh = j10;
    }

    @Override // com.google.android.gms.internal.ads.ss1
    public final Object v(int i10, ss1 ss1Var) {
        tt1 rs1Var;
        int iC = v0.i.c(i10);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new xt1(zzl, "\u0004\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဈ\u0005\u0007ဂ\u0006\bဇ\u0007\tဂ\b\nဂ\t", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (iC == 3) {
            return new n21();
        }
        if (iC == 4) {
            return new m21(zzl);
        }
        if (iC == 5) {
            return zzl;
        }
        if (iC != 6) {
            throw null;
        }
        tt1 tt1Var = zzm;
        if (tt1Var != null) {
            return tt1Var;
        }
        synchronized (n21.class) {
            try {
                rs1Var = zzm;
                if (rs1Var == null) {
                    rs1Var = new rs1(zzl);
                    zzm = rs1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return rs1Var;
    }

    public final boolean z() {
        return this.zzd;
    }
}
