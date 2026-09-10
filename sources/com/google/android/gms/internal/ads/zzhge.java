package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import javax.crypto.AEADBadTagException;

/* JADX INFO: loaded from: classes4.dex */
abstract class zzhge {
    private final zzhgc zza;
    private final zzhgc zzb;

    public zzhge(byte[] bArr) throws GeneralSecurityException {
        if (!zzhhb.zza(1)) {
            throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
        }
        this.zza = zza(bArr, 1);
        this.zzb = zza(bArr, 0);
    }

    public abstract zzhgc zza(byte[] bArr, int i2) throws InvalidKeyException;

    public final byte[] zzb(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (byteBuffer.remaining() < 16) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        int iPosition = byteBuffer.position();
        byte[] bArr3 = new byte[16];
        byteBuffer.position(byteBuffer.limit() - 16);
        byteBuffer.get(bArr3);
        byteBuffer.position(iPosition);
        byteBuffer.limit(byteBuffer.limit() - 16);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        try {
            byte[] bArr4 = new byte[32];
            this.zzb.zzd(bArr, 0).get(bArr4);
            int length = bArr2.length;
            int i2 = length & 15;
            int i3 = i2 == 0 ? length : (length + 16) - i2;
            int iRemaining = byteBuffer.remaining();
            int i4 = iRemaining % 16;
            int i5 = (i4 == 0 ? iRemaining : (iRemaining + 16) - i4) + i3;
            ByteBuffer byteBufferOrder = ByteBuffer.allocate(i5 + 16).order(ByteOrder.LITTLE_ENDIAN);
            byteBufferOrder.put(bArr2);
            byteBufferOrder.position(i3);
            byteBufferOrder.put(byteBuffer);
            byteBufferOrder.position(i5);
            byteBufferOrder.putLong(length);
            byteBufferOrder.putLong(iRemaining);
            if (!MessageDigest.isEqual(zzhgi.zza(bArr4, byteBufferOrder.array()), bArr3)) {
                throw new GeneralSecurityException("invalid MAC");
            }
            byteBuffer.position(iPosition);
            return this.zza.zzc(bArr, byteBuffer);
        } catch (GeneralSecurityException e2) {
            throw new AEADBadTagException(e2.toString());
        }
    }
}
