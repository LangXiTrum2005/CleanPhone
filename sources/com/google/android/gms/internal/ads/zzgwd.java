package com.google.android.gms.internal.ads;

import com.applovin.shadow.okio.Segment;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

/* JADX INFO: loaded from: classes4.dex */
public final class zzgwd {
    public static final /* synthetic */ int zza = 0;

    static {
        new zzgwb();
    }

    public static byte[] zza(InputStream inputStream) throws IOException {
        inputStream.getClass();
        ArrayDeque arrayDeque = new ArrayDeque(20);
        int iHighestOneBit = Integer.highestOneBit(0);
        int iMin = Math.min(Segment.SIZE, Math.max(128, iHighestOneBit + iHighestOneBit));
        int i2 = 0;
        while (i2 < 2147483639) {
            int iMin2 = Math.min(iMin, 2147483639 - i2);
            byte[] bArr = new byte[iMin2];
            arrayDeque.add(bArr);
            int i3 = 0;
            while (i3 < iMin2) {
                int i4 = inputStream.read(bArr, i3, iMin2 - i3);
                if (i4 == -1) {
                    return zzc(arrayDeque, i2);
                }
                i3 += i4;
                i2 += i4;
            }
            iMin = zzgwx.zzb(((long) iMin) * ((long) (iMin < 4096 ? 4 : 2)));
        }
        if (inputStream.read() == -1) {
            return zzc(arrayDeque, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    public static InputStream zzb(InputStream inputStream, long j) {
        return new zzgwc(inputStream, j);
    }

    private static byte[] zzc(Queue queue, int i2) {
        if (queue.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) queue.remove();
        int length = bArr.length;
        if (length == i2) {
            return bArr;
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, i2);
        int i3 = i2 - length;
        while (i3 > 0) {
            byte[] bArr2 = (byte[]) queue.remove();
            int iMin = Math.min(i3, bArr2.length);
            System.arraycopy(bArr2, 0, bArrCopyOf, i2 - i3, iMin);
            i3 -= iMin;
        }
        return bArrCopyOf;
    }
}
