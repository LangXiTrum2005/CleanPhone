package com.google.common.collect;

import java.lang.Comparable;
import java.util.Iterator;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: AbstractRangeSet.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class beachfront<C extends Comparable> implements mastfed<C> {
    public void add(Range<C> range) {
        throw new UnsupportedOperationException();
    }

    public void addAll(mastfed<C> mastfedVar) {
        addAll(mastfedVar.asRanges());
    }

    public void clear() {
        remove(Range.all());
    }

    public boolean contains(C c) {
        return rangeContaining(c) != null;
    }

    @Override // com.google.common.collect.mastfed
    public abstract boolean encloses(Range<C> range);

    public boolean enclosesAll(mastfed<C> mastfedVar) {
        return enclosesAll(mastfedVar.asRanges());
    }

    public boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mastfed) {
            return asRanges().equals(((mastfed) obj).asRanges());
        }
        return false;
    }

    public final int hashCode() {
        return asRanges().hashCode();
    }

    public boolean intersects(Range<C> range) {
        return !subRangeSet(range).isEmpty();
    }

    @Override // com.google.common.collect.mastfed
    public boolean isEmpty() {
        return asRanges().isEmpty();
    }

    @CheckForNull
    public abstract Range<C> rangeContaining(C c);

    public void remove(Range<C> range) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.mastfed
    public void removeAll(mastfed<C> mastfedVar) {
        removeAll(mastfedVar.asRanges());
    }

    public final String toString() {
        return asRanges().toString();
    }

    public void addAll(Iterable<Range<C>> iterable) {
        Iterator<Range<C>> it = iterable.iterator();
        while (it.hasNext()) {
            add(it.next());
        }
    }

    public boolean enclosesAll(Iterable<Range<C>> iterable) {
        Iterator<Range<C>> it = iterable.iterator();
        while (it.hasNext()) {
            if (!encloses(it.next())) {
                return false;
            }
        }
        return true;
    }

    public void removeAll(Iterable<Range<C>> iterable) {
        Iterator<Range<C>> it = iterable.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
    }
}
