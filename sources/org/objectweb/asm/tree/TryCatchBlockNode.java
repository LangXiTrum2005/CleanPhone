package org.objectweb.asm.tree;

import java.util.List;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;

/* JADX INFO: loaded from: classes5.dex */
public class TryCatchBlockNode {
    public LabelNode end;
    public LabelNode handler;
    public List<TypeAnnotationNode> invisibleTypeAnnotations;
    public LabelNode start;
    public String type;
    public List<TypeAnnotationNode> visibleTypeAnnotations;

    public TryCatchBlockNode(LabelNode labelNode, LabelNode labelNode2, LabelNode labelNode3, String str) {
        this.start = labelNode;
        this.end = labelNode2;
        this.handler = labelNode3;
        this.type = str;
    }

    public void accept(MethodVisitor methodVisitor) {
        Label label = this.start.getLabel();
        Label label2 = this.end.getLabel();
        LabelNode labelNode = this.handler;
        methodVisitor.visitTryCatchBlock(label, label2, labelNode == null ? null : labelNode.getLabel(), this.type);
        List<TypeAnnotationNode> list = this.visibleTypeAnnotations;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                TypeAnnotationNode typeAnnotationNode = this.visibleTypeAnnotations.get(i);
                typeAnnotationNode.accept(methodVisitor.visitTryCatchAnnotation(typeAnnotationNode.typeRef, typeAnnotationNode.typePath, typeAnnotationNode.desc, true));
            }
        }
        List<TypeAnnotationNode> list2 = this.invisibleTypeAnnotations;
        if (list2 != null) {
            int size2 = list2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                TypeAnnotationNode typeAnnotationNode2 = this.invisibleTypeAnnotations.get(i2);
                typeAnnotationNode2.accept(methodVisitor.visitTryCatchAnnotation(typeAnnotationNode2.typeRef, typeAnnotationNode2.typePath, typeAnnotationNode2.desc, false));
            }
        }
    }

    public void updateIndex(int i) {
        int i2 = (i << 8) | 1107296256;
        List<TypeAnnotationNode> list = this.visibleTypeAnnotations;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                this.visibleTypeAnnotations.get(i3).typeRef = i2;
            }
        }
        List<TypeAnnotationNode> list2 = this.invisibleTypeAnnotations;
        if (list2 != null) {
            int size2 = list2.size();
            for (int i4 = 0; i4 < size2; i4++) {
                this.invisibleTypeAnnotations.get(i4).typeRef = i2;
            }
        }
    }
}
