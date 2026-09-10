package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Uj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2805Uj implements InterfaceC4514rk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC3549gk f3837a;

    public C2805Uj(InterfaceC3549gk interfaceC3549gk) {
        this.f3837a = interfaceC3549gk;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4514rk
    public final InterfaceC3549gk getCoroutineContext() {
        return this.f3837a;
    }

    public final String toString() {
        return "CoroutineScope(coroutineContext=" + this.f3837a + ')';
    }
}
