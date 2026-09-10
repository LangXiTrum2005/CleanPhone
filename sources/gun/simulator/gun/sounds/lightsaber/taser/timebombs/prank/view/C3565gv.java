package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.gv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3565gv implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Iterator f4437a;
    public Iterator b;
    public final /* synthetic */ C3653hv c;

    public C3565gv(C3653hv c3653hv) {
        this.c = c3653hv;
        this.f4437a = c3653hv.f4479a.iterator();
    }

    public final boolean a() {
        Iterator it = this.b;
        if (it != null && !it.hasNext()) {
            this.b = null;
        }
        while (this.b == null) {
            Iterator it2 = this.f4437a;
            if (!it2.hasNext()) {
                return false;
            }
            Object next = it2.next();
            C3653hv c3653hv = this.c;
            Iterator it3 = (Iterator) c3653hv.c.invoke(c3653hv.b.invoke(next));
            if (it3.hasNext()) {
                this.b = it3;
                break;
            }
        }
        return true;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return a();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!a()) {
            throw new NoSuchElementException();
        }
        Iterator it = this.b;
        AbstractC2995aW.n(it);
        return it.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
