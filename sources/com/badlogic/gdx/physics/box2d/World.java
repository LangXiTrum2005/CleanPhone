package com.badlogic.gdx.physics.box2d;

import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.joints.DistanceJoint;
import com.badlogic.gdx.physics.box2d.joints.DistanceJointDef;
import com.badlogic.gdx.physics.box2d.joints.FrictionJoint;
import com.badlogic.gdx.physics.box2d.joints.FrictionJointDef;
import com.badlogic.gdx.physics.box2d.joints.GearJoint;
import com.badlogic.gdx.physics.box2d.joints.GearJointDef;
import com.badlogic.gdx.physics.box2d.joints.MotorJoint;
import com.badlogic.gdx.physics.box2d.joints.MotorJointDef;
import com.badlogic.gdx.physics.box2d.joints.MouseJoint;
import com.badlogic.gdx.physics.box2d.joints.MouseJointDef;
import com.badlogic.gdx.physics.box2d.joints.PrismaticJoint;
import com.badlogic.gdx.physics.box2d.joints.PrismaticJointDef;
import com.badlogic.gdx.physics.box2d.joints.PulleyJoint;
import com.badlogic.gdx.physics.box2d.joints.PulleyJointDef;
import com.badlogic.gdx.physics.box2d.joints.RevoluteJoint;
import com.badlogic.gdx.physics.box2d.joints.RevoluteJointDef;
import com.badlogic.gdx.physics.box2d.joints.RopeJoint;
import com.badlogic.gdx.physics.box2d.joints.RopeJointDef;
import com.badlogic.gdx.physics.box2d.joints.WeldJoint;
import com.badlogic.gdx.physics.box2d.joints.WeldJointDef;
import com.badlogic.gdx.physics.box2d.joints.WheelJoint;
import com.badlogic.gdx.physics.box2d.joints.WheelJointDef;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.Disposable;
import com.badlogic.gdx.utils.GdxRuntimeException;
import com.badlogic.gdx.utils.LongMap;
import com.badlogic.gdx.utils.Pool;
import com.badlogic.gdx.utils.SharedLibraryLoader;

/* JADX INFO: loaded from: classes.dex */
public final class World implements Disposable {
    protected final long addr;
    private final Contact contact;
    private final Array<Contact> contacts;
    protected final Pool<Body> freeBodies;
    private final Array<Contact> freeContacts;
    protected final Pool<Fixture> freeFixtures;
    private final ContactImpulse impulse;
    private final Manifold manifold;
    private RayCastCallback rayCastCallback;
    private Vector2 rayNormal;
    private Vector2 rayPoint;
    private boolean useDefaultContactFilter;
    protected final LongMap<Body> bodies = new LongMap<>(100);
    protected final LongMap<Fixture> fixtures = new LongMap<>(100);
    protected final LongMap<Joint> joints = new LongMap<>(100);
    protected ContactFilter contactFilter = null;
    protected ContactListener contactListener = null;
    final float[] tmpGravity = new float[2];
    final Vector2 gravity = new Vector2();
    private QueryCallback queryCallback = null;
    private long[] contactAddrs = new long[200];

    static {
        new SharedLibraryLoader().load("gdx-box2d");
    }

    public World(Vector2 vector2, boolean z) {
        int i = 100;
        int i2 = 200;
        this.freeBodies = new Pool<Body>(i, i2) { // from class: com.badlogic.gdx.physics.box2d.World.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.badlogic.gdx.utils.Pool
            public Body newObject() {
                return new Body(World.this, 0L);
            }
        };
        this.freeFixtures = new Pool<Fixture>(i, i2) { // from class: com.badlogic.gdx.physics.box2d.World.2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.badlogic.gdx.utils.Pool
            public Fixture newObject() {
                return new Fixture(null, 0L);
            }
        };
        Array<Contact> array = new Array<>();
        this.contacts = array;
        Array<Contact> array2 = new Array<>();
        this.freeContacts = array2;
        this.contact = new Contact(this, 0L);
        this.manifold = new Manifold(0L);
        this.impulse = new ContactImpulse(this, 0L);
        this.rayCastCallback = null;
        this.rayPoint = new Vector2();
        this.rayNormal = new Vector2();
        this.addr = newWorld(vector2.x, vector2.y, z);
        array.ensureCapacity(this.contactAddrs.length);
        array2.ensureCapacity(this.contactAddrs.length);
        for (int i3 = 0; i3 < this.contactAddrs.length; i3++) {
            this.freeContacts.add(new Contact(this, 0L));
        }
    }

