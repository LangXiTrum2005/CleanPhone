package com.inmobi.media;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableIterator;

/* JADX INFO: renamed from: com.inmobi.media.g8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3033g8 implements Iterator, KMutableIterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f23632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3049h8 f23633b;

    public C3033g8(C3049h8 c3049h8) {
        this.f23633b = c3049h8;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f23632a < this.f23633b.f23660B;
    }

    @Override // java.util.Iterator
    public final Object next() {
        try {
            ArrayList arrayList = this.f23633b.f23659A;
            int i2 = this.f23632a;
            this.f23632a = i2 + 1;
            C2984d8 c2984d8 = (C2984d8) arrayList.get(i2);
            Intrinsics.c(c2984d8);
            return c2984d8;
        } catch (IndexOutOfBoundsException e2) {
            this.f23632a--;
            throw new NoSuchElementException(e2.getMessage());
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
