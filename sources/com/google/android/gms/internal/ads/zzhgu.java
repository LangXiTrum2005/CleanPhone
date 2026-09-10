package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhgu {
    public static final /* synthetic */ int zza = 0;
    private static final zzhxc zzb;
    private static final zzhjl zzc;
    private static final zzhji zzd;
    private static final zzhig zze;
    private static final zzhid zzf;

    static {
        zzhxc zzhxcVarZza = zzhkl.zza("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        zzb = zzhxcVarZza;
        zzc = zzhjl.zzd(zzhgt.zza, zzhev.class, zzhka.class);
        zzd = zzhji.zzd(zzhgq.zza, zzhxcVarZza, zzhka.class);
        zze = zzhig.zzd(zzhgr.zza, zzhep.class, zzhjz.class);
        zzf = zzhid.zzd(zzhgs.zza, zzhxcVarZza, zzhjz.class);
    }

    public static void zza(zzhje zzhjeVar) throws GeneralSecurityException {
        zzhjeVar.zzd(zzc);
        zzhjeVar.zze(zzd);
        zzhjeVar.zzb(zze);
        zzhjeVar.zzc(zzf);
    }

    public static /* synthetic */ zzhka zzb(zzhev zzhevVar) {
        zzhpc zzhpcVarZze = zzhpd.zze();
        zzhpcVarZze.zza("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        zzhpcVarZze.zzb(zzhqy.zzc().zzaM());
        zzhpcVarZze.zzc(zzf(zzhevVar.zzc()));
        return zzhka.zza((zzhpd) zzhpcVarZze.zzbu());
    }

    public static /* synthetic */ zzhev zzc(zzhka zzhkaVar) throws GeneralSecurityException {
        if (!zzhkaVar.zzc().zza().equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
            throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseParameters: ".concat(String.valueOf(zzhkaVar.zzc().zza())));
        }
        try {
            if (zzhqy.zzb(zzhkaVar.zzc().zzb(), zziab.zza()).zza() == 0) {
                return zzhev.zzb(zzg(zzhkaVar.zzc().zzc()));
            }
            throw new GeneralSecurityException("Only version 0 parameters are accepted");
        } catch (zzibg e2) {
            throw new GeneralSecurityException("Parsing XChaCha20Poly1305Parameters failed: ", e2);
        }
    }

    public static /* synthetic */ zzhjz zzd(zzhep zzhepVar, zzhar zzharVar) {
        zzhqv zzhqvVarZzd = zzhqw.zzd();
        byte[] bArrZzc = zzhepVar.zze().zzc(zzharVar);
        zzhqvVarZzd.zza(zzhzl.zzs(bArrZzc, 0, bArrZzc.length));
        return zzhjz.zza("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key", ((zzhqw) zzhqvVarZzd.zzbu()).zzaM(), zzhoz.SYMMETRIC, zzf(zzhepVar.zzf().zzc()), zzhepVar.zzb());
    }

    public static /* synthetic */ zzhep zze(zzhjz zzhjzVar, zzhar zzharVar) throws GeneralSecurityException {
        if (!zzhjzVar.zzg().equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
            throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseKey");
        }
        try {
            zzhqw zzhqwVarZzc = zzhqw.zzc(zzhjzVar.zzb(), zziab.zza());
            if (zzhqwVarZzc.zza() == 0) {
                return zzhep.zzd(zzg(zzhjzVar.zzd()), zzhxe.zza(zzhqwVarZzc.zzb().zzy(), zzharVar), zzhjzVar.zze());
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (zzibg unused) {
            throw new GeneralSecurityException("Parsing XChaCha20Poly1305Key failed");
        }
    }

    private static zzhpw zzf(zzheu zzheuVar) throws GeneralSecurityException {
        if (zzheu.zza.equals(zzheuVar)) {
            return zzhpw.TINK;
        }
        if (zzheu.zzb.equals(zzheuVar)) {
            return zzhpw.CRUNCHY;
        }
        if (zzheu.zzc.equals(zzheuVar)) {
            return zzhpw.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(zzheuVar.toString()));
    }

    private static zzheu zzg(zzhpw zzhpwVar) throws GeneralSecurityException {
        int iOrdinal = zzhpwVar.ordinal();
        if (iOrdinal == 1) {
            return zzheu.zza;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return zzheu.zzc;
            }
            if (iOrdinal != 4) {
                int iZza = zzhpwVar.zza();
                throw new GeneralSecurityException(androidx.datastore.preferences.protobuf.a.g(iZza, "Unable to parse OutputPrefixType: ", new StringBuilder(String.valueOf(iZza).length() + 34)));
            }
        }
        return zzheu.zzb;
    }
}
