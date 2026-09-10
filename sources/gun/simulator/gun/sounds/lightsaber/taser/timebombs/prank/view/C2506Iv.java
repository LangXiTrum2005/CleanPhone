package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Iv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2506Iv implements InterfaceC4443qv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3246a;
    public final /* synthetic */ InterfaceC4443qv b;
    public final /* synthetic */ InterfaceC3567gx c;

    public /* synthetic */ C2506Iv(InterfaceC4443qv interfaceC4443qv, InterfaceC3567gx interfaceC3567gx, int i) {
        this.f3246a = i;
        this.b = interfaceC4443qv;
        this.c = interfaceC3567gx;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4443qv
    public final Object collect(InterfaceC4530rv interfaceC4530rv, InterfaceC2857Wj interfaceC2857Wj) {
        C5033xf0 c5033xf0 = C5033xf0.f5238a;
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i = this.f3246a;
        InterfaceC4443qv interfaceC4443qv = this.b;
        InterfaceC3567gx interfaceC3567gx = this.c;
        switch (i) {
            case 0:
                Object objCollect = interfaceC4443qv.collect(new C2558Kv(new WX(), interfaceC4530rv, interfaceC3567gx), interfaceC2857Wj);
                return objCollect == enumC4602sk ? objCollect : c5033xf0;
            default:
                Object objCollect2 = interfaceC4443qv.collect(new C3566gw(interfaceC4530rv, interfaceC3567gx), interfaceC2857Wj);
                return objCollect2 == enumC4602sk ? objCollect2 : c5033xf0;
        }
    }
}
