package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: loaded from: classes4.dex */
public final class M1 extends A2 {
    final /* synthetic */ Q1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M1(InterfaceC5156z2 interfaceC5156z2, Q1 q1) {
        super(interfaceC5156z2);
        this.this$0 = q1;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.A2, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5156z2
    public void onAdEnd(String str) {
        this.this$0.setAdState(B1.FINISHED);
        super.onAdEnd(str);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.A2, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5156z2
    public void onAdStart(String str) {
        this.this$0.setAdState(B1.PLAYING);
        this.this$0.getValidationToPresentMetric$vungle_ads_release().markEnd();
        C2961a4.logMetric$vungle_ads_release$default(C2961a4.INSTANCE, this.this$0.getValidationToPresentMetric$vungle_ads_release(), this.this$0.getLogEntry$vungle_ads_release(), (String) null, 4, (Object) null);
        super.onAdStart(str);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.A2, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5156z2
    public void onFailure(Ei0 ei0) {
        AbstractC2995aW.q(ei0, "error");
        this.this$0.setAdState(B1.ERROR);
        super.onFailure(ei0);
    }
}
