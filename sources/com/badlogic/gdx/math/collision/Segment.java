package com.badlogic.gdx.math.collision;

import com.badlogic.gdx.math.Vector3;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public class Segment implements Serializable {
    private static final long serialVersionUID = 2739667069736519602L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Vector3 f203a;
    public final Vector3 b;

    public Segment(Vector3 vector3, Vector3 vector4) {
        Vector3 vector5 = new Vector3();
        this.f203a = vector5;
        Vector3 vector6 = new Vector3();
        this.b = vector6;
        vector5.set(vector3);
        vector6.set(vector4);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        Segment segment = (Segment) obj;
        return this.f203a.equals(segment.f203a) && this.b.equals(segment.b);
    }

    public int hashCode() {
        return this.b.hashCode() + ((this.f203a.hashCode() + 71) * 71);
    }

    public float len() {
        return this.f203a.dst(this.b);
    }

    public float len2() {
        return this.f203a.dst2(this.b);
    }

    public Segment(float f, float f2, float f3, float f4, float f5, float f6) {
        Vector3 vector3 = new Vector3();
        this.f203a = vector3;
        Vector3 vector4 = new Vector3();
        this.b = vector4;
        vector3.set(f, f2, f3);
        vector4.set(f4, f5, f6);
    }
}
