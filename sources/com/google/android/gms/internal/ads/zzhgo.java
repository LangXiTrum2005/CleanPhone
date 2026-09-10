package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhgo {
    public static final /* synthetic */ int zza = 0;
    private static final zzhxc zzb;
    private static final zzhjl zzc;
    private static final zzhji zzd;
    private static final zzhig zze;
    private static final zzhid zzf;

    static {
        zzhxc zzhxcVarZza = zzhkl.zza("type.googleapis.com/google.crypto.tink.XAesGcmKey");
        zzb = zzhxcVarZza;
        zzc = zzhjl.zzd(zzhgn.zza, zzheo.class, zzhka.class);
        zzd = zzhji.zzd(zzhgk.zza, zzhxcVarZza, zzhka.class);
        zze = zzhig.zzd(zzhgl.zza, zzhej.class, zzhjz.class);
        zzf = zzhid.zzd(zzhgm.zza, zzhxcVarZza, zzhjz.class);
    }

    public static void zza(zzhje zzhjeVar) throws GeneralSecurityException {
        zzhjeVar.zzd(zzc);
        zzhjeVar.zze(zzd);
        zzhjeVar.zzb(zze);
        zzhjeVar.zzc(zzf);
    }

    public static /* synthetic */ zzhka zzb(zzheo zzheoVar) {
        zzhpc zzhpcVarZze = zzhpd.zze();
        zzhpcVarZze.zza("type.googleapis.com/google.crypto.tink.XAesGcmKey");
        zzhqr zzhqrVarZzd = zzhqs.zzd();
        zzhqt zzhqtVarZzb = zzhqu.zzb();
        zzhqtVarZzb.zza(zzheoVar.zzd());
        zzhqrVarZzd.zza((zzhqu) zzhqtVarZzb.zzbu());
        zzhpcVarZze.zzb(((zzhqs) zzhqrVarZzd.zzbu()).zzaM());
        zzhpcVarZze.zzc(zzf(zzheoVar.zzc()));
        return zzhka.zza((zzhpd) zzhpcVarZze.zzbu());
    }

    public static /* synthetic */ zzheo zzc(zzhka zzhkaVar) throws GeneralSecurityException {
        if (!zzhkaVar.zzc().zza().equals("type.googleapis.com/google.crypto.tink.XAesGcmKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to XAesGcmProtoSerialization.parseParameters: ".concat(String.valueOf(zzhkaVar.zzc().zza())));
        }
        try {
            zzhqs zzhqsVarZzc = zzhqs.zzc(zzhkaVar.zzc().zzb(), zziab.zza());
            if (zzhqsVarZzc.zza() == 0) {
                return zzheo.zzb(zzg(zzhkaVar.zzc().zzc()), zzhqsVarZzc.zzb().zza());
            }
            throw new GeneralSecurityException("Only version 0 parameters are accepted");
        } catch (zzibg e2) {
            throw new GeneralSecurityException("Parsing XAesGcmParameters failed: ", e2);
        }
    }

    public static /* synthetic */ zzhjz zzd(zzhej zzhejVar, zzhar zzharVar) {
        zzhqp zzhqpVarZze = zzhqq.zze();
        byte[] bArrZzc = zzhejVar.zze().zzc(zzharVar);
        zzhqpVarZze.zzb(zzhzl.zzs(bArrZzc, 0, bArrZzc.length));
        zzhqt zzhqtVarZzb = zzhqu.zzb();
        zzhqtVarZzb.zza(zzhejVar.zzf().zzd());
        zzhqpVarZze.zza((zzhqu) zzhqtVarZzb.zzbu());
        return zzhjz.zza("type.googleapis.com/google.crypto.tink.XAesGcmKey", ((zzhqq) zzhqpVarZze.zzbu()).zzaM(), zzhoz.SYMMETRIC, zzf(zzhejVar.zzf().zzc()), zzhejVar.zzb());
    }

    public static /* synthetic */ zzhej zze(zzhjz zzhjzVar, zzhar zzharVar) throws GeneralSecurityException {
        if (!zzhjzVar.zzg().equals("type.googleapis.com/google.crypto.tink.XAesGcmKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to XAesGcmProtoSerialization.parseKey");
        }
        try {
            zzhqq zzhqqVarZzd = zzhqq.zzd(zzhjzVar.zzb(), zziab.zza());
            if (zzhqqVarZzd.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            if (zzhqqVarZzd.zzc().zzc() == 32) {
                return zzhej.zzd(zzheo.zzb(zzg(zzhjzVar.zzd()), zzhqqVarZzd.zzb().zza()), zzhxe.zza(zzhqqVarZzd.zzc().zzy(), zzharVar), zzhjzVar.zze());
            }
            throw new GeneralSecurityException("Only 32 byte key size is accepted");
        } catch (zzibg unused) {
            throw new GeneralSecurityException("Parsing XAesGcmKey failed");
        }
    }

    private static zzhpw zzf(zzhen zzhenVar) throws GeneralSecurityException {
        if (Objects.equals(zzhenVar, zzhen.zza)) {
            return zzhpw.TINK;
        }
        if (Objects.equals(zzhenVar, zzhen.zzb)) {
            return zzhpw.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(zzhenVar.toString()));
    }

    private static zzhen zzg(zzhpw zzhpwVar) throws GeneralSecurityException {
        int iOrdinal = zzhpwVar.ordinal();
        if (iOrdinal == 1) {
            return zzhen.zza;
        }
        if (iOrdinal == 3) {
            return zzhen.zzb;
        }
        int iZza = zzhpwVar.zza();
        throw new GeneralSecurityException(androidx.datastore.preferences.protobuf.a.g(iZza, "Unable to parse OutputPrefixType: ", new StringBuilder(String.valueOf(iZza).length() + 34)));
    }
}
