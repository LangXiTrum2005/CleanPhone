package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: loaded from: classes2.dex */
public final class K7 implements InterfaceC3521gS {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final K7 f3302a = new K7();
    public static final C2530Jt b;
    public static final C2530Jt c;

    static {
        C2329Ca c2329CaD = C2329Ca.d();
        c2329CaD.f2927a = 1;
        b = new C2530Jt("logSource", DM.u(DM.s(InterfaceC4842vW.class, c2329CaD.b())));
        C2329Ca c2329CaD2 = C2329Ca.d();
        c2329CaD2.f2927a = 2;
        c = new C2530Jt("logEventDropped", DM.u(DM.s(InterfaceC4842vW.class, c2329CaD2.b())));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3297dr
    public final void a(Object obj, Object obj2) {
        C4565sJ c4565sJ = (C4565sJ) obj;
        InterfaceC3609hS interfaceC3609hS = (InterfaceC3609hS) obj2;
        interfaceC3609hS.c(b, c4565sJ.f4972a);
        interfaceC3609hS.c(c, c4565sJ.b);
    }
}
