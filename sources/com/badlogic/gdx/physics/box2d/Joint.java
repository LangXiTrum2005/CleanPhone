package com.badlogic.gdx.physics.box2d;

import com.badlogic.gdx.math.Vector2;

/* JADX INFO: loaded from: classes.dex */
public abstract class Joint {
    protected long addr;
    protected JointEdge jointEdgeA;
    protected JointEdge jointEdgeB;
    private Object userData;
    private final World world;
    private final float[] tmp = new float[2];
    private final Vector2 anchorA = new Vector2();
    private final Vector2 anchorB = new Vector2();
    private final Vector2 reactionForce = new Vector2();

    public Joint(World world, long j) {
        this.world = world;
        this.addr = j;
    }

    private native void jniGetAnchorA(long j, float[] fArr);

    private native void jniGetAnchorB(long j, float[] fArr);

    private native long jniGetBodyA(long j);

    private native long jniGetBodyB(long j);

    private native boolean jniGetCollideConnected(long j);

    private native void jniGetReactionForce(long j, float f, float[] fArr);

    private native float jniGetReactionTorque(long j, float f);

    private native int jniGetType(long j);

    private native boolean jniIsActive(long j);

    public Vector2 getAnchorA() {
        jniGetAnchorA(this.addr, this.tmp);
        Vector2 vector2 = this.anchorA;
        float[] fArr = this.tmp;
        vector2.x = fArr[0];
        vector2.y = fArr[1];
        return vector2;
    }

    public Vector2 getAnchorB() {
        jniGetAnchorB(this.addr, this.tmp);
        Vector2 vector2 = this.anchorB;
        float[] fArr = this.tmp;
        vector2.x = fArr[0];
        vector2.y = fArr[1];
        return vector2;
    }

    public Body getBodyA() {
        return this.world.bodies.get(jniGetBodyA(this.addr));
    }

    public Body getBodyB() {
        return this.world.bodies.get(jniGetBodyB(this.addr));
    }

    public boolean getCollideConnected() {
        return jniGetCollideConnected(this.addr);
    }

    public Vector2 getReactionForce(float f) {
        jniGetReactionForce(this.addr, f, this.tmp);
        Vector2 vector2 = this.reactionForce;
        float[] fArr = this.tmp;
        vector2.x = fArr[0];
        vector2.y = fArr[1];
        return vector2;
    }

    public float getReactionTorque(float f) {
        return jniGetReactionTorque(this.addr, f);
    }

    public JointDef.JointType getType() {
        int iJniGetType = jniGetType(this.addr);
        if (iJniGetType > 0) {
            JointDef.JointType[] jointTypeArr = JointDef.JointType.valueTypes;
            if (iJniGetType < jointTypeArr.length) {
                return jointTypeArr[iJniGetType];
            }
        }
        return JointDef.JointType.Unknown;
    }

    public Object getUserData() {
        return this.userData;
    }

    public boolean isActive() {
        return jniIsActive(this.addr);
    }

    public void setUserData(Object obj) {
        this.userData = obj;
    }
}
