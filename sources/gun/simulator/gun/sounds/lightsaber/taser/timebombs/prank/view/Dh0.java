package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import androidx.core.view.PointerIconCompat;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class Dh0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2983a = 0;
    public final /* synthetic */ Gh0 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;

    public /* synthetic */ Dh0(Gh0 gh0, int i, long j) {
        this.b = gh0;
        this.d = i;
        this.c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f2983a;
        int i2 = this.d;
        long j = this.c;
        Gh0 gh0 = this.b;
        gh0.getClass();
        switch (i) {
            case 0:
                int i3 = Ug0.f3833a;
                C4167nm c4167nm = (C4167nm) ((SurfaceHolderCallbackC2658Os) gh0.b).f3526a.q;
                C3403f4 c3403f4J = c4167nm.J(c4167nm.d.e);
                c4167nm.N(c3403f4J, PointerIconCompat.TYPE_ZOOM_IN, new C3023am(c3403f4J, i2, j));
                break;
            default:
                int i4 = Ug0.f3833a;
                C4167nm c4167nm2 = (C4167nm) ((SurfaceHolderCallbackC2658Os) gh0.b).f3526a.q;
                C3403f4 c3403f4J2 = c4167nm2.J(c4167nm2.d.e);
                c4167nm2.N(c3403f4J2, PointerIconCompat.TYPE_GRABBING, new C3023am(c3403f4J2, j, i2));
                break;
        }
    }

    public /* synthetic */ Dh0(Gh0 gh0, long j, int i) {
        this.b = gh0;
        this.c = j;
        this.d = i;
    }
}
