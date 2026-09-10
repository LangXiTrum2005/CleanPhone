package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhfz {
    public static final /* synthetic */ int zza = 0;
    private static final zzhxc zzb;
    private static final zzhjl zzc;
    private static final zzhji zzd;
    private static final zzhig zze;
    private static final zzhid zzf;

    static {
        zzhxc zzhxcVarZza = zzhkl.zza("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        zzb = zzhxcVarZza;
        zzc = zzhjl.zzd(zzhfy.zza, zzhcz.class, zzhka.class);
        zzd = zzhji.zzd(zzhfv.zza, zzhxcVarZza, zzhka.class);
        zze = zzhig.zzd(zzhfw.zza, zzhcu.class, zzhjz.class);
        zzf = zzhid.zzd(zzhfx.zza, zzhxcVarZza, zzhjz.class);
    }

    public static void zza(zzhje zzhjeVar) throws GeneralSecurityException {
        zzhjeVar.zzd(zzc);
        zzhjeVar.zze(zzd);
        zzhjeVar.zzb(zze);
        zzhjeVar.zzc(zzf);
    }

    public static /* synthetic */ zzhka zzb(zzhcz zzhczVar) {
        zzhpc zzhpcVarZze = zzhpd.zze();
        zzhpcVarZze.zza("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        zzhpcVarZze.zzb(zzhoa.zzb().zzaM());
        zzhpcVarZze.zzc(zzf(zzhczVar.zzc()));
        return zzhka.zza((zzhpd) zzhpcVarZze.zzbu());
    }

    public static /* synthetic */ zzhcz zzc(zzhka zzhkaVar) throws GeneralSecurityException {
        if (!zzhkaVar.zzc().zza().equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
            throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseParameters: ".concat(String.valueOf(zzhkaVar.zzc().zza())));
        }
        try {
            zzhoa.zza(zzhkaVar.zzc().zzb(), zziab.zza());
            return zzhcz.zzb(zzg(zzhkaVar.zzc().zzc()));
        } catch (zzibg e2) {
            throw new GeneralSecurityException("Parsing ChaCha20Poly1305Parameters failed: ", e2);
        }
    }

    public static /* synthetic */ zzhjz zzd(zzhcu zzhcuVar, zzhar zzharVar) {
        zzhnx zzhnxVarZzd = zzhny.zzd();
        byte[] bArrZzc = zzhcuVar.zze().zzc(zzharVar);
        zzhnxVarZzd.zza(zzhzl.zzs(bArrZzc, 0, bArrZzc.length));
        return zzhjz.zza("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key", ((zzhny) zzhnxVarZzd.zzbu()).zzaM(), zzhoz.SYMMETRIC, zzf(zzhcuVar.zzf().zzc()), zzhcuVar.zzb());
    }

    public static /* synthetic */ zzhcu zze(zzhjz zzhjzVar, zzhar zzharVar) throws GeneralSecurityException {
        if (!zzhjzVar.zzg().equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
            throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseKey");
        }
        try {
            zzhny zzhnyVarZzc = zzhny.zzc(zzhjzVar.zzb(), zziab.zza());
            if (zzhnyVarZzc.zza() == 0) {
                return zzhcu.zzd(zzg(zzhjzVar.zzd()), zzhxe.zza(zzhnyVarZzc.zzb().zzy(), zzharVar), zzhjzVar.zze());
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (zzibg unused) {
            throw new GeneralSecurityException("Parsing ChaCha20Poly1305Key failed");
        }
    }

    private static zzhpw zzf(zzhcy zzhcyVar) throws GeneralSecurityException {
        if (zzhcy.zza.equals(zzhcyVar)) {
            return zzhpw.TINK;
        }
        if (zzhcy.zzb.equals(zzhcyVar)) {
            return zzhpw.CRUNCHY;
        }
        if (zzhcy.zzc.equals(zzhcyVar)) {
            return zzhpw.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(zzhcyVar.toString()));
    }

    private static zzhcy zzg(zzhpw zzhpwVar) throws GeneralSecurityException {
        int iOrdinal = zzhpwVar.ordinal();
        if (iOrdinal == 1) {
            return zzhcy.zza;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return zzhcy.zzc;
            }
            if (iOrdinal != 4) {
                int iZza = zzhpwVar.zza();
                throw new GeneralSecurityException(androidx.datastore.preferences.protobuf.a.g(iZza, "Unable to parse OutputPrefixType: ", new StringBuilder(String.valueOf(iZza).length() + 34)));
            }
        }
        return zzhcy.zzb;
    }
}
