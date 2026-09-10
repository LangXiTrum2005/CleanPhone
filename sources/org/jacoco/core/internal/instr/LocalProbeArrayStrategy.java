package org.jacoco.core.internal.instr;

import org.jacoco.core.runtime.IExecutionDataAccessorGenerator;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.MethodVisitor;

/* JADX INFO: loaded from: classes5.dex */
class LocalProbeArrayStrategy implements IProbeArrayStrategy {
    private final IExecutionDataAccessorGenerator accessorGenerator;
    private final long classId;
    private final String className;
    private final int probeCount;

    public LocalProbeArrayStrategy(String str, long j, int i, IExecutionDataAccessorGenerator iExecutionDataAccessorGenerator) {
        this.className = str;
        this.classId = j;
        this.probeCount = i;
        this.accessorGenerator = iExecutionDataAccessorGenerator;
    }

    @Override // org.jacoco.core.internal.instr.IProbeArrayStrategy
    public int storeInstance(MethodVisitor methodVisitor, boolean z, int i) {
        int iGenerateDataAccessor = this.accessorGenerator.generateDataAccessor(this.classId, this.className, this.probeCount, methodVisitor);
        methodVisitor.visitVarInsn(58, i);
        return iGenerateDataAccessor;
    }

    @Override // org.jacoco.core.internal.instr.IProbeArrayStrategy
    public void addMembers(ClassVisitor classVisitor, int i) {
    }
}
