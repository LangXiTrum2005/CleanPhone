package com.bytedance.adsdk.ud;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.support.v4.media.a;
import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes.dex */
class jtx implements Interpolator {
    private final float[] qdl;
    private final float[] ud;

    public jtx(Path path) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int i2 = (int) (length / 0.002f);
        int i3 = i2 + 1;
        this.qdl = new float[i3];
        this.ud = new float[i3];
        float[] fArr = new float[2];
        for (int i4 = 0; i4 < i3; i4++) {
            pathMeasure.getPosTan((i4 * length) / i2, fArr, null);
            this.qdl[i4] = fArr[0];
            this.ud[i4] = fArr[1];
        }
    }

    private static Path qdl(float f, float f2, float f3, float f4) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.cubicTo(f, f2, f3, f4, 1.0f, 1.0f);
        return path;
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        if (f <= 0.0f) {
            return 0.0f;
        }
        if (f >= 1.0f) {
            return 1.0f;
        }
        int length = this.qdl.length - 1;
        int i2 = 0;
        while (length - i2 > 1) {
            int i3 = (i2 + length) / 2;
            if (f < this.qdl[i3]) {
                length = i3;
            } else {
                i2 = i3;
            }
        }
        float[] fArr = this.qdl;
        float f2 = fArr[length];
        float f3 = fArr[i2];
        float f4 = f2 - f3;
        if (f4 == 0.0f) {
            return this.ud[i2];
        }
        float f5 = (f - f3) / f4;
        float[] fArr2 = this.ud;
        float f6 = fArr2[i2];
        return a.a(fArr2[length], f6, f5, f6);
    }

    public jtx(float f, float f2, float f3, float f4) {
        this(qdl(f, f2, f3, f4));
    }
}
