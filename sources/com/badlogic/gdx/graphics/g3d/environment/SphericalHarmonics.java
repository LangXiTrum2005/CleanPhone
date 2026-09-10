package com.badlogic.gdx.graphics.g3d.environment;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.utils.GdxRuntimeException;

/* JADX INFO: loaded from: classes.dex */
public class SphericalHarmonics {
    private static final float[] coeff = {0.282095f, 0.488603f, 0.488603f, 0.488603f, 1.092548f, 1.092548f, 1.092548f, 0.315392f, 0.546274f};
    public final float[] data;

    public SphericalHarmonics() {
        this.data = new float[27];
    }

    private static final float clamp(float f) {
        if (f < 0.0f) {
            return 0.0f;
        }
        if (f > 1.0f) {
            return 1.0f;
        }
        return f;
    }

    public SphericalHarmonics set(float[] fArr) {
        int i = 0;
        while (true) {
            float[] fArr2 = this.data;
            if (i >= fArr2.length) {
                return this;
            }
            fArr2[i] = fArr[i];
            i++;
        }
    }

    public SphericalHarmonics(float[] fArr) {
        if (fArr.length == 27) {
            this.data = (float[]) fArr.clone();
            return;
        }
        throw new GdxRuntimeException("Incorrect array size");
    }

    public SphericalHarmonics set(AmbientCubemap ambientCubemap) {
        return set(ambientCubemap.data);
    }

    public SphericalHarmonics set(Color color) {
        return set(color.r, color.g, color.b);
    }

    public SphericalHarmonics set(float f, float f2, float f3) {
        int i = 0;
        while (true) {
            float[] fArr = this.data;
            if (i >= fArr.length) {
                return this;
            }
            fArr[i] = f;
            int i2 = i + 2;
            fArr[i + 1] = f2;
            i += 3;
            fArr[i2] = f3;
        }
    }
}
