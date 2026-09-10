package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class l21 extends ss1 {
    private static final l21 zzf;
    private static volatile tt1 zzg;
    private int zza;
    private float zzc;
    private String zzb = "https://pagead2.googlesyndication.com/pagead/ping?e=2&f=1";
    private long zzd = 1000;
    private long zze = ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS;

    static {
        l21 l21Var = new l21();
        zzf = l21Var;
        ss1.t(l21.class, l21Var);
    }

    public static k21 D() {
        return (k21) zzf.q();
    }

    public static l21 E() {
        return zzf;
    }

    public final float A() {
        return this.zzc;
    }

    public final long B() {
        return this.zzd;
    }

    public final long C() {
        return this.zze;
    }

    public final /* synthetic */ void F(float f10) {
        this.zza |= 2;
        this.zzc = f10;
    }

    @Override // com.google.android.gms.internal.ads.ss1
    public final Object v(int i10, ss1 ss1Var) {
        tt1 rs1Var;
        int iC = v0.i.c(i10);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new xt1(zzf, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ခ\u0001\u0003ဂ\u0002\u0004ဂ\u0003", new Object[]{"zza", "zzb", "zzc", "zzd", "zze"});
        }
        if (iC == 3) {
            return new l21();
        }
        if (iC == 4) {
            return new k21(zzf);
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
        synchronized (l21.class) {
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

    public final String z() {
        return this.zzb;
    }
}
