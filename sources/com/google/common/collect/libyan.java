package com.google.common.collect;

import java.util.Comparator;
import java.util.SortedSet;

/* JADX INFO: compiled from: SortedIterables.java */
/* JADX INFO: loaded from: classes3.dex */
public final class libyan {
    public static <E> Comparator<? super E> attabal(SortedSet<E> sortedSet) {
        Comparator<? super E> comparator = sortedSet.comparator();
        return comparator == null ? Ordering.natural() : comparator;
    }

    public static boolean saneness(Comparator<?> comparator, Iterable<?> iterable) {
        Comparator comparator2;
        com.google.common.base.formularize.triweekly(comparator);
        com.google.common.base.formularize.triweekly(iterable);
        if (iterable instanceof SortedSet) {
            comparator2 = attabal((SortedSet) iterable);
        } else {
            if (!(iterable instanceof lampshade)) {
                return false;
            }
            comparator2 = ((lampshade) iterable).comparator();
        }
        return comparator.equals(comparator2);
    }
}
