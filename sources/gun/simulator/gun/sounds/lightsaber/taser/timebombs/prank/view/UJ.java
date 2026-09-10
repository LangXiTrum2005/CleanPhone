package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class UJ implements InterfaceC3072bK {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3818a;
    public final /* synthetic */ C3160cK b;

    public /* synthetic */ UJ(C3160cK c3160cK, int i) {
        this.f3818a = i;
        this.b = c3160cK;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3072bK
    public final void run() {
        int i = this.f3818a;
        C3160cK c3160cK = this.b;
        switch (i) {
            case 0:
                c3160cK.n();
                break;
            default:
                c3160cK.l();
                break;
        }
    }
}
