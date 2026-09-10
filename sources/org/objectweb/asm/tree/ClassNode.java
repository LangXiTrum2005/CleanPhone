package org.objectweb.asm.tree;

import java.util.ArrayList;
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
public class ClassNode extends ClassVisitor {
    public int access;
    public List<Attribute> attrs;
    public List<FieldNode> fields;
    public List<InnerClassNode> innerClasses;
    public List<String> interfaces;
    public List<AnnotationNode> invisibleAnnotations;
    public List<TypeAnnotationNode> invisibleTypeAnnotations;
    public List<MethodNode> methods;
    public ModuleNode module;
    public String name;
    public String nestHostClass;
    public List<String> nestMembers;
    public String outerClass;
    public String outerMethod;
    public String outerMethodDesc;
    public List<String> permittedSubclasses;
    public List<RecordComponentNode> recordComponents;
    public String signature;
    public String sourceDebug;
    public String sourceFile;
    public String superName;
    public int version;
    public List<AnnotationNode> visibleAnnotations;
    public List<TypeAnnotationNode> visibleTypeAnnotations;

    public ClassNode() {
        this(589824);
        if (getClass() != ClassNode.class) {
            throw new IllegalStateException();
        }
    }

    public void accept(ClassVisitor classVisitor) {
        String[] strArr = new String[this.interfaces.size()];
        this.interfaces.toArray(strArr);
        classVisitor.visit(this.version, this.access, this.name, this.signature, this.superName, strArr);
        String str = this.sourceFile;
        if (str != null || this.sourceDebug != null) {
            classVisitor.visitSource(str, this.sourceDebug);
        }
        ModuleNode moduleNode = this.module;
        if (moduleNode != null) {
            moduleNode.accept(classVisitor);
        }
        String str2 = this.nestHostClass;
        if (str2 != null) {
            classVisitor.visitNestHost(str2);
        }
        String str3 = this.outerClass;
        if (str3 != null) {
            classVisitor.visitOuterClass(str3, this.outerMethod, this.outerMethodDesc);
        }
        List<AnnotationNode> list = this.visibleAnnotations;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                AnnotationNode annotationNode = this.visibleAnnotations.get(i);
                annotationNode.accept(classVisitor.visitAnnotation(annotationNode.desc, true));
            }
        }
        List<AnnotationNode> list2 = this.invisibleAnnotations;
        if (list2 != null) {
            int size2 = list2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                AnnotationNode annotationNode2 = this.invisibleAnnotations.get(i2);
                annotationNode2.accept(classVisitor.visitAnnotation(annotationNode2.desc, false));
            }
        }
        List<TypeAnnotationNode> list3 = this.visibleTypeAnnotations;
        if (list3 != null) {
            int size3 = list3.size();
            for (int i3 = 0; i3 < size3; i3++) {
                TypeAnnotationNode typeAnnotationNode = this.visibleTypeAnnotations.get(i3);
                typeAnnotationNode.accept(classVisitor.visitTypeAnnotation(typeAnnotationNode.typeRef, typeAnnotationNode.typePath, typeAnnotationNode.desc, true));
            }
        }
        List<TypeAnnotationNode> list4 = this.invisibleTypeAnnotations;
        if (list4 != null) {
            int size4 = list4.size();
            for (int i4 = 0; i4 < size4; i4++) {
                TypeAnnotationNode typeAnnotationNode2 = this.invisibleTypeAnnotations.get(i4);
                typeAnnotationNode2.accept(classVisitor.visitTypeAnnotation(typeAnnotationNode2.typeRef, typeAnnotationNode2.typePath, typeAnnotationNode2.desc, false));
            }
        }
        List<Attribute> list5 = this.attrs;
        if (list5 != null) {
            int size5 = list5.size();
            for (int i5 = 0; i5 < size5; i5++) {
                classVisitor.visitAttribute(this.attrs.get(i5));
            }
        }
        List<String> list6 = this.nestMembers;
        if (list6 != null) {
            int size6 = list6.size();
            for (int i6 = 0; i6 < size6; i6++) {
                classVisitor.visitNestMember(this.nestMembers.get(i6));
            }
        }
        List<String> list7 = this.permittedSubclasses;
        if (list7 != null) {
            int size7 = list7.size();
            for (int i7 = 0; i7 < size7; i7++) {
                classVisitor.visitPermittedSubclass(this.permittedSubclasses.get(i7));
            }
        }
        int size8 = this.innerClasses.size();
        for (int i8 = 0; i8 < size8; i8++) {
            this.innerClasses.get(i8).accept(classVisitor);
        }
        List<RecordComponentNode> list8 = this.recordComponents;
        if (list8 != null) {
            int size9 = list8.size();
            for (int i9 = 0; i9 < size9; i9++) {
                this.recordComponents.get(i9).accept(classVisitor);
            }
        }
        int size10 = this.fields.size();
        for (int i10 = 0; i10 < size10; i10++) {
            this.fields.get(i10).accept(classVisitor);
        }
        int size11 = this.methods.size();
        for (int i11 = 0; i11 < size11; i11++) {
            this.methods.get(i11).accept(classVisitor);
        }
        classVisitor.visitEnd();
    }

    public void check(int i) {
        if (i < 589824 && this.permittedSubclasses != null) {
            throw new UnsupportedClassVersionException();
        }
        if (i < 524288 && ((this.access & 65536) != 0 || this.recordComponents != null)) {
            throw new UnsupportedClassVersionException();
        }
        if (i < 458752 && (this.nestHostClass != null || this.nestMembers != null)) {
            throw new UnsupportedClassVersionException();
        }
        if (i < 393216 && this.module != null) {
            throw new UnsupportedClassVersionException();
        }
        if (i < 327680) {
            List<TypeAnnotationNode> list = this.visibleTypeAnnotations;
            if (list != null && !list.isEmpty()) {
                throw new UnsupportedClassVersionException();
            }
            List<TypeAnnotationNode> list2 = this.invisibleTypeAnnotations;
            if (list2 != null && !list2.isEmpty()) {
                throw new UnsupportedClassVersionException();
            }
        }
        List<AnnotationNode> list3 = this.visibleAnnotations;
        if (list3 != null) {
            for (int size = list3.size() - 1; size >= 0; size--) {
                this.visibleAnnotations.get(size).check(i);
            }
        }
        List<AnnotationNode> list4 = this.invisibleAnnotations;
        if (list4 != null) {
            for (int size2 = list4.size() - 1; size2 >= 0; size2--) {
                this.invisibleAnnotations.get(size2).check(i);
            }
        }
        List<TypeAnnotationNode> list5 = this.visibleTypeAnnotations;
        if (list5 != null) {
            for (int size3 = list5.size() - 1; size3 >= 0; size3--) {
                this.visibleTypeAnnotations.get(size3).check(i);
            }
        }
        List<TypeAnnotationNode> list6 = this.invisibleTypeAnnotations;
        if (list6 != null) {
            for (int size4 = list6.size() - 1; size4 >= 0; size4--) {
                this.invisibleTypeAnnotations.get(size4).check(i);
            }
        }
        List<RecordComponentNode> list7 = this.recordComponents;
        if (list7 != null) {
            for (int size5 = list7.size() - 1; size5 >= 0; size5--) {
                this.recordComponents.get(size5).check(i);
            }
        }
        for (int size6 = this.fields.size() - 1; size6 >= 0; size6--) {
            this.fields.get(size6).check(i);
        }
        for (int size7 = this.methods.size() - 1; size7 >= 0; size7--) {
            this.methods.get(size7).check(i);
        }
    }

    @Override // org.objectweb.asm.ClassVisitor
    public void visit(int i, int i2, String str, String str2, String str3, String[] strArr) {
        this.version = i;
        this.access = i2;
        this.name = str;
        this.signature = str2;
        this.superName = str3;
        this.interfaces = Util.asArrayList(strArr);
    }

    @Override // org.objectweb.asm.ClassVisitor
    public AnnotationVisitor visitAnnotation(String str, boolean z) {
        AnnotationNode annotationNode = new AnnotationNode(str);
        if (z) {
            this.visibleAnnotations = Util.add(this.visibleAnnotations, annotationNode);
            return annotationNode;
        }
        this.invisibleAnnotations = Util.add(this.invisibleAnnotations, annotationNode);
        return annotationNode;
    }

    @Override // org.objectweb.asm.ClassVisitor
    public void visitAttribute(Attribute attribute) {
        this.attrs = Util.add(this.attrs, attribute);
    }

    @Override // org.objectweb.asm.ClassVisitor
    public FieldVisitor visitField(int i, String str, String str2, String str3, Object obj) {
        FieldNode fieldNode = new FieldNode(i, str, str2, str3, obj);
        this.fields.add(fieldNode);
        return fieldNode;
    }

    @Override // org.objectweb.asm.ClassVisitor
    public void visitInnerClass(String str, String str2, String str3, int i) {
        this.innerClasses.add(new InnerClassNode(str, str2, str3, i));
    }

    @Override // org.objectweb.asm.ClassVisitor
    public MethodVisitor visitMethod(int i, String str, String str2, String str3, String[] strArr) {
        MethodNode methodNode = new MethodNode(i, str, str2, str3, strArr);
        this.methods.add(methodNode);
        return methodNode;
    }

    @Override // org.objectweb.asm.ClassVisitor
    public ModuleVisitor visitModule(String str, int i, String str2) {
        ModuleNode moduleNode = new ModuleNode(str, i, str2);
        this.module = moduleNode;
        return moduleNode;
    }

    @Override // org.objectweb.asm.ClassVisitor
    public void visitNestHost(String str) {
        this.nestHostClass = str;
    }

    @Override // org.objectweb.asm.ClassVisitor
    public void visitNestMember(String str) {
        this.nestMembers = Util.add(this.nestMembers, str);
    }

    @Override // org.objectweb.asm.ClassVisitor
    public void visitOuterClass(String str, String str2, String str3) {
        this.outerClass = str;
        this.outerMethod = str2;
        this.outerMethodDesc = str3;
    }

    @Override // org.objectweb.asm.ClassVisitor
    public void visitPermittedSubclass(String str) {
        this.permittedSubclasses = Util.add(this.permittedSubclasses, str);
    }

    @Override // org.objectweb.asm.ClassVisitor
    public RecordComponentVisitor visitRecordComponent(String str, String str2, String str3) {
        RecordComponentNode recordComponentNode = new RecordComponentNode(str, str2, str3);
        this.recordComponents = Util.add(this.recordComponents, recordComponentNode);
        return recordComponentNode;
    }

    @Override // org.objectweb.asm.ClassVisitor
    public void visitSource(String str, String str2) {
        this.sourceFile = str;
        this.sourceDebug = str2;
    }

    @Override // org.objectweb.asm.ClassVisitor
    public AnnotationVisitor visitTypeAnnotation(int i, TypePath typePath, String str, boolean z) {
        TypeAnnotationNode typeAnnotationNode = new TypeAnnotationNode(i, typePath, str);
        if (z) {
            this.visibleTypeAnnotations = Util.add(this.visibleTypeAnnotations, typeAnnotationNode);
            return typeAnnotationNode;
        }
        this.invisibleTypeAnnotations = Util.add(this.invisibleTypeAnnotations, typeAnnotationNode);
        return typeAnnotationNode;
    }

    public ClassNode(int i) {
        super(i);
        this.interfaces = new ArrayList();
        this.innerClasses = new ArrayList();
        this.fields = new ArrayList();
        this.methods = new ArrayList();
    }

    @Override // org.objectweb.asm.ClassVisitor
    public void visitEnd() {
    }
}
