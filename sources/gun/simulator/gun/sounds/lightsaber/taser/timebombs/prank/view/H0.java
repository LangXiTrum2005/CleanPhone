package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.view.MotionEvent;

/* JADX INFO: loaded from: classes4.dex */
public final class H0 implements YK {
    final /* synthetic */ J0 this$0;

    public H0(J0 j0) {
        this.this$0 = j0;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.YK
    public boolean onTouch(MotionEvent motionEvent) {
        C4304pL mraidPresenter$vungle_ads_release = this.this$0.getMraidPresenter$vungle_ads_release();
        if (mraidPresenter$vungle_ads_release == null) {
            return false;
        }
        mraidPresenter$vungle_ads_release.onViewTouched(motionEvent);
        return false;
    }
}
