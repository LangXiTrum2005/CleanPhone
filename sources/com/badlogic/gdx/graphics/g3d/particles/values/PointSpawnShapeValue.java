package com.badlogic.gdx.graphics.g3d.particles.values;

import com.badlogic.gdx.math.Vector3;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3950lJ;

/* JADX INFO: loaded from: classes.dex */
public final class PointSpawnShapeValue extends PrimitiveSpawnShapeValue {
    public PointSpawnShapeValue(PointSpawnShapeValue pointSpawnShapeValue) {
        super(pointSpawnShapeValue);
        load(pointSpawnShapeValue);
    }

    @Override // com.badlogic.gdx.graphics.g3d.particles.values.SpawnShapeValue
    public SpawnShapeValue copy() {
        return new PointSpawnShapeValue(this);
    }

    @Override // com.badlogic.gdx.graphics.g3d.particles.values.SpawnShapeValue
    public void spawnAux(Vector3 vector3, float f) {
        float f2 = this.spawnWidth;
        vector3.x = AbstractC3950lJ.i(this.spawnWidthValue, f, this.spawnWidthDiff, f2);
        float f3 = this.spawnHeight;
        vector3.y = AbstractC3950lJ.i(this.spawnHeightValue, f, this.spawnHeightDiff, f3);
        float f4 = this.spawnDepth;
        vector3.z = AbstractC3950lJ.i(this.spawnDepthValue, f, this.spawnDepthDiff, f4);
    }

    public PointSpawnShapeValue() {
    }
}
