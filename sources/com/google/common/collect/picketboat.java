package com.google.common.collect;

import java.util.Comparator;
import java.util.SortedMap;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: ForwardingSortedMap.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class picketboat<K, V> extends wostteth<K, V> implements SortedMap<K, V> {
    public static int wireman(@CheckForNull Comparator<?> comparator, @CheckForNull Object obj, @CheckForNull Object obj2) {
        return comparator == null ? ((Comparable) obj).compareTo(obj2) : comparator.compare(obj, obj2);
    }
}
