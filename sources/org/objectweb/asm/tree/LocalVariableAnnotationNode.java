package org.objectweb.asm.tree;

import java.util.List;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.TypePath;

/* JADX INFO: loaded from: classes5.dex */
public class LocalVariableAnnotationNode extends TypeAnnotationNode {
    public List<LabelNode> end;
    public List<Integer> index;
    public List<LabelNode> start;

    public LocalVariableAnnotationNode(int i, TypePath typePath, LabelNode[] labelNodeArr, LabelNode[] labelNodeArr2, int[] iArr, String str) {
        this(589824, i, typePath, labelNodeArr, labelNodeArr2, iArr, str);
    }

    public void accept(MethodVisitor methodVisitor, boolean z) {
        int size = this.start.size();
        Label[] labelArr = new Label[size];
        Label[] labelArr2 = new Label[this.end.size()];
        int[] iArr = new int[this.index.size()];
        for (int i = 0; i < size; i++) {
            labelArr[i] = this.start.get(i).getLabel();
            labelArr2[i] = this.end.get(i).getLabel();
            iArr[i] = this.index.get(i).intValue();
        }
        accept(methodVisitor.visitLocalVariableAnnotation(this.typeRef, this.typePath, labelArr, labelArr2, iArr, this.desc, z));
    }

    public LocalVariableAnnotationNode(int i, int i2, TypePath typePath, LabelNode[] labelNodeArr, LabelNode[] labelNodeArr2, int[] iArr, String str) {
        super(i, i2, typePath, str);
        this.start = Util.asArrayList(labelNodeArr);
        this.end = Util.asArrayList(labelNodeArr2);
        this.index = Util.asArrayList(iArr);
    }
}
