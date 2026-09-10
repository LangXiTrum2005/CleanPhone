package org.objectweb.asm.tree;

import java.util.Map;
import org.objectweb.asm.MethodVisitor;

/* JADX INFO: loaded from: classes5.dex */
public class TypeInsnNode extends AbstractInsnNode {
    public String desc;

    public TypeInsnNode(int i, String str) {
        super(i);
        this.desc = str;
    }

    @Override // org.objectweb.asm.tree.AbstractInsnNode
    public void accept(MethodVisitor methodVisitor) {
        methodVisitor.visitTypeInsn(this.opcode, this.desc);
        acceptAnnotations(methodVisitor);
    }

    @Override // org.objectweb.asm.tree.AbstractInsnNode
    public AbstractInsnNode clone(Map<LabelNode, LabelNode> map) {
        return new TypeInsnNode(this.opcode, this.desc).cloneAnnotations(this);
    }

    @Override // org.objectweb.asm.tree.AbstractInsnNode
    public int getType() {
        return 3;
    }

    public void setOpcode(int i) {
        this.opcode = i;
    }
}
