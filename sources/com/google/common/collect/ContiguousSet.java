package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.lang.Comparable;
import java.util.NavigableSet;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public abstract class ContiguousSet<C extends Comparable> extends ImmutableSortedSet<C> {
    public static final /* synthetic */ int g0 = 0;

    public ContiguousSet() {
        super(NaturalOrdering.Z);
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    public ImmutableSortedSet C() {
        return new DescendingImmutableSortedSet(this);
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    /* JADX INFO: renamed from: G */
    public final ImmutableSortedSet headSet(Object obj) {
        Comparable comparable = (Comparable) obj;
        comparable.getClass();
        return I(comparable, false);
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    /* JADX INFO: renamed from: H */
    public final ImmutableSortedSet headSet(Object obj, boolean z2) {
        Comparable comparable = (Comparable) obj;
        comparable.getClass();
        return I(comparable, z2);
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    /* JADX INFO: renamed from: J */
    public final ImmutableSortedSet subSet(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        comparable2.getClass();
        Preconditions.f(this.e0.compare(comparable, comparable2) <= 0);
        return L(comparable, true, comparable2, false);
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    /* JADX INFO: renamed from: K */
    public final ImmutableSortedSet subSet(Object obj, boolean z2, Object obj2, boolean z3) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        comparable2.getClass();
        Preconditions.f(this.e0.compare(comparable, comparable2) <= 0);
        return L(comparable, z2, comparable2, z3);
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    /* JADX INFO: renamed from: M */
    public final ImmutableSortedSet tailSet(Object obj) {
        Comparable comparable = (Comparable) obj;
        comparable.getClass();
        return O(comparable, true);
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    /* JADX INFO: renamed from: N */
    public final ImmutableSortedSet tailSet(Object obj, boolean z2) {
        Comparable comparable = (Comparable) obj;
        comparable.getClass();
        return O(comparable, z2);
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    /* JADX INFO: renamed from: P */
    public abstract ContiguousSet I(Comparable comparable, boolean z2);

    public abstract Range Q();

    @Override // com.google.common.collect.ImmutableSortedSet
    /* JADX INFO: renamed from: R */
    public abstract ContiguousSet L(Comparable comparable, boolean z2, Comparable comparable2, boolean z3);

    @Override // com.google.common.collect.ImmutableSortedSet
    /* JADX INFO: renamed from: S */
    public abstract ContiguousSet O(Comparable comparable, boolean z2);

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z2) {
        Comparable comparable = (Comparable) obj;
        comparable.getClass();
        return I(comparable, z2);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public final NavigableSet subSet(Object obj, boolean z2, Object obj2, boolean z3) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        comparable2.getClass();
        Preconditions.f(this.e0.compare(comparable, comparable2) <= 0);
        return L(comparable, z2, comparable2, z3);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z2) {
        Comparable comparable = (Comparable) obj;
        comparable.getClass();
        return O(comparable, z2);
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return Q().toString();
    }

    @Override // com.google.common.collect.ImmutableSortedSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return super.writeReplace();
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet, java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        Comparable comparable = (Comparable) obj;
        comparable.getClass();
        return I(comparable, false);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet, java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        Comparable comparable = (Comparable) obj;
        comparable.getClass();
        return O(comparable, true);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet, java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        comparable2.getClass();
        Preconditions.f(this.e0.compare(comparable, comparable2) <= 0);
        return L(comparable, true, comparable2, false);
    }
}
