package org.jacoco.core.internal.instr;

import org.objectweb.asm.Handle;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;

/* JADX INFO: loaded from: classes5.dex */
class DuplicateFrameEliminator extends MethodVisitor {
    private boolean instruction;

    public DuplicateFrameEliminator(MethodVisitor methodVisitor) {
        super(589824, methodVisitor);
        this.instruction = true;
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitFieldInsn(int i, String str, String str2, String str3) {
        this.instruction = true;
        this.mv.visitFieldInsn(i, str, str2, str3);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitFrame(int i, int i2, Object[] objArr, int i3, Object[] objArr2) {
        if (this.instruction) {
            this.instruction = false;
            this.mv.visitFrame(i, i2, objArr, i3, objArr2);
        }
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitIincInsn(int i, int i2) {
        this.instruction = true;
        this.mv.visitIincInsn(i, i2);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitInsn(int i) {
        this.instruction = true;
        this.mv.visitInsn(i);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitIntInsn(int i, int i2) {
        this.instruction = true;
        this.mv.visitIntInsn(i, i2);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitInvokeDynamicInsn(String str, String str2, Handle handle, Object... objArr) {
        this.instruction = true;
        this.mv.visitInvokeDynamicInsn(str, str2, handle, objArr);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitJumpInsn(int i, Label label) {
        this.instruction = true;
        this.mv.visitJumpInsn(i, label);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitLdcInsn(Object obj) {
        this.instruction = true;
        this.mv.visitLdcInsn(obj);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitLookupSwitchInsn(Label label, int[] iArr, Label[] labelArr) {
        this.instruction = true;
        this.mv.visitLookupSwitchInsn(label, iArr, labelArr);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitMethodInsn(int i, String str, String str2, String str3, boolean z) {
        this.instruction = true;
        this.mv.visitMethodInsn(i, str, str2, str3, z);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitMultiANewArrayInsn(String str, int i) {
        this.instruction = true;
        this.mv.visitMultiANewArrayInsn(str, i);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitTableSwitchInsn(int i, int i2, Label label, Label... labelArr) {
        this.instruction = true;
        this.mv.visitTableSwitchInsn(i, i2, label, labelArr);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitTypeInsn(int i, String str) {
        this.instruction = true;
        this.mv.visitTypeInsn(i, str);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitVarInsn(int i, int i2) {
        this.instruction = true;
        this.mv.visitVarInsn(i, i2);
    }
}
