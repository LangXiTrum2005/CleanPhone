package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.hu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3652hu implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Iterator f4478a;
    public int b = -1;
    public Object c;
    public final /* synthetic */ C3738iu d;

    public C3652hu(C3738iu c3738iu) {
        this.d = c3738iu;
        this.f4478a = c3738iu.f4526a.iterator();
    }

    public final void a() {
        Object next;
        C3738iu c3738iu;
        do {
            Iterator it = this.f4478a;
            if (!it.hasNext()) {
                this.b = 0;
                return;
            } else {
                next = it.next();
                c3738iu = this.d;
            }
        } while (((Boolean) c3738iu.c.invoke(next)).booleanValue() != c3738iu.b);
        this.c = next;
        this.b = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.b == -1) {
            a();
        }
        return this.b == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.b == -1) {
            a();
        }
        if (this.b == 0) {
            throw new NoSuchElementException();
        }
        Object obj = this.c;
        this.c = null;
        this.b = -1;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
