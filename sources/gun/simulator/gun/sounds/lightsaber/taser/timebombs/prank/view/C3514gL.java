package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.gL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3514gL implements InterfaceC2565Lc {
    final /* synthetic */ C4304pL this$0;

    public C3514gL(C4304pL c4304pL) {
        this.this$0 = c4304pL;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2565Lc
    public void onFailure(InterfaceC2435Gc interfaceC2435Gc, Throwable th) {
        C4917wJ.Companion.d("MRAIDPresenter", "send RI Failure");
        StringBuilder sb = new StringBuilder("Error RI API calls: ");
        sb.append(th != null ? th.getLocalizedMessage() : null);
        new CR(sb.toString()).setLogEntry$vungle_ads_release(this.this$0.getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2565Lc
    public void onResponse(InterfaceC2435Gc interfaceC2435Gc, C5109yZ c5109yZ) {
        C4917wJ.Companion.d("MRAIDPresenter", "send RI success");
    }
}
