package com.adjust.sdk.sig;

import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends d implements RandomAccess {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f6926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6927b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f6928c;

    public c(d dVar, int i10, int i11) {
        this.f6926a = dVar;
        this.f6927b = i10;
        int iA = dVar.a();
        if (i10 < 0 || i11 > iA) {
            StringBuilder sbL = l1.d.l("fromIndex: ", i10, ", toIndex: ", i11, ", size: ");
            sbL.append(iA);
            throw new IndexOutOfBoundsException(sbL.toString());
        }
        if (i10 > i11) {
            throw new IllegalArgumentException(defpackage.e.g(i10, i11, "fromIndex: ", " > toIndex: "));
        }
        this.f6928c = i11 - i10;
    }

    @Override // com.adjust.sdk.sig.d
    public final int a() {
        return this.f6928c;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        int i11 = this.f6928c;
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException(defpackage.e.g(i10, i11, "index: ", ", size: "));
        }
        return this.f6926a.get(this.f6927b + i10);
    }

    @Override // com.adjust.sdk.sig.d, java.util.List
    public final List subList(int i10, int i11) {
        int i12 = this.f6928c;
        if (i10 < 0 || i11 > i12) {
            StringBuilder sbL = l1.d.l("fromIndex: ", i10, ", toIndex: ", i11, ", size: ");
            sbL.append(i12);
            throw new IndexOutOfBoundsException(sbL.toString());
        }
        if (i10 > i11) {
            throw new IllegalArgumentException(defpackage.e.g(i10, i11, "fromIndex: ", " > toIndex: "));
        }
        d dVar = this.f6926a;
        int i13 = this.f6927b;
        return new c(dVar, i10 + i13, i13 + i11);
    }
}
