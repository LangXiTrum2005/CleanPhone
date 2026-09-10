package org.jacoco.core.internal.flow;

import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.commons.AnalyzerAdapter;

/* JADX INFO: loaded from: classes5.dex */
public class ClassProbesAdapter extends ClassVisitor implements IProbeIdGenerator {
    private static final MethodProbesVisitor EMPTY_METHOD_PROBES_VISITOR = new MethodProbesVisitor() { // from class: org.jacoco.core.internal.flow.ClassProbesAdapter.1
    };
    private int counter;
    private final ClassProbesVisitor cv;
    private String name;
    private final boolean trackFrames;

    public ClassProbesAdapter(ClassProbesVisitor classProbesVisitor, boolean z) {
        super(589824, classProbesVisitor);
        this.counter = 0;
        this.cv = classProbesVisitor;
        this.trackFrames = z;
    }

    @Override // org.jacoco.core.internal.flow.IProbeIdGenerator
    public int nextId() {
        int i = this.counter;
        this.counter = i + 1;
        return i;
    }

    @Override // org.objectweb.asm.ClassVisitor
    public void visit(int i, int i2, String str, String str2, String str3, String[] strArr) {
        this.name = str;
        super.visit(i, i2, str, str2, str3, strArr);
    }

    @Override // org.objectweb.asm.ClassVisitor
    public void visitEnd() {
        this.cv.visitTotalProbeCount(this.counter);
        super.visitEnd();
    }

    @Override // org.objectweb.asm.ClassVisitor
    public final MethodVisitor visitMethod(int i, String str, String str2, String str3, String[] strArr) {
        MethodProbesVisitor methodProbesVisitorVisitMethod = this.cv.visitMethod(i, str, str2, str3, strArr);
        if (methodProbesVisitorVisitMethod == null) {
            methodProbesVisitorVisitMethod = EMPTY_METHOD_PROBES_VISITOR;
        }
        final MethodProbesVisitor methodProbesVisitor = methodProbesVisitorVisitMethod;
        return new MethodSanitizer(null, i, str, str2, str3, strArr) { // from class: org.jacoco.core.internal.flow.ClassProbesAdapter.2
            @Override // org.objectweb.asm.commons.JSRInlinerAdapter, org.objectweb.asm.tree.MethodNode, org.objectweb.asm.MethodVisitor
            public void visitEnd() {
                super.visitEnd();
                LabelFlowAnalyzer.markLabels(this);
                MethodProbesAdapter methodProbesAdapter = new MethodProbesAdapter(methodProbesVisitor, ClassProbesAdapter.this);
                if (!ClassProbesAdapter.this.trackFrames) {
                    methodProbesVisitor.accept(this, methodProbesAdapter);
                    return;
                }
                AnalyzerAdapter analyzerAdapter = new AnalyzerAdapter(ClassProbesAdapter.this.name, this.access, this.name, this.desc, methodProbesAdapter);
                methodProbesAdapter.setAnalyzer(analyzerAdapter);
                methodProbesVisitor.accept(this, analyzerAdapter);
            }
        };
    }
}
