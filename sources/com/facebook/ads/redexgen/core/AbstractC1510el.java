package com.facebook.ads.redexgen.core;

import android.net.Uri;
import androidx.exifinterface.media.ExifInterface;
import com.umeng.analytics.pro.cw;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.el, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract /* synthetic */ class AbstractC1510el {
    public static byte[] A00;
    public static String[] A01 = {"CoYyX75SjT", "Lq6PbtIWpeQsK86x", ExifInterface.LONGITUDE_EAST, "jp", "nb3Uz12tr0ycxAJ", "tT", "ixjY8zFEZp9Cky6XeOPYQ4Rf9rzMFkQQ", "GptbYXHPLg6Unjq"};

    public static String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A01;
            if (strArr[4].length() != strArr[7].length()) {
                throw new RuntimeException();
            }
            A01[0] = "TzzehKpgVO";
            if (i4 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 71);
            i4++;
        }
    }

    public static void A03() {
        A00 = new byte[]{19, cw.l, 25, 41, 26, 19, 24, 42, 55, 32, cw.n, 61, 42, 43, 38, 61};
    }

    static {
        A03();
    }

    public static long A00(InterfaceC1511em interfaceC1511em) {
        return interfaceC1511em.A6X(A02(0, 7, 49), -1L);
    }

    public static Uri A01(InterfaceC1511em interfaceC1511em) {
        String strA6Z = interfaceC1511em.A6Z(A02(7, 9, 8), null);
        if (strA6Z == null) {
            return null;
        }
        return Uri.parse(strA6Z);
    }
}
