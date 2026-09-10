package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhfa {
    public static final /* synthetic */ int zza = 0;
    private static final zzhxc zzb;
    private static final zzhjl zzc;
    private static final zzhji zzd;
    private static final zzhig zze;
    private static final zzhid zzf;

    static {
        zzhxc zzhxcVarZza = zzhkl.zza("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        zzb = zzhxcVarZza;
        zzc = zzhjl.zzd(zzhez.zza, zzhbt.class, zzhka.class);
        zzd = zzhji.zzd(zzhew.zza, zzhxcVarZza, zzhka.class);
        zze = zzhig.zzd(zzhex.zza, zzhbl.class, zzhjz.class);
        zzf = zzhid.zzd(zzhey.zza, zzhxcVarZza, zzhjz.class);
    }

    public static void zza(zzhje zzhjeVar) throws GeneralSecurityException {
        zzhjeVar.zzd(zzc);
        zzhjeVar.zze(zzd);
        zzhjeVar.zzb(zze);
        zzhjeVar.zzc(zzf);
    }

    public static /* synthetic */ zzhka zzb(zzhbt zzhbtVar) {
        zzhpc zzhpcVarZze = zzhpd.zze();
        zzhpcVarZze.zza("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        zzhnb zzhnbVarZzd = zzhnc.zzd();
        zzhnf zzhnfVarZzc = zzhng.zzc();
        zzhnh zzhnhVarZzb = zzhni.zzb();
        zzhnhVarZzb.zza(zzhbtVar.zzf());
        zzhnfVarZzc.zza((zzhni) zzhnhVarZzb.zzbu());
        zzhnfVarZzc.zzb(zzhbtVar.zzc());
        zzhnbVarZzd.zza((zzhng) zzhnfVarZzc.zzbu());
        zzhou zzhouVarZze = zzhov.zze();
        zzhouVarZze.zza(zzi(zzhbtVar));
        zzhouVarZze.zzb(zzhbtVar.zzd());
        zzhnbVarZzd.zzb((zzhov) zzhouVarZze.zzbu());
        zzhpcVarZze.zzb(((zzhnc) zzhnbVarZzd.zzbu()).zzaM());
        zzhpcVarZze.zzc(zzf(zzhbtVar.zzg()));
        return zzhka.zza((zzhpd) zzhpcVarZze.zzbu());
    }

    public static /* synthetic */ zzhbt zzc(zzhka zzhkaVar) throws GeneralSecurityException {
        if (!zzhkaVar.zzc().zza().equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseParameters: ".concat(String.valueOf(zzhkaVar.zzc().zza())));
        }
        try {
            zzhnc zzhncVarZzc = zzhnc.zzc(zzhkaVar.zzc().zzb(), zziab.zza());
            if (zzhncVarZzc.zzb().zzc() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzhbq zzhbqVarZzb = zzhbt.zzb();
            zzhbqVarZzb.zza(zzhncVarZzc.zza().zzb());
            zzhbqVarZzb.zzb(zzhncVarZzc.zzb().zzb());
            zzhbqVarZzb.zzc(zzhncVarZzc.zza().zza().zza());
            zzhbqVarZzb.zzd(zzhncVarZzc.zzb().zza().zzb());
            zzhbqVarZzb.zzf(zzh(zzhncVarZzc.zzb().zza().zza()));
            zzhbqVarZzb.zze(zzg(zzhkaVar.zzc().zzc()));
            return zzhbqVarZzb.zzg();
        } catch (zzibg e2) {
            throw new GeneralSecurityException("Parsing AesCtrHmacAeadParameters failed: ", e2);
        }
    }

    public static /* synthetic */ zzhjz zzd(zzhbl zzhblVar, zzhar zzharVar) {
        zzhmz zzhmzVarZze = zzhna.zze();
        zzhnd zzhndVarZzd = zzhne.zzd();
        zzhnh zzhnhVarZzb = zzhni.zzb();
        zzhnhVarZzb.zza(zzhblVar.zzg().zzf());
        zzhndVarZzd.zza((zzhni) zzhnhVarZzb.zzbu());
        byte[] bArrZzc = zzhblVar.zze().zzc(zzharVar);
        zzhndVarZzd.zzb(zzhzl.zzs(bArrZzc, 0, bArrZzc.length));
        zzhmzVarZze.zza((zzhne) zzhndVarZzd.zzbu());
        zzhos zzhosVarZze = zzhot.zze();
        zzhosVarZze.zza(zzi(zzhblVar.zzg()));
        byte[] bArrZzc2 = zzhblVar.zzf().zzc(zzharVar);
        zzhosVarZze.zzb(zzhzl.zzs(bArrZzc2, 0, bArrZzc2.length));
        zzhmzVarZze.zzb((zzhot) zzhosVarZze.zzbu());
        return zzhjz.zza("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey", ((zzhna) zzhmzVarZze.zzbu()).zzaM(), zzhoz.SYMMETRIC, zzf(zzhblVar.zzg().zzg()), zzhblVar.zzb());
    }

    public static /* synthetic */ zzhbl zze(zzhjz zzhjzVar, zzhar zzharVar) throws GeneralSecurityException {
        if (!zzhjzVar.zzg().equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseKey");
        }
        try {
            zzhna zzhnaVarZzd = zzhna.zzd(zzhjzVar.zzb(), zziab.zza());
            if (zzhnaVarZzd.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            if (zzhnaVarZzd.zzb().zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys inner AES CTR keys are accepted");
            }
            if (zzhnaVarZzd.zzc().zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys inner HMAC keys are accepted");
            }
            zzhbq zzhbqVarZzb = zzhbt.zzb();
            zzhbqVarZzb.zza(zzhnaVarZzd.zzb().zzc().zzc());
            zzhbqVarZzb.zzb(zzhnaVarZzd.zzc().zzc().zzc());
            zzhbqVarZzb.zzc(zzhnaVarZzd.zzb().zzb().zza());
            zzhbqVarZzb.zzd(zzhnaVarZzd.zzc().zzb().zzb());
            zzhbqVarZzb.zzf(zzh(zzhnaVarZzd.zzc().zzb().zza()));
            zzhbqVarZzb.zze(zzg(zzhjzVar.zzd()));
            zzhbt zzhbtVarZzg = zzhbqVarZzb.zzg();
            zzhbk zzhbkVarZzd = zzhbl.zzd();
            zzhbkVarZzd.zza(zzhbtVarZzg);
            zzhbkVarZzd.zzb(zzhxe.zza(zzhnaVarZzd.zzb().zzc().zzy(), zzharVar));
            zzhbkVarZzd.zzc(zzhxe.zza(zzhnaVarZzd.zzc().zzc().zzy(), zzharVar));
            zzhbkVarZzd.zzd(zzhjzVar.zze());
            return zzhbkVarZzd.zze();
        } catch (zzibg unused) {
            throw new GeneralSecurityException("Parsing AesCtrHmacAeadKey failed");
        }
    }

    private static zzhpw zzf(zzhbs zzhbsVar) throws GeneralSecurityException {
        if (zzhbs.zza.equals(zzhbsVar)) {
            return zzhpw.TINK;
        }
        if (zzhbs.zzb.equals(zzhbsVar)) {
            return zzhpw.CRUNCHY;
        }
        if (zzhbs.zzc.equals(zzhbsVar)) {
            return zzhpw.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzhbsVar)));
    }

    private static zzhbs zzg(zzhpw zzhpwVar) throws GeneralSecurityException {
        int iOrdinal = zzhpwVar.ordinal();
        if (iOrdinal == 1) {
            return zzhbs.zza;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return zzhbs.zzc;
            }
            if (iOrdinal != 4) {
                int iZza = zzhpwVar.zza();
                throw new GeneralSecurityException(androidx.datastore.preferences.protobuf.a.g(iZza, "Unable to parse OutputPrefixType: ", new StringBuilder(String.valueOf(iZza).length() + 34)));
            }
        }
        return zzhbs.zzb;
    }

    private static zzhbr zzh(zzhor zzhorVar) throws GeneralSecurityException {
        int iOrdinal = zzhorVar.ordinal();
        if (iOrdinal == 1) {
            return zzhbr.zza;
        }
        if (iOrdinal == 2) {
            return zzhbr.zzd;
        }
        if (iOrdinal == 3) {
            return zzhbr.zzc;
        }
        if (iOrdinal == 4) {
            return zzhbr.zze;
        }
        if (iOrdinal == 5) {
            return zzhbr.zzb;
        }
        int iZza = zzhorVar.zza();
        throw new GeneralSecurityException(androidx.datastore.preferences.protobuf.a.g(iZza, "Unable to parse HashType: ", new StringBuilder(String.valueOf(iZza).length() + 26)));
    }

    private static zzhox zzi(zzhbt zzhbtVar) throws GeneralSecurityException {
        zzhor zzhorVar;
        zzhow zzhowVarZzc = zzhox.zzc();
        zzhowVarZzc.zzb(zzhbtVar.zze());
        zzhbr zzhbrVarZzh = zzhbtVar.zzh();
        if (zzhbr.zza.equals(zzhbrVarZzh)) {
            zzhorVar = zzhor.SHA1;
        } else if (zzhbr.zzb.equals(zzhbrVarZzh)) {
            zzhorVar = zzhor.SHA224;
        } else if (zzhbr.zzc.equals(zzhbrVarZzh)) {
            zzhorVar = zzhor.SHA256;
        } else if (zzhbr.zzd.equals(zzhbrVarZzh)) {
            zzhorVar = zzhor.SHA384;
        } else {
            if (!zzhbr.zze.equals(zzhbrVarZzh)) {
                throw new GeneralSecurityException("Unable to serialize HashType ".concat(String.valueOf(zzhbrVarZzh)));
            }
            zzhorVar = zzhor.SHA512;
        }
        zzhowVarZzc.zza(zzhorVar);
        return (zzhox) zzhowVarZzc.zzbu();
    }
}
