package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhfm {
    public static final /* synthetic */ int zza = 0;
    private static final zzhxc zzb;
    private static final zzhjl zzc;
    private static final zzhji zzd;
    private static final zzhig zze;
    private static final zzhid zzf;

    static {
        zzhxc zzhxcVarZza = zzhkl.zza("type.googleapis.com/google.crypto.tink.AesGcmKey");
        zzb = zzhxcVarZza;
        zzc = zzhjl.zzd(zzhfl.zza, zzhck.class, zzhka.class);
        zzd = zzhji.zzd(zzhfi.zza, zzhxcVarZza, zzhka.class);
        zze = zzhig.zzd(zzhfj.zza, zzhcd.class, zzhjz.class);
        zzf = zzhid.zzd(zzhfk.zza, zzhxcVarZza, zzhjz.class);
    }

    public static void zza(zzhje zzhjeVar) throws GeneralSecurityException {
        zzhjeVar.zzd(zzc);
        zzhjeVar.zze(zzd);
        zzhjeVar.zzb(zze);
        zzhjeVar.zzc(zzf);
    }

    public static /* synthetic */ zzhka zzb(zzhck zzhckVar) {
        zzhpc zzhpcVarZze = zzhpd.zze();
        zzhpcVarZze.zza("type.googleapis.com/google.crypto.tink.AesGcmKey");
        zzhnr zzhnrVarZzd = zzhns.zzd();
        zzhnrVarZzd.zza(zzhckVar.zzc());
        zzhpcVarZze.zzb(((zzhns) zzhnrVarZzd.zzbu()).zzaM());
        zzhpcVarZze.zzc(zzf(zzhckVar.zzd()));
        return zzhka.zza((zzhpd) zzhpcVarZze.zzbu());
    }

    public static /* synthetic */ zzhck zzc(zzhka zzhkaVar) throws GeneralSecurityException {
        if (!zzhkaVar.zzc().zza().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseParameters: ".concat(String.valueOf(zzhkaVar.zzc().zza())));
        }
        try {
            zzhns zzhnsVarZzc = zzhns.zzc(zzhkaVar.zzc().zzb(), zziab.zza());
            if (zzhnsVarZzc.zzb() != 0) {
                throw new GeneralSecurityException("Only version 0 parameters are accepted");
            }
            zzhci zzhciVarZzb = zzhck.zzb();
            zzhciVarZzb.zza(zzhnsVarZzc.zza());
            zzhciVarZzb.zzb(12);
            zzhciVarZzb.zzc(16);
            zzhciVarZzb.zzd(zzg(zzhkaVar.zzc().zzc()));
            return zzhciVarZzb.zze();
        } catch (zzibg e2) {
            throw new GeneralSecurityException("Parsing AesGcmParameters failed: ", e2);
        }
    }

    public static /* synthetic */ zzhjz zzd(zzhcd zzhcdVar, zzhar zzharVar) {
        zzhnp zzhnpVarZzd = zzhnq.zzd();
        byte[] bArrZzc = zzhcdVar.zze().zzc(zzharVar);
        zzhnpVarZzd.zza(zzhzl.zzs(bArrZzc, 0, bArrZzc.length));
        return zzhjz.zza("type.googleapis.com/google.crypto.tink.AesGcmKey", ((zzhnq) zzhnpVarZzd.zzbu()).zzaM(), zzhoz.SYMMETRIC, zzf(zzhcdVar.zzf().zzd()), zzhcdVar.zzb());
    }

    public static /* synthetic */ zzhcd zze(zzhjz zzhjzVar, zzhar zzharVar) throws GeneralSecurityException {
        if (!zzhjzVar.zzg().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseKey");
        }
        try {
            zzhnq zzhnqVarZzc = zzhnq.zzc(zzhjzVar.zzb(), zziab.zza());
            if (zzhnqVarZzc.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzhci zzhciVarZzb = zzhck.zzb();
            zzhciVarZzb.zza(zzhnqVarZzc.zzb().zzc());
            zzhciVarZzb.zzb(12);
            zzhciVarZzb.zzc(16);
            zzhciVarZzb.zzd(zzg(zzhjzVar.zzd()));
            zzhck zzhckVarZze = zzhciVarZzb.zze();
            zzhcc zzhccVarZzd = zzhcd.zzd();
            zzhccVarZzd.zza(zzhckVarZze);
            zzhccVarZzd.zzb(zzhxe.zza(zzhnqVarZzc.zzb().zzy(), zzharVar));
            zzhccVarZzd.zzc(zzhjzVar.zze());
            return zzhccVarZzd.zzd();
        } catch (zzibg unused) {
            throw new GeneralSecurityException("Parsing AesGcmKey failed");
        }
    }

    private static zzhpw zzf(zzhcj zzhcjVar) throws GeneralSecurityException {
        if (zzhcj.zza.equals(zzhcjVar)) {
            return zzhpw.TINK;
        }
        if (zzhcj.zzb.equals(zzhcjVar)) {
            return zzhpw.CRUNCHY;
        }
        if (zzhcj.zzc.equals(zzhcjVar)) {
            return zzhpw.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzhcjVar)));
    }

    private static zzhcj zzg(zzhpw zzhpwVar) throws GeneralSecurityException {
        int iOrdinal = zzhpwVar.ordinal();
        if (iOrdinal == 1) {
            return zzhcj.zza;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return zzhcj.zzc;
            }
            if (iOrdinal != 4) {
                int iZza = zzhpwVar.zza();
                throw new GeneralSecurityException(androidx.datastore.preferences.protobuf.a.g(iZza, "Unable to parse OutputPrefixType: ", new StringBuilder(String.valueOf(iZza).length() + 34)));
            }
        }
        return zzhcj.zzb;
    }
}
