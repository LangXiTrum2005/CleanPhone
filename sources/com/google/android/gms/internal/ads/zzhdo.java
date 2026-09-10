package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes4.dex */
final class zzhdo {
    public static final /* synthetic */ int zza = 0;
    private static final zzhxc zzb;
    private static final zzhjl zzc;
    private static final zzhji zzd;
    private static final zzhig zze;
    private static final zzhid zzf;

    static {
        zzhxc zzhxcVarZza = zzhkl.zza("type.googleapis.com/google.crypto.tink.KmsAeadKey");
        zzb = zzhxcVarZza;
        zzc = zzhjl.zzd(zzhdn.zza, zzhdj.class, zzhka.class);
        zzd = zzhji.zzd(zzhdk.zza, zzhxcVarZza, zzhka.class);
        zze = zzhig.zzd(zzhdl.zza, zzhdh.class, zzhjz.class);
        zzf = zzhid.zzd(zzhdm.zza, zzhxcVarZza, zzhjz.class);
    }

    public static void zza(zzhje zzhjeVar) throws GeneralSecurityException {
        zzhjeVar.zzd(zzc);
        zzhjeVar.zze(zzd);
        zzhjeVar.zzb(zze);
        zzhjeVar.zzc(zzf);
    }

    public static /* synthetic */ zzhka zzb(zzhdj zzhdjVar) {
        zzhpc zzhpcVarZze = zzhpd.zze();
        zzhpcVarZze.zza("type.googleapis.com/google.crypto.tink.KmsAeadKey");
        zzhpq zzhpqVarZzc = zzhpr.zzc();
        zzhpqVarZzc.zza(zzhdjVar.zzc());
        zzhpcVarZze.zzb(((zzhpr) zzhpqVarZzc.zzbu()).zzaM());
        zzhpcVarZze.zzc(zzf(zzhdjVar.zzd()));
        return zzhka.zza((zzhpd) zzhpcVarZze.zzbu());
    }

    public static /* synthetic */ zzhdj zzc(zzhka zzhkaVar) throws GeneralSecurityException {
        if (!zzhkaVar.zzc().zza().equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseParameters: ".concat(String.valueOf(zzhkaVar.zzc().zza())));
        }
        try {
            return zzhdj.zzb(zzhpr.zzb(zzhkaVar.zzc().zzb(), zziab.zza()).zza(), zzg(zzhkaVar.zzc().zzc()));
        } catch (zzibg e2) {
            throw new GeneralSecurityException("Parsing KmsAeadKeyFormat failed: ", e2);
        }
    }

    public static /* synthetic */ zzhjz zzd(zzhdh zzhdhVar, zzhar zzharVar) {
        zzhpo zzhpoVarZzd = zzhpp.zzd();
        zzhpq zzhpqVarZzc = zzhpr.zzc();
        zzhpqVarZzc.zza(zzhdhVar.zze().zzc());
        zzhpoVarZzd.zza((zzhpr) zzhpqVarZzc.zzbu());
        return zzhjz.zza("type.googleapis.com/google.crypto.tink.KmsAeadKey", ((zzhpp) zzhpoVarZzd.zzbu()).zzaM(), zzhoz.REMOTE, zzf(zzhdhVar.zze().zzd()), zzhdhVar.zzb());
    }

    public static /* synthetic */ zzhdh zze(zzhjz zzhjzVar, zzhar zzharVar) throws GeneralSecurityException {
        if (!zzhjzVar.zzg().equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseKey");
        }
        try {
            zzhpp zzhppVarZzc = zzhpp.zzc(zzhjzVar.zzb(), zziab.zza());
            if (zzhppVarZzc.zza() == 0) {
                return zzhdh.zzd(zzhdj.zzb(zzhppVarZzc.zzb().zza(), zzg(zzhjzVar.zzd())), zzhjzVar.zze());
            }
            String strValueOf = String.valueOf(zzhppVarZzc);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 49);
            sb.append("KmsAeadKey are only accepted with version 0, got ");
            sb.append(strValueOf);
            throw new GeneralSecurityException(sb.toString());
        } catch (zzibg e2) {
            throw new GeneralSecurityException("Parsing KmsAeadKey failed: ", e2);
        }
    }

    private static zzhpw zzf(zzhdi zzhdiVar) throws GeneralSecurityException {
        if (zzhdi.zza.equals(zzhdiVar)) {
            return zzhpw.TINK;
        }
        if (zzhdi.zzb.equals(zzhdiVar)) {
            return zzhpw.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(zzhdiVar.toString()));
    }

    private static zzhdi zzg(zzhpw zzhpwVar) throws GeneralSecurityException {
        int iOrdinal = zzhpwVar.ordinal();
        if (iOrdinal == 1) {
            return zzhdi.zza;
        }
        if (iOrdinal == 3) {
            return zzhdi.zzb;
        }
        int iZza = zzhpwVar.zza();
        throw new GeneralSecurityException(androidx.datastore.preferences.protobuf.a.g(iZza, "Unable to parse OutputPrefixType: ", new StringBuilder(String.valueOf(iZza).length() + 34)));
    }
}
