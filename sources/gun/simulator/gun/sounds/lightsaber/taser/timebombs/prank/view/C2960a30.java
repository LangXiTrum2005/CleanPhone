package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.a30, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2960a30 implements InterfaceC3368eh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2960a30 f4106a = new C2960a30();

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3368eh0
    public final Object m(MF mf, float f) {
        boolean z = mf.t() == 1;
        if (z) {
            mf.h();
        }
        float fQ = (float) mf.q();
        float fQ2 = (float) mf.q();
        while (mf.o()) {
            mf.x();
        }
        if (z) {
            mf.m();
        }
        return new Z20((fQ / 100.0f) * f, (fQ2 / 100.0f) * f);
    }
}
