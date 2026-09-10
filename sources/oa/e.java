package oa;

import com.google.android.gms.internal.ads.kb1;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class e extends kb1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f47243b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f47244c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(l lVar, Map map) {
        super(1);
        this.f47244c = lVar;
        map.getClass();
        this.f47243b = map;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        Iterator it = iterator();
        while (true) {
            d dVar = (d) it;
            if (!dVar.hasNext()) {
                return;
            }
            dVar.next();
            dVar.remove();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f47243b.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        return this.f47243b.keySet().containsAll(collection);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return this == obj || this.f47243b.keySet().equals(obj);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f47243b.keySet().hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f47243b.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new d(this, this.f47243b.entrySet().iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int size;
        Collection collection = (Collection) this.f47243b.remove(obj);
        if (collection != null) {
            size = collection.size();
            collection.clear();
            this.f47244c.f47271e -= size;
        } else {
            size = 0;
        }
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f47243b.size();
    }
}
