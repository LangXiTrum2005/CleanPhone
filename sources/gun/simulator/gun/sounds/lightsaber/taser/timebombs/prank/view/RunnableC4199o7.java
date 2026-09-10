package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import androidx.core.view.PointerIconCompat;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.o7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC4199o7 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4778a;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;

    public /* synthetic */ RunnableC4199o7(Object obj, int i, long j, long j2, int i2) {
        this.f4778a = i2;
        this.e = obj;
        this.b = i;
        this.c = j;
        this.d = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f4778a;
        Object obj = this.e;
        switch (i) {
            case 0:
                SurfaceHolderCallbackC2658Os surfaceHolderCallbackC2658Os = (SurfaceHolderCallbackC2658Os) ((C3491g4) obj).c;
                int i2 = Ug0.f3833a;
                C4167nm c4167nm = (C4167nm) surfaceHolderCallbackC2658Os.f3526a.q;
                final C3403f4 c3403f4M = c4167nm.M();
                final int i3 = this.b;
                final int i4 = 0;
                final long j = this.c;
                final long j2 = this.d;
                c4167nm.N(c3403f4M, 1011, new BI(c3403f4M, i3, j, j2, i4) { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.cm

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ int f4243a;
                    public final /* synthetic */ C3403f4 b;
                    public final /* synthetic */ int c;
                    public final /* synthetic */ long d;

                    {
                        this.f4243a = i4;
                    }

                    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.BI
                    public final void invoke(Object obj2) {
                        InterfaceC3579h4 interfaceC3579h4 = (InterfaceC3579h4) obj2;
                        switch (this.f4243a) {
                            case 0:
                                interfaceC3579h4.getClass();
                                break;
                            default:
                                interfaceC3579h4.f(this.b, this.c, this.d);
                                break;
                        }
                    }
                });
                break;
            default:
                C4167nm c4167nm2 = (C4167nm) ((E8) obj).b;
                C4079mm c4079mm = c4167nm2.d;
                final C3403f4 c3403f4J = c4167nm2.J(c4079mm.b.isEmpty() ? null : (C5186zO) FW.H(c4079mm.b));
                final int i5 = this.b;
                final int i6 = 1;
                final long j3 = this.c;
                final long j4 = this.d;
                c4167nm2.N(c3403f4J, PointerIconCompat.TYPE_CELL, new BI(c3403f4J, i5, j3, j4, i6) { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.cm

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ int f4243a;
                    public final /* synthetic */ C3403f4 b;
                    public final /* synthetic */ int c;
                    public final /* synthetic */ long d;

                    {
                        this.f4243a = i6;
                    }

                    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.BI
                    public final void invoke(Object obj2) {
                        InterfaceC3579h4 interfaceC3579h4 = (InterfaceC3579h4) obj2;
                        switch (this.f4243a) {
                            case 0:
                                interfaceC3579h4.getClass();
                                break;
                            default:
                                interfaceC3579h4.f(this.b, this.c, this.d);
                                break;
                        }
                    }
                });
                break;
        }
    }
}
