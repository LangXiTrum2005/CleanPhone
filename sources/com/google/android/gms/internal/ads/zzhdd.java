package com.google.android.gms.internal.ads;

import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhdd implements zzgzq {
    public static final /* synthetic */ int zza = 0;
    private static final byte[] zzb = new byte[0];
    private static final Set zze;
    private final String zzc;
    private final zzgzq zzd;

    static {
        HashSet hashSet = new HashSet();
        hashSet.add("type.googleapis.com/google.crypto.tink.AesGcmKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        hashSet.add("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesEaxKey");
        zze = Collections.unmodifiableSet(hashSet);
    }

    @Deprecated
    public zzhdd(zzhpd zzhpdVar, zzgzq zzgzqVar) throws GeneralSecurityException {
        if (!zze.contains(zzhpdVar.zza())) {
            String strZza = zzhpdVar.zza();
            throw new IllegalArgumentException(android.support.v4.media.a.s(new StringBuilder(String.valueOf(strZza).length() + 67), "Unsupported DEK key type: ", strZza, ". Only Tink AEAD key types are supported."));
        }
        this.zzc = zzhpdVar.zza();
        zzhpc zzhpcVarZzg = zzhpd.zzg(zzhpdVar);
        zzhpcVarZzg.zzc(zzhpw.RAW);
        zzhat.zzb(((zzhpd) zzhpcVarZzg.zzbu()).zzaN());
        this.zzd = zzgzqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgzq
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        try {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
            int i2 = byteBufferWrap.getInt();
            if (i2 <= 0 || i2 > 4096 || i2 > bArr.length - 4) {
                throw new GeneralSecurityException("length of encrypted DEK too large");
            }
            byte[] bArr3 = new byte[i2];
            byteBufferWrap.get(bArr3, 0, i2);
            byte[] bArr4 = new byte[byteBufferWrap.remaining()];
            byteBufferWrap.get(bArr4, 0, byteBufferWrap.remaining());
            byte[] bArrZza = this.zzd.zza(bArr3, zzb);
            String str = this.zzc;
            zzhzl zzhzlVar = zzhzl.zzb;
            return ((zzgzq) zzhjb.zza().zzd(zzhje.zza().zzg(zzhjz.zza(str, zzhzl.zzs(bArrZza, 0, bArrZza.length), zzhoz.SYMMETRIC, zzhpw.RAW, null), zzgzv.zza()), zzgzq.class)).zza(bArr4, bArr2);
        } catch (IndexOutOfBoundsException e2) {
            e = e2;
            throw new GeneralSecurityException("invalid ciphertext", e);
        } catch (NegativeArraySizeException e3) {
            e = e3;
            throw new GeneralSecurityException("invalid ciphertext", e);
        } catch (BufferUnderflowException e4) {
            e = e4;
            throw new GeneralSecurityException("invalid ciphertext", e);
        }
    }
}
