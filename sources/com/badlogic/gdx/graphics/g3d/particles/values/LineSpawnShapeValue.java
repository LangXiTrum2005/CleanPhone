package com.badlogic.gdx.graphics.g3d.particles.values;

import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Vector3;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3950lJ;

/* JADX INFO: loaded from: classes.dex */
public final class LineSpawnShapeValue extends PrimitiveSpawnShapeValue {
    public LineSpawnShapeValue(LineSpawnShapeValue lineSpawnShapeValue) {
        super(lineSpawnShapeValue);
        load(lineSpawnShapeValue);
    }

    @Override // com.badlogic.gdx.graphics.g3d.particles.values.SpawnShapeValue
    public SpawnShapeValue copy() {
        return new LineSpawnShapeValue(this);
    }

    @Override // com.badlogic.gdx.graphics.g3d.particles.values.SpawnShapeValue
    public void spawnAux(Vector3 vector3, float f) {
        float f2 = this.spawnWidth;
        float fI = AbstractC3950lJ.i(this.spawnWidthValue, f, this.spawnWidthDiff, f2);
        float f3 = this.spawnHeight;
        float fI2 = AbstractC3950lJ.i(this.spawnHeightValue, f, this.spawnHeightDiff, f3);
        float f4 = this.spawnDepth;
        float fI3 = AbstractC3950lJ.i(this.spawnDepthValue, f, this.spawnDepthDiff, f4);
        float fRandom = MathUtils.random();
        vector3.x = fI * fRandom;
        vector3.y = fI2 * fRandom;
        vector3.z = fRandom * fI3;
    }

    public LineSpawnShapeValue() {
    }
}
