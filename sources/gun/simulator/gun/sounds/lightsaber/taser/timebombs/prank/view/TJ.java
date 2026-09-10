package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class TJ implements InterfaceC3072bK {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3766a;
    public final /* synthetic */ C3160cK b;
    public final /* synthetic */ String c;

    public /* synthetic */ TJ(C3160cK c3160cK, String str, int i) {
        this.f3766a = i;
        this.b = c3160cK;
        this.c = str;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3072bK
    public final void run() {
        int i = this.f3766a;
        String str = this.c;
        C3160cK c3160cK = this.b;
        switch (i) {
            case 0:
                c3160cK.r(str);
                break;
            case 1:
                c3160cK.q(str);
                break;
            default:
                c3160cK.t(str);
                break;
        }
    }
}
