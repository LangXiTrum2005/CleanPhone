package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.rr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC4526rr implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4950a;
    public final InterfaceC3878kZ b;
    public final /* synthetic */ C4790ur c;

    public /* synthetic */ RunnableC4526rr(C4790ur c4790ur, InterfaceC3878kZ interfaceC3878kZ, int i) {
        this.f4950a = i;
        this.c = c4790ur;
        this.b = interfaceC3878kZ;
    }

    private void a() {
        T60 t60 = (T60) this.b;
        t60.f3755a.a();
        synchronized (t60.b) {
            synchronized (this.c) {
                try {
                    C4702tr c4702tr = this.c.f5107a;
                    InterfaceC3878kZ interfaceC3878kZ = this.b;
                    c4702tr.getClass();
                    if (c4702tr.f5054a.contains(new C4614sr(interfaceC3878kZ, FW.d))) {
                        C4790ur c4790ur = this.c;
                        InterfaceC3878kZ interfaceC3878kZ2 = this.b;
                        c4790ur.getClass();
                        try {
                            ((T60) interfaceC3878kZ2).e(c4790ur.t, 5);
                        } catch (Throwable th) {
                            throw new C2590Mc(th);
                        }
                    }
                    this.c.d();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4950a) {
            case 0:
                a();
                return;
            default:
                T60 t60 = (T60) this.b;
                t60.f3755a.a();
                synchronized (t60.b) {
                    synchronized (this.c) {
                        try {
                            C4702tr c4702tr = this.c.f5107a;
                            InterfaceC3878kZ interfaceC3878kZ = this.b;
                            c4702tr.getClass();
                            if (c4702tr.f5054a.contains(new C4614sr(interfaceC3878kZ, FW.d))) {
                                this.c.v.c();
                                C4790ur c4790ur = this.c;
                                InterfaceC3878kZ interfaceC3878kZ2 = this.b;
                                c4790ur.getClass();
                                try {
                                    ((T60) interfaceC3878kZ2).f(c4790ur.v, c4790ur.r, c4790ur.y);
                                    this.c.j(this.b);
                                } catch (Throwable th) {
                                    throw new C2590Mc(th);
                                }
                            }
                            this.c.d();
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
                return;
        }
    }
}
