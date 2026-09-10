package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbdr extends zzbdm {
    private MessageDigest zzb;

    @Override // com.google.android.gms.internal.ads.zzbdm
    public final byte[] zza(String str) {
        byte[] bArr;
        byte[] bArrArray;
        String[] strArrSplit = str.split(" ");
        int length = strArrSplit.length;
        int i2 = 4;
        if (length == 1) {
            int iZza = zzbdq.zza(strArrSplit[0]);
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
            byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
            byteBufferAllocate.putInt(iZza);
            bArrArray = byteBufferAllocate.array();
        } else {
            if (length < 5) {
                bArr = new byte[length + length];
                for (int i3 = 0; i3 < strArrSplit.length; i3++) {
                    int iZza2 = zzbdq.zza(strArrSplit[i3]);
                    int i4 = (iZza2 >> 16) ^ ((char) iZza2);
                    byte b2 = (byte) i4;
                    byte b3 = (byte) (i4 >> 8);
                    int i5 = i3 + i3;
                    bArr[i5] = new byte[]{b2, b3}[0];
                    bArr[i5 + 1] = b3;
                }
            } else {
                bArr = new byte[length];
                for (int i6 = 0; i6 < strArrSplit.length; i6++) {
                    int iZza3 = zzbdq.zza(strArrSplit[i6]);
                    bArr[i6] = (byte) ((iZza3 >> 24) ^ (((iZza3 & 255) ^ ((iZza3 >> 8) & 255)) ^ ((iZza3 >> 16) & 255)));
                }
            }
            bArrArray = bArr;
        }
        this.zzb = zzb();
        synchronized (this.zza) {
            try {
                MessageDigest messageDigest = this.zzb;
                if (messageDigest == null) {
                    return new byte[0];
                }
                messageDigest.reset();
                this.zzb.update(bArrArray);
                byte[] bArrDigest = this.zzb.digest();
                int length2 = bArrDigest.length;
                if (length2 <= 4) {
                    i2 = length2;
                }
                byte[] bArr2 = new byte[i2];
                System.arraycopy(bArrDigest, 0, bArr2, 0, i2);
                return bArr2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
