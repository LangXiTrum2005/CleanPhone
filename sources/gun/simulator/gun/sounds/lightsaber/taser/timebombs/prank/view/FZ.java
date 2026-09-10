package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: loaded from: classes4.dex */
public abstract class FZ extends AbstractC3677i9 {
    public FZ(InterfaceC2857Wj interfaceC2857Wj) {
        super(interfaceC2857Wj);
        if (interfaceC2857Wj != null && interfaceC2857Wj.getContext() != C2734Rq.f3684a) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext".toString());
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj
    public InterfaceC3549gk getContext() {
        return C2734Rq.f3684a;
    }
}
