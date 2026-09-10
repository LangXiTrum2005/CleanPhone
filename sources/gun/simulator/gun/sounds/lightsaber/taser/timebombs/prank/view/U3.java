package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class U3 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3808a;
    public final /* synthetic */ C4689tj0 b;

    public /* synthetic */ U3(C4689tj0 c4689tj0, int i) {
        this.f3808a = i;
        this.b = c4689tj0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f3808a;
        C4689tj0 c4689tj0 = this.b;
        switch (i) {
            case 0:
                C2961a4.m226init$lambda1(c4689tj0);
                break;
            case 1:
                C4689tj0.m281submit$lambda2(c4689tj0);
                break;
            case 2:
                C4689tj0.m279execute$lambda0(c4689tj0);
                break;
            default:
                C4689tj0.m280submit$lambda1(c4689tj0);
                break;
        }
    }
}
