package com.badlogic.gdx.graphics.g3d.particles.emitters;

import com.badlogic.gdx.graphics.g3d.particles.ParticleControllerComponent;
import com.badlogic.gdx.utils.Json;
import com.badlogic.gdx.utils.JsonValue;

/* JADX INFO: loaded from: classes.dex */
public abstract class Emitter extends ParticleControllerComponent implements Json.Serializable {
    public int maxParticleCount = 4;
    public int minParticleCount;
    public float percent;

    public Emitter(Emitter emitter) {
        set(emitter);
    }

    @Override // com.badlogic.gdx.graphics.g3d.particles.ParticleControllerComponent
    public void end() {
        this.controller.particles.size = 0;
    }

    public int getMaxParticleCount() {
        return this.maxParticleCount;
    }

    public int getMinParticleCount() {
        return this.minParticleCount;
    }

    @Override // com.badlogic.gdx.graphics.g3d.particles.ParticleControllerComponent
    public void init() {
        this.controller.particles.size = 0;
    }

    public boolean isComplete() {
        return this.percent >= 1.0f;
    }

    @Override // com.badlogic.gdx.graphics.g3d.particles.ParticleControllerComponent, com.badlogic.gdx.utils.Json.Serializable
    public void read(Json json, JsonValue jsonValue) {
        Class cls = Integer.TYPE;
        this.minParticleCount = ((Integer) json.readValue("minParticleCount", cls, jsonValue)).intValue();
        this.maxParticleCount = ((Integer) json.readValue("maxParticleCount", cls, jsonValue)).intValue();
    }

    public void set(Emitter emitter) {
        this.minParticleCount = emitter.minParticleCount;
        this.maxParticleCount = emitter.maxParticleCount;
    }

    public void setMaxParticleCount(int i) {
        this.maxParticleCount = i;
    }

    public void setMinParticleCount(int i) {
        this.minParticleCount = i;
    }

    public void setParticleCount(int i, int i2) {
        setMinParticleCount(i);
        setMaxParticleCount(i2);
    }

    @Override // com.badlogic.gdx.graphics.g3d.particles.ParticleControllerComponent, com.badlogic.gdx.utils.Json.Serializable
    public void write(Json json) {
        json.writeValue("minParticleCount", Integer.valueOf(this.minParticleCount));
        json.writeValue("maxParticleCount", Integer.valueOf(this.maxParticleCount));
    }

    public Emitter() {
    }
}
