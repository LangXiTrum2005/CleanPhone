package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: loaded from: classes3.dex */
public final class M7 implements InterfaceC3521gS {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final M7 f3393a = new M7();
    public static final C2530Jt b;

    static {
        C2329Ca c2329CaD = C2329Ca.d();
        c2329CaD.f2927a = 1;
        b = new C2530Jt("messagingClientEvent", DM.u(DM.s(InterfaceC4842vW.class, c2329CaD.b())));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3297dr
    public final void a(Object obj, Object obj2) {
        ((InterfaceC3609hS) obj2).c(b, ((C4396qP) obj).f4880a);
    }
}
