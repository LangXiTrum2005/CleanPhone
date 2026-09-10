package org.jacoco.core.analysis;

import java.io.Serializable;
import java.util.Comparator;

/* JADX INFO: loaded from: classes5.dex */
public class CounterComparator implements Comparator<ICounter>, Serializable {
    private static final long serialVersionUID = -3777463066252746748L;
    private final boolean reverse;
    private final ICounter.CounterValue value;
    public static final CounterComparator TOTALITEMS = new CounterComparator(ICounter.CounterValue.TOTALCOUNT);
    public static final CounterComparator COVEREDITEMS = new CounterComparator(ICounter.CounterValue.COVEREDCOUNT);
    public static final CounterComparator MISSEDITEMS = new CounterComparator(ICounter.CounterValue.MISSEDCOUNT);
    public static final CounterComparator COVEREDRATIO = new CounterComparator(ICounter.CounterValue.COVEREDRATIO);
    public static final CounterComparator MISSEDRATIO = new CounterComparator(ICounter.CounterValue.MISSEDRATIO);

    private CounterComparator(ICounter.CounterValue counterValue) {
        this(counterValue, false);
    }

    public NodeComparator on(ICoverageNode.CounterEntity counterEntity) {
        return new NodeComparator(this, counterEntity);
    }

    public CounterComparator reverse() {
        return new CounterComparator(this.value, !this.reverse);
    }

    private CounterComparator(ICounter.CounterValue counterValue, boolean z) {
        this.value = counterValue;
        this.reverse = z;
    }

    @Override // java.util.Comparator
    public int compare(ICounter iCounter, ICounter iCounter2) {
        int iCompare = Double.compare(iCounter.getValue(this.value), iCounter2.getValue(this.value));
        return this.reverse ? -iCompare : iCompare;
    }
}
