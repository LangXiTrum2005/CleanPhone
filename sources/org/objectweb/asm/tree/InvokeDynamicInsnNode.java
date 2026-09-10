package org.objectweb.asm.tree;

import java.util.Map;
import org.objectweb.asm.Handle;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

/* JADX INFO: loaded from: classes5.dex */
public class InvokeDynamicInsnNode extends AbstractInsnNode {
    public Handle bsm;
    public Object[] bsmArgs;
    public String desc;
    public String name;

    public InvokeDynamicInsnNode(String str, String str2, Handle handle, Object... objArr) {
        super(Opcodes.INVOKEDYNAMIC);
        this.name = str;
        this.desc = str2;
        this.bsm = handle;
        this.bsmArgs = objArr;
    }

    @Override // org.objectweb.asm.tree.AbstractInsnNode
    public void accept(MethodVisitor methodVisitor) {
        methodVisitor.visitInvokeDynamicInsn(this.name, this.desc, this.bsm, this.bsmArgs);
        acceptAnnotations(methodVisitor);
    }

    @Override // org.objectweb.asm.tree.AbstractInsnNode
    public AbstractInsnNode clone(Map<LabelNode, LabelNode> map) {
        return new InvokeDynamicInsnNode(this.name, this.desc, this.bsm, this.bsmArgs).cloneAnnotations(this);
    }

    @Override // org.objectweb.asm.tree.AbstractInsnNode
    public int getType() {
        return 6;
    }
}
