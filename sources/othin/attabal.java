package othin;

/* JADX INFO: compiled from: MathUtils.java */
/* JADX INFO: loaded from: classes3.dex */
public final class attabal {
    public static boolean attabal(float[] fArr) {
        if (fArr.length <= 1) {
            return true;
        }
        float f = fArr[0];
        for (int i = 1; i < fArr.length; i++) {
            if (fArr[i] != f) {
                return false;
            }
        }
        return true;
    }

    public static float beachfront(float f, float f2, float f3) {
        return ((1.0f - f3) * f) + (f3 * f2);
    }

    public static float competently(float f, float f2, float f3, float f4) {
        if (f > f2 && f > f3 && f > f4) {
            return f;
        }
        if (f2 <= f3 || f2 <= f4) {
            return f3 > f4 ? f3 : f4;
        }
        return f2;
    }

    public static float dern(float f, float f2, float f3, float f4, float f5, float f6) {
        return competently(saneness(f, f2, f3, f4), saneness(f, f2, f5, f4), saneness(f, f2, f5, f6), saneness(f, f2, f3, f6));
    }

    public static boolean marial(float f, float f2, float f3) {
        return f + f3 >= f2;
    }

    public static float saneness(float f, float f2, float f3, float f4) {
        return (float) Math.hypot(f3 - f, f4 - f2);
    }

    public static int wireman(int i, int i2) {
        int i3 = i / i2;
        if ((i ^ i2) < 0 && i3 * i2 != i) {
            i3--;
        }
        return i - (i3 * i2);
    }
}
