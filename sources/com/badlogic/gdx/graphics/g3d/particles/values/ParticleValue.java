package com.badlogic.gdx.graphics.g3d.particles.values;

import com.badlogic.gdx.utils.Json;
import com.badlogic.gdx.utils.JsonValue;
import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* JADX INFO: loaded from: classes.dex */
public class ParticleValue implements Json.Serializable {
    public boolean active;

    public ParticleValue() {
    }

    public boolean isActive() {
        return this.active;
    }

    public void load(ParticleValue particleValue) {
        this.active = particleValue.active;
    }

    @Override // com.badlogic.gdx.utils.Json.Serializable
    public void read(Json json, JsonValue jsonValue) {
        this.active = ((Boolean) json.readValue(AppMeasurementSdk.ConditionalUserProperty.ACTIVE, Boolean.class, jsonValue)).booleanValue();
    }

    public void setActive(boolean z) {
        this.active = z;
    }

    @Override // com.badlogic.gdx.utils.Json.Serializable
    public void write(Json json) {
        json.writeValue(AppMeasurementSdk.ConditionalUserProperty.ACTIVE, Boolean.valueOf(this.active));
    }

    public ParticleValue(ParticleValue particleValue) {
        this.active = particleValue.active;
    }
}
