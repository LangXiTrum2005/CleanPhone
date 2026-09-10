package com.google.android.gms.internal.ads;

import androidx.core.app.NotificationCompat;
import com.applovin.shadow.okhttp3.internal.http2.Http2;
import com.applovin.shadow.okio.Segment;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class je extends ss1 {
    private static final je zzbo;
    private static volatile tt1 zzbp;
    private long zzA;
    private long zzB;
    private long zzC;
    private long zzD;
    private long zzH;
    private long zzI;
    private long zzJ;
    private long zzL;
    private ke zzO;
    private int zza;
    private int zzaA;
    private String zzaB;
    private at1 zzaC;
    private int zzaD;
    private at1 zzaE;
    private ee zzaF;
    private de zzaG;
    private String zzaH;
    private long zzaI;
    private long zzaJ;
    private long zzaK;
    private long zzaL;
    private long zzaM;
    private long zzaN;
    private long zzaO;
    private String zzaP;
    private long zzaQ;
    private ae zzaR;
    private be zzaS;
    private long zzaT;
    private long zzaU;
    private int zzaV;
    private String zzaW;
    private String zzaX;
    private long zzaY;
    private long zzaZ;
    private ge zzag;
    private at1 zzah;
    private ie zzai;
    private long zzaj;
    private long zzak;
    private long zzal;
    private long zzam;
    private long zzan;
    private long zzao;
    private long zzap;
    private long zzaq;
    private String zzar;
    private long zzas;
    private int zzat;
    private int zzau;
    private int zzav;
    private int zzaw;
    private te zzax;
    private long zzay;
    private int zzaz;
    private int zzb;
    private int zzba;
    private zd zzbb;
    private boolean zzbc;
    private long zzbd;
    private String zzbe;
    private int zzbf;
    private boolean zzbg;
    private String zzbh;
    private long zzbi;
    private se zzbj;
    private long zzbk;
    private String zzbl;
    private ws1 zzbm;
    private long zzbn;
    private int zzc;
    private int zzd;
    private long zzg;
    private long zzh;
    private long zzi;
    private long zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private long zzv;
    private long zzw;
    private long zzx;
    private long zzy;
    private long zzz;
    private String zze = "";
    private String zzf = "";
    private String zzu = "";
    private String zzE = "";
    private String zzF = "D";
    private String zzG = "";
    private String zzK = "";
    private long zzM = -1;
    private long zzN = -1;
    private long zzP = -1;
    private long zzQ = -1;
    private long zzR = -1;
    private long zzS = -1;
    private long zzT = -1;
    private long zzU = -1;
    private String zzV = "D";
    private String zzW = "D";
    private long zzX = -1;
    private int zzY = 1000;
    private int zzZ = 1000;
    private long zzaa = -1;
    private long zzab = -1;
    private long zzac = -1;
    private long zzad = -1;
    private long zzae = -1;
    private int zzaf = 1000;

    static {
        je jeVar = new je();
        zzbo = jeVar;
        ss1.t(je.class, jeVar);
    }

    public je() {
        wt1 wt1Var = wt1.f21606e;
        this.zzah = wt1Var;
        this.zzaj = -1L;
        this.zzak = -1L;
        this.zzal = -1L;
        this.zzam = -1L;
        this.zzan = -1L;
        this.zzao = -1L;
        this.zzap = -1L;
        this.zzaq = -1L;
        this.zzar = "D";
        this.zzas = -1L;
        this.zzay = -1L;
        this.zzaz = 1000;
        this.zzaA = 1000;
        this.zzaB = "D";
        this.zzaC = wt1Var;
        this.zzaD = 1000;
        this.zzaE = wt1Var;
        this.zzaH = "";
        this.zzaI = -1L;
        this.zzaJ = -1L;
        this.zzaK = -1L;
        this.zzaL = -1L;
        this.zzaO = -1L;
        this.zzaP = "";
        this.zzaT = -1L;
        this.zzaU = -1L;
        this.zzaW = "";
        this.zzaX = "";
        this.zzaY = -1L;
        this.zzaZ = -1L;
        this.zzbe = "";
        this.zzbf = 2;
        this.zzbh = "";
        this.zzbk = -1L;
        this.zzbl = "";
        this.zzbm = ts1.f20489e;
        this.zzbn = -1L;
    }

    public static xd A0() {
        return (xd) zzbo.q();
    }

    public static je B0() {
        return zzbo;
    }

    public static je z0(byte[] bArr, ks1 ks1Var) {
        return (je) ss1.n(zzbo, bArr, ks1Var);
    }

    public final /* synthetic */ void A(long j10) {
        this.zza |= 33554432;
        this.zzH = j10;
    }

    public final /* synthetic */ void B(long j10) {
        this.zza |= 67108864;
        this.zzI = j10;
    }

    public final /* synthetic */ void C(long j10) {
        this.zza |= 134217728;
        this.zzJ = j10;
    }

    public final /* synthetic */ void C0(String str) {
        str.getClass();
        this.zza |= 1;
        this.zze = str;
    }

    public final /* synthetic */ void D(String str) {
        str.getClass();
        this.zza |= 268435456;
        this.zzK = str;
    }

    public final /* synthetic */ void D0(String str) {
        str.getClass();
        this.zza |= 2;
        this.zzf = str;
    }

    public final /* synthetic */ void E(long j10) {
        this.zza |= 536870912;
        this.zzL = j10;
    }

    public final /* synthetic */ void E0(long j10) {
        this.zza |= 4;
        this.zzg = j10;
    }

    public final /* synthetic */ void F(long j10) {
        this.zza |= 1073741824;
        this.zzM = j10;
    }

    public final /* synthetic */ void F0(long j10) {
        this.zza |= 16;
        this.zzi = j10;
    }

    public final /* synthetic */ void G(long j10) {
        this.zza |= Integer.MIN_VALUE;
        this.zzN = j10;
    }

    public final /* synthetic */ void G0(long j10) {
        this.zza |= 32;
        this.zzj = j10;
    }

    public final /* synthetic */ void H(long j10) {
        this.zzb |= 2;
        this.zzP = j10;
    }

    public final /* synthetic */ void H0(long j10) {
        this.zza |= 1024;
        this.zzo = j10;
    }

    public final /* synthetic */ void I(long j10) {
        this.zzb |= 4;
        this.zzQ = j10;
    }

    public final /* synthetic */ void I0(long j10) {
        this.zza |= com.ironsource.mediationsdk.metadata.a.f29616n;
        this.zzp = j10;
    }

    public final /* synthetic */ void J(long j10) {
        this.zzb |= 8;
        this.zzR = j10;
    }

    public final /* synthetic */ void J0(long j10) {
        this.zza |= Segment.SIZE;
        this.zzv = j10;
    }

    public final /* synthetic */ void K(long j10) {
        this.zzb |= 16;
        this.zzS = j10;
    }

    public final /* synthetic */ void K0(long j10) {
        this.zza |= Http2.INITIAL_MAX_FRAME_SIZE;
        this.zzw = j10;
    }

    public final /* synthetic */ void L(long j10) {
        this.zzb |= 32;
        this.zzT = j10;
    }

    public final /* synthetic */ void L0(long j10) {
        this.zza |= 32768;
        this.zzx = j10;
    }

    public final /* synthetic */ void M(long j10) {
        this.zzb |= 64;
        this.zzU = j10;
    }

    public final /* synthetic */ void M0(long j10) {
        this.zza |= C.DEFAULT_BUFFER_SEGMENT_SIZE;
        this.zzy = j10;
    }

    public final /* synthetic */ void N(String str) {
        str.getClass();
        this.zzb |= 128;
        this.zzV = str;
    }

    public final /* synthetic */ void N0(long j10) {
        this.zza |= 524288;
        this.zzB = j10;
    }

    public final /* synthetic */ void O(String str) {
        str.getClass();
        this.zzb |= NotificationCompat.FLAG_LOCAL_ONLY;
        this.zzW = str;
    }

    public final /* synthetic */ void O0(long j10) {
        this.zza |= ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
        this.zzC = j10;
    }

    public final /* synthetic */ void P(long j10) {
        this.zzb |= 4096;
        this.zzaa = j10;
    }

    public final /* synthetic */ void P0(long j10) {
        this.zza |= 2097152;
        this.zzD = j10;
    }

    public final /* synthetic */ void Q(long j10) {
        this.zzb |= Segment.SIZE;
        this.zzab = j10;
    }

    public final /* synthetic */ void Q0(String str) {
        str.getClass();
        this.zza |= 4194304;
        this.zzE = str;
    }

    public final /* synthetic */ void R(long j10) {
        this.zzb |= Http2.INITIAL_MAX_FRAME_SIZE;
        this.zzac = j10;
    }

    public final /* synthetic */ void S(ge geVar) {
        this.zzag = geVar;
        this.zzb |= 262144;
    }

    public final void T(ge geVar) {
        at1 at1Var = this.zzah;
        if (!((sr1) at1Var).f20043a) {
            int size = at1Var.size();
            this.zzah = at1Var.e(size + size);
        }
        this.zzah.add(geVar);
    }

    public final void U() {
        this.zzah = wt1.f21606e;
    }

    public final /* synthetic */ void V(ie ieVar) {
        this.zzai = ieVar;
        this.zzb |= 524288;
    }

    public final /* synthetic */ void W(long j10) {
        this.zzb |= ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
        this.zzaj = j10;
    }

    public final /* synthetic */ void X(long j10) {
        this.zzb |= 2097152;
        this.zzak = j10;
    }

    public final /* synthetic */ void Y(long j10) {
        this.zzb |= 4194304;
        this.zzal = j10;
    }

    public final boolean Z() {
        return (this.zza & 4194304) != 0;
    }

    public final /* synthetic */ void a0(long j10) {
        this.zzb |= 8388608;
        this.zzam = j10;
    }

    public final /* synthetic */ void b0(long j10) {
        this.zzb |= 16777216;
        this.zzan = j10;
    }

    public final /* synthetic */ void c0(long j10) {
        this.zzb |= 67108864;
        this.zzap = j10;
    }

    public final /* synthetic */ void d0(long j10) {
        this.zzb |= 134217728;
        this.zzaq = j10;
    }

    public final /* synthetic */ void e0(String str) {
        str.getClass();
        this.zzb |= 268435456;
        this.zzar = str;
    }

    public final /* synthetic */ void f0(String str) {
        str.getClass();
        this.zzc |= 1024;
        this.zzaH = str;
    }

    public final /* synthetic */ void g0(long j10) {
        this.zzc |= com.ironsource.mediationsdk.metadata.a.f29616n;
        this.zzaI = j10;
    }

    public final /* synthetic */ void h0(long j10) {
        this.zzc |= 4096;
        this.zzaJ = j10;
    }

    public final /* synthetic */ void i0(long j10) {
        this.zzc |= Segment.SIZE;
        this.zzaK = j10;
    }

    public final /* synthetic */ void j0(long j10) {
        this.zzc |= Http2.INITIAL_MAX_FRAME_SIZE;
        this.zzaL = j10;
    }

    public final /* synthetic */ void k0(String str) {
        str.getClass();
        this.zzc |= 262144;
        this.zzaP = str;
    }

    public final /* synthetic */ void l0(long j10) {
        this.zzc |= 8388608;
        this.zzaU = j10;
    }

    public final /* synthetic */ void m0(long j10) {
        this.zzd |= 32;
        this.zzbi = j10;
    }

    public final /* synthetic */ void n0(se seVar) {
        seVar.getClass();
        this.zzbj = seVar;
        this.zzd |= 64;
    }

    public final /* synthetic */ void o0(int i10) {
        this.zzY = i10 - 1;
        this.zzb |= 1024;
    }

    public final /* synthetic */ void p0(int i10) {
        this.zzZ = i10 - 1;
        this.zzb |= com.ironsource.mediationsdk.metadata.a.f29616n;
    }

    public final /* synthetic */ void q0(int i10) {
        this.zzaf = i10 - 1;
        this.zzb |= 131072;
    }

    public final /* synthetic */ void r0(int i10) {
        this.zzaz = i10 - 1;
        this.zzc |= 16;
    }

    public final /* synthetic */ void s0(int i10) {
        this.zzaA = i10 - 1;
        this.zzc |= 32;
    }

    public final /* synthetic */ void t0(int i10) {
        this.zzaV = i10 - 1;
        this.zzc |= 16777216;
    }

    public final String u0() {
        return this.zzE;
    }

    @Override // com.google.android.gms.internal.ads.ss1
    public final Object v(int i10, ss1 ss1Var) {
        tt1 rs1Var;
        int iC = v0.i.c(i10);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            nd ndVar = nd.f17759g;
            nd ndVar2 = nd.f17764m;
            return new xt1(zzbo, "\u0001n\u0000\u0004\u0001Įn\u0000\u0004\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007\tဂ\b\nဂ\t\u000bဂ\n\fဂ\u000b\rဈ\f\u000eဂ\r\u000fဂ\u000e\u0010ဂ\u000f\u0011ဂ\u0010\u0012ဂ\u0011\u0013ဂ\u0012\u0014ဂ\u0013\u0015ဂ`\u0016ဂ\u0014\u0017ဂ\u0015\u0018ဈa\u0019ဂe\u001a᠌b\u001bဈ\u0016\u001cဇc\u001dဈ\u0018\u001eဈd\u001fဂ\u0019 ဂ\u001a!ဂ\u001b\"ဈ\u001c#ဂ\u001d$ဂ\u001e%ဂ\u001f&ဉ 'ဂ!(ဂ\")ဂ#*ဂ$+\u001b,ဂ%-ဂ&.ဈ'/ဈ(0᠌*1᠌+2ဉ23ဂ,4ဂ-5ဂ.6ဂ/7ဂ08᠌19ဉ3:ဂ4;ဂ5<ဂ6=ဂ7>ဂ:?ဂ;@ဂ=A᠌>B᠌?Cဈ<D᠌AEဉBFဂCGဂ8Hဂ9I᠌DJဂ)Kဈ\u0017L᠌EMဈFN\u001bO᠌GP\u001bQဉHRဈJSဂKTဂLUဂMVဂNWဂOXဂQYဈRZဉT[ဉU\\ဂV]ဂW^᠌X_᠌@`ဉIaဂPbဈYcဈZdဂ[eဂ\\f᠌]gဂShဉ^iဇ_j'kဂiÉဉfĭဂgĮဈh", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzbd", "zzC", "zzD", "zzbe", "zzbi", "zzbf", ndVar, "zzE", "zzbg", "zzG", "zzbh", "zzH", "zzI", "zzJ", "zzK", "zzL", "zzM", "zzN", "zzO", "zzP", "zzQ", "zzR", "zzS", "zzah", ge.class, "zzT", "zzU", "zzV", "zzW", "zzY", ndVar2, "zzZ", ndVar2, "zzag", "zzaa", "zzab", "zzac", "zzad", "zzae", "zzaf", ndVar2, "zzai", "zzaj", "zzak", "zzal", "zzam", "zzap", "zzaq", "zzas", "zzat", nd.l, "zzau", nd.f17765n, "zzar", "zzaw", nd.f17758f, "zzax", "zzay", "zzan", "zzao", "zzaz", ndVar2, "zzX", "zzF", "zzaA", ndVar2, "zzaB", "zzaC", ce.class, "zzaD", ndVar2, "zzaE", yd.class, "zzaF", "zzaH", "zzaI", "zzaJ", "zzaK", "zzaL", "zzaM", "zzaO", "zzaP", "zzaR", "zzaS", "zzaT", "zzaU", "zzaV", nd.f17762j, "zzav", nd.f17760h, "zzaG", "zzaN", "zzaW", "zzaX", "zzaY", "zzaZ", "zzba", nd.f17763k, "zzaQ", "zzbb", "zzbc", "zzbm", "zzbn", "zzbj", "zzbk", "zzbl"});
        }
        if (iC == 3) {
            return new je();
        }
        if (iC == 4) {
            return new xd(zzbo);
        }
        if (iC == 5) {
            return zzbo;
        }
        if (iC != 6) {
            throw null;
        }
        tt1 tt1Var = zzbp;
        if (tt1Var != null) {
            return tt1Var;
        }
        synchronized (je.class) {
            try {
                rs1Var = zzbp;
                if (rs1Var == null) {
                    rs1Var = new rs1(zzbo);
                    zzbp = rs1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return rs1Var;
    }

    public final boolean v0() {
        return (this.zzb & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0;
    }

    public final long w0() {
        return this.zzaj;
    }

    public final boolean x0() {
        return (this.zzd & 64) != 0;
    }

    public final se y0() {
        se seVar = this.zzbj;
        return seVar == null ? se.D() : seVar;
    }

    public final /* synthetic */ void z(String str) {
        str.getClass();
        this.zza |= 16777216;
        this.zzG = str;
    }
}
