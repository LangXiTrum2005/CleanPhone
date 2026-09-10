package ym;

import java.util.Iterator;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class g implements Iterator, kk.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kotlin.jvm.internal.b f54551a;

    public g(Object[] array) {
        n.f(array, "array");
        this.f54551a = m.a(array);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f54551a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.f54551a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
