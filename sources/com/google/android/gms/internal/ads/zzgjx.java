package com.google.android.gms.internal.ads;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3950lJ;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* JADX INFO: loaded from: classes3.dex */
abstract class zzgjx {
    int[] zza;
    private final int zzb;

    public zzgjx(byte[] bArr, int i) throws InvalidKeyException {
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.zza = zzgjv.zze(bArr);
        this.zzb = i;
    }

    public abstract int zza();

    public abstract int[] zzb(int[] iArr, int i);

    public final ByteBuffer zzc(byte[] bArr, int i) {
        int[] iArrZzb = zzb(zzgjv.zze(bArr), i);
        int[] iArr = (int[]) iArrZzb.clone();
        zzgjv.zzc(iArr);
        for (int i2 = 0; i2 < 16; i2++) {
            iArrZzb[i2] = iArrZzb[i2] + iArr[i2];
        }
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.asIntBuffer().put(iArrZzb, 0, 16);
        return byteBufferOrder;
    }

    public final byte[] zzd(byte[] bArr, ByteBuffer byteBuffer) throws GeneralSecurityException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.remaining());
        if (bArr.length != zza()) {
            throw new GeneralSecurityException(AbstractC3950lJ.p("The nonce length (in bytes) must be ", zza()));
        }
        int iRemaining = byteBuffer.remaining();
        int i = iRemaining / 64;
        for (int i2 = 0; i2 < i + 1; i2++) {
            ByteBuffer byteBufferZzc = zzc(bArr, this.zzb + i2);
            if (i2 == i) {
                zzguo.zza(byteBufferAllocate, byteBuffer, byteBufferZzc, iRemaining % 64);
            } else {
                zzguo.zza(byteBufferAllocate, byteBuffer, byteBufferZzc, 64);
            }
        }
        return byteBufferAllocate.array();
    }
}
