package com.badlogic.gdx.physics.box2d.joints;

import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.JointDef;

/* JADX INFO: loaded from: classes.dex */
public class PulleyJointDef extends JointDef {
    private static final float minPulleyLength = 2.0f;
    public final Vector2 groundAnchorA = new Vector2(-1.0f, 1.0f);
    public final Vector2 groundAnchorB = new Vector2(1.0f, 1.0f);
    public final Vector2 localAnchorA = new Vector2(-1.0f, 0.0f);
    public final Vector2 localAnchorB = new Vector2(1.0f, 0.0f);
    public float lengthA = 0.0f;
    public float lengthB = 0.0f;
    public float ratio = 1.0f;

    public PulleyJointDef() {
        this.type = JointDef.JointType.PulleyJoint;
        this.collideConnected = true;
    }

    public void initialize(Body body, Body body2, Vector2 vector2, Vector2 vector3, Vector2 vector4, Vector2 vector5, float f) {
        this.bodyA = body;
        this.bodyB = body2;
        this.groundAnchorA.set(vector2);
        this.groundAnchorB.set(vector3);
        this.localAnchorA.set(body.getLocalPoint(vector4));
        this.localAnchorB.set(body2.getLocalPoint(vector5));
        this.lengthA = vector4.dst(vector2);
        this.lengthB = vector5.dst(vector3);
        this.ratio = f;
    }
}