    private void beginContact(long j) {
        ContactListener contactListener = this.contactListener;
        if (contactListener != null) {
            Contact contact = this.contact;
            contact.addr = j;
            contactListener.beginContact(contact);
        }
    }

    private boolean contactFilter(long j, long j2) {
        ContactFilter contactFilter = this.contactFilter;
        if (contactFilter != null) {
            return contactFilter.shouldCollide(this.fixtures.get(j), this.fixtures.get(j2));
        }
        Filter filterData = this.fixtures.get(j).getFilterData();
        Filter filterData2 = this.fixtures.get(j2).getFilterData();
        short s = filterData.groupIndex;
        if (s != filterData2.groupIndex || s == 0) {
            return ((filterData.maskBits & filterData2.categoryBits) == 0 || (filterData.categoryBits & filterData2.maskBits) == 0) ? false : true;
        }
        return s > 0;
    }

    private long createProperJoint(JointDef jointDef) {
        JointDef.JointType jointType = jointDef.type;
        if (jointType == JointDef.JointType.DistanceJoint) {
            DistanceJointDef distanceJointDef = (DistanceJointDef) jointDef;
            long j = this.addr;
            long j2 = distanceJointDef.bodyA.addr;
            long j3 = distanceJointDef.bodyB.addr;
            boolean z = distanceJointDef.collideConnected;
            Vector2 vector2 = distanceJointDef.localAnchorA;
            float f = vector2.x;
            float f2 = vector2.y;
            Vector2 vector3 = distanceJointDef.localAnchorB;
            return jniCreateDistanceJoint(j, j2, j3, z, f, f2, vector3.x, vector3.y, distanceJointDef.length, distanceJointDef.frequencyHz, distanceJointDef.dampingRatio);
        }
        if (jointType == JointDef.JointType.FrictionJoint) {
            FrictionJointDef frictionJointDef = (FrictionJointDef) jointDef;
            long j4 = this.addr;
            long j5 = frictionJointDef.bodyA.addr;
            long j6 = frictionJointDef.bodyB.addr;
            boolean z2 = frictionJointDef.collideConnected;
            Vector2 vector4 = frictionJointDef.localAnchorA;
            float f3 = vector4.x;
            float f4 = vector4.y;
            Vector2 vector5 = frictionJointDef.localAnchorB;
            return jniCreateFrictionJoint(j4, j5, j6, z2, f3, f4, vector5.x, vector5.y, frictionJointDef.maxForce, frictionJointDef.maxTorque);
        }
        if (jointType == JointDef.JointType.GearJoint) {
            GearJointDef gearJointDef = (GearJointDef) jointDef;
            return jniCreateGearJoint(this.addr, gearJointDef.bodyA.addr, gearJointDef.bodyB.addr, gearJointDef.collideConnected, gearJointDef.joint1.addr, gearJointDef.joint2.addr, gearJointDef.ratio);
        }
        if (jointType == JointDef.JointType.MotorJoint) {
            MotorJointDef motorJointDef = (MotorJointDef) jointDef;
            long j7 = this.addr;
            long j8 = motorJointDef.bodyA.addr;
            long j9 = motorJointDef.bodyB.addr;
            boolean z3 = motorJointDef.collideConnected;
            Vector2 vector6 = motorJointDef.linearOffset;
            return jniCreateMotorJoint(j7, j8, j9, z3, vector6.x, vector6.y, motorJointDef.angularOffset, motorJointDef.maxForce, motorJointDef.maxTorque, motorJointDef.correctionFactor);
        }
        if (jointType == JointDef.JointType.MouseJoint) {
            MouseJointDef mouseJointDef = (MouseJointDef) jointDef;
            long j10 = this.addr;
            long j11 = mouseJointDef.bodyA.addr;
            long j12 = mouseJointDef.bodyB.addr;
            boolean z4 = mouseJointDef.collideConnected;
            Vector2 vector7 = mouseJointDef.target;
            return jniCreateMouseJoint(j10, j11, j12, z4, vector7.x, vector7.y, mouseJointDef.maxForce, mouseJointDef.frequencyHz, mouseJointDef.dampingRatio);
        }
        if (jointType == JointDef.JointType.PrismaticJoint) {
            PrismaticJointDef prismaticJointDef = (PrismaticJointDef) jointDef;
            long j13 = this.addr;
            long j14 = prismaticJointDef.bodyA.addr;
            long j15 = prismaticJointDef.bodyB.addr;
            boolean z5 = prismaticJointDef.collideConnected;
            Vector2 vector8 = prismaticJointDef.localAnchorA;
            float f5 = vector8.x;
            float f6 = vector8.y;
            Vector2 vector9 = prismaticJointDef.localAnchorB;
            float f7 = vector9.x;
            float f8 = vector9.y;
            Vector2 vector10 = prismaticJointDef.localAxisA;
            return jniCreatePrismaticJoint(j13, j14, j15, z5, f5, f6, f7, f8, vector10.x, vector10.y, prismaticJointDef.referenceAngle, prismaticJointDef.enableLimit, prismaticJointDef.lowerTranslation, prismaticJointDef.upperTranslation, prismaticJointDef.enableMotor, prismaticJointDef.maxMotorForce, prismaticJointDef.motorSpeed);
        }
        if (jointType == JointDef.JointType.PulleyJoint) {
            PulleyJointDef pulleyJointDef = (PulleyJointDef) jointDef;
            long j16 = this.addr;
            long j17 = pulleyJointDef.bodyA.addr;
            long j18 = pulleyJointDef.bodyB.addr;
            boolean z6 = pulleyJointDef.collideConnected;
            Vector2 vector11 = pulleyJointDef.groundAnchorA;
            float f9 = vector11.x;
            float f10 = vector11.y;
            Vector2 vector12 = pulleyJointDef.groundAnchorB;
            float f11 = vector12.x;
            float f12 = vector12.y;
            Vector2 vector13 = pulleyJointDef.localAnchorA;
            float f13 = vector13.x;
            float f14 = vector13.y;
            Vector2 vector14 = pulleyJointDef.localAnchorB;
            return jniCreatePulleyJoint(j16, j17, j18, z6, f9, f10, f11, f12, f13, f14, vector14.x, vector14.y, pulleyJointDef.lengthA, pulleyJointDef.lengthB, pulleyJointDef.ratio);
        }
        if (jointType == JointDef.JointType.RevoluteJoint) {
            RevoluteJointDef revoluteJointDef = (RevoluteJointDef) jointDef;
            long j19 = this.addr;
            long j20 = revoluteJointDef.bodyA.addr;
            long j21 = revoluteJointDef.bodyB.addr;
            boolean z7 = revoluteJointDef.collideConnected;
            Vector2 vector15 = revoluteJointDef.localAnchorA;
            float f15 = vector15.x;
            float f16 = vector15.y;
            Vector2 vector16 = revoluteJointDef.localAnchorB;
            return jniCreateRevoluteJoint(j19, j20, j21, z7, f15, f16, vector16.x, vector16.y, revoluteJointDef.referenceAngle, revoluteJointDef.enableLimit, revoluteJointDef.lowerAngle, revoluteJointDef.upperAngle, revoluteJointDef.enableMotor, revoluteJointDef.motorSpeed, revoluteJointDef.maxMotorTorque);
        }
        if (jointType == JointDef.JointType.RopeJoint) {
            RopeJointDef ropeJointDef = (RopeJointDef) jointDef;
            long j22 = this.addr;
            long j23 = ropeJointDef.bodyA.addr;
            long j24 = ropeJointDef.bodyB.addr;
            boolean z8 = ropeJointDef.collideConnected;
            Vector2 vector17 = ropeJointDef.localAnchorA;
            float f17 = vector17.x;
            float f18 = vector17.y;
            Vector2 vector18 = ropeJointDef.localAnchorB;
            return jniCreateRopeJoint(j22, j23, j24, z8, f17, f18, vector18.x, vector18.y, ropeJointDef.maxLength);
        }
        if (jointType == JointDef.JointType.WeldJoint) {
            WeldJointDef weldJointDef = (WeldJointDef) jointDef;
            long j25 = this.addr;
            long j26 = weldJointDef.bodyA.addr;
            long j27 = weldJointDef.bodyB.addr;
            boolean z9 = weldJointDef.collideConnected;
            Vector2 vector19 = weldJointDef.localAnchorA;
            float f19 = vector19.x;
            float f20 = vector19.y;
            Vector2 vector20 = weldJointDef.localAnchorB;
            return jniCreateWeldJoint(j25, j26, j27, z9, f19, f20, vector20.x, vector20.y, weldJointDef.referenceAngle, weldJointDef.frequencyHz, weldJointDef.dampingRatio);
        }
        if (jointType != JointDef.JointType.WheelJoint) {
            return 0L;
        }
        WheelJointDef wheelJointDef = (WheelJointDef) jointDef;
        long j28 = this.addr;
        long j29 = wheelJointDef.bodyA.addr;
        long j30 = wheelJointDef.bodyB.addr;
        boolean z10 = wheelJointDef.collideConnected;
        Vector2 vector21 = wheelJointDef.localAnchorA;
        float f21 = vector21.x;
        float f22 = vector21.y;
        Vector2 vector22 = wheelJointDef.localAnchorB;
        float f23 = vector22.x;
        float f24 = vector22.y;
        Vector2 vector23 = wheelJointDef.localAxisA;
        return jniCreateWheelJoint(j28, j29, j30, z10, f21, f22, f23, f24, vector23.x, vector23.y, wheelJointDef.enableMotor, wheelJointDef.maxMotorTorque, wheelJointDef.motorSpeed, wheelJointDef.frequencyHz, wheelJointDef.dampingRatio);
    }

