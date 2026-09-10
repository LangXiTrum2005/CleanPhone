package org.objectweb.asm.tree;

import java.util.ArrayList;
import java.util.List;
import org.objectweb.asm.AnnotationVisitor;
import org.objectweb.asm.Attribute;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.ConstantDynamic;
import org.objectweb.asm.Handle;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Type;
import org.objectweb.asm.TypePath;

/* JADX INFO: loaded from: classes5.dex */
public class MethodNode extends MethodVisitor {
    public int access;
    public Object annotationDefault;
    public List<Attribute> attrs;
    public String desc;
    public List<String> exceptions;
    public InsnList instructions;
    public int invisibleAnnotableParameterCount;
    public List<AnnotationNode> invisibleAnnotations;
    public List<LocalVariableAnnotationNode> invisibleLocalVariableAnnotations;
    public List<AnnotationNode>[] invisibleParameterAnnotations;
    public List<TypeAnnotationNode> invisibleTypeAnnotations;
    public List<LocalVariableNode> localVariables;
    public int maxLocals;
    public int maxStack;
    public String name;
    public List<ParameterNode> parameters;
    public String signature;
    public List<TryCatchBlockNode> tryCatchBlocks;
    public int visibleAnnotableParameterCount;
    public List<AnnotationNode> visibleAnnotations;
    public List<LocalVariableAnnotationNode> visibleLocalVariableAnnotations;
    public List<AnnotationNode>[] visibleParameterAnnotations;
    public List<TypeAnnotationNode> visibleTypeAnnotations;
    private boolean visited;

    public MethodNode() {
        this(589824);
        if (getClass() != MethodNode.class) {
            throw new IllegalStateException();
        }
    }

    private LabelNode[] getLabelNodes(Label[] labelArr) {
        LabelNode[] labelNodeArr = new LabelNode[labelArr.length];
        int length = labelArr.length;
        for (int i = 0; i < length; i++) {
            labelNodeArr[i] = getLabelNode(labelArr[i]);
        }
        return labelNodeArr;
    }

    public void accept(ClassVisitor classVisitor) {
        List<String> list = this.exceptions;
        MethodVisitor methodVisitorVisitMethod = classVisitor.visitMethod(this.access, this.name, this.desc, this.signature, list == null ? null : (String[]) list.toArray(new String[0]));
        if (methodVisitorVisitMethod != null) {
            accept(methodVisitorVisitMethod);
        }
    }

    public void check(int i) {
        if (i == 262144) {
            List<ParameterNode> list = this.parameters;
            if (list != null && !list.isEmpty()) {
                throw new UnsupportedClassVersionException();
            }
            List<TypeAnnotationNode> list2 = this.visibleTypeAnnotations;
            if (list2 != null && !list2.isEmpty()) {
                throw new UnsupportedClassVersionException();
            }
            List<TypeAnnotationNode> list3 = this.invisibleTypeAnnotations;
            if (list3 != null && !list3.isEmpty()) {
                throw new UnsupportedClassVersionException();
            }
            List<TryCatchBlockNode> list4 = this.tryCatchBlocks;
            if (list4 != null) {
                for (int size = list4.size() - 1; size >= 0; size--) {
                    TryCatchBlockNode tryCatchBlockNode = this.tryCatchBlocks.get(size);
                    List<TypeAnnotationNode> list5 = tryCatchBlockNode.visibleTypeAnnotations;
                    if (list5 != null && !list5.isEmpty()) {
                        throw new UnsupportedClassVersionException();
                    }
                    List<TypeAnnotationNode> list6 = tryCatchBlockNode.invisibleTypeAnnotations;
                    if (list6 != null && !list6.isEmpty()) {
                        throw new UnsupportedClassVersionException();
                    }
                }
            }
            for (int size2 = this.instructions.size() - 1; size2 >= 0; size2--) {
                AbstractInsnNode abstractInsnNode = this.instructions.get(size2);
                List<TypeAnnotationNode> list7 = abstractInsnNode.visibleTypeAnnotations;
                if (list7 != null && !list7.isEmpty()) {
                    throw new UnsupportedClassVersionException();
                }
                List<TypeAnnotationNode> list8 = abstractInsnNode.invisibleTypeAnnotations;
                if (list8 != null && !list8.isEmpty()) {
                    throw new UnsupportedClassVersionException();
                }
                if (abstractInsnNode instanceof MethodInsnNode) {
                    if (((MethodInsnNode) abstractInsnNode).itf != (abstractInsnNode.opcode == 185)) {
                        throw new UnsupportedClassVersionException();
                    }
                } else if (abstractInsnNode instanceof LdcInsnNode) {
                    Object obj = ((LdcInsnNode) abstractInsnNode).cst;
                    if ((obj instanceof Handle) || ((obj instanceof Type) && ((Type) obj).getSort() == 11)) {
                        throw new UnsupportedClassVersionException();
                    }
                } else {
                    continue;
                }
            }
            List<LocalVariableAnnotationNode> list9 = this.visibleLocalVariableAnnotations;
            if (list9 != null && !list9.isEmpty()) {
                throw new UnsupportedClassVersionException();
            }
            List<LocalVariableAnnotationNode> list10 = this.invisibleLocalVariableAnnotations;
            if (list10 != null && !list10.isEmpty()) {
                throw new UnsupportedClassVersionException();
            }
        }
        if (i < 458752) {
            for (int size3 = this.instructions.size() - 1; size3 >= 0; size3--) {
                AbstractInsnNode abstractInsnNode2 = this.instructions.get(size3);
                if ((abstractInsnNode2 instanceof LdcInsnNode) && (((LdcInsnNode) abstractInsnNode2).cst instanceof ConstantDynamic)) {
                    throw new UnsupportedClassVersionException();
                }
            }
        }
    }

