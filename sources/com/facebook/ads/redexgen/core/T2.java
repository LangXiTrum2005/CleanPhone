package com.facebook.ads.redexgen.core;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.applovin.shadow.okio.Segment;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class T2 {
    public static byte[] A00;

    static {
        A04();
    }

    public static String A03(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 31);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A00 = new byte[]{2, 6, 10, 12, 14};
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
            options.inSampleSize = A00(options, i3, i2);
            options.inJustDecodeBounds = false;
            return BitmapFactory.decodeStream(c1521Lo, null, options);
        }
        return BitmapFactory.decodeStream(c1521Lo);
    }

    public static Bitmap A02(String str, int i2, int i3, T8 t8) {
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str, options);
            options.inSampleSize = A00(options, i3, i2);
            options.inJustDecodeBounds = false;
            return BitmapFactory.decodeFile(str, options);
        } catch (Throwable t) {
            t8.A08().ABC(A03(0, 5, 116), AbstractC1712Td.A1h, new C1713Te(t));
            return null;
        }
    }
}
