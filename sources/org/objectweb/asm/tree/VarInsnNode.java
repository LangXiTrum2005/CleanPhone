package org.objectweb.asm.tree;

import java.util.Map;
import org.objectweb.asm.MethodVisitor;

/* JADX INFO: loaded from: classes5.dex */
public class VarInsnNode extends AbstractInsnNode {
    public int var;

    public VarInsnNode(int i, int i2) {
        super(i);
        this.var = i2;
    }

    @Override // org.objectweb.asm.tree.AbstractInsnNode
    public void accept(MethodVisitor methodVisitor) {
        methodVisitor.visitVarInsn(this.opcode, this.var);
        acceptAnnotations(methodVisitor);
    }

    @Override // org.objectweb.asm.tree.AbstractInsnNode
    public AbstractInsnNode clone(Map<LabelNode, LabelNode> map) {
        return new VarInsnNode(this.opcode, this.var).cloneAnnotations(this);
    }

    @Override // org.objectweb.asm.tree.AbstractInsnNode
    public int getType() {
        return 2;
    }

    public void setOpcode(int i) {
        this.opcode = i;
    }
}
