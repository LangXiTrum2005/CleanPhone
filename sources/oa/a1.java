package oa;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class a1 extends e2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f47219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f47220b;

    public a1(Object obj) {
        this.f47219a = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f47220b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f47220b) {
            throw new NoSuchElementException();
        }
        this.f47220b = true;
        return this.f47219a;
    }
}
