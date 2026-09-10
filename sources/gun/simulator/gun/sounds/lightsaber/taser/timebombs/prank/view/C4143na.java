package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.na, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4143na extends C4888w0 {
    final /* synthetic */ C4582sa this$0;

    public C4143na(C4582sa c4582sa) {
        this.this$0 = c4582sa;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4888w0
    public void onBackground() {
        this.this$0.onPause$vungle_ads_release();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4888w0
    public void onForeground() {
        this.this$0.onResume$vungle_ads_release();
    }
}
