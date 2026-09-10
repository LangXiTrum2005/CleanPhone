package org.jacoco.core.internal.analysis;

import org.jacoco.core.analysis.ICounter;

/* JADX INFO: loaded from: classes5.dex */
public abstract class CounterImpl implements ICounter {
    public static final CounterImpl COUNTER_0_0;
    public static final CounterImpl COUNTER_0_1;
    public static final CounterImpl COUNTER_1_0;
    private static final CounterImpl[][] SINGLETONS = new CounterImpl[31][];
    private static final int SINGLETON_LIMIT = 30;
    protected int covered;
    protected int missed;

    /* JADX INFO: renamed from: org.jacoco.core.internal.analysis.CounterImpl$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$jacoco$core$analysis$ICounter$CounterValue;

        static {
            int[] iArr = new int[ICounter.CounterValue.values().length];
            $SwitchMap$org$jacoco$core$analysis$ICounter$CounterValue = iArr;
            try {
                iArr[ICounter.CounterValue.TOTALCOUNT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$jacoco$core$analysis$ICounter$CounterValue[ICounter.CounterValue.MISSEDCOUNT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$jacoco$core$analysis$ICounter$CounterValue[ICounter.CounterValue.COVEREDCOUNT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$org$jacoco$core$analysis$ICounter$CounterValue[ICounter.CounterValue.MISSEDRATIO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$org$jacoco$core$analysis$ICounter$CounterValue[ICounter.CounterValue.COVEREDRATIO.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public static class Fix extends CounterImpl {
        public Fix(int i, int i2) {
            super(i, i2);
        }

        @Override // org.jacoco.core.internal.analysis.CounterImpl
        public CounterImpl increment(int i, int i2) {
            return CounterImpl.getInstance(this.missed + i, this.covered + i2);
        }
    }

    public static class Var extends CounterImpl {
        public Var(int i, int i2) {
            super(i, i2);
        }

        @Override // org.jacoco.core.internal.analysis.CounterImpl
        public CounterImpl increment(int i, int i2) {
            this.missed += i;
            this.covered += i2;
            return this;
        }
    }

    static {
        for (int i = 0; i <= 30; i++) {
            SINGLETONS[i] = new CounterImpl[31];
            for (int i2 = 0; i2 <= 30; i2++) {
                SINGLETONS[i][i2] = new Fix(i, i2);
            }
        }
        CounterImpl[][] counterImplArr = SINGLETONS;
        CounterImpl[] counterImplArr2 = counterImplArr[0];
        COUNTER_0_0 = counterImplArr2[0];
        COUNTER_1_0 = counterImplArr[1][0];
        COUNTER_0_1 = counterImplArr2[1];
    }

    public CounterImpl(int i, int i2) {
        this.missed = i;
        this.covered = i2;
    }

    public static CounterImpl getInstance(int i, int i2) {
        return (i > 30 || i2 > 30) ? new Var(i, i2) : SINGLETONS[i][i2];
    }

    public boolean equals(Object obj) {
        if (obj instanceof ICounter) {
            ICounter iCounter = (ICounter) obj;
            if (this.missed == iCounter.getMissedCount() && this.covered == iCounter.getCoveredCount()) {
                return true;
            }
        }
        return false;
    }

    @Override // org.jacoco.core.analysis.ICounter
    public int getCoveredCount() {
        return this.covered;
    }

    @Override // org.jacoco.core.analysis.ICounter
    public double getCoveredRatio() {
        int i = this.covered;
        return ((double) i) / ((double) (this.missed + i));
    }

    @Override // org.jacoco.core.analysis.ICounter
    public int getMissedCount() {
        return this.missed;
    }

    @Override // org.jacoco.core.analysis.ICounter
    public double getMissedRatio() {
        int i = this.missed;
        return ((double) i) / ((double) (i + this.covered));
    }

    @Override // org.jacoco.core.analysis.ICounter
    public int getStatus() {
        int i = this.covered > 0 ? 2 : 0;
        return this.missed > 0 ? i | 1 : i;
    }

    @Override // org.jacoco.core.analysis.ICounter
    public int getTotalCount() {
        return this.missed + this.covered;
    }

    @Override // org.jacoco.core.analysis.ICounter
    public double getValue(ICounter.CounterValue counterValue) {
        int totalCount;
        int i = AnonymousClass1.$SwitchMap$org$jacoco$core$analysis$ICounter$CounterValue[counterValue.ordinal()];
        if (i == 1) {
            totalCount = getTotalCount();
        } else if (i == 2) {
            totalCount = getMissedCount();
        } else {
            if (i != 3) {
                if (i == 4) {
                    return getMissedRatio();
                }
                if (i == 5) {
                    return getCoveredRatio();
                }
                throw new AssertionError(counterValue);
            }
            totalCount = getCoveredCount();
        }
        return totalCount;
    }

    public int hashCode() {
        return this.missed ^ (this.covered * 17);
    }

    public abstract CounterImpl increment(int i, int i2);

    public CounterImpl increment(ICounter iCounter) {
        return increment(iCounter.getMissedCount(), iCounter.getCoveredCount());
    }

    public String toString() {
        return "Counter[" + getMissedCount() + '/' + getCoveredCount() + ']';
    }

    public static CounterImpl getInstance(ICounter iCounter) {
        return getInstance(iCounter.getMissedCount(), iCounter.getCoveredCount());
    }
}
