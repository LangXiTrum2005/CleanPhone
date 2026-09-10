package earstone;

import android.animation.TypeEvaluator;

/* JADX INFO: compiled from: FloatArrayEvaluator.java */
/* JADX INFO: loaded from: classes.dex */
public class dern implements TypeEvaluator<float[]> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public float[] f25523attabal;

    public dern(float[] fArr) {
        this.f25523attabal = fArr;
    }

    @Override // android.animation.TypeEvaluator
    /* JADX INFO: renamed from: attabal, reason: merged with bridge method [inline-methods] */
    public float[] evaluate(float f, float[] fArr, float[] fArr2) {
        float[] fArr3 = this.f25523attabal;
        if (fArr3 == null) {
            fArr3 = new float[fArr.length];
        }
        for (int i = 0; i < fArr3.length; i++) {
            float f2 = fArr[i];
            fArr3[i] = f2 + ((fArr2[i] - f2) * f);
        }
        return fArr3;
    }
}
