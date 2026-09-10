package org.jacoco.core.internal.instr;

import org.jacoco.core.runtime.IExecutionDataAccessorGenerator;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

/* JADX INFO: loaded from: classes5.dex */
class InterfaceFieldProbeArrayStrategy implements IProbeArrayStrategy {
    private final IExecutionDataAccessorGenerator accessorGenerator;
    private final long classId;
    private final String className;
    private final int probeCount;
    private boolean seenClinit = false;
    private static final Object[] FRAME_STACK_ARRZ = {InstrSupport.DATAFIELD_DESC};
    private static final Object[] FRAME_LOCALS_EMPTY = new Object[0];

    public InterfaceFieldProbeArrayStrategy(String str, long j, int i, IExecutionDataAccessorGenerator iExecutionDataAccessorGenerator) {
        this.className = str;
        this.classId = j;
        this.probeCount = i;
        this.accessorGenerator = iExecutionDataAccessorGenerator;
    }

    private void createClinitMethod(ClassVisitor classVisitor, int i) {
        MethodVisitor methodVisitorVisitMethod = classVisitor.visitMethod(4104, "<clinit>", "()V", null, null);
        methodVisitorVisitMethod.visitCode();
        int iGenerateDataAccessor = this.accessorGenerator.generateDataAccessor(this.classId, this.className, i, methodVisitorVisitMethod);
        methodVisitorVisitMethod.visitFieldInsn(Opcodes.PUTSTATIC, this.className, InstrSupport.DATAFIELD_NAME, InstrSupport.DATAFIELD_DESC);
        methodVisitorVisitMethod.visitInsn(Opcodes.RETURN);
        methodVisitorVisitMethod.visitMaxs(iGenerateDataAccessor, 0);
        methodVisitorVisitMethod.visitEnd();
    }

    private void createDataField(ClassVisitor classVisitor) {
        classVisitor.visitField(InstrSupport.DATAFIELD_INTF_ACC, InstrSupport.DATAFIELD_NAME, InstrSupport.DATAFIELD_DESC, null, null);
    }

    private void createInitMethod(ClassVisitor classVisitor, int i) {
        MethodVisitor methodVisitorVisitMethod = classVisitor.visitMethod(InstrSupport.INITMETHOD_ACC, InstrSupport.INITMETHOD_NAME, InstrSupport.INITMETHOD_DESC, null, null);
        methodVisitorVisitMethod.visitCode();
        methodVisitorVisitMethod.visitFieldInsn(Opcodes.GETSTATIC, this.className, InstrSupport.DATAFIELD_NAME, InstrSupport.DATAFIELD_DESC);
        methodVisitorVisitMethod.visitInsn(89);
        Label label = new Label();
        methodVisitorVisitMethod.visitJumpInsn(Opcodes.IFNONNULL, label);
        methodVisitorVisitMethod.visitInsn(87);
        int iGenerateDataAccessor = this.accessorGenerator.generateDataAccessor(this.classId, this.className, i, methodVisitorVisitMethod);
        methodVisitorVisitMethod.visitFrame(-1, 0, FRAME_LOCALS_EMPTY, 1, FRAME_STACK_ARRZ);
        methodVisitorVisitMethod.visitLabel(label);
        methodVisitorVisitMethod.visitInsn(Opcodes.ARETURN);
        methodVisitorVisitMethod.visitMaxs(Math.max(iGenerateDataAccessor, 2), 0);
        methodVisitorVisitMethod.visitEnd();
    }

    @Override // org.jacoco.core.internal.instr.IProbeArrayStrategy
    public void addMembers(ClassVisitor classVisitor, int i) {
        createDataField(classVisitor);
        createInitMethod(classVisitor, i);
        if (this.seenClinit) {
            return;
        }
        createClinitMethod(classVisitor, i);
    }

    @Override // org.jacoco.core.internal.instr.IProbeArrayStrategy
    public int storeInstance(MethodVisitor methodVisitor, boolean z, int i) {
        if (!z) {
            methodVisitor.visitMethodInsn(Opcodes.INVOKESTATIC, this.className, InstrSupport.INITMETHOD_NAME, InstrSupport.INITMETHOD_DESC, true);
            methodVisitor.visitVarInsn(58, i);
            return 1;
        }
        int iGenerateDataAccessor = this.accessorGenerator.generateDataAccessor(this.classId, this.className, this.probeCount, methodVisitor);
        methodVisitor.visitInsn(89);
        methodVisitor.visitFieldInsn(Opcodes.PUTSTATIC, this.className, InstrSupport.DATAFIELD_NAME, InstrSupport.DATAFIELD_DESC);
        methodVisitor.visitVarInsn(58, i);
        this.seenClinit = true;
        return Math.max(iGenerateDataAccessor, 2);
    }
}
