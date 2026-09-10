package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.ti0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4687ti0 implements O8 {
    final /* synthetic */ Di0 this$0;

    public C4687ti0(Di0 di0) {
        this.this$0 = di0;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.O8, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Y8
    public void onAdClicked(X8 x8) {
        AbstractC2995aW.q(x8, "baseAd");
        O8 adListener = this.this$0.getAdListener();
        if (adListener != null) {
            adListener.onAdClicked(x8);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.O8, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Y8
    public void onAdEnd(X8 x8) {
        AbstractC2995aW.q(x8, "baseAd");
        O8 adListener = this.this$0.getAdListener();
        if (adListener != null) {
            adListener.onAdEnd(x8);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.O8, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Y8
    public void onAdFailedToLoad(X8 x8, Ei0 ei0) {
        AbstractC2995aW.q(x8, "baseAd");
        AbstractC2995aW.q(ei0, "adError");
        O8 adListener = this.this$0.getAdListener();
        if (adListener != null) {
            adListener.onAdFailedToLoad(x8, ei0);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.O8, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Y8
    public void onAdFailedToPlay(X8 x8, Ei0 ei0) {
        AbstractC2995aW.q(x8, "baseAd");
        AbstractC2995aW.q(ei0, "adError");
        O8 adListener = this.this$0.getAdListener();
        if (adListener != null) {
            adListener.onAdFailedToPlay(x8, ei0);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.O8, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Y8
    public void onAdImpression(X8 x8) {
        AbstractC2995aW.q(x8, "baseAd");
        O8 adListener = this.this$0.getAdListener();
        if (adListener != null) {
            adListener.onAdImpression(x8);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.O8, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Y8
    public void onAdLeftApplication(X8 x8) {
        AbstractC2995aW.q(x8, "baseAd");
        O8 adListener = this.this$0.getAdListener();
        if (adListener != null) {
            adListener.onAdLeftApplication(x8);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.O8, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Y8
    public void onAdLoaded(X8 x8) {
        AbstractC2995aW.q(x8, "baseAd");
        this.this$0.onBannerAdLoaded(x8);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.O8, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Y8
    public void onAdStart(X8 x8) {
        AbstractC2995aW.q(x8, "baseAd");
        O8 adListener = this.this$0.getAdListener();
        if (adListener != null) {
            adListener.onAdStart(x8);
        }
    }
}
