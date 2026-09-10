package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.eD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3330eD implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4313a = 2;
    public final Iterator b;
    public int c;

    public C3330eD(Iterator it) {
        AbstractC2995aW.q(it, "iterator");
        this.b = it;
    }

    public final C3153cD a() {
        int i = this.f4313a;
        Iterator it = this.b;
        switch (i) {
            case 0:
                int i2 = this.c;
                this.c = i2 + 1;
                if (i2 >= 0) {
                    return new C3153cD(i2, it.next());
                }
                AbstractC2340Cl.S();
                throw null;
            default:
                int i3 = this.c;
                this.c = i3 + 1;
                if (i3 >= 0) {
                    return new C3153cD(i3, it.next());
                }
                AbstractC2340Cl.S();
                throw null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.f4313a;
        Iterator it = this.b;
        switch (i) {
            case 0:
                return it.hasNext();
            case 1:
                break;
            case 2:
                return it.hasNext();
            default:
                return this.c > 0 && it.hasNext();
        }
        while (this.c > 0 && it.hasNext()) {
            it.next();
            this.c--;
        }
        return it.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f4313a;
        Iterator it = this.b;
        switch (i) {
            case 0:
                return a();
            case 1:
                break;
            case 2:
                return a();
            default:
                int i2 = this.c;
                if (i2 == 0) {
                    throw new NoSuchElementException();
                }
                this.c = i2 - 1;
                return it.next();
        }
        while (this.c > 0 && it.hasNext()) {
            it.next();
            this.c--;
        }
        return it.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f4313a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C3330eD(C2827Vf c2827Vf) {
        this.b = ((InterfaceC4545s40) c2827Vf.b).iterator();
    }

    public C3330eD(C3648hq c3648hq, int i) {
        this.c = c3648hq.c;
        this.b = c3648hq.b.iterator();
    }

    public C3330eD(C3648hq c3648hq) {
        this.b = c3648hq.b.iterator();
        this.c = c3648hq.c;
    }
}
