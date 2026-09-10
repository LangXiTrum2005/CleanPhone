package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ng, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2620Ng implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3468a;
    public int b;
    public int c;
    public final /* synthetic */ C2698Qg d;

    public AbstractC2620Ng(C2698Qg c2698Qg) {
        this.d = c2698Qg;
        this.f3468a = c2698Qg.e;
        this.b = c2698Qg.isEmpty() ? -1 : 0;
        this.c = -1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object c2646Og;
        C2698Qg c2698Qg = this.d;
        if (c2698Qg.e != this.f3468a) {
            throw new ConcurrentModificationException();
        }
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.b;
        this.c = i;
        C2569Lg c2569Lg = (C2569Lg) this;
        int i2 = c2569Lg.e;
        C2698Qg c2698Qg2 = c2569Lg.f;
        switch (i2) {
            case 0:
                c2646Og = c2698Qg2.k()[i];
                break;
            case 1:
                c2646Og = new C2646Og(c2698Qg2, i);
                break;
            default:
                c2646Og = c2698Qg2.l()[i];
                break;
        }
        int i3 = this.b + 1;
        if (i3 >= c2698Qg.f) {
            i3 = -1;
        }
        this.b = i3;
        return c2646Og;
    }

    @Override // java.util.Iterator
    public final void remove() {
        C2698Qg c2698Qg = this.d;
        int i = c2698Qg.e;
        int i2 = this.f3468a;
        if (i != i2) {
            throw new ConcurrentModificationException();
        }
        int i3 = this.c;
        if (i3 < 0) {
            throw new IllegalStateException("no calls to next() since the last call to remove()");
        }
        this.f3468a = i2 + 32;
        c2698Qg.remove(c2698Qg.k()[i3]);
        this.b--;
        this.c = -1;
    }
}
