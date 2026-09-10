package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.animation.PathInterpolatorCompat;

/* JADX INFO: loaded from: classes.dex */
public abstract class AG {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final LinearInterpolator f2810a = new LinearInterpolator();
    public static final C3692iN b = C3692iN.I(com.umeng.analytics.pro.bc.aO, com.umeng.analytics.pro.bc.aH, "e", "o", com.umeng.analytics.pro.bc.aI, com.umeng.analytics.pro.bc.aM, TypedValues.TransitionType.S_TO, "ti");
    public static final C3692iN c = C3692iN.I("x", "y");

    public static Interpolator a(PointF pointF, PointF pointF2) {
        pointF.x = AbstractC5187zP.b(pointF.x, -1.0f, 1.0f);
        pointF.y = AbstractC5187zP.b(pointF.y, -100.0f, 100.0f);
        pointF2.x = AbstractC5187zP.b(pointF2.x, -1.0f, 1.0f);
        float fB = AbstractC5187zP.b(pointF2.y, -100.0f, 100.0f);
        pointF2.y = fB;
        Xg0 xg0 = AbstractC3014ah0.f4135a;
        try {
            return PathInterpolatorCompat.create(pointF.x, pointF.y, pointF2.x, fB);
        } catch (IllegalArgumentException e) {
            return "The Path cannot loop back on itself.".equals(e.getMessage()) ? PathInterpolatorCompat.create(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, 0.0f), pointF2.y) : new LinearInterpolator();
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x020b  */
    /* JADX WARN: Failed to find 'out' block for switch in B:9:0x002d. Please report as an issue. */
    public static C5090yG b(MF mf, MJ mj, float f, InterfaceC3368eh0 interfaceC3368eh0, boolean z, boolean z2) {
        Object obj;
        Interpolator interpolatorA;
        Interpolator interpolatorA2;
        Interpolator interpolatorA3;
        Object obj2;
        C5090yG c5090yG;
        C3692iN c3692iN;
        PointF pointF;
        Object obj3;
        PointF pointF2;
        LinearInterpolator linearInterpolator = f2810a;
        C3692iN c3692iN2 = b;
        if (!z || !z2) {
            C3692iN c3692iN3 = c3692iN2;
            if (!z) {
                return new C5090yG(interfaceC3368eh0.m(mf, f));
            }
            mf.k();
            Object objM = null;
            PointF pointFB = null;
            boolean z3 = false;
            float fQ = 0.0f;
            PointF pointFB2 = null;
            PointF pointFB3 = null;
            PointF pointFB4 = null;
            Object objM2 = null;
            while (mf.o()) {
                C3692iN c3692iN4 = c3692iN3;
                switch (mf.v(c3692iN4)) {
                    case 0:
                        fQ = (float) mf.q();
                        break;
                    case 1:
                        objM = interfaceC3368eh0.m(mf, f);
                        break;
                    case 2:
                        objM2 = interfaceC3368eh0.m(mf, f);
                        break;
                    case 3:
                        pointFB2 = YF.b(mf, 1.0f);
                        break;
                    case 4:
                        pointFB = YF.b(mf, 1.0f);
                        break;
                    case 5:
                        z3 = mf.r() == 1;
                        break;
                    case 6:
                        pointFB3 = YF.b(mf, f);
                        break;
                    case 7:
                        pointFB4 = YF.b(mf, f);
                        break;
                    default:
                        mf.x();
                        break;
                }
                c3692iN3 = c3692iN4;
            }
            mf.n();
            if (!z3) {
                if (pointFB2 == null || pointFB == null) {
                    obj = objM2;
                } else {
                    interpolatorA = a(pointFB2, pointFB);
                    obj = objM2;
                }
                C5090yG c5090yG2 = new C5090yG(mj, objM, obj, interpolatorA, fQ, (Float) null);
                c5090yG2.o = pointFB3;
                c5090yG2.p = pointFB4;
                return c5090yG2;
            }
            obj = objM;
            interpolatorA = linearInterpolator;
            C5090yG c5090yG3 = new C5090yG(mj, objM, obj, interpolatorA, fQ, (Float) null);
            c5090yG3.o = pointFB3;
            c5090yG3.p = pointFB4;
            return c5090yG3;
        }
        mf.k();
        PointF pointF3 = null;
        PointF pointFB5 = null;
        PointF pointFB6 = null;
        boolean z4 = false;
        PointF pointFB7 = null;
        PointF pointFB8 = null;
        PointF pointF4 = null;
        Object objM3 = null;
        PointF pointF5 = null;
        PointF pointF6 = null;
        float fQ2 = 0.0f;
        Object objM4 = null;
        while (mf.o()) {
            int iV = mf.v(c3692iN2);
            C3692iN c3692iN5 = c;
            linearInterpolator = linearInterpolator;
            switch (iV) {
                case 0:
                    c3692iN = c3692iN2;
                    pointF = pointFB5;
                    fQ2 = (float) mf.q();
                    c3692iN2 = c3692iN;
                    pointFB5 = pointF;
                    break;
                case 1:
                    pointF = pointFB5;
                    objM3 = interfaceC3368eh0.m(mf, f);
                    pointFB5 = pointF;
                    break;
                case 2:
                    pointF = pointFB5;
                    objM4 = interfaceC3368eh0.m(mf, f);
                    pointFB5 = pointF;
                    break;
                case 3:
                    C3692iN c3692iN6 = c3692iN2;
                    pointF = pointFB5;
                    PointF pointF7 = pointFB6;
                    boolean z5 = z4;
                    if (mf.t() == 3) {
                        mf.k();
                        float fQ3 = 0.0f;
                        float fQ4 = 0.0f;
                        float fQ5 = 0.0f;
                        float fQ6 = 0.0f;
                        while (mf.o()) {
                            int iV2 = mf.v(c3692iN5);
                            if (iV2 == 0) {
                                obj3 = objM3;
                                if (mf.t() == 7) {
                                    fQ5 = (float) mf.q();
                                    objM3 = obj3;
                                    fQ3 = fQ5;
                                } else {
                                    mf.h();
                                    fQ3 = (float) mf.q();
                                    fQ5 = mf.t() == 7 ? (float) mf.q() : fQ3;
                                    mf.m();
                                    objM3 = obj3;
                                }
                            } else if (iV2 != 1) {
                                mf.x();
                            } else if (mf.t() == 7) {
                                fQ6 = (float) mf.q();
                                objM3 = objM3;
                                fQ4 = fQ6;
                            } else {
                                obj3 = objM3;
                                mf.h();
                                fQ4 = (float) mf.q();
                                fQ6 = mf.t() == 7 ? (float) mf.q() : fQ4;
                                mf.m();
                                objM3 = obj3;
                            }
                        }
                        pointF4 = new PointF(fQ3, fQ4);
                        pointF5 = new PointF(fQ5, fQ6);
                        mf.n();
                    } else {
                        pointFB7 = YF.b(mf, f);
                    }
                    z4 = z5;
                    c3692iN2 = c3692iN6;
                    pointFB6 = pointF7;
                    pointFB5 = pointF;
                    break;
                case 4:
                    c3692iN = c3692iN2;
                    if (mf.t() == 3) {
                        mf.k();
                        float fQ7 = 0.0f;
                        float fQ8 = 0.0f;
                        float fQ9 = 0.0f;
                        float fQ10 = 0.0f;
                        while (mf.o()) {
                            PointF pointF8 = pointFB6;
                            int iV3 = mf.v(c3692iN5);
                            if (iV3 != 0) {
                                pointF2 = pointFB5;
                                if (iV3 != 1) {
                                    mf.x();
                                } else if (mf.t() == 7) {
                                    fQ10 = (float) mf.q();
                                    fQ8 = fQ10;
                                } else {
                                    mf.h();
                                    fQ8 = (float) mf.q();
                                    fQ10 = mf.t() == 7 ? (float) mf.q() : fQ8;
                                    mf.m();
                                }
                                pointFB6 = pointF8;
                                pointFB5 = pointF2;
                            } else {
                                pointF2 = pointFB5;
                                z4 = z4;
                                if (mf.t() == 7) {
                                    fQ7 = (float) mf.q();
                                    fQ9 = fQ7;
                                } else {
                                    mf.h();
                                    fQ7 = (float) mf.q();
                                    fQ9 = mf.t() == 7 ? (float) mf.q() : fQ7;
                                    mf.m();
                                }
                            }
                            z4 = z4;
                            pointFB6 = pointF8;
                            pointFB5 = pointF2;
                        }
                        pointF = pointFB5;
                        PointF pointF9 = new PointF(fQ7, fQ8);
                        PointF pointF10 = new PointF(fQ9, fQ10);
                        mf.n();
                        pointF3 = pointF10;
                        pointF6 = pointF9;
                    } else {
                        pointF = pointFB5;
                        pointFB8 = YF.b(mf, f);
                    }
                    c3692iN2 = c3692iN;
                    pointFB5 = pointF;
                    break;
                case 5:
                    z4 = mf.r() == 1;
                    linearInterpolator = linearInterpolator;
                    break;
                case 6:
                    pointFB5 = YF.b(mf, f);
                    linearInterpolator = linearInterpolator;
                    break;
                case 7:
                    pointFB6 = YF.b(mf, f);
                    linearInterpolator = linearInterpolator;
                    break;
                default:
                    mf.x();
                    linearInterpolator = linearInterpolator;
                    break;
            }
        }
        Interpolator interpolatorA4 = linearInterpolator;
        PointF pointF11 = pointFB5;
        PointF pointF12 = pointFB6;
        boolean z6 = z4;
        Object obj4 = objM3;
        mf.n();
        if (z6) {
            obj2 = obj4;
        } else {
            if (pointFB7 == null || pointFB8 == null) {
                if (pointF4 != null && pointF5 != null && pointF6 != null && pointF3 != null) {
                    interpolatorA2 = a(pointF4, pointF6);
                    interpolatorA3 = a(pointF5, pointF3);
                    obj2 = objM4;
                    interpolatorA4 = null;
                }
                if (interpolatorA2 != null || interpolatorA3 == null) {
                    c5090yG = new C5090yG(mj, obj4, obj2, interpolatorA4, fQ2, (Float) null);
                } else {
                    c5090yG = new C5090yG(mj, obj4, obj2, interpolatorA2, interpolatorA3, fQ2);
                }
                c5090yG.o = pointF11;
                c5090yG.p = pointF12;
                return c5090yG;
            }
            interpolatorA4 = a(pointFB7, pointFB8);
            obj2 = objM4;
        }
        interpolatorA2 = null;
        interpolatorA3 = null;
        if (interpolatorA2 != null) {
            c5090yG = new C5090yG(mj, obj4, obj2, interpolatorA4, fQ2, (Float) null);
        } else {
            c5090yG = new C5090yG(mj, obj4, obj2, interpolatorA4, fQ2, (Float) null);
        }
        c5090yG.o = pointF11;
        c5090yG.p = pointF12;
        return c5090yG;
    }
}
