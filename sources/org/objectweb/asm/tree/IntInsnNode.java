package org.objectweb.asm.tree;

import java.util.Map;
import org.objectweb.asm.MethodVisitor;

/* JADX INFO: loaded from: classes5.dex */
public class IntInsnNode extends AbstractInsnNode {
    public int operand;

    public IntInsnNode(int i, int i2) {
        super(i);
        this.operand = i2;
    }

    @Override // org.objectweb.asm.tree.AbstractInsnNode
    public void accept(MethodVisitor methodVisitor) {
        methodVisitor.visitIntInsn(this.opcode, this.operand);
        acceptAnnotations(methodVisitor);
    }

    @Override // org.objectweb.asm.tree.AbstractInsnNode
    public AbstractInsnNode clone(Map<LabelNode, LabelNode> map) {
        return new IntInsnNode(this.opcode, this.operand).cloneAnnotations(this);
    }

    @Override // org.objectweb.asm.tree.AbstractInsnNode
    public int getType() {
        return 1;
    }

    public void setOpcode(int i) {
        this.opcode = i;
    }
}
