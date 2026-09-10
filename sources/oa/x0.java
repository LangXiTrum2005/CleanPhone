package oa;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Collections;
import java.util.Comparator;
import java.util.NavigableSet;
import java.util.SortedSet;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class x0 extends u0 implements NavigableSet, c2 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f47342f = 0;
    private static final long serialVersionUID = 912559;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient Comparator f47343d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public transient x0 f47344e;

    public x0(Comparator comparator) {
        this.f47343d = comparator;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public static v1 y(Comparator comparator) {
        return l1.f47272a.equals(comparator) ? v1.f47336h : new v1(n1.f47281e, comparator);
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return this.f47343d;
    }

    @Override // java.util.NavigableSet
    public final NavigableSet descendingSet() {
        x0 x0VarY = this.f47344e;
        if (x0VarY == null) {
            v1 v1Var = (v1) this;
            Comparator comparatorReverseOrder = Collections.reverseOrder(v1Var.f47343d);
            x0VarY = v1Var.isEmpty() ? y(comparatorReverseOrder) : new v1(v1Var.f47337g.E(), comparatorReverseOrder);
            this.f47344e = x0VarY;
            x0VarY.f47344e = this;
        }
        return x0VarY;
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z10) {
        obj.getClass();
        v1 v1Var = (v1) this;
        return v1Var.A(0, v1Var.B(obj, z10));
    }

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z10) {
        obj.getClass();
        v1 v1Var = (v1) this;
        return v1Var.A(v1Var.C(obj, z10), v1Var.f47337g.size());
    }

    @Override // oa.u0, oa.c0
    public Object writeReplace() {
        return new w0(this.f47343d, toArray(c0.f47231a));
    }

    @Override // java.util.NavigableSet
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public final v1 subSet(Object obj, boolean z10, Object obj2, boolean z11) {
        obj.getClass();
        obj2.getClass();
        go.k.i(this.f47343d.compare(obj, obj2) <= 0);
        v1 v1Var = (v1) this;
        v1 v1VarA = v1Var.A(v1Var.C(obj, z10), v1Var.f47337g.size());
        return v1VarA.A(0, v1VarA.B(obj2, z11));
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        obj.getClass();
        v1 v1Var = (v1) this;
        return v1Var.A(0, v1Var.B(obj, false));
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        obj.getClass();
        v1 v1Var = (v1) this;
        return v1Var.A(v1Var.C(obj, true), v1Var.f47337g.size());
    }
}
