package com.badlogic.gdx.graphics.g3d.attributes;

import com.badlogic.gdx.graphics.Cubemap;
import com.badlogic.gdx.graphics.g3d.Attribute;
import com.badlogic.gdx.graphics.g3d.utils.TextureDescriptor;
import com.badlogic.gdx.utils.GdxRuntimeException;

/* JADX INFO: loaded from: classes.dex */
public class CubemapAttribute extends Attribute {
    public static final long EnvironmentMap;
    public static final String EnvironmentMapAlias = "environmentCubemap";
    protected static long Mask;
    public final TextureDescriptor<Cubemap> textureDescription;

    static {
        long jRegister = Attribute.register(EnvironmentMapAlias);
        EnvironmentMap = jRegister;
        Mask = jRegister;
    }

    public CubemapAttribute(long j) {
        super(j);
        if (!is(j)) {
            throw new GdxRuntimeException("Invalid type specified");
        }
        this.textureDescription = new TextureDescriptor<>();
    }

    public static final boolean is(long j) {
        return (j & Mask) != 0;
    }

    @Override // com.badlogic.gdx.graphics.g3d.Attribute
    public Attribute copy() {
        return new CubemapAttribute(this);
    }

    @Override // com.badlogic.gdx.graphics.g3d.Attribute
    public int hashCode() {
        return this.textureDescription.hashCode() + (super.hashCode() * 967);
    }

    @Override // java.lang.Comparable
    public int compareTo(Attribute attribute) {
        long j = this.type;
        long j2 = attribute.type;
        return j != j2 ? (int) (j - j2) : this.textureDescription.compareTo((TextureDescriptor) ((CubemapAttribute) attribute).textureDescription);
    }

    public <T extends Cubemap> CubemapAttribute(long j, TextureDescriptor<T> textureDescriptor) {
        this(j);
        this.textureDescription.set(textureDescriptor);
    }

    public CubemapAttribute(long j, Cubemap cubemap) {
        this(j);
        this.textureDescription.texture = cubemap;
    }

    public CubemapAttribute(CubemapAttribute cubemapAttribute) {
        this(cubemapAttribute.type, cubemapAttribute.textureDescription);
    }
}
