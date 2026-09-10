package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.m7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC4023m7 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4681a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ RunnableC4023m7(Object obj, long j, int i) {
        this.f4681a = i;
        this.c = obj;
        this.b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f4681a;
        long j = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                SurfaceHolderCallbackC2658Os surfaceHolderCallbackC2658Os = (SurfaceHolderCallbackC2658Os) ((C3491g4) obj).c;
                int i2 = Ug0.f3833a;
                C4167nm c4167nm = (C4167nm) surfaceHolderCallbackC2658Os.f3526a.q;
                C3403f4 c3403f4M = c4167nm.M();
                c4167nm.N(c3403f4M, 1010, new C5069y20(c3403f4M, j, 2));
                break;
            default:
                C4304pL.m266processCommand$lambda14((C4304pL) obj, j);
                break;
        }
    }
}
