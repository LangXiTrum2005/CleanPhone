package org.objectweb.asm.tree;

import org.objectweb.asm.TypePath;

/* JADX INFO: loaded from: classes5.dex */
public class TypeAnnotationNode extends AnnotationNode {
    public TypePath typePath;
    public int typeRef;

    public TypeAnnotationNode(int i, TypePath typePath, String str) {
        this(589824, i, typePath, str);
        if (getClass() != TypeAnnotationNode.class) {
            throw new IllegalStateException();
        }
    }

    public TypeAnnotationNode(int i, int i2, TypePath typePath, String str) {
        super(i, str);
        this.typeRef = i2;
        this.typePath = typePath;
    }
}
