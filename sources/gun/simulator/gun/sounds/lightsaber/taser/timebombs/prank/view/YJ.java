package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class YJ implements InterfaceC3072bK {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4014a;
    public final /* synthetic */ C3160cK b;
    public final /* synthetic */ int c;

    public /* synthetic */ YJ(C3160cK c3160cK, int i, int i2) {
        this.f4014a = i2;
        this.b = c3160cK;
        this.c = i;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3072bK
    public final void run() {
        int i = this.f4014a;
        int i2 = this.c;
        C3160cK c3160cK = this.b;
        switch (i) {
            case 0:
                c3160cK.o(i2);
                break;
            case 1:
                c3160cK.p(i2);
                break;
            default:
                c3160cK.s(i2);
                break;
        }
    }
}
