package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import android.util.Log;
import android.webkit.MimeTypeMap;
import java.io.Closeable;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Lj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C1516Lj {
    public static byte[] A00;
    public static final String A01;

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 17);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A00 = new byte[]{91, 78, 76, 6, 52, 3, 3, 30, 3, 81, 18, 29, 30, 2, 24, 31, 22, 81, 3, 20, 2, 30, 4, 3, 18, 20, 107, 98, 19};
    }

    static {
        A04();
        A01 = C1516Lj.class.getSimpleName();
    }

    public static String A01(String str) {
        MimeTypeMap singleton = MimeTypeMap.getSingleton();
        String extension = MimeTypeMap.getFileExtensionFromUrl(str);
        if (TextUtils.isEmpty(extension)) {
            return null;
        }
        return singleton.getMimeTypeFromExtension(extension);
    }

    public static String A02(String str) {
        try {
            return A03(MessageDigest.getInstance(A00(26, 3, 55)).digest(str.getBytes()));
        } catch (NoSuchAlgorithmException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public static String A03(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        for (byte b2 : bArr) {
            stringBuffer.append(String.format(Locale.US, A00(0, 4, 111), Byte.valueOf(b2)));
        }
        return stringBuffer.toString();
    }

    public static void A05(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e2) {
                Log.e(A01, A00(4, 22, 96), e2);
            }
        }
    }
}
