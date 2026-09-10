package com.facebook.ads.redexgen.core;

import android.view.View;
import android.view.ViewParent;
import com.umeng.analytics.pro.cw;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.4x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC04624x {
    public static byte[] A00;
    public static String[] A01 = {"ZL1anCMt3BLp6QH6mLG", "eYchmtpQAx9MOQATO8FYbbZn0Imopvp", "womqJE18VUE38xqqJT9WKISB68M5cIbo", "Ts37DulPc8QB3fV2ykqejrUSGmoT8jSS", "b7DBuf20fhmi4MvO4gTJDnUAFhtFn7QS", "riPo3ZmcE", "zdrgnlBB6epFGiAXytvDtgh2fpyUYHeQ", "pMT1BFzteNKtMElnfmBSO9c56WwnbBlh"};
    public static final C04614w A02;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A01;
            if (strArr[7].charAt(24) != strArr[2].charAt(24)) {
                throw new RuntimeException();
            }
            A01[1] = "rrZUd7Y7OcpInh9wY";
            if (i4 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 74);
            i4++;
        }
    }

    public static void A01() {
        A00 = new byte[]{cw.k, 12, -20, 3, 17, 18, 3, 2, -18, cw.n, 3, -15, 1, cw.n, cw.k, 10, 10, -56, -57, -89, -66, -52, -51, -66, -67, -84, -68, -53, -56, -59, -59, 52, 51, 19, 42, 56, 57, 42, 41, 24, 40, 55, 52, 49, 49, 6, 40, 40, 42, 53, 57, 42, 41, -55, -56, -83, -50, -69, -52, -50, -88, -65, -51, -50, -65, -66, -83, -67, -52, -55, -58, -58, 41, 40, cw.k, 46, 41, 42, 8, 31, 45, 46, 31, 30, cw.k, 29, 44, 41, 38, 38};
    }

    static {
        A01();
        A02 = new MU();
    }

    public static void A02(ViewParent viewParent, View view, int i) {
        if (0 != 0) {
            throw new NullPointerException(A00(72, 18, 112));
        }
        if (i == 0) {
            A02.A02(viewParent, view);
        }
    }

    public static void A03(ViewParent viewParent, View view, int i, int i2, int i3, int i4, int i5) {
        if (0 != 0) {
            throw new NullPointerException(A00(17, 14, 15));
        }
        if (i5 == 0) {
            A02.A03(viewParent, view, i, i2, i3, i4);
        }
    }

    public static void A04(ViewParent viewParent, View view, int i, int i2, int[] iArr, int i3) {
        if (0 != 0) {
            throw new NullPointerException(A00(0, 17, 84));
        }
        if (i3 == 0) {
            A02.A04(viewParent, view, i, i2, iArr);
        }
    }

    public static void A05(ViewParent viewParent, View view, View view2, int i, int i2) {
        if (0 != 0) {
            throw new NullPointerException(A00(31, 22, 123));
        }
        if (i2 == 0) {
            C04614w c04614w = A02;
            if (A01[1].length() != 12) {
                A01[6] = "zGz2rBeihUtTfGY2pcVtSmEx1y47z9aS";
                c04614w.A05(viewParent, view, view2, i);
                return;
            }
            throw new RuntimeException();
        }
    }

    public static boolean A06(ViewParent viewParent, View view, float f, float f2) {
        return A02.A06(viewParent, view, f, f2);
    }

    public static boolean A07(ViewParent viewParent, View view, float f, float f2, boolean z) {
        return A02.A07(viewParent, view, f, f2, z);
    }

    public static boolean A08(ViewParent viewParent, View view, View view2, int i, int i2) {
        if (0 != 0) {
            throw new NullPointerException(A00(53, 19, 16));
        }
        if (i2 == 0) {
            boolean zA08 = A02.A08(viewParent, view, view2, i);
            if (A01[1].length() == 12) {
                throw new RuntimeException();
            }
            A01[6] = "znJUBPw3pDumoyQGyqs8HDKa96hSudPo";
            return zA08;
        }
        return false;
    }
}
