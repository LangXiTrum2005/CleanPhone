package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* JADX INFO: loaded from: classes4.dex */
abstract class zzhgc {
    int[] zza;
    private final int zzb;

    public zzhgc(byte[] bArr, int i2) throws InvalidKeyException {
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.zza = zzhga.zzd(bArr);
        this.zzb = i2;
    }

    public abstract int[] zza(int[] iArr, int i2);

    public abstract int zzb();

    public final byte[] zzc(byte[] bArr, ByteBuffer byteBuffer) throws GeneralSecurityException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.remaining());
        if (bArr.length != zzb()) {
            int iZzb = zzb();
            throw new GeneralSecurityException(androidx.datastore.preferences.protobuf.a.g(iZzb, "The nonce length (in bytes) must be ", new StringBuilder(String.valueOf(iZzb).length() + 36)));
        }
        int iRemaining = byteBuffer.remaining();
        int i2 = iRemaining / 64;
        for (int i3 = 0; i3 < i2 + 1; i3++) {
            ByteBuffer byteBufferZzd = zzd(bArr, this.zzb + i3);
            if (i3 == i2) {
                zzhvp.zzc(byteBufferAllocate, byteBuffer, byteBufferZzd, iRemaining % 64);
            } else {
                zzhvp.zzc(byteBufferAllocate, byteBuffer, byteBufferZzd, 64);
            }
        }
        return byteBufferAllocate.array();
    }

    public final ByteBuffer zzd(byte[] bArr, int i2) {
        int[] iArrZza = zza(zzhga.zzd(bArr), i2);
        int[] iArr = (int[]) iArrZza.clone();
        zzhga.zzb(iArr);
        for (int i3 = 0; i3 < 16; i3++) {
            iArrZza[i3] = iArrZza[i3] + iArr[i3];
        }
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.asIntBuffer().put(iArrZza, 0, 16);
        return byteBufferOrder;
    }
}
