package com.badlogic.gdx.physics.box2d;

import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.BufferUtils;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes.dex */
public class Body {
    protected long addr;
    private Array<Fixture> fixtures;
    protected Array<JointEdge> joints;
    public final Vector2 linVelLoc;
    public final Vector2 linVelWorld;
    private final Vector2 linearVelocity;
    private final Vector2 localCenter;
    private final Vector2 localPoint;
    public final Vector2 localPoint2;
    public final Vector2 localVector;
    private final MassData massData;
    private final Vector2 position;
    private final float[] tmp = new float[4];
    private final ByteBuffer tmpBuff;
    private final long tmpBuffAddress;
    private final Transform transform;
    private Object userData;
    private final World world;
    private final Vector2 worldCenter;
    private final Vector2 worldVector;

    public Body(World world, long j) {
        ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(8).order(ByteOrder.nativeOrder());
        this.tmpBuff = byteBufferOrder;
        this.tmpBuffAddress = BufferUtils.getUnsafeBufferAddress(byteBufferOrder);
        this.fixtures = new Array<>(2);
        this.joints = new Array<>(2);
        this.transform = new Transform();
        this.position = new Vector2();
        this.worldCenter = new Vector2();
        this.localCenter = new Vector2();
        this.linearVelocity = new Vector2();
        this.massData = new MassData();
        this.localPoint = new Vector2();
        this.worldVector = new Vector2();
        this.localPoint2 = new Vector2();
        this.localVector = new Vector2();
        this.linVelWorld = new Vector2();
        this.linVelLoc = new Vector2();
        this.world = world;
        this.addr = j;
    }

    private native void jniApplyAngularImpulse(long j, float f, boolean z);

    private native void jniApplyForce(long j, float f, float f2, float f3, float f4, boolean z);

    private native void jniApplyForceToCenter(long j, float f, float f2, boolean z);

    private native void jniApplyLinearImpulse(long j, float f, float f2, float f3, float f4, boolean z);

    private native void jniApplyTorque(long j, float f, boolean z);

    private native long jniCreateFixture(long j, long j2, float f);

    private native long jniCreateFixture(long j, long j2, float f, float f2, float f3, boolean z, short s, short s2, short s3);

    private native float jniGetAngle(long j);

    private native float jniGetAngularDamping(long j);

    private native float jniGetAngularVelocity(long j);

    private native float jniGetGravityScale(long j);

    private native float jniGetInertia(long j);

    private native float jniGetLinearDamping(long j);

    private native void jniGetLinearVelocity(long j, long j2);

    private native void jniGetLinearVelocityFromLocalPoint(long j, float f, float f2, long j2);

    private native void jniGetLinearVelocityFromWorldPoint(long j, float f, float f2, long j2);

    private native void jniGetLocalCenter(long j, long j2);

    private native void jniGetLocalPoint(long j, float f, float f2, long j2);

    private native void jniGetLocalVector(long j, float f, float f2, long j2);

    private native float jniGetMass(long j);

    private native void jniGetMassData(long j, float[] fArr);

    private native void jniGetPosition(long j, long j2);

    private native void jniGetTransform(long j, float[] fArr);

    private native int jniGetType(long j);

    private native void jniGetWorldCenter(long j, long j2);

    private native void jniGetWorldPoint(long j, float f, float f2, long j2);

    private native void jniGetWorldVector(long j, float f, float f2, long j2);

    private native boolean jniIsActive(long j);

    private native boolean jniIsAwake(long j);

    private native boolean jniIsBullet(long j);

    private native boolean jniIsFixedRotation(long j);

    private native boolean jniIsSleepingAllowed(long j);

    private native void jniResetMassData(long j);

    private native void jniSetActive(long j, boolean z);

    private native void jniSetAngularDamping(long j, float f);

    private native void jniSetAngularVelocity(long j, float f);

    private native void jniSetAwake(long j, boolean z);

    private native void jniSetBullet(long j, boolean z);

    private native void jniSetFixedRotation(long j, boolean z);

    private native void jniSetGravityScale(long j, float f);

    private native void jniSetLinearDamping(long j, float f);

    private native void jniSetLinearVelocity(long j, float f, float f2);

    private native void jniSetMassData(long j, float f, float f2, float f3, float f4);

    private native void jniSetSleepingAllowed(long j, boolean z);

    private native void jniSetTransform(long j, float f, float f2, float f3);

    private native void jniSetType(long j, int i);

    public void applyAngularImpulse(float f, boolean z) {
        jniApplyAngularImpulse(this.addr, f, z);
    }

    public void applyForce(Vector2 vector2, Vector2 vector3, boolean z) {
        jniApplyForce(this.addr, vector2.x, vector2.y, vector3.x, vector3.y, z);
    }

    public void applyForceToCenter(Vector2 vector2, boolean z) {
        jniApplyForceToCenter(this.addr, vector2.x, vector2.y, z);
    }

