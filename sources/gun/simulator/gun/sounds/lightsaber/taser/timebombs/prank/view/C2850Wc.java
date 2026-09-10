package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Wc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2850Wc extends C3013ah {
    public static final AtomicIntegerFieldUpdater c = AtomicIntegerFieldUpdater.newUpdater(C2850Wc.class, "_resumed");
    private volatile int _resumed;

    public C2850Wc(InterfaceC2857Wj interfaceC2857Wj, Throwable th, boolean z) {
        if (th == null) {
            th = new CancellationException("Continuation " + interfaceC2857Wj + " was cancelled normally");
        }
        super(z, th);
        this._resumed = 0;
    }
}
