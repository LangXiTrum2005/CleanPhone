package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4360q extends Yf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4861a = 2;
    public Object b;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        Object next;
        int i = this.f4861a;
        if (i == 4) {
            throw new IllegalStateException();
        }
        int iD = DM.D(i);
        if (iD == 0) {
            return true;
        }
        if (iD == 2) {
            return false;
        }
        this.f4861a = 4;
        C3857kE c3857kE = (C3857kE) this;
        int i2 = c3857kE.c;
        Object obj = null;
        Object obj2 = c3857kE.e;
        Iterator it = c3857kE.d;
        switch (i2) {
            case 0:
                while (true) {
                    if (!it.hasNext()) {
                        c3857kE.f4861a = 3;
                        break;
                    } else {
                        next = it.next();
                        if (((InterfaceC4753uV) obj2).apply(next)) {
                            obj = next;
                            break;
                        }
                    }
                }
                break;
            default:
                while (true) {
                    if (!it.hasNext()) {
                        c3857kE.f4861a = 3;
                        break;
                    } else {
                        next = it.next();
                        if (((C4811v50) obj2).c.contains(next)) {
                            obj = next;
                            break;
                        }
                    }
                }
                break;
        }
        this.b = obj;
        if (this.f4861a == 3) {
            return false;
        }
        this.f4861a = 1;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f4861a = 2;
        Object obj = this.b;
        this.b = null;
        return obj;
    }
}
