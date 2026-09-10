package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.u60, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4725u60 extends W {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f5065a;
    public C2798Uc b;

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.W
    public final boolean a(V v) {
        C4549s60 c4549s60 = (C4549s60) v;
        if (this.f5065a >= 0) {
            return false;
        }
        long j = c4549s60.i;
        if (j < c4549s60.j) {
            c4549s60.j = j;
        }
        this.f5065a = j;
        return true;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.W
    public final InterfaceC2857Wj[] b(V v) {
        long j = this.f5065a;
        this.f5065a = -1L;
        this.b = null;
        return ((C4549s60) v).t(j);
    }
}
