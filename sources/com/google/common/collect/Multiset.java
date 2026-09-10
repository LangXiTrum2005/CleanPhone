package com.google.common.collect;

import java.util.Collection;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public interface Multiset<E> extends Collection<E> {

    public interface Entry<E> {
        Object d();

        int getCount();
    }

    int Q0(Object obj);

    int add(int i2, Object obj);

    Set entrySet();

    boolean equals(Object obj);

    int hashCode();

    Set k();

    int m(int i2, Object obj);

    boolean r(int i2, Object obj);

    int w0(Object obj);
}
