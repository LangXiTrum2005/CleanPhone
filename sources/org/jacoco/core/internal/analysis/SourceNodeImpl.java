package org.jacoco.core.internal.analysis;

import org.jacoco.core.analysis.CoverageNodeImpl;
import org.jacoco.core.analysis.ICounter;
import org.jacoco.core.analysis.ICoverageNode;
import org.jacoco.core.analysis.ILine;
import org.jacoco.core.analysis.ISourceNode;

/* JADX INFO: loaded from: classes5.dex */
public class SourceNodeImpl extends CoverageNodeImpl implements ISourceNode {
    private LineImpl[] lines;
    private int offset;

    public SourceNodeImpl(ICoverageNode.ElementType elementType, String str) {
        super(elementType, str);
        this.lines = null;
        this.offset = -1;
    }

    private void incrementLine(ICounter iCounter, ICounter iCounter2, int i) {
        ensureCapacity(i, i);
        LineImpl line = getLine(i);
        int totalCount = line.getInstructionCounter().getTotalCount();
        int coveredCount = line.getInstructionCounter().getCoveredCount();
        this.lines[i - this.offset] = line.increment(iCounter, iCounter2);
        if (iCounter.getTotalCount() > 0) {
            if (iCounter.getCoveredCount() == 0) {
                if (totalCount == 0) {
                    this.lineCounter = this.lineCounter.increment(CounterImpl.COUNTER_1_0);
                }
            } else if (totalCount == 0) {
                this.lineCounter = this.lineCounter.increment(CounterImpl.COUNTER_0_1);
            } else if (coveredCount == 0) {
                this.lineCounter = this.lineCounter.increment(-1, 1);
            }
        }
    }

    public void ensureCapacity(int i, int i2) {
        if (i == -1 || i2 == -1) {
            return;
        }
        if (this.lines == null) {
            this.offset = i;
            this.lines = new LineImpl[(i2 - i) + 1];
            return;
        }
        int iMin = Math.min(getFirstLine(), i);
        int iMax = (Math.max(getLastLine(), i2) - iMin) + 1;
        LineImpl[] lineImplArr = this.lines;
        if (iMax > lineImplArr.length) {
            LineImpl[] lineImplArr2 = new LineImpl[iMax];
            System.arraycopy(lineImplArr, 0, lineImplArr2, this.offset - iMin, lineImplArr.length);
            this.offset = iMin;
            this.lines = lineImplArr2;
        }
    }

    @Override // org.jacoco.core.analysis.ISourceNode
    public int getFirstLine() {
        return this.offset;
    }

    @Override // org.jacoco.core.analysis.ISourceNode
    public int getLastLine() {
        LineImpl[] lineImplArr = this.lines;
        if (lineImplArr == null) {
            return -1;
        }
        return (this.offset + lineImplArr.length) - 1;
    }

    public void increment(ISourceNode iSourceNode) {
        this.instructionCounter = this.instructionCounter.increment(iSourceNode.getInstructionCounter());
        this.branchCounter = this.branchCounter.increment(iSourceNode.getBranchCounter());
        this.complexityCounter = this.complexityCounter.increment(iSourceNode.getComplexityCounter());
        this.methodCounter = this.methodCounter.increment(iSourceNode.getMethodCounter());
        this.classCounter = this.classCounter.increment(iSourceNode.getClassCounter());
        int firstLine = iSourceNode.getFirstLine();
        if (firstLine != -1) {
            int lastLine = iSourceNode.getLastLine();
            ensureCapacity(firstLine, lastLine);
            while (firstLine <= lastLine) {
                ILine line = iSourceNode.getLine(firstLine);
                incrementLine(line.getInstructionCounter(), line.getBranchCounter(), firstLine);
                firstLine++;
            }
        }
    }

    @Override // org.jacoco.core.analysis.ISourceNode
    public LineImpl getLine(int i) {
        if (this.lines == null || i < getFirstLine() || i > getLastLine()) {
            return LineImpl.EMPTY;
        }
        LineImpl lineImpl = this.lines[i - this.offset];
        return lineImpl == null ? LineImpl.EMPTY : lineImpl;
    }

    public void increment(ICounter iCounter, ICounter iCounter2, int i) {
        if (i != -1) {
            incrementLine(iCounter, iCounter2, i);
        }
        this.instructionCounter = this.instructionCounter.increment(iCounter);
        this.branchCounter = this.branchCounter.increment(iCounter2);
    }
}
