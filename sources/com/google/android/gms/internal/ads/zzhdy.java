package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhdy {
    public static final /* synthetic */ int zza = 0;
    private static final zzhxc zzb;
    private static final zzhjl zzc;
    private static final zzhji zzd;
    private static final zzhig zze;
    private static final zzhid zzf;

    static {
        zzhxc zzhxcVarZza = zzhkl.zza("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
        zzb = zzhxcVarZza;
        zzc = zzhjl.zzd(zzhdx.zza, zzhdt.class, zzhka.class);
        zzd = zzhji.zzd(zzhdu.zza, zzhxcVarZza, zzhka.class);
        zze = zzhig.zzd(zzhdv.zza, zzhdp.class, zzhjz.class);
        zzf = zzhid.zzd(zzhdw.zza, zzhxcVarZza, zzhjz.class);
    }

    public static void zza(zzhje zzhjeVar) throws GeneralSecurityException {
        zzhjeVar.zzd(zzc);
        zzhjeVar.zze(zzd);
        zzhjeVar.zzb(zze);
        zzhjeVar.zzc(zzf);
    }

    public static /* synthetic */ zzhka zzb(zzhdt zzhdtVar) {
        zzhpc zzhpcVarZze = zzhpd.zze();
        zzhpcVarZze.zza("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
        zzhpcVarZze.zzb(zzg(zzhdtVar).zzaM());
        zzhpcVarZze.zzc(zzf(zzhdtVar.zzc()));
        return zzhka.zza((zzhpd) zzhpcVarZze.zzbu());
    }

    public static /* synthetic */ zzhdt zzc(zzhka zzhkaVar) throws GeneralSecurityException {
        if (!zzhkaVar.zzc().zza().equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseParameters: ".concat(String.valueOf(zzhkaVar.zzc().zza())));
        }
        try {
            return zzh(zzhpv.zzc(zzhkaVar.zzc().zzb(), zziab.zza()), zzhkaVar.zzc().zzc());
        } catch (zzibg e2) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e2);
        }
    }

    public static /* synthetic */ zzhjz zzd(zzhdp zzhdpVar, zzhar zzharVar) {
        zzhps zzhpsVarZzd = zzhpt.zzd();
        zzhpsVarZzd.zza(zzg(zzhdpVar.zze()));
        return zzhjz.zza("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey", ((zzhpt) zzhpsVarZzd.zzbu()).zzaM(), zzhoz.REMOTE, zzf(zzhdpVar.zze().zzc()), zzhdpVar.zzb());
    }

    public static /* synthetic */ zzhdp zze(zzhjz zzhjzVar, zzhar zzharVar) throws GeneralSecurityException {
        if (!zzhjzVar.zzg().equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseKey");
        }
        try {
            zzhpt zzhptVarZzc = zzhpt.zzc(zzhjzVar.zzb(), zziab.zza());
            if (zzhptVarZzc.zza() == 0) {
                return zzhdp.zzd(zzh(zzhptVarZzc.zzb(), zzhjzVar.zzd()), zzhjzVar.zze());
            }
            String strValueOf = String.valueOf(zzhptVarZzc);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 58);
            sb.append("KmsEnvelopeAeadKeys are only accepted with version 0, got ");
            sb.append(strValueOf);
            throw new GeneralSecurityException(sb.toString());
        } catch (zzibg e2) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKey failed: ", e2);
        }
    }

    private static zzhpw zzf(zzhds zzhdsVar) throws GeneralSecurityException {
        if (zzhds.zza.equals(zzhdsVar)) {
            return zzhpw.TINK;
        }
        if (zzhds.zzb.equals(zzhdsVar)) {
            return zzhpw.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzhdsVar)));
    }

    private static zzhpv zzg(zzhdt zzhdtVar) throws GeneralSecurityException {
        try {
            zzhpd zzhpdVarZzd = zzhpd.zzd(zzhat.zza(zzhdtVar.zzd()), zziab.zza());
            zzhpu zzhpuVarZzd = zzhpv.zzd();
            zzhpuVarZzd.zza(zzhdtVar.zzb());
            zzhpuVarZzd.zzb(zzhpdVarZzd);
            return (zzhpv) zzhpuVarZzd.zzbu();
        } catch (zzibg e2) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e2);
        }
    }

    private static zzhdt zzh(zzhpv zzhpvVar, zzhpw zzhpwVar) throws GeneralSecurityException {
        zzhdr zzhdrVar;
        zzhds zzhdsVar;
        zzhpc zzhpcVarZze = zzhpd.zze();
        zzhpcVarZze.zza(zzhpvVar.zzb().zza());
        zzhpcVarZze.zzb(zzhpvVar.zzb().zzb());
        zzhpcVarZze.zzc(zzhpw.RAW);
        zzhan zzhanVarZzb = zzhat.zzb(((zzhpd) zzhpcVarZze.zzbu()).zzaN());
        if (zzhanVarZzb instanceof zzhck) {
            zzhdrVar = zzhdr.zza;
        } else if (zzhanVarZzb instanceof zzhcz) {
            zzhdrVar = zzhdr.zzc;
        } else if (zzhanVarZzb instanceof zzhev) {
            zzhdrVar = zzhdr.zzb;
        } else if (zzhanVarZzb instanceof zzhbt) {
            zzhdrVar = zzhdr.zzd;
        } else if (zzhanVarZzb instanceof zzhcb) {
            zzhdrVar = zzhdr.zze;
        } else {
            if (!(zzhanVarZzb instanceof zzhct)) {
                throw new GeneralSecurityException("Unsupported DEK parameters when parsing ".concat(zzhanVarZzb.toString()));
            }
            zzhdrVar = zzhdr.zzf;
        }
        zzhdq zzhdqVar = new zzhdq(null);
        int iOrdinal = zzhpwVar.ordinal();
        if (iOrdinal == 1) {
            zzhdsVar = zzhds.zza;
        } else {
            if (iOrdinal != 3) {
                int iZza = zzhpwVar.zza();
                throw new GeneralSecurityException(androidx.datastore.preferences.protobuf.a.g(iZza, "Unable to parse OutputPrefixType: ", new StringBuilder(String.valueOf(iZza).length() + 34)));
            }
            zzhdsVar = zzhds.zzb;
        }
        zzhdqVar.zza(zzhdsVar);
        zzhdqVar.zzb(zzhpvVar.zza());
        zzhdqVar.zzd((zzhbf) zzhanVarZzb);
        zzhdqVar.zzc(zzhdrVar);
        return zzhdqVar.zze();
    }
}
