package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.bw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3126bw implements InterfaceC4530rv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3086bY f4195a;

    public C3126bw(C3086bY c3086bY) {
        this.f4195a = c3086bY;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4530rv
    public final Object emit(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        C3086bY c3086bY = this.f4195a;
        if (c3086bY.f4172a != YR.f4019a) {
            throw new IllegalArgumentException("Flow has more than one element".toString());
        }
        c3086bY.f4172a = obj;
        return C5033xf0.f5238a;
    }
}
