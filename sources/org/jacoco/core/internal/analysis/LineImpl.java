package org.jacoco.core.internal.analysis;

import org.jacoco.core.analysis.ICounter;
import org.jacoco.core.analysis.ILine;

/* JADX INFO: loaded from: classes5.dex */
public abstract class LineImpl implements ILine {
    public static final LineImpl EMPTY;
    private static final LineImpl[][][][] SINGLETONS = new LineImpl[9][][][];
    private static final int SINGLETON_BRA_LIMIT = 4;
    private static final int SINGLETON_INS_LIMIT = 8;
    protected CounterImpl branches;
    protected CounterImpl instructions;

    public static final class Fix extends LineImpl {
        public Fix(int i, int i2, int i3, int i4) {
            super(CounterImpl.getInstance(i, i2), CounterImpl.getInstance(i3, i4));
        }

        @Override // org.jacoco.core.internal.analysis.LineImpl
        public LineImpl increment(ICounter iCounter, ICounter iCounter2) {
            return LineImpl.getInstance(this.instructions.increment(iCounter), this.branches.increment(iCounter2));
        }
    }

    public static final class Var extends LineImpl {
        public Var(CounterImpl counterImpl, CounterImpl counterImpl2) {
            super(counterImpl, counterImpl2);
        }

        @Override // org.jacoco.core.internal.analysis.LineImpl
        public LineImpl increment(ICounter iCounter, ICounter iCounter2) {
            this.instructions = this.instructions.increment(iCounter);
            this.branches = this.branches.increment(iCounter2);
            return this;
        }
    }

    static {
        for (int i = 0; i <= 8; i++) {
            SINGLETONS[i] = new LineImpl[9][][];
            for (int i2 = 0; i2 <= 8; i2++) {
                SINGLETONS[i][i2] = new LineImpl[5][];
                for (int i3 = 0; i3 <= 4; i3++) {
                    SINGLETONS[i][i2][i3] = new LineImpl[5];
                    for (int i4 = 0; i4 <= 4; i4++) {
                        SINGLETONS[i][i2][i3][i4] = new Fix(i, i2, i3, i4);
                    }
                }
            }
        }
        EMPTY = SINGLETONS[0][0][0][0];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static LineImpl getInstance(CounterImpl counterImpl, CounterImpl counterImpl2) {
        int missedCount = counterImpl.getMissedCount();
        int coveredCount = counterImpl.getCoveredCount();
        int missedCount2 = counterImpl2.getMissedCount();
        int coveredCount2 = counterImpl2.getCoveredCount();
        return (missedCount > 8 || coveredCount > 8 || missedCount2 > 4 || coveredCount2 > 4) ? new Var(counterImpl, counterImpl2) : SINGLETONS[missedCount][coveredCount][missedCount2][coveredCount2];
    }

    public boolean equals(Object obj) {
        if (obj instanceof ILine) {
            ILine iLine = (ILine) obj;
            if (this.instructions.equals(iLine.getInstructionCounter()) && this.branches.equals(iLine.getBranchCounter())) {
                return true;
            }
        }
        return false;
    }

    @Override // org.jacoco.core.analysis.ILine
    public ICounter getBranchCounter() {
        return this.branches;
    }

    @Override // org.jacoco.core.analysis.ILine
    public ICounter getInstructionCounter() {
        return this.instructions;
    }

    @Override // org.jacoco.core.analysis.ILine
    public int getStatus() {
        return this.instructions.getStatus() | this.branches.getStatus();
    }

    public int hashCode() {
        return (this.instructions.hashCode() * 23) ^ this.branches.hashCode();
    }

    public abstract LineImpl increment(ICounter iCounter, ICounter iCounter2);

    private LineImpl(CounterImpl counterImpl, CounterImpl counterImpl2) {
        this.instructions = counterImpl;
        this.branches = counterImpl2;
    }
}
