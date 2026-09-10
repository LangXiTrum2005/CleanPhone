package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.dJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C3248dJ {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f4265a = AtomicReferenceFieldUpdater.newUpdater(C3248dJ.class, Object.class, "_cur");
    private volatile Object _cur = new C3512gJ(8, false);

    public final boolean a(Object obj) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4265a;
            C3512gJ c3512gJ = (C3512gJ) atomicReferenceFieldUpdater.get(this);
            int iA = c3512gJ.a(obj);
            if (iA == 0) {
                return true;
            }
            if (iA == 1) {
                C3512gJ c3512gJC = c3512gJ.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, c3512gJ, c3512gJC) && atomicReferenceFieldUpdater.get(this) == c3512gJ) {
                }
            } else if (iA == 2) {
                return false;
            }
        }
    }

    public final void b() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4265a;
            C3512gJ c3512gJ = (C3512gJ) atomicReferenceFieldUpdater.get(this);
            if (c3512gJ.b()) {
                return;
            }
            C3512gJ c3512gJC = c3512gJ.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, c3512gJ, c3512gJC) && atomicReferenceFieldUpdater.get(this) == c3512gJ) {
            }
        }
    }

    public final int c() {
        C3512gJ c3512gJ = (C3512gJ) f4265a.get(this);
        c3512gJ.getClass();
        long j = C3512gJ.f.get(c3512gJ);
        return 1073741823 & (((int) ((j & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j)));
    }

    public final Object d() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4265a;
            C3512gJ c3512gJ = (C3512gJ) atomicReferenceFieldUpdater.get(this);
            Object objD = c3512gJ.d();
            if (objD != C3512gJ.g) {
                return objD;
            }
            C3512gJ c3512gJC = c3512gJ.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, c3512gJ, c3512gJC) && atomicReferenceFieldUpdater.get(this) == c3512gJ) {
            }
        }
    }
}
