package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class bj1 implements Iterable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f12808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f12809b;

    public bj1(dj1 dj1Var, List list, List list2) {
        this.f12808a = list;
        this.f12809b = list2;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new cj1(this.f12808a.iterator(), this.f12809b.iterator());
    }
}
