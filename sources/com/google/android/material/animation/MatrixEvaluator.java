package com.google.android.material.animation;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;
import android.support.v4.media.a;

/* JADX INFO: loaded from: classes4.dex */
public class MatrixEvaluator implements TypeEvaluator<Matrix> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float[] f19083a = new float[9];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float[] f19084b = new float[9];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Matrix f19085c = new Matrix();

    @Override // android.animation.TypeEvaluator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Matrix evaluate(float f, Matrix matrix, Matrix matrix2) {
        float[] fArr = this.f19083a;
        matrix.getValues(fArr);
        float[] fArr2 = this.f19084b;
        matrix2.getValues(fArr2);
        for (int i2 = 0; i2 < 9; i2++) {
            float f2 = fArr2[i2];
            float f3 = fArr[i2];
            fArr2[i2] = a.a(f2, f3, f, f3);
        }
        Matrix matrix3 = this.f19085c;
        matrix3.setValues(fArr2);
        return matrix3;
    }
}
