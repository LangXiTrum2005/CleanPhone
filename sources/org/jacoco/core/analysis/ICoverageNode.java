package org.jacoco.core.analysis;

/* JADX INFO: loaded from: classes5.dex */
public interface ICoverageNode {

    public enum CounterEntity {
        INSTRUCTION,
        BRANCH,
        LINE,
        COMPLEXITY,
        METHOD,
        CLASS
    }

    public enum ElementType {
        METHOD,
        CLASS,
        SOURCEFILE,
        PACKAGE,
        BUNDLE,
        GROUP
    }

    boolean containsCode();

    ICounter getBranchCounter();

    ICounter getClassCounter();

    ICounter getComplexityCounter();

    ICounter getCounter(CounterEntity counterEntity);

    ElementType getElementType();

    ICounter getInstructionCounter();

    ICounter getLineCounter();

    ICounter getMethodCounter();

    String getName();

    ICoverageNode getPlainCopy();
}
