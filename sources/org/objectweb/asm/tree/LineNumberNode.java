package org.objectweb.asm.tree;

import java.util.Map;
import org.objectweb.asm.MethodVisitor;

/* JADX INFO: loaded from: classes5.dex */
public class LineNumberNode extends AbstractInsnNode {
    public int line;
    public LabelNode start;

    public LineNumberNode(int i, LabelNode labelNode) {
        super(-1);
        this.line = i;
        this.start = labelNode;
    }

    @Override // org.objectweb.asm.tree.AbstractInsnNode
    public void accept(MethodVisitor methodVisitor) {
        methodVisitor.visitLineNumber(this.line, this.start.getLabel());
    }

    @Override // org.objectweb.asm.tree.AbstractInsnNode
    public AbstractInsnNode clone(Map<LabelNode, LabelNode> map) {
        return new LineNumberNode(this.line, AbstractInsnNode.clone(this.start, map));
    }

    @Override // org.objectweb.asm.tree.AbstractInsnNode
    public int getType() {
        return 15;
    }
}
