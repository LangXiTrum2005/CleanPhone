package lightstruck;

import android.graphics.Color;

/* JADX INFO: compiled from: CamUtils.java */
/* JADX INFO: loaded from: classes.dex */
public final class saneness {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final float[][] f32997attabal = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final float[][] f32999saneness = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final float[] f32998dern = {95.047f, 100.0f, 108.883f};

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final float[][] f33000wireman = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};

    public static int attabal(float f) {
        if (f < 1.0f) {
            return -16777216;
        }
        if (f > 99.0f) {
            return -1;
        }
        float f2 = (f + 16.0f) / 116.0f;
        float f3 = f > 8.0f ? f2 * f2 * f2 : f / 903.2963f;
        float f4 = f2 * f2 * f2;
        boolean z = f4 > 0.008856452f;
        float f5 = z ? f4 : ((f2 * 116.0f) - 16.0f) / 903.2963f;
        if (!z) {
            f4 = ((f2 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = f32998dern;
        return monroe.dern.saneness(f5 * fArr[0], f3 * fArr[1], f4 * fArr[2]);
    }

    public static void beachfront(int i, float[] fArr) {
        float fMarial = marial(Color.red(i));
        float fMarial2 = marial(Color.green(i));
        float fMarial3 = marial(Color.blue(i));
        float[][] fArr2 = f33000wireman;
        float[] fArr3 = fArr2[0];
        fArr[0] = (fArr3[0] * fMarial) + (fArr3[1] * fMarial2) + (fArr3[2] * fMarial3);
        float[] fArr4 = fArr2[1];
        fArr[1] = (fArr4[0] * fMarial) + (fArr4[1] * fMarial2) + (fArr4[2] * fMarial3);
        float[] fArr5 = fArr2[2];
        fArr[2] = (fMarial * fArr5[0]) + (fMarial2 * fArr5[1]) + (fMarial3 * fArr5[2]);
    }

    public static float competently(int i) {
        float fMarial = marial(Color.red(i));
        float fMarial2 = marial(Color.green(i));
        float fMarial3 = marial(Color.blue(i));
        float[] fArr = f33000wireman[1];
        return (fMarial * fArr[0]) + (fMarial2 * fArr[1]) + (fMarial3 * fArr[2]);
    }

    public static float dern(float f) {
        float f2 = f / 100.0f;
        return f2 <= 0.008856452f ? f2 * 903.2963f : (((float) Math.cbrt(f2)) * 116.0f) - 16.0f;
    }

    public static float impromptu(float f) {
        return (f > 8.0f ? (float) Math.pow((((double) f) + 16.0d) / 116.0d, 3.0d) : f / 903.2963f) * 100.0f;
    }

    public static float marial(int i) {
        float f = i / 255.0f;
        return (f <= 0.04045f ? f / 12.92f : (float) Math.pow((f + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }

    public static float saneness(int i) {
        return dern(competently(i));
    }

    public static float wireman(float f, float f2, float f3) {
        return f + ((f2 - f) * f3);
    }
}
