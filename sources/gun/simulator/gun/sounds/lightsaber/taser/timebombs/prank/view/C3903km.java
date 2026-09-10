package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.km, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3903km implements BI {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4613a;
    public final /* synthetic */ C3403f4 b;
    public final /* synthetic */ C3779jO c;

    public /* synthetic */ C3903km(C3403f4 c3403f4, C3779jO c3779jO, int i) {
        this.f4613a = i;
        this.b = c3403f4;
        this.c = c3779jO;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.BI
    public final void invoke(Object obj) {
        InterfaceC3579h4 interfaceC3579h4 = (InterfaceC3579h4) obj;
        switch (this.f4613a) {
            case 0:
                interfaceC3579h4.e(this.b, this.c);
                break;
            default:
                interfaceC3579h4.getClass();
                break;
        }
    }
}
