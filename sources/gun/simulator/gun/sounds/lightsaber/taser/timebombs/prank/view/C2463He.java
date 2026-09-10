package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.He, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2463He extends AE {
    public final C2798Uc e;

    public C2463He(C2798Uc c2798Uc) {
        this.e = c2798Uc;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) throws IllegalAccessException, InvocationTargetException {
        j((Throwable) obj);
        return C5033xf0.f5238a;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.GE
    public final void j(Throwable th) throws IllegalAccessException, InvocationTargetException {
        PE peI = i();
        C2798Uc c2798Uc = this.e;
        Throwable thQ = c2798Uc.q(peI);
        if (c2798Uc.x()) {
            InterfaceC2857Wj interfaceC2857Wj = c2798Uc.d;
            AbstractC2995aW.o(interfaceC2857Wj, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            C4085mp c4085mp = (C4085mp) interfaceC2857Wj;
            loop0: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C4085mp.h;
                Object obj = atomicReferenceFieldUpdater.get(c4085mp);
                SE se = AbstractC4173np.b;
                if (AbstractC2995aW.i(obj, se)) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(c4085mp, se, thQ)) {
                        if (atomicReferenceFieldUpdater.get(c4085mp) != se) {
                        }
                    }
                    return;
                } else {
                    if (obj instanceof Throwable) {
                        return;
                    }
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(c4085mp, obj, null)) {
                            break loop0;
                        }
                    } while (atomicReferenceFieldUpdater.get(c4085mp) == obj);
                }
            }
        }
        c2798Uc.e(thQ);
        if (c2798Uc.x()) {
            return;
        }
        c2798Uc.o();
    }
}
