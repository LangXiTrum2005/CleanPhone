package com.google.android.gms.internal.consent_sdk;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class r0 extends o0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final r0 f23177e = new r0(0, new Object[0]);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient Object[] f23178c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient int f23179d;

    public r0(int i10, Object[] objArr) {
        this.f23178c = objArr;
        this.f23179d = i10;
    }

    @Override // com.google.android.gms.internal.consent_sdk.o0, com.google.android.gms.internal.consent_sdk.l0
    public final int b(Object[] objArr) {
        Object[] objArr2 = this.f23178c;
        int i10 = this.f23179d;
        System.arraycopy(objArr2, 0, objArr, 0, i10);
        return i10;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        j0.b(i10, this.f23179d);
        Object obj = this.f23178c[i10];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // com.google.android.gms.internal.consent_sdk.l0
    public final int h() {
        return this.f23179d;
    }

    @Override // com.google.android.gms.internal.consent_sdk.l0
    public final int m() {
        return 0;
    }

    @Override // com.google.android.gms.internal.consent_sdk.l0
    public final Object[] n() {
        return this.f23178c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f23179d;
    }
}
