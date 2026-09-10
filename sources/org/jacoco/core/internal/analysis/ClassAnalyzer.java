package org.jacoco.core.internal.analysis;

import java.util.HashSet;
import java.util.Set;
import org.jacoco.core.internal.analysis.filter.Filters;
import org.jacoco.core.internal.analysis.filter.IFilter;
import org.jacoco.core.internal.analysis.filter.IFilterContext;
import org.jacoco.core.internal.flow.ClassProbesVisitor;
import org.jacoco.core.internal.flow.MethodProbesVisitor;
import org.jacoco.core.internal.instr.InstrSupport;
import org.objectweb.asm.AnnotationVisitor;
import org.objectweb.asm.Attribute;
import org.objectweb.asm.FieldVisitor;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.tree.MethodNode;

/* JADX INFO: loaded from: classes5.dex */
public class ClassAnalyzer extends ClassProbesVisitor implements IFilterContext {
    private final ClassCoverageImpl coverage;
    private final boolean[] probes;
    private String sourceDebugExtension;
    private final StringPool stringPool;
    private final Set<String> classAnnotations = new HashSet();
    private final Set<String> classAttributes = new HashSet();
    private final IFilter filter = Filters.all();

    public ClassAnalyzer(ClassCoverageImpl classCoverageImpl, boolean[] zArr, StringPool stringPool) {
        this.coverage = classCoverageImpl;
        this.probes = zArr;
        this.stringPool = stringPool;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMethodCoverage(String str, String str2, String str3, InstructionsBuilder instructionsBuilder, MethodNode methodNode) {
        MethodCoverageCalculator methodCoverageCalculator = new MethodCoverageCalculator(instructionsBuilder.getInstructions());
        this.filter.filter(methodNode, this, methodCoverageCalculator);
        MethodCoverageImpl methodCoverageImpl = new MethodCoverageImpl(str, str2, str3);
        methodCoverageCalculator.calculate(methodCoverageImpl);
        if (methodCoverageImpl.containsCode()) {
            this.coverage.addMethod(methodCoverageImpl);
        }
    }

    @Override // org.jacoco.core.internal.analysis.filter.IFilterContext
    public Set<String> getClassAnnotations() {
        return this.classAnnotations;
    }

    @Override // org.jacoco.core.internal.analysis.filter.IFilterContext
    public Set<String> getClassAttributes() {
        return this.classAttributes;
    }

    @Override // org.jacoco.core.internal.analysis.filter.IFilterContext
    public String getClassName() {
        return this.coverage.getName();
    }

    @Override // org.jacoco.core.internal.analysis.filter.IFilterContext
    public String getSourceDebugExtension() {
        return this.sourceDebugExtension;
    }

    @Override // org.jacoco.core.internal.analysis.filter.IFilterContext
    public String getSourceFileName() {
        return this.coverage.getSourceFileName();
    }

    @Override // org.jacoco.core.internal.analysis.filter.IFilterContext
    public String getSuperClassName() {
        return this.coverage.getSuperName();
    }

    @Override // org.objectweb.asm.ClassVisitor
    public void visit(int i, int i2, String str, String str2, String str3, String[] strArr) {
        this.coverage.setSignature(this.stringPool.get(str2));
        this.coverage.setSuperName(this.stringPool.get(str3));
        this.coverage.setInterfaces(this.stringPool.get(strArr));
    }

    @Override // org.objectweb.asm.ClassVisitor
    public AnnotationVisitor visitAnnotation(String str, boolean z) {
        this.classAnnotations.add(str);
        return super.visitAnnotation(str, z);
    }

    @Override // org.objectweb.asm.ClassVisitor
    public void visitAttribute(Attribute attribute) {
        this.classAttributes.add(attribute.type);
    }

    @Override // org.objectweb.asm.ClassVisitor
    public FieldVisitor visitField(int i, String str, String str2, String str3, Object obj) {
        InstrSupport.assertNotInstrumented(str, this.coverage.getName());
        return super.visitField(i, str, str2, str3, obj);
    }

    @Override // org.objectweb.asm.ClassVisitor
    public void visitSource(String str, String str2) {
        this.coverage.setSourceFileName(this.stringPool.get(str));
        this.sourceDebugExtension = str2;
    }

    @Override // org.jacoco.core.internal.flow.ClassProbesVisitor, org.objectweb.asm.ClassVisitor
    public MethodProbesVisitor visitMethod(int i, final String str, final String str2, final String str3, String[] strArr) {
        InstrSupport.assertNotInstrumented(str, this.coverage.getName());
        final InstructionsBuilder instructionsBuilder = new InstructionsBuilder(this.probes);
        return new MethodAnalyzer(instructionsBuilder) { // from class: org.jacoco.core.internal.analysis.ClassAnalyzer.1
            @Override // org.jacoco.core.internal.analysis.MethodAnalyzer, org.jacoco.core.internal.flow.MethodProbesVisitor
            public void accept(MethodNode methodNode, MethodVisitor methodVisitor) {
                super.accept(methodNode, methodVisitor);
                ClassAnalyzer classAnalyzer = ClassAnalyzer.this;
                classAnalyzer.addMethodCoverage(classAnalyzer.stringPool.get(str), ClassAnalyzer.this.stringPool.get(str2), ClassAnalyzer.this.stringPool.get(str3), instructionsBuilder, methodNode);
            }
        };
    }

    @Override // org.jacoco.core.internal.flow.ClassProbesVisitor
    public void visitTotalProbeCount(int i) {
    }
}