    public void applyLinearImpulse(Vector2 vector2, Vector2 vector3, boolean z) {
        jniApplyLinearImpulse(this.addr, vector2.x, vector2.y, vector3.x, vector3.y, z);
    }

    public void applyTorque(float f, boolean z) {
        jniApplyTorque(this.addr, f, z);
    }

    public Fixture createFixture(FixtureDef fixtureDef) {
        long j = this.addr;
        long j2 = fixtureDef.shape.addr;
        float f = fixtureDef.friction;
        float f2 = fixtureDef.restitution;
        float f3 = fixtureDef.density;
        boolean z = fixtureDef.isSensor;
        Filter filter = fixtureDef.filter;
        long jJniCreateFixture = jniCreateFixture(j, j2, f, f2, f3, z, filter.categoryBits, filter.maskBits, filter.groupIndex);
        Fixture fixtureObtain = this.world.freeFixtures.obtain();
        fixtureObtain.reset(this, jJniCreateFixture);
        this.world.fixtures.put(fixtureObtain.addr, fixtureObtain);
        this.fixtures.add(fixtureObtain);
        return fixtureObtain;
    }

    public void destroyFixture(Fixture fixture) {
        this.world.destroyFixture(this, fixture);
        fixture.setUserData(null);
        this.world.fixtures.remove(fixture.addr);
        this.fixtures.removeValue(fixture, true);
        this.world.freeFixtures.free(fixture);
    }

    public float getAngle() {
        return jniGetAngle(this.addr);
    }

    public float getAngularDamping() {
        return jniGetAngularDamping(this.addr);
    }

    public float getAngularVelocity() {
        return jniGetAngularVelocity(this.addr);
    }

    public Array<Fixture> getFixtureList() {
        return this.fixtures;
    }

    public float getGravityScale() {
        return jniGetGravityScale(this.addr);
    }

    public float getInertia() {
        return jniGetInertia(this.addr);
    }

    public Array<JointEdge> getJointList() {
        return this.joints;
    }

    public float getLinearDamping() {
        return jniGetLinearDamping(this.addr);
    }

    public Vector2 getLinearVelocity() {
        jniGetLinearVelocity(this.addr, this.tmpBuffAddress);
        this.linearVelocity.x = this.tmpBuff.getFloat(0);
        this.linearVelocity.y = this.tmpBuff.getFloat(4);
        return this.linearVelocity;
    }

    public Vector2 getLinearVelocityFromLocalPoint(Vector2 vector2) {
        jniGetLinearVelocityFromLocalPoint(this.addr, vector2.x, vector2.y, this.tmpBuffAddress);
        this.linVelLoc.x = this.tmpBuff.getFloat(0);
        this.linVelLoc.y = this.tmpBuff.getFloat(4);
        return this.linVelLoc;
    }

    public Vector2 getLinearVelocityFromWorldPoint(Vector2 vector2) {
        jniGetLinearVelocityFromWorldPoint(this.addr, vector2.x, vector2.y, this.tmpBuffAddress);
        this.linVelWorld.x = this.tmpBuff.getFloat(0);
        this.linVelWorld.y = this.tmpBuff.getFloat(4);
        return this.linVelWorld;
    }

    public Vector2 getLocalCenter() {
        jniGetLocalCenter(this.addr, this.tmpBuffAddress);
        this.localCenter.x = this.tmpBuff.getFloat(0);
        this.localCenter.y = this.tmpBuff.getFloat(4);
        return this.localCenter;
    }

    public Vector2 getLocalPoint(Vector2 vector2) {
        jniGetLocalPoint(this.addr, vector2.x, vector2.y, this.tmpBuffAddress);
        this.localPoint2.x = this.tmpBuff.getFloat(0);
        this.localPoint2.y = this.tmpBuff.getFloat(4);
        return this.localPoint2;
    }

    public Vector2 getLocalVector(Vector2 vector2) {
        jniGetLocalVector(this.addr, vector2.x, vector2.y, this.tmpBuffAddress);
        this.localVector.x = this.tmpBuff.getFloat(0);
        this.localVector.y = this.tmpBuff.getFloat(4);
        return this.localVector;
    }

    public float getMass() {
        return jniGetMass(this.addr);
    }

    public MassData getMassData() {
        jniGetMassData(this.addr, this.tmp);
        MassData massData = this.massData;
        float[] fArr = this.tmp;
        massData.mass = fArr[0];
        Vector2 vector2 = massData.center;
        vector2.x = fArr[1];
        vector2.y = fArr[2];
        massData.I = fArr[3];
        return massData;
    }

    public Vector2 getPosition() {
        jniGetPosition(this.addr, this.tmpBuffAddress);
        this.position.x = this.tmpBuff.getFloat(0);
        this.position.y = this.tmpBuff.getFloat(4);
        return this.position;
    }

    public Transform getTransform() {
        jniGetTransform(this.addr, this.transform.vals);
        return this.transform;
    }

