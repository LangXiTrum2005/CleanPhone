package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import androidx.core.view.PointerIconCompat;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.n7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC4111n7 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4729a;
    public final /* synthetic */ C3491g4 b;
    public final /* synthetic */ C2599Ml c;

    public /* synthetic */ RunnableC4111n7(C3491g4 c3491g4, C2599Ml c2599Ml, int i) {
        this.f4729a = i;
        this.b = c3491g4;
        this.c = c2599Ml;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4729a) {
            case 0:
                SurfaceHolderCallbackC2658Os surfaceHolderCallbackC2658Os = (SurfaceHolderCallbackC2658Os) this.b.c;
                int i = Ug0.f3833a;
                C2736Rs c2736Rs = surfaceHolderCallbackC2658Os.f3526a;
                c2736Rs.getClass();
                C4167nm c4167nm = (C4167nm) c2736Rs.q;
                C3403f4 c3403f4M = c4167nm.M();
                c4167nm.N(c3403f4M, PointerIconCompat.TYPE_CROSSHAIR, new C3377em(3, c3403f4M, this.c));
                break;
            default:
                C3491g4 c3491g4 = this.b;
                C2599Ml c2599Ml = this.c;
                c3491g4.getClass();
                synchronized (c2599Ml) {
                }
                SurfaceHolderCallbackC2658Os surfaceHolderCallbackC2658Os2 = (SurfaceHolderCallbackC2658Os) c3491g4.c;
                int i2 = Ug0.f3833a;
                C4167nm c4167nm2 = (C4167nm) surfaceHolderCallbackC2658Os2.f3526a.q;
                C3403f4 c3403f4J = c4167nm2.J(c4167nm2.d.e);
                c4167nm2.N(c3403f4J, PointerIconCompat.TYPE_ALL_SCROLL, new C3377em(2, c3403f4J, c2599Ml));
                break;
        }
    }
}
