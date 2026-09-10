package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhfo implements zzgzq {
    private static final byte[] zza = zzhwm.zza("7a806c");
    private static final byte[] zzb = zzhwm.zza("46bb91c3c5");
    private static final byte[] zzc = zzhwm.zza("36864200e0eaf5284d884a0e77d31646");
    private static final byte[] zzd = zzhwm.zza("bae8e37fc83441b16034566b");
    private static final byte[] zze = zzhwm.zza("af60eb711bd85bc1e4d3e0a462e074eea428a8");
    private final zzhfn zzf;
    private final SecretKey zzg;
    private final byte[] zzh;

    private zzhfo(byte[] bArr, byte[] bArr2, zzhfn zzhfnVar) throws GeneralSecurityException {
        this.zzh = bArr2;
        zzhxa.zza(bArr.length);
        this.zzg = new SecretKeySpec(bArr, "AES");
        this.zzf = zzhfnVar;
    }

    public static boolean zzb(Cipher cipher) {
        try {
            byte[] bArr = zzd;
            cipher.init(2, new SecretKeySpec(zzc, "AES"), new GCMParameterSpec(128, bArr, 0, bArr.length));
            cipher.updateAAD(zzb);
            byte[] bArr2 = zze;
            return MessageDigest.isEqual(cipher.doFinal(bArr2, 0, bArr2.length), zza);
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    public static zzgzq zzc(zzhcm zzhcmVar, zzhfn zzhfnVar) throws GeneralSecurityException {
        if (zzb((Cipher) zzhfnVar.zza())) {
            return new zzhfo(zzhcmVar.zze().zzc(zzgzv.zza()), zzhcmVar.zzc().zzc(), zzhfnVar);
        }
        throw new IllegalStateException("Cipher does not implement AES GCM SIV.");
    }

    @Override // com.google.android.gms.internal.ads.zzgzq
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        byte[] bArr3 = this.zzh;
        int length2 = bArr3.length;
        if (length < length2 + 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!zzhkl.zze(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        Cipher cipher = (Cipher) this.zzf.zza();
        cipher.init(2, this.zzg, new GCMParameterSpec(128, bArr, length2, 12));
        if (bArr2 != null && bArr2.length != 0) {
            cipher.updateAAD(bArr2);
        }
        return cipher.doFinal(bArr, length2 + 12, (length - length2) - 12);
    }
}
