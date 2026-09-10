package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import androidx.constraintlayout.core.motion.utils.TypedValues;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class Ee0 {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:4:0x000b  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static int a(String str) {
        byte b;
        str.getClass();
        switch (str.hashCode()) {
            case -1310311125:
                if (!str.equals("easing")) {
                    b = -1;
                } else {
                    b = 0;
                }
                break;
            case -1249320806:
                if (!str.equals("rotationX")) {
                    b = -1;
                } else {
                    b = 1;
                }
                break;
            case -1249320805:
                if (!str.equals("rotationY")) {
                    b = -1;
                } else {
                    b = 2;
                }
                break;
            case -1249320804:
                if (!str.equals("rotationZ")) {
                    b = -1;
                } else {
                    b = 3;
                }
                break;
            case -1225497657:
                if (!str.equals("translationX")) {
                    b = -1;
                } else {
                    b = 4;
                }
                break;
            case -1225497656:
                if (!str.equals("translationY")) {
                    b = -1;
                } else {
                    b = 5;
                }
                break;
            case -1225497655:
                if (!str.equals("translationZ")) {
                    b = -1;
                } else {
                    b = 6;
                }
                break;
            case -1001078227:
                if (!str.equals("progress")) {
                    b = -1;
                } else {
                    b = 7;
                }
                break;
            case -987906986:
                if (!str.equals("pivotX")) {
                    b = -1;
                } else {
                    b = 8;
                }
                break;
            case -987906985:
                if (!str.equals("pivotY")) {
                    b = -1;
                } else {
                    b = 9;
                }
                break;
            case -908189618:
                if (!str.equals("scaleX")) {
                    b = -1;
                } else {
                    b = 10;
                }
                break;
            case -908189617:
                if (!str.equals("scaleY")) {
                    b = -1;
                } else {
                    b = 11;
                }
                break;
            case 92909918:
                if (!str.equals("alpha")) {
                    b = -1;
                } else {
                    b = 12;
                }
                break;
            case 579057826:
                if (!str.equals("curveFit")) {
                    b = -1;
                } else {
                    b = com.umeng.analytics.pro.cw.k;
                }
                break;
            case 803192288:
                if (!str.equals("pathRotate")) {
                    b = -1;
                } else {
                    b = com.umeng.analytics.pro.cw.l;
                }
                break;
            case 1941332754:
                if (!str.equals("visibility")) {
                    b = -1;
                } else {
                    b = com.umeng.analytics.pro.cw.m;
                }
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
                return 420;
            case 1:
                return 308;
            case 2:
                return 309;
            case 3:
                return 310;
            case 4:
                return 304;
            case 5:
                return 305;
            case 6:
                return 306;
            case 7:
                return 315;
            case 8:
                return 313;
            case 9:
                return 314;
            case 10:
                return 311;
            case 11:
                return 312;
            case 12:
                return 403;
            case 13:
                return 401;
            case 14:
                return 416;
            case 15:
                return 402;
            default:
                return -1;
        }
    }

    public static int b(int i) {
        if (i == 100) {
            return 2;
        }
        if (i == 101) {
            return 8;
        }
        if (i == 416) {
            return 4;
        }
        if (i == 420 || i == 421) {
            return 8;
        }
        switch (i) {
            case 304:
            case 305:
            case 306:
            case 307:
            case 308:
            case 309:
            case 310:
            case 311:
            case 312:
            case 313:
            case 314:
            case 315:
                return 4;
            default:
                switch (i) {
                    case 401:
                    case 402:
                        return 2;
                    case 403:
                        return 4;
                    default:
                        switch (i) {
                            case 423:
                            case 424:
                            case TypedValues.CycleType.TYPE_WAVE_PHASE /* 425 */:
                                return 4;
                            default:
                                return -1;
                        }
                }
        }
    }
}
