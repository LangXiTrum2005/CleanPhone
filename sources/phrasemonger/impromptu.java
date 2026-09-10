package phrasemonger;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;

/* JADX INFO: compiled from: MatrixEvaluator.java */
/* JADX INFO: loaded from: classes3.dex */
public class impromptu implements TypeEvaluator<Matrix> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final float[] f35303attabal = new float[9];

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final float[] f35305saneness = new float[9];

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final Matrix f35304dern = new Matrix();

    public Matrix attabal(float f, Matrix matrix, Matrix matrix2) {
        matrix.getValues(this.f35303attabal);
        matrix2.getValues(this.f35305saneness);
        for (int i = 0; i < 9; i++) {
            float[] fArr = this.f35305saneness;
            float f2 = fArr[i];
            float f3 = this.f35303attabal[i];
            fArr[i] = f3 + ((f2 - f3) * f);
        }
        this.f35304dern.setValues(this.f35305saneness);
        return this.f35304dern;
    }
}
