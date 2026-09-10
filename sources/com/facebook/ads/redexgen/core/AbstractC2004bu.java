package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC2004bu {
    public static float A00(NR nr) {
        int height = nr.A0H().A01();
        int width = nr.A0H().A00();
        if (width > 0) {
            return height / width;
        }
        return -1.0f;
    }

    public static int A01(double d) {
        int availableWidth = (int) (((double) (XW.A00().widthPixels - (AbstractC2013c3.A08 * 2))) / d);
        return availableWidth;
    }

    public static int A02(int bottomMargin) {
        int ctaMargin = YB.A01(16);
        int ctaTextHeight = AbstractC1985bb.A0D;
        int ctaSpacing = ctaTextHeight * 2;
        int ctaTextHeight2 = AbstractC2013c3.A08;
        int ctaMargin2 = ctaMargin + ctaSpacing + (ctaTextHeight2 * 2);
        int ctaTextHeight3 = XW.A00().heightPixels;
        return (ctaTextHeight3 - bottomMargin) - ctaMargin2;
    }

    public static ViewOnClickListenerC2003bt A03(ViewOnClickListenerC1498Kr viewOnClickListenerC1498Kr, String str) {
        return new ViewOnClickListenerC2003bt(viewOnClickListenerC1498Kr, str);
    }

    public static boolean A04(double d) {
        return d < 0.9d;
    }

    public static boolean A05(double d, int i2) {
        return A02(i2) < A01(d);
    }

    public static boolean A06(int i2, int i3, double d) {
        return i2 == 2 || A05(d, i3);
    }
}
