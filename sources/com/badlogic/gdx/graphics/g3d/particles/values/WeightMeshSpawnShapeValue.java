package com.badlogic.gdx.graphics.g3d.particles.values;

import com.badlogic.gdx.graphics.VertexAttributes;
import com.badlogic.gdx.math.CumulativeDistribution;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Vector3;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;

/* JADX INFO: loaded from: classes.dex */
public final class WeightMeshSpawnShapeValue extends MeshSpawnShapeValue {
    private CumulativeDistribution<MeshSpawnShapeValue.Triangle> distribution;

    public WeightMeshSpawnShapeValue(WeightMeshSpawnShapeValue weightMeshSpawnShapeValue) {
        super(weightMeshSpawnShapeValue);
        this.distribution = new CumulativeDistribution<>();
        load(weightMeshSpawnShapeValue);
    }

    public void calculateWeights() {
        this.distribution.clear();
        VertexAttributes vertexAttributes = this.mesh.getVertexAttributes();
        int numIndices = this.mesh.getNumIndices();
        int numVertices = this.mesh.getNumVertices();
        short s = (short) (vertexAttributes.vertexSize / 4);
        short s2 = (short) (vertexAttributes.findByUsage(1).offset / 4);
        float[] fArr = new float[numVertices * s];
        this.mesh.getVertices(fArr);
        int i = 0;
        if (numIndices > 0) {
            short[] sArr = new short[numIndices];
            this.mesh.getIndices(sArr);
            while (i < numIndices) {
                int i2 = (sArr[i] * s) + s2;
                int i3 = (sArr[i + 1] * s) + s2;
                int i4 = (sArr[i + 2] * s) + s2;
                float f = fArr[i2];
                float f2 = fArr[i2 + 1];
                float f3 = fArr[i2 + 2];
                float f4 = fArr[i3];
                float f5 = fArr[i3 + 1];
                float f6 = fArr[i3 + 2];
                float f7 = fArr[i4];
                float f8 = fArr[i4 + 1];
                float f9 = fArr[i4 + 2];
                this.distribution.add(new MeshSpawnShapeValue.Triangle(f, f2, f3, f4, f5, f6, f7, f8, f9), Math.abs((((f2 - f5) * f7) + AbstractC5044xl.w(f8, f2, f4, (f5 - f8) * f)) / 2.0f));
                i += 3;
            }
        } else {
            while (i < numVertices) {
                int i5 = i + s2;
                int i6 = i5 + s;
                int i7 = i6 + s;
                float f10 = fArr[i5];
                float f11 = fArr[i5 + 1];
                float f12 = fArr[i5 + 2];
                float f13 = fArr[i6];
                float f14 = fArr[i6 + 1];
                float f15 = fArr[i6 + 2];
                float f16 = fArr[i7];
                float f17 = fArr[i7 + 1];
                float f18 = fArr[i7 + 2];
                this.distribution.add(new MeshSpawnShapeValue.Triangle(f10, f11, f12, f13, f14, f15, f16, f17, f18), Math.abs((((f11 - f14) * f16) + AbstractC5044xl.w(f17, f11, f13, (f14 - f17) * f10)) / 2.0f));
                i += s;
            }
        }
        this.distribution.generateNormalized();
    }

    @Override // com.badlogic.gdx.graphics.g3d.particles.values.SpawnShapeValue
    public SpawnShapeValue copy() {
        return new WeightMeshSpawnShapeValue(this);
    }

    @Override // com.badlogic.gdx.graphics.g3d.particles.values.SpawnShapeValue
    public void init() {
        calculateWeights();
    }

    @Override // com.badlogic.gdx.graphics.g3d.particles.values.SpawnShapeValue
    public void spawnAux(Vector3 vector3, float f) {
        MeshSpawnShapeValue.Triangle triangleValue = this.distribution.value();
        float fRandom = MathUtils.random();
        float fRandom2 = MathUtils.random();
        float f2 = triangleValue.x1;
        float fW = AbstractC5044xl.w(triangleValue.x3, f2, fRandom2, AbstractC5044xl.w(triangleValue.x2, f2, fRandom, f2));
        float f3 = triangleValue.y1;
        float fW2 = AbstractC5044xl.w(triangleValue.y3, f3, fRandom2, AbstractC5044xl.w(triangleValue.y2, f3, fRandom, f3));
        float f4 = triangleValue.z1;
        vector3.set(fW, fW2, AbstractC5044xl.w(triangleValue.z3, f4, fRandom2, AbstractC5044xl.w(triangleValue.z2, f4, fRandom, f4)));
    }

    public WeightMeshSpawnShapeValue() {
        this.distribution = new CumulativeDistribution<>();
    }
}
