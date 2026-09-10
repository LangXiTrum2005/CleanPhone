package com.facebook.ads.redexgen.core;

import android.view.View;
import com.facebook.ads.NativeAdLayout;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ze, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1864Ze {
    public static String[] A00 = {"B", "b", "N7Y4O4Xp0bXRpwQYmrnUbbD5XPNn0nfl", "PsTgqcCc8jcMoxm2RXWy1mA6rhf59", "zMLnehec4ICfDGOtTSDp3symXOGZpaRx", "AnvCnC9uV", "JoTWE5M61fQkMjrwCjPz5KG5vu8cqeKb", "O6aKPphMSjoWO4xDWlhiQ7T2kp0fs"};
    public static final int A01 = (int) (XX.A02 * 200.0f);
    public static final int A03 = (int) (XX.A02 * 200.0f);
    public static final int A02 = (int) (XX.A02 * 50.0f);

    public static NF A00(NativeAdLayout nativeAdLayout) {
        if (nativeAdLayout == null) {
            return NF.A04;
        }
        if (A03(nativeAdLayout)) {
            return NF.A05;
        }
        return NF.A03;
    }

    public static AbstractC1863Zd A01(C2300gi c2300gi, VA va, String str, View view) {
        if (view == null) {
            return null;
        }
        int w2 = view.getWidth();
        int height = view.getHeight();
        if (w2 >= A01 && height >= A01) {
            return new MC(c2300gi, va, str);
        }
        if (w2 >= A03) {
            int i2 = A02;
            String[] strArr = A00;
            if (strArr[6].charAt(28) == strArr[4].charAt(28)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A00;
            strArr2[7] = "MXaU9iKOIfaGo19ccmM4SYJQh1BEv";
            strArr2[3] = "urarsFS1owFx4szCeqq2cq67A77KP";
            if (height >= i2) {
                return new MD(c2300gi, va, str);
            }
        }
        return null;
    }

    public static ME A02(C2300gi c2300gi, VA va, String str, C1570Nm c1570Nm, InterfaceC1842Yi interfaceC1842Yi, InterfaceC1841Yh interfaceC1841Yh) {
        return new ME(c2300gi, va, str, c1570Nm, interfaceC1842Yi, interfaceC1841Yh);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002c  */
    /* JADX WARN: Code duplicated, block: B:13:0x003a  */
    /* JADX WARN: Code duplicated, block: B:6:0x0010  */
    /* JADX WARN: Code duplicated, block: B:8:0x0024  */
    public static boolean A03(NativeAdLayout nativeAdLayout) {
        int i2;
        int h2;
        int w2;
        int w3;
        int width = nativeAdLayout.getWidth();
        int height = nativeAdLayout.getHeight();
        int w4 = A01;
        if (width < w4) {
            i2 = A03;
            String[] strArr = A00;
            String str = strArr[1];
            String str2 = strArr[0];
            h2 = str.length();
            w2 = str2.length();
            if (h2 != w2) {
                throw new RuntimeException();
            }
            String[] strArr2 = A00;
            strArr2[1] = "e";
            strArr2[0] = "I";
            if (width >= i2) {
                w3 = A02;
                if (height < w3) {
                }
            }
            return true;
        }
        int w5 = A01;
        if (height < w5) {
            i2 = A03;
            String[] strArr3 = A00;
            String str3 = strArr3[1];
            String str4 = strArr3[0];
            h2 = str3.length();
            w2 = str4.length();
            if (h2 != w2) {
                throw new RuntimeException();
            }
            String[] strArr4 = A00;
            strArr4[1] = "e";
            strArr4[0] = "I";
            if (width >= i2) {
                w3 = A02;
                if (height < w3) {
                }
            }
            return true;
        }
        return false;
    }
}
