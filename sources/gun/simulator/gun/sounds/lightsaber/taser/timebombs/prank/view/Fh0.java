package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import androidx.core.view.PointerIconCompat;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class Fh0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3081a;
    public final /* synthetic */ Gh0 b;
    public final /* synthetic */ C2599Ml c;

    public /* synthetic */ Fh0(Gh0 gh0, C2599Ml c2599Ml, int i) {
        this.f3081a = i;
        this.b = gh0;
        this.c = c2599Ml;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3081a) {
            case 0:
                Gh0 gh0 = this.b;
                C2599Ml c2599Ml = this.c;
                gh0.getClass();
                synchronized (c2599Ml) {
                }
                Hh0 hh0 = gh0.b;
                int i = Ug0.f3833a;
                C4167nm c4167nm = (C4167nm) ((SurfaceHolderCallbackC2658Os) hh0).f3526a.q;
                C3403f4 c3403f4J = c4167nm.J(c4167nm.d.e);
                c4167nm.N(c3403f4J, PointerIconCompat.TYPE_GRAB, new C3377em(0, c3403f4J, c2599Ml));
                break;
            default:
                Gh0 gh1 = this.b;
                gh1.getClass();
                int i2 = Ug0.f3833a;
                C2736Rs c2736Rs = ((SurfaceHolderCallbackC2658Os) gh1.b).f3526a;
                c2736Rs.getClass();
                C4167nm c4167nm2 = (C4167nm) c2736Rs.q;
                C3403f4 c3403f4M = c4167nm2.M();
                c4167nm2.N(c3403f4M, PointerIconCompat.TYPE_VERTICAL_DOUBLE_ARROW, new C3377em(1, c3403f4M, this.c));
                break;
        }
    }
}
