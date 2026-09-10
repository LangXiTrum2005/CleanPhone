package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.s0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4536s0 extends WeakReference {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC4650tG f4957a;
    public final boolean b;
    public InterfaceC3616hZ c;

    public C4536s0(InterfaceC4650tG interfaceC4650tG, C5142yr c5142yr, ReferenceQueue referenceQueue, boolean z) {
        InterfaceC3616hZ interfaceC3616hZ;
        super(c5142yr, referenceQueue);
        AbstractC2871Wx.V(interfaceC4650tG, "Argument must not be null");
        this.f4957a = interfaceC4650tG;
        if (c5142yr.f5303a && z) {
            interfaceC3616hZ = c5142yr.c;
            AbstractC2871Wx.V(interfaceC3616hZ, "Argument must not be null");
        } else {
            interfaceC3616hZ = null;
        }
        this.c = interfaceC3616hZ;
        this.b = c5142yr.f5303a;
    }
}
