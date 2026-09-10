package com.facebook.ads.redexgen.core;

import com.google.common.collect.ElementTypesAreNonnullByDefault;
import com.google.common.collect.ParametricNullness;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.0j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
@ElementTypesAreNonnullByDefault
public abstract class AbstractC03470j<K, V> extends C4U<K, V> implements OB<K, V> {
    public static final long serialVersionUID = 6588350623831699109L;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.core.C4U
    public final Collection<V> A0F(@ParametricNullness K key, Collection<V> collection) {
        return A0H(key, (List) collection, null);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.0j != com.google.common.collect.AbstractListMultimap<K, V> */
    public AbstractC03470j(Map<K, Collection<V>> map) {
        super(map);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.0j != com.google.common.collect.AbstractListMultimap<K, V> */
    @Override // com.facebook.ads.redexgen.core.C4U
    public final <E> Collection<E> A0G(Collection<E> collection) {
        return Collections.unmodifiableList((List) collection);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.0j != com.google.common.collect.AbstractListMultimap<K, V> */
    @Override // com.facebook.ads.redexgen.core.AbstractC0928Ob, com.facebook.ads.redexgen.core.InterfaceC2024nH
    public Map<K, Collection<V>> A47() {
        return super.A47();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.0j != com.google.common.collect.AbstractListMultimap<K, V> */
    @Override // com.facebook.ads.redexgen.core.C4U, com.facebook.ads.redexgen.core.InterfaceC2024nH
    public boolean AGM(@ParametricNullness K key, @ParametricNullness V value) {
        return super.AGM(key, value);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.0j != com.google.common.collect.AbstractListMultimap<K, V> */
    @Override // com.facebook.ads.redexgen.core.AbstractC0928Ob
    public boolean equals(@CheckForNull Object object) {
        return super.equals(object);
    }
}
