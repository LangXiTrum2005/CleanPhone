package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.graphics.PointF;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.gV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3524gV implements InterfaceC3368eh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C3524gV f4417a = new C3524gV();

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3368eh0
    public final Object m(MF mf, float f) {
        int iT = mf.t();
        if (iT == 1) {
            return YF.b(mf, f);
        }
        if (iT == 3) {
            return YF.b(mf, f);
        }
        if (iT != 7) {
            throw new IllegalArgumentException("Cannot convert json to point. Next token is ".concat(AbstractC5044xl.B(iT)));
        }
        PointF pointF = new PointF(((float) mf.q()) * f, ((float) mf.q()) * f);
        while (mf.o()) {
            mf.x();
        }
        return pointF;
    }
}
