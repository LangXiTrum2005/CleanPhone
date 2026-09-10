package com.google.android.material.color.utilities;

/* JADX INFO: loaded from: classes4.dex */
public final class ViewingConditions {
    static {
        double[] dArr = ColorUtils.f19221a;
        double dA = (ColorUtils.a(50.0d) * 63.66197723675813d) / 100.0d;
        double dMax = Math.max(0.1d, 50.0d);
        double[][] dArr2 = Cam16.f19220a;
        double d = dArr[0];
        double[] dArr3 = dArr2[0];
        double d2 = dArr3[0] * d;
        double d3 = dArr[1];
        double d4 = (dArr3[1] * d3) + d2;
        double d5 = dArr[2];
        double d6 = (dArr3[2] * d5) + d4;
        double[] dArr4 = dArr2[1];
        double d7 = (dArr4[2] * d5) + (dArr4[1] * d3) + (dArr4[0] * d);
        double[] dArr5 = dArr2[2];
        double d8 = (d5 * dArr5[2]) + (d3 * dArr5[1]) + (d * dArr5[0]);
        double dExp = (1.0d - (Math.exp(((-dA) - 42.0d) / 92.0d) * 0.2777777777777778d)) * 1.0d;
        if (dExp < 0.0d) {
            dExp = 0.0d;
        } else if (dExp > 1.0d) {
            dExp = 1.0d;
        }
        double[] dArr6 = {(((100.0d / d6) * dExp) + 1.0d) - dExp, (((100.0d / d7) * dExp) + 1.0d) - dExp, (((100.0d / d8) * dExp) + 1.0d) - dExp};
        double d9 = 5.0d * dA;
        double d10 = 1.0d / (d9 + 1.0d);
        double d11 = d10 * d10 * d10 * d10;
        double d12 = 1.0d - d11;
        double dCbrt = (Math.cbrt(d9) * 0.1d * d12 * d12) + (d11 * dA);
        double dA2 = ColorUtils.a(dMax) / dArr[1];
        Math.sqrt(dA2);
        Math.pow(dA2, 0.2d);
        Math.pow(((dArr6[0] * dCbrt) * d6) / 100.0d, 0.42d);
        Math.pow(((dArr6[1] * dCbrt) * d7) / 100.0d, 0.42d);
        Math.pow(((dArr6[2] * dCbrt) * d8) / 100.0d, 0.42d);
        Math.pow(dCbrt, 0.25d);
    }

    public ViewingConditions(double d, double d2, double d3, double d4, double d5, double d6, double[] dArr, double d7, double d8, double d9) {
    }
}
