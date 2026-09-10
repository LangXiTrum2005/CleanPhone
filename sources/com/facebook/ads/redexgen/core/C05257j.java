package com.facebook.ads.redexgen.core;

import android.content.SharedPreferences;
import com.facebook.ads.internal.util.process.ProcessUtils;
import com.umeng.analytics.pro.cw;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.7j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C05257j {
    public static byte[] A00;
    public static String[] A01 = {"OKQe8hXRO9IjIcE", "fZKFXGCnlijKRnd4C4GIjN8U9jomZ", "zd2g3FUlSdy4niS", "DQ1eYrU0vgUbRV2buV2T3UhVrDT8jNOj", "Q6rIf3Izbhrm2WD", "9gkLXGbOvBYKsW5YBwzKkub2Nn3K8ZPa", "2O7yMssiHcBFdM45gqp1TjJS", "Fkq1E5"};

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A01[3].charAt(10) == 'G') {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[2] = "GMwx2CjIRojg5Fd";
            strArr[4] = "kdR397QSXvrHcnb";
            if (i4 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 100);
            i4++;
        }
    }

    public static void A02() {
        A00 = new byte[]{74, 92, 119, 77, 80, 92, 90, 73, 91, 24, 20, 22, 85, 29, 26, 24, 30, 25, 20, 20, cw.n, 85, 26, 31, 8, 85, 18, 21, cw.m, 30, 9, 21, 26, 23, 85, 25, cw.m, 30, 3, cw.m, 9, 26, 8};
    }

    static {
        A02();
    }

    public static SharedPreferences A00(AnonymousClass85 anonymousClass85) {
        return anonymousClass85.getSharedPreferences(ProcessUtils.getProcessSpecificName(A01(9, 34, 31), anonymousClass85), 0);
    }

    public final String A03(AnonymousClass85 anonymousClass85) {
        return A00(anonymousClass85).getString(A01(0, 9, 76), null);
    }

    public final void A04(AnonymousClass85 anonymousClass85, String str) {
        SharedPreferences btSP = A00(anonymousClass85);
        btSP.edit().putString(A01(0, 9, 76), str).apply();
    }
}
