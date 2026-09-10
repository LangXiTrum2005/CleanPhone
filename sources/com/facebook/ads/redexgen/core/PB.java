package com.facebook.ads.redexgen.core;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: Add missing generic type declarations: [V] */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class PB<V> implements Collection<V> {
    public static String[] A01 = {"B65p9FaUvzrFNvwuG6LjFu3dW8", "xEYdbkQkXJmqNi6lUscBQUgiZa7D0Dxz", "kpPcM5P9PMrcR9maJ", "lIn8lLeU70LUHRqRy8hC6rghr0456Bk3", "xAyovFCLcJcKz6S3I", "BHkXiShRs9wapcYGvvb8XQo", "e883n5N2Jnnmw9lqw", "xzZfUck7bISpz3H6ivOii"};
    public final /* synthetic */ PC A00;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.PB != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$ValuesCollection */
    public PB(PC pc) {
        this.A00 = pc;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.PB != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$ValuesCollection */
    @Override // java.util.Collection
    public final boolean add(V object) {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.PB != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$ValuesCollection */
    @Override // java.util.Collection
    public final boolean addAll(Collection<? extends V> collection) {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.PB != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$ValuesCollection */
    @Override // java.util.Collection
    public final void clear() {
        this.A00.A0D();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.PB != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$ValuesCollection */
    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.A00.A06(obj) >= 0;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.PB != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$ValuesCollection */
    @Override // java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.PB != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$ValuesCollection */
    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.A00.A04() == 0;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.PB != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$ValuesCollection */
    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator<V> iterator() {
        return new P7(this.A00, 1);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.PB != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$ValuesCollection */
    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        int iA06 = this.A00.A06(obj);
        if (iA06 >= 0) {
            this.A00.A0E(iA06);
            return true;
        }
        return false;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.PB != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$ValuesCollection */
    @Override // java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        int iA04 = this.A00.A04();
        boolean z2 = false;
        int i2 = 0;
        while (i2 < iA04) {
            PC pc = this.A00;
            String[] strArr = A01;
            String str = strArr[4];
            String str2 = strArr[6];
            int length = str.length();
            int N2 = str2.length();
            if (length != N2) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[7] = "8TyfarL1WEatJJNOns6yk";
            strArr2[2] = "ZFPu54ieTgZ9QJdC5";
            if (collection.contains(pc.A0B(i2, 1))) {
                this.A00.A0E(i2);
                i2--;
                iA04--;
                z2 = true;
            }
            i2++;
        }
        return z2;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.PB != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$ValuesCollection */
    @Override // java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        int iA04 = this.A00.A04();
        boolean changed = false;
        int i2 = 0;
        while (i2 < iA04) {
            if (!collection.contains(this.A00.A0B(i2, 1))) {
                this.A00.A0E(i2);
                i2--;
                iA04--;
                String[] strArr = A01;
                String str = strArr[4];
                String str2 = strArr[6];
                int length = str.length();
                int N2 = str2.length();
                if (length != N2) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A01;
                strArr2[7] = "W6fJV23d83VeGu0xKkUvg";
                strArr2[2] = "sGDul30tjAcSIzuwi";
                changed = true;
            }
            i2++;
        }
        return changed;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.PB != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$ValuesCollection */
    @Override // java.util.Collection
    public final int size() {
        return this.A00.A04();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.PB != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$ValuesCollection */
    @Override // java.util.Collection
    public final Object[] toArray() {
        return this.A00.A0G(1);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.PB != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$ValuesCollection */
    @Override // java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) this.A00.A0H(tArr, 1);
    }
}
