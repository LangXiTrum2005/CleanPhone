package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.CheckForNull;
import org.jacoco.core.data.ExecutionDataWriter;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ll, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C2425ll<K, V> implements Iterator<Map.Entry<K, Collection<V>>> {
    public static byte[] A03;

    @CheckForNull
    public Collection<V> A00;
    public final Iterator<Map.Entry<K, Collection<V>>> A01;
    public final /* synthetic */ C1102Bt A02;

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
        A03 = new byte[]{13, 14, -65, 2, 0, 11, 11, 18, -65, 19, 14, -65, 13, 4, 23, 19, -57, -56, -65, 18, 8, 13, 2, 4, -65, 19, 7, 4, -65, 11, 0, 18, 19, -65, 2, 0, 11, 11, -65, 19, 14, -65, ExecutionDataWriter.BLOCK_EXECUTIONDATA, 4, 12, 14, 21, 4, -57, -56};
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.ll != com.google.common.collect.AbstractMapBasedMultimap<K, V>$AsMap$AsMapIterator */
    public C2425ll(final C1102Bt this$1) {
        this.A02 = this$1;
        this.A01 = this.A02.A00.entrySet().iterator();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.ll != com.google.common.collect.AbstractMapBasedMultimap<K, V>$AsMap$AsMapIterator */
    @Override // java.util.Iterator
    /* JADX INFO: renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final Map.Entry<K, Collection<V>> next() {
        Map.Entry<K, Collection<V>> next = this.A01.next();
        this.A00 = next.getValue();
        Map.Entry<K, Collection<V>> entry = this.A02.A0A(next);
        return entry;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.ll != com.google.common.collect.AbstractMapBasedMultimap<K, V>$AsMap$AsMapIterator */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.A01.hasNext();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.ll != com.google.common.collect.AbstractMapBasedMultimap<K, V>$AsMap$AsMapIterator */
    @Override // java.util.Iterator
    public final void remove() {
        AbstractC2361ki.A0F(this.A00 != null, A00(0, 50, 112));
        this.A01.remove();
        C2L.A03(this.A02.A01, this.A00.size());
        this.A00.clear();
        this.A00 = null;
    }
}
