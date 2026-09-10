package com.adjust.sdk.sig;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class f1 implements Iterable, q1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6955b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f6956c;

    static {
        new f1(1, 0);
    }

    public f1(int i10, int i11) {
        this.f6954a = i10;
        if (i10 < i11) {
            int i12 = i11 % 1;
            int i13 = i10 % 1;
            int i14 = ((i12 < 0 ? i12 + 1 : i12) - (i13 < 0 ? i13 + 1 : i13)) % 1;
            i11 -= i14 < 0 ? i14 + 1 : i14;
        }
        this.f6955b = i11;
        this.f6956c = 1;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f1)) {
            return false;
        }
        if (isEmpty() && ((f1) obj).isEmpty()) {
            return true;
        }
        f1 f1Var = (f1) obj;
        return this.f6954a == f1Var.f6954a && this.f6955b == f1Var.f6955b;
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f6954a * 31) + this.f6955b;
    }

    public final boolean isEmpty() {
        return this.f6954a > this.f6955b;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new e1(this.f6954a, this.f6955b, this.f6956c);
    }

    public final String toString() {
        return this.f6954a + ".." + this.f6955b;
    }
}
