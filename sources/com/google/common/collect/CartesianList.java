package com.google.common.collect;

import java.util.AbstractList;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
final class CartesianList<E> extends AbstractList<List<E>> implements RandomAccess {
    public static final /* synthetic */ int X = 0;

    /* JADX INFO: renamed from: com.google.common.collect.CartesianList$1, reason: invalid class name */
    class AnonymousClass1 extends ImmutableList<Object> {
        @Override // java.util.List
        public final Object get(int i2) {
            size();
            throw null;
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final boolean l() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            int i2 = CartesianList.X;
            throw null;
        }

        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof List)) {
            return false;
        }
        ((List) obj).size();
        throw null;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i2) {
        throw null;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof List)) {
            return -1;
        }
        ((List) obj).size();
        throw null;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof List)) {
            return -1;
        }
        ((List) obj).size();
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        throw null;
    }
}
