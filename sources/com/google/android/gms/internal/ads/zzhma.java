package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhma {
    public static final /* synthetic */ int zza = 0;
    private static final zzhxc zzb;
    private static final zzhjl zzc;
    private static final zzhji zzd;
    private static final zzhig zze;
    private static final zzhid zzf;

    static {
        zzhxc zzhxcVarZza = zzhkl.zza("type.googleapis.com/google.crypto.tink.AesCmacKey");
        zzb = zzhxcVarZza;
        zzc = zzhjl.zzd(zzhlz.zza, zzhku.class, zzhka.class);
        zzd = zzhji.zzd(zzhlw.zza, zzhxcVarZza, zzhka.class);
        zze = zzhig.zzd(zzhlx.zza, zzhkn.class, zzhjz.class);
        zzf = zzhid.zzd(zzhly.zza, zzhxcVarZza, zzhjz.class);
    }

    public static void zza(zzhje zzhjeVar) throws GeneralSecurityException {
        zzhjeVar.zzd(zzc);
        zzhjeVar.zze(zzd);
        zzhjeVar.zzb(zze);
        zzhjeVar.zzc(zzf);
    }

    public static /* synthetic */ zzhka zzb(zzhku zzhkuVar) {
        zzhpc zzhpcVarZze = zzhpd.zze();
        zzhpcVarZze.zza("type.googleapis.com/google.crypto.tink.AesCmacKey");
        zzhmv zzhmvVarZzd = zzhmw.zzd();
        zzhmvVarZzd.zzb(zzh(zzhkuVar));
        zzhmvVarZzd.zza(zzhkuVar.zzc());
        zzhpcVarZze.zzb(((zzhmw) zzhmvVarZzd.zzbu()).zzaM());
        zzhpcVarZze.zzc(zzf(zzhkuVar.zzf()));
        return zzhka.zza((zzhpd) zzhpcVarZze.zzbu());
    }

    public static /* synthetic */ zzhku zzc(zzhka zzhkaVar) throws GeneralSecurityException {
        if (!zzhkaVar.zzc().zza().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseParameters: ".concat(String.valueOf(zzhkaVar.zzc().zza())));
        }
        try {
            zzhmw zzhmwVarZzc = zzhmw.zzc(zzhkaVar.zzc().zzb(), zziab.zza());
            zzhks zzhksVarZzb = zzhku.zzb();
            zzhksVarZzb.zza(zzhmwVarZzc.zza());
            zzhksVarZzb.zzb(zzhmwVarZzc.zzb().zza());
            zzhksVarZzb.zzc(zzg(zzhkaVar.zzc().zzc()));
            return zzhksVarZzb.zzd();
        } catch (zzibg e2) {
            throw new GeneralSecurityException("Parsing AesCmacParameters failed: ", e2);
        }
    }

    public static /* synthetic */ zzhjz zzd(zzhkn zzhknVar, zzhar zzharVar) {
        zzhmt zzhmtVarZze = zzhmu.zze();
        zzhmtVarZze.zzb(zzh(zzhknVar.zzf()));
        byte[] bArrZzc = zzhknVar.zzd().zzc(zzharVar);
        zzhmtVarZze.zza(zzhzl.zzs(bArrZzc, 0, bArrZzc.length));
        return zzhjz.zza("type.googleapis.com/google.crypto.tink.AesCmacKey", ((zzhmu) zzhmtVarZze.zzbu()).zzaM(), zzhoz.SYMMETRIC, zzf(zzhknVar.zzf().zzf()), zzhknVar.zzb());
    }

    public static /* synthetic */ zzhkn zze(zzhjz zzhjzVar, zzhar zzharVar) throws GeneralSecurityException {
        if (!zzhjzVar.zzg().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseKey");
        }
        try {
            zzhmu zzhmuVarZzd = zzhmu.zzd(zzhjzVar.zzb(), zziab.zza());
            if (zzhmuVarZzd.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzhks zzhksVarZzb = zzhku.zzb();
            zzhksVarZzb.zza(zzhmuVarZzd.zzb().zzc());
            zzhksVarZzb.zzb(zzhmuVarZzd.zzc().zza());
            zzhksVarZzb.zzc(zzg(zzhjzVar.zzd()));
            zzhku zzhkuVarZzd = zzhksVarZzb.zzd();
            zzhkm zzhkmVarZzc = zzhkn.zzc();
            zzhkmVarZzc.zza(zzhkuVarZzd);
            zzhkmVarZzc.zzb(zzhxe.zza(zzhmuVarZzd.zzb().zzy(), zzharVar));
            zzhkmVarZzc.zzc(zzhjzVar.zze());
            return zzhkmVarZzc.zzd();
        } catch (zzibg | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing AesCmacKey failed");
        }
    }

    private static zzhpw zzf(zzhkt zzhktVar) throws GeneralSecurityException {
        if (zzhkt.zza.equals(zzhktVar)) {
            return zzhpw.TINK;
        }
        if (zzhkt.zzb.equals(zzhktVar)) {
            return zzhpw.CRUNCHY;
        }
        if (zzhkt.zzd.equals(zzhktVar)) {
            return zzhpw.RAW;
        }
        if (zzhkt.zzc.equals(zzhktVar)) {
            return zzhpw.LEGACY;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzhktVar)));
    }

    private static zzhkt zzg(zzhpw zzhpwVar) throws GeneralSecurityException {
        int iOrdinal = zzhpwVar.ordinal();
        if (iOrdinal == 1) {
            return zzhkt.zza;
        }
        if (iOrdinal == 2) {
            return zzhkt.zzc;
        }
        if (iOrdinal == 3) {
            return zzhkt.zzd;
        }
        if (iOrdinal == 4) {
            return zzhkt.zzb;
        }
        int iZza = zzhpwVar.zza();
        throw new GeneralSecurityException(androidx.datastore.preferences.protobuf.a.g(iZza, "Unable to parse OutputPrefixType: ", new StringBuilder(String.valueOf(iZza).length() + 34)));
    }

    private static zzhmy zzh(zzhku zzhkuVar) {
        zzhmx zzhmxVarZzb = zzhmy.zzb();
        zzhmxVarZzb.zza(zzhkuVar.zzd());
        return (zzhmy) zzhmxVarZzb.zzbu();
    }
}
