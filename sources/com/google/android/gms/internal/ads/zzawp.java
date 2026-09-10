package com.google.android.gms.internal.ads;

import com.applovin.shadow.okio.Segment;

/* JADX INFO: loaded from: classes4.dex */
public final class zzawp extends zziar implements zzicd {
    private static final zzawp zzbe;
    private static volatile zzick zzbf;
    private long zzA;
    private long zzB;
    private long zzC;
    private long zzD;
    private long zzH;
    private long zzI;
    private long zzJ;
    private long zzL;
    private zzawr zzO;
    private int zza;
    private zzawk zzaF;
    private zzawi zzaG;
    private long zzaM;
    private long zzaN;
    private zzawa zzaQ;
    private zzawc zzaR;
    private int zzaU;
    private long zzaV;
    private boolean zzaY;
    private zzawm zzag;
    private zzawo zzai;
    private int zzat;
    private int zzau;
    private int zzav;
    private int zzaw;
    private zzaxe zzax;
    private int zzb;
    private long zzba;
    private zzaxc zzbb;
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
    private zzibd zzah = zziar.zzbM();
    private long zzaj = -1;
    private long zzak = -1;
    private long zzal = -1;
    private long zzam = -1;
    private long zzan = -1;
    private long zzao = -1;
    private long zzap = -1;
    private long zzaq = -1;
    private String zzar = "D";
    private long zzas = -1;
    private long zzay = -1;
    private int zzaz = 1000;
    private int zzaA = 1000;
    private String zzaB = "D";
    private zzibd zzaC = zziar.zzbM();
    private int zzaD = 1000;
    private zzibd zzaE = zziar.zzbM();
    private String zzaH = "";
    private long zzaI = -1;
    private long zzaJ = -1;
    private long zzaK = -1;
    private long zzaL = -1;
    private long zzaO = -1;
    private String zzaP = "";
    private long zzaS = -1;
    private long zzaT = -1;
    private String zzaW = "";
    private int zzaX = 2;
    private String zzaZ = "";
    private long zzbc = -1;
    private String zzbd = "";

    static {
        zzawp zzawpVar = new zzawp();
        zzbe = zzawpVar;
        zziar.zzbu(zzawp.class, zzawpVar);
    }

    private zzawp() {
    }

    public static zzawp zzi(byte[] bArr, zziab zziabVar) throws zzibg {
        return (zzawp) zziar.zzbV(zzbe, bArr, zziabVar);
    }

    public static zzavs zzj() {
        return (zzavs) zzbe.zzbn();
    }

    public static zzawp zzk() {
        return zzbe;
    }

    public final /* synthetic */ void zzA(String str) {
        str.getClass();
        this.zza |= 16777216;
        this.zzG = str;
    }

    public final /* synthetic */ void zzB(long j) {
        this.zza |= 33554432;
        this.zzH = j;
    }

    public final /* synthetic */ void zzC(long j) {
        this.zza |= 67108864;
        this.zzI = j;
    }

    public final /* synthetic */ void zzD(long j) {
        this.zza |= 134217728;
        this.zzJ = j;
    }

    public final /* synthetic */ void zzE(String str) {
        str.getClass();
        this.zza |= 268435456;
        this.zzK = str;
    }

    public final /* synthetic */ void zzF(long j) {
        this.zza |= 536870912;
        this.zzL = j;
    }

    public final /* synthetic */ void zzG(long j) {
        this.zza |= 1073741824;
        this.zzM = j;
    }

    public final /* synthetic */ void zzH(long j) {
        this.zza |= Integer.MIN_VALUE;
        this.zzN = j;
    }

    public final /* synthetic */ void zzI(long j) {
        this.zzb |= 2;
        this.zzP = j;
    }

    public final /* synthetic */ void zzJ(long j) {
        this.zzb |= 4;
        this.zzQ = j;
    }

    public final /* synthetic */ void zzK(long j) {
        this.zzb |= 8;
        this.zzR = j;
    }

    public final /* synthetic */ void zzL(long j) {
        this.zzb |= 16;
        this.zzS = j;
    }

    public final /* synthetic */ void zzM(long j) {
        this.zzb |= 32;
        this.zzT = j;
    }

    public final /* synthetic */ void zzN(long j) {
        this.zzb |= 64;
        this.zzU = j;
    }

    public final /* synthetic */ void zzO(String str) {
        str.getClass();
        this.zzb |= 128;
        this.zzV = str;
    }

    public final /* synthetic */ void zzP(String str) {
        str.getClass();
        this.zzb |= 256;
        this.zzW = str;
    }

    public final /* synthetic */ void zzQ(long j) {
        this.zzb |= 4096;
        this.zzaa = j;
    }

    public final /* synthetic */ void zzR(long j) {
        this.zzb |= Segment.SIZE;
        this.zzab = j;
    }

    public final /* synthetic */ void zzS(long j) {
        this.zzb |= 16384;
        this.zzac = j;
    }

    public final /* synthetic */ void zzT(zzawm zzawmVar) {
        zzawmVar.getClass();
        this.zzag = zzawmVar;
        this.zzb |= 262144;
    }

