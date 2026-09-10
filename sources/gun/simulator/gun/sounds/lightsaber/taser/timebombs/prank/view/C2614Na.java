package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.concurrent.locks.LockSupport;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Na, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2614Na extends AbstractC3920l {
    public final Thread d;
    public final AbstractC3210cs e;

    public C2614Na(InterfaceC3549gk interfaceC3549gk, Thread thread, AbstractC3210cs abstractC3210cs) {
        super(interfaceC3549gk, true);
        this.d = thread;
        this.e = abstractC3210cs;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.PE
    public final void x(Object obj) {
        Thread threadCurrentThread = Thread.currentThread();
        Thread thread = this.d;
        if (AbstractC2995aW.i(threadCurrentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }
}
