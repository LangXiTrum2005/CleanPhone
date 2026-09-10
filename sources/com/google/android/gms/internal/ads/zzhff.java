package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhff {
    public static final /* synthetic */ int zza = 0;
    private static final zzhxc zzb;
    private static final zzhjl zzc;
    private static final zzhji zzd;
    private static final zzhig zze;
    private static final zzhid zzf;

    static {
        zzhxc zzhxcVarZza = zzhkl.zza("type.googleapis.com/google.crypto.tink.AesEaxKey");
        zzb = zzhxcVarZza;
        zzc = zzhjl.zzd(zzhfe.zza, zzhcb.class, zzhka.class);
        zzd = zzhji.zzd(zzhfb.zza, zzhxcVarZza, zzhka.class);
        zze = zzhig.zzd(zzhfc.zza, zzhbv.class, zzhjz.class);
        zzf = zzhid.zzd(zzhfd.zza, zzhxcVarZza, zzhjz.class);
    }

    public static void zza(zzhje zzhjeVar) throws GeneralSecurityException {
        zzhjeVar.zzd(zzc);
        zzhjeVar.zze(zzd);
        zzhjeVar.zzb(zze);
        zzhjeVar.zzc(zzf);
    }

    public static /* synthetic */ zzhka zzb(zzhcb zzhcbVar) {
        zzhpc zzhpcVarZze = zzhpd.zze();
        zzhpcVarZze.zza("type.googleapis.com/google.crypto.tink.AesEaxKey");
        zzhnl zzhnlVarZzd = zzhnm.zzd();
        zzhnlVarZzd.zza(zzh(zzhcbVar));
        zzhnlVarZzd.zzb(zzhcbVar.zzc());
        zzhpcVarZze.zzb(((zzhnm) zzhnlVarZzd.zzbu()).zzaM());
        zzhpcVarZze.zzc(zzf(zzhcbVar.zze()));
        return zzhka.zza((zzhpd) zzhpcVarZze.zzbu());
    }

    public static /* synthetic */ zzhcb zzc(zzhka zzhkaVar) throws GeneralSecurityException {
        if (!zzhkaVar.zzc().zza().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseParameters: ".concat(String.valueOf(zzhkaVar.zzc().zza())));
        }
        try {
            zzhnm zzhnmVarZzc = zzhnm.zzc(zzhkaVar.zzc().zzb(), zziab.zza());
            zzhbz zzhbzVarZzb = zzhcb.zzb();
            zzhbzVarZzb.zza(zzhnmVarZzc.zzb());
            zzhbzVarZzb.zzb(zzhnmVarZzc.zza().zza());
            zzhbzVarZzb.zzc(16);
            zzhbzVarZzb.zzd(zzg(zzhkaVar.zzc().zzc()));
            return zzhbzVarZzb.zze();
        } catch (zzibg e2) {
            throw new GeneralSecurityException("Parsing AesEaxParameters failed: ", e2);
        }
    }

    public static /* synthetic */ zzhjz zzd(zzhbv zzhbvVar, zzhar zzharVar) {
        zzhnj zzhnjVarZze = zzhnk.zze();
        zzhnjVarZze.zza(zzh(zzhbvVar.zzf()));
        byte[] bArrZzc = zzhbvVar.zze().zzc(zzharVar);
        zzhnjVarZze.zzb(zzhzl.zzs(bArrZzc, 0, bArrZzc.length));
        return zzhjz.zza("type.googleapis.com/google.crypto.tink.AesEaxKey", ((zzhnk) zzhnjVarZze.zzbu()).zzaM(), zzhoz.SYMMETRIC, zzf(zzhbvVar.zzf().zze()), zzhbvVar.zzb());
    }

    public static /* synthetic */ zzhbv zze(zzhjz zzhjzVar, zzhar zzharVar) throws GeneralSecurityException {
        if (!zzhjzVar.zzg().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseKey");
        }
        try {
            zzhnk zzhnkVarZzd = zzhnk.zzd(zzhjzVar.zzb(), zziab.zza());
            if (zzhnkVarZzd.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzhbz zzhbzVarZzb = zzhcb.zzb();
            zzhbzVarZzb.zza(zzhnkVarZzd.zzc().zzc());
            zzhbzVarZzb.zzb(zzhnkVarZzd.zzb().zza());
            zzhbzVarZzb.zzc(16);
            zzhbzVarZzb.zzd(zzg(zzhjzVar.zzd()));
            zzhcb zzhcbVarZze = zzhbzVarZzb.zze();
            zzhbu zzhbuVarZzd = zzhbv.zzd();
            zzhbuVarZzd.zza(zzhcbVarZze);
            zzhbuVarZzd.zzb(zzhxe.zza(zzhnkVarZzd.zzc().zzy(), zzharVar));
            zzhbuVarZzd.zzc(zzhjzVar.zze());
            return zzhbuVarZzd.zzd();
        } catch (zzibg unused) {
            throw new GeneralSecurityException("Parsing AesEaxcKey failed");
        }
    }

    private static zzhpw zzf(zzhca zzhcaVar) throws GeneralSecurityException {
        if (zzhca.zza.equals(zzhcaVar)) {
            return zzhpw.TINK;
        }
        if (zzhca.zzb.equals(zzhcaVar)) {
            return zzhpw.CRUNCHY;
        }
        if (zzhca.zzc.equals(zzhcaVar)) {
            return zzhpw.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzhcaVar)));
    }

    private static zzhca zzg(zzhpw zzhpwVar) throws GeneralSecurityException {
        int iOrdinal = zzhpwVar.ordinal();
        if (iOrdinal == 1) {
            return zzhca.zza;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return zzhca.zzc;
            }
            if (iOrdinal != 4) {
                int iZza = zzhpwVar.zza();
                throw new GeneralSecurityException(androidx.datastore.preferences.protobuf.a.g(iZza, "Unable to parse OutputPrefixType: ", new StringBuilder(String.valueOf(iZza).length() + 34)));
            }
        }
        return zzhca.zzb;
    }

    private static zzhno zzh(zzhcb zzhcbVar) throws GeneralSecurityException {
        zzhnn zzhnnVarZzb = zzhno.zzb();
        zzhnnVarZzb.zza(zzhcbVar.zzd());
        return (zzhno) zzhnnVarZzb.zzbu();
    }
}
