package com.google.common.collect;

import com.p004ironsource.d9;
import java.util.Iterator;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
final class SingletonImmutableSet<E> extends ImmutableSet<E> {
    public final transient Object e0;

    public SingletonImmutableSet(Object obj) {
        obj.getClass();
        this.e0 = obj;
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.e0.equals(obj);
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    public final ImmutableList d() {
        return ImmutableList.z(this.e0);
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final int e(int i2, Object[] objArr) {
        objArr[i2] = this.e0;
        return i2 + 1;
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.e0.hashCode();
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    public final Iterator iterator() {
        Iterators.SingletonIterator singletonIterator = new Iterators.SingletonIterator();
        singletonIterator.X = this.e0;
        return singletonIterator;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final boolean l() {
        return false;
    }

    @Override // com.google.common.collect.ImmutableCollection
    /* JADX INFO: renamed from: o */
    public final UnmodifiableIterator iterator() {
        Iterators.SingletonIterator singletonIterator = new Iterators.SingletonIterator();
        singletonIterator.X = this.e0;
        return singletonIterator;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return d9.i.d + this.e0.toString() + AbstractJsonLexerKt.END_LIST;
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return super.writeReplace();
    }
}
