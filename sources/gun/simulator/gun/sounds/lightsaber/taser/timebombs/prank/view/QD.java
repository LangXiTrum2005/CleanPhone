package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public final class QD extends AbstractC2662Ow {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QD(Context context) {
        super(context);
        AbstractC2995aW.q(context, com.umeng.analytics.pro.f.X);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Q1
    public boolean isValidAdTypeForPlacement(C4664tU c4664tU) {
        AbstractC2995aW.q(c4664tU, "placement");
        return c4664tU.isInterstitial() || c4664tU.isAppOpen();
    }
}
