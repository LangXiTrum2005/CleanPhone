package com.google.common.graph;

import com.google.common.collect.UnmodifiableIterator;
import java.util.AbstractSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
class MapIteratorCache<K, V> {

    /* JADX INFO: renamed from: com.google.common.graph.MapIteratorCache$1, reason: invalid class name */
    class AnonymousClass1 extends AbstractSet<Object> {

        /* JADX INFO: renamed from: com.google.common.graph.MapIteratorCache$1$1, reason: invalid class name and collision with other inner class name */
        class C02071 extends UnmodifiableIterator<Object> {
            @Override // java.util.Iterator
            public final boolean hasNext() {
                throw null;
            }

            @Override // java.util.Iterator
            public final Object next() {
                throw null;
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator iterator() {
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            throw null;
        }
    }
}