    private void endContact(long j) {
        ContactListener contactListener = this.contactListener;
        if (contactListener != null) {
            Contact contact = this.contact;
            contact.addr = j;
            contactListener.endContact(contact);
        }
    }

    private boolean getUseDefaultContactFilter() {
        return this.useDefaultContactFilter;
    }

    public static native float getVelocityThreshold();

    private native void jniClearForces(long j);

    private native long jniCreateBody(long j, int i, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, float f9);

    private native long jniCreateDistanceJoint(long j, long j2, long j3, boolean z, float f, float f2, float f3, float f4, float f5, float f6, float f7);

    private native long jniCreateFrictionJoint(long j, long j2, long j3, boolean z, float f, float f2, float f3, float f4, float f5, float f6);

    private native long jniCreateGearJoint(long j, long j2, long j3, boolean z, long j4, long j5, float f);

    private native long jniCreateMotorJoint(long j, long j2, long j3, boolean z, float f, float f2, float f3, float f4, float f5, float f6);

    private native long jniCreateMouseJoint(long j, long j2, long j3, boolean z, float f, float f2, float f3, float f4, float f5);

    private native long jniCreatePrismaticJoint(long j, long j2, long j3, boolean z, float f, float f2, float f3, float f4, float f5, float f6, float f7, boolean z2, float f8, float f9, boolean z3, float f10, float f11);

