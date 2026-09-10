package x;

import androidx.datastore.preferences.protobuf.i1;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class e extends i implements Map {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public i1 f53492d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b f53493e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public d f53494f;

    public e() {
        super(0);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        i1 i1Var = this.f53492d;
        if (i1Var != null) {
            return i1Var;
        }
        i1 i1Var2 = new i1(this, 6);
        this.f53492d = i1Var2;
        return i1Var2;
    }

    public final boolean k(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!super.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Map
    public final Set keySet() {
        b bVar = this.f53493e;
        if (bVar != null) {
            return bVar;
        }
        b bVar2 = new b(this);
        this.f53493e = bVar2;
        return bVar2;
    }

    public final boolean l(Collection collection) {
        int i10 = this.f53506c;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            super.remove(it.next());
        }
        return i10 != this.f53506c;
    }

    public final boolean m(Collection collection) {
        int i10 = this.f53506c;
        for (int i11 = i10 - 1; i11 >= 0; i11--) {
            if (!collection.contains(f(i11))) {
                h(i11);
            }
        }
        return i10 != this.f53506c;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        b(map.size() + this.f53506c);
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        d dVar = this.f53494f;
        if (dVar != null) {
            return dVar;
        }
        d dVar2 = new d(this);
        this.f53494f = dVar2;
        return dVar2;
    }
}
