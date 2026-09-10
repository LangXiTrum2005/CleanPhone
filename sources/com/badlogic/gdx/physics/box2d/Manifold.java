package com.badlogic.gdx.physics.box2d;

import com.badlogic.gdx.math.Vector2;

/* JADX INFO: loaded from: classes.dex */
public class Manifold {
    long addr;
    final ManifoldPoint[] points = {new ManifoldPoint(), new ManifoldPoint()};
    final Vector2 localNormal = new Vector2();
    final Vector2 localPoint = new Vector2();
    final int[] tmpInt = new int[2];
    final float[] tmpFloat = new float[4];

    public class ManifoldPoint {
        public float normalImpulse;
        public float tangentImpulse;
        public final Vector2 localPoint = new Vector2();
        public int contactID = 0;

        public ManifoldPoint() {
        }

        public String toString() {
            return "id: " + this.contactID + ", " + this.localPoint + ", " + this.normalImpulse + ", " + this.tangentImpulse;
        }
    }

    public enum ManifoldType {
        Circle,
        FaceA,
        FaceB
    }

    public Manifold(long j) {
        this.addr = j;
    }

    private native void jniGetLocalNormal(long j, float[] fArr);

    private native void jniGetLocalPoint(long j, float[] fArr);

    private native int jniGetPoint(long j, float[] fArr, int i);

    private native int jniGetPointCount(long j);

    private native int jniGetType(long j);

    public Vector2 getLocalNormal() {
        jniGetLocalNormal(this.addr, this.tmpFloat);
        Vector2 vector2 = this.localNormal;
        float[] fArr = this.tmpFloat;
        vector2.set(fArr[0], fArr[1]);
        return this.localNormal;
    }

    public Vector2 getLocalPoint() {
        jniGetLocalPoint(this.addr, this.tmpFloat);
        Vector2 vector2 = this.localPoint;
        float[] fArr = this.tmpFloat;
        vector2.set(fArr[0], fArr[1]);
        return this.localPoint;
    }

    public int getPointCount() {
        return jniGetPointCount(this.addr);
    }

    public ManifoldPoint[] getPoints() {
        int iJniGetPointCount = jniGetPointCount(this.addr);
        for (int i = 0; i < iJniGetPointCount; i++) {
            int iJniGetPoint = jniGetPoint(this.addr, this.tmpFloat, i);
            ManifoldPoint manifoldPoint = this.points[i];
            manifoldPoint.contactID = iJniGetPoint;
            Vector2 vector2 = manifoldPoint.localPoint;
            float[] fArr = this.tmpFloat;
            vector2.set(fArr[0], fArr[1]);
            float[] fArr2 = this.tmpFloat;
            manifoldPoint.normalImpulse = fArr2[2];
            manifoldPoint.tangentImpulse = fArr2[3];
        }
        return this.points;
    }

    public ManifoldType getType() {
        int iJniGetType = jniGetType(this.addr);
        if (iJniGetType == 0) {
            return ManifoldType.Circle;
        }
        if (iJniGetType == 1) {
            return ManifoldType.FaceA;
        }
        return iJniGetType == 2 ? ManifoldType.FaceB : ManifoldType.Circle;
    }
}
