package com.google.android.gms.internal.ads;

import androidx.core.app.NotificationCompat;
import com.ironsource.Xa;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class h21 extends ss1 {
    private static final h21 zzE;
    private static volatile tt1 zzF;
    private boolean zzC;
    private boolean zzD;
    private int zza;
    private int zzb;
    private boolean zze;
    private boolean zzf;
    private int zzh;
    private l21 zzj;
    private boolean zzk;
    private n21 zzn;
    private int zzc = 1;
    private boolean zzd = true;
    private String zzg = "unknown_host";
    private boolean zzi = true;
    private long zzl = 100;
    private long zzm = 2000;
    private long zzo = 10;
    private long zzp = 100;
    private long zzu = 20000;
    private String zzv = "";
    private String zzw = "";
    private long zzx = 500;
    private long zzy = Xa.C;
    private boolean zzz = true;
    private boolean zzA = true;
    private boolean zzB = true;

    static {
        h21 h21Var = new h21();
        zzE = h21Var;
        ss1.t(h21.class, h21Var);
    }

    public static g21 j0() {
        return (g21) zzE.q();
    }

    public final /* synthetic */ void A(String str) {
        str.getClass();
        this.zza |= 32;
        this.zzg = str;
    }

    public final /* synthetic */ void B(l21 l21Var) {
        this.zzj = l21Var;
        this.zza |= NotificationCompat.FLAG_LOCAL_ONLY;
    }

    public final /* synthetic */ void C(long j10) {
        this.zza |= 1024;
        this.zzl = j10;
    }

    public final /* synthetic */ void D(long j10) {
        this.zza |= com.ironsource.mediationsdk.metadata.a.f29616n;
        this.zzm = j10;
    }

    public final /* synthetic */ void E(n21 n21Var) {
        this.zzn = n21Var;
        this.zza |= 4096;
    }

    public final /* synthetic */ void F(long j10) {
        this.zza |= 524288;
        this.zzy = j10;
    }

    public final /* synthetic */ void G(boolean z10) {
        this.zza |= ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
        this.zzz = z10;
    }

    public final /* synthetic */ void H(boolean z10) {
        this.zza |= 16777216;
        this.zzD = z10;
    }

    public final int I() {
        int iO = pi1.o(this.zzb);
        if (iO == 0) {
            return 1;
        }
        return iO;
    }

    public final int J() {
        int iO = pi1.o(this.zzc);
        if (iO == 0) {
            return 2;
        }
        return iO;
    }

    public final int K() {
        int i10 = this.zzh;
        int i11 = 2;
        if (i10 != 0) {
            if (i10 == 1) {
                i11 = 3;
            } else if (i10 != 2) {
                i11 = i10 != 3 ? 0 : 5;
            } else {
                i11 = 4;
            }
        }
        if (i11 == 0) {
            return 1;
        }
        return i11;
    }

    public final /* synthetic */ void L(int i10) {
        this.zzb = i10 - 1;
        this.zza |= 1;
    }

    public final void M() {
        this.zzh = 1;
        this.zza |= 64;
    }

    public final boolean N() {
        return this.zzd;
    }

    public final boolean O() {
        return this.zze;
    }

    public final boolean P() {
        return this.zzf;
    }

    public final String Q() {
        return this.zzg;
    }

    public final boolean R() {
        return this.zzi;
    }

    public final l21 S() {
        l21 l21Var = this.zzj;
        return l21Var == null ? l21.E() : l21Var;
    }

    public final boolean T() {
        return this.zzk;
    }

    public final long U() {
        return this.zzl;
    }

    public final long V() {
        return this.zzm;
    }

    public final n21 W() {
        n21 n21Var = this.zzn;
        return n21Var == null ? n21.H() : n21Var;
    }

    public final long X() {
        return this.zzo;
    }

    public final long Y() {
        return this.zzp;
    }

    public final long Z() {
        return this.zzu;
    }

    public final String a0() {
        return this.zzv;
    }

    public final String b0() {
        return this.zzw;
    }

    public final long c0() {
        return this.zzx;
    }

    public final long d0() {
        return this.zzy;
    }

    public final boolean e0() {
        return this.zzz;
    }

    public final boolean f0() {
        return this.zzA;
    }

    public final boolean g0() {
        return this.zzB;
    }

    public final boolean h0() {
        return this.zzC;
    }

    public final boolean i0() {
        return this.zzD;
    }

    public final /* synthetic */ void k0(boolean z10) {
        this.zza |= 4;
        this.zzd = z10;
    }

    public final /* synthetic */ void l0(boolean z10) {
        this.zza |= 8;
        this.zze = z10;
    }

    @Override // com.google.android.gms.internal.ads.ss1
    public final Object v(int i10, ss1 ss1Var) {
        tt1 rs1Var;
        int iC = v0.i.c(i10);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            nd ndVar = nd.A;
            return new xt1(zzE, "\u0004\u0019\u0000\u0001\u0001\u001a\u0019\u0000\u0000\u0000\u0001᠌\u0000\u0003ဈ\u0005\u0004ဇ\u0007\u0005ဉ\b\u0006ဇ\t\u0007ဂ\u000b\bဉ\f\tဇ\u0002\nဂ\r\u000bဂ\u000e\fဂ\u000f\rဈ\u0010\u000eဈ\u0011\u000fဂ\u0012\u0010ဂ\u0013\u0011ဇ\u0014\u0012ဂ\n\u0013ဇ\u0015\u0014ဇ\u0016\u0015ဇ\u0017\u0016᠌\u0001\u0017ဇ\u0003\u0018ဇ\u0004\u0019ဌ\u0006\u001aဇ\u0018", new Object[]{"zza", "zzb", ndVar, "zzg", "zzi", "zzj", "zzk", "zzm", "zzn", "zzd", "zzo", "zzp", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzl", "zzA", "zzB", "zzC", "zzc", ndVar, "zze", "zzf", "zzh", "zzD"});
        }
        if (iC == 3) {
            return new h21();
        }
        if (iC == 4) {
            return new g21(zzE);
        }
        if (iC == 5) {
            return zzE;
        }
        if (iC != 6) {
            throw null;
        }
        tt1 tt1Var = zzF;
        if (tt1Var != null) {
            return tt1Var;
        }
        synchronized (h21.class) {
            try {
                rs1Var = zzF;
                if (rs1Var == null) {
                    rs1Var = new rs1(zzE);
                    zzF = rs1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return rs1Var;
    }

    public final /* synthetic */ void z(boolean z10) {
        this.zza |= 16;
        this.zzf = z10;
    }
}
