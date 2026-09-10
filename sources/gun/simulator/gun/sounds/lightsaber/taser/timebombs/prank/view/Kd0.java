package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class Kd0 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Iterator f3320a;
    public final /* synthetic */ Ld0 b;

    public Kd0(Ld0 ld0) {
        this.b = ld0;
        this.f3320a = ld0.f3363a.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f3320a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.b.b.invoke(this.f3320a.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
