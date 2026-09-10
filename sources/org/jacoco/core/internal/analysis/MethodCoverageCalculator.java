package org.jacoco.core.internal.analysis;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.jacoco.core.internal.analysis.filter.IFilterOutput;
import org.objectweb.asm.tree.AbstractInsnNode;

/* JADX INFO: loaded from: classes5.dex */
class MethodCoverageCalculator implements IFilterOutput {
    private final Map<AbstractInsnNode, Instruction> instructions;
    private final Set<AbstractInsnNode> ignored = new HashSet();
    private final Map<AbstractInsnNode, AbstractInsnNode> merged = new HashMap();
    private final Map<AbstractInsnNode, Set<AbstractInsnNode>> replacements = new HashMap();

    public MethodCoverageCalculator(Map<AbstractInsnNode, Instruction> map) {
        this.instructions = map;
    }

    private void applyMerges() {
        for (Map.Entry<AbstractInsnNode, AbstractInsnNode> entry : this.merged.entrySet()) {
            AbstractInsnNode key = entry.getKey();
            Instruction instruction = this.instructions.get(key);
            AbstractInsnNode abstractInsnNodeFindRepresentative = findRepresentative(key);
            this.ignored.add(key);
            Map<AbstractInsnNode, Instruction> map = this.instructions;
            map.put(abstractInsnNodeFindRepresentative, map.get(abstractInsnNodeFindRepresentative).merge(instruction));
            entry.setValue(abstractInsnNodeFindRepresentative);
        }
        for (Map.Entry<AbstractInsnNode, AbstractInsnNode> entry2 : this.merged.entrySet()) {
            this.instructions.put(entry2.getKey(), this.instructions.get(entry2.getValue()));
        }
    }

    private void applyReplacements() {
        for (Map.Entry<AbstractInsnNode, Set<AbstractInsnNode>> entry : this.replacements.entrySet()) {
            Set<AbstractInsnNode> value = entry.getValue();
            ArrayList arrayList = new ArrayList(value.size());
            Iterator<AbstractInsnNode> it = value.iterator();
            while (it.hasNext()) {
                arrayList.add(this.instructions.get(it.next()));
            }
            AbstractInsnNode key = entry.getKey();
            Map<AbstractInsnNode, Instruction> map = this.instructions;
            map.put(key, map.get(key).replaceBranches(arrayList));
        }
    }

    private void ensureCapacity(MethodCoverageImpl methodCoverageImpl) {
        int line;
        int i = -1;
        int i2 = -1;
        for (Map.Entry<AbstractInsnNode, Instruction> entry : this.instructions.entrySet()) {
            if (!this.ignored.contains(entry.getKey()) && (line = entry.getValue().getLine()) != -1) {
                if (i > line || i2 == -1) {
                    i = line;
                }
                if (i2 < line) {
                    i2 = line;
                }
            }
        }
        methodCoverageImpl.ensureCapacity(i, i2);
    }

    private AbstractInsnNode findRepresentative(AbstractInsnNode abstractInsnNode) {
        while (true) {
            AbstractInsnNode abstractInsnNode2 = this.merged.get(abstractInsnNode);
            if (abstractInsnNode2 == null) {
                return abstractInsnNode;
            }
            abstractInsnNode = abstractInsnNode2;
        }
    }

    public void calculate(MethodCoverageImpl methodCoverageImpl) {
        applyMerges();
        applyReplacements();
        ensureCapacity(methodCoverageImpl);
        for (Map.Entry<AbstractInsnNode, Instruction> entry : this.instructions.entrySet()) {
            if (!this.ignored.contains(entry.getKey())) {
                Instruction value = entry.getValue();
                methodCoverageImpl.increment(value.getInstructionCounter(), value.getBranchCounter(), value.getLine());
            }
        }
        methodCoverageImpl.incrementMethodCounter();
    }

    @Override // org.jacoco.core.internal.analysis.filter.IFilterOutput
    public void ignore(AbstractInsnNode abstractInsnNode, AbstractInsnNode abstractInsnNode2) {
        while (abstractInsnNode != abstractInsnNode2) {
            this.ignored.add(abstractInsnNode);
            abstractInsnNode = abstractInsnNode.getNext();
        }
        this.ignored.add(abstractInsnNode2);
    }

    @Override // org.jacoco.core.internal.analysis.filter.IFilterOutput
    public void merge(AbstractInsnNode abstractInsnNode, AbstractInsnNode abstractInsnNode2) {
        AbstractInsnNode abstractInsnNodeFindRepresentative = findRepresentative(abstractInsnNode);
        AbstractInsnNode abstractInsnNodeFindRepresentative2 = findRepresentative(abstractInsnNode2);
        if (abstractInsnNodeFindRepresentative != abstractInsnNodeFindRepresentative2) {
            this.merged.put(abstractInsnNodeFindRepresentative2, abstractInsnNodeFindRepresentative);
        }
    }

    @Override // org.jacoco.core.internal.analysis.filter.IFilterOutput
    public void replaceBranches(AbstractInsnNode abstractInsnNode, Set<AbstractInsnNode> set) {
        this.replacements.put(abstractInsnNode, set);
    }
}
