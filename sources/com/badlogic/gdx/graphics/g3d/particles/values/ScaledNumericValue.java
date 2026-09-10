package com.badlogic.gdx.graphics.g3d.particles.values;

import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.utils.Json;
import com.badlogic.gdx.utils.JsonValue;

/* JADX INFO: loaded from: classes.dex */
public class ScaledNumericValue extends RangedNumericValue {
    private float highMax;
    private float highMin;
    private float[] scaling = {1.0f};
    public float[] timeline = {0.0f};
    private boolean relative = false;

    public float getHighMax() {
        return this.highMax;
    }

    public float getHighMin() {
        return this.highMin;
    }

    public float getScale(float f) {
        int length = this.timeline.length;
        int i = 1;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            }
            if (this.timeline[i] > f) {
                break;
            }
            i++;
        }
        if (i == -1) {
            return this.scaling[length - 1];
        }
        int i2 = i - 1;
        float[] fArr = this.scaling;
        float f2 = fArr[i2];
        float[] fArr2 = this.timeline;
        float f3 = fArr2[i2];
        return (((f - f3) / (fArr2[i] - f3)) * (fArr[i] - f2)) + f2;
    }

    public float[] getScaling() {
        return this.scaling;
    }

    public float[] getTimeline() {
        return this.timeline;
    }

    public boolean isRelative() {
        return this.relative;
    }

    public void load(ScaledNumericValue scaledNumericValue) {
        super.load((RangedNumericValue) scaledNumericValue);
        this.highMax = scaledNumericValue.highMax;
        this.highMin = scaledNumericValue.highMin;
        float[] fArr = new float[scaledNumericValue.scaling.length];
        this.scaling = fArr;
        System.arraycopy(scaledNumericValue.scaling, 0, fArr, 0, fArr.length);
        float[] fArr2 = new float[scaledNumericValue.timeline.length];
        this.timeline = fArr2;
        System.arraycopy(scaledNumericValue.timeline, 0, fArr2, 0, fArr2.length);
        this.relative = scaledNumericValue.relative;
    }

    public float newHighValue() {
        float f = this.highMin;
        return (MathUtils.random() * (this.highMax - f)) + f;
    }

    @Override // com.badlogic.gdx.graphics.g3d.particles.values.RangedNumericValue, com.badlogic.gdx.graphics.g3d.particles.values.ParticleValue, com.badlogic.gdx.utils.Json.Serializable
    public void read(Json json, JsonValue jsonValue) {
        super.read(json, jsonValue);
        Class cls = Float.TYPE;
        this.highMin = ((Float) json.readValue("highMin", cls, jsonValue)).floatValue();
        this.highMax = ((Float) json.readValue("highMax", cls, jsonValue)).floatValue();
        this.relative = ((Boolean) json.readValue("relative", Boolean.TYPE, jsonValue)).booleanValue();
        this.scaling = (float[]) json.readValue("scaling", float[].class, jsonValue);
        this.timeline = (float[]) json.readValue("timeline", float[].class, jsonValue);
    }

    public void setHigh(float f) {
        this.highMin = f;
        this.highMax = f;
    }

    public void setHighMax(float f) {
        this.highMax = f;
    }

    public void setHighMin(float f) {
        this.highMin = f;
    }

    public void setRelative(boolean z) {
        this.relative = z;
    }

    public void setScaling(float[] fArr) {
        this.scaling = fArr;
    }

    public void setTimeline(float[] fArr) {
        this.timeline = fArr;
    }

    @Override // com.badlogic.gdx.graphics.g3d.particles.values.RangedNumericValue, com.badlogic.gdx.graphics.g3d.particles.values.ParticleValue, com.badlogic.gdx.utils.Json.Serializable
    public void write(Json json) {
        super.write(json);
        json.writeValue("highMin", Float.valueOf(this.highMin));
        json.writeValue("highMax", Float.valueOf(this.highMax));
        json.writeValue("relative", Boolean.valueOf(this.relative));
        json.writeValue("scaling", this.scaling);
        json.writeValue("timeline", this.timeline);
    }

    public void setHigh(float f, float f2) {
        this.highMin = f;
        this.highMax = f2;
    }
}
