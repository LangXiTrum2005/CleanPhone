package com.badlogic.gdx.graphics.g3d.particles.values;

import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.utils.Json;
import com.badlogic.gdx.utils.JsonValue;

/* JADX INFO: loaded from: classes.dex */
public abstract class PrimitiveSpawnShapeValue extends SpawnShapeValue {
    protected static final Vector3 TMP_V1 = new Vector3();
    boolean edges;
    protected float spawnDepth;
    protected float spawnDepthDiff;
    public ScaledNumericValue spawnDepthValue;
    protected float spawnHeight;
    protected float spawnHeightDiff;
    public ScaledNumericValue spawnHeightValue;
    protected float spawnWidth;
    protected float spawnWidthDiff;
    public ScaledNumericValue spawnWidthValue;

    public enum SpawnSide {
        both,
        top,
        bottom
    }

    public PrimitiveSpawnShapeValue() {
        this.edges = false;
        this.spawnWidthValue = new ScaledNumericValue();
        this.spawnHeightValue = new ScaledNumericValue();
        this.spawnDepthValue = new ScaledNumericValue();
    }

    public ScaledNumericValue getSpawnDepth() {
        return this.spawnDepthValue;
    }

    public ScaledNumericValue getSpawnHeight() {
        return this.spawnHeightValue;
    }

    public ScaledNumericValue getSpawnWidth() {
        return this.spawnWidthValue;
    }

    public boolean isEdges() {
        return this.edges;
    }

    @Override // com.badlogic.gdx.graphics.g3d.particles.values.SpawnShapeValue, com.badlogic.gdx.graphics.g3d.particles.values.ParticleValue
    public void load(ParticleValue particleValue) {
        super.load(particleValue);
        PrimitiveSpawnShapeValue primitiveSpawnShapeValue = (PrimitiveSpawnShapeValue) particleValue;
        this.edges = primitiveSpawnShapeValue.edges;
        this.spawnWidthValue.load(primitiveSpawnShapeValue.spawnWidthValue);
        this.spawnHeightValue.load(primitiveSpawnShapeValue.spawnHeightValue);
        this.spawnDepthValue.load(primitiveSpawnShapeValue.spawnDepthValue);
    }

    @Override // com.badlogic.gdx.graphics.g3d.particles.values.SpawnShapeValue, com.badlogic.gdx.graphics.g3d.particles.values.ParticleValue, com.badlogic.gdx.utils.Json.Serializable
    public void read(Json json, JsonValue jsonValue) {
        super.read(json, jsonValue);
        this.spawnWidthValue = (ScaledNumericValue) json.readValue("spawnWidthValue", ScaledNumericValue.class, jsonValue);
        this.spawnHeightValue = (ScaledNumericValue) json.readValue("spawnHeightValue", ScaledNumericValue.class, jsonValue);
        this.spawnDepthValue = (ScaledNumericValue) json.readValue("spawnDepthValue", ScaledNumericValue.class, jsonValue);
        this.edges = ((Boolean) json.readValue("edges", Boolean.TYPE, jsonValue)).booleanValue();
    }

    @Override // com.badlogic.gdx.graphics.g3d.particles.values.ParticleValue
    public void setActive(boolean z) {
        super.setActive(z);
        this.spawnWidthValue.setActive(true);
        this.spawnHeightValue.setActive(true);
        this.spawnDepthValue.setActive(true);
    }

    public void setDimensions(float f, float f2, float f3) {
        this.spawnWidthValue.setHigh(f);
        this.spawnHeightValue.setHigh(f2);
        this.spawnDepthValue.setHigh(f3);
    }

    public void setEdges(boolean z) {
        this.edges = z;
    }

    @Override // com.badlogic.gdx.graphics.g3d.particles.values.SpawnShapeValue
    public void start() {
        this.spawnWidth = this.spawnWidthValue.newLowValue();
        this.spawnWidthDiff = this.spawnWidthValue.newHighValue();
        if (!this.spawnWidthValue.isRelative()) {
            this.spawnWidthDiff -= this.spawnWidth;
        }
        this.spawnHeight = this.spawnHeightValue.newLowValue();
        this.spawnHeightDiff = this.spawnHeightValue.newHighValue();
        if (!this.spawnHeightValue.isRelative()) {
            this.spawnHeightDiff -= this.spawnHeight;
        }
        this.spawnDepth = this.spawnDepthValue.newLowValue();
        this.spawnDepthDiff = this.spawnDepthValue.newHighValue();
        if (this.spawnDepthValue.isRelative()) {
            return;
        }
        this.spawnDepthDiff -= this.spawnDepth;
    }

    @Override // com.badlogic.gdx.graphics.g3d.particles.values.SpawnShapeValue, com.badlogic.gdx.graphics.g3d.particles.values.ParticleValue, com.badlogic.gdx.utils.Json.Serializable
    public void write(Json json) {
        super.write(json);
        json.writeValue("spawnWidthValue", this.spawnWidthValue);
        json.writeValue("spawnHeightValue", this.spawnHeightValue);
        json.writeValue("spawnDepthValue", this.spawnDepthValue);
        json.writeValue("edges", Boolean.valueOf(this.edges));
    }

    public PrimitiveSpawnShapeValue(PrimitiveSpawnShapeValue primitiveSpawnShapeValue) {
        super(primitiveSpawnShapeValue);
        this.edges = false;
        this.spawnWidthValue = new ScaledNumericValue();
        this.spawnHeightValue = new ScaledNumericValue();
        this.spawnDepthValue = new ScaledNumericValue();
    }
}