    public final /* synthetic */ void zzU(zzawm zzawmVar) {
        zzawmVar.getClass();
        zzibd zzibdVar = this.zzah;
        if (!zzibdVar.zza()) {
            this.zzah = zziar.zzbN(zzibdVar);
        }
        this.zzah.add(zzawmVar);
    }

    public final /* synthetic */ void zzV() {
        this.zzah = zziar.zzbM();
    }

    public final /* synthetic */ void zzW(zzawo zzawoVar) {
        zzawoVar.getClass();
        this.zzai = zzawoVar;
        this.zzb |= 524288;
    }

    public final /* synthetic */ void zzX(long j) {
        this.zzb |= 1048576;
        this.zzaj = j;
    }

    public final /* synthetic */ void zzY(long j) {
        this.zzb |= 2097152;
        this.zzak = j;
    }

    public final /* synthetic */ void zzZ(long j) {
        this.zzb |= 4194304;
        this.zzal = j;
    }

    public final boolean zza() {
        return (this.zza & 4194304) != 0;
    }

    public final /* synthetic */ void zzaa(long j) {
        this.zzb |= 8388608;
        this.zzam = j;
    }

    public final /* synthetic */ void zzab(long j) {
        this.zzb |= 16777216;
        this.zzan = j;
    }

    public final /* synthetic */ void zzac(long j) {
        this.zzb |= 67108864;
        this.zzap = j;
    }

    public final /* synthetic */ void zzad(long j) {
        this.zzb |= 134217728;
        this.zzaq = j;
    }

    public final /* synthetic */ void zzae(String str) {
        str.getClass();
        this.zzb |= 268435456;
        this.zzar = str;
    }

    public final /* synthetic */ void zzaf(String str) {
        str.getClass();
        this.zzc |= 1024;
        this.zzaH = str;
    }

    public final /* synthetic */ void zzag(long j) {
        this.zzc |= com.p004ironsource.mediationsdk.metadata.a.f25965n;
        this.zzaI = j;
    }

    public final /* synthetic */ void zzah(long j) {
        this.zzc |= 4096;
        this.zzaJ = j;
    }

    public final /* synthetic */ void zzai(long j) {
        this.zzc |= Segment.SIZE;
        this.zzaK = j;
    }

    public final /* synthetic */ void zzaj(long j) {
        this.zzc |= 16384;
        this.zzaL = j;
    }

    public final /* synthetic */ void zzak(String str) {
        str.getClass();
        this.zzc |= 262144;
        this.zzaP = str;
    }

    public final /* synthetic */ void zzal(long j) {
        this.zzc |= 4194304;
        this.zzaT = j;
    }

    public final /* synthetic */ void zzam(long j) {
        this.zzc |= 536870912;
        this.zzba = j;
    }

    public final /* synthetic */ void zzan(zzaxc zzaxcVar) {
        zzaxcVar.getClass();
        this.zzbb = zzaxcVar;
        this.zzc |= 1073741824;
    }

    public final /* synthetic */ void zzap(int i2) {
        this.zzY = i2 - 1;
        this.zzb |= 1024;
    }

    public final /* synthetic */ void zzaq(int i2) {
        this.zzZ = i2 - 1;
        this.zzb |= com.p004ironsource.mediationsdk.metadata.a.f25965n;
    }

    public final /* synthetic */ void zzar(int i2) {
        this.zzaf = i2 - 1;
        this.zzb |= 131072;
    }

    public final /* synthetic */ void zzas(int i2) {
        this.zzaz = i2 - 1;
        this.zzc |= 16;
    }

    public final /* synthetic */ void zzat(int i2) {
        this.zzaA = i2 - 1;
        this.zzc |= 32;
    }

    public final /* synthetic */ void zzau(int i2) {
        this.zzaU = i2 - 1;
        this.zzc |= 8388608;
    }

    public final String zzb() {
        return this.zzE;
    }

    public final boolean zzc() {
        return (this.zzb & 1048576) != 0;
    }

    public final long zzd() {
        return this.zzaj;
    }

