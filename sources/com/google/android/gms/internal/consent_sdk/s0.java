package com.google.android.gms.internal.consent_sdk;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class s0 extends p0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Object[] f23187h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final s0 f23188i;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient Object[] f23189c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient int f23190d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient Object[] f23191e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final transient int f23192f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final transient int f23193g;

    static {
        Object[] objArr = new Object[0];
        f23187h = objArr;
        f23188i = new s0(0, 0, 0, objArr, objArr);
    }

    public s0(int i10, int i11, int i12, Object[] objArr, Object[] objArr2) {
        this.f23189c = objArr;
        this.f23190d = i10;
        this.f23191e = objArr2;
        this.f23192f = i11;
        this.f23193g = i12;
    }

    @Override // com.google.android.gms.internal.consent_sdk.l0
    public final int b(Object[] objArr) {
        Object[] objArr2 = this.f23189c;
        int i10 = this.f23193g;
        System.arraycopy(objArr2, 0, objArr, 0, i10);
        return i10;
    }

    @Override // com.google.android.gms.internal.consent_sdk.l0, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        Object[] objArr = this.f23191e;
        if (objArr.length == 0) {
            return false;
        }
        int iRotateLeft = (int) (((long) Integer.rotateLeft((int) (((long) obj.hashCode()) * (-862048943)), 15)) * 461845907);
        while (true) {
            int i10 = iRotateLeft & this.f23192f;
            Object obj2 = objArr[i10];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            iRotateLeft = i10 + 1;
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.l0
    public final int h() {
        return this.f23193g;
    }

    @Override // com.google.android.gms.internal.consent_sdk.p0, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f23190d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        o0 r0Var = this.f23160b;
        if (r0Var == null) {
            m0 m0Var = o0.f23128b;
            int i10 = this.f23193g;
            r0Var = i10 == 0 ? r0.f23177e : new r0(i10, this.f23189c);
            this.f23160b = r0Var;
        }
        return r0Var.listIterator(0);
    }

    @Override // com.google.android.gms.internal.consent_sdk.l0
    public final int m() {
        return 0;
    }

    @Override // com.google.android.gms.internal.consent_sdk.l0
    public final Object[] n() {
        return this.f23189c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f23193g;
    }
}
