package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4711u extends Me0 implements ListIterator {
    public final /* synthetic */ AbstractC4887w d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4711u(AbstractC4887w abstractC4887w, int i) {
        super(abstractC4887w);
        this.d = abstractC4887w;
        C2443Gk.c(i, abstractC4887w.a());
        this.b = i;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.b > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.b - 1;
        this.b = i;
        return this.d.get(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.b - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
