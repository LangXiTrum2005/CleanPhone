package androidx.transition;

import android.animation.TypeEvaluator;

/* JADX INFO: loaded from: classes.dex */
class FloatArrayEvaluator implements TypeEvaluator<float[]> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float[] f8418a;

    @Override // android.animation.TypeEvaluator
    public final float[] evaluate(float f, float[] fArr, float[] fArr2) {
        float[] fArr3 = fArr;
        float[] fArr4 = fArr2;
        float[] fArr5 = this.f8418a;
        if (fArr5 == null) {
            fArr5 = new float[fArr3.length];
        }
        for (int i2 = 0; i2 < fArr5.length; i2++) {
            float f2 = fArr3[i2];
            fArr5[i2] = android.support.v4.media.a.a(fArr4[i2], f2, f, f2);
        }
        return fArr5;
    }
}
