package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhmj {
    public static final /* synthetic */ int zza = 0;
    private static final zzhxc zzb;
    private static final zzhhs zzc;
    private static final zzhhs zzd;
    private static final zzhjl zze;
    private static final zzhji zzf;
    private static final zzhig zzg;
    private static final zzhid zzh;

    static {
        zzhxc zzhxcVarZza = zzhkl.zza("type.googleapis.com/google.crypto.tink.HmacKey");
        zzb = zzhxcVarZza;
        zzhhr zzhhrVarZza = zzhhs.zza();
        zzhhrVarZza.zza(zzhpw.RAW, zzhlh.zzd);
        zzhhrVarZza.zza(zzhpw.TINK, zzhlh.zza);
        zzhhrVarZza.zza(zzhpw.LEGACY, zzhlh.zzc);
        zzhhrVarZza.zza(zzhpw.CRUNCHY, zzhlh.zzb);
        zzc = zzhhrVarZza.zzb();
        zzhhr zzhhrVarZza2 = zzhhs.zza();
        zzhhrVarZza2.zza(zzhor.SHA1, zzhlg.zza);
        zzhhrVarZza2.zza(zzhor.SHA224, zzhlg.zzb);
        zzhhrVarZza2.zza(zzhor.SHA256, zzhlg.zzc);
        zzhhrVarZza2.zza(zzhor.SHA384, zzhlg.zzd);
        zzhhrVarZza2.zza(zzhor.SHA512, zzhlg.zze);
        zzd = zzhhrVarZza2.zzb();
        zze = zzhjl.zzd(zzhmi.zza, zzhli.class, zzhka.class);
        zzf = zzhji.zzd(zzhmf.zza, zzhxcVarZza, zzhka.class);
        zzg = zzhig.zzd(zzhmg.zza, zzhkz.class, zzhjz.class);
        zzh = zzhid.zzd(zzhmh.zza, zzhxcVarZza, zzhjz.class);
    }

    public static void zza(zzhje zzhjeVar) throws GeneralSecurityException {
        zzhjeVar.zzd(zze);
        zzhjeVar.zze(zzf);
        zzhjeVar.zzb(zzg);
        zzhjeVar.zzc(zzh);
    }

    public static /* synthetic */ zzhka zzb(zzhli zzhliVar) {
        zzhpc zzhpcVarZze = zzhpd.zze();
        zzhpcVarZze.zza("type.googleapis.com/google.crypto.tink.HmacKey");
        zzhou zzhouVarZze = zzhov.zze();
        zzhouVarZze.zza(zzf(zzhliVar));
        zzhouVarZze.zzb(zzhliVar.zzc());
        zzhpcVarZze.zzb(((zzhov) zzhouVarZze.zzbu()).zzaM());
        zzhpcVarZze.zzc((zzhpw) zzc.zzb(zzhliVar.zzf()));
        return zzhka.zza((zzhpd) zzhpcVarZze.zzbu());
    }

    public static /* synthetic */ zzhli zzc(zzhka zzhkaVar) throws GeneralSecurityException {
        if (!zzhkaVar.zzc().zza().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseParameters: ".concat(String.valueOf(zzhkaVar.zzc().zza())));
        }
        try {
            zzhov zzhovVarZzd = zzhov.zzd(zzhkaVar.zzc().zzb(), zziab.zza());
            if (zzhovVarZzd.zzc() != 0) {
                int iZzc = zzhovVarZzd.zzc();
                throw new GeneralSecurityException(androidx.datastore.preferences.protobuf.a.g(iZzc, "Parsing HmacParameters failed: unknown Version ", new StringBuilder(String.valueOf(iZzc).length() + 47)));
            }
            zzhlf zzhlfVarZzb = zzhli.zzb();
            zzhlfVarZzb.zza(zzhovVarZzd.zzb());
            zzhlfVarZzb.zzb(zzhovVarZzd.zza().zzb());
            zzhlfVarZzb.zzd((zzhlg) zzd.zzc(zzhovVarZzd.zza().zza()));
            zzhlfVarZzb.zzc((zzhlh) zzc.zzc(zzhkaVar.zzc().zzc()));
            return zzhlfVarZzb.zze();
        } catch (zzibg e2) {
            throw new GeneralSecurityException("Parsing HmacParameters failed: ", e2);
        }
    }

    public static /* synthetic */ zzhjz zzd(zzhkz zzhkzVar, zzhar zzharVar) {
        zzhos zzhosVarZze = zzhot.zze();
        zzhosVarZze.zza(zzf(zzhkzVar.zzf()));
        byte[] bArrZzc = zzhkzVar.zzd().zzc(zzharVar);
        zzhosVarZze.zzb(zzhzl.zzs(bArrZzc, 0, bArrZzc.length));
        return zzhjz.zza("type.googleapis.com/google.crypto.tink.HmacKey", ((zzhot) zzhosVarZze.zzbu()).zzaM(), zzhoz.SYMMETRIC, (zzhpw) zzc.zzb(zzhkzVar.zzf().zzf()), zzhkzVar.zzb());
    }

    public static /* synthetic */ zzhkz zze(zzhjz zzhjzVar, zzhar zzharVar) throws GeneralSecurityException {
        if (!zzhjzVar.zzg().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseKey");
        }
        try {
            zzhot zzhotVarZzd = zzhot.zzd(zzhjzVar.zzb(), zziab.zza());
            if (zzhotVarZzd.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzhlf zzhlfVarZzb = zzhli.zzb();
            zzhlfVarZzb.zza(zzhotVarZzd.zzc().zzc());
            zzhlfVarZzb.zzb(zzhotVarZzd.zzb().zzb());
            zzhlfVarZzb.zzd((zzhlg) zzd.zzc(zzhotVarZzd.zzb().zza()));
            zzhlfVarZzb.zzc((zzhlh) zzc.zzc(zzhjzVar.zzd()));
            zzhli zzhliVarZze = zzhlfVarZzb.zze();
            zzhky zzhkyVarZzc = zzhkz.zzc();
            zzhkyVarZzc.zza(zzhliVarZze);
            zzhkyVarZzc.zzb(zzhxe.zza(zzhotVarZzd.zzc().zzy(), zzharVar));
            zzhkyVarZzc.zzc(zzhjzVar.zze());
            return zzhkyVarZzc.zzd();
        } catch (zzibg | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing HmacKey failed");
        }
    }

    private static zzhox zzf(zzhli zzhliVar) throws GeneralSecurityException {
        zzhow zzhowVarZzc = zzhox.zzc();
        zzhowVarZzc.zzb(zzhliVar.zzd());
        zzhowVarZzc.zza((zzhor) zzd.zzb(zzhliVar.zzg()));
        return (zzhox) zzhowVarZzc.zzbu();
    }
}
