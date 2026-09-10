package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Yp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC2915Yp implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4044a;
    public final /* synthetic */ C3031aq b;
    public final /* synthetic */ InterfaceC3120bq c;

    public /* synthetic */ RunnableC2915Yp(C3031aq c3031aq, InterfaceC3120bq interfaceC3120bq, int i) {
        this.f4044a = i;
        this.b = c3031aq;
        this.c = interfaceC3120bq;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f4044a;
        InterfaceC3120bq interfaceC3120bq = this.c;
        C3031aq c3031aq = this.b;
        switch (i) {
            case 0:
                interfaceC3120bq.f(c3031aq.f4145a, c3031aq.b);
                break;
            case 1:
                interfaceC3120bq.x(c3031aq.f4145a, c3031aq.b);
                break;
            case 2:
                interfaceC3120bq.G(c3031aq.f4145a, c3031aq.b);
                break;
            default:
                interfaceC3120bq.e(c3031aq.f4145a, c3031aq.b);
                break;
        }
    }
}
