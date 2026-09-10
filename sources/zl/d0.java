package zl;

import java.util.AbstractList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class d0 extends AbstractList implements RandomAccess, s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f55027a;

    public d0(r rVar) {
        this.f55027a = rVar;
    }

    @Override // zl.s
    public final void a(t tVar) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        return (String) this.f55027a.get(i10);
    }

    @Override // zl.s
    public final d getByteString(int i10) {
        return this.f55027a.getByteString(i10);
    }

    @Override // zl.s
    public final List getUnderlyingElements() {
        return Collections.unmodifiableList(this.f55027a.f55078a);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        ea.s sVar = new ea.s();
        sVar.f39749b = this.f55027a.iterator();
        return sVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i10) {
        c0 c0Var = new c0();
        c0Var.f55025a = this.f55027a.listIterator(i10);
        return c0Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f55027a.size();
    }

    @Override // zl.s
    public final d0 getUnmodifiableView() {
        return this;
    }
}
