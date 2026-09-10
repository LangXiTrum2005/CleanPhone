package org.jacoco.core.internal.analysis;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.jacoco.core.internal.flow.LabelInfo;
import org.objectweb.asm.Label;
import org.objectweb.asm.tree.AbstractInsnNode;

/* JADX INFO: loaded from: classes5.dex */
class InstructionsBuilder {
    private final boolean[] probes;
    private int currentLine = -1;
    private Instruction currentInsn = null;
    private final Map<AbstractInsnNode, Instruction> instructions = new HashMap();
    private final List<Label> currentLabel = new ArrayList(2);
    private final List<Jump> jumps = new ArrayList();

    public static class Jump {
        private final int branch;
        private final Instruction source;
        private final Label target;

        public Jump(Instruction instruction, Label label, int i) {
            this.source = instruction;
            this.target = label;
            this.branch = i;
        }

        public void wire() {
            this.source.addBranch(LabelInfo.getInstruction(this.target), this.branch);
        }
    }

    public InstructionsBuilder(boolean[] zArr) {
        this.probes = zArr;
    }

    public void addInstruction(AbstractInsnNode abstractInsnNode) {
        Instruction instruction = new Instruction(this.currentLine);
        int size = this.currentLabel.size();
        if (size > 0) {
            while (true) {
                size--;
                if (size < 0) {
                    break;
                } else {
                    LabelInfo.setInstruction(this.currentLabel.get(size), instruction);
                }
            }
            this.currentLabel.clear();
        }
        Instruction instruction2 = this.currentInsn;
        if (instruction2 != null) {
            instruction2.addBranch(instruction, 0);
        }
        this.currentInsn = instruction;
        this.instructions.put(abstractInsnNode, instruction);
    }

    public void addJump(Label label, int i) {
        this.jumps.add(new Jump(this.currentInsn, label, i));
    }

    public void addLabel(Label label) {
        this.currentLabel.add(label);
        if (LabelInfo.isSuccessor(label)) {
            return;
        }
        noSuccessor();
    }

    public void addProbe(int i, int i2) {
        boolean[] zArr = this.probes;
        this.currentInsn.addBranch(zArr != null && zArr[i], i2);
    }

    public Map<AbstractInsnNode, Instruction> getInstructions() {
        Iterator<Jump> it = this.jumps.iterator();
        while (it.hasNext()) {
            it.next().wire();
        }
        return this.instructions;
    }

    public void noSuccessor() {
        this.currentInsn = null;
    }

    public void setCurrentLine(int i) {
        this.currentLine = i;
    }
}
