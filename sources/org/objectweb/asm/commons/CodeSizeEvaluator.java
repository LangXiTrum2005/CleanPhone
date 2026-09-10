package org.objectweb.asm.commons;

import org.objectweb.asm.ConstantDynamic;
import org.objectweb.asm.Handle;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

/* JADX INFO: loaded from: classes5.dex */
public class CodeSizeEvaluator extends MethodVisitor implements Opcodes {
    private int maxSize;
    private int minSize;

    public CodeSizeEvaluator(MethodVisitor methodVisitor) {
        this(589824, methodVisitor);
    }

    public int getMaxSize() {
        return this.maxSize;
    }

    public int getMinSize() {
        return this.minSize;
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitFieldInsn(int i, String str, String str2, String str3) {
        this.minSize += 3;
        this.maxSize += 3;
        super.visitFieldInsn(i, str, str2, str3);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitIincInsn(int i, int i2) {
        if (i > 255 || i2 > 127 || i2 < -128) {
            this.minSize += 6;
            this.maxSize += 6;
        } else {
            this.minSize += 3;
            this.maxSize += 3;
        }
        super.visitIincInsn(i, i2);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitInsn(int i) {
        this.minSize++;
        this.maxSize++;
        super.visitInsn(i);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitIntInsn(int i, int i2) {
        if (i == 17) {
            this.minSize += 3;
            this.maxSize += 3;
        } else {
            this.minSize += 2;
            this.maxSize += 2;
        }
        super.visitIntInsn(i, i2);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitInvokeDynamicInsn(String str, String str2, Handle handle, Object... objArr) {
        this.minSize += 5;
        this.maxSize += 5;
        super.visitInvokeDynamicInsn(str, str2, handle, objArr);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitJumpInsn(int i, Label label) {
        this.minSize += 3;
        if (i == 167 || i == 168) {
            this.maxSize += 5;
        } else {
            this.maxSize += 8;
        }
        super.visitJumpInsn(i, label);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitLdcInsn(Object obj) {
        if ((obj instanceof Long) || (obj instanceof Double) || ((obj instanceof ConstantDynamic) && ((ConstantDynamic) obj).getSize() == 2)) {
            this.minSize += 3;
            this.maxSize += 3;
        } else {
            this.minSize += 2;
            this.maxSize += 3;
        }
        super.visitLdcInsn(obj);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitLookupSwitchInsn(Label label, int[] iArr, Label[] labelArr) {
        this.minSize += (iArr.length * 8) + 9;
        this.maxSize += (iArr.length * 8) + 12;
        super.visitLookupSwitchInsn(label, iArr, labelArr);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitMethodInsn(int i, String str, String str2, String str3, boolean z) {
        if (this.api < 327680 && (i & 256) == 0) {
            super.visitMethodInsn(i, str, str2, str3, z);
            return;
        }
        if ((i & (-257)) == 185) {
            this.minSize += 5;
            this.maxSize += 5;
        } else {
            this.minSize += 3;
            this.maxSize += 3;
        }
        super.visitMethodInsn(i, str, str2, str3, z);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitMultiANewArrayInsn(String str, int i) {
        this.minSize += 4;
        this.maxSize += 4;
        super.visitMultiANewArrayInsn(str, i);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitTableSwitchInsn(int i, int i2, Label label, Label... labelArr) {
        this.minSize += (labelArr.length * 4) + 13;
        this.maxSize += (labelArr.length * 4) + 16;
        super.visitTableSwitchInsn(i, i2, label, labelArr);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitTypeInsn(int i, String str) {
        this.minSize += 3;
        this.maxSize += 3;
        super.visitTypeInsn(i, str);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitVarInsn(int i, int i2) {
        if (i2 < 4 && i != 169) {
            this.minSize++;
            this.maxSize++;
        } else if (i2 >= 256) {
            this.minSize += 4;
            this.maxSize += 4;
        } else {
            this.minSize += 2;
            this.maxSize += 2;
        }
        super.visitVarInsn(i, i2);
    }

    public CodeSizeEvaluator(int i, MethodVisitor methodVisitor) {
        super(i, methodVisitor);
    }
}
