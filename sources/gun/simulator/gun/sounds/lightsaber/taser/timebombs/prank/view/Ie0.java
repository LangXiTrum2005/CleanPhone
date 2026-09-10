package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import androidx.constraintlayout.core.motion.utils.TypedValues;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class Ie0 {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:4:0x000b  */
    public static int a(String str) {
        str.getClass();
        switch (str) {
            case "transitionFlags":
                return TypedValues.TransitionType.TYPE_TRANSITION_FLAGS;
            case "duration":
                return TypedValues.TransitionType.TYPE_DURATION;
            case "motionInterpolator":
                return TypedValues.TransitionType.TYPE_INTERPOLATOR;
            case "autoTransition":
                return TypedValues.TransitionType.TYPE_AUTO_TRANSITION;
            case "to":
                return TypedValues.TransitionType.TYPE_TO;
            case "from":
                return TypedValues.TransitionType.TYPE_FROM;
            case "pathMotionArc":
                return 509;
            case "staggered":
                return TypedValues.TransitionType.TYPE_STAGGERED;
            default:
                return -1;
        }
    }

    public static int b(int i) {
        if (i == 509) {
            return 2;
        }
        switch (i) {
            case TypedValues.TransitionType.TYPE_DURATION /* 700 */:
                return 2;
            case TypedValues.TransitionType.TYPE_FROM /* 701 */:
            case TypedValues.TransitionType.TYPE_TO /* 702 */:
                return 8;
            default:
                switch (i) {
                    case TypedValues.TransitionType.TYPE_INTERPOLATOR /* 705 */:
                    case TypedValues.TransitionType.TYPE_TRANSITION_FLAGS /* 707 */:
                        return 8;
                    case TypedValues.TransitionType.TYPE_STAGGERED /* 706 */:
                        return 4;
                    default:
                        return -1;
                }
        }
    }
}