    private native long jniCreatePulleyJoint(long j, long j2, long j3, boolean z, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11);

    private native long jniCreateRevoluteJoint(long j, long j2, long j3, boolean z, float f, float f2, float f3, float f4, float f5, boolean z2, float f6, float f7, boolean z3, float f8, float f9);

    private native long jniCreateRopeJoint(long j, long j2, long j3, boolean z, float f, float f2, float f3, float f4, float f5);

    private native long jniCreateWeldJoint(long j, long j2, long j3, boolean z, float f, float f2, float f3, float f4, float f5, float f6, float f7);

    private native long jniCreateWheelJoint(long j, long j2, long j3, boolean z, float f, float f2, float f3, float f4, float f5, float f6, boolean z2, float f7, float f8, float f9, float f10);

    private native void jniDeactivateBody(long j, long j2);

    private native void jniDestroyBody(long j, long j2);

    private native void jniDestroyFixture(long j, long j2, long j3);

    private native void jniDestroyJoint(long j, long j2);

    private native void jniDispose(long j);

    private native boolean jniGetAutoClearForces(long j);

    private native int jniGetBodyCount(long j);

    private native int jniGetContactCount(long j);

    private native void jniGetContactList(long j, long[] jArr);

    private native void jniGetGravity(long j, float[] fArr);

