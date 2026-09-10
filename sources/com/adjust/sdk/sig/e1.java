package com.adjust.sdk.sig;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class e1 implements Iterator, q1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6947b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f6948c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f6949d;

    public e1(int i10, int i11, int i12) {
        this.f6946a = i12;
        this.f6947b = i11;
        boolean z10 = i12 <= 0 ? i10 >= i11 : i10 <= i11;
        this.f6948c = z10;
        this.f6949d = z10 ? i10 : i11;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f6948c;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i10 = this.f6949d;
        if (i10 != this.f6947b) {
            this.f6949d = this.f6946a + i10;
        } else {
            if (!this.f6948c) {
                throw new NoSuchElementException();
            }
            this.f6948c = false;
        }
        return Integer.valueOf(i10);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
