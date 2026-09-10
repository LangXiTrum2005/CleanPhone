package com.google.common.collect;

import com.google.errorprone.annotations.DoNotMock;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
@DoNotMock
@ElementTypesAreNonnullByDefault
public interface Multimap<K, V> {
    Collection a(Object obj);

    void clear();

    boolean containsKey(Object obj);

    boolean containsValue(Object obj);

    Collection d();

    boolean equals(Object obj);

    Collection get(Object obj);

    Multiset h();

    int hashCode();

    boolean isEmpty();

    Set keySet();

    boolean put(Object obj, Object obj2);

    boolean remove(Object obj, Object obj2);

    int size();

    Map u();

    boolean v(Object obj, Object obj2);

    Collection values();
}
