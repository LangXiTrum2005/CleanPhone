package com.bytedance.adsdk.LD;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.view.animation.Interpolator;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;

/* JADX INFO: loaded from: classes.dex */
class VVE implements Interpolator {
    private final float[] LD;
    private final float[] Lxb;

    public VVE(Path path) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int i = (int) (length / 0.002f);
        int i2 = i + 1;
        this.Lxb = new float[i2];
        this.LD = new float[i2];
        float[] fArr = new float[2];
        for (int i3 = 0; i3 < i2; i3++) {
            pathMeasure.getPosTan((i3 * length) / i, fArr, null);
            this.Lxb[i3] = fArr[0];
            this.LD[i3] = fArr[1];
        }
    }

    private static Path Lxb(float f, float f2, float f3, float f4) {
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
        int length = this.Lxb.length - 1;
        int i = 0;
        while (length - i > 1) {
            int i2 = (i + length) / 2;
            if (f < this.Lxb[i2]) {
                length = i2;
            } else {
                i = i2;
            }
        }
        float[] fArr = this.Lxb;
        float f2 = fArr[length];
        float f3 = fArr[i];
        float f4 = f2 - f3;
        if (f4 == 0.0f) {
            return this.LD[i];
        }
        float f5 = (f - f3) / f4;
        float[] fArr2 = this.LD;
        float f6 = fArr2[i];
        return AbstractC5044xl.w(fArr2[length], f6, f5, f6);
    }

    public VVE(float f, float f2, float f3, float f4) {
        this(Lxb(f, f2, f3, f4));
    }
}
