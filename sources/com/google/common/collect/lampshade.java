package com.google.common.collect;

import java.util.Comparator;

/* JADX INFO: compiled from: SortedIterable.java */
/* JADX INFO: loaded from: classes3.dex */
public interface lampshade<T> extends Iterable<T> {
    Comparator<? super T> comparator();
}
