package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import androidx.constraintlayout.core.motion.utils.TypedValues;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class Fe0 {
    public static int a(String str) {
        str.getClass();
        if (str.equals(TypedValues.MotionScene.S_DEFAULT_DURATION)) {
            return 600;
        }
        return !str.equals(TypedValues.MotionScene.S_LAYOUT_DURING_TRANSITION) ? -1 : 601;
    }

    public static int b(int i) {
        if (i != 600) {
            return i != 601 ? -1 : 1;
        }
        return 2;
    }
}
