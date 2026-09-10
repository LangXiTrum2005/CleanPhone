package com.badlogic.gdx.graphics.g3d.particles.values;

import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Vector3;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3950lJ;

/* JADX INFO: loaded from: classes.dex */
public final class CylinderSpawnShapeValue extends PrimitiveSpawnShapeValue {
    public CylinderSpawnShapeValue(CylinderSpawnShapeValue cylinderSpawnShapeValue) {
        super(cylinderSpawnShapeValue);
        load(cylinderSpawnShapeValue);
    }

    @Override // com.badlogic.gdx.graphics.g3d.particles.values.SpawnShapeValue
    public SpawnShapeValue copy() {
        return new CylinderSpawnShapeValue(this);
    }

    @Override // com.badlogic.gdx.graphics.g3d.particles.values.SpawnShapeValue
    public void spawnAux(Vector3 vector3, float f) {
        float fRandom;
        float fI = AbstractC3950lJ.i(this.spawnWidthValue, f, this.spawnWidthDiff, this.spawnWidth);
        float fI2 = AbstractC3950lJ.i(this.spawnHeightValue, f, this.spawnHeightDiff, this.spawnHeight);
        float fI3 = AbstractC3950lJ.i(this.spawnDepthValue, f, this.spawnDepthDiff, this.spawnDepth);
        float fRandom2 = MathUtils.random(fI2) - (fI2 / 2.0f);
        if (this.edges) {
            fRandom = fI / 2.0f;
        } else {
            fRandom = MathUtils.random(fI) / 2.0f;
            fI3 = MathUtils.random(fI3);
        }
        float f2 = fI3 / 2.0f;
        float fRandom3 = 0.0f;
        boolean z = fRandom == 0.0f;
        boolean z2 = f2 == 0.0f;
        if (!z && !z2) {
            fRandom3 = MathUtils.random(360.0f);
        } else if (z) {
            fRandom3 = MathUtils.random(1) == 0 ? -90.0f : 90.0f;
        } else if (z2 && MathUtils.random(1) != 0) {
            fRandom3 = 180.0f;
        }
        vector3.set(MathUtils.cosDeg(fRandom3) * fRandom, fRandom2, MathUtils.sinDeg(fRandom3) * f2);
    }

    public CylinderSpawnShapeValue() {
    }
}
