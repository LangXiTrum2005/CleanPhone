package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhvx implements zzgzq {
    private final zzhwn zza;
    private final zzham zzb;
    private final int zzc;
    private final byte[] zzd;

    private zzhvx(zzhwn zzhwnVar, zzham zzhamVar, int i2, byte[] bArr) {
        this.zza = zzhwnVar;
        this.zzb = zzhamVar;
        this.zzc = i2;
        this.zzd = bArr;
    }

    public static zzgzq zzb(zzhbl zzhblVar) throws GeneralSecurityException {
        zzhvi zzhviVar = new zzhvi(zzhblVar.zze().zzc(zzgzv.zza()), zzhblVar.zzg().zzf());
        String strValueOf = String.valueOf(zzhblVar.zzg().zzh());
        return new zzhvx(zzhviVar, new zzhws(new zzhwr("HMAC".concat(strValueOf), new SecretKeySpec(zzhblVar.zzf().zzc(zzgzv.zza()), "HMAC")), zzhblVar.zzg().zze()), zzhblVar.zzg().zze(), zzhblVar.zzc().zzc());
    }

    @Override // com.google.android.gms.internal.ads.zzgzq
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.zzd;
        int length = bArr.length;
        int i2 = this.zzc;
        int length2 = bArr3.length;
        if (length < i2 + length2) {
            throw new GeneralSecurityException("Decryption failed (ciphertext too short).");
        }
        if (!zzhkl.zze(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        int i3 = length - i2;
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, length2, i3);
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, i3, length);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        byte[] bArrCopyOf = Arrays.copyOf(ByteBuffer.allocate(8).putLong(((long) bArr2.length) * 8).array(), 8);
        if (MessageDigest.isEqual(((zzhws) this.zzb).zzc(zzhvp.zza(bArr2, bArrCopyOfRange, bArrCopyOf)), bArrCopyOfRange2)) {
            return this.zza.zza(bArrCopyOfRange);
        }
        throw new GeneralSecurityException("invalid MAC");
    }
}