    public LabelNode getLabelNode(Label label) {
        if (!(label.info instanceof LabelNode)) {
            label.info = new LabelNode();
        }
        return (LabelNode) label.info;
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitAnnotableParameterCount(int i, boolean z) {
        if (z) {
            this.visibleAnnotableParameterCount = i;
        } else {
            this.invisibleAnnotableParameterCount = i;
        }
    }

    @Override // org.objectweb.asm.MethodVisitor
    public AnnotationVisitor visitAnnotation(String str, boolean z) {
        AnnotationNode annotationNode = new AnnotationNode(str);
        if (z) {
            this.visibleAnnotations = Util.add(this.visibleAnnotations, annotationNode);
            return annotationNode;
        }
        this.invisibleAnnotations = Util.add(this.invisibleAnnotations, annotationNode);
        return annotationNode;
    }

    @Override // org.objectweb.asm.MethodVisitor
    public AnnotationVisitor visitAnnotationDefault() {
        return new AnnotationNode(new ArrayList<Object>(0) { // from class: org.objectweb.asm.tree.MethodNode.1
            @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
            public boolean add(Object obj) {
                MethodNode.this.annotationDefault = obj;
                return super.add(obj);
            }
        });
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitAttribute(Attribute attribute) {
        this.attrs = Util.add(this.attrs, attribute);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitFieldInsn(int i, String str, String str2, String str3) {
        this.instructions.add(new FieldInsnNode(i, str, str2, str3));
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitFrame(int i, int i2, Object[] objArr, int i3, Object[] objArr2) {
        this.instructions.add(new FrameNode(i, i2, objArr == null ? null : getLabelNodes(objArr), i3, objArr2 != null ? getLabelNodes(objArr2) : null));
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitIincInsn(int i, int i2) {
        this.instructions.add(new IincInsnNode(i, i2));
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitInsn(int i) {
        this.instructions.add(new InsnNode(i));
    }

    @Override // org.objectweb.asm.MethodVisitor
    public AnnotationVisitor visitInsnAnnotation(int i, TypePath typePath, String str, boolean z) {
        AbstractInsnNode last = this.instructions.getLast();
        while (last.getOpcode() == -1) {
            last = last.getPrevious();
        }
        TypeAnnotationNode typeAnnotationNode = new TypeAnnotationNode(i, typePath, str);
        if (z) {
            last.visibleTypeAnnotations = Util.add(last.visibleTypeAnnotations, typeAnnotationNode);
            return typeAnnotationNode;
        }
        last.invisibleTypeAnnotations = Util.add(last.invisibleTypeAnnotations, typeAnnotationNode);
        return typeAnnotationNode;
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitIntInsn(int i, int i2) {
        this.instructions.add(new IntInsnNode(i, i2));
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitInvokeDynamicInsn(String str, String str2, Handle handle, Object... objArr) {
        this.instructions.add(new InvokeDynamicInsnNode(str, str2, handle, objArr));
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitJumpInsn(int i, Label label) {
        this.instructions.add(new JumpInsnNode(i, getLabelNode(label)));
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitLabel(Label label) {
        this.instructions.add(getLabelNode(label));
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitLdcInsn(Object obj) {
        this.instructions.add(new LdcInsnNode(obj));
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitLineNumber(int i, Label label) {
        this.instructions.add(new LineNumberNode(i, getLabelNode(label)));
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitLocalVariable(String str, String str2, String str3, Label label, Label label2, int i) {
        this.localVariables = Util.add(this.localVariables, new LocalVariableNode(str, str2, str3, getLabelNode(label), getLabelNode(label2), i));
    }

    @Override // org.objectweb.asm.MethodVisitor
    public AnnotationVisitor visitLocalVariableAnnotation(int i, TypePath typePath, Label[] labelArr, Label[] labelArr2, int[] iArr, String str, boolean z) {
        LocalVariableAnnotationNode localVariableAnnotationNode = new LocalVariableAnnotationNode(i, typePath, getLabelNodes(labelArr), getLabelNodes(labelArr2), iArr, str);
        if (z) {
            this.visibleLocalVariableAnnotations = Util.add(this.visibleLocalVariableAnnotations, localVariableAnnotationNode);
            return localVariableAnnotationNode;
        }
        this.invisibleLocalVariableAnnotations = Util.add(this.invisibleLocalVariableAnnotations, localVariableAnnotationNode);
        return localVariableAnnotationNode;
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitLookupSwitchInsn(Label label, int[] iArr, Label[] labelArr) {
        this.instructions.add(new LookupSwitchInsnNode(getLabelNode(label), iArr, getLabelNodes(labelArr)));
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitMaxs(int i, int i2) {
        this.maxStack = i;
        this.maxLocals = i2;
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitMethodInsn(int i, String str, String str2, String str3, boolean z) {
        if (this.api >= 327680 || (i & 256) != 0) {
            this.instructions.add(new MethodInsnNode(i & (-257), str, str2, str3, z));
        } else {
            super.visitMethodInsn(i, str, str2, str3, z);
        }
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitMultiANewArrayInsn(String str, int i) {
        this.instructions.add(new MultiANewArrayInsnNode(str, i));
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitParameter(String str, int i) {
        if (this.parameters == null) {
            this.parameters = new ArrayList(5);
        }
        this.parameters.add(new ParameterNode(str, i));
    }

    @Override // org.objectweb.asm.MethodVisitor
    public AnnotationVisitor visitParameterAnnotation(int i, String str, boolean z) {
        AnnotationNode annotationNode = new AnnotationNode(str);
        if (z) {
            if (this.visibleParameterAnnotations == null) {
                this.visibleParameterAnnotations = new List[Type.getArgumentTypes(this.desc).length];
            }
            List<AnnotationNode>[] listArr = this.visibleParameterAnnotations;
            listArr[i] = Util.add(listArr[i], annotationNode);
            return annotationNode;
        }
        if (this.invisibleParameterAnnotations == null) {
            this.invisibleParameterAnnotations = new List[Type.getArgumentTypes(this.desc).length];
        }
        List<AnnotationNode>[] listArr2 = this.invisibleParameterAnnotations;
        listArr2[i] = Util.add(listArr2[i], annotationNode);
        return annotationNode;
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitTableSwitchInsn(int i, int i2, Label label, Label... labelArr) {
        this.instructions.add(new TableSwitchInsnNode(i, i2, getLabelNode(label), getLabelNodes(labelArr)));
    }

    @Override // org.objectweb.asm.MethodVisitor
    public AnnotationVisitor visitTryCatchAnnotation(int i, TypePath typePath, String str, boolean z) {
        TryCatchBlockNode tryCatchBlockNode = this.tryCatchBlocks.get((16776960 & i) >> 8);
        TypeAnnotationNode typeAnnotationNode = new TypeAnnotationNode(i, typePath, str);
        if (z) {
            tryCatchBlockNode.visibleTypeAnnotations = Util.add(tryCatchBlockNode.visibleTypeAnnotations, typeAnnotationNode);
            return typeAnnotationNode;
        }
        tryCatchBlockNode.invisibleTypeAnnotations = Util.add(tryCatchBlockNode.invisibleTypeAnnotations, typeAnnotationNode);
        return typeAnnotationNode;
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitTryCatchBlock(Label label, Label label2, Label label3, String str) {
        this.tryCatchBlocks = Util.add(this.tryCatchBlocks, new TryCatchBlockNode(getLabelNode(label), getLabelNode(label2), getLabelNode(label3), str));
    }

    @Override // org.objectweb.asm.MethodVisitor
    public AnnotationVisitor visitTypeAnnotation(int i, TypePath typePath, String str, boolean z) {
        TypeAnnotationNode typeAnnotationNode = new TypeAnnotationNode(i, typePath, str);
        if (z) {
            this.visibleTypeAnnotations = Util.add(this.visibleTypeAnnotations, typeAnnotationNode);
            return typeAnnotationNode;
        }
        this.invisibleTypeAnnotations = Util.add(this.invisibleTypeAnnotations, typeAnnotationNode);
        return typeAnnotationNode;
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitTypeInsn(int i, String str) {
        this.instructions.add(new TypeInsnNode(i, str));
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitVarInsn(int i, int i2) {
        this.instructions.add(new VarInsnNode(i, i2));
    }

    public MethodNode(int i) {
        super(i);
        this.instructions = new InsnList();
    }

    private Object[] getLabelNodes(Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length];
        int length = objArr.length;
        for (int i = 0; i < length; i++) {
            Object labelNode = objArr[i];
            if (labelNode instanceof Label) {
                labelNode = getLabelNode((Label) labelNode);
            }
            objArr2[i] = labelNode;
        }
        return objArr2;
    }

    public void accept(MethodVisitor methodVisitor) {
        List<ParameterNode> list = this.parameters;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                this.parameters.get(i).accept(methodVisitor);
            }
        }
        if (this.annotationDefault != null) {
            AnnotationVisitor annotationVisitorVisitAnnotationDefault = methodVisitor.visitAnnotationDefault();
            AnnotationNode.accept(annotationVisitorVisitAnnotationDefault, null, this.annotationDefault);
            if (annotationVisitorVisitAnnotationDefault != null) {
                annotationVisitorVisitAnnotationDefault.visitEnd();
            }
        }
        List<AnnotationNode> list2 = this.visibleAnnotations;
        if (list2 != null) {
            int size2 = list2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                AnnotationNode annotationNode = this.visibleAnnotations.get(i2);
                annotationNode.accept(methodVisitor.visitAnnotation(annotationNode.desc, true));
            }
        }
        List<AnnotationNode> list3 = this.invisibleAnnotations;
        if (list3 != null) {
            int size3 = list3.size();
            for (int i3 = 0; i3 < size3; i3++) {
                AnnotationNode annotationNode2 = this.invisibleAnnotations.get(i3);
                annotationNode2.accept(methodVisitor.visitAnnotation(annotationNode2.desc, false));
            }
        }
        List<TypeAnnotationNode> list4 = this.visibleTypeAnnotations;
        if (list4 != null) {
            int size4 = list4.size();
            for (int i4 = 0; i4 < size4; i4++) {
                TypeAnnotationNode typeAnnotationNode = this.visibleTypeAnnotations.get(i4);
                typeAnnotationNode.accept(methodVisitor.visitTypeAnnotation(typeAnnotationNode.typeRef, typeAnnotationNode.typePath, typeAnnotationNode.desc, true));
            }
        }
        List<TypeAnnotationNode> list5 = this.invisibleTypeAnnotations;
        if (list5 != null) {
            int size5 = list5.size();
            for (int i5 = 0; i5 < size5; i5++) {
                TypeAnnotationNode typeAnnotationNode2 = this.invisibleTypeAnnotations.get(i5);
                typeAnnotationNode2.accept(methodVisitor.visitTypeAnnotation(typeAnnotationNode2.typeRef, typeAnnotationNode2.typePath, typeAnnotationNode2.desc, false));
            }
        }
        int i6 = this.visibleAnnotableParameterCount;
        if (i6 > 0) {
            methodVisitor.visitAnnotableParameterCount(i6, true);
        }
        List<AnnotationNode>[] listArr = this.visibleParameterAnnotations;
        if (listArr != null) {
            int length = listArr.length;
            for (int i7 = 0; i7 < length; i7++) {
                List<AnnotationNode> list6 = this.visibleParameterAnnotations[i7];
                if (list6 != null) {
                    int size6 = list6.size();
                    for (int i8 = 0; i8 < size6; i8++) {
                        AnnotationNode annotationNode3 = list6.get(i8);
                        annotationNode3.accept(methodVisitor.visitParameterAnnotation(i7, annotationNode3.desc, true));
                    }
                }
            }
        }
        int i9 = this.invisibleAnnotableParameterCount;
        if (i9 > 0) {
            methodVisitor.visitAnnotableParameterCount(i9, false);
        }
        List<AnnotationNode>[] listArr2 = this.invisibleParameterAnnotations;
        if (listArr2 != null) {
            int length2 = listArr2.length;
            for (int i10 = 0; i10 < length2; i10++) {
                List<AnnotationNode> list7 = this.invisibleParameterAnnotations[i10];
                if (list7 != null) {
                    int size7 = list7.size();
                    for (int i11 = 0; i11 < size7; i11++) {
                        AnnotationNode annotationNode4 = list7.get(i11);
                        annotationNode4.accept(methodVisitor.visitParameterAnnotation(i10, annotationNode4.desc, false));
                    }
                }
            }
        }
        if (this.visited) {
            this.instructions.resetLabels();
        }
        List<Attribute> list8 = this.attrs;
        if (list8 != null) {
            int size8 = list8.size();
            for (int i12 = 0; i12 < size8; i12++) {
                methodVisitor.visitAttribute(this.attrs.get(i12));
            }
        }
        if (this.instructions.size() > 0) {
            methodVisitor.visitCode();
            List<TryCatchBlockNode> list9 = this.tryCatchBlocks;
            if (list9 != null) {
                int size9 = list9.size();
                for (int i13 = 0; i13 < size9; i13++) {
                    this.tryCatchBlocks.get(i13).updateIndex(i13);
                    this.tryCatchBlocks.get(i13).accept(methodVisitor);
                }
            }
            this.instructions.accept(methodVisitor);
            List<LocalVariableNode> list10 = this.localVariables;
            if (list10 != null) {
                int size10 = list10.size();
                for (int i14 = 0; i14 < size10; i14++) {
                    this.localVariables.get(i14).accept(methodVisitor);
                }
            }
            List<LocalVariableAnnotationNode> list11 = this.visibleLocalVariableAnnotations;
            if (list11 != null) {
                int size11 = list11.size();
                for (int i15 = 0; i15 < size11; i15++) {
                    this.visibleLocalVariableAnnotations.get(i15).accept(methodVisitor, true);
                }
            }
            List<LocalVariableAnnotationNode> list12 = this.invisibleLocalVariableAnnotations;
            if (list12 != null) {
                int size12 = list12.size();
                for (int i16 = 0; i16 < size12; i16++) {
                    this.invisibleLocalVariableAnnotations.get(i16).accept(methodVisitor, false);
                }
            }
            methodVisitor.visitMaxs(this.maxStack, this.maxLocals);
            this.visited = true;
        }
        methodVisitor.visitEnd();
    }

    public MethodNode(int i, String str, String str2, String str3, String[] strArr) {
        this(589824, i, str, str2, str3, strArr);
        if (getClass() != MethodNode.class) {
            throw new IllegalStateException();
        }
    }

    public MethodNode(int i, int i2, String str, String str2, String str3, String[] strArr) {
        super(i);
        this.access = i2;
        this.name = str;
        this.desc = str2;
        this.signature = str3;
        this.exceptions = Util.asArrayList(strArr);
        if ((i2 & 1024) == 0) {
            this.localVariables = new ArrayList(5);
        }
        this.tryCatchBlocks = new ArrayList();
        this.instructions = new InsnList();
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitCode() {
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitEnd() {
    }
}
