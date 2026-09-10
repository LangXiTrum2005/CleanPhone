package yj;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class g extends xj.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f54434a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f54435b;

    public /* synthetic */ g(f fVar, int i10) {
        this.f54434a = i10;
        this.f54435b = fVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.f54434a) {
            case 0:
                Map.Entry element = (Map.Entry) obj;
                n.f(element, "element");
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection elements) {
        switch (this.f54434a) {
            case 0:
                n.f(elements, "elements");
                throw new UnsupportedOperationException();
            default:
                n.f(elements, "elements");
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f54434a) {
            case 0:
                this.f54435b.clear();
                break;
            default:
                this.f54435b.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f54434a) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                return this.f54435b.p((Map.Entry) obj);
            default:
                return this.f54435b.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection elements) {
        switch (this.f54434a) {
            case 0:
                n.f(elements, "elements");
                return this.f54435b.m(elements);
            default:
                return super.containsAll(elements);
        }
    }

    @Override // xj.h
    public final int h() {
        switch (this.f54434a) {
            case 0:
                break;
        }
        return this.f54435b.f54430i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        switch (this.f54434a) {
            case 0:
                break;
        }
        return this.f54435b.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f54434a) {
            case 0:
                f fVar = this.f54435b;
                fVar.getClass();
                return new d(fVar, 0);
            default:
                f fVar2 = this.f54435b;
                fVar2.getClass();
                return new d(fVar2, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f54434a) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                f fVar = this.f54435b;
                fVar.getClass();
                fVar.h();
                int iR = fVar.r(entry.getKey());
                if (iR < 0) {
                    return false;
                }
                Object[] objArr = fVar.f54423b;
                n.c(objArr);
                if (!n.a(objArr[iR], entry.getValue())) {
                    return false;
                }
                fVar.v(iR);
                return true;
            default:
                f fVar2 = this.f54435b;
                fVar2.h();
                int iR2 = fVar2.r(obj);
                if (iR2 < 0) {
                    return false;
                }
                fVar2.v(iR2);
                return true;
        }
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection elements) {
        switch (this.f54434a) {
            case 0:
                n.f(elements, "elements");
                this.f54435b.h();
                break;
            default:
                n.f(elements, "elements");
                this.f54435b.h();
                break;
        }
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection elements) {
        switch (this.f54434a) {
            case 0:
                n.f(elements, "elements");
                this.f54435b.h();
                break;
            default:
                n.f(elements, "elements");
                this.f54435b.h();
                break;
        }
        return super.retainAll(elements);
    }
}
