package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ih, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC2492Ih {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SE f3233a = new SE("CLOSED", 1);

    public static final Object a(W30 w30, long j, InterfaceC3567gx interfaceC3567gx) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        while (true) {
            if (w30.c >= j && !w30.c()) {
                return w30;
            }
            Object obj = AbstractC2518Jh.f3276a.get(w30);
            SE se = f3233a;
            if (obj == se) {
                return se;
            }
            W30 w31 = (W30) ((AbstractC2518Jh) obj);
            if (w31 == null) {
                w31 = (W30) interfaceC3567gx.invoke(Long.valueOf(w30.c + 1), w30);
                do {
                    atomicReferenceFieldUpdater = AbstractC2518Jh.f3276a;
                    if (atomicReferenceFieldUpdater.compareAndSet(w30, null, w31)) {
                        if (w30.c()) {
                            w30.d();
                        }
                    }
                } while (atomicReferenceFieldUpdater.get(w30) == null);
            }
            w30 = w31;
        }
    }
}
