package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes4.dex */
public final class MR extends AbstractC4008m implements InterfaceC5000xE {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final MR f3404a = new MR(G7.e);

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5000xE
    public final InterfaceC2489Ie b(PE pe) {
        return NR.f3457a;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5000xE
    public final Object c(C3361ee c3361ee) {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5000xE
    public final InterfaceC5000xE getParent() {
        return null;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5000xE
    public final boolean isActive() {
        return true;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5000xE
    public final boolean isCancelled() {
        return false;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5000xE
    public final CancellationException k() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5000xE
    public final InterfaceC4612sp m(boolean z, boolean z2, InterfaceC2766Sw interfaceC2766Sw) {
        return NR.f3457a;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5000xE
    public final InterfaceC4612sp p(InterfaceC2766Sw interfaceC2766Sw) {
        return NR.f3457a;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5000xE
    public final boolean start() {
        return false;
    }

    public final String toString() {
        return "NonCancellable";
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5000xE
    public final void a(CancellationException cancellationException) {
    }
}
