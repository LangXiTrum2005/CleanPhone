package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class XJ implements InterfaceC3072bK {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3964a;
    public final /* synthetic */ C3160cK b;
    public final /* synthetic */ float c;

    public /* synthetic */ XJ(C3160cK c3160cK, float f, int i) {
        this.f3964a = i;
        this.b = c3160cK;
        this.c = f;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3072bK
    public final void run() {
        int i = this.f3964a;
        float f = this.c;
        C3160cK c3160cK = this.b;
        switch (i) {
            case 0:
                MJ mj = c3160cK.f4216a;
                if (mj != null) {
                    c3160cK.s((int) AbstractC5187zP.e(mj.l, mj.m, f));
                } else {
                    c3160cK.f.add(new XJ(c3160cK, f, 0));
                }
                break;
            case 1:
                c3160cK.u(f);
                break;
            default:
                MJ mj2 = c3160cK.f4216a;
                if (mj2 != null) {
                    float fE = AbstractC5187zP.e(mj2.l, mj2.m, f);
                    ChoreographerFrameCallbackC4127nK choreographerFrameCallbackC4127nK = c3160cK.b;
                    choreographerFrameCallbackC4127nK.v(choreographerFrameCallbackC4127nK.j, fE);
                } else {
                    c3160cK.f.add(new XJ(c3160cK, f, 2));
                }
                break;
        }
    }
}
