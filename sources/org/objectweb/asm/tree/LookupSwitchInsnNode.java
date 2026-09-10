package org.objectweb.asm.tree;

import java.util.List;
import java.util.Map;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

/* JADX INFO: loaded from: classes5.dex */
public class LookupSwitchInsnNode extends AbstractInsnNode {
    public LabelNode dflt;
    public List<Integer> keys;
    public List<LabelNode> labels;

    public LookupSwitchInsnNode(LabelNode labelNode, int[] iArr, LabelNode[] labelNodeArr) {
        super(Opcodes.LOOKUPSWITCH);
        this.dflt = labelNode;
        this.keys = Util.asArrayList(iArr);
        this.labels = Util.asArrayList(labelNodeArr);
    }

    @Override // org.objectweb.asm.tree.AbstractInsnNode
    public void accept(MethodVisitor methodVisitor) {
        int size = this.keys.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = this.keys.get(i).intValue();
        }
        int size2 = this.labels.size();
        Label[] labelArr = new Label[size2];
        for (int i2 = 0; i2 < size2; i2++) {
            labelArr[i2] = this.labels.get(i2).getLabel();
        }
        methodVisitor.visitLookupSwitchInsn(this.dflt.getLabel(), iArr, labelArr);
        acceptAnnotations(methodVisitor);
    }

    @Override // org.objectweb.asm.tree.AbstractInsnNode
    public AbstractInsnNode clone(Map<LabelNode, LabelNode> map) {
        LookupSwitchInsnNode lookupSwitchInsnNode = new LookupSwitchInsnNode(AbstractInsnNode.clone(this.dflt, map), null, AbstractInsnNode.clone(this.labels, map));
        lookupSwitchInsnNode.keys.addAll(this.keys);
        return lookupSwitchInsnNode.cloneAnnotations(this);
    }

    @Override // org.objectweb.asm.tree.AbstractInsnNode
    public int getType() {
        return 12;
    }
}
