package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.u40, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4721u40 extends AbstractC4809v40 implements Iterator, InterfaceC2857Wj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5063a;
    public Object b;
    public Iterator c;
    public InterfaceC2857Wj d;

    public final RuntimeException a() {
        int i = this.f5063a;
        if (i == 4) {
            return new NoSuchElementException();
        }
        if (i == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.f5063a);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj
    public final InterfaceC3549gk getContext() {
        return C2734Rq.f3684a;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        while (true) {
            int i = this.f5063a;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2 || i == 3) {
                        return true;
                    }
                    if (i == 4) {
                        return false;
                    }
                    throw a();
                }
                Iterator it = this.c;
                AbstractC2995aW.n(it);
                if (it.hasNext()) {
                    this.f5063a = 2;
                    return true;
                }
                this.c = null;
            }
            this.f5063a = 5;
            InterfaceC2857Wj interfaceC2857Wj = this.d;
            AbstractC2995aW.n(interfaceC2857Wj);
            this.d = null;
            interfaceC2857Wj.resumeWith(C5033xf0.f5238a);
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f5063a;
        if (i == 0 || i == 1) {
            if (hasNext()) {
                return next();
            }
            throw new NoSuchElementException();
        }
        if (i == 2) {
            this.f5063a = 1;
            Iterator it = this.c;
            AbstractC2995aW.n(it);
            return it.next();
        }
        if (i != 3) {
            throw a();
        }
        this.f5063a = 0;
        Object obj = this.b;
        this.b = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj
    public final void resumeWith(Object obj) {
        AbstractC3375el.b0(obj);
        this.f5063a = 4;
    }
}
