package com.badlogic.gdx.physics.box2d;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.joints.PulleyJoint;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.Disposable;

/* JADX INFO: loaded from: classes.dex */
public class Box2DDebugRenderer implements Disposable {
    public final Color AABB_COLOR;
    public final Color JOINT_COLOR;
    public final Color SHAPE_AWAKE;
    public final Color SHAPE_KINEMATIC;
    public final Color SHAPE_NOT_ACTIVE;
    public final Color SHAPE_NOT_AWAKE;
    public final Color SHAPE_STATIC;
    public final Color VELOCITY_COLOR;
    private boolean drawAABBs;
    private boolean drawBodies;
    private boolean drawContacts;
    private boolean drawInactiveBodies;
    private boolean drawJoints;
    private boolean drawVelocities;
    private final Vector2 f;
    private final Vector2 lv;
    protected ShapeRenderer renderer;
    private final Vector2 v;
    private static final Vector2[] vertices = new Vector2[1000];
    private static final Vector2 lower = new Vector2();
    private static final Vector2 upper = new Vector2();
    private static final Array<Body> bodies = new Array<>();
    private static final Array<Joint> joints = new Array<>();
    private static Vector2 t = new Vector2();
    private static Vector2 axis = new Vector2();

    public Box2DDebugRenderer() {
        this(true, true, false, true, false, true);
    }

    private void drawAABB(Fixture fixture, Transform transform) {
        if (fixture.getType() == Shape.Type.Circle) {
            CircleShape circleShape = (CircleShape) fixture.getShape();
            float radius = circleShape.getRadius();
            Vector2[] vector2Arr = vertices;
            vector2Arr[0].set(circleShape.getPosition());
            transform.mul(vector2Arr[0]);
            Vector2 vector2 = lower;
            Vector2 vector3 = vector2Arr[0];
            vector2.set(vector3.x - radius, vector3.y - radius);
            Vector2 vector4 = upper;
            Vector2 vector5 = vector2Arr[0];
            vector4.set(vector5.x + radius, vector5.y + radius);
            vector2Arr[0].set(vector2.x, vector2.y);
            vector2Arr[1].set(vector4.x, vector2.y);
            vector2Arr[2].set(vector4.x, vector4.y);
            vector2Arr[3].set(vector2.x, vector4.y);
            drawSolidPolygon(vector2Arr, 4, this.AABB_COLOR, true);
            return;
        }
        if (fixture.getType() == Shape.Type.Polygon) {
            PolygonShape polygonShape = (PolygonShape) fixture.getShape();
            int vertexCount = polygonShape.getVertexCount();
            Vector2[] vector2Arr2 = vertices;
            polygonShape.getVertex(0, vector2Arr2[0]);
            Vector2 vector6 = lower;
            vector6.set(transform.mul(vector2Arr2[0]));
            upper.set(vector6);
            for (int i = 1; i < vertexCount; i++) {
                Vector2[] vector2Arr3 = vertices;
                polygonShape.getVertex(i, vector2Arr3[i]);
                transform.mul(vector2Arr3[i]);
                Vector2 vector7 = lower;
                vector7.x = Math.min(vector7.x, vector2Arr3[i].x);
                vector7.y = Math.min(vector7.y, vector2Arr3[i].y);
                Vector2 vector8 = upper;
                vector8.x = Math.max(vector8.x, vector2Arr3[i].x);
                vector8.y = Math.max(vector8.y, vector2Arr3[i].y);
            }
            Vector2[] vector2Arr4 = vertices;
            Vector2 vector9 = vector2Arr4[0];
            Vector2 vector10 = lower;
            vector9.set(vector10.x, vector10.y);
            Vector2 vector11 = vector2Arr4[1];
            Vector2 vector12 = upper;
            vector11.set(vector12.x, vector10.y);
            vector2Arr4[2].set(vector12.x, vector12.y);
            vector2Arr4[3].set(vector10.x, vector12.y);
            drawSolidPolygon(vector2Arr4, 4, this.AABB_COLOR, true);
        }
    }

