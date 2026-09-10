package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class pa1 extends lb1 implements ListIterator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f18579b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractList f18580c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pa1(AbstractList abstractList, ListIterator listIterator, int i10) {
        super(listIterator);
        this.f18579b = i10;
        this.f18580c = abstractList;
    }

    @Override // com.google.android.gms.internal.ads.lb1
    public final Object a(Object obj) {
        switch (this.f18579b) {
            case 0:
                return ((qa1) this.f18580c).f19013b.apply(obj);
            default:
                return ((ra1) this.f18580c).f19494b.apply(obj);
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return ((ListIterator) this.f16847a).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return ((ListIterator) this.f16847a).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return a(((ListIterator) this.f16847a).previous());
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return ((ListIterator) this.f16847a).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
