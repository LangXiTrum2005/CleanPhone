package com.google.android.gms.internal.ads;

import androidx.core.app.NotificationCompat;
import com.applovin.shadow.okhttp3.internal.http2.Http2;
import com.applovin.shadow.okio.Segment;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ge extends ss1 {
    private static final ge zzA;
    private static volatile tt1 zzB;
    private int zza;
    private long zzu;
    private long zzv;
    private long zzb = -1;
    private long zzc = -1;
    private long zzd = -1;
    private long zze = -1;
    private long zzf = -1;
    private long zzg = -1;
    private int zzh = 1000;
    private long zzi = -1;
    private long zzj = -1;
    private long zzk = -1;
    private int zzl = 1000;
    private long zzm = -1;
    private long zzn = -1;
    private long zzo = -1;
    private long zzp = -1;
    private long zzw = -1;
    private long zzx = -1;
    private long zzy = -1;
    private long zzz = -1;

    static {
        ge geVar = new ge();
        zzA = geVar;
        ss1.t(ge.class, geVar);
    }

    public static fe z() {
        return (fe) zzA.q();
    }

    public final /* synthetic */ void A(long j10) {
        this.zza |= 1;
        this.zzb = j10;
    }

    public final /* synthetic */ void B(long j10) {
        this.zza |= 2;
        this.zzc = j10;
    }

    public final /* synthetic */ void C(long j10) {
        this.zza |= 4;
        this.zzd = j10;
    }

    public final /* synthetic */ void D(long j10) {
        this.zza |= 8;
        this.zze = j10;
    }

    public final /* synthetic */ void E() {
        this.zza &= -9;
        this.zze = -1L;
    }

    public final /* synthetic */ void F(long j10) {
        this.zza |= 16;
        this.zzf = j10;
    }

    public final /* synthetic */ void G(long j10) {
        this.zza |= 32;
        this.zzg = j10;
    }

    public final /* synthetic */ void H(long j10) {
        this.zza |= 128;
        this.zzi = j10;
    }

    public final /* synthetic */ void I(long j10) {
        this.zza |= NotificationCompat.FLAG_LOCAL_ONLY;
        this.zzj = j10;
    }

    public final /* synthetic */ void J(long j10) {
        this.zza |= 512;
        this.zzk = j10;
    }

    public final /* synthetic */ void K(long j10) {
        this.zza |= com.ironsource.mediationsdk.metadata.a.f29616n;
        this.zzm = j10;
    }

    public final /* synthetic */ void L(long j10) {
        this.zza |= 4096;
        this.zzn = j10;
    }

    public final /* synthetic */ void M(long j10) {
        this.zza |= Segment.SIZE;
        this.zzo = j10;
    }

    public final /* synthetic */ void N(long j10) {
        this.zza |= Http2.INITIAL_MAX_FRAME_SIZE;
        this.zzp = j10;
    }

    public final /* synthetic */ void O(long j10) {
        this.zza |= 32768;
        this.zzu = j10;
    }

    public final /* synthetic */ void P(long j10) {
        this.zza |= C.DEFAULT_BUFFER_SEGMENT_SIZE;
        this.zzv = j10;
    }

    public final /* synthetic */ void Q(long j10) {
        this.zza |= 131072;
        this.zzw = j10;
    }

    public final /* synthetic */ void R(long j10) {
        this.zza |= 262144;
        this.zzx = j10;
    }

    public final /* synthetic */ void S(int i10) {
        this.zzh = i10 - 1;
        this.zza |= 64;
    }

    public final /* synthetic */ void T(int i10) {
        this.zzl = i10 - 1;
        this.zza |= 1024;
    }

    @Override // com.google.android.gms.internal.ads.ss1
    public final Object v(int i10, ss1 ss1Var) {
        tt1 rs1Var;
        int iC = v0.i.c(i10);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            nd ndVar = nd.f17764m;
            return new xt1(zzA, "\u0001\u0015\u0000\u0001\u0001\u0015\u0015\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007᠌\u0006\bဂ\u0007\tဂ\b\nဂ\t\u000b᠌\n\fဂ\u000b\rဂ\f\u000eဂ\r\u000fဂ\u000e\u0010ဂ\u000f\u0011ဂ\u0010\u0012ဂ\u0011\u0013ဂ\u0012\u0014ဂ\u0013\u0015ဂ\u0014", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", ndVar, "zzi", "zzj", "zzk", "zzl", ndVar, "zzm", "zzn", "zzo", "zzp", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz"});
        }
        if (iC == 3) {
            return new ge();
        }
        if (iC == 4) {
            return new fe(zzA);
        }
        if (iC == 5) {
            return zzA;
        }
        if (iC != 6) {
            throw null;
        }
        tt1 tt1Var = zzB;
        if (tt1Var != null) {
            return tt1Var;
        }
        synchronized (ge.class) {
            try {
                rs1Var = zzB;
                if (rs1Var == null) {
                    rs1Var = new rs1(zzA);
                    zzB = rs1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return rs1Var;
    }
}
