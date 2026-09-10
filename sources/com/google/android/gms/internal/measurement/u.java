package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.ads.ax1;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class u extends AbstractSet {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f24002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f24003b;

    public u(v vVar, int i10) {
        this.f24003b = vVar;
        this.f24002a = i10;
    }

    public final int b() {
        int i10 = this.f24002a;
        if (i10 == -1) {
            return 0;
        }
        return this.f24003b.f24054b[i10];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return Arrays.binarySearch(this.f24003b.f24053a, b(), h(), obj, this.f24002a == -1 ? v.f24052f : w.f24102b) >= 0;
    }

    public final int h() {
        return this.f24003b.f24054b[this.f24002a + 1];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new ax1(this, 1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return h() - b();
    }
}
