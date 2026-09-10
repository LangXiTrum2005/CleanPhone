package org.objectweb.asm.tree;

import java.util.Map;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;

/* JADX INFO: loaded from: classes5.dex */
public class LabelNode extends AbstractInsnNode {
    private Label value;

    public LabelNode() {
        super(-1);
    }

    @Override // org.objectweb.asm.tree.AbstractInsnNode
    public void accept(MethodVisitor methodVisitor) {
        methodVisitor.visitLabel(getLabel());
    }

    @Override // org.objectweb.asm.tree.AbstractInsnNode
    public AbstractInsnNode clone(Map<LabelNode, LabelNode> map) {
        return map.get(this);
    }

    public Label getLabel() {
        if (this.value == null) {
            this.value = new Label();
        }
        return this.value;
    }

    @Override // org.objectweb.asm.tree.AbstractInsnNode
    public int getType() {
        return 8;
    }

    public void resetLabel() {
        this.value = null;
    }

    public LabelNode(Label label) {
        super(-1);
        this.value = label;
    }
}
