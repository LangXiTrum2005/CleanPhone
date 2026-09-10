package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.xE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC5000xE extends InterfaceC3373ek {
    public static final /* synthetic */ int p1 = 0;

    void a(CancellationException cancellationException);

    InterfaceC2489Ie b(PE pe);

    Object c(C3361ee c3361ee);

    InterfaceC5000xE getParent();

    boolean isActive();

    boolean isCancelled();

    CancellationException k();

    InterfaceC4612sp m(boolean z, boolean z2, InterfaceC2766Sw interfaceC2766Sw);

    InterfaceC4612sp p(InterfaceC2766Sw interfaceC2766Sw);

    boolean start();
}
