package com.facebook.ads.redexgen.core;

import com.google.common.collect.ElementTypesAreNonnullByDefault;
import com.google.common.collect.ParametricNullness;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import javax.annotation.CheckForNull;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.2L, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
@ElementTypesAreNonnullByDefault
public abstract class C2L<K, V> extends AbstractC1268Bq<K, V> implements Serializable {
    public static byte[] A02 = null;
    public static String[] A03 = {"8r4g5TVHuPTTEnOtjBSYLe2NoPZev3PL", "ZANRIcgacCs2MrGdQFs4BnSQ4f0OwMHM", "INAFHP4NB26l7mhFzzAYwDEUO08LdW1T", "w9HTcMerj5Ucor1CBa36675WVQ4LimP", "S0p05mXNQ0J7ss", "bhB1flpiQfpMN0", "TPylgZWOdIZWygeLq1OgLn1DVzZt4taa", "Gp6xvn2xjKoLwUaOKBIxtDMJneYJVeH8"};
    public static final long serialVersionUID = 2447537837011683357L;
    public transient int A00;
    public transient Map<K, Collection<V>> A01;

    public static String A04(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 76);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A08() {
        A02 = new byte[]{56, 19, 1, 86, 53, 25, 26, 26, 19, 21, 2, 31, 25, 24, 86, 0, 31, 25, 26, 23, 2, 19, 18, 86, 2, 30, 19, 86, 53, 25, 26, 26, 19, 21, 2, 31, 25, 24, 86, 5, 6, 19, 21};
    }

    public abstract Collection<V> A0D();

    public abstract Collection<V> A0F(@ParametricNullness K key, Collection<V> collection);

    public abstract <E> Collection<E> A0G(Collection<E> collection);

    static {
        A08();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2L != com.google.common.collect.AbstractMapBasedMultimap<K, V> */
    public C2L(Map<K, Collection<V>> map) {
        AbstractC2530ki.A0C(map.isEmpty());
        this.A01 = map;
    }

    public static /* synthetic */ int A00(C2L c2l) {
        int i2 = c2l.A00;
        c2l.A00 = i2 + 1;
        return i2;
    }

    public static /* synthetic */ int A01(C2L c2l) {
        int i2 = c2l.A00;
        c2l.A00 = i2 - 1;
        return i2;
    }

    public static /* synthetic */ int A02(C2L c2l, int i2) {
        int i3 = c2l.A00 + i2;
        c2l.A00 = i3;
        return i3;
    }

    public static /* synthetic */ int A03(C2L c2l, int i2) {
        int i3 = c2l.A00 - i2;
        c2l.A00 = i3;
        return i3;
    }

    public static <E> Iterator<E> A05(Collection<E> collection) {
        if (collection instanceof List) {
            return ((List) collection).listIterator();
        }
        return collection.iterator();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2L != com.google.common.collect.AbstractMapBasedMultimap<K, V> */
    public void A0A(@CheckForNull Object key) {
        Collection<V> collection = (Collection) AbstractC2830po.A06(this.A01, key);
        if (collection != null) {
            int count = collection.size();
            collection.clear();
            this.A00 -= count;
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2L != com.google.common.collect.AbstractMapBasedMultimap<K, V> */
    @Override // com.facebook.ads.redexgen.core.AbstractC1268Bq
    public final Collection<V> A0B() {
        return new C2601ls(this);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2L != com.google.common.collect.AbstractMapBasedMultimap<K, V> */
    @Override // com.facebook.ads.redexgen.core.AbstractC1268Bq
    public Iterator<V> A0C() {
        return new C1272Bu(this);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2L != com.google.common.collect.AbstractMapBasedMultimap<K, V> */
    public Collection<V> A0E(@ParametricNullness K key) {
        return A0D();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2L != com.google.common.collect.AbstractMapBasedMultimap<K, V> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.lp != com.google.common.collect.AbstractMapBasedMultimap<K, V>$WrappedCollection */
    /* JADX WARN: Incorrect inner types in method signature: (TK;Ljava/util/List<TV;>;Lcom/facebook/ads/redexgen/X/2L<TK;TV;>.WrappedCollection;)Ljava/util/List<TV;>; */
    public final List A0H(@ParametricNullness Object key, @CheckForNull List list, C2598lp ancestor) {
        if (list instanceof RandomAccess) {
            return new C2N(this, key, list, ancestor);
        }
        return new C1269Br(this, key, list, ancestor);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2L != com.google.common.collect.AbstractMapBasedMultimap<K, V> */
    public Map<K, Collection<V>> A0I() {
        return this.A01;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2L != com.google.common.collect.AbstractMapBasedMultimap<K, V> */
    public final Map<K, Collection<V>> A0J() {
        if (this.A01 instanceof NavigableMap) {
            return new AnonymousClass19(this, (NavigableMap) this.A01);
        }
        boolean z2 = this.A01 instanceof SortedMap;
        if (A03[2].charAt(31) == 'o') {
            throw new RuntimeException();
        }
        A03[3] = "NCYt1eTwLWbpcysHbDqNMrCxO6pYN55";
        if (z2) {
            return new C2M(this, (SortedMap) this.A01);
        }
        return new C1271Bt(this, this.A01);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2L != com.google.common.collect.AbstractMapBasedMultimap<K, V> */
    public final Set<K> A0K() {
        if (this.A01 instanceof NavigableMap) {
            return new C0u(this, (NavigableMap) this.A01);
        }
        if (this.A01 instanceof SortedMap) {
            return new AnonymousClass18(this, (SortedMap) this.A01);
        }
        return new C2O(this, this.A01);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2L != com.google.common.collect.AbstractMapBasedMultimap<K, V> */
    public final void A0L(Map<K, Collection<V>> map) {
        this.A01 = map;
        this.A00 = 0;
        for (Collection<V> collection : map.values()) {
            AbstractC2530ki.A0C(!collection.isEmpty());
            this.A00 += collection.size();
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2L != com.google.common.collect.AbstractMapBasedMultimap<K, V> */
    @Override // com.facebook.ads.redexgen.core.InterfaceC2845q3
    public boolean AHE(@ParametricNullness K key, @ParametricNullness V value) {
        Collection<V> collection = this.A01.get(key);
        if (collection == null) {
            Collection<V> collectionA0E = A0E(key);
            if (collectionA0E.add(value)) {
                this.A00++;
                this.A01.put(key, collectionA0E);
                return true;
            }
            throw new AssertionError(A04(0, 43, 58));
        }
        if (collection.add(value)) {
            int i2 = this.A00 + 1;
            if (A03[2].charAt(31) == 'o') {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[4] = "qdqPg3EJJL9zSp";
            strArr[5] = "JvkYzNNxKsGyOY";
            this.A00 = i2;
            return true;
        }
        return false;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2L != com.google.common.collect.AbstractMapBasedMultimap<K, V> */
    @Override // com.facebook.ads.redexgen.core.InterfaceC2845q3
    public void clear() {
        Iterator<Collection<V>> it = this.A01.values().iterator();
        while (it.hasNext()) {
            it.next().clear();
        }
        this.A01.clear();
        this.A00 = 0;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2L != com.google.common.collect.AbstractMapBasedMultimap<K, V> */
    @Override // com.facebook.ads.redexgen.core.InterfaceC2845q3
    public int size() {
        return this.A00;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2L != com.google.common.collect.AbstractMapBasedMultimap<K, V> */
    @Override // com.facebook.ads.redexgen.core.AbstractC1268Bq, com.facebook.ads.redexgen.core.InterfaceC2845q3
    public Collection<V> values() {
        return super.values();
    }
}
