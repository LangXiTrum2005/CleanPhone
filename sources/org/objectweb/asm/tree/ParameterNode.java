package org.objectweb.asm.tree;

import org.objectweb.asm.MethodVisitor;

/* JADX INFO: loaded from: classes5.dex */
public class ParameterNode {
    public int access;
    public String name;

    public ParameterNode(String str, int i) {
        this.name = str;
        this.access = i;
    }

    public void accept(MethodVisitor methodVisitor) {
        methodVisitor.visitParameter(this.name, this.access);
    }
}