    @Override // com.google.android.gms.internal.ads.zziar
    public final Object zzdc(zziaq zziaqVar, Object obj, Object obj2) {
        zzick zziamVar;
        int iOrdinal = zziaqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            zziax zziaxVar = zzavw.zza;
            zziax zziaxVar2 = zzawx.zza;
            return zziar.zzbv(zzbe, "\u0001d\u0000\u0004\u0001Įd\u0000\u0003\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007\tဂ\b\nဂ\t\u000bဂ\n\fဂ\u000b\rဈ\f\u000eဂ\r\u000fဂ\u000e\u0010ဂ\u000f\u0011ဂ\u0010\u0012ဂ\u0011\u0013ဂ\u0012\u0014ဂ\u0013\u0015ဂX\u0016ဂ\u0014\u0017ဂ\u0015\u0018ဈY\u0019ဂ]\u001a᠌Z\u001bဈ\u0016\u001cဇ[\u001dဈ\u0018\u001eဈ\\\u001fဂ\u0019 ဂ\u001a!ဂ\u001b\"ဈ\u001c#ဂ\u001d$ဂ\u001e%ဂ\u001f&ဉ 'ဂ!(ဂ\")ဂ#*ဂ$+\u001b,ဂ%-ဂ&.ဈ'/ဈ(0᠌*1᠌+2ဉ23ဂ,4ဂ-5ဂ.6ဂ/7ဂ08᠌19ဉ3:ဂ4;ဂ5<ဂ6=ဂ7>ဂ:?ဂ;@ဂ=A᠌>B᠌?Cဈ<D᠌AEဉBFဂCGဂ8Hဂ9I᠌DJဂ)Kဈ\u0017L᠌EMဈFN\u001bO᠌GP\u001bQဉHRဈJSဂKTဂLUဂMVဂNWဂOXဂQYဈRZဉS[ဉT\\ဂU]ဂV^᠌W_᠌@`ဉIaဂPÉဉ^ĭဂ_Įဈ`", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzaV", "zzC", "zzD", "zzaW", "zzba", "zzaX", zziaxVar, "zzE", "zzaY", "zzG", "zzaZ", "zzH", "zzI", "zzJ", "zzK", "zzL", "zzM", "zzN", "zzO", "zzP", "zzQ", "zzR", "zzS", "zzah", zzawm.class, "zzT", "zzU", "zzV", "zzW", "zzY", zziaxVar2, "zzZ", zziaxVar2, "zzag", "zzaa", "zzab", "zzac", "zzad", "zzae", "zzaf", zziaxVar2, "zzai", "zzaj", "zzak", "zzal", "zzam", "zzap", "zzaq", "zzas", "zzat", zzaww.zza, "zzau", zzaxa.zza, "zzar", "zzaw", zzavt.zza, "zzax", "zzay", "zzan", "zzao", "zzaz", zziaxVar2, "zzX", "zzF", "zzaA", zziaxVar2, "zzaB", "zzaC", zzawg.class, "zzaD", zziaxVar2, "zzaE", zzavv.class, "zzaF", "zzaH", "zzaI", "zzaJ", "zzaK", "zzaL", "zzaM", "zzaO", "zzaP", "zzaQ", "zzaR", "zzaS", "zzaT", "zzaU", zzawd.zza, "zzav", zzavx.zza, "zzaG", "zzaN", "zzbb", "zzbc", "zzbd"});
        }
        if (iOrdinal == 3) {
            return new zzawp();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzavs(bArr);
        }
        if (iOrdinal == 5) {
            return zzbe;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzick zzickVar = zzbf;
        if (zzickVar != null) {
            return zzickVar;
        }
        synchronized (zzawp.class) {
            try {
                zziamVar = zzbf;
                if (zziamVar == null) {
                    zziamVar = new zziam(zzbe);
                    zzbf = zziamVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zziamVar;
    }

    public final long zze() {
        return this.zzan;
    }

    public final boolean zzg() {
        return (this.zzc & 1073741824) != 0;
    }

    public final zzaxc zzh() {
        zzaxc zzaxcVar = this.zzbb;
        return zzaxcVar == null ? zzaxc.zze() : zzaxcVar;
    }

    public final /* synthetic */ void zzl(String str) {
        str.getClass();
        this.zza |= 1;
        this.zze = str;
    }

    public final /* synthetic */ void zzm(String str) {
        str.getClass();
        this.zza |= 2;
        this.zzf = str;
    }

    public final /* synthetic */ void zzn(long j) {
        this.zza |= 4;
        this.zzg = j;
    }

    public final /* synthetic */ void zzo(long j) {
        this.zza |= 16;
        this.zzi = j;
    }

    public final /* synthetic */ void zzp(long j) {
        this.zza |= 32;
        this.zzj = j;
    }

    public final /* synthetic */ void zzq(long j) {
        this.zza |= 1024;
        this.zzo = j;
    }

    public final /* synthetic */ void zzr(long j) {
        this.zza |= com.p004ironsource.mediationsdk.metadata.a.f25965n;
        this.zzp = j;
    }

    public final /* synthetic */ void zzs(long j) {
        this.zza |= Segment.SIZE;
        this.zzv = j;
    }

    public final /* synthetic */ void zzt(long j) {
        this.zza |= 16384;
        this.zzw = j;
    }

    public final /* synthetic */ void zzu(long j) {
        this.zza |= 32768;
        this.zzx = j;
    }

    public final /* synthetic */ void zzv(long j) {
        this.zza |= 65536;
        this.zzy = j;
    }

    public final /* synthetic */ void zzw(long j) {
        this.zza |= 524288;
        this.zzB = j;
    }

    public final /* synthetic */ void zzx(long j) {
        this.zza |= 1048576;
        this.zzC = j;
    }

    public final /* synthetic */ void zzy(long j) {
        this.zza |= 2097152;
        this.zzD = j;
    }

    public final /* synthetic */ void zzz(String str) {
        str.getClass();
        this.zza |= 4194304;
        this.zzE = str;
    }
}
