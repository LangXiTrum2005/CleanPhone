package com.badlogic.gdx.graphics.g3d.particles.values;

import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.utils.Json;
import com.badlogic.gdx.utils.JsonValue;

/* JADX INFO: loaded from: classes.dex */
public class RangedNumericValue extends ParticleValue {
    private float lowMax;
    private float lowMin;

    public float getLowMax() {
        return this.lowMax;
    }

    public float getLowMin() {
        return this.lowMin;
    }

    public void load(RangedNumericValue rangedNumericValue) {
        super.load((ParticleValue) rangedNumericValue);
        this.lowMax = rangedNumericValue.lowMax;
        this.lowMin = rangedNumericValue.lowMin;
    }

    public float newLowValue() {
        float f = this.lowMin;
        return (MathUtils.random() * (this.lowMax - f)) + f;
    }

    @Override // com.badlogic.gdx.graphics.g3d.particles.values.ParticleValue, com.badlogic.gdx.utils.Json.Serializable
    public void read(Json json, JsonValue jsonValue) {
        super.read(json, jsonValue);
        Class cls = Float.TYPE;
        this.lowMin = ((Float) json.readValue("lowMin", cls, jsonValue)).floatValue();
        this.lowMax = ((Float) json.readValue("lowMax", cls, jsonValue)).floatValue();
    }

    public void setLow(float f) {
        this.lowMin = f;
        this.lowMax = f;
    }

    public void setLowMax(float f) {
        this.lowMax = f;
    }

    public void setLowMin(float f) {
        this.lowMin = f;
    }

    @Override // com.badlogic.gdx.graphics.g3d.particles.values.ParticleValue, com.badlogic.gdx.utils.Json.Serializable
    public void write(Json json) {
        super.write(json);
        json.writeValue("lowMin", Float.valueOf(this.lowMin));
        json.writeValue("lowMax", Float.valueOf(this.lowMax));
    }

    public void setLow(float f, float f2) {
        this.lowMin = f;
        this.lowMax = f2;
    }
}
