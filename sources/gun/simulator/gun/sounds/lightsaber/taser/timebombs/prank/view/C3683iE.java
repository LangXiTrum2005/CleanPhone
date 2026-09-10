package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.iE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3683iE extends AE {
    public static final AtomicIntegerFieldUpdater f = AtomicIntegerFieldUpdater.newUpdater(C3683iE.class, "_invoked");
    private volatile int _invoked;
    public final InterfaceC2766Sw e;

    public C3683iE(InterfaceC2766Sw interfaceC2766Sw) {
        this.e = interfaceC2766Sw;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        j((Throwable) obj);
        return C5033xf0.f5238a;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.GE
    public final void j(Throwable th) {
        if (f.compareAndSet(this, 0, 1)) {
            this.e.invoke(th);
        }
    }
}
