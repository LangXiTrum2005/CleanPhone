package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.y50, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5075y50 extends AbstractSet {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5259a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AbstractC5075y50() {
        this(1);
        this.f5259a = 1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.f5259a) {
            case 1:
                throw new UnsupportedOperationException();
            default:
                return super.add(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        switch (this.f5259a) {
            case 1:
                throw new UnsupportedOperationException();
            default:
                return super.addAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        switch (this.f5259a) {
            case 1:
                throw new UnsupportedOperationException();
            default:
                super.clear();
                return;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        switch (this.f5259a) {
            case 1:
                throw new UnsupportedOperationException();
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection collection) {
        switch (this.f5259a) {
            case 0:
                collection.getClass();
                if (collection instanceof InterfaceC3781jQ) {
                    collection = ((InterfaceC3781jQ) collection).m();
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
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection collection) {
        switch (this.f5259a) {
            case 0:
                collection.getClass();
                return super.retainAll(collection);
            default:
                throw new UnsupportedOperationException();
        }
    }

    public /* synthetic */ AbstractC5075y50(int i) {
        this.f5259a = i;
    }
}