    private void drawContact(Contact contact) {
        WorldManifold worldManifold = contact.getWorldManifold();
        if (worldManifold.getNumberOfContactPoints() == 0) {
            return;
        }
        Vector2 vector2 = worldManifold.getPoints()[0];
        this.renderer.setColor(getColorByBody(contact.getFixtureA().getBody()));
        this.renderer.point(vector2.x, vector2.y, 0.0f);
    }

    private void drawJoint(Joint joint) {
        Body bodyA = joint.getBodyA();
        Body bodyB = joint.getBodyB();
        Transform transform = bodyA.getTransform();
        Transform transform2 = bodyB.getTransform();
        Vector2 position = transform.getPosition();
        Vector2 position2 = transform2.getPosition();
        Vector2 anchorA = joint.getAnchorA();
        Vector2 anchorB = joint.getAnchorB();
        if (joint.getType() == JointDef.JointType.DistanceJoint) {
            drawSegment(anchorA, anchorB, this.JOINT_COLOR);
            return;
        }
        if (joint.getType() == JointDef.JointType.PulleyJoint) {
            PulleyJoint pulleyJoint = (PulleyJoint) joint;
            Vector2 groundAnchorA = pulleyJoint.getGroundAnchorA();
            Vector2 groundAnchorB = pulleyJoint.getGroundAnchorB();
            drawSegment(groundAnchorA, anchorA, this.JOINT_COLOR);
            drawSegment(groundAnchorB, anchorB, this.JOINT_COLOR);
            drawSegment(groundAnchorA, groundAnchorB, this.JOINT_COLOR);
            return;
        }
        if (joint.getType() == JointDef.JointType.MouseJoint) {
            drawSegment(joint.getAnchorA(), joint.getAnchorB(), this.JOINT_COLOR);
            return;
        }
        drawSegment(position, anchorA, this.JOINT_COLOR);
        drawSegment(anchorA, anchorB, this.JOINT_COLOR);
        drawSegment(position2, anchorB, this.JOINT_COLOR);
    }

    private void drawSegment(Vector2 vector2, Vector2 vector3, Color color) {
        this.renderer.setColor(color);
        this.renderer.line(vector2.x, vector2.y, vector3.x, vector3.y);
    }

    private void drawShape(Fixture fixture, Transform transform, Color color) {
        if (fixture.getType() == Shape.Type.Circle) {
            CircleShape circleShape = (CircleShape) fixture.getShape();
            t.set(circleShape.getPosition());
            transform.mul(t);
            Vector2 vector2 = t;
            float radius = circleShape.getRadius();
            Vector2 vector3 = axis;
            float[] fArr = transform.vals;
            drawSolidCircle(vector2, radius, vector3.set(fArr[2], fArr[3]), color);
            return;
        }
        if (fixture.getType() == Shape.Type.Edge) {
            EdgeShape edgeShape = (EdgeShape) fixture.getShape();
            Vector2[] vector2Arr = vertices;
            edgeShape.getVertex1(vector2Arr[0]);
            edgeShape.getVertex2(vector2Arr[1]);
            transform.mul(vector2Arr[0]);
            transform.mul(vector2Arr[1]);
            drawSolidPolygon(vector2Arr, 2, color, true);
            return;
        }
        if (fixture.getType() == Shape.Type.Polygon) {
            PolygonShape polygonShape = (PolygonShape) fixture.getShape();
            int vertexCount = polygonShape.getVertexCount();
            for (int i = 0; i < vertexCount; i++) {
                Vector2[] vector2Arr2 = vertices;
                polygonShape.getVertex(i, vector2Arr2[i]);
                transform.mul(vector2Arr2[i]);
            }
            drawSolidPolygon(vertices, vertexCount, color, true);
            return;
        }
        if (fixture.getType() == Shape.Type.Chain) {
            ChainShape chainShape = (ChainShape) fixture.getShape();
            int vertexCount2 = chainShape.getVertexCount();
            for (int i2 = 0; i2 < vertexCount2; i2++) {
                Vector2[] vector2Arr3 = vertices;
                chainShape.getVertex(i2, vector2Arr3[i2]);
                transform.mul(vector2Arr3[i2]);
            }
            drawSolidPolygon(vertices, vertexCount2, color, false);
        }
    }

