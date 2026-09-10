package org.objectweb.asm.commons;

import java.util.List;
import org.objectweb.asm.AnnotationVisitor;
import org.objectweb.asm.Attribute;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.FieldVisitor;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.ModuleVisitor;
import org.objectweb.asm.RecordComponentVisitor;
import org.objectweb.asm.TypePath;

/* JADX INFO: loaded from: classes5.dex */
public class ClassRemapper extends ClassVisitor {
    protected String className;
    protected final Remapper remapper;

    public ClassRemapper(ClassVisitor classVisitor, Remapper remapper) {
        this(589824, classVisitor, remapper);
    }

    @Deprecated
    public AnnotationVisitor createAnnotationRemapper(AnnotationVisitor annotationVisitor) {
        return new AnnotationRemapper(this.api, null, annotationVisitor, this.remapper);
    }

    public FieldVisitor createFieldRemapper(FieldVisitor fieldVisitor) {
        return new FieldRemapper(this.api, fieldVisitor, this.remapper);
    }

    public MethodVisitor createMethodRemapper(MethodVisitor methodVisitor) {
        return new MethodRemapper(this.api, methodVisitor, this.remapper);
    }

    public ModuleVisitor createModuleRemapper(ModuleVisitor moduleVisitor) {
        return new ModuleRemapper(this.api, moduleVisitor, this.remapper);
    }

    public RecordComponentVisitor createRecordComponentRemapper(RecordComponentVisitor recordComponentVisitor) {
        return new RecordComponentRemapper(this.api, recordComponentVisitor, this.remapper);
    }

    @Override // org.objectweb.asm.ClassVisitor
    public void visit(int i, int i2, String str, String str2, String str3, String[] strArr) {
        this.className = str;
        super.visit(i, i2, this.remapper.mapType(str), this.remapper.mapSignature(str2, false), this.remapper.mapType(str3), strArr == null ? null : this.remapper.mapTypes(strArr));
    }

    @Override // org.objectweb.asm.ClassVisitor
    public AnnotationVisitor visitAnnotation(String str, boolean z) {
        AnnotationVisitor annotationVisitorVisitAnnotation = super.visitAnnotation(this.remapper.mapDesc(str), z);
        if (annotationVisitorVisitAnnotation == null) {
            return null;
        }
        return createAnnotationRemapper(str, annotationVisitorVisitAnnotation);
    }

    @Override // org.objectweb.asm.ClassVisitor
    public void visitAttribute(Attribute attribute) {
        if (attribute instanceof ModuleHashesAttribute) {
            List<String> list = ((ModuleHashesAttribute) attribute).modules;
            for (int i = 0; i < list.size(); i++) {
                list.set(i, this.remapper.mapModuleName(list.get(i)));
            }
        }
        super.visitAttribute(attribute);
    }

    @Override // org.objectweb.asm.ClassVisitor
    public FieldVisitor visitField(int i, String str, String str2, String str3, Object obj) {
        FieldVisitor fieldVisitorVisitField = super.visitField(i, this.remapper.mapFieldName(this.className, str, str2), this.remapper.mapDesc(str2), this.remapper.mapSignature(str3, true), obj == null ? null : this.remapper.mapValue(obj));
        if (fieldVisitorVisitField == null) {
            return null;
        }
        return createFieldRemapper(fieldVisitorVisitField);
    }

    @Override // org.objectweb.asm.ClassVisitor
    public void visitInnerClass(String str, String str2, String str3, int i) {
        super.visitInnerClass(this.remapper.mapType(str), str2 == null ? null : this.remapper.mapType(str2), str3 != null ? this.remapper.mapInnerClassName(str, str2, str3) : null, i);
    }

    @Override // org.objectweb.asm.ClassVisitor
    public MethodVisitor visitMethod(int i, String str, String str2, String str3, String[] strArr) {
        MethodVisitor methodVisitorVisitMethod = super.visitMethod(i, this.remapper.mapMethodName(this.className, str, str2), this.remapper.mapMethodDesc(str2), this.remapper.mapSignature(str3, false), strArr == null ? null : this.remapper.mapTypes(strArr));
        if (methodVisitorVisitMethod == null) {
            return null;
        }
        return createMethodRemapper(methodVisitorVisitMethod);
    }

    @Override // org.objectweb.asm.ClassVisitor
    public ModuleVisitor visitModule(String str, int i, String str2) {
        ModuleVisitor moduleVisitorVisitModule = super.visitModule(this.remapper.mapModuleName(str), i, str2);
        if (moduleVisitorVisitModule == null) {
            return null;
        }
        return createModuleRemapper(moduleVisitorVisitModule);
    }

    @Override // org.objectweb.asm.ClassVisitor
    public void visitNestHost(String str) {
        super.visitNestHost(this.remapper.mapType(str));
    }

    @Override // org.objectweb.asm.ClassVisitor
    public void visitNestMember(String str) {
        super.visitNestMember(this.remapper.mapType(str));
    }

    @Override // org.objectweb.asm.ClassVisitor
    public void visitOuterClass(String str, String str2, String str3) {
        super.visitOuterClass(this.remapper.mapType(str), str2 == null ? null : this.remapper.mapMethodName(str, str2, str3), str3 != null ? this.remapper.mapMethodDesc(str3) : null);
    }

    @Override // org.objectweb.asm.ClassVisitor
    public void visitPermittedSubclass(String str) {
        super.visitPermittedSubclass(this.remapper.mapType(str));
    }

    @Override // org.objectweb.asm.ClassVisitor
    public RecordComponentVisitor visitRecordComponent(String str, String str2, String str3) {
        RecordComponentVisitor recordComponentVisitorVisitRecordComponent = super.visitRecordComponent(this.remapper.mapRecordComponentName(this.className, str, str2), this.remapper.mapDesc(str2), this.remapper.mapSignature(str3, true));
        if (recordComponentVisitorVisitRecordComponent == null) {
            return null;
        }
        return createRecordComponentRemapper(recordComponentVisitorVisitRecordComponent);
    }

    @Override // org.objectweb.asm.ClassVisitor
    public AnnotationVisitor visitTypeAnnotation(int i, TypePath typePath, String str, boolean z) {
        AnnotationVisitor annotationVisitorVisitTypeAnnotation = super.visitTypeAnnotation(i, typePath, this.remapper.mapDesc(str), z);
        if (annotationVisitorVisitTypeAnnotation == null) {
            return null;
        }
        return createAnnotationRemapper(str, annotationVisitorVisitTypeAnnotation);
    }

    public ClassRemapper(int i, ClassVisitor classVisitor, Remapper remapper) {
        super(i, classVisitor);
        this.remapper = remapper;
    }

    public AnnotationVisitor createAnnotationRemapper(String str, AnnotationVisitor annotationVisitor) {
        return new AnnotationRemapper(this.api, str, annotationVisitor, this.remapper).orDeprecatedValue(createAnnotationRemapper(annotationVisitor));
    }
}
