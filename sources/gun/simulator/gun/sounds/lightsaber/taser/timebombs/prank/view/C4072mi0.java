package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.mi0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4072mi0 implements InterfaceC2565Lc {
    final /* synthetic */ X3 $requestListener;

    public C4072mi0(X3 x3) {
        this.$requestListener = x3;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2565Lc
    public void onFailure(InterfaceC2435Gc interfaceC2435Gc, Throwable th) {
        this.$requestListener.onFailure();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2565Lc
    public void onResponse(InterfaceC2435Gc interfaceC2435Gc, C5109yZ c5109yZ) {
        this.$requestListener.onSuccess();
    }
}
