package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class I8 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3205a;
    public final /* synthetic */ K8 b;

    public /* synthetic */ I8(K8 k8, int i) {
        this.f3205a = i;
        this.b = k8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f3205a;
        K8 k8 = this.b;
        switch (i) {
            case 0:
                J8.m176onAdClick$lambda3(k8);
                break;
            case 1:
                J8.m179onAdLeftApplication$lambda4(k8);
                break;
            case 2:
                J8.m177onAdEnd$lambda2(k8);
                break;
            case 3:
                J8.m178onAdImpression$lambda1(k8);
                break;
            default:
                J8.m180onAdStart$lambda0(k8);
                break;
        }
    }
}
