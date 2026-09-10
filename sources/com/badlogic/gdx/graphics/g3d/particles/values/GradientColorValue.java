package com.badlogic.gdx.graphics.g3d.particles.values;

import com.badlogic.gdx.utils.Json;
import com.badlogic.gdx.utils.JsonValue;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;

/* JADX INFO: loaded from: classes.dex */
public class GradientColorValue extends ParticleValue {
    private static float[] temp = new float[3];
    private float[] colors = {1.0f, 1.0f, 1.0f};
    public float[] timeline = {0.0f};

    public float[] getColor(float f) {
        getColor(f, temp, 0);
        return temp;
    }

    public float[] getColors() {
        return this.colors;
    }

    public float[] getTimeline() {
        return this.timeline;
    }

    public void load(GradientColorValue gradientColorValue) {
        super.load((ParticleValue) gradientColorValue);
        float[] fArr = new float[gradientColorValue.colors.length];
        this.colors = fArr;
        System.arraycopy(gradientColorValue.colors, 0, fArr, 0, fArr.length);
        float[] fArr2 = new float[gradientColorValue.timeline.length];
        this.timeline = fArr2;
        System.arraycopy(gradientColorValue.timeline, 0, fArr2, 0, fArr2.length);
    }

    @Override // com.badlogic.gdx.graphics.g3d.particles.values.ParticleValue, com.badlogic.gdx.utils.Json.Serializable
    public void read(Json json, JsonValue jsonValue) {
        super.read(json, jsonValue);
        this.colors = (float[]) json.readValue("colors", float[].class, jsonValue);
        this.timeline = (float[]) json.readValue("timeline", float[].class, jsonValue);
    }

    public void setColors(float[] fArr) {
        this.colors = fArr;
    }

    public void setTimeline(float[] fArr) {
        this.timeline = fArr;
    }

    @Override // com.badlogic.gdx.graphics.g3d.particles.values.ParticleValue, com.badlogic.gdx.utils.Json.Serializable
    public void write(Json json) {
        super.write(json);
        json.writeValue("colors", this.colors);
        json.writeValue("timeline", this.timeline);
    }

    public void getColor(float f, float[] fArr, int i) {
        float[] fArr2 = this.timeline;
        int length = fArr2.length;
        int i2 = 1;
        int i3 = 0;
        while (true) {
            if (i2 >= length) {
                i2 = -1;
                break;
            } else {
                if (fArr2[i2] > f) {
                    break;
                }
                i3 = i2;
                i2++;
            }
        }
        float f2 = fArr2[i3];
        int i4 = i3 * 3;
        float[] fArr3 = this.colors;
        float f3 = fArr3[i4];
        float f4 = fArr3[i4 + 1];
        float f5 = fArr3[i4 + 2];
        if (i2 == -1) {
            fArr[i] = f3;
            fArr[i + 1] = f4;
            fArr[i + 2] = f5;
        } else {
            float f6 = (f - f2) / (fArr2[i2] - f2);
            int i5 = i2 * 3;
            fArr[i] = AbstractC5044xl.w(fArr3[i5], f3, f6, f3);
            fArr[i + 1] = AbstractC5044xl.w(fArr3[i5 + 1], f4, f6, f4);
            fArr[i + 2] = AbstractC5044xl.w(fArr3[i5 + 2], f5, f6, f5);
        }
    }
}
