package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.hw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3654hw implements InterfaceC4443qv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC4443qv f4480a;
    public final /* synthetic */ InterfaceC4443qv b;
    public final /* synthetic */ InterfaceC3655hx c;

    public C3654hw(InterfaceC4443qv interfaceC4443qv, C4907w90 c4907w90, InterfaceC3655hx interfaceC3655hx) {
        this.f4480a = interfaceC4443qv;
        this.b = c4907w90;
        this.c = interfaceC3655hx;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4443qv
    public final Object collect(InterfaceC4530rv interfaceC4530rv, InterfaceC2857Wj interfaceC2857Wj) throws Throwable {
        C3453fg c3453fg = new C3453fg(null, C3740iw.f, new C2791Tv(this.c, null, 1), interfaceC4530rv, new InterfaceC4443qv[]{this.f4480a, this.b});
        C4618sv c4618sv = new C4618sv(interfaceC2857Wj, interfaceC2857Wj.getContext());
        Object objZ = AbstractC3375el.Z(c4618sv, c4618sv, c3453fg);
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        C5033xf0 c5033xf0 = C5033xf0.f5238a;
        if (objZ != enumC4602sk) {
            objZ = c5033xf0;
        }
        return objZ == enumC4602sk ? objZ : c5033xf0;
    }
}
