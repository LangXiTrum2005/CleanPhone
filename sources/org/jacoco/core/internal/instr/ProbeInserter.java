package org.jacoco.core.internal.instr;

import org.objectweb.asm.AnnotationVisitor;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;
import org.objectweb.asm.TypePath;

/* JADX INFO: loaded from: classes5.dex */
class ProbeInserter extends MethodVisitor implements IProbeInserter {
    private int accessorStackSize;
    private final IProbeArrayStrategy arrayStrategy;
    private final Label beginLabel;
    private final boolean clinit;
    private final int variable;

    public ProbeInserter(int i, String str, String str2, MethodVisitor methodVisitor, IProbeArrayStrategy iProbeArrayStrategy) {
        super(589824, methodVisitor);
        this.clinit = "<clinit>".equals(str);
        this.arrayStrategy = iProbeArrayStrategy;
        int size = (i & 8) == 0 ? 1 : 0;
        for (Type type : Type.getArgumentTypes(str2)) {
            size += type.getSize();
        }
        this.variable = size;
        this.beginLabel = new Label();
    }

    private int map(int i) {
        return i < this.variable ? i : i + 1;
    }

    @Override // org.jacoco.core.internal.instr.IProbeInserter
    public void insertProbe(int i) {
        this.mv.visitVarInsn(25, this.variable);
        InstrSupport.push(this.mv, i);
        this.mv.visitInsn(4);
        this.mv.visitInsn(84);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitCode() {
        this.mv.visitLabel(this.beginLabel);
        this.accessorStackSize = this.arrayStrategy.storeInstance(this.mv, this.clinit, this.variable);
        this.mv.visitCode();
    }

    @Override // org.objectweb.asm.MethodVisitor
    public final void visitFrame(int i, int i2, Object[] objArr, int i3, Object[] objArr2) {
        int i4;
        if (i != -1) {
            throw new IllegalArgumentException("ClassReader.accept() should be called with EXPAND_FRAMES flag");
        }
        Object[] objArr3 = new Object[Math.max(i2, this.variable) + 1];
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            if (i5 >= i2 && i6 > this.variable) {
                this.mv.visitFrame(i, i7, objArr3, i3, objArr2);
                return;
            }
            int i8 = i;
            int i9 = i3;
            Object[] objArr4 = objArr2;
            if (i6 == this.variable) {
                i4 = i7 + 1;
                objArr3[i7] = InstrSupport.DATAFIELD_DESC;
            } else {
                if (i5 < i2) {
                    int i10 = i5 + 1;
                    Object obj = objArr[i5];
                    int i11 = i7 + 1;
                    objArr3[i7] = obj;
                    i6 = (obj == Opcodes.LONG || obj == Opcodes.DOUBLE) ? i6 + 2 : i6 + 1;
                    i5 = i10;
                    i7 = i11;
                } else {
                    i4 = i7 + 1;
                    objArr3[i7] = Opcodes.TOP;
                }
                i = i8;
                i3 = i9;
                objArr2 = objArr4;
            }
            i6++;
            i7 = i4;
            i = i8;
            i3 = i9;
            objArr2 = objArr4;
        }
    }

    @Override // org.objectweb.asm.MethodVisitor
    public final void visitIincInsn(int i, int i2) {
        this.mv.visitIincInsn(map(i), i2);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public final void visitLocalVariable(String str, String str2, String str3, Label label, Label label2, int i) {
        if (i < this.variable) {
            this.mv.visitLocalVariable(str, str2, str3, this.beginLabel, label2, i);
        } else {
            this.mv.visitLocalVariable(str, str2, str3, label, label2, map(i));
        }
    }

    @Override // org.objectweb.asm.MethodVisitor
    public AnnotationVisitor visitLocalVariableAnnotation(int i, TypePath typePath, Label[] labelArr, Label[] labelArr2, int[] iArr, String str, boolean z) {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr2[i2] = map(iArr[i2]);
        }
        return this.mv.visitLocalVariableAnnotation(i, typePath, labelArr, labelArr2, iArr2, str, z);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitMaxs(int i, int i2) {
        this.mv.visitMaxs(Math.max(i + 3, this.accessorStackSize), i2 + 1);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public final void visitVarInsn(int i, int i2) {
        this.mv.visitVarInsn(i, map(i2));
    }
}
