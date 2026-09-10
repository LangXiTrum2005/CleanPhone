package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.graphics.Paint;

/* JADX INFO: loaded from: classes.dex */
public final class Tb0 extends Paint {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Tb0(int i) {
        super(1);
        if (i != 1) {
            setStyle(Paint.Style.FILL);
        } else {
            super(1);
            setStyle(Paint.Style.STROKE);
        }
    }
}
