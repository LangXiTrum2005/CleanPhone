package org.jacoco.core.internal.instr;

import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.MethodVisitor;

/* JADX INFO: loaded from: classes5.dex */
class NoneProbeArrayStrategy implements IProbeArrayStrategy {
    @Override // org.jacoco.core.internal.instr.IProbeArrayStrategy
    public int storeInstance(MethodVisitor methodVisitor, boolean z, int i) {
        throw new UnsupportedOperationException();
    }

    @Override // org.jacoco.core.internal.instr.IProbeArrayStrategy
    public void addMembers(ClassVisitor classVisitor, int i) {
    }
}
