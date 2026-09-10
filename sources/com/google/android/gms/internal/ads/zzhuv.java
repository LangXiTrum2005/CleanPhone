package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhuv {
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
        zzhxc zzhxcVarZza = zzhkl.zza("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey");
        zzb = zzhxcVarZza;
        zzhxc zzhxcVarZza2 = zzhkl.zza("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PublicKey");
        zzc = zzhxcVarZza2;
        zzd = zzhjl.zzd(zzhuu.zza, zzhsw.class, zzhka.class);
        zze = zzhji.zzd(zzhup.zza, zzhxcVarZza, zzhka.class);
        zzf = zzhig.zzd(zzhuq.zza, zzhta.class, zzhjz.class);
        zzg = zzhid.zzd(zzhur.zza, zzhxcVarZza2, zzhjz.class);
        zzh = zzhig.zzd(zzhus.zza, zzhsy.class, zzhjz.class);
        zzi = zzhid.zzd(zzhut.zza, zzhxcVarZza, zzhjz.class);
        zzhhr zzhhrVarZza = zzhhs.zza();
        zzhhrVarZza.zza(zzhpw.RAW, zzhsv.zzd);
        zzhhrVarZza.zza(zzhpw.TINK, zzhsv.zza);
        zzhhrVarZza.zza(zzhpw.CRUNCHY, zzhsv.zzb);
        zzhhrVarZza.zza(zzhpw.LEGACY, zzhsv.zzc);
        zzj = zzhhrVarZza.zzb();
        zzhhr zzhhrVarZza2 = zzhhs.zza();
        zzhhrVarZza2.zza(zzhor.SHA256, zzhsu.zza);
        zzhhrVarZza2.zza(zzhor.SHA384, zzhsu.zzb);
        zzhhrVarZza2.zza(zzhor.SHA512, zzhsu.zzc);
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

    public static /* synthetic */ zzhka zzb(zzhsw zzhswVar) {
        zzhpc zzhpcVarZze = zzhpd.zze();
        zzhpcVarZze.zza("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey");
        zzhpz zzhpzVarZze = zzhqa.zze();
        zzhpzVarZze.zza(zzh(zzhswVar));
        zzhpzVarZze.zzb(zzhswVar.zzc());
        byte[] bArrZza = zzhhe.zza(zzhswVar.zzd());
        zzhzl zzhzlVar = zzhzl.zzb;
        zzhpzVarZze.zzc(zzhzl.zzs(bArrZza, 0, bArrZza.length));
        zzhpcVarZze.zzb(((zzhqa) zzhpzVarZze.zzbu()).zzaM());
        zzhpcVarZze.zzc((zzhpw) zzj.zzb(zzhswVar.zze()));
        return zzhka.zza((zzhpd) zzhpcVarZze.zzbu());
    }

    public static /* synthetic */ zzhsw zzc(zzhka zzhkaVar) throws GeneralSecurityException {
        if (!zzhkaVar.zzc().zza().equals("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPkcs1ProtoSerialization.parseParameters: ".concat(String.valueOf(zzhkaVar.zzc().zza())));
        }
        try {
            zzhqa zzhqaVarZzd = zzhqa.zzd(zzhkaVar.zzc().zzb(), zziab.zza());
            zzhst zzhstVarZzb = zzhsw.zzb();
            zzhstVarZzb.zzd((zzhsu) zzk.zzc(zzhqaVarZzd.zza().zza()));
            zzhstVarZzb.zzb(new BigInteger(1, zzhqaVarZzd.zzc().zzy()));
            zzhstVarZzb.zza(zzhqaVarZzd.zzb());
            zzhstVarZzb.zzc((zzhsv) zzj.zzc(zzhkaVar.zzc().zzc()));
            return zzhstVarZzb.zze();
        } catch (zzibg e2) {
            throw new GeneralSecurityException("Parsing RsaSsaPkcs1Parameters failed: ", e2);
        }
    }

    public static /* synthetic */ zzhta zze(zzhjz zzhjzVar, zzhar zzharVar) throws GeneralSecurityException {
        if (!zzhjzVar.zzg().equals("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PublicKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPkcs1ProtoSerialization.parsePublicKey: ".concat(String.valueOf(zzhjzVar.zzg())));
        }
        try {
            zzhqg zzhqgVarZze = zzhqg.zze(zzhjzVar.zzb(), zziab.zza());
            if (zzhqgVarZze.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            BigInteger bigInteger = new BigInteger(1, zzhqgVarZze.zzc().zzy());
            int iBitLength = bigInteger.bitLength();
            zzhst zzhstVarZzb = zzhsw.zzb();
            zzhstVarZzb.zzd((zzhsu) zzk.zzc(zzhqgVarZze.zzb().zza()));
            zzhstVarZzb.zzb(new BigInteger(1, zzhqgVarZze.zzd().zzy()));
            zzhstVarZzb.zza(iBitLength);
            zzhstVarZzb.zzc((zzhsv) zzj.zzc(zzhjzVar.zzd()));
            zzhsw zzhswVarZze = zzhstVarZzb.zze();
            zzhsz zzhszVarZzc = zzhta.zzc();
            zzhszVarZzc.zza(zzhswVarZze);
            zzhszVarZzc.zzb(bigInteger);
            zzhszVarZzc.zzc(zzhjzVar.zze());
            return zzhszVarZzc.zzd();
        } catch (zzibg | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing RsaSsaPkcs1PublicKey failed");
        }
    }

    public static /* synthetic */ zzhjz zzf(zzhsy zzhsyVar, zzhar zzharVar) {
        zzhqd zzhqdVarZzk = zzhqe.zzk();
        zzhqdVarZzk.zza(0);
        zzhqdVarZzk.zzb(zzi(zzhsyVar.zze()));
        byte[] bArrZza = zzhhe.zza(zzhsyVar.zzi().zzb(zzharVar));
        zzhzl zzhzlVar = zzhzl.zzb;
        zzhqdVarZzk.zzc(zzhzl.zzs(bArrZza, 0, bArrZza.length));
        byte[] bArrZza2 = zzhhe.zza(zzhsyVar.zzf().zzb(zzharVar));
        zzhqdVarZzk.zzd(zzhzl.zzs(bArrZza2, 0, bArrZza2.length));
        byte[] bArrZza3 = zzhhe.zza(zzhsyVar.zzh().zzb(zzharVar));
        zzhqdVarZzk.zze(zzhzl.zzs(bArrZza3, 0, bArrZza3.length));
        byte[] bArrZza4 = zzhhe.zza(zzhsyVar.zzj().zzb(zzharVar));
        zzhqdVarZzk.zzf(zzhzl.zzs(bArrZza4, 0, bArrZza4.length));
        byte[] bArrZza5 = zzhhe.zza(zzhsyVar.zzk().zzb(zzharVar));
        zzhqdVarZzk.zzg(zzhzl.zzs(bArrZza5, 0, bArrZza5.length));
        byte[] bArrZza6 = zzhhe.zza(zzhsyVar.zzl().zzb(zzharVar));
        zzhqdVarZzk.zzh(zzhzl.zzs(bArrZza6, 0, bArrZza6.length));
        return zzhjz.zza("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey", ((zzhqe) zzhqdVarZzk.zzbu()).zzaM(), zzhoz.ASYMMETRIC_PRIVATE, (zzhpw) zzj.zzb(zzhsyVar.zzd().zze()), zzhsyVar.zze().zzb());
    }

    public static /* synthetic */ zzhsy zzg(zzhjz zzhjzVar, zzhar zzharVar) throws GeneralSecurityException {
        if (!zzhjzVar.zzg().equals("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPkcs1ProtoSerialization.parsePrivateKey: ".concat(String.valueOf(zzhjzVar.zzg())));
        }
        try {
            zzhqe zzhqeVarZzj = zzhqe.zzj(zzhjzVar.zzb(), zziab.zza());
            if (zzhqeVarZzj.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzhqg zzhqgVarZzb = zzhqeVarZzj.zzb();
            if (zzhqgVarZzb.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            BigInteger bigInteger = new BigInteger(1, zzhqgVarZzb.zzc().zzy());
            int iBitLength = bigInteger.bitLength();
            BigInteger bigInteger2 = new BigInteger(1, zzhqgVarZzb.zzd().zzy());
            zzhst zzhstVarZzb = zzhsw.zzb();
            zzhstVarZzb.zzd((zzhsu) zzk.zzc(zzhqgVarZzb.zzb().zza()));
            zzhstVarZzb.zzb(bigInteger2);
            zzhstVarZzb.zza(iBitLength);
            zzhstVarZzb.zzc((zzhsv) zzj.zzc(zzhjzVar.zzd()));
            zzhsw zzhswVarZze = zzhstVarZzb.zze();
            zzhsz zzhszVarZzc = zzhta.zzc();
            zzhszVarZzc.zza(zzhswVarZze);
            zzhszVarZzc.zzb(bigInteger);
            zzhszVarZzc.zzc(zzhjzVar.zze());
            zzhta zzhtaVarZzd = zzhszVarZzc.zzd();
            zzhsx zzhsxVarZzc = zzhsy.zzc();
            zzhsxVarZzc.zza(zzhtaVarZzd);
            zzhsxVarZzc.zzb(zzj(zzhqeVarZzj.zzd(), zzharVar), zzj(zzhqeVarZzj.zze(), zzharVar));
            zzhsxVarZzc.zzc(zzj(zzhqeVarZzj.zzc(), zzharVar));
            zzhsxVarZzc.zzd(zzj(zzhqeVarZzj.zzg(), zzharVar), zzj(zzhqeVarZzj.zzh(), zzharVar));
            zzhsxVarZzc.zze(zzj(zzhqeVarZzj.zzi(), zzharVar));
            return zzhsxVarZzc.zzf();
        } catch (zzibg | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing RsaSsaPkcs1PrivateKey failed");
        }
    }

    private static zzhqc zzh(zzhsw zzhswVar) throws GeneralSecurityException {
        zzhqb zzhqbVarZzb = zzhqc.zzb();
        zzhqbVarZzb.zza((zzhor) zzk.zzb(zzhswVar.zzf()));
        return (zzhqc) zzhqbVarZzb.zzbu();
    }

    private static zzhqg zzi(zzhta zzhtaVar) throws GeneralSecurityException {
        zzhqf zzhqfVarZzg = zzhqg.zzg();
        zzhqfVarZzg.zza(zzh(zzhtaVar.zzf()));
        byte[] bArrZza = zzhhe.zza(zzhtaVar.zzd());
        zzhzl zzhzlVar = zzhzl.zzb;
        zzhqfVarZzg.zzb(zzhzl.zzs(bArrZza, 0, bArrZza.length));
        byte[] bArrZza2 = zzhhe.zza(zzhtaVar.zzf().zzd());
        zzhqfVarZzg.zzc(zzhzl.zzs(bArrZza2, 0, bArrZza2.length));
        return (zzhqg) zzhqfVarZzg.zzbu();
    }

    private static zzhxd zzj(zzhzl zzhzlVar, zzhar zzharVar) {
        return zzhxd.zza(new BigInteger(1, zzhzlVar.zzy()), zzharVar);
    }
}
