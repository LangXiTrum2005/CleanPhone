package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.k70, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC3848k70 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4587a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ RunnableC3848k70(int i, Object obj, boolean z) {
        this.f4587a = i;
        this.c = obj;
        this.b = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f4587a;
        boolean z = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                C3936l70 c3936l70 = (C3936l70) obj;
                c3936l70.getClass();
                Tg0.a();
                C3877kY c3877kY = (C3877kY) c3936l70.b;
                boolean z2 = c3877kY.b;
                c3877kY.b = z;
                if (z2 != z) {
                    ((InterfaceC4161nj) c3877kY.c).a(z);
                }
                break;
            default:
                ((C4200o70) obj).b.a(z);
                break;
        }
    }
}
