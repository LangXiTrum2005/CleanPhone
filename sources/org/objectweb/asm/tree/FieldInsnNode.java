package org.objectweb.asm.tree;

import java.util.Map;
import org.objectweb.asm.MethodVisitor;

/* JADX INFO: loaded from: classes5.dex */
public class FieldInsnNode extends AbstractInsnNode {
    public String desc;
    public String name;
    public String owner;

    public FieldInsnNode(int i, String str, String str2, String str3) {
        super(i);
        this.owner = str;
        this.name = str2;
        this.desc = str3;
    }

    @Override // org.objectweb.asm.tree.AbstractInsnNode
    public void accept(MethodVisitor methodVisitor) {
        methodVisitor.visitFieldInsn(this.opcode, this.owner, this.name, this.desc);
        acceptAnnotations(methodVisitor);
    }

    @Override // org.objectweb.asm.tree.AbstractInsnNode
    public AbstractInsnNode clone(Map<LabelNode, LabelNode> map) {
        return new FieldInsnNode(this.opcode, this.owner, this.name, this.desc).cloneAnnotations(this);
    }

    @Override // org.objectweb.asm.tree.AbstractInsnNode
    public int getType() {
        return 4;
    }

    public void setOpcode(int i) {
        this.opcode = i;
    }
}
