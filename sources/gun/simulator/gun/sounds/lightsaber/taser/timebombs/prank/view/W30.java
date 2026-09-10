package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import androidx.core.internal.view.SupportMenu;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes4.dex */
public abstract class W30 extends AbstractC2518Jh implements QR {
    public static final AtomicIntegerFieldUpdater d = AtomicIntegerFieldUpdater.newUpdater(W30.class, "cleanedAndPointers");
    public final long c;
    private volatile int cleanedAndPointers;

    public W30(long j, W30 w30, int i) {
        super(w30);
        this.c = j;
        this.cleanedAndPointers = i << 16;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2518Jh
    public final boolean c() {
        return d.get(this) == f() && b() != null;
    }

    public final boolean e() {
        return d.addAndGet(this, SupportMenu.CATEGORY_MASK) == f() && b() != null;
    }

    public abstract int f();

    public abstract void g(int i, InterfaceC3549gk interfaceC3549gk);

    public final void h() {
        if (d.incrementAndGet(this) == f()) {
            d();
        }
    }

    public final boolean i() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        do {
            atomicIntegerFieldUpdater = d;
            i = atomicIntegerFieldUpdater.get(this);
            if (i == f() && b() != null) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 65536 + i));
        return true;
    }
}
