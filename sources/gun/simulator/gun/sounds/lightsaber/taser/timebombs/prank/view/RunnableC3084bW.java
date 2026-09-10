package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.bW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC3084bW implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4171a;
    public final /* synthetic */ C3525gW b;

    public /* synthetic */ RunnableC3084bW(C3525gW c3525gW, int i) {
        this.f4171a = i;
        this.b = c3525gW;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f4171a;
        C3525gW c3525gW = this.b;
        switch (i) {
            case 0:
                c3525gW.l();
                break;
            case 1:
                if (!c3525gW.L) {
                    InterfaceC4307pO interfaceC4307pO = c3525gW.q;
                    interfaceC4307pO.getClass();
                    interfaceC4307pO.o(c3525gW);
                }
                break;
            default:
                c3525gW.F = true;
                break;
        }
    }
}
