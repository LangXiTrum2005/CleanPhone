package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhve {
    public static final /* synthetic */ int zza = 0;
    private static final zzhxc zzb;
    private static final zzhxc zzc;
    private static final zzhjl zzd;
    private static final zzhji zze;
    private static final zzhig zzf;
    private static final zzhid zzg;
    private static final zzhig zzh;
    private static final zzhid zzi;
    private static final zzhhs zzj;
    private static final zzhhs zzk;

    static {
        zzhxc zzhxcVarZza = zzhkl.zza("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey");
        zzb = zzhxcVarZza;
        zzhxc zzhxcVarZza2 = zzhkl.zza("type.googleapis.com/google.crypto.tink.RsaSsaPssPublicKey");
        zzc = zzhxcVarZza2;
        zzd = zzhjl.zzd(zzhvd.zza, zzhti.class, zzhka.class);
        zze = zzhji.zzd(zzhuy.zza, zzhxcVarZza, zzhka.class);
        zzf = zzhig.zzd(zzhuz.zza, zzhtm.class, zzhjz.class);
        zzg = zzhid.zzd(zzhva.zza, zzhxcVarZza2, zzhjz.class);
        zzh = zzhig.zzd(zzhvb.zza, zzhtk.class, zzhjz.class);
        zzi = zzhid.zzd(zzhvc.zza, zzhxcVarZza, zzhjz.class);
        zzhhr zzhhrVarZza = zzhhs.zza();
        zzhhrVarZza.zza(zzhpw.RAW, zzhth.zzd);
        zzhhrVarZza.zza(zzhpw.TINK, zzhth.zza);
        zzhhrVarZza.zza(zzhpw.CRUNCHY, zzhth.zzb);
        zzhhrVarZza.zza(zzhpw.LEGACY, zzhth.zzc);
        zzj = zzhhrVarZza.zzb();
        zzhhr zzhhrVarZza2 = zzhhs.zza();
        zzhhrVarZza2.zza(zzhor.SHA256, zzhtg.zza);
        zzhhrVarZza2.zza(zzhor.SHA384, zzhtg.zzb);
        zzhhrVarZza2.zza(zzhor.SHA512, zzhtg.zzc);
        zzk = zzhhrVarZza2.zzb();
    }

    public static void zza(zzhje zzhjeVar) throws GeneralSecurityException {
        zzhjeVar.zzd(zzd);
        zzhjeVar.zze(zze);
        zzhjeVar.zzb(zzf);
        zzhjeVar.zzc(zzg);
        zzhjeVar.zzb(zzh);
        zzhjeVar.zzc(zzi);
    }

    public static /* synthetic */ zzhka zzb(zzhti zzhtiVar) {
        zzhpc zzhpcVarZze = zzhpd.zze();
        zzhpcVarZze.zza("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey");
        zzhqh zzhqhVarZze = zzhqi.zze();
        zzhqhVarZze.zza(zzh(zzhtiVar));
        zzhqhVarZze.zzb(zzhtiVar.zzc());
        byte[] bArrZza = zzhhe.zza(zzhtiVar.zzd());
        zzhzl zzhzlVar = zzhzl.zzb;
        zzhqhVarZze.zzc(zzhzl.zzs(bArrZza, 0, bArrZza.length));
        zzhpcVarZze.zzb(((zzhqi) zzhqhVarZze.zzbu()).zzaM());
        zzhpcVarZze.zzc((zzhpw) zzj.zzb(zzhtiVar.zze()));
        return zzhka.zza((zzhpd) zzhpcVarZze.zzbu());
    }

    public static /* synthetic */ zzhti zzc(zzhka zzhkaVar) throws GeneralSecurityException {
        if (!zzhkaVar.zzc().zza().equals("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPssProtoSerialization.parseParameters: ".concat(String.valueOf(zzhkaVar.zzc().zza())));
        }
        try {
            zzhqi zzhqiVarZzd = zzhqi.zzd(zzhkaVar.zzc().zzb(), zziab.zza());
            zzhtf zzhtfVarZzb = zzhti.zzb();
            zzhhs zzhhsVar = zzk;
            zzhtfVarZzb.zzd((zzhtg) zzhhsVar.zzc(zzhqiVarZzd.zza().zza()));
            zzhtfVarZzb.zze((zzhtg) zzhhsVar.zzc(zzhqiVarZzd.zza().zzb()));
            zzhtfVarZzb.zzb(new BigInteger(1, zzhqiVarZzd.zzc().zzy()));
            zzhtfVarZzb.zza(zzhqiVarZzd.zzb());
            zzhtfVarZzb.zzf(zzhqiVarZzd.zza().zzc());
            zzhtfVarZzb.zzc((zzhth) zzj.zzc(zzhkaVar.zzc().zzc()));
            return zzhtfVarZzb.zzg();
        } catch (zzibg e2) {
            throw new GeneralSecurityException("Parsing RsaSsaPssParameters failed: ", e2);
        }
    }

    public static /* synthetic */ zzhtm zze(zzhjz zzhjzVar, zzhar zzharVar) throws GeneralSecurityException {
        if (!zzhjzVar.zzg().equals("type.googleapis.com/google.crypto.tink.RsaSsaPssPublicKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPssProtoSerialization.parsePublicKey: ".concat(String.valueOf(zzhjzVar.zzg())));
        }
        try {
            zzhqo zzhqoVarZze = zzhqo.zze(zzhjzVar.zzb(), zziab.zza());
            if (zzhqoVarZze.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            BigInteger bigInteger = new BigInteger(1, zzhqoVarZze.zzc().zzy());
            int iBitLength = bigInteger.bitLength();
            zzhtf zzhtfVarZzb = zzhti.zzb();
            zzhhs zzhhsVar = zzk;
            zzhtfVarZzb.zzd((zzhtg) zzhhsVar.zzc(zzhqoVarZze.zzb().zza()));
            zzhtfVarZzb.zze((zzhtg) zzhhsVar.zzc(zzhqoVarZze.zzb().zzb()));
            zzhtfVarZzb.zzb(new BigInteger(1, zzhqoVarZze.zzd().zzy()));
            zzhtfVarZzb.zza(iBitLength);
            zzhtfVarZzb.zzf(zzhqoVarZze.zzb().zzc());
            zzhtfVarZzb.zzc((zzhth) zzj.zzc(zzhjzVar.zzd()));
            zzhti zzhtiVarZzg = zzhtfVarZzb.zzg();
            zzhtl zzhtlVarZzc = zzhtm.zzc();
            zzhtlVarZzc.zza(zzhtiVarZzg);
            zzhtlVarZzc.zzb(bigInteger);
            zzhtlVarZzc.zzc(zzhjzVar.zze());
            return zzhtlVarZzc.zzd();
        } catch (zzibg | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing RsaSsaPssPublicKey failed");
        }
    }

    public static /* synthetic */ zzhjz zzf(zzhtk zzhtkVar, zzhar zzharVar) {
        zzhql zzhqlVarZzk = zzhqm.zzk();
        zzhqlVarZzk.zza(0);
        zzhqlVarZzk.zzb(zzi(zzhtkVar.zze()));
        byte[] bArrZza = zzhhe.zza(zzhtkVar.zzi().zzb(zzharVar));
        zzhzl zzhzlVar = zzhzl.zzb;
        zzhqlVarZzk.zzc(zzhzl.zzs(bArrZza, 0, bArrZza.length));
        byte[] bArrZza2 = zzhhe.zza(zzhtkVar.zzf().zzb(zzharVar));
        zzhqlVarZzk.zzd(zzhzl.zzs(bArrZza2, 0, bArrZza2.length));
        byte[] bArrZza3 = zzhhe.zza(zzhtkVar.zzh().zzb(zzharVar));
        zzhqlVarZzk.zze(zzhzl.zzs(bArrZza3, 0, bArrZza3.length));
        byte[] bArrZza4 = zzhhe.zza(zzhtkVar.zzj().zzb(zzharVar));
        zzhqlVarZzk.zzf(zzhzl.zzs(bArrZza4, 0, bArrZza4.length));
        byte[] bArrZza5 = zzhhe.zza(zzhtkVar.zzk().zzb(zzharVar));
        zzhqlVarZzk.zzg(zzhzl.zzs(bArrZza5, 0, bArrZza5.length));
        byte[] bArrZza6 = zzhhe.zza(zzhtkVar.zzl().zzb(zzharVar));
        zzhqlVarZzk.zzh(zzhzl.zzs(bArrZza6, 0, bArrZza6.length));
        return zzhjz.zza("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey", ((zzhqm) zzhqlVarZzk.zzbu()).zzaM(), zzhoz.ASYMMETRIC_PRIVATE, (zzhpw) zzj.zzb(zzhtkVar.zzd().zze()), zzhtkVar.zze().zzb());
    }

    public static /* synthetic */ zzhtk zzg(zzhjz zzhjzVar, zzhar zzharVar) throws GeneralSecurityException {
        if (!zzhjzVar.zzg().equals("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPssProtoSerialization.parsePrivateKey: ".concat(String.valueOf(zzhjzVar.zzg())));
        }
        try {
            zzhqm zzhqmVarZzj = zzhqm.zzj(zzhjzVar.zzb(), zziab.zza());
            if (zzhqmVarZzj.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzhqo zzhqoVarZzb = zzhqmVarZzj.zzb();
            if (zzhqoVarZzb.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            BigInteger bigInteger = new BigInteger(1, zzhqoVarZzb.zzc().zzy());
            int iBitLength = bigInteger.bitLength();
            BigInteger bigInteger2 = new BigInteger(1, zzhqoVarZzb.zzd().zzy());
            zzhtf zzhtfVarZzb = zzhti.zzb();
            zzhhs zzhhsVar = zzk;
            zzhtfVarZzb.zzd((zzhtg) zzhhsVar.zzc(zzhqoVarZzb.zzb().zza()));
            zzhtfVarZzb.zze((zzhtg) zzhhsVar.zzc(zzhqoVarZzb.zzb().zzb()));
            zzhtfVarZzb.zzb(bigInteger2);
            zzhtfVarZzb.zza(iBitLength);
            zzhtfVarZzb.zzf(zzhqoVarZzb.zzb().zzc());
            zzhtfVarZzb.zzc((zzhth) zzj.zzc(zzhjzVar.zzd()));
            zzhti zzhtiVarZzg = zzhtfVarZzb.zzg();
            zzhtl zzhtlVarZzc = zzhtm.zzc();
            zzhtlVarZzc.zza(zzhtiVarZzg);
            zzhtlVarZzc.zzb(bigInteger);
            zzhtlVarZzc.zzc(zzhjzVar.zze());
            zzhtm zzhtmVarZzd = zzhtlVarZzc.zzd();
            zzhtj zzhtjVarZzc = zzhtk.zzc();
            zzhtjVarZzc.zza(zzhtmVarZzd);
            zzhtjVarZzc.zzb(zzj(zzhqmVarZzj.zzd(), zzharVar), zzj(zzhqmVarZzj.zze(), zzharVar));
            zzhtjVarZzc.zzc(zzj(zzhqmVarZzj.zzc(), zzharVar));
            zzhtjVarZzc.zzd(zzj(zzhqmVarZzj.zzg(), zzharVar), zzj(zzhqmVarZzj.zzh(), zzharVar));
            zzhtjVarZzc.zze(zzj(zzhqmVarZzj.zzi(), zzharVar));
            return zzhtjVarZzc.zzf();
        } catch (zzibg | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing RsaSsaPssPrivateKey failed");
        }
    }

    private static zzhqk zzh(zzhti zzhtiVar) throws GeneralSecurityException {
        zzhqj zzhqjVarZzd = zzhqk.zzd();
        zzhhs zzhhsVar = zzk;
        zzhqjVarZzd.zza((zzhor) zzhhsVar.zzb(zzhtiVar.zzf()));
        zzhqjVarZzd.zzb((zzhor) zzhhsVar.zzb(zzhtiVar.zzg()));
        zzhqjVarZzd.zzc(zzhtiVar.zzh());
        return (zzhqk) zzhqjVarZzd.zzbu();
    }

    private static zzhqo zzi(zzhtm zzhtmVar) throws GeneralSecurityException {
        zzhqn zzhqnVarZzg = zzhqo.zzg();
        zzhqnVarZzg.zzb(zzh(zzhtmVar.zzf()));
        byte[] bArrZza = zzhhe.zza(zzhtmVar.zzd());
        zzhzl zzhzlVar = zzhzl.zzb;
        zzhqnVarZzg.zzc(zzhzl.zzs(bArrZza, 0, bArrZza.length));
        byte[] bArrZza2 = zzhhe.zza(zzhtmVar.zzf().zzd());
        zzhqnVarZzg.zzd(zzhzl.zzs(bArrZza2, 0, bArrZza2.length));
        zzhqnVarZzg.zza(0);
        return (zzhqo) zzhqnVarZzg.zzbu();
    }

    private static zzhxd zzj(zzhzl zzhzlVar, zzhar zzharVar) {
        return zzhxd.zza(new BigInteger(1, zzhzlVar.zzy()), zzharVar);
    }
}
