package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class GQ implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3122a;
    public final /* synthetic */ PQ b;

    public /* synthetic */ GQ(PQ pq, int i) {
        this.f3122a = i;
        this.b = pq;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f3122a;
        PQ pq = this.b;
        switch (i) {
            case 0:
                HQ.m166onAdImpression$lambda1(pq);
                break;
            case 1:
                HQ.m165onAdEnd$lambda2(pq);
                break;
            case 2:
                HQ.m168onAdStart$lambda0(pq);
                break;
            case 3:
                HQ.m167onAdLeftApplication$lambda4(pq);
                break;
            default:
                HQ.m164onAdClick$lambda3(pq);
                break;
        }
    }
}
