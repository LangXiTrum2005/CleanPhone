package com.badlogic.gdx.physics.box2d;

/* JADX INFO: loaded from: classes.dex */
public class JointEdge {
    public final Joint joint;
    public final Body other;

    public JointEdge(Body body, Joint joint) {
        this.other = body;
        this.joint = joint;
    }
}
