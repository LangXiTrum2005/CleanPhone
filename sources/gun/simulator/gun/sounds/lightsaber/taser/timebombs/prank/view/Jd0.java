package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Jd0 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Iterator f3274a;

    public Jd0(Iterator it) {
        it.getClass();
        this.f3274a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f3274a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return ((Map.Entry) this.f3274a.next()).getValue();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f3274a.remove();
    }
}
