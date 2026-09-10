package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.view.View;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.wi0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4951wi0 implements NC {
    final /* synthetic */ Di0 this$0;

    public C4951wi0(Di0 di0) {
        this.this$0 = di0;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.NC
    public void onImpression(View view) {
        C4917wJ.Companion.d("VungleBannerView", "ImpressionTracker checked the banner view become visible.");
        this.this$0.isOnImpressionCalled = true;
        this.this$0.checkHardwareAcceleration();
        C4304pL c4304pL = this.this$0.presenter;
        if (c4304pL != null) {
            c4304pL.start();
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.NC
    public void onViewInvisible(View view) {
        this.this$0.logViewInvisibleOnPlay();
    }
}
