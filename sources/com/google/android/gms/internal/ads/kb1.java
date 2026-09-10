package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class kb1 extends AbstractSet {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16403a;

    public /* synthetic */ kb1(int i10) {
        this.f16403a = i10;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection collection) {
        switch (this.f16403a) {
            case 0:
                return dv.I(this, collection);
            default:
                collection.getClass();
                if (collection instanceof oa.k1) {
                    collection = ((oa.t1) ((oa.k1) collection)).t();
                }
                boolean zRemove = false;
                if (!(collection instanceof Set) || collection.size() <= size()) {
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        zRemove |= remove(it.next());
                    }
                } else {
                    Iterator<E> it2 = iterator();
                    while (it2.hasNext()) {
                        if (collection.contains(it2.next())) {
                            it2.remove();
                            zRemove = true;
                        }
                    }
                }
                return zRemove;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection collection) {
        switch (this.f16403a) {
            case 0:
                collection.getClass();
                break;
            default:
                collection.getClass();
                break;
        }
        return super.retainAll(collection);
    }
}
