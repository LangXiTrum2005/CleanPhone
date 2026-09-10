package com.google.common.collect;

import java.lang.Comparable;
import java.util.Set;

/* JADX INFO: compiled from: RangeSet.java */
/* JADX INFO: loaded from: classes3.dex */
public interface mastfed<C extends Comparable> {
    Set<Range<C>> asRanges();

    mastfed<C> complement();

    boolean encloses(Range<C> range);

    boolean isEmpty();

    void removeAll(mastfed<C> mastfedVar);

    mastfed<C> subRangeSet(Range<C> range);
}
