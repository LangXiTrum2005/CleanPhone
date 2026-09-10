package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.spec.ECPoint;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhub {
    public static final /* synthetic */ int zza = 0;
    private static final zzhxc zzb;
    private static final zzhxc zzc;
    private static final zzhjl zzd;
    private static final zzhji zze;
    private static final zzhig zzf;
    private static final zzhid zzg;
    private static final zzhig zzh;
    private static final zzhid zzi;

    static {
        zzhxc zzhxcVarZza = zzhkl.zza("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey");
        zzb = zzhxcVarZza;
        zzhxc zzhxcVarZza2 = zzhkl.zza("type.googleapis.com/google.crypto.tink.EcdsaPublicKey");
        zzc = zzhxcVarZza2;
        zzd = zzhjl.zzd(zzhua.zza, zzhre.class, zzhka.class);
        zze = zzhji.zzd(zzhtv.zza, zzhxcVarZza, zzhka.class);
        zzf = zzhig.zzd(zzhtw.zza, zzhri.class, zzhjz.class);
        zzg = zzhid.zzd(zzhtx.zza, zzhxcVarZza2, zzhjz.class);
        zzh = zzhig.zzd(zzhty.zza, zzhrg.class, zzhjz.class);
        zzi = zzhid.zzd(zzhtz.zza, zzhxcVarZza, zzhjz.class);
    }

    public static void zza(zzhje zzhjeVar) throws GeneralSecurityException {
        zzhjeVar.zzd(zzd);
        zzhjeVar.zze(zze);
        zzhjeVar.zzb(zzf);
        zzhjeVar.zzc(zzg);
        zzhjeVar.zzb(zzh);
        zzhjeVar.zzc(zzi);
    }

    public static /* synthetic */ zzhka zzb(zzhre zzhreVar) {
        zzhpc zzhpcVarZze = zzhpd.zze();
        zzhpcVarZze.zza("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey");
        zzhob zzhobVarZzc = zzhoc.zzc();
        zzhobVarZzc.zza(zzl(zzhreVar));
        zzhpcVarZze.zzb(((zzhoc) zzhobVarZzc.zzbu()).zzaM());
        zzhpcVarZze.zzc(zzh(zzhreVar.zzf()));
        return zzhka.zza((zzhpd) zzhpcVarZze.zzbu());
    }

    public static /* synthetic */ zzhre zzc(zzhka zzhkaVar) throws GeneralSecurityException {
        if (!zzhkaVar.zzc().zza().equals("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to EcdsaProtoSerialization.parseParameters: ".concat(String.valueOf(zzhkaVar.zzc().zza())));
        }
        try {
            zzhoc zzhocVarZzb = zzhoc.zzb(zzhkaVar.zzc().zzb(), zziab.zza());
            zzhqz zzhqzVarZzb = zzhre.zzb();
            zzhqzVarZzb.zzc(zzi(zzhocVarZzb.zza().zza()));
            zzhqzVarZzb.zza(zzo(zzhocVarZzb.zza().zzh()));
            zzhqzVarZzb.zzb(zzn(zzhocVarZzb.zza().zzg()));
            zzhqzVarZzb.zzd(zzj(zzhkaVar.zzc().zzc()));
            return zzhqzVarZzb.zze();
        } catch (zzibg e2) {
            throw new GeneralSecurityException("Parsing EcdsaParameters failed: ", e2);
        }
    }

    public static /* synthetic */ zzhri zze(zzhjz zzhjzVar, zzhar zzharVar) throws GeneralSecurityException {
        if (!zzhjzVar.zzg().equals("type.googleapis.com/google.crypto.tink.EcdsaPublicKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to EcdsaProtoSerialization.parsePublicKey: ".concat(String.valueOf(zzhjzVar.zzg())));
        }
        try {
            zzhoi zzhoiVarZze = zzhoi.zze(zzhjzVar.zzb(), zziab.zza());
            if (zzhoiVarZze.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzhqz zzhqzVarZzb = zzhre.zzb();
            zzhqzVarZzb.zzc(zzi(zzhoiVarZze.zzb().zza()));
            zzhqzVarZzb.zza(zzo(zzhoiVarZze.zzb().zzh()));
            zzhqzVarZzb.zzb(zzn(zzhoiVarZze.zzb().zzg()));
            zzhqzVarZzb.zzd(zzj(zzhjzVar.zzd()));
            zzhre zzhreVarZze = zzhqzVarZzb.zze();
            zzhrh zzhrhVarZzc = zzhri.zzc();
            zzhrhVarZzc.zza(zzhreVarZze);
            zzhrhVarZzc.zzb(new ECPoint(new BigInteger(1, zzhoiVarZze.zzc().zzy()), new BigInteger(1, zzhoiVarZze.zzd().zzy())));
            zzhrhVarZzc.zzc(zzhjzVar.zze());
            return zzhrhVarZzc.zzd();
        } catch (zzibg | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing EcdsaPublicKey failed");
        }
    }

    public static /* synthetic */ zzhjz zzf(zzhrg zzhrgVar, zzhar zzharVar) throws GeneralSecurityException {
        int iZzk = zzk(zzhrgVar.zzd().zzd());
        zzhof zzhofVarZze = zzhog.zze();
        zzhofVarZze.zza(zzm(zzhrgVar.zze()));
        byte[] bArrZzb = zzhhe.zzb(zzhrgVar.zzf().zzb(zzharVar), iZzk);
        zzhzl zzhzlVar = zzhzl.zzb;
        zzhofVarZze.zzb(zzhzl.zzs(bArrZzb, 0, bArrZzb.length));
        return zzhjz.zza("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey", ((zzhog) zzhofVarZze.zzbu()).zzaM(), zzhoz.ASYMMETRIC_PRIVATE, zzh(zzhrgVar.zzd().zzf()), zzhrgVar.zze().zzb());
    }

    public static /* synthetic */ zzhrg zzg(zzhjz zzhjzVar, zzhar zzharVar) throws GeneralSecurityException {
        if (!zzhjzVar.zzg().equals("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to EcdsaProtoSerialization.parsePrivateKey: ".concat(String.valueOf(zzhjzVar.zzg())));
        }
        try {
            zzhog zzhogVarZzd = zzhog.zzd(zzhjzVar.zzb(), zziab.zza());
            if (zzhogVarZzd.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzhoi zzhoiVarZzb = zzhogVarZzd.zzb();
            if (zzhoiVarZzb.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzhqz zzhqzVarZzb = zzhre.zzb();
            zzhqzVarZzb.zzc(zzi(zzhoiVarZzb.zzb().zza()));
            zzhqzVarZzb.zza(zzo(zzhoiVarZzb.zzb().zzh()));
            zzhqzVarZzb.zzb(zzn(zzhoiVarZzb.zzb().zzg()));
            zzhqzVarZzb.zzd(zzj(zzhjzVar.zzd()));
            zzhre zzhreVarZze = zzhqzVarZzb.zze();
            zzhrh zzhrhVarZzc = zzhri.zzc();
            zzhrhVarZzc.zza(zzhreVarZze);
            zzhrhVarZzc.zzb(new ECPoint(new BigInteger(1, zzhoiVarZzb.zzc().zzy()), new BigInteger(1, zzhoiVarZzb.zzd().zzy())));
            zzhrhVarZzc.zzc(zzhjzVar.zze());
            zzhri zzhriVarZzd = zzhrhVarZzc.zzd();
            zzhrf zzhrfVarZzc = zzhrg.zzc();
            zzhrfVarZzc.zza(zzhriVarZzd);
            zzhrfVarZzc.zzb(zzhxd.zza(new BigInteger(1, zzhogVarZzd.zzc().zzy()), zzharVar));
            return zzhrfVarZzc.zzc();
        } catch (zzibg | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing EcdsaPrivateKey failed");
        }
    }

    private static zzhpw zzh(zzhrd zzhrdVar) throws GeneralSecurityException {
        if (zzhrd.zza.equals(zzhrdVar)) {
            return zzhpw.TINK;
        }
        if (zzhrd.zzb.equals(zzhrdVar)) {
            return zzhpw.CRUNCHY;
        }
        if (zzhrd.zzd.equals(zzhrdVar)) {
            return zzhpw.RAW;
        }
        if (zzhrd.zzc.equals(zzhrdVar)) {
            return zzhpw.LEGACY;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(zzhrdVar.toString()));
    }

    private static zzhrb zzi(zzhor zzhorVar) throws GeneralSecurityException {
        int iOrdinal = zzhorVar.ordinal();
        if (iOrdinal == 2) {
            return zzhrb.zzb;
        }
        if (iOrdinal == 3) {
            return zzhrb.zza;
        }
        if (iOrdinal == 4) {
            return zzhrb.zzc;
        }
        int iZza = zzhorVar.zza();
        throw new GeneralSecurityException(androidx.datastore.preferences.protobuf.a.g(iZza, "Unable to parse HashType: ", new StringBuilder(String.valueOf(iZza).length() + 26)));
    }

    private static zzhrd zzj(zzhpw zzhpwVar) throws GeneralSecurityException {
        int iOrdinal = zzhpwVar.ordinal();
        if (iOrdinal == 1) {
            return zzhrd.zza;
        }
        if (iOrdinal == 2) {
            return zzhrd.zzc;
        }
        if (iOrdinal == 3) {
            return zzhrd.zzd;
        }
        if (iOrdinal == 4) {
            return zzhrd.zzb;
        }
        int iZza = zzhpwVar.zza();
        throw new GeneralSecurityException(androidx.datastore.preferences.protobuf.a.g(iZza, "Unable to parse OutputPrefixType: ", new StringBuilder(String.valueOf(iZza).length() + 34)));
    }

    private static int zzk(zzhra zzhraVar) throws GeneralSecurityException {
        if (zzhra.zza.equals(zzhraVar)) {
            return 33;
        }
        if (zzhra.zzb.equals(zzhraVar)) {
            return 49;
        }
        if (zzhra.zzc.equals(zzhraVar)) {
            return 67;
        }
        throw new GeneralSecurityException("Unable to serialize CurveType ".concat(zzhraVar.toString()));
    }

    private static zzhoe zzl(zzhre zzhreVar) throws GeneralSecurityException {
        zzhor zzhorVar;
        int i2;
        zzhod zzhodVarZzb = zzhoe.zzb();
        zzhrb zzhrbVarZze = zzhreVar.zze();
        if (zzhrb.zza.equals(zzhrbVarZze)) {
            zzhorVar = zzhor.SHA256;
        } else if (zzhrb.zzb.equals(zzhrbVarZze)) {
            zzhorVar = zzhor.SHA384;
        } else {
            if (!zzhrb.zzc.equals(zzhrbVarZze)) {
                throw new GeneralSecurityException("Unable to serialize HashType ".concat(zzhrbVarZze.toString()));
            }
            zzhorVar = zzhor.SHA512;
        }
        zzhodVarZzb.zza(zzhorVar);
        zzhra zzhraVarZzd = zzhreVar.zzd();
        int i3 = 4;
        if (zzhra.zza.equals(zzhraVarZzd)) {
            i2 = 4;
        } else if (zzhra.zzb.equals(zzhraVarZzd)) {
            i2 = 5;
        } else {
            if (!zzhra.zzc.equals(zzhraVarZzd)) {
                throw new GeneralSecurityException("Unable to serialize CurveType ".concat(zzhraVarZzd.toString()));
            }
            i2 = 6;
        }
        zzhodVarZzb.zzb(i2);
        zzhrc zzhrcVarZzc = zzhreVar.zzc();
        if (zzhrc.zza.equals(zzhrcVarZzc)) {
            i3 = 3;
        } else if (!zzhrc.zzb.equals(zzhrcVarZzc)) {
            throw new GeneralSecurityException("Unable to serialize SignatureEncoding ".concat(zzhrcVarZzc.toString()));
        }
        zzhodVarZzb.zzc(i3);
        return (zzhoe) zzhodVarZzb.zzbu();
    }

    private static zzhoi zzm(zzhri zzhriVar) throws GeneralSecurityException {
        int iZzk = zzk(zzhriVar.zzf().zzd());
        ECPoint eCPointZzd = zzhriVar.zzd();
        zzhoh zzhohVarZzg = zzhoi.zzg();
        zzhohVarZzg.zza(zzl(zzhriVar.zzf()));
        byte[] bArrZzb = zzhhe.zzb(eCPointZzd.getAffineX(), iZzk);
        zzhzl zzhzlVar = zzhzl.zzb;
        zzhohVarZzg.zzb(zzhzl.zzs(bArrZzb, 0, bArrZzb.length));
        byte[] bArrZzb2 = zzhhe.zzb(eCPointZzd.getAffineY(), iZzk);
        zzhohVarZzg.zzc(zzhzl.zzs(bArrZzb2, 0, bArrZzb2.length));
        return (zzhoi) zzhohVarZzg.zzbu();
    }

    private static zzhra zzn(int i2) throws GeneralSecurityException {
        int i3 = i2 - 2;
        if (i3 == 2) {
            return zzhra.zza;
        }
        if (i3 == 3) {
            return zzhra.zzb;
        }
        if (i3 == 4) {
            return zzhra.zzc;
        }
        int iZza = zzhoq.zza(i2);
        throw new GeneralSecurityException(androidx.datastore.preferences.protobuf.a.g(iZza, "Unable to parse EllipticCurveType: ", new StringBuilder(String.valueOf(iZza).length() + 35)));
    }

    private static zzhrc zzo(int i2) throws GeneralSecurityException {
        int i3 = i2 - 2;
        if (i3 == 1) {
            return zzhrc.zza;
        }
        if (i3 == 2) {
            return zzhrc.zzb;
        }
        int iZza = zzhoj.zza(i2);
        throw new GeneralSecurityException(androidx.datastore.preferences.protobuf.a.g(iZza, "Unable to parse EcdsaSignatureEncoding: ", new StringBuilder(String.valueOf(iZza).length() + 40)));
    }
}
