package org.objectweb.asm.commons;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.InsnList;
import org.objectweb.asm.tree.InsnNode;
import org.objectweb.asm.tree.JumpInsnNode;
import org.objectweb.asm.tree.LabelNode;
import org.objectweb.asm.tree.LocalVariableNode;
import org.objectweb.asm.tree.LookupSwitchInsnNode;
import org.objectweb.asm.tree.MethodNode;
import org.objectweb.asm.tree.TableSwitchInsnNode;
import org.objectweb.asm.tree.TryCatchBlockNode;

/* JADX INFO: loaded from: classes5.dex */
public class JSRInlinerAdapter extends MethodNode implements Opcodes {
    private final BitSet mainSubroutineInsns;
    final BitSet sharedSubroutineInsns;
    private final Map<LabelNode, BitSet> subroutinesInsns;

    public class Instantiation extends AbstractMap<LabelNode, LabelNode> {
        final Map<LabelNode, LabelNode> clonedLabels;
        final Instantiation parent;
        final LabelNode returnLabel;
        final BitSet subroutineInsns;

        public Instantiation(Instantiation instantiation, BitSet bitSet) {
            for (Instantiation instantiation2 = instantiation; instantiation2 != null; instantiation2 = instantiation2.parent) {
                if (instantiation2.subroutineInsns == bitSet) {
                    throw new IllegalArgumentException("Recursive invocation of " + bitSet);
                }
            }
            this.parent = instantiation;
            this.subroutineInsns = bitSet;
            this.returnLabel = instantiation == null ? null : new LabelNode();
            this.clonedLabels = new HashMap();
            LabelNode labelNode = null;
            for (int i = 0; i < JSRInlinerAdapter.this.instructions.size(); i++) {
                AbstractInsnNode abstractInsnNode = JSRInlinerAdapter.this.instructions.get(i);
                if (abstractInsnNode.getType() == 8) {
                    LabelNode labelNode2 = (LabelNode) abstractInsnNode;
                    labelNode = labelNode == null ? new LabelNode() : labelNode;
                    this.clonedLabels.put(labelNode2, labelNode);
                } else if (findOwner(i) == this) {
                    labelNode = null;
                }
            }
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<Map.Entry<LabelNode, LabelNode>> entrySet() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean equals(Object obj) {
            throw new UnsupportedOperationException();
        }

        public Instantiation findOwner(int i) {
            if (!this.subroutineInsns.get(i)) {
                return null;
            }
            if (!JSRInlinerAdapter.this.sharedSubroutineInsns.get(i)) {
                return this;
            }
            Instantiation instantiation = this;
            for (Instantiation instantiation2 = this.parent; instantiation2 != null; instantiation2 = instantiation2.parent) {
                if (instantiation2.subroutineInsns.get(i)) {
                    instantiation = instantiation2;
                }
            }
            return instantiation;
        }

        public LabelNode getClonedLabel(LabelNode labelNode) {
            return this.clonedLabels.get(labelNode);
        }

        public LabelNode getClonedLabelForJumpInsn(LabelNode labelNode) {
            return findOwner(JSRInlinerAdapter.this.instructions.indexOf(labelNode)).clonedLabels.get(labelNode);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int hashCode() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public LabelNode get(Object obj) {
            return getClonedLabelForJumpInsn((LabelNode) obj);
        }
    }

    public JSRInlinerAdapter(MethodVisitor methodVisitor, int i, String str, String str2, String str3, String[] strArr) {
        this(589824, methodVisitor, i, str, str2, str3, strArr);
        if (getClass() != JSRInlinerAdapter.class) {
            throw new IllegalStateException();
        }
    }

    private void emitCode() {
        LinkedList linkedList = new LinkedList();
        linkedList.add(new Instantiation(null, this.mainSubroutineInsns));
        InsnList insnList = new InsnList();
        List<TryCatchBlockNode> arrayList = new ArrayList<>();
        List<LocalVariableNode> arrayList2 = new ArrayList<>();
        while (!linkedList.isEmpty()) {
            emitInstantiation((Instantiation) linkedList.removeFirst(), linkedList, insnList, arrayList, arrayList2);
        }
        this.instructions = insnList;
        this.tryCatchBlocks = arrayList;
        this.localVariables = arrayList2;
    }

    private void emitInstantiation(Instantiation instantiation, List<Instantiation> list, InsnList insnList, List<TryCatchBlockNode> list2, List<LocalVariableNode> list3) {
        LabelNode labelNode = null;
        for (int i = 0; i < this.instructions.size(); i++) {
            AbstractInsnNode abstractInsnNode = this.instructions.get(i);
            if (abstractInsnNode.getType() == 8) {
                LabelNode clonedLabel = instantiation.getClonedLabel((LabelNode) abstractInsnNode);
                if (clonedLabel != labelNode) {
                    insnList.add(clonedLabel);
                    labelNode = clonedLabel;
                }
            } else if (instantiation.findOwner(i) != instantiation) {
                continue;
            } else if (abstractInsnNode.getOpcode() == 169) {
                LabelNode labelNode2 = null;
                for (Instantiation instantiation2 = instantiation; instantiation2 != null; instantiation2 = instantiation2.parent) {
                    if (instantiation2.subroutineInsns.get(i)) {
                        labelNode2 = instantiation2.returnLabel;
                    }
                }
                if (labelNode2 == null) {
                    throw new IllegalArgumentException("Instruction #" + i + " is a RET not owned by any subroutine");
                }
                insnList.add(new JumpInsnNode(Opcodes.GOTO, labelNode2));
            } else if (abstractInsnNode.getOpcode() == 168) {
                LabelNode labelNode3 = ((JumpInsnNode) abstractInsnNode).label;
                Instantiation instantiation3 = new Instantiation(instantiation, this.subroutinesInsns.get(labelNode3));
                LabelNode clonedLabelForJumpInsn = instantiation3.getClonedLabelForJumpInsn(labelNode3);
                insnList.add(new InsnNode(1));
                insnList.add(new JumpInsnNode(Opcodes.GOTO, clonedLabelForJumpInsn));
                insnList.add(instantiation3.returnLabel);
                list.add(instantiation3);
            } else {
                insnList.add(abstractInsnNode.clone(instantiation));
            }
        }
        for (TryCatchBlockNode tryCatchBlockNode : this.tryCatchBlocks) {
            LabelNode clonedLabel2 = instantiation.getClonedLabel(tryCatchBlockNode.start);
            LabelNode clonedLabel3 = instantiation.getClonedLabel(tryCatchBlockNode.end);
            if (clonedLabel2 != clonedLabel3) {
                LabelNode clonedLabelForJumpInsn2 = instantiation.getClonedLabelForJumpInsn(tryCatchBlockNode.handler);
                if (clonedLabel2 == null || clonedLabel3 == null || clonedLabelForJumpInsn2 == null) {
                    throw new AssertionError("Internal error!");
                }
                list2.add(new TryCatchBlockNode(clonedLabel2, clonedLabel3, clonedLabelForJumpInsn2, tryCatchBlockNode.type));
            }
        }
        for (LocalVariableNode localVariableNode : this.localVariables) {
            LabelNode clonedLabel4 = instantiation.getClonedLabel(localVariableNode.start);
            LabelNode clonedLabel5 = instantiation.getClonedLabel(localVariableNode.end);
            if (clonedLabel4 != clonedLabel5) {
                list3.add(new LocalVariableNode(localVariableNode.name, localVariableNode.desc, localVariableNode.signature, clonedLabel4, clonedLabel5, localVariableNode.index));
            }
        }
    }

    private void findReachableInsns(int i, BitSet bitSet, BitSet bitSet2) {
        while (i < this.instructions.size() && !bitSet.get(i)) {
            bitSet.set(i);
            if (bitSet2.get(i)) {
                this.sharedSubroutineInsns.set(i);
            }
            bitSet2.set(i);
            AbstractInsnNode abstractInsnNode = this.instructions.get(i);
            if (abstractInsnNode.getType() == 7 && abstractInsnNode.getOpcode() != 168) {
                findReachableInsns(this.instructions.indexOf(((JumpInsnNode) abstractInsnNode).label), bitSet, bitSet2);
            } else if (abstractInsnNode.getType() == 11) {
                TableSwitchInsnNode tableSwitchInsnNode = (TableSwitchInsnNode) abstractInsnNode;
                findReachableInsns(this.instructions.indexOf(tableSwitchInsnNode.dflt), bitSet, bitSet2);
                Iterator<LabelNode> it = tableSwitchInsnNode.labels.iterator();
                while (it.hasNext()) {
                    findReachableInsns(this.instructions.indexOf(it.next()), bitSet, bitSet2);
                }
            } else if (abstractInsnNode.getType() == 12) {
                LookupSwitchInsnNode lookupSwitchInsnNode = (LookupSwitchInsnNode) abstractInsnNode;
                findReachableInsns(this.instructions.indexOf(lookupSwitchInsnNode.dflt), bitSet, bitSet2);
                Iterator<LabelNode> it2 = lookupSwitchInsnNode.labels.iterator();
                while (it2.hasNext()) {
                    findReachableInsns(this.instructions.indexOf(it2.next()), bitSet, bitSet2);
                }
            }
            int opcode = this.instructions.get(i).getOpcode();
            if (opcode != 167 && opcode != 191) {
                switch (opcode) {
                    case Opcodes.RET /* 169 */:
                    case Opcodes.TABLESWITCH /* 170 */:
                    case Opcodes.LOOKUPSWITCH /* 171 */:
                    case Opcodes.IRETURN /* 172 */:
                    case 173:
                    case Opcodes.FRETURN /* 174 */:
                    case Opcodes.DRETURN /* 175 */:
                    case Opcodes.ARETURN /* 176 */:
                    case Opcodes.RETURN /* 177 */:
                        return;
                    default:
                        i++;
                        break;
                }
            } else {
                return;
            }
        }
    }

    private void findSubroutineInsns(int i, BitSet bitSet, BitSet bitSet2) {
        boolean z;
        findReachableInsns(i, bitSet, bitSet2);
        do {
            z = false;
            for (TryCatchBlockNode tryCatchBlockNode : this.tryCatchBlocks) {
                int iIndexOf = this.instructions.indexOf(tryCatchBlockNode.handler);
                if (!bitSet.get(iIndexOf)) {
                    int iIndexOf2 = this.instructions.indexOf(tryCatchBlockNode.start);
                    int iIndexOf3 = this.instructions.indexOf(tryCatchBlockNode.end);
                    int iNextSetBit = bitSet.nextSetBit(iIndexOf2);
                    if (iNextSetBit >= iIndexOf2 && iNextSetBit < iIndexOf3) {
                        findReachableInsns(iIndexOf, bitSet, bitSet2);
                        z = true;
                    }
                }
            }
        } while (z);
    }

    private void findSubroutinesInsns() {
        BitSet bitSet = new BitSet();
        findSubroutineInsns(0, this.mainSubroutineInsns, bitSet);
        for (Map.Entry<LabelNode, BitSet> entry : this.subroutinesInsns.entrySet()) {
            LabelNode key = entry.getKey();
            findSubroutineInsns(this.instructions.indexOf(key), entry.getValue(), bitSet);
        }
    }

    @Override // org.objectweb.asm.tree.MethodNode, org.objectweb.asm.MethodVisitor
    public void visitEnd() {
        if (!this.subroutinesInsns.isEmpty()) {
            findSubroutinesInsns();
            emitCode();
        }
        MethodVisitor methodVisitor = this.mv;
        if (methodVisitor != null) {
            accept(methodVisitor);
        }
    }

    @Override // org.objectweb.asm.tree.MethodNode, org.objectweb.asm.MethodVisitor
    public void visitJumpInsn(int i, Label label) {
        super.visitJumpInsn(i, label);
        LabelNode labelNode = ((JumpInsnNode) this.instructions.getLast()).label;
        if (i != 168 || this.subroutinesInsns.containsKey(labelNode)) {
            return;
        }
        this.subroutinesInsns.put(labelNode, new BitSet());
    }

    public JSRInlinerAdapter(int i, MethodVisitor methodVisitor, int i2, String str, String str2, String str3, String[] strArr) {
        super(i, i2, str, str2, str3, strArr);
        this.mainSubroutineInsns = new BitSet();
        this.subroutinesInsns = new HashMap();
        this.sharedSubroutineInsns = new BitSet();
        this.mv = methodVisitor;
    }
}
