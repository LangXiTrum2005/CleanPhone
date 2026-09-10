package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.m9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class RunnableC4027m9 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4685a;
    public final /* synthetic */ AbstractC4203o9 b;

    public /* synthetic */ RunnableC4027m9(AbstractC4203o9 abstractC4203o9, int i) {
        this.f4685a = i;
        this.b = abstractC4203o9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f4685a;
        AbstractC4203o9 abstractC4203o9 = this.b;
        switch (i) {
            case 0:
                C4115n9.m257onAdStart$lambda0(abstractC4203o9);
                break;
            case 1:
                C4115n9.m255onAdLeftApplication$lambda5(abstractC4203o9);
                break;
            case 2:
                C4115n9.m252onAdClick$lambda3(abstractC4203o9);
                break;
            case 3:
                C4115n9.m253onAdEnd$lambda2(abstractC4203o9);
                break;
            case 4:
                C4115n9.m256onAdRewarded$lambda4(abstractC4203o9);
                break;
            default:
                C4115n9.m254onAdImpression$lambda1(abstractC4203o9);
                break;
        }
    }
}
