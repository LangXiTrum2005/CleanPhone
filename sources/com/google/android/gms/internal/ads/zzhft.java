package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhft {
    public static final /* synthetic */ int zza = 0;
    private static final zzhxc zzb;
    private static final zzhjl zzc;
    private static final zzhji zzd;
    private static final zzhig zze;
    private static final zzhid zzf;

    static {
        zzhxc zzhxcVarZza = zzhkl.zza("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        zzb = zzhxcVarZza;
        zzc = zzhjl.zzd(zzhfs.zza, zzhct.class, zzhka.class);
        zzd = zzhji.zzd(zzhfp.zza, zzhxcVarZza, zzhka.class);
        zze = zzhig.zzd(zzhfq.zza, zzhcm.class, zzhjz.class);
        zzf = zzhid.zzd(zzhfr.zza, zzhxcVarZza, zzhjz.class);
    }

    public static void zza(zzhje zzhjeVar) throws GeneralSecurityException {
        zzhjeVar.zzd(zzc);
        zzhjeVar.zze(zzd);
        zzhjeVar.zzb(zze);
        zzhjeVar.zzc(zzf);
    }

    public static /* synthetic */ zzhka zzb(zzhct zzhctVar) {
        zzhpc zzhpcVarZze = zzhpd.zze();
        zzhpcVarZze.zza("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        zzhnv zzhnvVarZzd = zzhnw.zzd();
        zzhnvVarZzd.zza(zzhctVar.zzc());
        zzhpcVarZze.zzb(((zzhnw) zzhnvVarZzd.zzbu()).zzaM());
        zzhpcVarZze.zzc(zzf(zzhctVar.zzd()));
        return zzhka.zza((zzhpd) zzhpcVarZze.zzbu());
    }

    public static /* synthetic */ zzhct zzc(zzhka zzhkaVar) throws GeneralSecurityException {
        if (!zzhkaVar.zzc().zza().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseParameters: ".concat(String.valueOf(zzhkaVar.zzc().zza())));
        }
        try {
            zzhnw zzhnwVarZzc = zzhnw.zzc(zzhkaVar.zzc().zzb(), zziab.zza());
            if (zzhnwVarZzc.zzb() != 0) {
                throw new GeneralSecurityException("Only version 0 parameters are accepted");
            }
            zzhcr zzhcrVarZzb = zzhct.zzb();
            zzhcrVarZzb.zza(zzhnwVarZzc.zza());
            zzhcrVarZzb.zzb(zzg(zzhkaVar.zzc().zzc()));
            return zzhcrVarZzb.zzc();
        } catch (zzibg e2) {
            throw new GeneralSecurityException("Parsing AesGcmSivParameters failed: ", e2);
        }
    }

    public static /* synthetic */ zzhjz zzd(zzhcm zzhcmVar, zzhar zzharVar) {
        zzhnt zzhntVarZzd = zzhnu.zzd();
        byte[] bArrZzc = zzhcmVar.zze().zzc(zzharVar);
        zzhntVarZzd.zza(zzhzl.zzs(bArrZzc, 0, bArrZzc.length));
        return zzhjz.zza("type.googleapis.com/google.crypto.tink.AesGcmSivKey", ((zzhnu) zzhntVarZzd.zzbu()).zzaM(), zzhoz.SYMMETRIC, zzf(zzhcmVar.zzf().zzd()), zzhcmVar.zzb());
    }

    public static /* synthetic */ zzhcm zze(zzhjz zzhjzVar, zzhar zzharVar) throws GeneralSecurityException {
        if (!zzhjzVar.zzg().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseKey");
        }
        try {
            zzhnu zzhnuVarZzc = zzhnu.zzc(zzhjzVar.zzb(), zziab.zza());
            if (zzhnuVarZzc.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzhcr zzhcrVarZzb = zzhct.zzb();
            zzhcrVarZzb.zza(zzhnuVarZzc.zzb().zzc());
            zzhcrVarZzb.zzb(zzg(zzhjzVar.zzd()));
            zzhct zzhctVarZzc = zzhcrVarZzb.zzc();
            zzhcl zzhclVarZzd = zzhcm.zzd();
            zzhclVarZzd.zza(zzhctVarZzc);
            zzhclVarZzd.zzb(zzhxe.zza(zzhnuVarZzc.zzb().zzy(), zzharVar));
            zzhclVarZzd.zzc(zzhjzVar.zze());
            return zzhclVarZzd.zzd();
        } catch (zzibg unused) {
            throw new GeneralSecurityException("Parsing AesGcmSivKey failed");
        }
    }

    private static zzhpw zzf(zzhcs zzhcsVar) throws GeneralSecurityException {
        if (zzhcs.zza.equals(zzhcsVar)) {
            return zzhpw.TINK;
        }
        if (zzhcs.zzb.equals(zzhcsVar)) {
            return zzhpw.CRUNCHY;
        }
        if (zzhcs.zzc.equals(zzhcsVar)) {
            return zzhpw.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzhcsVar)));
    }

    private static zzhcs zzg(zzhpw zzhpwVar) throws GeneralSecurityException {
        int iOrdinal = zzhpwVar.ordinal();
        if (iOrdinal == 1) {
            return zzhcs.zza;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return zzhcs.zzc;
            }
            if (iOrdinal != 4) {
                int iZza = zzhpwVar.zza();
                throw new GeneralSecurityException(androidx.datastore.preferences.protobuf.a.g(iZza, "Unable to parse OutputPrefixType: ", new StringBuilder(String.valueOf(iZza).length() + 34)));
            }
        }
        return zzhcs.zzb;
    }
}
