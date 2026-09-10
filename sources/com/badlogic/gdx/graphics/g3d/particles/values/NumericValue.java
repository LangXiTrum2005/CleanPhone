package com.badlogic.gdx.graphics.g3d.particles.values;

import com.badlogic.gdx.utils.Json;
import com.badlogic.gdx.utils.JsonValue;
import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* JADX INFO: loaded from: classes.dex */
public class NumericValue extends ParticleValue {
    private float value;

    public float getValue() {
        return this.value;
    }

    public void load(NumericValue numericValue) {
        super.load((ParticleValue) numericValue);
        this.value = numericValue.value;
    }

    @Override // com.badlogic.gdx.graphics.g3d.particles.values.ParticleValue, com.badlogic.gdx.utils.Json.Serializable
    public void read(Json json, JsonValue jsonValue) {
        super.read(json, jsonValue);
        this.value = ((Float) json.readValue(AppMeasurementSdk.ConditionalUserProperty.VALUE, Float.TYPE, jsonValue)).floatValue();
    }

    public void setValue(float f) {
        this.value = f;
    }

    @Override // com.badlogic.gdx.graphics.g3d.particles.values.ParticleValue, com.badlogic.gdx.utils.Json.Serializable
    public void write(Json json) {
        super.write(json);
        json.writeValue(AppMeasurementSdk.ConditionalUserProperty.VALUE, Float.valueOf(this.value));
    }
}
