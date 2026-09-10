package com.google.common.collect;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.SortedSet;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: ForwardingSortedSet.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class palmyra<E> extends gusty<E> implements SortedSet<E> {
    @Override // java.util.SortedSet
    @CheckForNull
    public Comparator<? super E> comparator() {
        return wireman().comparator();
    }

    @Override // com.google.common.collect.gusty, com.google.common.collect.underbelly, com.google.common.collect.igbo
    /* JADX INFO: renamed from: delegate */
    public abstract SortedSet<E> wireman();

    @Override // java.util.SortedSet
    public E first() {
        return wireman().first();
    }

    @Override // java.util.SortedSet
    public SortedSet<E> headSet(E e) {
        return wireman().headSet(e);
    }

    @Override // java.util.SortedSet
    public E last() {
        return wireman().last();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.underbelly
    public boolean standardContains(@CheckForNull Object obj) {
        try {
            return picketboat.wireman(comparator(), tailSet(obj).first(), obj) == 0;
        } catch (ClassCastException | NullPointerException | NoSuchElementException unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.underbelly
    public boolean standardRemove(@CheckForNull Object obj) {
        try {
            Iterator<E> it = tailSet(obj).iterator();
            if (it.hasNext()) {
                if (picketboat.wireman(comparator(), it.next(), obj) == 0) {
                    it.remove();
                    return true;
                }
            }
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public SortedSet<E> standardSubSet(E e, E e2) {
        return tailSet(e).headSet(e2);
    }

    @Override // java.util.SortedSet
    public SortedSet<E> subSet(E e, E e2) {
        return wireman().subSet(e, e2);
    }

    @Override // java.util.SortedSet
    public SortedSet<E> tailSet(E e) {
        return wireman().tailSet(e);
    }
}
