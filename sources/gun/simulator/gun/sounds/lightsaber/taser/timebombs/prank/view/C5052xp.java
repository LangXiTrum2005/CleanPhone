package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.xp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C5052xp implements InterfaceC4443qv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC4443qv f5248a;
    public final InterfaceC2766Sw b;
    public final InterfaceC3567gx c;

    public C5052xp(C4706tv c4706tv) {
        C5058xv c5058xv = C5058xv.f;
        C4970wv c4970wv = C4970wv.f;
        this.f5248a = c4706tv;
        this.b = c5058xv;
        this.c = c4970wv;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4443qv
    public final Object collect(InterfaceC4530rv interfaceC4530rv, InterfaceC2857Wj interfaceC2857Wj) {
        C3086bY c3086bY = new C3086bY();
        c3086bY.f4172a = YR.f4019a;
        Object objCollect = this.f5248a.collect(new C4964wp(this, c3086bY, interfaceC4530rv), interfaceC2857Wj);
        return objCollect == EnumC4602sk.f4993a ? objCollect : C5033xf0.f5238a;
    }
}
