package org.jacoco.core.analysis;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class NodeComparator implements Comparator<ICoverageNode>, Serializable {
    private static final long serialVersionUID = 8550521643608826519L;
    private final Comparator<ICounter> counterComparator;
    private final ICoverageNode.CounterEntity entity;

    public NodeComparator(Comparator<ICounter> comparator, ICoverageNode.CounterEntity counterEntity) {
        this.counterComparator = comparator;
        this.entity = counterEntity;
    }

    public NodeComparator second(final Comparator<ICoverageNode> comparator) {
        return new NodeComparator(null, null) { // from class: org.jacoco.core.analysis.NodeComparator.1
            private static final long serialVersionUID = -5515272752138802838L;

            @Override // org.jacoco.core.analysis.NodeComparator, java.util.Comparator
            public int compare(ICoverageNode iCoverageNode, ICoverageNode iCoverageNode2) {
                int iCompare = this.compare(iCoverageNode, iCoverageNode2);
                return iCompare == 0 ? comparator.compare(iCoverageNode, iCoverageNode2) : iCompare;
            }
        };
    }

    public <T extends ICoverageNode> List<T> sort(Collection<T> collection2) {
        ArrayList arrayList = new ArrayList(collection2);
        Collections.sort(arrayList, this);
        return arrayList;
    }

    @Override // java.util.Comparator
    public int compare(ICoverageNode iCoverageNode, ICoverageNode iCoverageNode2) {
        return this.counterComparator.compare(iCoverageNode.getCounter(this.entity), iCoverageNode2.getCounter(this.entity));
    }
}
