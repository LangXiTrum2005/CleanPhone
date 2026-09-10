package com.charging.screenshow.battery.animations.themes.view.scalablevideoview;

import android.graphics.Matrix;

/* JADX INFO: loaded from: classes3.dex */
public class ScaleManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Size f13336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Size f13337b;

    /* JADX INFO: renamed from: com.charging.screenshow.battery.animations.themes.view.scalablevideoview.ScaleManager$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f13338a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f13339b;

        static {
            int[] iArr = new int[PivotPoint.values().length];
            f13339b = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13339b[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13339b[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f13339b[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f13339b[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f13339b[5] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f13339b[6] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f13339b[7] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f13339b[8] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            int[] iArr2 = new int[ScalableType.values().length];
            f13338a = iArr2;
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f13338a[1] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f13338a[3] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f13338a[2] = 4;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f13338a[4] = 5;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f13338a[5] = 6;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f13338a[6] = 7;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f13338a[7] = 8;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f13338a[8] = 9;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f13338a[9] = 10;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f13338a[10] = 11;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f13338a[11] = 12;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f13338a[12] = 13;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f13338a[13] = 14;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f13338a[14] = 15;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f13338a[15] = 16;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f13338a[16] = 17;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f13338a[17] = 18;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                f13338a[18] = 19;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                f13338a[19] = 20;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                f13338a[20] = 21;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                f13338a[21] = 22;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                f13338a[22] = 23;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                f13338a[23] = 24;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                f13338a[24] = 25;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                f13338a[25] = 26;
            } catch (NoSuchFieldError unused35) {
            }
        }
    }

    public static Matrix c(float f, float f2, float f3, float f4) {
        Matrix matrix = new Matrix();
        matrix.setScale(f, f2, f3, f4);
        return matrix;
    }

    public final Matrix a(PivotPoint pivotPoint) {
        Size size = this.f13336a;
        float f = size.f13340a;
        Size size2 = this.f13337b;
        float f2 = f / size2.f13340a;
        float f3 = size.f13341b / size2.f13341b;
        float fMax = Math.max(f2, f3);
        return d(fMax / f2, fMax / f3, pivotPoint);
    }

    public final Matrix b(PivotPoint pivotPoint) {
        Size size = this.f13336a;
        float f = size.f13340a;
        Size size2 = this.f13337b;
        float f2 = f / size2.f13340a;
        float f3 = size.f13341b / size2.f13341b;
        float fMin = Math.min(f2, f3);
        return d(fMin / f2, fMin / f3, pivotPoint);
    }

    public final Matrix d(float f, float f2, PivotPoint pivotPoint) {
        int iOrdinal = pivotPoint.ordinal();
        Size size = this.f13336a;
        switch (iOrdinal) {
            case 0:
                return c(f, f2, 0.0f, 0.0f);
            case 1:
                return c(f, f2, 0.0f, size.f13341b / 2.0f);
            case 2:
                return c(f, f2, 0.0f, size.f13341b);
            case 3:
                return c(f, f2, size.f13340a / 2.0f, 0.0f);
            case 4:
                return c(f, f2, size.f13340a / 2.0f, size.f13341b / 2.0f);
            case 5:
                return c(f, f2, size.f13340a / 2.0f, size.f13341b);
            case 6:
                return c(f, f2, size.f13340a, 0.0f);
            case 7:
                return c(f, f2, size.f13340a, size.f13341b / 2.0f);
            case 8:
                return c(f, f2, size.f13340a, size.f13341b);
            default:
                throw new IllegalArgumentException("Illegal PivotPoint");
        }
    }

    public final Matrix e(PivotPoint pivotPoint) {
        Size size = this.f13337b;
        float f = size.f13340a;
        Size size2 = this.f13336a;
        return d(f / size2.f13340a, size.f13341b / size2.f13341b, pivotPoint);
    }
}
