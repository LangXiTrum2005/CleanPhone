package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import androidx.core.view.PointerIconCompat;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.k7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC3847k7 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4586a;
    public final /* synthetic */ String b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;

    public /* synthetic */ RunnableC3847k7(Object obj, String str, long j, long j2, int i) {
        this.f4586a = i;
        this.e = obj;
        this.b = str;
        this.c = j;
        this.d = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f4586a;
        Object obj = this.e;
        switch (i) {
            case 0:
                SurfaceHolderCallbackC2658Os surfaceHolderCallbackC2658Os = (SurfaceHolderCallbackC2658Os) ((C3491g4) obj).c;
                int i2 = Ug0.f3833a;
                C4167nm c4167nm = (C4167nm) surfaceHolderCallbackC2658Os.f3526a.q;
                C3403f4 c3403f4M = c4167nm.M();
                c4167nm.N(c3403f4M, PointerIconCompat.TYPE_TEXT, new C2953a0(c3403f4M, this.b, this.d, this.c, 0));
                break;
            default:
                Gh0 gh0 = (Gh0) obj;
                gh0.getClass();
                int i3 = Ug0.f3833a;
                C4167nm c4167nm2 = (C4167nm) ((SurfaceHolderCallbackC2658Os) gh0.b).f3526a.q;
                C3403f4 c3403f4M2 = c4167nm2.M();
                c4167nm2.N(c3403f4M2, PointerIconCompat.TYPE_TOP_RIGHT_DIAGONAL_DOUBLE_ARROW, new C2953a0(c3403f4M2, this.b, this.d, this.c, 1));
                break;
        }
    }
}
