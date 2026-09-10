package com.facebook.ads.redexgen.core;

import java.util.Collection;
import java.util.HashSet;
import java.util.Map;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class BI<K, V> extends AbstractC2879qf<Map.Entry<K, V>> {
    public abstract Map<K, V> A00();

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.core.AbstractC2879qf, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection<?> c2) {
        try {
            return super.removeAll((Collection) AbstractC2530ki.A04(c2));
        } catch (UnsupportedOperationException unused) {
            return AbstractC2883qj.A0B(this, c2.iterator());
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.core.AbstractC2879qf, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection<?> c2) {
        try {
            return super.retainAll((Collection) AbstractC2530ki.A04(c2));
        } catch (UnsupportedOperationException unused) {
            HashSet hashSetA06 = AbstractC2883qj.A06(c2.size());
            for (Object obj : c2) {
                if (contains(obj) && (obj instanceof Map.Entry)) {
                    hashSetA06.add(((Map.Entry) obj).getKey());
                }
            }
            return A00().keySet().retainAll(hashSetA06);
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BI != com.google.common.collect.Maps$EntrySet<K, V> */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        A00().clear();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BI != com.google.common.collect.Maps$EntrySet<K, V> */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return A00().isEmpty();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BI != com.google.common.collect.Maps$EntrySet<K, V> */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return A00().size();
    }
}
