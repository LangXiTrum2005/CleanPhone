package com.badlogic.gdx.graphics.g3d.attributes;

import com.badlogic.gdx.graphics.g3d.Attribute;
import com.badlogic.gdx.graphics.g3d.environment.SpotLight;
import com.badlogic.gdx.utils.Array;

/* JADX INFO: loaded from: classes.dex */
public class SpotLightsAttribute extends Attribute {
    public static final String Alias = "spotLights";
    public static final long Type = Attribute.register(Alias);
    public final Array<SpotLight> lights;

    public SpotLightsAttribute() {
        super(Type);
        this.lights = new Array<>(1);
    }

    public static final boolean is(long j) {
        return (Type & j) == j;
    }

    @Override // com.badlogic.gdx.graphics.g3d.Attribute
    public int hashCode() {
        int iHashCode = super.hashCode();
        Array.ArrayIterator<SpotLight> it = this.lights.iterator();
        while (it.hasNext()) {
            SpotLight next = it.next();
            iHashCode = (iHashCode * 1237) + (next == null ? 0 : next.hashCode());
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
    public SpotLightsAttribute copy() {
        return new SpotLightsAttribute(this);
    }

    public SpotLightsAttribute(SpotLightsAttribute spotLightsAttribute) {
        this();
        this.lights.addAll(spotLightsAttribute.lights);
    }
}
