package com.google.gson;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class e extends g implements Iterable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f24752a = new ArrayList();

    @Override // com.google.gson.g
    public final boolean b() {
        return n().b();
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof e) && ((e) obj).f24752a.equals(this.f24752a);
        }
        return true;
    }

    public final int hashCode() {
        return this.f24752a.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f24752a.iterator();
    }

    @Override // com.google.gson.g
    public final String m() {
        return n().m();
    }

    public final g n() {
        ArrayList arrayList = this.f24752a;
        int size = arrayList.size();
        if (size == 1) {
            return (g) arrayList.get(0);
        }
        throw new IllegalStateException(l1.d.e(size, "Array must have size 1, but has size "));
    }
}
