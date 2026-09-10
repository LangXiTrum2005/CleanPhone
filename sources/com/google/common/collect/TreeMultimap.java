package com.google.common.collect;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public class TreeMultimap<K, V> extends AbstractSortedKeySortedSetMultimap<K, V> {
    private static final long serialVersionUID = 0;
    public transient Comparator i0;
    public transient Comparator j0;

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        Comparator comparator = (Comparator) objectInputStream.readObject();
        comparator.getClass();
        this.i0 = comparator;
        Comparator comparator2 = (Comparator) objectInputStream.readObject();
        comparator2.getClass();
        this.j0 = comparator2;
        w(new TreeMap(this.i0));
        Serialization.c(this, objectInputStream, objectInputStream.readInt());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.i0);
        objectOutputStream.writeObject(this.j0);
        Serialization.f(this, objectOutputStream);
    }

    @Override // com.google.common.collect.AbstractSortedSetMultimap, com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap
    /* JADX INFO: renamed from: C */
    public final SortedSet o() {
        return new TreeSet(this.j0);
    }

    @Override // com.google.common.collect.AbstractSortedKeySortedSetMultimap
    /* JADX INFO: renamed from: D */
    public final SortedMap u() {
        return (NavigableMap) super.u();
    }

    @Override // com.google.common.collect.AbstractSortedKeySortedSetMultimap
    /* JADX INFO: renamed from: E */
    public final SortedSet keySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.Multimap
    public final boolean containsKey(Object obj) {
        return this.g0.containsKey(obj);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap
    public final Map g() {
        return q();
    }

    @Override // com.google.common.collect.AbstractSortedSetMultimap, com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public final Collection get(Object obj) {
        return (NavigableSet) super.get(obj);
    }

    @Override // com.google.common.collect.AbstractSortedKeySortedSetMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public final Set keySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap
    public final Collection p(Object obj) {
        if (obj == null) {
            this.i0.compare(obj, obj);
        }
        return o();
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.Multimap
    public final int size() {
        return this.h0;
    }

    @Override // com.google.common.collect.AbstractSortedKeySortedSetMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public final Map u() {
        return (NavigableMap) super.u();
    }

    @Override // com.google.common.collect.AbstractSortedSetMultimap, com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public final Set get(Object obj) {
        return (NavigableSet) super.get(obj);
    }

    @Override // com.google.common.collect.AbstractSortedSetMultimap, com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public final SortedSet get(Object obj) {
        return (NavigableSet) super.get(obj);
    }
}
