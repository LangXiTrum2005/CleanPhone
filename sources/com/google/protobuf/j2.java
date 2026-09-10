package com.google.protobuf;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class j2 extends AbstractSet {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f24874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Internal.MapAdapter f24875b;

    public j2(Internal.MapAdapter mapAdapter, Set set) {
        this.f24875b = mapAdapter;
        this.f24874a = set;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new i2(this.f24875b, this.f24874a.iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f24874a.size();
    }
}
