package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ha1 extends x91 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object[] f15230d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f15231e;

    @Override // com.google.android.gms.internal.ads.x91
    public final /* bridge */ /* synthetic */ x91 c(Object obj) {
        f(obj);
        return this;
    }

    public final void f(Object obj) {
        obj.getClass();
        if (this.f15230d != null) {
            int iU = ia1.u(this.f21799b);
            Object[] objArr = this.f15230d;
            if (iU <= objArr.length) {
                int length = objArr.length - 1;
                int iHashCode = obj.hashCode();
                int iL = dv.l(iHashCode);
                while (true) {
                    int i10 = iL & length;
                    Object[] objArr2 = this.f15230d;
                    Object obj2 = objArr2[i10];
                    if (obj2 == null) {
                        objArr2[i10] = obj;
                        this.f15231e += iHashCode;
                        a(obj);
                        return;
                    } else if (obj2.equals(obj)) {
                        return;
                    } else {
                        iL = i10 + 1;
                    }
                }
            }
        }
        this.f15230d = null;
        a(obj);
    }

    public final void g(Iterable iterable) {
        iterable.getClass();
        if (this.f15230d == null) {
            b(iterable);
            return;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            f(it.next());
        }
    }

    public final ia1 h() {
        ia1 ia1VarZ;
        int i10 = this.f21799b;
        if (i10 == 0) {
            return eb1.f13923j;
        }
        if (i10 == 1) {
            Object obj = this.f21798a[0];
            Objects.requireNonNull(obj);
            return new ja1(obj);
        }
        if (this.f15230d == null || ia1.u(i10) != this.f15230d.length) {
            ia1VarZ = ia1.z(this.f21799b, this.f21798a);
            this.f21799b = ia1VarZ.size();
        } else {
            int i11 = this.f21799b;
            Object[] objArrCopyOf = this.f21798a;
            int length = objArrCopyOf.length;
            if (i11 < (length >> 1) + (length >> 2)) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i11);
            }
            int i12 = this.f15231e;
            Object[] objArr = this.f15230d;
            ia1VarZ = new eb1(i12, objArr.length - 1, this.f21799b, objArrCopyOf, objArr);
        }
        this.f21800c = true;
        this.f15230d = null;
        return ia1VarZ;
    }
}
