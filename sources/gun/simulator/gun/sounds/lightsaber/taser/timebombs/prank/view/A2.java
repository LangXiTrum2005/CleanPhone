package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: loaded from: classes4.dex */
public class A2 implements InterfaceC5156z2 {
    private final InterfaceC5156z2 adPlayCallback;

    public A2(InterfaceC5156z2 interfaceC5156z2) {
        AbstractC2995aW.q(interfaceC5156z2, "adPlayCallback");
        this.adPlayCallback = interfaceC5156z2;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5156z2
    public void onAdClick(String str) {
        this.adPlayCallback.onAdClick(str);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5156z2
    public void onAdEnd(String str) {
        this.adPlayCallback.onAdEnd(str);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5156z2
    public void onAdImpression(String str) {
        this.adPlayCallback.onAdImpression(str);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5156z2
    public void onAdLeftApplication(String str) {
        this.adPlayCallback.onAdLeftApplication(str);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5156z2
    public void onAdRewarded(String str) {
        this.adPlayCallback.onAdRewarded(str);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5156z2
    public void onAdStart(String str) {
        this.adPlayCallback.onAdStart(str);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5156z2
    public void onFailure(Ei0 ei0) {
        AbstractC2995aW.q(ei0, "error");
        this.adPlayCallback.onFailure(ei0);
    }
}