    private native int jniGetJointcount(long j);

    private native int jniGetProxyCount(long j);

    private native boolean jniIsLocked(long j);

    private native void jniQueryAABB(long j, float f, float f2, float f3, float f4);

    private native void jniRayCast(long j, float f, float f2, float f3, float f4);

    private native void jniSetAutoClearForces(long j, boolean z);

    private native void jniSetContiousPhysics(long j, boolean z);

    private native void jniSetGravity(long j, float f, float f2);

    private native void jniSetWarmStarting(long j, boolean z);

    private native void jniStep(long j, float f, int i, int i2);

    private native long newWorld(float f, float f2, boolean z);

    private void postSolve(long j, long j2) {
        ContactListener contactListener = this.contactListener;
        if (contactListener != null) {
            Contact contact = this.contact;
            contact.addr = j;
            ContactImpulse contactImpulse = this.impulse;
            contactImpulse.addr = j2;
            contactListener.postSolve(contact, contactImpulse);
        }
    }

    private void preSolve(long j, long j2) {
        ContactListener contactListener = this.contactListener;
        if (contactListener != null) {
            Contact contact = this.contact;
            contact.addr = j;
            Manifold manifold = this.manifold;
            manifold.addr = j2;
            contactListener.preSolve(contact, manifold);
        }
    }

    private boolean reportFixture(long j) {
        QueryCallback queryCallback = this.queryCallback;
        if (queryCallback != null) {
            return queryCallback.reportFixture(this.fixtures.get(j));
        }
        return false;
    }

    private float reportRayFixture(long j, float f, float f2, float f3, float f4, float f5) {
        RayCastCallback rayCastCallback = this.rayCastCallback;
        if (rayCastCallback == null) {
            return 0.0f;
        }
        Vector2 vector2 = this.rayPoint;
        vector2.x = f;
        vector2.y = f2;
        Vector2 vector3 = this.rayNormal;
        vector3.x = f3;
        vector3.y = f4;
        return rayCastCallback.reportRayFixture(this.fixtures.get(j), this.rayPoint, this.rayNormal, f5);
    }

    private void setUseDefaultContactFilter(boolean z) {
        this.useDefaultContactFilter = z;
    }

    public static native void setVelocityThreshold(float f);

    public void QueryAABB(QueryCallback queryCallback, float f, float f2, float f3, float f4) {
        this.queryCallback = queryCallback;
        jniQueryAABB(this.addr, f, f2, f3, f4);
    }

    public void clearForces() {
        jniClearForces(this.addr);
    }

    public Body createBody(BodyDef bodyDef) {
        long j = this.addr;
        int value = bodyDef.type.getValue();
        Vector2 vector2 = bodyDef.position;
        float f = vector2.x;
        float f2 = vector2.y;
        float f3 = bodyDef.angle;
        Vector2 vector3 = bodyDef.linearVelocity;
        long jJniCreateBody = jniCreateBody(j, value, f, f2, f3, vector3.x, vector3.y, bodyDef.angularVelocity, bodyDef.linearDamping, bodyDef.angularDamping, bodyDef.allowSleep, bodyDef.awake, bodyDef.fixedRotation, bodyDef.bullet, bodyDef.active, bodyDef.gravityScale);
        Body bodyObtain = this.freeBodies.obtain();
        bodyObtain.reset(jJniCreateBody);
        this.bodies.put(bodyObtain.addr, bodyObtain);
        return bodyObtain;
    }

