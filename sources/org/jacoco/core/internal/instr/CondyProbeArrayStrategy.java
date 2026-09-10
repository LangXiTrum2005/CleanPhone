package org.jacoco.core.internal.instr;

import org.jacoco.core.runtime.IExecutionDataAccessorGenerator;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.ConstantDynamic;
import org.objectweb.asm.Handle;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

/* JADX INFO: loaded from: classes5.dex */
public class CondyProbeArrayStrategy implements IProbeArrayStrategy {
    public static final String B_DESC = "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/Class;)[Z";
    private final IExecutionDataAccessorGenerator accessorGenerator;
    private final long classId;
    private final String className;
    private final boolean isInterface;

    public CondyProbeArrayStrategy(String str, boolean z, long j, IExecutionDataAccessorGenerator iExecutionDataAccessorGenerator) {
        this.className = str;
        this.isInterface = z;
        this.classId = j;
        this.accessorGenerator = iExecutionDataAccessorGenerator;
    }

    @Override // org.jacoco.core.internal.instr.IProbeArrayStrategy
    public void addMembers(ClassVisitor classVisitor, int i) {
        MethodVisitor methodVisitorVisitMethod = classVisitor.visitMethod(InstrSupport.INITMETHOD_ACC, InstrSupport.INITMETHOD_NAME, B_DESC, null, null);
        int iGenerateDataAccessor = this.accessorGenerator.generateDataAccessor(this.classId, this.className, i, methodVisitorVisitMethod);
        methodVisitorVisitMethod.visitInsn(Opcodes.ARETURN);
        methodVisitorVisitMethod.visitMaxs(iGenerateDataAccessor, 3);
        methodVisitorVisitMethod.visitEnd();
    }

    @Override // org.jacoco.core.internal.instr.IProbeArrayStrategy
    public int storeInstance(MethodVisitor methodVisitor, boolean z, int i) {
        methodVisitor.visitLdcInsn(new ConstantDynamic(InstrSupport.DATAFIELD_NAME, "Ljava/lang/Object;", new Handle(6, this.className, InstrSupport.INITMETHOD_NAME, B_DESC, this.isInterface), new Object[0]));
        methodVisitor.visitTypeInsn(192, InstrSupport.DATAFIELD_DESC);
        methodVisitor.visitVarInsn(58, i);
        return 1;
    }
}
