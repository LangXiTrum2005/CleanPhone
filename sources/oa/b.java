package oa;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class b implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Iterator f47221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f47222b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Collection f47223c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Iterator f47224d = z0.f47357a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l f47225e;

    public b(l lVar) {
        this.f47225e = lVar;
        this.f47221a = lVar.f47270d.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f47221a.hasNext() || this.f47224d.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f47224d.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f47221a.next();
            this.f47222b = entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.f47223c = collection;
            this.f47224d = collection.iterator();
        }
        return this.f47224d.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f47224d.remove();
        Collection collection = this.f47223c;
        Objects.requireNonNull(collection);
        if (collection.isEmpty()) {
            this.f47221a.remove();
        }
        this.f47225e.f47271e--;
    }
}
