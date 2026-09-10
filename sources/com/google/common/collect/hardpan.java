package com.google.common.collect;

import java.util.Collection;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: Multiset.java */
/* JADX INFO: loaded from: classes3.dex */
public interface hardpan<E> extends Collection<E> {

    /* JADX INFO: compiled from: Multiset.java */
    public interface attabal<E> {
        int getCount();

        E getElement();
    }

    int add(E e, int i);

    boolean contains(@CheckForNull Object obj);

    @Override // java.util.Collection
    boolean containsAll(Collection<?> collection2);

    int count(@CheckForNull Object obj);

    Set<E> elementSet();

    Set<attabal<E>> entrySet();

    int remove(@CheckForNull Object obj, int i);

    @Override // java.util.Collection
    boolean remove(@CheckForNull Object obj);

    int setCount(E e, int i);

    boolean setCount(E e, int i, int i2);

    int size();
}
