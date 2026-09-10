package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: loaded from: classes2.dex */
public final class H7 implements InterfaceC3521gS {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final H7 f3155a = new H7();
    public static final C2530Jt b;
    public static final C2530Jt c;
    public static final C2530Jt d;
    public static final C2530Jt e;

    static {
        C2329Ca c2329CaD = C2329Ca.d();
        c2329CaD.f2927a = 1;
        b = new C2530Jt("window", DM.u(DM.s(InterfaceC4842vW.class, c2329CaD.b())));
        C2329Ca c2329CaD2 = C2329Ca.d();
        c2329CaD2.f2927a = 2;
        c = new C2530Jt("logSourceMetrics", DM.u(DM.s(InterfaceC4842vW.class, c2329CaD2.b())));
        C2329Ca c2329CaD3 = C2329Ca.d();
        c2329CaD3.f2927a = 3;
        d = new C2530Jt("globalMetrics", DM.u(DM.s(InterfaceC4842vW.class, c2329CaD3.b())));
        C2329Ca c2329CaD4 = C2329Ca.d();
        c2329CaD4.f2927a = 4;
        e = new C2530Jt("appNamespace", DM.u(DM.s(InterfaceC4842vW.class, c2329CaD4.b())));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3297dr
    public final void a(Object obj, Object obj2) {
        C5120yf c5120yf = (C5120yf) obj;
        InterfaceC3609hS interfaceC3609hS = (InterfaceC3609hS) obj2;
        interfaceC3609hS.c(b, c5120yf.f5288a);
        interfaceC3609hS.c(c, c5120yf.b);
        interfaceC3609hS.c(d, c5120yf.c);
        interfaceC3609hS.c(e, c5120yf.d);
    }
}
