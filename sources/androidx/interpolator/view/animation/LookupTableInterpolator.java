package androidx.interpolator.view.animation;

import android.support.v4.media.a;
import android.view.animation.Interpolator;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes.dex */
public abstract class LookupTableInterpolator implements Interpolator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float[] f5217a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f5218b;

    public LookupTableInterpolator(float[] fArr) {
        this.f5217a = fArr;
        this.f5218b = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        if (f >= 1.0f) {
            return 1.0f;
        }
        if (f <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f5217a;
        int iMin = Math.min((int) ((fArr.length - 1) * f), fArr.length - 2);
        float f2 = this.f5218b;
        float f3 = (f - (iMin * f2)) / f2;
        float f4 = fArr[iMin];
        return a.a(fArr[iMin + 1], f4, f3, f4);
    }
}
