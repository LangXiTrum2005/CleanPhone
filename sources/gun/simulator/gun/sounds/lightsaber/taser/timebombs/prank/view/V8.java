package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: loaded from: classes4.dex */
public final class V8 implements R1 {
    final /* synthetic */ String $adMarkup;
    final /* synthetic */ X8 this$0;

    public V8(X8 x8, String str) {
        this.this$0 = x8;
        this.$adMarkup = str;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.R1
    public void onFailure(Ei0 ei0) {
        AbstractC2995aW.q(ei0, "error");
        X8 x8 = this.this$0;
        x8.onLoadFailure$vungle_ads_release(x8, ei0);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.R1
    public void onSuccess(C4980x2 c4980x2) {
        AbstractC2995aW.q(c4980x2, "advertisement");
        this.this$0.onAdLoaded$vungle_ads_release(c4980x2);
        X8 x8 = this.this$0;
        x8.onLoadSuccess$vungle_ads_release(x8, this.$adMarkup);
    }
}
