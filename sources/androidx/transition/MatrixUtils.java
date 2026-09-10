package androidx.transition;

import android.graphics.Matrix;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes.dex */
class MatrixUtils {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Matrix f8423a = new AnonymousClass1();

    /* JADX INFO: renamed from: androidx.transition.MatrixUtils$1, reason: invalid class name */
    public class AnonymousClass1 extends Matrix {
        public static void a() {
            throw new IllegalStateException("Matrix can not be modified");
        }

        @Override // android.graphics.Matrix
        public final boolean postConcat(Matrix matrix) {
            a();
            throw null;
        }

        @Override // android.graphics.Matrix
        public final boolean postRotate(float f, float f2, float f3) {
            a();
            throw null;
        }

        @Override // android.graphics.Matrix
        public final boolean postScale(float f, float f2, float f3, float f4) {
            a();
            throw null;
        }

        @Override // android.graphics.Matrix
        public final boolean postSkew(float f, float f2, float f3, float f4) {
            a();
            throw null;
        }

        @Override // android.graphics.Matrix
        public final boolean postTranslate(float f, float f2) {
            a();
            throw null;
        }

        @Override // android.graphics.Matrix
        public final boolean preConcat(Matrix matrix) {
            a();
            throw null;
        }

        @Override // android.graphics.Matrix
        public final boolean preRotate(float f, float f2, float f3) {
            a();
            throw null;
        }

        @Override // android.graphics.Matrix
        public final boolean preScale(float f, float f2, float f3, float f4) {
            a();
            throw null;
        }

        @Override // android.graphics.Matrix
        public final boolean preSkew(float f, float f2, float f3, float f4) {
            a();
            throw null;
        }

        @Override // android.graphics.Matrix
        public final boolean preTranslate(float f, float f2) {
            a();
            throw null;
        }

        @Override // android.graphics.Matrix
        public final void reset() {
            a();
            throw null;
        }

        @Override // android.graphics.Matrix
        public final void set(Matrix matrix) {
            a();
            throw null;
        }

        @Override // android.graphics.Matrix
        public final boolean setConcat(Matrix matrix, Matrix matrix2) {
            a();
            throw null;
        }

        @Override // android.graphics.Matrix
        public final boolean setPolyToPoly(float[] fArr, int i2, float[] fArr2, int i3, int i4) {
            a();
            throw null;
        }

        @Override // android.graphics.Matrix
        public final boolean setRectToRect(RectF rectF, RectF rectF2, Matrix.ScaleToFit scaleToFit) {
            a();
            throw null;
        }

        @Override // android.graphics.Matrix
        public final void setRotate(float f, float f2, float f3) {
            a();
            throw null;
        }

        @Override // android.graphics.Matrix
        public final void setScale(float f, float f2, float f3, float f4) {
            a();
            throw null;
        }

        @Override // android.graphics.Matrix
        public final void setSinCos(float f, float f2, float f3, float f4) {
            a();
            throw null;
        }

        @Override // android.graphics.Matrix
        public final void setSkew(float f, float f2, float f3, float f4) {
            a();
            throw null;
        }

        @Override // android.graphics.Matrix
        public final void setTranslate(float f, float f2) {
            a();
            throw null;
        }

        @Override // android.graphics.Matrix
        public final void setValues(float[] fArr) {
            a();
            throw null;
        }

        @Override // android.graphics.Matrix
        public final boolean postRotate(float f) {
            a();
            throw null;
        }

        @Override // android.graphics.Matrix
        public final boolean postScale(float f, float f2) {
            a();
            throw null;
        }

        @Override // android.graphics.Matrix
        public final boolean postSkew(float f, float f2) {
            a();
            throw null;
        }

        @Override // android.graphics.Matrix
        public final boolean preRotate(float f) {
            a();
            throw null;
        }

        @Override // android.graphics.Matrix
        public final boolean preScale(float f, float f2) {
            a();
            throw null;
        }

        @Override // android.graphics.Matrix
        public final boolean preSkew(float f, float f2) {
            a();
            throw null;
        }

        @Override // android.graphics.Matrix
        public final void setRotate(float f) {
            a();
            throw null;
        }

        @Override // android.graphics.Matrix
        public final void setScale(float f, float f2) {
            a();
            throw null;
        }

        @Override // android.graphics.Matrix
        public final void setSinCos(float f, float f2) {
            a();
            throw null;
        }

        @Override // android.graphics.Matrix
        public final void setSkew(float f, float f2) {
            a();
            throw null;
        }
    }
}