    public Joint createJoint(JointDef jointDef) {
        long jCreateProperJoint = createProperJoint(jointDef);
        Joint distanceJoint = jointDef.type == JointDef.JointType.DistanceJoint ? new DistanceJoint(this, jCreateProperJoint) : null;
        if (jointDef.type == JointDef.JointType.FrictionJoint) {
            distanceJoint = new FrictionJoint(this, jCreateProperJoint);
        }
        if (jointDef.type == JointDef.JointType.GearJoint) {
            GearJointDef gearJointDef = (GearJointDef) jointDef;
            distanceJoint = new GearJoint(this, jCreateProperJoint, gearJointDef.joint1, gearJointDef.joint2);
        }
        if (jointDef.type == JointDef.JointType.MotorJoint) {
            distanceJoint = new MotorJoint(this, jCreateProperJoint);
        }
        if (jointDef.type == JointDef.JointType.MouseJoint) {
            distanceJoint = new MouseJoint(this, jCreateProperJoint);
        }
        if (jointDef.type == JointDef.JointType.PrismaticJoint) {
            distanceJoint = new PrismaticJoint(this, jCreateProperJoint);
        }
        if (jointDef.type == JointDef.JointType.PulleyJoint) {
            distanceJoint = new PulleyJoint(this, jCreateProperJoint);
        }
        if (jointDef.type == JointDef.JointType.RevoluteJoint) {
            distanceJoint = new RevoluteJoint(this, jCreateProperJoint);
        }
        if (jointDef.type == JointDef.JointType.RopeJoint) {
            distanceJoint = new RopeJoint(this, jCreateProperJoint);
        }
        if (jointDef.type == JointDef.JointType.WeldJoint) {
            distanceJoint = new WeldJoint(this, jCreateProperJoint);
        }
        if (jointDef.type == JointDef.JointType.WheelJoint) {
            distanceJoint = new WheelJoint(this, jCreateProperJoint);
        }
        if (distanceJoint == null) {
            throw new GdxRuntimeException("Unknown joint type: " + jointDef.type);
        }
        this.joints.put(distanceJoint.addr, distanceJoint);
        JointEdge jointEdge = new JointEdge(jointDef.bodyB, distanceJoint);
        JointEdge jointEdge2 = new JointEdge(jointDef.bodyA, distanceJoint);
        distanceJoint.jointEdgeA = jointEdge;
        distanceJoint.jointEdgeB = jointEdge2;
        jointDef.bodyA.joints.add(jointEdge);
        jointDef.bodyB.joints.add(jointEdge2);
        return distanceJoint;
    }

    public void deactivateBody(Body body) {
        jniDeactivateBody(this.addr, body.addr);
    }

    public void destroyBody(Body body) {
        Array<JointEdge> jointList = body.getJointList();
        while (jointList.size > 0) {
            destroyJoint(body.getJointList().get(0).joint);
        }
        jniDestroyBody(this.addr, body.addr);
        body.setUserData(null);
        this.bodies.remove(body.addr);
        Array<Fixture> fixtureList = body.getFixtureList();
        while (fixtureList.size > 0) {
            Fixture fixtureRemoveIndex = fixtureList.removeIndex(0);
            fixtureRemoveIndex.setUserData(null);
            this.fixtures.remove(fixtureRemoveIndex.addr);
            this.freeFixtures.free(fixtureRemoveIndex);
        }
        this.freeBodies.free(body);
    }

    public void destroyFixture(Body body, Fixture fixture) {
        jniDestroyFixture(this.addr, body.addr, fixture.addr);
    }

    public void destroyJoint(Joint joint) {
        joint.setUserData(null);
        this.joints.remove(joint.addr);
        joint.jointEdgeA.other.joints.removeValue(joint.jointEdgeB, true);
        joint.jointEdgeB.other.joints.removeValue(joint.jointEdgeA, true);
        jniDestroyJoint(this.addr, joint.addr);
    }

