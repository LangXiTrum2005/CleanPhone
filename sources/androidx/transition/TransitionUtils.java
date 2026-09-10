package androidx.transition;

import android.animation.TypeEvaluator;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Picture;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
class TransitionUtils {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f8441a;

    public static class Api28Impl {
        public static Bitmap a(Picture picture) {
            return Bitmap.createBitmap(picture);
        }
    }

    public static class MatrixEvaluator implements TypeEvaluator<Matrix> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final float[] f8442a = new float[9];

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final float[] f8443b = new float[9];

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Matrix f8444c = new Matrix();

        @Override // android.animation.TypeEvaluator
        public final Matrix evaluate(float f, Matrix matrix, Matrix matrix2) {
            float[] fArr = this.f8442a;
            matrix.getValues(fArr);
            float[] fArr2 = this.f8443b;
            matrix2.getValues(fArr2);
            for (int i2 = 0; i2 < 9; i2++) {
                float f2 = fArr2[i2];
                float f3 = fArr[i2];
                fArr2[i2] = android.support.v4.media.a.a(f2, f3, f, f3);
            }
            Matrix matrix3 = this.f8444c;
            matrix3.setValues(fArr2);
            return matrix3;
        }
    }

    static {
        f8441a = Build.VERSION.SDK_INT >= 28;
    }
}
