package org.objectweb.asm.tree;

import java.util.List;
import java.util.Map;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

/* JADX INFO: loaded from: classes5.dex */
public class TableSwitchInsnNode extends AbstractInsnNode {
    public LabelNode dflt;
    public List<LabelNode> labels;
    public int max;
    public int min;

    public TableSwitchInsnNode(int i, int i2, LabelNode labelNode, LabelNode... labelNodeArr) {
        super(Opcodes.TABLESWITCH);
        this.min = i;
        this.max = i2;
        this.dflt = labelNode;
        this.labels = Util.asArrayList(labelNodeArr);
    }

    @Override // org.objectweb.asm.tree.AbstractInsnNode
    public void accept(MethodVisitor methodVisitor) {
        int size = this.labels.size();
        Label[] labelArr = new Label[size];
        for (int i = 0; i < size; i++) {
            labelArr[i] = this.labels.get(i).getLabel();
        }
        methodVisitor.visitTableSwitchInsn(this.min, this.max, this.dflt.getLabel(), labelArr);
        acceptAnnotations(methodVisitor);
    }

    @Override // org.objectweb.asm.tree.AbstractInsnNode
    public AbstractInsnNode clone(Map<LabelNode, LabelNode> map) {
        return new TableSwitchInsnNode(this.min, this.max, AbstractInsnNode.clone(this.dflt, map), AbstractInsnNode.clone(this.labels, map)).cloneAnnotations(this);
    }

    @Override // org.objectweb.asm.tree.AbstractInsnNode
    public int getType() {
        return 11;
    }
}
