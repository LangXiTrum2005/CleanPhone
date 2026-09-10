package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.bM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3074bM extends Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4167a;
    public final C2985aM b;

    public C3074bM(C2985aM c2985aM, int i) {
        this.f4167a = i;
        if (i != 1) {
            AbstractC2995aW.q(c2985aM, "backing");
            this.b = c2985aM;
        } else {
            AbstractC2995aW.q(c2985aM, "backing");
            this.b = c2985aM;
        }
    }

    public final boolean a(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        AbstractC2995aW.q(entry, "element");
        return this.b.d(entry);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.f4167a) {
            case 0:
                AbstractC2995aW.q((Map.Entry) obj, "element");
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        switch (this.f4167a) {
            case 0:
                AbstractC2995aW.q(collection, "elements");
                throw new UnsupportedOperationException();
            default:
                AbstractC2995aW.q(collection, "elements");
                throw new UnsupportedOperationException();
        }
    }

    public final boolean b(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        AbstractC2995aW.q(entry, "element");
        C2985aM c2985aM = this.b;
        c2985aM.getClass();
        c2985aM.b();
        int iG = c2985aM.g(entry.getKey());
        if (iG < 0) {
            return false;
        }
        Object[] objArr = c2985aM.b;
        AbstractC2995aW.n(objArr);
        if (!AbstractC2995aW.i(objArr[iG], entry.getValue())) {
            return false;
        }
        c2985aM.k(iG);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        int i = this.f4167a;
        C2985aM c2985aM = this.b;
        switch (i) {
            case 0:
                c2985aM.clear();
                break;
            default:
                c2985aM.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f4167a) {
            case 0:
                return a(obj);
            default:
                return this.b.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        switch (this.f4167a) {
            case 0:
                AbstractC2995aW.q(collection, "elements");
                return this.b.c(collection);
            default:
                return super.containsAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        int i = this.f4167a;
        C2985aM c2985aM = this.b;
        switch (i) {
            case 0:
                break;
        }
        return c2985aM.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int i = this.f4167a;
        C2985aM c2985aM = this.b;
        switch (i) {
            case 0:
                c2985aM.getClass();
                return new XL(c2985aM, 0);
            default:
                c2985aM.getClass();
                return new XL(c2985aM, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f4167a) {
            case 0:
                return b(obj);
            default:
                C2985aM c2985aM = this.b;
                c2985aM.b();
                int iG = c2985aM.g(obj);
                if (iG >= 0) {
                    c2985aM.k(iG);
                    if (iG >= 0) {
                        return true;
                    }
                }
                return false;
        }
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        int i = this.f4167a;
        C2985aM c2985aM = this.b;
        switch (i) {
            case 0:
                AbstractC2995aW.q(collection, "elements");
                c2985aM.b();
                break;
            default:
                AbstractC2995aW.q(collection, "elements");
                c2985aM.b();
                break;
        }
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        int i = this.f4167a;
        C2985aM c2985aM = this.b;
        switch (i) {
            case 0:
                AbstractC2995aW.q(collection, "elements");
                c2985aM.b();
                break;
            default:
                AbstractC2995aW.q(collection, "elements");
                c2985aM.b();
                break;
        }
        return super.retainAll(collection);
    }
}