    private void drawSolidCircle(Vector2 vector2, float f, Vector2 vector3, Color color) {
        this.renderer.setColor(color.r, color.g, color.b, color.f202a);
        float f2 = 0.0f;
        int i = 0;
        while (i < 20) {
            double d = f2;
            this.v.set((((float) Math.cos(d)) * f) + vector2.x, (((float) Math.sin(d)) * f) + vector2.y);
            if (i == 0) {
                this.lv.set(this.v);
                this.f.set(this.v);
            } else {
                ShapeRenderer shapeRenderer = this.renderer;
                Vector2 vector4 = this.lv;
                float f3 = vector4.x;
                float f4 = vector4.y;
                Vector2 vector5 = this.v;
                shapeRenderer.line(f3, f4, vector5.x, vector5.y);
                this.lv.set(this.v);
            }
            i++;
            f2 += 0.31415927f;
        }
        ShapeRenderer shapeRenderer2 = this.renderer;
        Vector2 vector6 = this.f;
        float f5 = vector6.x;
        float f6 = vector6.y;
        Vector2 vector7 = this.lv;
        shapeRenderer2.line(f5, f6, vector7.x, vector7.y);
        ShapeRenderer shapeRenderer3 = this.renderer;
        float f7 = vector2.x;
        float f8 = vector2.y;
        shapeRenderer3.line(f7, f8, 0.0f, (vector3.x * f) + f7, (vector3.y * f) + f8, 0.0f);
    }

    private void drawSolidPolygon(Vector2[] vector2Arr, int i, Color color, boolean z) {
        this.renderer.setColor(color.r, color.g, color.b, color.f202a);
        this.lv.set(vector2Arr[0]);
        this.f.set(vector2Arr[0]);
        for (int i2 = 1; i2 < i; i2++) {
            Vector2 vector2 = vector2Arr[i2];
            ShapeRenderer shapeRenderer = this.renderer;
            Vector2 vector3 = this.lv;
            shapeRenderer.line(vector3.x, vector3.y, vector2.x, vector2.y);
            this.lv.set(vector2);
        }
        if (z) {
            ShapeRenderer shapeRenderer2 = this.renderer;
            Vector2 vector4 = this.f;
            float f = vector4.x;
            float f2 = vector4.y;
            Vector2 vector5 = this.lv;
            shapeRenderer2.line(f, f2, vector5.x, vector5.y);
        }
    }

    public static Vector2 getAxis() {
        return axis;
    }

    private Color getColorByBody(Body body) {
        if (!body.isActive()) {
            return this.SHAPE_NOT_ACTIVE;
        }
        if (body.getType() == BodyDef.BodyType.StaticBody) {
            return this.SHAPE_STATIC;
        }
        if (body.getType() == BodyDef.BodyType.KinematicBody) {
            return this.SHAPE_KINEMATIC;
        }
        return !body.isAwake() ? this.SHAPE_NOT_AWAKE : this.SHAPE_AWAKE;
    }

    private void renderBodies(World world) {
        this.renderer.begin(ShapeRenderer.ShapeType.Line);
        if (this.drawBodies || this.drawAABBs) {
            Array<Body> array = bodies;
            world.getBodies(array);
            Array.ArrayIterator<Body> it = array.iterator();
            while (it.hasNext()) {
                Body next = it.next();
                if (next.isActive() || this.drawInactiveBodies) {
                    renderBody(next);
                }
            }
        }
        if (this.drawJoints) {
            Array<Joint> array2 = joints;
            world.getJoints(array2);
            Array.ArrayIterator<Joint> it2 = array2.iterator();
            while (it2.hasNext()) {
                drawJoint(it2.next());
            }
        }
        this.renderer.end();
        if (this.drawContacts) {
            this.renderer.begin(ShapeRenderer.ShapeType.Point);
            Array.ArrayIterator<Contact> it3 = world.getContactList().iterator();
            while (it3.hasNext()) {
                drawContact(it3.next());
            }
            this.renderer.end();
        }
    }

