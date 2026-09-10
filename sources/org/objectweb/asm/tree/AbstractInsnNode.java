package org.objectweb.asm.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.objectweb.asm.MethodVisitor;

/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractInsnNode {
    public static final int FIELD_INSN = 4;
    public static final int FRAME = 14;
    public static final int IINC_INSN = 10;
    public static final int INSN = 0;
    public static final int INT_INSN = 1;
    public static final int INVOKE_DYNAMIC_INSN = 6;
    public static final int JUMP_INSN = 7;
    public static final int LABEL = 8;
    public static final int LDC_INSN = 9;
    public static final int LINE = 15;
    public static final int LOOKUPSWITCH_INSN = 12;
    public static final int METHOD_INSN = 5;
    public static final int MULTIANEWARRAY_INSN = 13;
    public static final int TABLESWITCH_INSN = 11;
    public static final int TYPE_INSN = 3;
    public static final int VAR_INSN = 2;
    int index = -1;
    public List<TypeAnnotationNode> invisibleTypeAnnotations;
    AbstractInsnNode nextInsn;
    protected int opcode;
    AbstractInsnNode previousInsn;
    public List<TypeAnnotationNode> visibleTypeAnnotations;

    public AbstractInsnNode(int i) {
        this.opcode = i;
    }

    public static LabelNode clone(LabelNode labelNode, Map<LabelNode, LabelNode> map) {
        return map.get(labelNode);
    }

    public abstract void accept(MethodVisitor methodVisitor);

    public final void acceptAnnotations(MethodVisitor methodVisitor) {
        List<TypeAnnotationNode> list = this.visibleTypeAnnotations;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                TypeAnnotationNode typeAnnotationNode = this.visibleTypeAnnotations.get(i);
                typeAnnotationNode.accept(methodVisitor.visitInsnAnnotation(typeAnnotationNode.typeRef, typeAnnotationNode.typePath, typeAnnotationNode.desc, true));
            }
        }
        List<TypeAnnotationNode> list2 = this.invisibleTypeAnnotations;
        if (list2 != null) {
            int size2 = list2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                TypeAnnotationNode typeAnnotationNode2 = this.invisibleTypeAnnotations.get(i2);
                typeAnnotationNode2.accept(methodVisitor.visitInsnAnnotation(typeAnnotationNode2.typeRef, typeAnnotationNode2.typePath, typeAnnotationNode2.desc, false));
            }
        }
    }

    public abstract AbstractInsnNode clone(Map<LabelNode, LabelNode> map);

    public final AbstractInsnNode cloneAnnotations(AbstractInsnNode abstractInsnNode) {
        if (abstractInsnNode.visibleTypeAnnotations != null) {
            this.visibleTypeAnnotations = new ArrayList();
            int size = abstractInsnNode.visibleTypeAnnotations.size();
            for (int i = 0; i < size; i++) {
                TypeAnnotationNode typeAnnotationNode = abstractInsnNode.visibleTypeAnnotations.get(i);
                TypeAnnotationNode typeAnnotationNode2 = new TypeAnnotationNode(typeAnnotationNode.typeRef, typeAnnotationNode.typePath, typeAnnotationNode.desc);
                typeAnnotationNode.accept(typeAnnotationNode2);
                this.visibleTypeAnnotations.add(typeAnnotationNode2);
            }
        }
        if (abstractInsnNode.invisibleTypeAnnotations != null) {
            this.invisibleTypeAnnotations = new ArrayList();
            int size2 = abstractInsnNode.invisibleTypeAnnotations.size();
            for (int i2 = 0; i2 < size2; i2++) {
                TypeAnnotationNode typeAnnotationNode3 = abstractInsnNode.invisibleTypeAnnotations.get(i2);
                TypeAnnotationNode typeAnnotationNode4 = new TypeAnnotationNode(typeAnnotationNode3.typeRef, typeAnnotationNode3.typePath, typeAnnotationNode3.desc);
                typeAnnotationNode3.accept(typeAnnotationNode4);
                this.invisibleTypeAnnotations.add(typeAnnotationNode4);
            }
        }
        return this;
    }

    public AbstractInsnNode getNext() {
        return this.nextInsn;
    }

    public int getOpcode() {
        return this.opcode;
    }

    public AbstractInsnNode getPrevious() {
        return this.previousInsn;
    }

    public abstract int getType();

    public static LabelNode[] clone(List<LabelNode> list, Map<LabelNode, LabelNode> map) {
        int size = list.size();
        LabelNode[] labelNodeArr = new LabelNode[size];
        for (int i = 0; i < size; i++) {
            labelNodeArr[i] = map.get(list.get(i));
        }
        return labelNodeArr;
    }
}
