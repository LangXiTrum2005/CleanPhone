package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.cM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3162cM extends AbstractCollection implements Collection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2985aM f4218a;

    public C3162cM(C2985aM c2985aM) {
        AbstractC2995aW.q(c2985aM, "backing");
        this.f4218a = c2985aM;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        AbstractC2995aW.q(collection, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f4218a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f4218a.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return this.f4218a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        C2985aM c2985aM = this.f4218a;
        c2985aM.getClass();
        return new XL(c2985aM, 2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        C2985aM c2985aM = this.f4218a;
        c2985aM.b();
        int iH = c2985aM.h(obj);
        if (iH < 0) {
            return false;
        }
        c2985aM.k(iH);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        AbstractC2995aW.q(collection, "elements");
        this.f4218a.b();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        AbstractC2995aW.q(collection, "elements");
        this.f4218a.b();
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f4218a.h;
    }
}
