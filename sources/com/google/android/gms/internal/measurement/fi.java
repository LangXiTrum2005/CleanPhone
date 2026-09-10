package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class fi implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mh f23472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f23473b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f23474c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gi f23475d;

    public /* synthetic */ fi(gi giVar, mh mhVar, int i10) {
        this.f23475d = giVar;
        this.f23472a = mhVar;
        int i11 = i10 & 31;
        this.f23473b = i11;
        this.f23474c = i10 >>> (i11 + 5);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f23473b >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i10 = this.f23473b;
        gi giVar = this.f23475d;
        h hVar = giVar.f23518b;
        int iA = hVar.a();
        Object objCast = this.f23472a.f23754b.cast(i10 >= iA ? giVar.f23519c.i(i10 - iA) : hVar.i(i10));
        int i11 = this.f23474c;
        if (i11 == 0) {
            this.f23473b = -1;
            return objCast;
        }
        int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(i11) + 1;
        this.f23474c >>>= iNumberOfTrailingZeros;
        this.f23473b += iNumberOfTrailingZeros;
        return objCast;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
