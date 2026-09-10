package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.bL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class RunnableC3073bL implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4166a;
    public final /* synthetic */ C4304pL b;

    public /* synthetic */ RunnableC3073bL(C4304pL c4304pL, int i) {
        this.f4166a = i;
        this.b = c4304pL;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f4166a;
        C4304pL c4304pL = this.b;
        switch (i) {
            case 0:
                C4304pL.m261closeView$lambda3(c4304pL);
                break;
            case 1:
                C4304pL.m267processCommand$lambda7(c4304pL);
                break;
            case 2:
                C4304pL.m263processCommand$lambda11(c4304pL);
                break;
            case 3:
                C4304pL.m265processCommand$lambda13(c4304pL);
                break;
            default:
                C4304pL.m262prepare$lambda16(c4304pL);
                break;
        }
    }
}
