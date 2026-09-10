package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class h91 extends y81 implements ListIterator {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i91 f15229e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h91(i91 i91Var) {
        super(i91Var);
        this.f15229e = i91Var;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        i91 i91Var = this.f15229e;
        boolean zIsEmpty = i91Var.isEmpty();
        a();
        ((ListIterator) this.f22195b).add(obj);
        ((ua1) i91Var.f15678g).f20714e++;
        if (zIsEmpty) {
            i91Var.p();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        a();
        return ((ListIterator) this.f22195b).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        a();
        return ((ListIterator) this.f22195b).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        a();
        return ((ListIterator) this.f22195b).previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        a();
        return ((ListIterator) this.f22195b).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        a();
        ((ListIterator) this.f22195b).set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h91(i91 i91Var, int i10) {
        super(i91Var, ((List) i91Var.f15674c).listIterator(i10));
        this.f15229e = i91Var;
    }
}
