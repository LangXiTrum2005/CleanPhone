package org.objectweb.asm.tree;

import java.util.Map;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

/* JADX INFO: loaded from: classes5.dex */
public class MultiANewArrayInsnNode extends AbstractInsnNode {
    public String desc;
    public int dims;

    public MultiANewArrayInsnNode(String str, int i) {
        super(Opcodes.MULTIANEWARRAY);
        this.desc = str;
        this.dims = i;
    }

    @Override // org.objectweb.asm.tree.AbstractInsnNode
    public void accept(MethodVisitor methodVisitor) {
        methodVisitor.visitMultiANewArrayInsn(this.desc, this.dims);
        acceptAnnotations(methodVisitor);
    }

    @Override // org.objectweb.asm.tree.AbstractInsnNode
    public AbstractInsnNode clone(Map<LabelNode, LabelNode> map) {
        return new MultiANewArrayInsnNode(this.desc, this.dims).cloneAnnotations(this);
    }

    @Override // org.objectweb.asm.tree.AbstractInsnNode
    public int getType() {
        return 13;
    }
}
