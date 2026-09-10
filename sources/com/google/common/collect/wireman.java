package com.google.common.collect;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: AbstractMultiset.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class wireman<E> extends AbstractCollection<E> implements hardpan<E> {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    @CheckForNull
    public transient Set<hardpan.attabal<E>> f21946arytenoidectomy;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    @CheckForNull
    public transient Set<E> f21947kowloon;

    /* JADX INFO: compiled from: AbstractMultiset.java */
    public class attabal extends Multisets.saneness<E> {
        public attabal() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<E> iterator() {
            return wireman.this.elementIterator();
        }

        @Override // com.google.common.collect.Multisets.saneness
        public hardpan<E> saneness() {
            return wireman.this;
        }
    }

    /* JADX INFO: compiled from: AbstractMultiset.java */
    public class saneness extends Multisets.dern<E> {
        public saneness() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<hardpan.attabal<E>> iterator() {
            return wireman.this.entryIterator();
        }

        @Override // com.google.common.collect.Multisets.dern
        public hardpan<E> saneness() {
            return wireman.this;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return wireman.this.distinctElements();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(E e) {
        add(e, 1);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection<? extends E> collection2) {
        return Multisets.dern(this, collection2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public abstract void clear();

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.hardpan
    public boolean contains(@CheckForNull Object obj) {
        return count(obj) > 0;
    }

    public Set<E> createElementSet() {
        return new attabal();
    }

    public Set<hardpan.attabal<E>> createEntrySet() {
        return new saneness();
    }

    public abstract int distinctElements();

    public abstract Iterator<E> elementIterator();

    public Set<E> elementSet() {
        Set<E> set = this.f21947kowloon;
        if (set != null) {
            return set;
        }
        Set<E> setCreateElementSet = createElementSet();
        this.f21947kowloon = setCreateElementSet;
        return setCreateElementSet;
    }

    public abstract Iterator<hardpan.attabal<E>> entryIterator();

    public Set<hardpan.attabal<E>> entrySet() {
        Set<hardpan.attabal<E>> set = this.f21946arytenoidectomy;
        if (set != null) {
            return set;
        }
        Set<hardpan.attabal<E>> setCreateEntrySet = createEntrySet();
        this.f21946arytenoidectomy = setCreateEntrySet;
        return setCreateEntrySet;
    }

    @Override // java.util.Collection
    public final boolean equals(@CheckForNull Object obj) {
        return Multisets.marial(this, obj);
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return entrySet().hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return entrySet().isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.hardpan
    public final boolean remove(@CheckForNull Object obj) {
        return remove(obj, 1) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection<?> collection2) {
        return Multisets.taiyuan(this, collection2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection<?> collection2) {
        return Multisets.cutely(this, collection2);
    }

    public int setCount(E e, int i) {
        return Multisets.apical(this, e, i);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return entrySet().toString();
    }

    public int add(E e, int i) {
        throw new UnsupportedOperationException();
    }

    public int remove(@CheckForNull Object obj, int i) {
        throw new UnsupportedOperationException();
    }

    public boolean setCount(E e, int i, int i2) {
        return Multisets.formularize(this, e, i, i2);
    }
}