    public BodyDef.BodyType getType() {
        int iJniGetType = jniGetType(this.addr);
        if (iJniGetType == 0) {
            return BodyDef.BodyType.StaticBody;
        }
        if (iJniGetType == 1) {
            return BodyDef.BodyType.KinematicBody;
        }
        return iJniGetType == 2 ? BodyDef.BodyType.DynamicBody : BodyDef.BodyType.StaticBody;
    }

    public Object getUserData() {
        return this.userData;
    }

    public World getWorld() {
        return this.world;
    }

    public Vector2 getWorldCenter() {
        jniGetWorldCenter(this.addr, this.tmpBuffAddress);
        this.worldCenter.x = this.tmpBuff.getFloat(0);
        this.worldCenter.y = this.tmpBuff.getFloat(4);
        return this.worldCenter;
    }

    public Vector2 getWorldPoint(Vector2 vector2) {
        jniGetWorldPoint(this.addr, vector2.x, vector2.y, this.tmpBuffAddress);
        this.localPoint.x = this.tmpBuff.getFloat(0);
        this.localPoint.y = this.tmpBuff.getFloat(4);
        return this.localPoint;
    }

    public Vector2 getWorldVector(Vector2 vector2) {
        jniGetWorldVector(this.addr, vector2.x, vector2.y, this.tmpBuffAddress);
        this.worldVector.x = this.tmpBuff.getFloat(0);
        this.worldVector.y = this.tmpBuff.getFloat(4);
        return this.worldVector;
    }

    public boolean isActive() {
        return jniIsActive(this.addr);
    }

    public boolean isAwake() {
        return jniIsAwake(this.addr);
    }

    public boolean isBullet() {
        return jniIsBullet(this.addr);
    }

    public boolean isFixedRotation() {
        return jniIsFixedRotation(this.addr);
    }

    public boolean isSleepingAllowed() {
        return jniIsSleepingAllowed(this.addr);
    }

    public void reset(long j) {
        this.addr = j;
        this.userData = null;
        int i = 0;
        while (true) {
            Array<Fixture> array = this.fixtures;
            if (i >= array.size) {
                array.clear();
                this.joints.clear();
                return;
            } else {
                this.world.freeFixtures.free(array.get(i));
                i++;
            }
        }
    }

    public void resetMassData() {
        jniResetMassData(this.addr);
    }

    public void setActive(boolean z) {
        if (z) {
            jniSetActive(this.addr, z);
        } else {
            this.world.deactivateBody(this);
        }
    }

    public void setAngularDamping(float f) {
        jniSetAngularDamping(this.addr, f);
    }

    public void setAngularVelocity(float f) {
        jniSetAngularVelocity(this.addr, f);
    }

    public void setAwake(boolean z) {
        jniSetAwake(this.addr, z);
    }

    public void setBullet(boolean z) {
        jniSetBullet(this.addr, z);
    }

    public void setFixedRotation(boolean z) {
        jniSetFixedRotation(this.addr, z);
    }

    public void setGravityScale(float f) {
        jniSetGravityScale(this.addr, f);
    }

    public void setLinearDamping(float f) {
        jniSetLinearDamping(this.addr, f);
    }

    public void setLinearVelocity(Vector2 vector2) {
        jniSetLinearVelocity(this.addr, vector2.x, vector2.y);
    }

    public void setMassData(MassData massData) {
        long j = this.addr;
        float f = massData.mass;
        Vector2 vector2 = massData.center;
        jniSetMassData(j, f, vector2.x, vector2.y, massData.I);
    }

    public void setSleepingAllowed(boolean z) {
        jniSetSleepingAllowed(this.addr, z);
    }

    public void setTransform(Vector2 vector2, float f) {
        jniSetTransform(this.addr, vector2.x, vector2.y, f);
    }

    public void setType(BodyDef.BodyType bodyType) {
        jniSetType(this.addr, bodyType.getValue());
    }

    public void setUserData(Object obj) {
        this.userData = obj;
    }

    public void applyForce(float f, float f2, float f3, float f4, boolean z) {
        jniApplyForce(this.addr, f, f2, f3, f4, z);
    }

    public void applyForceToCenter(float f, float f2, boolean z) {
        jniApplyForceToCenter(this.addr, f, f2, z);
    }

    public void applyLinearImpulse(float f, float f2, float f3, float f4, boolean z) {
        jniApplyLinearImpulse(this.addr, f, f2, f3, f4, z);
    }

    public void setLinearVelocity(float f, float f2) {
        jniSetLinearVelocity(this.addr, f, f2);
    }

    public void setTransform(float f, float f2, float f3) {
        jniSetTransform(this.addr, f, f2, f3);
    }

    public Fixture createFixture(Shape shape, float f) {
        long jJniCreateFixture = jniCreateFixture(this.addr, shape.addr, f);
        Fixture fixtureObtain = this.world.freeFixtures.obtain();
        fixtureObtain.reset(this, jJniCreateFixture);
        this.world.fixtures.put(fixtureObtain.addr, fixtureObtain);
        this.fixtures.add(fixtureObtain);
        return fixtureObtain;
    }
}
