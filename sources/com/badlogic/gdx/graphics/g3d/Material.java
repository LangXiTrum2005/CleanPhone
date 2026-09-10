package com.badlogic.gdx.graphics.g3d;

import com.badlogic.gdx.utils.Array;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class Material extends Attributes {
    private static int counter;
    public String id;

    public Material() {
        StringBuilder sb = new StringBuilder("mtl");
        int i = counter + 1;
        counter = i;
        sb.append(i);
        this(sb.toString());
    }

    public Material copy() {
        return new Material(this);
    }

    @Override // com.badlogic.gdx.graphics.g3d.Attributes, java.util.Comparator
    public boolean equals(Object obj) {
        return (obj instanceof Material) && (obj == this || (((Material) obj).id.equals(this.id) && super.equals(obj)));
    }

    @Override // com.badlogic.gdx.graphics.g3d.Attributes
    public int hashCode() {
        return (this.id.hashCode() * 3) + super.hashCode();
    }

    public Material(String str) {
        this.id = str;
    }

    public Material(Attribute... attributeArr) {
        this();
        set(attributeArr);
    }

    public Material(String str, Attribute... attributeArr) {
        this(str);
        set(attributeArr);
    }

    public Material(Array<Attribute> array) {
        this();
        set(array);
    }

    public Material(String str, Array<Attribute> array) {
        this(str);
        set(array);
    }

    public Material(Material material) {
        this(material.id, material);
    }

    public Material(String str, Material material) {
        this(str);
        Iterator<Attribute> it = material.iterator();
        while (it.hasNext()) {
            set(it.next().copy());
        }
    }
}
