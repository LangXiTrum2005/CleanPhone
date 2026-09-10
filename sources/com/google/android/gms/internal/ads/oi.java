package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class oi extends mu1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public MessageDigest f18276c;

    public final byte[] X0(String str) {
        byte[] bArr;
        byte[] bArrArray;
        String[] strArrSplit = str.split(" ");
        int length = strArrSplit.length;
        int i10 = 4;
        if (length == 1) {
            int iB = ps1.b(strArrSplit[0]);
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
            byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
            byteBufferAllocate.putInt(iB);
            bArrArray = byteBufferAllocate.array();
        } else {
            if (length < 5) {
                bArr = new byte[length + length];
                for (int i11 = 0; i11 < strArrSplit.length; i11++) {
                    int iB2 = ps1.b(strArrSplit[i11]);
                    int i12 = (iB2 >> 16) ^ ((char) iB2);
                    byte b10 = (byte) i12;
                    byte b11 = (byte) (i12 >> 8);
                    int i13 = i11 + i11;
                    bArr[i13] = new byte[]{b10, b11}[0];
                    bArr[i13 + 1] = b11;
                }
            } else {
                bArr = new byte[length];
                for (int i14 = 0; i14 < strArrSplit.length; i14++) {
                    int iB3 = ps1.b(strArrSplit[i14]);
                    bArr[i14] = (byte) ((iB3 >> 24) ^ (((iB3 & 255) ^ ((iB3 >> 8) & 255)) ^ ((iB3 >> 16) & 255)));
                }
            }
            bArrArray = bArr;
        }
        this.f18276c = A0();
        synchronized (this.f17550a) {
            try {
                MessageDigest messageDigest = this.f18276c;
                if (messageDigest == null) {
                    return new byte[0];
                }
                messageDigest.reset();
                this.f18276c.update(bArrArray);
                byte[] bArrDigest = this.f18276c.digest();
                int length2 = bArrDigest.length;
                if (length2 <= 4) {
                    i10 = length2;
                }
                byte[] bArr2 = new byte[i10];
                System.arraycopy(bArrDigest, 0, bArr2, 0, i10);
                return bArr2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
