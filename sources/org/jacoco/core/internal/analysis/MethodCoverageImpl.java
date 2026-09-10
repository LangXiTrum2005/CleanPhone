package org.jacoco.core.internal.analysis;

import org.jacoco.core.analysis.ICounter;
import org.jacoco.core.analysis.ICoverageNode;
import org.jacoco.core.analysis.IMethodCoverage;

/* JADX INFO: loaded from: classes5.dex */
public class MethodCoverageImpl extends SourceNodeImpl implements IMethodCoverage {
    private final String desc;
    private final String signature;

    public MethodCoverageImpl(String str, String str2, String str3) {
        super(ICoverageNode.ElementType.METHOD, str);
        this.desc = str2;
        this.signature = str3;
    }

    @Override // org.jacoco.core.analysis.IMethodCoverage
    public String getDesc() {
        return this.desc;
    }

    @Override // org.jacoco.core.analysis.IMethodCoverage
    public String getSignature() {
        return this.signature;
    }

    @Override // org.jacoco.core.internal.analysis.SourceNodeImpl
    public void increment(ICounter iCounter, ICounter iCounter2, int i) {
        super.increment(iCounter, iCounter2, i);
        if (iCounter2.getTotalCount() > 1) {
            int iMax = Math.max(0, iCounter2.getCoveredCount() - 1);
            this.complexityCounter = this.complexityCounter.increment(Math.max(0, (iCounter2.getTotalCount() - iMax) - 1), iMax);
        }
    }

    public void incrementMethodCounter() {
        CounterImpl counterImpl = this.instructionCounter.getCoveredCount() == 0 ? CounterImpl.COUNTER_1_0 : CounterImpl.COUNTER_0_1;
        this.methodCounter = this.methodCounter.increment(counterImpl);
        this.complexityCounter = this.complexityCounter.increment(counterImpl);
    }
}
