package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.dm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3289dm implements BI {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4289a;
    public final /* synthetic */ int b;

    public /* synthetic */ C3289dm(int i, C3403f4 c3403f4, boolean z) {
        this.f4289a = 2;
        this.b = i;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.BI
    public final void invoke(Object obj) {
        InterfaceC3579h4 interfaceC3579h4 = (InterfaceC3579h4) obj;
        switch (this.f4289a) {
            case 0:
                interfaceC3579h4.getClass();
                break;
            case 1:
                interfaceC3579h4.i(this.b);
                break;
            default:
                interfaceC3579h4.getClass();
                break;
        }
    }

    public /* synthetic */ C3289dm(C3403f4 c3403f4, boolean z, int i, int i2) {
        this.f4289a = i2;
        this.b = i;
    }
}
