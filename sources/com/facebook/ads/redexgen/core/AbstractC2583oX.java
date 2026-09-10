package com.facebook.ads.redexgen.core;

import com.google.common.collect.ElementTypesAreNonnullByDefault;
import com.google.errorprone.annotations.DoNotMock;
import com.google.errorprone.annotations.concurrent.LazyInit;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.SortedMap;
import javax.annotation.CheckForNull;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.oX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
@DoNotMock("Use ImmutableMap.of or another implementation")
@ElementTypesAreNonnullByDefault
public abstract class AbstractC2583oX<K, V> implements Map<K, V>, Serializable {
    public static byte[] A03 = null;
    public static String[] A04 = {"vKCQqMCBbbLRNayk93g", "pkt0IymnSuuTvT2UABZ", "PNc8ARlkPwYFJqJCIOuFP53ZqzL63Ot9", "eX2I8z36J32Go", "gIGV4Wf8BZM4VYT7BzYv5KONe75pspBB", "tYe4jTWn6nAHNSv3aqiqFSpTtkmDAUnf", "8sr0nS9u8yYglBLPy9xKZ", "QmruhXeOtXDmPURP7V7IzoRRfHSq4IXC"};
    public static final Map.Entry<?, ?>[] A05;
    public static final long serialVersionUID = 912559;

    @CheckForNull
    @LazyInit
    public transient AbstractC2574oO<V> A00;

    @CheckForNull
    @LazyInit
    public transient BO<Map.Entry<K, V>> A01;

    @CheckForNull
    @LazyInit
    public transient BO<K> A02;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static <K, V> AbstractC2583oX<K, V> A05(Iterable<? extends Map.Entry<? extends K, ? extends V>> entries) {
        C2581oV c2581oV = new C2581oV(entries instanceof Collection ? ((Collection) entries).size() : 4);
        c2581oV.A04(entries);
        return c2581oV.A07();
    }

    public static String A07(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 10);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A08() {
        A03 = new byte[]{103, -123, 119, 50, 101, 119, -124, 123, 115, 126, 123, -116, 119, 118, 88, -127, -124, 127};
    }

    public abstract AbstractC2574oO<V> A0A();

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // java.util.Map
    /* JADX INFO: renamed from: A0B, reason: merged with bridge method [inline-methods] */
    public BO<Map.Entry<K, V>> entrySet() {
        BO<Map.Entry<K, V>> bo = this.A01;
        if (bo != null) {
            return bo;
        }
        BO<Map.Entry<K, V>> boA0D = A0D();
        this.A01 = boA0D;
        return boA0D;
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // java.util.Map
    /* JADX INFO: renamed from: A0C, reason: merged with bridge method [inline-methods] */
    public BO<K> keySet() {
        BO<K> bo = this.A02;
        if (bo != null) {
            return bo;
        }
        BO<K> boA0E = A0E();
        this.A02 = boA0E;
        return boA0E;
    }

    public abstract BO<Map.Entry<K, V>> A0D();

    public abstract BO<K> A0E();

    public abstract boolean A0F();

    @Override // java.util.Map
    @CheckForNull
    public abstract V get(@CheckForNull Object key);

    static {
        A08();
        A05 = new Map.Entry[0];
    }

    public static <K, V> C2581oV<K, V> A03() {
        return new C2581oV<>();
    }

    public static <K, V> AbstractC2583oX<K, V> A04() {
        AbstractC2583oX<K, V> abstractC2583oX = (AbstractC2583oX<K, V>) B9.A04;
        if (A04[4].charAt(3) != 'V') {
            throw new RuntimeException();
        }
        String[] strArr = A04;
        strArr[0] = "QWSx7KQEMPZzsm7sYqB";
        strArr[1] = "rV1plHJifYQu2yuYFjd";
        return abstractC2583oX;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.oX != com.google.common.collect.ImmutableMap<K, V> */
    public static <K, V> AbstractC2583oX<K, V> A06(Map<? extends K, ? extends V> map) {
        if ((map instanceof AbstractC2583oX) && !(map instanceof SortedMap)) {
            AbstractC2583oX<K, V> abstractC2583oX = (AbstractC2583oX) map;
            if (!abstractC2583oX.A0F()) {
                return abstractC2583oX;
            }
        }
        return A05(map.entrySet());
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.oO != com.google.common.collect.ImmutableCollection<V> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.oX != com.google.common.collect.ImmutableMap<K, V> */
    @Override // java.util.Map
    /* JADX INFO: renamed from: A09, reason: merged with bridge method [inline-methods] */
    public AbstractC2574oO<V> values() {
        AbstractC2574oO<V> abstractC2574oOA0A = this.A00;
        if (abstractC2574oOA0A == null) {
            abstractC2574oOA0A = A0A();
            if (A04[3].length() == 23) {
                throw new RuntimeException();
            }
            A04[6] = "23ujWmcydF5ICCpn56C";
            this.A00 = abstractC2574oOA0A;
        }
        return abstractC2574oOA0A;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.oX != com.google.common.collect.ImmutableMap<K, V> */
    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.oX != com.google.common.collect.ImmutableMap<K, V> */
    @Override // java.util.Map
    public boolean containsKey(@CheckForNull Object key) {
        return get(key) != null;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.oX != com.google.common.collect.ImmutableMap<K, V> */
    @Override // java.util.Map
    public final boolean containsValue(@CheckForNull Object value) {
        return values().contains(value);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.oX != com.google.common.collect.ImmutableMap<K, V> */
    @Override // java.util.Map
    public boolean equals(@CheckForNull Object object) {
        return AbstractC2661po.A0B(this, object);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.oX != com.google.common.collect.ImmutableMap<K, V> */
    @Override // java.util.Map
    @CheckForNull
    public final V getOrDefault(@CheckForNull Object key, @CheckForNull V defaultValue) {
        V result = get(key);
        if (result != null) {
            return result;
        }
        return defaultValue;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.oX != com.google.common.collect.ImmutableMap<K, V> */
    @Override // java.util.Map
    public int hashCode() {
        return AbstractC2714qj.A00(entrySet());
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.oX != com.google.common.collect.ImmutableMap<K, V> */
    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.oX != com.google.common.collect.ImmutableMap<K, V> */
    @Override // java.util.Map
    @CheckForNull
    @Deprecated
    public final V put(K k, V v) {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.oX != com.google.common.collect.ImmutableMap<K, V> */
    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.oX != com.google.common.collect.ImmutableMap<K, V> */
    private void readObject(ObjectInputStream stream) throws InvalidObjectException {
        throw new InvalidObjectException(A07(0, 18, 8));
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.oX != com.google.common.collect.ImmutableMap<K, V> */
    @Override // java.util.Map
    @CheckForNull
    @Deprecated
    public final V remove(@CheckForNull Object o) {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.oX != com.google.common.collect.ImmutableMap<K, V> */
    public final String toString() {
        return AbstractC2661po.A08(this);
    }
}
