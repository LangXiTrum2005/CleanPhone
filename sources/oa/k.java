package oa;

import com.google.android.gms.internal.ads.i91;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class k extends d implements ListIterator {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i91 f47267e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(i91 i91Var) {
        super(i91Var);
        this.f47267e = i91Var;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        i91 i91Var = this.f47267e;
        boolean zIsEmpty = i91Var.isEmpty();
        b().add(obj);
        ((l) i91Var.f15678g).f47271e++;
        if (zIsEmpty) {
            i91Var.b();
        }
    }

    public final ListIterator b() {
        a();
        return (ListIterator) this.f47236b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return b().hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return b().nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return b().previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return b().previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        b().set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(i91 i91Var, int i10) {
        super(i91Var, ((List) i91Var.f15674c).listIterator(i10));
        this.f47267e = i91Var;
    }
}
