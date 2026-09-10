package com.facebook.ads.redexgen.core;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.applovin.shadow.okio.Segment;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ln, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1520Ln {
    public static byte[] A00;
    public static String[] A01 = {"", "5RMLmaPj2fddIFPW54nmiFQPDQKlIy2x", "0506SZgMJJ7sv8mHDOEz9KlkL25eIrXm", "3YZMJbChCuRHZ", "0tP", "k2qiQoSuFgoxV", "", "m4QFNGv2UqCrxsi4qbKPCdwxAuw6y7wM"};

    public static String A04(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        int i5 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A01[4].length() != 3) {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[2] = "AJnFEtF8h38YXxkoJFDHCzPhEs51Q6lq";
            strArr[1] = "PqTCDiOjjtdJiv33jQVs3cEvP8T1eChE";
            if (i5 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 20);
            i5++;
        }
    }

    public static void A06() {
        A00 = new byte[]{-42, -39, -36, -43, -86, -97, -97};
        String[] strArr = A01;
        if (strArr[5].length() != strArr[3].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[6] = "";
        strArr2[0] = "";
    }

    static {
        A06();
    }

    public static int A00(BitmapFactory.Options options, int halfWidth, int i2) {
        int width = options.outHeight;
        int height = options.outWidth;
        int halfHeight = 1;
        if (width > i2 || height > halfWidth) {
            int inSampleSize = width / 2;
            int width2 = height / 2;
            while (inSampleSize / halfHeight >= i2 && width2 / halfHeight >= halfWidth) {
                halfHeight *= 2;
            }
        }
        return halfHeight;
    }

    public static Bitmap A01(InputStream inputStream, int i2, int i3) throws IOException {
        C1521Lo c1521Lo = new C1521Lo(inputStream);
        c1521Lo.mark(Segment.SIZE);
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(c1521Lo, null, options);
        c1521Lo.reset();
        if (!c1521Lo.A00()) {
            options.inSampleSize = A00(options, i2, i3);
            options.inJustDecodeBounds = false;
            return BitmapFactory.decodeStream(c1521Lo, null, options);
        }
        return BitmapFactory.decodeStream(c1521Lo);
    }

    public static Bitmap A02(String str, int i2, int i3) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        options.inSampleSize = A00(options, i2, i3);
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeFile(str, options);
    }

    public static Bitmap A03(String str, int i2, int i3, boolean z2) throws IOException {
        try {
            FileInputStream fileInputStream = new FileInputStream(new File(str));
            if (i2 > 0 && i3 > 0) {
                if (z2) {
                    Bitmap bitmapA01 = A01(fileInputStream, i2, i3);
                    A07(fileInputStream);
                    return bitmapA01;
                }
                Bitmap bitmapA02 = A02(str, i2, i3);
                A07(fileInputStream);
                return bitmapA02;
            }
            Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(fileInputStream);
            A07(fileInputStream);
            return bitmapDecodeStream;
        } catch (Throwable th) {
            A07(null);
            throw th;
        }
    }

    public static String A05(File file) {
        if (file != null) {
            return A04(0, 7, 92) + file.getPath();
        }
        return null;
    }

    public static void A07(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }
}
