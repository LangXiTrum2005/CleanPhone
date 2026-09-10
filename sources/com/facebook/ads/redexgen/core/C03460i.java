package com.facebook.ads.redexgen.core;

import com.google.common.collect.ParametricNullness;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import javax.annotation.CheckForNull;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.0i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C03460i<K, V> extends C4U<K, V>.SortedAsMap implements NavigableMap<K, Collection<V>> {
    public final /* synthetic */ C4U A00;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @CheckForNull
    private final Map.Entry<K, Collection<V>> A01(Iterator<Map.Entry<K, Collection<V>>> entryIterator) {
        if (!entryIterator.hasNext()) {
            return null;
        }
        Map.Entry<K, Collection<V>> next = entryIterator.next();
        Collection<V> collectionA0D = this.A00.A0D();
        collectionA0D.addAll(next.getValue());
        entryIterator.remove();
        return AbstractC2009n2.A01(next.getKey(), this.A00.A0G(collectionA0D));
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // java.util.NavigableMap
    @CheckForNull
    public final Map.Entry<K, Collection<V>> ceilingEntry(@ParametricNullness K key) {
        Map.Entry<K, Collection<V>> entryCeilingEntry = A0B().ceilingEntry(key);
        if (entryCeilingEntry == null) {
            return null;
        }
        return A0A(entryCeilingEntry);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // java.util.NavigableMap
    @CheckForNull
    public final Map.Entry<K, Collection<V>> firstEntry() {
        Map.Entry<K, Collection<V>> entryFirstEntry = A0B().firstEntry();
        if (entryFirstEntry == null) {
            return null;
        }
        return A0A(entryFirstEntry);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // java.util.NavigableMap
    @CheckForNull
    public final Map.Entry<K, Collection<V>> floorEntry(@ParametricNullness K key) {
        Map.Entry<K, Collection<V>> entryFloorEntry = A0B().floorEntry(key);
        if (entryFloorEntry == null) {
            return null;
        }
        return A0A(entryFloorEntry);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // java.util.NavigableMap
    @CheckForNull
    public final Map.Entry<K, Collection<V>> higherEntry(@ParametricNullness K key) {
        Map.Entry<K, Collection<V>> entryHigherEntry = A0B().higherEntry(key);
        if (entryHigherEntry == null) {
            return null;
        }
        return A0A(entryHigherEntry);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // java.util.NavigableMap
    @CheckForNull
    public final Map.Entry<K, Collection<V>> lastEntry() {
        Map.Entry<K, Collection<V>> entryLastEntry = A0B().lastEntry();
        if (entryLastEntry == null) {
            return null;
        }
        return A0A(entryLastEntry);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // java.util.NavigableMap
    @CheckForNull
    public final Map.Entry<K, Collection<V>> lowerEntry(@ParametricNullness K key) {
        Map.Entry<K, Collection<V>> entryLowerEntry = A0B().lowerEntry(key);
        if (entryLowerEntry == null) {
            return null;
        }
        return A0A(entryLowerEntry);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.0i != com.google.common.collect.AbstractMapBasedMultimap<K, V>$NavigableAsMap */
    public C03460i(final C4U this$0, NavigableMap<K, Collection<V>> submap) {
        super(this$0, submap);
        this.A00 = this$0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.0i != com.google.common.collect.AbstractMapBasedMultimap<K, V>$NavigableAsMap */
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final NavigableSet<K> A0C() {
        return new C0R(this.A00, A0B());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.0i != com.google.common.collect.AbstractMapBasedMultimap<K, V>$NavigableAsMap */
    /* JADX INFO: renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final NavigableMap<K, Collection<V>> A0B() {
        return (NavigableMap) super.A0B();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.0i != com.google.common.collect.AbstractMapBasedMultimap<K, V>$NavigableAsMap */
    @Override // java.util.NavigableMap, java.util.SortedMap
    /* JADX INFO: renamed from: A03, reason: merged with bridge method [inline-methods] */
    public final NavigableMap<K, Collection<V>> headMap(@ParametricNullness K toKey) {
        return headMap(toKey, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.0i != com.google.common.collect.AbstractMapBasedMultimap<K, V>$NavigableAsMap */
    @Override // java.util.NavigableMap, java.util.SortedMap
    /* JADX INFO: renamed from: A04, reason: merged with bridge method [inline-methods] */
    public final NavigableMap<K, Collection<V>> tailMap(@ParametricNullness K fromKey) {
        return tailMap(fromKey, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.0i != com.google.common.collect.AbstractMapBasedMultimap<K, V>$NavigableAsMap */
    @Override // java.util.NavigableMap, java.util.SortedMap
    /* JADX INFO: renamed from: A05, reason: merged with bridge method [inline-methods] */
    public final NavigableMap<K, Collection<V>> subMap(@ParametricNullness K fromKey, @ParametricNullness K toKey) {
        return subMap(fromKey, true, toKey, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.0i != com.google.common.collect.AbstractMapBasedMultimap<K, V>$NavigableAsMap */
    @Override // java.util.SortedMap, java.util.Map
    /* JADX INFO: renamed from: A06, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final NavigableSet<K> keySet() {
        return (NavigableSet) super.keySet();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.0i != com.google.common.collect.AbstractMapBasedMultimap<K, V>$NavigableAsMap */
    @Override // java.util.NavigableMap
    @CheckForNull
    public final K ceilingKey(@ParametricNullness K key) {
        return A0B().ceilingKey(key);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.0i != com.google.common.collect.AbstractMapBasedMultimap<K, V>$NavigableAsMap */
    @Override // java.util.NavigableMap
    public final NavigableSet<K> descendingKeySet() {
        return descendingMap().navigableKeySet();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.0i != com.google.common.collect.AbstractMapBasedMultimap<K, V>$NavigableAsMap */
    @Override // java.util.NavigableMap
    public final NavigableMap<K, Collection<V>> descendingMap() {
        return new C03460i(this.A00, A0B().descendingMap());
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.0i != com.google.common.collect.AbstractMapBasedMultimap<K, V>$NavigableAsMap */
    @Override // java.util.NavigableMap
    @CheckForNull
    public final K floorKey(@ParametricNullness K key) {
        return A0B().floorKey(key);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.0i != com.google.common.collect.AbstractMapBasedMultimap<K, V>$NavigableAsMap */
    @Override // java.util.NavigableMap
    public final NavigableMap<K, Collection<V>> headMap(@ParametricNullness K toKey, boolean inclusive) {
        return new C03460i(this.A00, A0B().headMap(toKey, inclusive));
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.0i != com.google.common.collect.AbstractMapBasedMultimap<K, V>$NavigableAsMap */
    @Override // java.util.NavigableMap
    @CheckForNull
    public final K higherKey(@ParametricNullness K key) {
        return A0B().higherKey(key);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.0i != com.google.common.collect.AbstractMapBasedMultimap<K, V>$NavigableAsMap */
    @Override // java.util.NavigableMap
    @CheckForNull
    public final K lowerKey(@ParametricNullness K key) {
        return A0B().lowerKey(key);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.0i != com.google.common.collect.AbstractMapBasedMultimap<K, V>$NavigableAsMap */
    @Override // java.util.NavigableMap
    public final NavigableSet<K> navigableKeySet() {
        return keySet();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.0i != com.google.common.collect.AbstractMapBasedMultimap<K, V>$NavigableAsMap */
    @Override // java.util.NavigableMap
    @CheckForNull
    public final Map.Entry<K, Collection<V>> pollFirstEntry() {
        return A01(entrySet().iterator());
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.0i != com.google.common.collect.AbstractMapBasedMultimap<K, V>$NavigableAsMap */
    @Override // java.util.NavigableMap
    @CheckForNull
    public final Map.Entry<K, Collection<V>> pollLastEntry() {
        return A01(descendingMap().entrySet().iterator());
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.0i != com.google.common.collect.AbstractMapBasedMultimap<K, V>$NavigableAsMap */
    @Override // java.util.NavigableMap
    public final NavigableMap<K, Collection<V>> subMap(@ParametricNullness K fromKey, @ParametricNullness boolean fromInclusive, K toKey, boolean toInclusive) {
        return new C03460i(this.A00, A0B().subMap(fromKey, fromInclusive, toKey, toInclusive));
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.0i != com.google.common.collect.AbstractMapBasedMultimap<K, V>$NavigableAsMap */
    @Override // java.util.NavigableMap
    public final NavigableMap<K, Collection<V>> tailMap(@ParametricNullness K fromKey, boolean inclusive) {
        return new C03460i(this.A00, A0B().tailMap(fromKey, inclusive));
    }
}
