package com.google.android.gms.internal.ads;

import com.applovin.shadow.okio.Segment;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class zzigz extends zziar implements zzicd {
    private static final zzigz zzR;
    private static volatile zzick zzS;
    private zzigv zzA;
    private zzifb zzC;
    private zziet zzE;
    private zzifu zzG;
    private int zzH;
    private long zzK;
    private zzigy zzL;
    private zzifz zzM;
    private zzigs zzO;
    private int zza;
    private int zzb;
    private int zzc;
    private zziex zzg;
    private zzigf zzk;
    private boolean zzl;
    private boolean zzo;
    private boolean zzp;
    private zzigm zzv;
    private boolean zzw;
    private byte zzQ = 2;
    private String zzd = "";
    private String zze = "";
    private String zzf = "";
    private zzibd zzh = zziar.zzbM();
    private zzibd zzi = zziar.zzbM();
    private String zzj = "";
    private zzibd zzm = zziar.zzbM();
    private String zzn = "";
    private zzhzl zzu = zzhzl.zzb;
    private String zzx = "";
    private zzibd zzy = zziar.zzbM();
    private zzibd zzz = zziar.zzbM();
    private zzibd zzB = zziar.zzbM();
    private String zzD = "";
    private zzibd zzF = zziar.zzbM();
    private zzibd zzI = zziar.zzbM();
    private zzibd zzJ = zziar.zzbM();
    private String zzN = "";
    private zzibd zzP = zziar.zzbM();

    static {
        zzigz zzigzVar = new zzigz();
        zzR = zzigzVar;
        zziar.zzbu(zzigz.class, zzigzVar);
    }

    private zzigz() {
    }

    public static zziev zzg() {
        return (zziev) zzR.zzbn();
    }

    public final String zzc() {
        return this.zzd;
    }

    public final List zzd() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.ads.zziar
    public final Object zzdc(zziaq zziaqVar, Object obj, Object obj2) {
        zzick zziamVar;
        byte[] bArr = null;
        switch (zziaqVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.zzQ);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.zzQ = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return zziar.zzbv(zzR, "\u0001%\u0000\u0001\u0001%%\u0000\n\u0001\u0001ဈ\u0002\u0002ဈ\u0003\u0003ဈ\u0004\u0004Л\u0005ဇ\b\u0006\u001a\u0007ဈ\t\bဇ\n\tဇ\u000b\n᠌\u0000\u000b᠌\u0001\fဉ\u0005\rဈ\u0006\u000eဉ\u0007\u000fည\f\u0010\u001b\u0011ဉ\r\u0012ဇ\u000e\u0013ဈ\u000f\u0014\u001a\u0015\u001a\u0016ဉ\u0010\u0017\u001b\u0018ဉ\u0011\u0019ဈ\u0012\u001aဉ\u0013\u001b\u001b\u001cဉ\u0014\u001d᠌\u0015\u001e\u001b\u001f\u001b ဂ\u0016!ဉ\u0017\"ဉ\u0018#ဈ\u0019$ဉ\u001a%\u001b", new Object[]{"zza", "zzd", "zze", "zzf", "zzh", zzigk.class, "zzl", "zzm", "zzn", "zzo", "zzp", "zzb", zzigg.zza, "zzc", zzieu.zza, "zzg", "zzj", "zzk", "zzu", "zzi", zzihd.class, "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", zzihj.class, "zzC", "zzD", "zzE", "zzF", zziff.class, "zzG", "zzH", zzigt.zza, "zzI", zzifx.class, "zzJ", zzigc.class, "zzK", "zzL", "zzM", "zzN", "zzO", "zzP", zzigp.class});
            case NEW_MUTABLE_INSTANCE:
                return new zzigz();
            case NEW_BUILDER:
                return new zziev(bArr);
            case GET_DEFAULT_INSTANCE:
                return zzR;
            case GET_PARSER:
                zzick zzickVar = zzS;
                if (zzickVar != null) {
                    return zzickVar;
                }
                synchronized (zzigz.class) {
                    try {
                        zziamVar = zzS;
                        if (zziamVar == null) {
                            zziamVar = new zziam(zzR);
                            zzS = zziamVar;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return zziamVar;
            default:
                throw null;
        }
    }

    public final String zze() {
        return this.zzj;
    }

    public final /* synthetic */ void zzh(String str) {
        this.zza |= 4;
        this.zzd = str;
    }

    public final /* synthetic */ void zzi(String str) {
        this.zza |= 8;
        this.zze = str;
    }

    public final /* synthetic */ void zzj(zziex zziexVar) {
        zziexVar.getClass();
        this.zzg = zziexVar;
        this.zza |= 32;
    }

    public final /* synthetic */ void zzk(zzigk zzigkVar) {
        zzigkVar.getClass();
        zzibd zzibdVar = this.zzh;
        if (!zzibdVar.zza()) {
            this.zzh = zziar.zzbN(zzibdVar);
        }
        this.zzh.add(zzigkVar);
    }

    public final /* synthetic */ void zzl(String str) {
        this.zza |= 64;
        this.zzj = str;
    }

    public final /* synthetic */ void zzm() {
        this.zza &= -65;
        this.zzj = zzR.zzj;
    }

    public final /* synthetic */ void zzn(zzigf zzigfVar) {
        zzigfVar.getClass();
        this.zzk = zzigfVar;
        this.zza |= 128;
    }

    public final /* synthetic */ void zzo(zzigm zzigmVar) {
        zzigmVar.getClass();
        this.zzv = zzigmVar;
        this.zza |= Segment.SIZE;
    }

    public final /* synthetic */ void zzp(Iterable iterable) {
        zzibd zzibdVar = this.zzy;
        if (!zzibdVar.zza()) {
            this.zzy = zziar.zzbN(zzibdVar);
        }
        zzhyu.zzaW(iterable, this.zzy);
    }

    public final /* synthetic */ void zzq(Iterable iterable) {
        zzibd zzibdVar = this.zzz;
        if (!zzibdVar.zza()) {
            this.zzz = zziar.zzbN(zzibdVar);
        }
        zzhyu.zzaW(iterable, this.zzz);
    }

    public final /* synthetic */ void zzs(int i2) {
        this.zzb = i2 - 1;
        this.zza |= 1;
    }
}
