package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.List;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.i00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3660i00 implements InterfaceC4818v9, InterfaceC2546Kj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3160cK f4482a;
    public final AbstractC5170z9 b;
    public C3055b60 c;

    public C3660i00(C3160cK c3160cK, B9 b9, C3572h00 c3572h00) {
        this.f4482a = c3160cK;
        c3572h00.getClass();
        AbstractC5170z9 abstractC5170z9D = c3572h00.f4441a.d();
        this.b = abstractC5170z9D;
        b9.e(abstractC5170z9D);
        abstractC5170z9D.a(this);
    }

    public static int c(int i, int i2) {
        int i3 = i / i2;
        if ((i ^ i2) < 0 && i3 * i2 != i) {
            i3--;
        }
        return i - (i3 * i2);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4818v9
    public final void a() {
        this.f4482a.invalidateSelf();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2546Kj
    public final void b(List list, List list2) {
    }
}
