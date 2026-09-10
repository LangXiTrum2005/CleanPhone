package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.kH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3860kH extends C3678i90 {
    public final InterfaceC2857Wj d;

    public C3860kH(InterfaceC3549gk interfaceC3549gk, InterfaceC3567gx interfaceC3567gx) {
        super(interfaceC3549gk, false);
        this.d = WD.n(interfaceC3567gx, this, this);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.PE
    public final void Y() {
        try {
            AbstractC4173np.a(C5033xf0.f5238a, null, WD.w(this.d));
        } catch (Throwable th) {
            resumeWith(AbstractC3375el.v(th));
            throw th;
        }
    }
}
