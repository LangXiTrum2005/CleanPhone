package com.google.common.collect;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public abstract class ForwardingList<E> extends ForwardingCollection<E> implements List<E> {
    public abstract List A();

    public void add(int i2, Object obj) {
        A();
        Collections.EMPTY_LIST.add(i2, obj);
    }

    public boolean addAll(int i2, Collection collection) {
        A();
        return Collections.EMPTY_LIST.addAll(i2, collection);
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        A();
        return Collections.EMPTY_LIST.equals(obj);
    }

    @Override // java.util.List
    public final Object get(int i2) {
        A();
        return Collections.EMPTY_LIST.get(i2);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        A();
        return Collections.EMPTY_LIST.hashCode();
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        A();
        return Collections.EMPTY_LIST.indexOf(obj);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        A();
        return Collections.EMPTY_LIST.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        A();
        return Collections.EMPTY_LIST.listIterator();
    }

    @Override // java.util.List
    public final Object remove(int i2) {
        A();
        return Collections.EMPTY_LIST.remove(i2);
    }

    @Override // java.util.List
    public final Object set(int i2, Object obj) {
        A();
        return Collections.EMPTY_LIST.set(i2, obj);
    }

    @Override // java.util.List
    public final List subList(int i2, int i3) {
        A();
        return Collections.EMPTY_LIST.subList(i2, i3);
    }

    @Override // com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    /* JADX INFO: renamed from: w */
    public /* bridge */ /* synthetic */ Object x() {
        A();
        return Collections.EMPTY_LIST;
    }

    @Override // com.google.common.collect.ForwardingCollection
    public /* bridge */ /* synthetic */ Collection x() {
        A();
        return Collections.EMPTY_LIST;
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i2) {
        A();
        return Collections.EMPTY_LIST.listIterator(i2);
    }
}