    public static void setAxis(Vector2 vector2) {
        axis = vector2;
    }

    @Override // com.badlogic.gdx.utils.Disposable
    public void dispose() {
        this.renderer.dispose();
    }

    public boolean isDrawAABBs() {
        return this.drawAABBs;
    }

    public boolean isDrawBodies() {
        return this.drawBodies;
    }

    public boolean isDrawContacts() {
        return this.drawContacts;
    }

    public boolean isDrawInactiveBodies() {
        return this.drawInactiveBodies;
    }

    public boolean isDrawJoints() {
        return this.drawJoints;
    }

    public boolean isDrawVelocities() {
        return this.drawVelocities;
    }

    public void render(World world, Matrix4 matrix4) {
        this.renderer.setProjectionMatrix(matrix4);
        renderBodies(world);
    }

    public void renderBody(Body body) {
        Transform transform = body.getTransform();
        Array.ArrayIterator<Fixture> it = body.getFixtureList().iterator();
        while (it.hasNext()) {
            Fixture next = it.next();
            if (this.drawBodies) {
                drawShape(next, transform, getColorByBody(body));
                if (this.drawVelocities) {
                    Vector2 position = body.getPosition();
                    drawSegment(position, body.getLinearVelocity().add(position), this.VELOCITY_COLOR);
                }
            }
            if (this.drawAABBs) {
                drawAABB(next, transform);
            }
        }
    }

    public void setDrawAABBs(boolean z) {
        this.drawAABBs = z;
    }

    public void setDrawBodies(boolean z) {
        this.drawBodies = z;
    }

    public void setDrawContacts(boolean z) {
        this.drawContacts = z;
    }

    public void setDrawInactiveBodies(boolean z) {
        this.drawInactiveBodies = z;
    }

    public void setDrawJoints(boolean z) {
        this.drawJoints = z;
    }

    public void setDrawVelocities(boolean z) {
        this.drawVelocities = z;
    }

    public Box2DDebugRenderer(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.SHAPE_NOT_ACTIVE = new Color(0.5f, 0.5f, 0.3f, 1.0f);
        this.SHAPE_STATIC = new Color(0.5f, 0.9f, 0.5f, 1.0f);
        this.SHAPE_KINEMATIC = new Color(0.5f, 0.5f, 0.9f, 1.0f);
        this.SHAPE_NOT_AWAKE = new Color(0.6f, 0.6f, 0.6f, 1.0f);
        this.SHAPE_AWAKE = new Color(0.9f, 0.7f, 0.7f, 1.0f);
        this.JOINT_COLOR = new Color(0.5f, 0.8f, 0.8f, 1.0f);
        this.AABB_COLOR = new Color(1.0f, 0.0f, 1.0f, 1.0f);
        this.VELOCITY_COLOR = new Color(1.0f, 0.0f, 0.0f, 1.0f);
        this.f = new Vector2();
        this.v = new Vector2();
        this.lv = new Vector2();
        this.renderer = new ShapeRenderer();
        int i = 0;
        while (true) {
            Vector2[] vector2Arr = vertices;
            if (i >= vector2Arr.length) {
                this.drawBodies = z;
                this.drawJoints = z2;
                this.drawAABBs = z3;
                this.drawInactiveBodies = z4;
                this.drawVelocities = z5;
                this.drawContacts = z6;
                return;
            }
            vector2Arr[i] = new Vector2();
            i++;
        }
    }
}