    @Override // com.badlogic.gdx.utils.Disposable
    public void dispose() {
        jniDispose(this.addr);
    }

    public boolean getAutoClearForces() {
        return jniGetAutoClearForces(this.addr);
    }

    public void getBodies(Array<Body> array) {
        array.clear();
        array.ensureCapacity(this.bodies.size);
        LongMap.Values<Body> values = this.bodies.values();
        while (values.hasNext()) {
            array.add(values.next());
        }
    }

    public int getBodyCount() {
        return jniGetBodyCount(this.addr);
    }

    public int getContactCount() {
        return jniGetContactCount(this.addr);
    }

    public Array<Contact> getContactList() {
        int contactCount = getContactCount();
        if (contactCount > this.contactAddrs.length) {
            int i = contactCount * 2;
            this.contactAddrs = new long[i];
            this.contacts.ensureCapacity(i);
            this.freeContacts.ensureCapacity(i);
        }
        int i2 = this.freeContacts.size;
        if (contactCount > i2) {
            for (int i3 = 0; i3 < contactCount - i2; i3++) {
                this.freeContacts.add(new Contact(this, 0L));
            }
        }
        jniGetContactList(this.addr, this.contactAddrs);
        this.contacts.clear();
        for (int i4 = 0; i4 < contactCount; i4++) {
            Contact contact = this.freeContacts.get(i4);
            contact.addr = this.contactAddrs[i4];
            this.contacts.add(contact);
        }
        return this.contacts;
    }

    public int getFixtureCount() {
        return this.fixtures.size;
    }

    public void getFixtures(Array<Fixture> array) {
        array.clear();
        array.ensureCapacity(this.fixtures.size);
        LongMap.Values<Fixture> values = this.fixtures.values();
        while (values.hasNext()) {
            array.add(values.next());
        }
    }

    public Vector2 getGravity() {
        jniGetGravity(this.addr, this.tmpGravity);
        Vector2 vector2 = this.gravity;
        float[] fArr = this.tmpGravity;
        vector2.x = fArr[0];
        vector2.y = fArr[1];
        return vector2;
    }

    public int getJointCount() {
        return jniGetJointcount(this.addr);
    }

    public void getJoints(Array<Joint> array) {
        array.clear();
        array.ensureCapacity(this.joints.size);
        LongMap.Values<Joint> values = this.joints.values();
        while (values.hasNext()) {
            array.add(values.next());
        }
    }

    public int getProxyCount() {
        return jniGetProxyCount(this.addr);
    }

    public boolean isLocked() {
        return jniIsLocked(this.addr);
    }

    public void rayCast(RayCastCallback rayCastCallback, Vector2 vector2, Vector2 vector3) {
        rayCast(rayCastCallback, vector2.x, vector2.y, vector3.x, vector3.y);
    }

    public void setAutoClearForces(boolean z) {
        jniSetAutoClearForces(this.addr, z);
    }

    public void setContactFilter(ContactFilter contactFilter) {
        this.contactFilter = contactFilter;
        setUseDefaultContactFilter(contactFilter == null);
    }

    public void setContactListener(ContactListener contactListener) {
        this.contactListener = contactListener;
    }

    public void setContinuousPhysics(boolean z) {
        jniSetContiousPhysics(this.addr, z);
    }

    public void setDestructionListener(DestructionListener destructionListener) {
    }

    public void setGravity(Vector2 vector2) {
        jniSetGravity(this.addr, vector2.x, vector2.y);
    }

    public void setWarmStarting(boolean z) {
        jniSetWarmStarting(this.addr, z);
    }

    public void step(float f, int i, int i2) {
        jniStep(this.addr, f, i, i2);
    }

    public void rayCast(RayCastCallback rayCastCallback, float f, float f2, float f3, float f4) {
        this.rayCastCallback = rayCastCallback;
        jniRayCast(this.addr, f, f2, f3, f4);
    }
}
