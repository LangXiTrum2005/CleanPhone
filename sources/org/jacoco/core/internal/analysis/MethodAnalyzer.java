package org.jacoco.core.internal.analysis;

import java.util.Iterator;
import org.jacoco.core.internal.flow.IFrame;
import org.jacoco.core.internal.flow.LabelInfo;
import org.jacoco.core.internal.flow.MethodProbesVisitor;
import org.objectweb.asm.Handle;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.MethodNode;
import org.objectweb.asm.tree.TryCatchBlockNode;

/* JADX INFO: loaded from: classes5.dex */
public class MethodAnalyzer extends MethodProbesVisitor {
    private final InstructionsBuilder builder;
    private AbstractInsnNode currentNode;

    public MethodAnalyzer(InstructionsBuilder instructionsBuilder) {
        this.builder = instructionsBuilder;
    }

    private void visitSwitchInsn(Label label, Label[] labelArr) {
        this.builder.addInstruction(this.currentNode);
        LabelInfo.resetDone(labelArr);
        this.builder.addJump(label, 0);
        LabelInfo.setDone(label);
        int i = 0;
        for (Label label2 : labelArr) {
            if (!LabelInfo.isDone(label2)) {
                i++;
                this.builder.addJump(label2, i);
                LabelInfo.setDone(label2);
            }
        }
    }

    private void visitSwitchInsnWithProbes(Label label, Label[] labelArr) {
        this.builder.addInstruction(this.currentNode);
        LabelInfo.resetDone(label);
        LabelInfo.resetDone(labelArr);
        visitSwitchTarget(label, 0);
        int i = 0;
        for (Label label2 : labelArr) {
            i++;
            visitSwitchTarget(label2, i);
        }
    }

    private void visitSwitchTarget(Label label, int i) {
        int probeId = LabelInfo.getProbeId(label);
        if (LabelInfo.isDone(label)) {
            return;
        }
        if (probeId == -1) {
            this.builder.addJump(label, i);
        } else {
            this.builder.addProbe(probeId, i);
        }
        LabelInfo.setDone(label);
    }

    @Override // org.jacoco.core.internal.flow.MethodProbesVisitor
    public void accept(MethodNode methodNode, MethodVisitor methodVisitor) {
        methodVisitor.visitCode();
        Iterator<TryCatchBlockNode> it = methodNode.tryCatchBlocks.iterator();
        while (it.hasNext()) {
            it.next().accept(methodVisitor);
        }
        for (AbstractInsnNode abstractInsnNode : methodNode.instructions) {
            this.currentNode = abstractInsnNode;
            abstractInsnNode.accept(methodVisitor);
        }
        methodVisitor.visitEnd();
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitFieldInsn(int i, String str, String str2, String str3) {
        this.builder.addInstruction(this.currentNode);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitIincInsn(int i, int i2) {
        this.builder.addInstruction(this.currentNode);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitInsn(int i) {
        this.builder.addInstruction(this.currentNode);
    }

    @Override // org.jacoco.core.internal.flow.MethodProbesVisitor
    public void visitInsnWithProbe(int i, int i2) {
        this.builder.addInstruction(this.currentNode);
        this.builder.addProbe(i2, 0);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitIntInsn(int i, int i2) {
        this.builder.addInstruction(this.currentNode);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitInvokeDynamicInsn(String str, String str2, Handle handle, Object... objArr) {
        this.builder.addInstruction(this.currentNode);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitJumpInsn(int i, Label label) {
        this.builder.addInstruction(this.currentNode);
        this.builder.addJump(label, 1);
    }

    @Override // org.jacoco.core.internal.flow.MethodProbesVisitor
    public void visitJumpInsnWithProbe(int i, Label label, int i2, IFrame iFrame) {
        this.builder.addInstruction(this.currentNode);
        this.builder.addProbe(i2, 1);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitLabel(Label label) {
        this.builder.addLabel(label);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitLdcInsn(Object obj) {
        this.builder.addInstruction(this.currentNode);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitLineNumber(int i, Label label) {
        this.builder.setCurrentLine(i);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitLookupSwitchInsn(Label label, int[] iArr, Label[] labelArr) {
        visitSwitchInsn(label, labelArr);
    }

    @Override // org.jacoco.core.internal.flow.MethodProbesVisitor
    public void visitLookupSwitchInsnWithProbes(Label label, int[] iArr, Label[] labelArr, IFrame iFrame) {
        visitSwitchInsnWithProbes(label, labelArr);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitMethodInsn(int i, String str, String str2, String str3, boolean z) {
        this.builder.addInstruction(this.currentNode);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitMultiANewArrayInsn(String str, int i) {
        this.builder.addInstruction(this.currentNode);
    }

    @Override // org.jacoco.core.internal.flow.MethodProbesVisitor
    public void visitProbe(int i) {
        this.builder.addProbe(i, 0);
        this.builder.noSuccessor();
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitTableSwitchInsn(int i, int i2, Label label, Label... labelArr) {
        visitSwitchInsn(label, labelArr);
    }

    @Override // org.jacoco.core.internal.flow.MethodProbesVisitor
    public void visitTableSwitchInsnWithProbes(int i, int i2, Label label, Label[] labelArr, IFrame iFrame) {
        visitSwitchInsnWithProbes(label, labelArr);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitTypeInsn(int i, String str) {
        this.builder.addInstruction(this.currentNode);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitVarInsn(int i, int i2) {
        this.builder.addInstruction(this.currentNode);
    }
}
