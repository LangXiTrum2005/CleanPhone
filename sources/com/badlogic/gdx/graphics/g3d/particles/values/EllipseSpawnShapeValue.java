package com.badlogic.gdx.graphics.g3d.particles.values;

import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.utils.Json;
import com.badlogic.gdx.utils.JsonValue;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3950lJ;

/* JADX INFO: loaded from: classes.dex */
public final class EllipseSpawnShapeValue extends PrimitiveSpawnShapeValue {
    PrimitiveSpawnShapeValue.SpawnSide side;

    public EllipseSpawnShapeValue(EllipseSpawnShapeValue ellipseSpawnShapeValue) {
        super(ellipseSpawnShapeValue);
        this.side = PrimitiveSpawnShapeValue.SpawnSide.both;
        load(ellipseSpawnShapeValue);
    }

    @Override // com.badlogic.gdx.graphics.g3d.particles.values.SpawnShapeValue
    public SpawnShapeValue copy() {
        return new EllipseSpawnShapeValue(this);
    }

    public PrimitiveSpawnShapeValue.SpawnSide getSide() {
        return this.side;
    }

    @Override // com.badlogic.gdx.graphics.g3d.particles.values.PrimitiveSpawnShapeValue, com.badlogic.gdx.graphics.g3d.particles.values.SpawnShapeValue, com.badlogic.gdx.graphics.g3d.particles.values.ParticleValue
    public void load(ParticleValue particleValue) {
        super.load(particleValue);
        this.side = ((EllipseSpawnShapeValue) particleValue).side;
    }

    @Override // com.badlogic.gdx.graphics.g3d.particles.values.PrimitiveSpawnShapeValue, com.badlogic.gdx.graphics.g3d.particles.values.SpawnShapeValue, com.badlogic.gdx.graphics.g3d.particles.values.ParticleValue, com.badlogic.gdx.utils.Json.Serializable
    public void read(Json json, JsonValue jsonValue) {
        super.read(json, jsonValue);
        this.side = (PrimitiveSpawnShapeValue.SpawnSide) json.readValue("side", PrimitiveSpawnShapeValue.SpawnSide.class, jsonValue);
    }

    public void setSide(PrimitiveSpawnShapeValue.SpawnSide spawnSide) {
        this.side = spawnSide;
    }

    @Override // com.badlogic.gdx.graphics.g3d.particles.values.SpawnShapeValue
    public void spawnAux(Vector3 vector3, float f) {
        float f2;
        float fRandom;
        float fRandom2;
        float fRandom3;
        float fI = AbstractC3950lJ.i(this.spawnWidthValue, f, this.spawnWidthDiff, this.spawnWidth);
        float fI2 = AbstractC3950lJ.i(this.spawnHeightValue, f, this.spawnHeightDiff, this.spawnHeight);
        float fI3 = AbstractC3950lJ.i(this.spawnDepthValue, f, this.spawnDepthDiff, this.spawnDepth);
        PrimitiveSpawnShapeValue.SpawnSide spawnSide = this.side;
        if (spawnSide == PrimitiveSpawnShapeValue.SpawnSide.top) {
            f2 = 3.1415927f;
        } else {
            f2 = spawnSide == PrimitiveSpawnShapeValue.SpawnSide.bottom ? -3.1415927f : 6.2831855f;
        }
        float fRandom4 = MathUtils.random(0.0f, f2);
        if (!this.edges) {
            fRandom = MathUtils.random(fI / 2.0f);
            fRandom2 = MathUtils.random(fI2 / 2.0f);
            fRandom3 = MathUtils.random(fI3 / 2.0f);
        } else {
            if (fI == 0.0f) {
                vector3.set(0.0f, MathUtils.sin(fRandom4) * (fI2 / 2.0f), MathUtils.cos(fRandom4) * (fI3 / 2.0f));
                return;
            }
            if (fI2 == 0.0f) {
                vector3.set(MathUtils.cos(fRandom4) * (fI / 2.0f), 0.0f, MathUtils.sin(fRandom4) * (fI3 / 2.0f));
                return;
            } else if (fI3 == 0.0f) {
                vector3.set(MathUtils.cos(fRandom4) * (fI / 2.0f), MathUtils.sin(fRandom4) * (fI2 / 2.0f), 0.0f);
                return;
            } else {
                fRandom = fI / 2.0f;
                fRandom2 = fI2 / 2.0f;
                fRandom3 = fI3 / 2.0f;
            }
        }
        float fRandom5 = MathUtils.random(-1.0f, 1.0f);
        float fSqrt = (float) Math.sqrt(1.0f - (fRandom5 * fRandom5));
        vector3.set(MathUtils.cos(fRandom4) * fRandom * fSqrt, MathUtils.sin(fRandom4) * fRandom2 * fSqrt, fRandom3 * fRandom5);
    }

    @Override // com.badlogic.gdx.graphics.g3d.particles.values.PrimitiveSpawnShapeValue, com.badlogic.gdx.graphics.g3d.particles.values.SpawnShapeValue, com.badlogic.gdx.graphics.g3d.particles.values.ParticleValue, com.badlogic.gdx.utils.Json.Serializable
    public void write(Json json) {
        super.write(json);
        json.writeValue("side", this.side);
    }

    public EllipseSpawnShapeValue() {
        this.side = PrimitiveSpawnShapeValue.SpawnSide.both;
    }
}
