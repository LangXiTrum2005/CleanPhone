package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class bx1 extends AbstractList {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final zw1 f12919c = zw1.j(bx1.class);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f12920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yw1 f12921b;

    public bx1(ArrayList arrayList, yw1 yw1Var) {
        this.f12920a = arrayList;
        this.f12921b = yw1Var;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        List list = this.f12920a;
        if (list.size() > i10) {
            return list.get(i10);
        }
        yw1 yw1Var = this.f12921b;
        if (!yw1Var.hasNext()) {
            throw new NoSuchElementException();
        }
        list.add(yw1Var.next());
        return get(i10);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new ax1(this, 0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        zw1 zw1Var = f12919c;
        zw1Var.e("potentially expensive size() call");
        zw1Var.e("blowup running");
        while (true) {
            yw1 yw1Var = this.f12921b;
            boolean zHasNext = yw1Var.hasNext();
            List list = this.f12920a;
            if (!zHasNext) {
                return list.size();
            }
            list.add(yw1Var.next());
        }
    }
}
