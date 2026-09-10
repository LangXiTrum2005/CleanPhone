package com.google.protobuf;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class i2 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Iterator f24858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Internal.MapAdapter f24859b;

    public i2(Internal.MapAdapter mapAdapter, Iterator it) {
        this.f24859b = mapAdapter;
        this.f24858a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f24858a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return new h2(this.f24859b, (Map.Entry) this.f24858a.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f24858a.remove();
    }
}
