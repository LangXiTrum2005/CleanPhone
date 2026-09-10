package com.badlogic.gdx.graphics.g3d.particles.values;

import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Vector3;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3950lJ;

/* JADX INFO: loaded from: classes.dex */
public final class RectangleSpawnShapeValue extends PrimitiveSpawnShapeValue {
    public RectangleSpawnShapeValue(RectangleSpawnShapeValue rectangleSpawnShapeValue) {
        super(rectangleSpawnShapeValue);
        load(rectangleSpawnShapeValue);
    }

    @Override // com.badlogic.gdx.graphics.g3d.particles.values.SpawnShapeValue
    public SpawnShapeValue copy() {
        return new RectangleSpawnShapeValue(this);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0047 A[PHI: r0 r1
  0x0047: PHI (r0v20 float) = (r0v10 float), (r0v22 float) binds: [B:43:0x009f, B:15:0x0045] A[DONT_GENERATE, DONT_INLINE]
  0x0047: PHI (r1v15 float) = (r1v5 float), (r1v19 float) binds: [B:43:0x009f, B:15:0x0045] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.badlogic.gdx.graphics.g3d.particles.values.SpawnShapeValue
    public void spawnAux(Vector3 vector3, float f) {
        float fRandom;
        float fRandom2;
        float fRandom3;
        float f2;
        float f3 = this.spawnWidth;
        float fI = AbstractC3950lJ.i(this.spawnWidthValue, f, this.spawnWidthDiff, f3);
        float f4 = this.spawnHeight;
        float fI2 = AbstractC3950lJ.i(this.spawnHeightValue, f, this.spawnHeightDiff, f4);
        float f5 = this.spawnDepth;
        float fI3 = AbstractC3950lJ.i(this.spawnDepthValue, f, this.spawnDepthDiff, f5);
        if (!this.edges) {
            vector3.x = MathUtils.random(fI) - (fI / 2.0f);
            vector3.y = MathUtils.random(fI2) - (fI2 / 2.0f);
            vector3.z = MathUtils.random(fI3) - (fI3 / 2.0f);
            return;
        }
        int iRandom = MathUtils.random(-1, 1);
        if (iRandom == -1) {
            if (MathUtils.random(1) == 0) {
                fI = -fI;
            }
            fRandom2 = fI / 2.0f;
            if (fRandom2 == 0.0f) {
                if (MathUtils.random(1) == 0) {
                    fI2 = -fI2;
                }
                fRandom = fI2 / 2.0f;
                if (MathUtils.random(1) == 0) {
                    fI3 = -fI3;
                }
                f2 = fI3 / 2.0f;
            } else {
                fRandom = MathUtils.random(fI2) - (fI2 / 2.0f);
                fRandom3 = MathUtils.random(fI3);
                f2 = fRandom3 - (fI3 / 2.0f);
            }
        } else if (iRandom == 0) {
            if (MathUtils.random(1) == 0) {
                fI3 = -fI3;
            }
            f2 = fI3 / 2.0f;
            if (f2 == 0.0f) {
                if (MathUtils.random(1) == 0) {
                    fI2 = -fI2;
                }
                fRandom = fI2 / 2.0f;
                if (MathUtils.random(1) == 0) {
                    fI = -fI;
                }
                fRandom2 = fI / 2.0f;
            } else {
                fRandom = MathUtils.random(fI2) - (fI2 / 2.0f);
                fRandom2 = MathUtils.random(fI) - (fI / 2.0f);
            }
        } else {
            if (MathUtils.random(1) == 0) {
                fI2 = -fI2;
            }
            fRandom = fI2 / 2.0f;
            if (fRandom == 0.0f) {
                if (MathUtils.random(1) == 0) {
                    fI = -fI;
                }
                fRandom2 = fI / 2.0f;
                if (MathUtils.random(1) == 0) {
                    fI3 = -fI3;
                }
                f2 = fI3 / 2.0f;
            } else {
                fRandom2 = MathUtils.random(fI) - (fI / 2.0f);
                fRandom3 = MathUtils.random(fI3);
                f2 = fRandom3 - (fI3 / 2.0f);
            }
        }
        vector3.x = fRandom2;
        vector3.y = fRandom;
        vector3.z = f2;
    }

    public RectangleSpawnShapeValue() {
    }
}
