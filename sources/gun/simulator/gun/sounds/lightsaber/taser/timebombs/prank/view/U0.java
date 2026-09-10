package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public final class U0 implements GS {
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5085yB
    public final void a(A70 a70) throws Throwable {
        C4082mn0.v.X(new B80(3));
        C3293do0.v.X(new B80(4));
        C4312pT c4312pT = C4312pT.n;
        AtomicInteger atomicInteger = c4312pT.d;
        if (atomicInteger.get() == 0) {
            return;
        }
        atomicInteger.set(0);
        C2294Ar c2294Ar = new C2294Ar(c4312pT, 6);
        C4981x20.u().t(new RunnableC4746uO(c4312pT, C3044b1.b.g(), c2294Ar, 22));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5085yB
    public final void b(InterfaceC3240dB interfaceC3240dB) throws Throwable {
        C4082mn0.v.X(new B80(5));
        C3293do0.v.X(new B80(6));
        C4312pT c4312pT = C4312pT.n;
        AtomicInteger atomicInteger = c4312pT.d;
        if (atomicInteger.get() == 0) {
            return;
        }
        atomicInteger.set(0);
        C2294Ar c2294Ar = new C2294Ar(c4312pT, 6);
        C4981x20.u().t(new RunnableC4746uO(c4312pT, C3044b1.b.g(), c2294Ar, 22));
    }
}
