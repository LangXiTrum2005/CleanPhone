package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: loaded from: classes4.dex */
public final class M8 extends A2 {
    final /* synthetic */ N8 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M8(InterfaceC5156z2 interfaceC5156z2, N8 n8) {
        super(interfaceC5156z2);
        this.this$0 = n8;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.A2, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5156z2
    public void onAdEnd(String str) {
        this.this$0.setAdState(B1.FINISHED);
        super.onAdEnd(str);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.A2, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5156z2
    public void onAdStart(String str) {
        this.this$0.setAdState(B1.PLAYING);
        super.onAdStart(str);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.A2, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5156z2
    public void onFailure(Ei0 ei0) {
        AbstractC2995aW.q(ei0, "error");
        this.this$0.setAdState(B1.ERROR);
        super.onFailure(ei0);
    }
}
