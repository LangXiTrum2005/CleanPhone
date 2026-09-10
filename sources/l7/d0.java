package l7;

import android.os.Handler;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 extends AbstractList {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AtomicInteger f45103e = new AtomicInteger();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Handler f45104a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f45106c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f45105b = String.valueOf(Integer.valueOf(f45103e.incrementAndGet()));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f45107d = new ArrayList();

    public d0(Collection collection) {
        this.f45106c = new ArrayList(collection);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        b0 element = (b0) obj;
        kotlin.jvm.internal.n.f(element, "element");
        this.f45106c.add(i10, element);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.f45106c.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj == null ? true : obj instanceof b0) {
            return super.contains((b0) obj);
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        return (b0) this.f45106c.get(i10);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj == null ? true : obj instanceof b0) {
            return super.indexOf((b0) obj);
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj == null ? true : obj instanceof b0) {
            return super.lastIndexOf((b0) obj);
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj == null ? true : obj instanceof b0) {
            return super.remove((b0) obj);
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        b0 element = (b0) obj;
        kotlin.jvm.internal.n.f(element, "element");
        return (b0) this.f45106c.set(i10, element);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f45106c.size();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        return (b0) this.f45106c.remove(i10);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        b0 element = (b0) obj;
        kotlin.jvm.internal.n.f(element, "element");
        return this.f45106c.add(element);
    }

    public d0(b0... b0VarArr) {
        this.f45106c = new ArrayList(xj.k.a0(b0VarArr));
    }
}
