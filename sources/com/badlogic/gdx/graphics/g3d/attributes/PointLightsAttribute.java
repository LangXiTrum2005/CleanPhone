package com.badlogic.gdx.graphics.g3d.attributes;

import com.badlogic.gdx.graphics.g3d.Attribute;
import com.badlogic.gdx.graphics.g3d.environment.PointLight;
import com.badlogic.gdx.utils.Array;

/* JADX INFO: loaded from: classes.dex */
public class PointLightsAttribute extends Attribute {
    public static final String Alias = "pointLights";
    public static final long Type = Attribute.register(Alias);
    public final Array<PointLight> lights;

    public PointLightsAttribute() {
        super(Type);
        this.lights = new Array<>(1);
    }

    public static final boolean is(long j) {
        return (Type & j) == j;
    }

    @Override // com.badlogic.gdx.graphics.g3d.Attribute
    public int hashCode() {
        int iHashCode = super.hashCode();
        Array.ArrayIterator<PointLight> it = this.lights.iterator();
        while (it.hasNext()) {
            PointLight next = it.next();
            iHashCode = (iHashCode * 1231) + (next == null ? 0 : next.hashCode());
        }
        return iHashCode;
    }

    @Override // java.lang.Comparable
    public int compareTo(Attribute attribute) {
        long j = this.type;
        long j2 = attribute.type;
        if (j != j2) {
            return j < j2 ? -1 : 1;
        }
        return 0;
    }

    @Override // com.badlogic.gdx.graphics.g3d.Attribute
    public PointLightsAttribute copy() {
        return new PointLightsAttribute(this);
    }

    public PointLightsAttribute(PointLightsAttribute pointLightsAttribute) {
        this();
        this.lights.addAll(pointLightsAttribute.lights);
    }
}
