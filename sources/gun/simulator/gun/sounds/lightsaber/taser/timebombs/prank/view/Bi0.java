package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.view.MotionEvent;

/* JADX INFO: loaded from: classes4.dex */
public final class Bi0 implements YK {
    final /* synthetic */ Di0 this$0;

    public Bi0(Di0 di0) {
        this.this$0 = di0;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.YK
    public boolean onTouch(MotionEvent motionEvent) {
        C4304pL c4304pL = this.this$0.presenter;
        if (c4304pL == null) {
            return false;
        }
        c4304pL.onViewTouched(motionEvent);
        return false;
    }
}
