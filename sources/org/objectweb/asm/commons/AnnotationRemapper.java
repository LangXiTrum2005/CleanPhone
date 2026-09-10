package org.objectweb.asm.commons;

import org.objectweb.asm.AnnotationVisitor;

/* JADX INFO: loaded from: classes5.dex */
public class AnnotationRemapper extends AnnotationVisitor {
    protected final String descriptor;
    protected final Remapper remapper;

    @Deprecated
    public AnnotationRemapper(AnnotationVisitor annotationVisitor, Remapper remapper) {
        this((String) null, annotationVisitor, remapper);
    }

    private String mapAnnotationAttributeName(String str) {
        String str2 = this.descriptor;
        return str2 == null ? str : this.remapper.mapAnnotationAttributeName(str2, str);
    }

    @Deprecated
    public AnnotationVisitor createAnnotationRemapper(AnnotationVisitor annotationVisitor) {
        return new AnnotationRemapper(this.api, null, annotationVisitor, this.remapper);
    }

    public final AnnotationVisitor orDeprecatedValue(AnnotationVisitor annotationVisitor) {
        if (annotationVisitor.getClass() == getClass()) {
            AnnotationRemapper annotationRemapper = (AnnotationRemapper) annotationVisitor;
            if (annotationRemapper.api == this.api && annotationRemapper.av == this.av && annotationRemapper.remapper == this.remapper) {
                return this;
            }
        }
        return annotationVisitor;
    }

    @Override // org.objectweb.asm.AnnotationVisitor
    public void visit(String str, Object obj) {
        super.visit(mapAnnotationAttributeName(str), this.remapper.mapValue(obj));
    }

    @Override // org.objectweb.asm.AnnotationVisitor
    public AnnotationVisitor visitAnnotation(String str, String str2) {
        AnnotationVisitor annotationVisitorVisitAnnotation = super.visitAnnotation(mapAnnotationAttributeName(str), this.remapper.mapDesc(str2));
        if (annotationVisitorVisitAnnotation == null) {
            return null;
        }
        return annotationVisitorVisitAnnotation == this.av ? this : createAnnotationRemapper(str2, annotationVisitorVisitAnnotation);
    }

    @Override // org.objectweb.asm.AnnotationVisitor
    public AnnotationVisitor visitArray(String str) {
        AnnotationVisitor annotationVisitorVisitArray = super.visitArray(mapAnnotationAttributeName(str));
        if (annotationVisitorVisitArray == null) {
            return null;
        }
        return annotationVisitorVisitArray == this.av ? this : createAnnotationRemapper(null, annotationVisitorVisitArray);
    }

    @Override // org.objectweb.asm.AnnotationVisitor
    public void visitEnum(String str, String str2, String str3) {
        super.visitEnum(mapAnnotationAttributeName(str), this.remapper.mapDesc(str2), str3);
    }

    public AnnotationRemapper(String str, AnnotationVisitor annotationVisitor, Remapper remapper) {
        this(589824, str, annotationVisitor, remapper);
    }

    public AnnotationVisitor createAnnotationRemapper(String str, AnnotationVisitor annotationVisitor) {
        return new AnnotationRemapper(this.api, str, annotationVisitor, this.remapper).orDeprecatedValue(createAnnotationRemapper(annotationVisitor));
    }

    @Deprecated
    public AnnotationRemapper(int i, AnnotationVisitor annotationVisitor, Remapper remapper) {
        this(i, null, annotationVisitor, remapper);
    }

    public AnnotationRemapper(int i, String str, AnnotationVisitor annotationVisitor, Remapper remapper) {
        super(i, annotationVisitor);
        this.descriptor = str;
        this.remapper = remapper;
    }
}
