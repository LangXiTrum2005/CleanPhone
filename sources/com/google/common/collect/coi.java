package com.google.common.collect;

import java.util.Comparator;

/* JADX INFO: compiled from: Comparators.java */
/* JADX INFO: loaded from: classes3.dex */
public final class coi {
    public static <T, S extends T> Comparator<Iterable<S>> attabal(Comparator<T> comparator) {
        return new LexicographicalOrdering((Comparator) com.google.common.base.formularize.triweekly(comparator));
    }
}
