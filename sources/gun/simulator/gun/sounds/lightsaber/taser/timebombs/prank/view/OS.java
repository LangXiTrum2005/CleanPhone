package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
public final class OS implements View.OnTouchListener {
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            view.setScaleX(0.96f);
            view.setScaleY(0.96f);
            return false;
        }
        if (action != 1 && action != 3) {
            return false;
        }
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        return false;
    }
}
