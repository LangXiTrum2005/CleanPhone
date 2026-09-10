package com.google.common.collect;

import java.util.Collection;
import java.util.Iterator;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: ForwardingCollection.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class underbelly<E> extends igbo implements Collection<E> {
    @Override // java.util.Collection
    public boolean add(E e) {
        return wireman().add(e);
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends E> collection2) {
        return wireman().addAll(collection2);
    }

    @Override // java.util.Collection
    public void clear() {
        wireman().clear();
    }

    @Override // java.util.Collection
    public boolean contains(@CheckForNull Object obj) {
        return wireman().contains(obj);
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection<?> collection2) {
        return wireman().containsAll(collection2);
    }

    @Override // com.google.common.collect.igbo
    /* JADX INFO: renamed from: delegate */
    public abstract Collection<E> wireman();

    @Override // java.util.Collection
    public boolean isEmpty() {
        return wireman().isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        return wireman().iterator();
    }

    @Override // java.util.Collection
    public boolean remove(@CheckForNull Object obj) {
        return wireman().remove(obj);
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<?> collection2) {
        return wireman().removeAll(collection2);
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<?> collection2) {
        return wireman().retainAll(collection2);
    }

    @Override // java.util.Collection
    public int size() {
        return wireman().size();
    }

    public boolean standardAddAll(Collection<? extends E> collection2) {
        return Iterators.attabal(this, collection2.iterator());
    }

    public void standardClear() {
        Iterators.dern(iterator());
    }

    public boolean standardContains(@CheckForNull Object obj) {
        return Iterators.marial(iterator(), obj);
    }

    public boolean standardContainsAll(Collection<?> collection2) {
        return sayid.attabal(this, collection2);
    }

    public boolean standardIsEmpty() {
        return !iterator().hasNext();
    }

    public boolean standardRemove(@CheckForNull Object obj) {
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            if (com.google.common.base.taiyuan.attabal(it.next(), obj)) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    public boolean standardRemoveAll(Collection<?> collection2) {
        return Iterators.polloi(iterator(), collection2);
    }

    public boolean standardRetainAll(Collection<?> collection2) {
        return Iterators.graveside(iterator(), collection2);
    }

    public Object[] standardToArray() {
        return toArray(new Object[size()]);
    }

    public String standardToString() {
        return sayid.wireman(this);
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return wireman().toArray();
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) wireman().toArray(tArr);
    }

    public <T> T[] standardToArray(T[] tArr) {
        return (T[]) technofreak.competently(this, tArr);
    }
}
