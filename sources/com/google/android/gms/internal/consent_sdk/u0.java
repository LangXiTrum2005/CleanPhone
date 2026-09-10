package com.google.android.gms.internal.consent_sdk;

import com.ironsource.X3;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class u0 extends p0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient Object f23211c;

    public u0(Object obj) {
        this.f23211c = obj;
    }

    @Override // com.google.android.gms.internal.consent_sdk.l0
    public final int b(Object[] objArr) {
        objArr[0] = this.f23211c;
        return 1;
    }

    @Override // com.google.android.gms.internal.consent_sdk.l0, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f23211c.equals(obj);
    }

    @Override // com.google.android.gms.internal.consent_sdk.p0, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f23211c.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return new q0(this.f23211c);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return defpackage.e.o(X3.j.f27834d, this.f23211c.toString(), X3.j.f27836e);
    }
}
