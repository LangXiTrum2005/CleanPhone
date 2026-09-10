package org.objectweb.asm.commons;

import org.objectweb.asm.AnnotationVisitor;
import org.objectweb.asm.RecordComponentVisitor;
import org.objectweb.asm.TypePath;

/* JADX INFO: loaded from: classes5.dex */
public class RecordComponentRemapper extends RecordComponentVisitor {
    protected final Remapper remapper;

    public RecordComponentRemapper(RecordComponentVisitor recordComponentVisitor, Remapper remapper) {
        this(589824, recordComponentVisitor, remapper);
    }

    @Deprecated
    public AnnotationVisitor createAnnotationRemapper(AnnotationVisitor annotationVisitor) {
        return new AnnotationRemapper(this.api, null, annotationVisitor, this.remapper);
    }

    @Override // org.objectweb.asm.RecordComponentVisitor
    public AnnotationVisitor visitAnnotation(String str, boolean z) {
        AnnotationVisitor annotationVisitorVisitAnnotation = super.visitAnnotation(this.remapper.mapDesc(str), z);
        if (annotationVisitorVisitAnnotation == null) {
            return null;
        }
        return createAnnotationRemapper(str, annotationVisitorVisitAnnotation);
    }

    @Override // org.objectweb.asm.RecordComponentVisitor
    public AnnotationVisitor visitTypeAnnotation(int i, TypePath typePath, String str, boolean z) {
        AnnotationVisitor annotationVisitorVisitTypeAnnotation = super.visitTypeAnnotation(i, typePath, this.remapper.mapDesc(str), z);
        if (annotationVisitorVisitTypeAnnotation == null) {
            return null;
        }
        return createAnnotationRemapper(str, annotationVisitorVisitTypeAnnotation);
    }

    public RecordComponentRemapper(int i, RecordComponentVisitor recordComponentVisitor, Remapper remapper) {
        super(i, recordComponentVisitor);
        this.remapper = remapper;
    }

    public AnnotationVisitor createAnnotationRemapper(String str, AnnotationVisitor annotationVisitor) {
        return new AnnotationRemapper(this.api, str, annotationVisitor, this.remapper).orDeprecatedValue(createAnnotationRemapper(annotationVisitor));
    }
}
