package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.ye, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C5118ye implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5286a;
    public final int b;
    public boolean c;
    public int d;

    public C5118ye(char c, char c2, int i) {
        this.f5286a = i;
        this.b = c2;
        boolean z = true;
        if (i <= 0 ? AbstractC2995aW.s(c, c2) < 0 : AbstractC2995aW.s(c, c2) > 0) {
            z = false;
        }
        this.c = z;
        this.d = z ? c : c2;
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object next() {
        int i = this.d;
        if (i != this.b) {
            this.d = this.f5286a + i;
        } else {
            if (!this.c) {
                throw new NoSuchElementException();
            }
            this.c = false;
        }
        return Character.valueOf((char) i);
    }

    public final void b() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ void remove() {
        b();
        throw null;
    }
}
