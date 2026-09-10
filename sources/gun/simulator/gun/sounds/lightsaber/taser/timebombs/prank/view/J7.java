package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: loaded from: classes2.dex */
public final class J7 implements InterfaceC3521gS {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final J7 f3255a = new J7();
    public static final C2530Jt b;
    public static final C2530Jt c;

    static {
        C2329Ca c2329CaD = C2329Ca.d();
        c2329CaD.f2927a = 1;
        b = new C2530Jt("eventsDroppedCount", DM.u(DM.s(InterfaceC4842vW.class, c2329CaD.b())));
        C2329Ca c2329CaD2 = C2329Ca.d();
        c2329CaD2.f2927a = 3;
        c = new C2530Jt("reason", DM.u(DM.s(InterfaceC4842vW.class, c2329CaD2.b())));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3297dr
    public final void a(Object obj, Object obj2) {
        C4390qJ c4390qJ = (C4390qJ) obj;
        InterfaceC3609hS interfaceC3609hS = (InterfaceC3609hS) obj2;
        interfaceC3609hS.b(b, c4390qJ.f4876a);
        interfaceC3609hS.c(c, c4390qJ.b);
    }
}
