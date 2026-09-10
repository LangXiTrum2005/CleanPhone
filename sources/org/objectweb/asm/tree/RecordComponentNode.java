package org.objectweb.asm.tree;

import java.util.List;
import org.objectweb.asm.AnnotationVisitor;
import org.objectweb.asm.Attribute;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.RecordComponentVisitor;
import org.objectweb.asm.TypePath;

/* JADX INFO: loaded from: classes5.dex */
public class RecordComponentNode extends RecordComponentVisitor {
    public List<Attribute> attrs;
    public String descriptor;
    public List<AnnotationNode> invisibleAnnotations;
    public List<TypeAnnotationNode> invisibleTypeAnnotations;
    public String name;
    public String signature;
    public List<AnnotationNode> visibleAnnotations;
    public List<TypeAnnotationNode> visibleTypeAnnotations;

    public RecordComponentNode(String str, String str2, String str3) {
        this(589824, str, str2, str3);
        if (getClass() != RecordComponentNode.class) {
            throw new IllegalStateException();
        }
    }

    public void accept(ClassVisitor classVisitor) {
        RecordComponentVisitor recordComponentVisitorVisitRecordComponent = classVisitor.visitRecordComponent(this.name, this.descriptor, this.signature);
        if (recordComponentVisitorVisitRecordComponent == null) {
            return;
        }
        List<AnnotationNode> list = this.visibleAnnotations;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                AnnotationNode annotationNode = this.visibleAnnotations.get(i);
                annotationNode.accept(recordComponentVisitorVisitRecordComponent.visitAnnotation(annotationNode.desc, true));
            }
        }
        List<AnnotationNode> list2 = this.invisibleAnnotations;
        if (list2 != null) {
            int size2 = list2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                AnnotationNode annotationNode2 = this.invisibleAnnotations.get(i2);
                annotationNode2.accept(recordComponentVisitorVisitRecordComponent.visitAnnotation(annotationNode2.desc, false));
            }
        }
        List<TypeAnnotationNode> list3 = this.visibleTypeAnnotations;
        if (list3 != null) {
            int size3 = list3.size();
            for (int i3 = 0; i3 < size3; i3++) {
                TypeAnnotationNode typeAnnotationNode = this.visibleTypeAnnotations.get(i3);
                typeAnnotationNode.accept(recordComponentVisitorVisitRecordComponent.visitTypeAnnotation(typeAnnotationNode.typeRef, typeAnnotationNode.typePath, typeAnnotationNode.desc, true));
            }
        }
        List<TypeAnnotationNode> list4 = this.invisibleTypeAnnotations;
        if (list4 != null) {
            int size4 = list4.size();
            for (int i4 = 0; i4 < size4; i4++) {
                TypeAnnotationNode typeAnnotationNode2 = this.invisibleTypeAnnotations.get(i4);
                typeAnnotationNode2.accept(recordComponentVisitorVisitRecordComponent.visitTypeAnnotation(typeAnnotationNode2.typeRef, typeAnnotationNode2.typePath, typeAnnotationNode2.desc, false));
            }
        }
        List<Attribute> list5 = this.attrs;
        if (list5 != null) {
            int size5 = list5.size();
            for (int i5 = 0; i5 < size5; i5++) {
                recordComponentVisitorVisitRecordComponent.visitAttribute(this.attrs.get(i5));
            }
        }
        recordComponentVisitorVisitRecordComponent.visitEnd();
    }

    public void check(int i) {
        if (i < 524288) {
            throw new UnsupportedClassVersionException();
        }
    }

    @Override // org.objectweb.asm.RecordComponentVisitor
    public AnnotationVisitor visitAnnotation(String str, boolean z) {
        AnnotationNode annotationNode = new AnnotationNode(str);
        if (z) {
            this.visibleAnnotations = Util.add(this.visibleAnnotations, annotationNode);
            return annotationNode;
        }
        this.invisibleAnnotations = Util.add(this.invisibleAnnotations, annotationNode);
        return annotationNode;
    }

    @Override // org.objectweb.asm.RecordComponentVisitor
    public void visitAttribute(Attribute attribute) {
        this.attrs = Util.add(this.attrs, attribute);
    }

    @Override // org.objectweb.asm.RecordComponentVisitor
    public AnnotationVisitor visitTypeAnnotation(int i, TypePath typePath, String str, boolean z) {
        TypeAnnotationNode typeAnnotationNode = new TypeAnnotationNode(i, typePath, str);
        if (z) {
            this.visibleTypeAnnotations = Util.add(this.visibleTypeAnnotations, typeAnnotationNode);
            return typeAnnotationNode;
        }
        this.invisibleTypeAnnotations = Util.add(this.invisibleTypeAnnotations, typeAnnotationNode);
        return typeAnnotationNode;
    }

    public RecordComponentNode(int i, String str, String str2, String str3) {
        super(i);
        this.name = str;
        this.descriptor = str2;
        this.signature = str3;
    }

    @Override // org.objectweb.asm.RecordComponentVisitor
    public void visitEnd() {
    }
}
