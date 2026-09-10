package com.badlogic.gdx.physics.box2d;

import com.badlogic.gdx.math.Vector2;

/* JADX INFO: loaded from: classes.dex */
public class EdgeShape extends Shape {
    static final float[] vertex = new float[2];

    public EdgeShape() {
        this.addr = newEdgeShape();
    }

    private native void jniGetVertex0(long j, float[] fArr);

    private native void jniGetVertex1(long j, float[] fArr);

    private native void jniGetVertex2(long j, float[] fArr);

    private native void jniGetVertex3(long j, float[] fArr);

    private native boolean jniHasVertex0(long j);

    private native boolean jniHasVertex3(long j);

    private native void jniSet(long j, float f, float f2, float f3, float f4);

    private native void jniSetHasVertex0(long j, boolean z);

    private native void jniSetHasVertex3(long j, boolean z);

    private native void jniSetVertex0(long j, float f, float f2);

    private native void jniSetVertex3(long j, float f, float f2);

    private native long newEdgeShape();

    @Override // com.badlogic.gdx.physics.box2d.Shape
    public Shape.Type getType() {
        return Shape.Type.Edge;
    }

    public void getVertex0(Vector2 vector2) {
        long j = this.addr;
        float[] fArr = vertex;
        jniGetVertex0(j, fArr);
        vector2.x = fArr[0];
        vector2.y = fArr[1];
    }

    public void getVertex1(Vector2 vector2) {
        long j = this.addr;
        float[] fArr = vertex;
        jniGetVertex1(j, fArr);
        vector2.x = fArr[0];
        vector2.y = fArr[1];
    }

    public void getVertex2(Vector2 vector2) {
        long j = this.addr;
        float[] fArr = vertex;
        jniGetVertex2(j, fArr);
        vector2.x = fArr[0];
        vector2.y = fArr[1];
    }

    public void getVertex3(Vector2 vector2) {
        long j = this.addr;
        float[] fArr = vertex;
        jniGetVertex3(j, fArr);
        vector2.x = fArr[0];
        vector2.y = fArr[1];
    }

    public boolean hasVertex0() {
        return jniHasVertex0(this.addr);
    }

    public boolean hasVertex3() {
        return jniHasVertex3(this.addr);
    }

    public void set(Vector2 vector2, Vector2 vector3) {
        set(vector2.x, vector2.y, vector3.x, vector3.y);
    }

    public void setHasVertex0(boolean z) {
        jniSetHasVertex0(this.addr, z);
    }

    public void setHasVertex3(boolean z) {
        jniSetHasVertex3(this.addr, z);
    }

    public void setVertex0(Vector2 vector2) {
        jniSetVertex0(this.addr, vector2.x, vector2.y);
    }

    public void setVertex3(Vector2 vector2) {
        jniSetVertex3(this.addr, vector2.x, vector2.y);
    }

    public void set(float f, float f2, float f3, float f4) {
        jniSet(this.addr, f, f2, f3, f4);
    }

    public void setVertex0(float f, float f2) {
        jniSetVertex0(this.addr, f, f2);
    }

    public void setVertex3(float f, float f2) {
        jniSetVertex3(this.addr, f, f2);
    }

    public EdgeShape(long j) {
        this.addr = j;
    }
}
