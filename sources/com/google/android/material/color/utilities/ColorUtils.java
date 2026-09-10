package com.google.android.material.color.utilities;

/* JADX INFO: loaded from: classes4.dex */
public class ColorUtils {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final double[] f19221a = {95.047d, 100.0d, 108.883d};

    public static double a(double d) {
        double d2 = (d + 16.0d) / 116.0d;
        double d3 = d2 * d2 * d2;
        if (d3 <= 0.008856451679035631d) {
            d3 = ((d2 * 116.0d) - 16.0d) / 903.2962962962963d;
        }
        return d3 * 100.0d;
    }
}
