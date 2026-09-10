package com.google.android.gms.internal.play_billing;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class v extends r {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final v f24489e = new v(0, new Object[0]);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient Object[] f24490c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient int f24491d;

    public v(int i10, Object[] objArr) {
        this.f24490c = objArr;
        this.f24491d = i10;
    }

    @Override // com.google.android.gms.internal.play_billing.r, com.google.android.gms.internal.play_billing.o
    public final int b(Object[] objArr) {
        Object[] objArr2 = this.f24490c;
        int i10 = this.f24491d;
        System.arraycopy(objArr2, 0, objArr, 0, i10);
        return i10;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        no.b.I(i10, this.f24491d);
        Object obj = this.f24490c[i10];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // com.google.android.gms.internal.play_billing.o
    public final int h() {
        return this.f24491d;
    }

    @Override // com.google.android.gms.internal.play_billing.o
    public final int m() {
        return 0;
    }

    @Override // com.google.android.gms.internal.play_billing.o
    public final boolean p() {
        return false;
    }

    @Override // com.google.android.gms.internal.play_billing.o
    public final Object[] q() {
        return this.f24490c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f24491d;
    }
}
