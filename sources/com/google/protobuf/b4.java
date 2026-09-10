package com.google.protobuf;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class b4 extends androidx.datastore.preferences.protobuf.i1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z3 f24778c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b4(z3 z3Var) {
        super(z3Var, 5);
        this.f24778c = z3Var;
    }

    @Override // androidx.datastore.preferences.protobuf.i1, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new a4(this.f24778c);
    }
}
