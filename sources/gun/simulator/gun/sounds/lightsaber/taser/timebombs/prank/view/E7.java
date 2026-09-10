package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: loaded from: classes2.dex */
public final class E7 implements InterfaceC3521gS {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final E7 f3008a = new E7();
    public static final C2530Jt b = C2530Jt.a("requestTimeMs");
    public static final C2530Jt c = C2530Jt.a("requestUptimeMs");
    public static final C2530Jt d = C2530Jt.a("clientInfo");
    public static final C2530Jt e = C2530Jt.a("logSource");
    public static final C2530Jt f = C2530Jt.a("logSourceName");
    public static final C2530Jt g = C2530Jt.a("logEvent");
    public static final C2530Jt h = C2530Jt.a("qosTier");

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3297dr
    public final void a(Object obj, Object obj2) {
        InterfaceC3609hS interfaceC3609hS = (InterfaceC3609hS) obj2;
        C3411f8 c3411f8 = (C3411f8) ((AbstractC4477rJ) obj);
        interfaceC3609hS.b(b, c3411f8.f4354a);
        interfaceC3609hS.b(c, c3411f8.b);
        interfaceC3609hS.c(d, c3411f8.c);
        interfaceC3609hS.c(e, c3411f8.d);
        interfaceC3609hS.c(f, c3411f8.e);
        interfaceC3609hS.c(g, c3411f8.f);
        interfaceC3609hS.c(h, c3411f8.g);
    }
}
