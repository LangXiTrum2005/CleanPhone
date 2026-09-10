package com.facebook.ads.redexgen.core;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Uf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C1740Uf {
    public static int A03;
    public static byte[] A04;
    public static String[] A05 = {"60vC7Tqxq", "iit", "yZ8WhL2SKbyHWFuqrbqyqX6q9YBqbSbq", "zou4kHpYoYqOWULjtQgwmQsgY48o5sQE", "Jj1CAbkpCkmlTw2dBaB6fKsG", "LIdASrcH6z6LtpFKNKqsX", "9qyYxkloNYGFw4rMCbrwSMHZV85hWfZp", "eAI5s54jDPvvLg6GHfi1"};
    public C1739Ue A00;
    public boolean A01;
    public final File A02;

    public static String A01(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 65);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        byte[] bArr = {-29, -2, 6, 9, 2, 1, -67, 17, 12, -67, 1, 2, 9, 2, 17, 2, -67, 3, 6, 9, 2, -67, -60, -62, 16, -119, -84, -81, -88, 99, 106, 104, -74, 106, 99, -84, -74, 99, -79, -78, -73, 99, -92, 99, -75, -88, -92, -89, -92, -91, -81, -88, 99, -87, -84, -81, -88, -97, -60, -52, -73, -62, -65, -70, 118, -68, -69, -54, -71, -66, 118, -55, -54, -73, -56, -54, 118, -65, -60, -70, -69, -50, -112, 118, 123, -70, -75, -56, -58, -46, -43, -57, -125, -55, -52, -49, -56, -125, -60, -49, -43, -56, -60, -57, -36, -125, -57, -52, -42, -45, -46, -42, -56, -57};
        String[] strArr = A05;
        if (strArr[2].charAt(17) != strArr[6].charAt(17)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A05;
        strArr2[1] = "hp8";
        strArr2[4] = "JPe8szfYYKMd1bH3O09b0bU9";
        A04 = bArr;
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final synchronized int A05() throws IOException {
        return A00().A00;
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final synchronized UW A06(int i2, byte[] bArr, int i3, int[] iArr, int i4) throws IOException {
        C1739Ue c1739UeA00 = A00();
        int i5 = 1;
        if (i2 < 0) {
            throw new IOException(String.format(Locale.US, A01(57, 29, 21), Integer.valueOf(i2)));
        }
        int i6 = i2;
        int i7 = 0;
        long j = -1;
        boolean z2 = false;
        while (i6 < c1739UeA00.A00) {
            if ((i6 - i2) + i4 >= iArr.length) {
                z2 = true;
                break;
            }
            long j2 = c1739UeA00.A03[i6];
            long j3 = (i6 == c1739UeA00.A00 - i5 ? c1739UeA00.A01 : c1739UeA00.A03[i6 + 1]) - j2;
            if (j == -1) {
                j = j2;
            }
            if (((int) j3) + i7 + i3 > bArr.length) {
                z2 = true;
                break;
            }
            i7 += (int) j3;
            iArr[(i6 - i2) + i4] = (int) j3;
            i6++;
            i5 = 1;
        }
        if (i6 <= i2) {
            return new UW(z2 ? UV.A04 : UV.A05, i2, i2, 0);
        }
        c1739UeA00.A02.seek(j);
        c1739UeA00.A02.read(bArr, i3, i7);
        return new UW(UV.A03, i2, i6, i7);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final synchronized boolean A09(byte[] bArr) throws IOException {
        C1739Ue c1739UeA00 = A00();
        if (A05() == A03) {
            return false;
        }
        A03(c1739UeA00.A00, c1739UeA00.A01);
        A04(c1739UeA00.A01, bArr);
        c1739UeA00.A02.getFD().sync();
        c1739UeA00.A00++;
        c1739UeA00.A01 += (long) bArr.length;
        return true;
    }

    static {
        A02();
        A03 = 1000;
    }

    public C1740Uf(File file) throws IOException {
        this.A02 = file;
        if (!file.exists()) {
            this.A00 = C1739Ue.A03(file);
        } else if (!file.isFile()) {
            throw new IOException(String.format(Locale.US, A01(25, 32, 2), file.getCanonicalPath()));
        }
    }

    private C1739Ue A00() throws IOException {
        if (!this.A01) {
            if (this.A00 == null) {
                this.A00 = C1739Ue.A04(this.A02);
            }
            return this.A00;
        }
        throw new IOException(A01(86, 28, 34));
    }

    private void A03(int i2, long j) throws IOException {
        this.A00.A03[i2] = j;
        this.A00.A02.seek(C1739Ue.A02(i2));
        this.A00.A02.writeLong(j);
    }

    private void A04(long j, byte[] bArr) throws IOException {
        this.A00.A02.seek(j);
        this.A00.A02.write(bArr);
    }

    public final synchronized void A07() throws IOException {
        this.A01 = true;
        if (this.A00 == null) {
            return;
        }
        RandomAccessFile randomAccessFile = this.A00.A02;
        this.A00 = null;
        randomAccessFile.close();
    }

    public final synchronized void A08() throws IOException {
        if (!this.A01) {
            A07();
            if (!this.A02.delete()) {
                throw new IOException(String.format(Locale.US, A01(0, 25, 92), this.A02.getCanonicalPath()));
            }
        } else {
            throw new IOException(A01(86, 28, 34));
        }
    }
}
