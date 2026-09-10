package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes4.dex */
public final class OE extends T6 {
    public final C3159cJ b;
    public C3159cJ c;
    public final /* synthetic */ PE d;
    public final /* synthetic */ Object e;

    public OE(C3159cJ c3159cJ, PE pe, Object obj) {
        this.d = pe;
        this.e = obj;
        this.b = c3159cJ;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.T6
    public final void b(Object obj, Object obj2) {
        C3159cJ c3159cJ = (C3159cJ) obj;
        boolean z = obj2 == null;
        C3159cJ c3159cJ2 = this.b;
        C3159cJ c3159cJ3 = z ? c3159cJ2 : this.c;
        if (c3159cJ3 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C3159cJ.f4215a;
            while (!atomicReferenceFieldUpdater.compareAndSet(c3159cJ, this, c3159cJ3)) {
                if (atomicReferenceFieldUpdater.get(c3159cJ) != this) {
                    return;
                }
            }
            if (z) {
                C3159cJ c3159cJ4 = this.c;
                AbstractC2995aW.n(c3159cJ4);
                c3159cJ2.e(c3159cJ4);
            }
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.T6
    public final SE c(Object obj) {
        if (this.d.N() == this.e) {
            return null;
        }
        return AbstractC2982aJ.f4117a;
    }
}
