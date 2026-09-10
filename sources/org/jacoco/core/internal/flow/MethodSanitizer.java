package org.jacoco.core.internal.flow;

import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.commons.JSRInlinerAdapter;

/* JADX INFO: loaded from: classes5.dex */
class MethodSanitizer extends JSRInlinerAdapter {
    public MethodSanitizer(MethodVisitor methodVisitor, int i, String str, String str2, String str3, String[] strArr) {
        super(589824, methodVisitor, i, str, str2, str3, strArr);
    }

    @Override // org.objectweb.asm.tree.MethodNode, org.objectweb.asm.MethodVisitor
    public void visitLineNumber(int i, Label label) {
        if (label.info != null) {
            super.visitLineNumber(i, label);
        }
    }

    @Override // org.objectweb.asm.tree.MethodNode, org.objectweb.asm.MethodVisitor
    public void visitLocalVariable(String str, String str2, String str3, Label label, Label label2, int i) {
        if (label.info == null || label2.info == null) {
            return;
        }
        super.visitLocalVariable(str, str2, str3, label, label2, i);
    }
}
