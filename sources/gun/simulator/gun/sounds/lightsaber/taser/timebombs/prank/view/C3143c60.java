package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.c60, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3143c60 implements InterfaceC3368eh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C3143c60 f4204a = new C3143c60();
    public static final C3692iN b = C3692iN.I(com.umeng.analytics.pro.bc.aL, com.umeng.analytics.pro.bc.aK, com.umeng.analytics.pro.bc.aI, "o");

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3368eh0
    public final Object m(MF mf, float f) {
        if (mf.t() == 1) {
            mf.h();
        }
        mf.k();
        ArrayList arrayListC = null;
        ArrayList arrayListC2 = null;
        ArrayList arrayListC3 = null;
        boolean zP = false;
        while (mf.o()) {
            int iV = mf.v(b);
            if (iV == 0) {
                zP = mf.p();
            } else if (iV == 1) {
                arrayListC = YF.c(mf, f);
            } else if (iV == 2) {
                arrayListC2 = YF.c(mf, f);
            } else if (iV != 3) {
                mf.w();
                mf.x();
            } else {
                arrayListC3 = YF.c(mf, f);
            }
        }
        mf.n();
        if (mf.t() == 2) {
            mf.m();
        }
        if (arrayListC == null || arrayListC2 == null || arrayListC3 == null) {
            throw new IllegalArgumentException("Shape data was missing information.");
        }
        if (arrayListC.isEmpty()) {
            return new C3055b60(new PointF(), false, Collections.emptyList());
        }
        int size = arrayListC.size();
        PointF pointF = (PointF) arrayListC.get(0);
        ArrayList arrayList = new ArrayList(size);
        for (int i = 1; i < size; i++) {
            PointF pointF2 = (PointF) arrayListC.get(i);
            int i2 = i - 1;
            arrayList.add(new C2365Dk(AbstractC5187zP.a((PointF) arrayListC.get(i2), (PointF) arrayListC3.get(i2)), AbstractC5187zP.a(pointF2, (PointF) arrayListC2.get(i)), pointF2));
        }
        if (zP) {
            PointF pointF3 = (PointF) arrayListC.get(0);
            int i3 = size - 1;
            arrayList.add(new C2365Dk(AbstractC5187zP.a((PointF) arrayListC.get(i3), (PointF) arrayListC3.get(i3)), AbstractC5187zP.a(pointF3, (PointF) arrayListC2.get(0)), pointF3));
        }
        return new C3055b60(pointF, zP, arrayList);
    }
}
