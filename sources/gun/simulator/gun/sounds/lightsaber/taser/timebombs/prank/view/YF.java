package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.graphics.Color;
import android.graphics.PointF;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class YF {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C3692iN f4011a = C3692iN.I("x", "y");

    public static int a(MF mf) {
        mf.h();
        int iQ = (int) (mf.q() * 255.0d);
        int iQ2 = (int) (mf.q() * 255.0d);
        int iQ3 = (int) (mf.q() * 255.0d);
        while (mf.o()) {
            mf.x();
        }
        mf.m();
        return Color.argb(255, iQ, iQ2, iQ3);
    }

    public static PointF b(MF mf, float f) {
        int iD = DM.D(mf.t());
        if (iD == 0) {
            mf.h();
            float fQ = (float) mf.q();
            float fQ2 = (float) mf.q();
            while (mf.t() != 2) {
                mf.x();
            }
            mf.m();
            return new PointF(fQ * f, fQ2 * f);
        }
        if (iD != 2) {
            if (iD != 6) {
                throw new IllegalArgumentException("Unknown point starts with ".concat(AbstractC5044xl.B(mf.t())));
            }
            float fQ3 = (float) mf.q();
            float fQ4 = (float) mf.q();
            while (mf.o()) {
                mf.x();
            }
            return new PointF(fQ3 * f, fQ4 * f);
        }
        mf.k();
        float fD = 0.0f;
        float fD2 = 0.0f;
        while (mf.o()) {
            int iV = mf.v(f4011a);
            if (iV == 0) {
                fD = d(mf);
            } else if (iV != 1) {
                mf.w();
                mf.x();
            } else {
                fD2 = d(mf);
            }
        }
        mf.n();
        return new PointF(fD * f, fD2 * f);
    }

    public static ArrayList c(MF mf, float f) {
        ArrayList arrayList = new ArrayList();
        mf.h();
        while (mf.t() == 1) {
            mf.h();
            arrayList.add(b(mf, f));
            mf.m();
        }
        mf.m();
        return arrayList;
    }

    public static float d(MF mf) {
        int iT = mf.t();
        int iD = DM.D(iT);
        if (iD != 0) {
            if (iD == 6) {
                return (float) mf.q();
            }
            throw new IllegalArgumentException("Unknown value for token of type ".concat(AbstractC5044xl.B(iT)));
        }
        mf.h();
        float fQ = (float) mf.q();
        while (mf.o()) {
            mf.x();
        }
        mf.m();
        return fQ;
    }
}
