package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class cr1 extends dr1 implements Iterable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f13245a = new ArrayList();

    @Override // com.google.android.gms.internal.ads.dr1
    public final String b() {
        ArrayList arrayList = this.f13245a;
        int size = arrayList.size();
        if (size == 1) {
            return ((dr1) arrayList.get(0)).b();
        }
        throw new IllegalStateException(l1.d.k(new StringBuilder(String.valueOf(size).length() + 37), "Array must have size 1, but has size ", size));
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof cr1) && ((cr1) obj).f13245a.equals(this.f13245a);
        }
        return true;
    }

    public final int hashCode() {
        return this.f13245a.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f13245a.iterator();
    }
}
