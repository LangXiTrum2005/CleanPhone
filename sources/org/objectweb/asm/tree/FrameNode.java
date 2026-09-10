package org.objectweb.asm.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.objectweb.asm.MethodVisitor;

/* JADX INFO: loaded from: classes5.dex */
public class FrameNode extends AbstractInsnNode {
    public List<Object> local;
    public List<Object> stack;
    public int type;

    private FrameNode() {
        super(-1);
    }

    private static Object[] asArray(List<Object> list) {
        int size = list.size();
        Object[] objArr = new Object[size];
        for (int i = 0; i < size; i++) {
            Object label = list.get(i);
            if (label instanceof LabelNode) {
                label = ((LabelNode) label).getLabel();
            }
            objArr[i] = label;
        }
        return objArr;
    }

    @Override // org.objectweb.asm.tree.AbstractInsnNode
    public void accept(MethodVisitor methodVisitor) {
        int i = this.type;
        if (i == -1 || i == 0) {
            methodVisitor.visitFrame(i, this.local.size(), asArray(this.local), this.stack.size(), asArray(this.stack));
            return;
        }
        if (i == 1) {
            methodVisitor.visitFrame(i, this.local.size(), asArray(this.local), 0, null);
            return;
        }
        if (i == 2) {
            methodVisitor.visitFrame(i, this.local.size(), null, 0, null);
        } else if (i == 3) {
            methodVisitor.visitFrame(i, 0, null, 0, null);
        } else {
            if (i != 4) {
                throw new IllegalArgumentException();
            }
            methodVisitor.visitFrame(i, 0, null, 1, asArray(this.stack));
        }
    }

    @Override // org.objectweb.asm.tree.AbstractInsnNode
    public AbstractInsnNode clone(Map<LabelNode, LabelNode> map) {
        FrameNode frameNode = new FrameNode();
        frameNode.type = this.type;
        if (this.local != null) {
            frameNode.local = new ArrayList();
            int size = this.local.size();
            for (int i = 0; i < size; i++) {
                Object obj = this.local.get(i);
                if (obj instanceof LabelNode) {
                    obj = map.get(obj);
                }
                frameNode.local.add(obj);
            }
        }
        if (this.stack != null) {
            frameNode.stack = new ArrayList();
            int size2 = this.stack.size();
            for (int i2 = 0; i2 < size2; i2++) {
                Object obj2 = this.stack.get(i2);
                if (obj2 instanceof LabelNode) {
                    obj2 = map.get(obj2);
                }
                frameNode.stack.add(obj2);
            }
        }
        return frameNode;
    }

    @Override // org.objectweb.asm.tree.AbstractInsnNode
    public int getType() {
        return 14;
    }

    public FrameNode(int i, int i2, Object[] objArr, int i3, Object[] objArr2) {
        super(-1);
        this.type = i;
        if (i == -1 || i == 0) {
            this.local = Util.asArrayList(i2, objArr);
            this.stack = Util.asArrayList(i3, objArr2);
            return;
        }
        if (i == 1) {
            this.local = Util.asArrayList(i2, objArr);
            return;
        }
        if (i == 2) {
            this.local = Util.asArrayList(i2);
        } else if (i != 3) {
            if (i != 4) {
                throw new IllegalArgumentException();
            }
            this.stack = Util.asArrayList(1, objArr2);
        }
    }
}
