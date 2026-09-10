package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.j40, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3754j40 extends W30 {
    public final AtomicReferenceArray e;

    public C3754j40(long j, C3754j40 c3754j40, int i) {
        super(j, c3754j40, i);
        this.e = new AtomicReferenceArray(AbstractC3668i40.f);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.W30
    public final int f() {
        return AbstractC3668i40.f;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.W30
    public final void g(int i, InterfaceC3549gk interfaceC3549gk) {
        this.e.set(i, AbstractC3668i40.e);
        h();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.c + ", hashCode=" + hashCode() + ']';
    }
}
