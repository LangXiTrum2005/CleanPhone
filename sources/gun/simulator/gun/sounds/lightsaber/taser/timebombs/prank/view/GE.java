package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes4.dex */
public abstract class GE extends C3159cJ implements InterfaceC4612sp, XC, InterfaceC2766Sw {
    public PE d;

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.XC
    public final KR b() {
        return null;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4612sp
    public final void c() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2;
        PE peI = i();
        while (true) {
            Object objN = peI.N();
            if (objN instanceof GE) {
                if (objN != this) {
                    return;
                }
                C2708Qq c2708Qq = QE.g;
                do {
                    atomicReferenceFieldUpdater2 = PE.f3543a;
                    if (atomicReferenceFieldUpdater2.compareAndSet(peI, objN, c2708Qq)) {
                        return;
                    }
                } while (atomicReferenceFieldUpdater2.get(peI) == objN);
            } else {
                if (!(objN instanceof XC) || ((XC) objN).b() == null) {
                    return;
                }
                while (true) {
                    Object objF = f();
                    if (objF instanceof C5020xY) {
                        C3159cJ c3159cJ = ((C5020xY) objF).f5226a;
                        return;
                    }
                    if (objF == this) {
                        return;
                    }
                    AbstractC2995aW.o(objF, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
                    C3159cJ c3159cJ2 = (C3159cJ) objF;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = C3159cJ.c;
                    C5020xY c5020xY = (C5020xY) atomicReferenceFieldUpdater3.get(c3159cJ2);
                    if (c5020xY == null) {
                        c5020xY = new C5020xY(c3159cJ2);
                        atomicReferenceFieldUpdater3.lazySet(c3159cJ2, c5020xY);
                    }
                    do {
                        atomicReferenceFieldUpdater = C3159cJ.f4215a;
                        if (atomicReferenceFieldUpdater.compareAndSet(this, objF, c5020xY)) {
                            c3159cJ2.d();
                            return;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == objF);
                }
            }
        }
    }

    public InterfaceC5000xE getParent() {
        return i();
    }

    public final PE i() {
        PE pe = this.d;
        if (pe != null) {
            return pe;
        }
        AbstractC2995aW.x0("job");
        throw null;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.XC
    public final boolean isActive() {
        return true;
    }

    public abstract void j(Throwable th);

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3159cJ
    public final String toString() {
        return getClass().getSimpleName() + '@' + AbstractC2340Cl.x(this) + "[job@" + AbstractC2340Cl.x(i()) + ']';
    }
}
