package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import androidx.constraintlayout.core.motion.utils.TypedValues;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class Ge0 {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:4:0x000b  */
    public static int a(String str) {
        str.getClass();
        switch (str) {
            case "AnimateCircleAngleTo":
                return TypedValues.MotionType.TYPE_ANIMATE_CIRCLEANGLE_TO;
            case "QuantizeMotionPhase":
                return TypedValues.MotionType.TYPE_QUANTIZE_MOTION_PHASE;
            case "QuantizeMotionSteps":
                return TypedValues.MotionType.TYPE_QUANTIZE_MOTIONSTEPS;
            case "PathRotate":
                return 601;
            case "QuantizeInterpolator":
                return TypedValues.MotionType.TYPE_QUANTIZE_INTERPOLATOR;
            case "DrawPath":
                return TypedValues.MotionType.TYPE_DRAW_PATH;
            case "Stagger":
                return 600;
            case "PolarRelativeTo":
                return TypedValues.MotionType.TYPE_POLAR_RELATIVETO;
            case "QuantizeInterpolatorType":
                return TypedValues.MotionType.TYPE_QUANTIZE_INTERPOLATOR_TYPE;
            case "QuantizeInterpolatorID":
                return TypedValues.MotionType.TYPE_QUANTIZE_INTERPOLATOR_ID;
            case "TransitionEasing":
                return TypedValues.MotionType.TYPE_EASING;
            case "AnimateRelativeTo":
                return TypedValues.MotionType.TYPE_ANIMATE_RELATIVE_TO;
            case "PathMotionArc":
                return TypedValues.MotionType.TYPE_PATHMOTION_ARC;
            default:
                return -1;
        }
    }
}
