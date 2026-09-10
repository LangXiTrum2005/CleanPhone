package com.facebook.ads.redexgen.core;

import com.umeng.analytics.pro.cw;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.CheckForNull;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.jG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1781jG<K, V> implements Iterator<Map.Entry<K, Collection<V>>> {
    public static byte[] A03;

    @CheckForNull
    public Collection<V> A00;
    public final Iterator<Map.Entry<K, Collection<V>>> A01;
    public final /* synthetic */ C0931Oe A02;

    static {
        A02();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 47);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A03 = new byte[]{cw.k, cw.l, -65, 2, 0, 11, 11, 18, -65, 19, cw.l, -65, cw.k, 4, 23, 19, -57, -56, -65, 18, 8, cw.k, 2, 4, -65, 19, 7, 4, -65, 11, 0, 18, 19, -65, 2, 0, 11, 11, -65, 19, cw.l, -65, 17, 4, 12, cw.l, 21, 4, -57, -56};
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.jG != com.google.common.collect.AbstractMapBasedMultimap<K, V>$AsMap$AsMapIterator */
    public C1781jG(final C0931Oe this$1) {
        this.A02 = this$1;
        this.A01 = this.A02.A00.entrySet().iterator();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.jG != com.google.common.collect.AbstractMapBasedMultimap<K, V>$AsMap$AsMapIterator */
    @Override // java.util.Iterator
    /* JADX INFO: renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final Map.Entry<K, Collection<V>> next() {
        Map.Entry<K, Collection<V>> next = this.A01.next();
        this.A00 = next.getValue();
        Map.Entry<K, Collection<V>> entry = this.A02.A0A(next);
        return entry;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.jG != com.google.common.collect.AbstractMapBasedMultimap<K, V>$AsMap$AsMapIterator */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.A01.hasNext();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.jG != com.google.common.collect.AbstractMapBasedMultimap<K, V>$AsMap$AsMapIterator */
    @Override // java.util.Iterator
    public final void remove() {
        AbstractC1718iD.A0F(this.A00 != null, A00(0, 50, 112));
        this.A01.remove();
        C4U.A03(this.A02.A01, this.A00.size());
        this.A00.clear();
        this.A00 = null;
    }
}
