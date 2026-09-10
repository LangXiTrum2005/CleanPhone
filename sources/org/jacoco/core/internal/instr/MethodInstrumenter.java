package org.jacoco.core.internal.instr;

import org.jacoco.core.internal.flow.IFrame;
import org.jacoco.core.internal.flow.LabelInfo;
import org.jacoco.core.internal.flow.MethodProbesVisitor;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

/* JADX INFO: loaded from: classes5.dex */
class MethodInstrumenter extends MethodProbesVisitor {
    private final IProbeInserter probeInserter;

    public MethodInstrumenter(MethodVisitor methodVisitor, IProbeInserter iProbeInserter) {
        super(methodVisitor);
        this.probeInserter = iProbeInserter;
    }

    private Label createIntermediate(Label label) {
        if (LabelInfo.getProbeId(label) == -1) {
            return label;
        }
        if (LabelInfo.isDone(label)) {
            return LabelInfo.getIntermediateLabel(label);
        }
        Label label2 = new Label();
        LabelInfo.setIntermediateLabel(label, label2);
        LabelInfo.setDone(label);
        return label2;
    }

    private Label[] createIntermediates(Label[] labelArr) {
        Label[] labelArr2 = new Label[labelArr.length];
        for (int i = 0; i < labelArr.length; i++) {
            labelArr2[i] = createIntermediate(labelArr[i]);
        }
        return labelArr2;
    }

    private int getInverted(int i) {
        if (i == 198) {
            return Opcodes.IFNONNULL;
        }
        if (i == 199) {
            return Opcodes.IFNULL;
        }
        switch (i) {
            case 153:
                return 154;
            case 154:
                return 153;
            case 155:
                return 156;
            case 156:
                return 155;
            case 157:
                return 158;
            case 158:
                return 157;
            case Opcodes.IF_ICMPEQ /* 159 */:
                return 160;
            case 160:
                return Opcodes.IF_ICMPEQ;
            case Opcodes.IF_ICMPLT /* 161 */:
                return Opcodes.IF_ICMPGE;
            case Opcodes.IF_ICMPGE /* 162 */:
                return Opcodes.IF_ICMPLT;
            case Opcodes.IF_ICMPGT /* 163 */:
                return Opcodes.IF_ICMPLE;
            case Opcodes.IF_ICMPLE /* 164 */:
                return Opcodes.IF_ICMPGT;
            case Opcodes.IF_ACMPEQ /* 165 */:
                return Opcodes.IF_ACMPNE;
            case Opcodes.IF_ACMPNE /* 166 */:
                return Opcodes.IF_ACMPEQ;
            default:
                throw new IllegalArgumentException();
        }
    }

    private void insertIntermediateProbe(Label label, IFrame iFrame) {
        int probeId = LabelInfo.getProbeId(label);
        if (probeId == -1 || LabelInfo.isDone(label)) {
            return;
        }
        this.mv.visitLabel(LabelInfo.getIntermediateLabel(label));
        iFrame.accept(this.mv);
        this.probeInserter.insertProbe(probeId);
        this.mv.visitJumpInsn(Opcodes.GOTO, label);
        LabelInfo.setDone(label);
    }

    private void insertIntermediateProbes(Label label, Label[] labelArr, IFrame iFrame) {
        LabelInfo.resetDone(label);
        LabelInfo.resetDone(labelArr);
        insertIntermediateProbe(label, iFrame);
        for (Label label2 : labelArr) {
            insertIntermediateProbe(label2, iFrame);
        }
    }

    @Override // org.jacoco.core.internal.flow.MethodProbesVisitor
    public void visitInsnWithProbe(int i, int i2) {
        this.probeInserter.insertProbe(i2);
        this.mv.visitInsn(i);
    }

    @Override // org.jacoco.core.internal.flow.MethodProbesVisitor
    public void visitJumpInsnWithProbe(int i, Label label, int i2, IFrame iFrame) {
        if (i == 167) {
            this.probeInserter.insertProbe(i2);
            this.mv.visitJumpInsn(Opcodes.GOTO, label);
            return;
        }
        Label label2 = new Label();
        this.mv.visitJumpInsn(getInverted(i), label2);
        this.probeInserter.insertProbe(i2);
        this.mv.visitJumpInsn(Opcodes.GOTO, label);
        this.mv.visitLabel(label2);
        iFrame.accept(this.mv);
    }

    @Override // org.jacoco.core.internal.flow.MethodProbesVisitor
    public void visitLookupSwitchInsnWithProbes(Label label, int[] iArr, Label[] labelArr, IFrame iFrame) {
        LabelInfo.resetDone(label);
        LabelInfo.resetDone(labelArr);
        this.mv.visitLookupSwitchInsn(createIntermediate(label), iArr, createIntermediates(labelArr));
        insertIntermediateProbes(label, labelArr, iFrame);
    }

    @Override // org.jacoco.core.internal.flow.MethodProbesVisitor
    public void visitProbe(int i) {
        this.probeInserter.insertProbe(i);
    }

    @Override // org.jacoco.core.internal.flow.MethodProbesVisitor
    public void visitTableSwitchInsnWithProbes(int i, int i2, Label label, Label[] labelArr, IFrame iFrame) {
        LabelInfo.resetDone(label);
        LabelInfo.resetDone(labelArr);
        this.mv.visitTableSwitchInsn(i, i2, createIntermediate(label), createIntermediates(labelArr));
        insertIntermediateProbes(label, labelArr, iFrame);
    }
}
