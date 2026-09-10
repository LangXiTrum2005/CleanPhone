package cloop;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.util.Arrays;
import org.jacoco.core.runtime.RemoteControlWriter;

/* JADX INFO: compiled from: ChaCha20Util.java */
/* JADX INFO: loaded from: classes3.dex */
public final class trm {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final int[] f15711attabal = impromptu(new byte[]{101, 120, 112, 97, 110, 100, RemoteControlWriter.BLOCK_CMDOK, 51, 50, 45, 98, 121, 116, 101, RemoteControlWriter.BLOCK_CMDOK, 107});

    public static byte[] attabal(byte[] bArr, byte[] bArr2) {
        return competently(saneness(impromptu(bArr), impromptu(bArr2)));
    }

    public static void beachfront(int[] iArr) {
        for (int i = 0; i < 10; i++) {
            dern(iArr, 0, 4, 8, 12);
            dern(iArr, 1, 5, 9, 13);
            dern(iArr, 2, 6, 10, 14);
            dern(iArr, 3, 7, 11, 15);
            dern(iArr, 0, 5, 10, 15);
            dern(iArr, 1, 6, 11, 12);
            dern(iArr, 2, 7, 8, 13);
            dern(iArr, 3, 4, 9, 14);
        }
    }

    public static byte[] competently(int[] iArr) {
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(iArr.length * 4).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.asIntBuffer().put(iArr);
        return byteBufferOrder.array();
    }

    public static void dern(int[] iArr, int i, int i2, int i3, int i4) {
        int i5 = iArr[i] + iArr[i2];
        iArr[i] = i5;
        int iWireman = wireman(i5 ^ iArr[i4], 16);
        iArr[i4] = iWireman;
        int i6 = iArr[i3] + iWireman;
        iArr[i3] = i6;
        int iWireman2 = wireman(iArr[i2] ^ i6, 12);
        iArr[i2] = iWireman2;
        int i7 = iArr[i] + iWireman2;
        iArr[i] = i7;
        int iWireman3 = wireman(iArr[i4] ^ i7, 8);
        iArr[i4] = iWireman3;
        int i8 = iArr[i3] + iWireman3;
        iArr[i3] = i8;
        iArr[i2] = wireman(iArr[i2] ^ i8, 7);
    }

    public static int[] impromptu(byte[] bArr) {
        if (bArr.length % 4 != 0) {
            throw new IllegalArgumentException("invalid input length");
        }
        IntBuffer intBufferAsIntBuffer = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).asIntBuffer();
        int[] iArr = new int[intBufferAsIntBuffer.remaining()];
        intBufferAsIntBuffer.get(iArr);
        return iArr;
    }

    public static void marial(int[] iArr, int[] iArr2) {
        int[] iArr3 = f15711attabal;
        System.arraycopy(iArr3, 0, iArr, 0, iArr3.length);
        System.arraycopy(iArr2, 0, iArr, iArr3.length, 8);
    }

    public static int[] saneness(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[16];
        marial(iArr3, iArr);
        iArr3[12] = iArr2[0];
        iArr3[13] = iArr2[1];
        iArr3[14] = iArr2[2];
        iArr3[15] = iArr2[3];
        beachfront(iArr3);
        iArr3[4] = iArr3[12];
        iArr3[5] = iArr3[13];
        iArr3[6] = iArr3[14];
        iArr3[7] = iArr3[15];
        return Arrays.copyOf(iArr3, 8);
    }

    public static int wireman(int i, int i2) {
        return (i >>> (-i2)) | (i << i2);
    }
}
