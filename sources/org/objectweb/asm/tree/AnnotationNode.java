package org.objectweb.asm.tree;

import java.util.ArrayList;
import java.util.List;
import org.objectweb.asm.AnnotationVisitor;

/* JADX INFO: loaded from: classes5.dex */
public class AnnotationNode extends AnnotationVisitor {
    public String desc;
    public List<Object> values;

    public AnnotationNode(String str) {
        this(589824, str);
        if (getClass() != AnnotationNode.class) {
            throw new IllegalStateException();
        }
    }

    public void accept(AnnotationVisitor annotationVisitor) {
        if (annotationVisitor != null) {
            List<Object> list = this.values;
            if (list != null) {
                int size = list.size();
                for (int i = 0; i < size; i += 2) {
                    accept(annotationVisitor, (String) this.values.get(i), this.values.get(i + 1));
                }
            }
            annotationVisitor.visitEnd();
        }
    }

    @Override // org.objectweb.asm.AnnotationVisitor
    public void visit(String str, Object obj) {
        if (this.values == null) {
            this.values = new ArrayList(this.desc != null ? 2 : 1);
        }
        if (this.desc != null) {
            this.values.add(str);
        }
        if (obj instanceof byte[]) {
            this.values.add(Util.asArrayList((byte[]) obj));
            return;
        }
        if (obj instanceof boolean[]) {
            this.values.add(Util.asArrayList((boolean[]) obj));
            return;
        }
        if (obj instanceof short[]) {
            this.values.add(Util.asArrayList((short[]) obj));
            return;
        }
        if (obj instanceof char[]) {
            this.values.add(Util.asArrayList((char[]) obj));
            return;
        }
        if (obj instanceof int[]) {
            this.values.add(Util.asArrayList((int[]) obj));
            return;
        }
        if (obj instanceof long[]) {
            this.values.add(Util.asArrayList((long[]) obj));
            return;
        }
        if (obj instanceof float[]) {
            this.values.add(Util.asArrayList((float[]) obj));
        } else if (obj instanceof double[]) {
            this.values.add(Util.asArrayList((double[]) obj));
        } else {
            this.values.add(obj);
        }
    }

    @Override // org.objectweb.asm.AnnotationVisitor
    public AnnotationVisitor visitAnnotation(String str, String str2) {
        if (this.values == null) {
            this.values = new ArrayList(this.desc != null ? 2 : 1);
        }
        if (this.desc != null) {
            this.values.add(str);
        }
        AnnotationNode annotationNode = new AnnotationNode(str2);
        this.values.add(annotationNode);
        return annotationNode;
    }

    @Override // org.objectweb.asm.AnnotationVisitor
    public AnnotationVisitor visitArray(String str) {
        if (this.values == null) {
            this.values = new ArrayList(this.desc != null ? 2 : 1);
        }
        if (this.desc != null) {
            this.values.add(str);
        }
        ArrayList arrayList = new ArrayList();
        this.values.add(arrayList);
        return new AnnotationNode(arrayList);
    }

    @Override // org.objectweb.asm.AnnotationVisitor
    public void visitEnum(String str, String str2, String str3) {
        if (this.values == null) {
            this.values = new ArrayList(this.desc != null ? 2 : 1);
        }
        if (this.desc != null) {
            this.values.add(str);
        }
        this.values.add(new String[]{str2, str3});
    }

    public AnnotationNode(int i, String str) {
        super(i);
        this.desc = str;
    }

    public AnnotationNode(List<Object> list) {
        super(589824);
        this.values = list;
    }

    public static void accept(AnnotationVisitor annotationVisitor, String str, Object obj) {
        if (annotationVisitor != null) {
            if (obj instanceof String[]) {
                String[] strArr = (String[]) obj;
                annotationVisitor.visitEnum(str, strArr[0], strArr[1]);
                return;
            }
            if (obj instanceof AnnotationNode) {
                AnnotationNode annotationNode = (AnnotationNode) obj;
                annotationNode.accept(annotationVisitor.visitAnnotation(str, annotationNode.desc));
                return;
            }
            if (obj instanceof List) {
                AnnotationVisitor annotationVisitorVisitArray = annotationVisitor.visitArray(str);
                if (annotationVisitorVisitArray != null) {
                    List list = (List) obj;
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        accept(annotationVisitorVisitArray, null, list.get(i));
                    }
                    annotationVisitorVisitArray.visitEnd();
                    return;
                }
                return;
            }
            annotationVisitor.visit(str, obj);
        }
    }

    @Override // org.objectweb.asm.AnnotationVisitor
    public void visitEnd() {
    }

    public void check(int i) {
    }
}
