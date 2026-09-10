package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class Gi0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3132a;
    public final /* synthetic */ Si0 b;

    public /* synthetic */ Gi0(Si0 si0, int i) {
        this.f3132a = i;
        this.b = si0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f3132a;
        Si0 si0 = this.b;
        switch (i) {
            case 0:
                Si0.m208init$lambda3(si0);
                break;
            default:
                Si0.m210onInitSuccess$lambda14(si0);
                break;
        }
    }
}
