package com.google.android.gms.internal.play_billing;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class z extends r {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient Object[] f24504c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient int f24505d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient int f24506e;

    public z(int i10, int i11, Object[] objArr) {
        this.f24504c = objArr;
        this.f24505d = i10;
        this.f24506e = i11;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        no.b.I(i10, this.f24506e);
        Object obj = this.f24504c[i10 + i10 + this.f24505d];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // com.google.android.gms.internal.play_billing.o
    public final boolean p() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f24506e;
    }
}
