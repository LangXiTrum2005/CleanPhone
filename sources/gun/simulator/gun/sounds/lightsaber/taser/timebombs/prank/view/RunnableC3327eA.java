package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.eA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC3327eA implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4311a;
    public final /* synthetic */ Object b;

    public /* synthetic */ RunnableC3327eA(Object obj, int i) {
        this.f4311a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f4311a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((C3591hA) obj).p();
                break;
            case 1:
                C3591hA c3591hA = (C3591hA) obj;
                c3591hA.C = true;
                c3591hA.p();
                break;
            default:
                ((Wm0) obj).D();
                break;
        }
    }
}
