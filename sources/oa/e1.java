package oa;

import java.util.AbstractList;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class e1 extends d2 implements ListIterator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f47245b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractList f47246c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e1(AbstractList abstractList, ListIterator listIterator, int i10) {
        super(listIterator);
        this.f47245b = i10;
        this.f47246c = abstractList;
    }

    @Override // oa.d2
    public final Object a(Object obj) {
        switch (this.f47245b) {
            case 0:
                return ((f1) this.f47246c).f47252b.apply(obj);
            default:
                return ((g1) this.f47246c).f47256b.apply(obj);
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return ((ListIterator) this.f47242a).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return ((ListIterator) this.f47242a).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return a(((ListIterator) this.f47242a).previous());
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return ((ListIterator) this.f47242a).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
