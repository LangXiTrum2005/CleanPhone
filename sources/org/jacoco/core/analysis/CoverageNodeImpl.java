package org.jacoco.core.analysis;

import com.ironsource.X3;
import java.util.Collection;
import java.util.Iterator;
import org.jacoco.core.internal.analysis.CounterImpl;

/* JADX INFO: loaded from: classes5.dex */
public class CoverageNodeImpl implements ICoverageNode {
    protected CounterImpl branchCounter;
    protected CounterImpl classCounter;
    protected CounterImpl complexityCounter;
    private final ICoverageNode.ElementType elementType;
    protected CounterImpl instructionCounter;
    protected CounterImpl lineCounter;
    protected CounterImpl methodCounter;
    private final String name;

    /* JADX INFO: renamed from: org.jacoco.core.analysis.CoverageNodeImpl$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$jacoco$core$analysis$ICoverageNode$CounterEntity;

        static {
            int[] iArr = new int[ICoverageNode.CounterEntity.values().length];
            $SwitchMap$org$jacoco$core$analysis$ICoverageNode$CounterEntity = iArr;
            try {
                iArr[ICoverageNode.CounterEntity.INSTRUCTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$jacoco$core$analysis$ICoverageNode$CounterEntity[ICoverageNode.CounterEntity.BRANCH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$jacoco$core$analysis$ICoverageNode$CounterEntity[ICoverageNode.CounterEntity.LINE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$org$jacoco$core$analysis$ICoverageNode$CounterEntity[ICoverageNode.CounterEntity.COMPLEXITY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$org$jacoco$core$analysis$ICoverageNode$CounterEntity[ICoverageNode.CounterEntity.METHOD.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$org$jacoco$core$analysis$ICoverageNode$CounterEntity[ICoverageNode.CounterEntity.CLASS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public CoverageNodeImpl(ICoverageNode.ElementType elementType, String str) {
        this.elementType = elementType;
        this.name = str;
        CounterImpl counterImpl = CounterImpl.COUNTER_0_0;
        this.branchCounter = counterImpl;
        this.instructionCounter = counterImpl;
        this.complexityCounter = counterImpl;
        this.methodCounter = counterImpl;
        this.classCounter = counterImpl;
        this.lineCounter = counterImpl;
    }

    @Override // org.jacoco.core.analysis.ICoverageNode
    public boolean containsCode() {
        return getInstructionCounter().getTotalCount() != 0;
    }

    @Override // org.jacoco.core.analysis.ICoverageNode
    public ICounter getBranchCounter() {
        return this.branchCounter;
    }

    @Override // org.jacoco.core.analysis.ICoverageNode
    public ICounter getClassCounter() {
        return this.classCounter;
    }

    @Override // org.jacoco.core.analysis.ICoverageNode
    public ICounter getComplexityCounter() {
        return this.complexityCounter;
    }

    @Override // org.jacoco.core.analysis.ICoverageNode
    public ICounter getCounter(ICoverageNode.CounterEntity counterEntity) {
        switch (AnonymousClass1.$SwitchMap$org$jacoco$core$analysis$ICoverageNode$CounterEntity[counterEntity.ordinal()]) {
            case 1:
                return getInstructionCounter();
            case 2:
                return getBranchCounter();
            case 3:
                return getLineCounter();
            case 4:
                return getComplexityCounter();
            case 5:
                return getMethodCounter();
            case 6:
                return getClassCounter();
            default:
                throw new AssertionError(counterEntity);
        }
    }

    @Override // org.jacoco.core.analysis.ICoverageNode
    public ICoverageNode.ElementType getElementType() {
        return this.elementType;
    }

    @Override // org.jacoco.core.analysis.ICoverageNode
    public ICounter getInstructionCounter() {
        return this.instructionCounter;
    }

    @Override // org.jacoco.core.analysis.ICoverageNode
    public ICounter getLineCounter() {
        return this.lineCounter;
    }

    @Override // org.jacoco.core.analysis.ICoverageNode
    public ICounter getMethodCounter() {
        return this.methodCounter;
    }

    @Override // org.jacoco.core.analysis.ICoverageNode
    public String getName() {
        return this.name;
    }

    @Override // org.jacoco.core.analysis.ICoverageNode
    public ICoverageNode getPlainCopy() {
        CoverageNodeImpl coverageNodeImpl = new CoverageNodeImpl(this.elementType, this.name);
        coverageNodeImpl.instructionCounter = CounterImpl.getInstance(this.instructionCounter);
        coverageNodeImpl.branchCounter = CounterImpl.getInstance(this.branchCounter);
        coverageNodeImpl.lineCounter = CounterImpl.getInstance(this.lineCounter);
        coverageNodeImpl.complexityCounter = CounterImpl.getInstance(this.complexityCounter);
        coverageNodeImpl.methodCounter = CounterImpl.getInstance(this.methodCounter);
        coverageNodeImpl.classCounter = CounterImpl.getInstance(this.classCounter);
        return coverageNodeImpl;
    }

    public void increment(ICoverageNode iCoverageNode) {
        this.instructionCounter = this.instructionCounter.increment(iCoverageNode.getInstructionCounter());
        this.branchCounter = this.branchCounter.increment(iCoverageNode.getBranchCounter());
        this.lineCounter = this.lineCounter.increment(iCoverageNode.getLineCounter());
        this.complexityCounter = this.complexityCounter.increment(iCoverageNode.getComplexityCounter());
        this.methodCounter = this.methodCounter.increment(iCoverageNode.getMethodCounter());
        this.classCounter = this.classCounter.increment(iCoverageNode.getClassCounter());
    }

    public String toString() {
        return this.name + " [" + this.elementType + X3.j.e;
    }

    public void increment(Collection<? extends ICoverageNode> collection2) {
        Iterator<? extends ICoverageNode> it = collection2.iterator();
        while (it.hasNext()) {
            increment(it.next());
        }
    }
}
