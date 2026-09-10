package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.gg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3541gg extends WG implements InterfaceC3567gx {
    public static final C3541gg g = new C3541gg(0);
    public static final C3541gg h = new C3541gg(1);
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3541gg(int i) {
        super(2);
        this.f = i;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(Object obj, Object obj2) {
        C3629hg c3629hg;
        switch (this.f) {
            case 0:
                String str = (String) obj;
                InterfaceC3373ek interfaceC3373ek = (InterfaceC3373ek) obj2;
                AbstractC2995aW.q(str, "acc");
                AbstractC2995aW.q(interfaceC3373ek, "element");
                if (str.length() == 0) {
                    return interfaceC3373ek.toString();
                }
                return str + ", " + interfaceC3373ek;
            default:
                InterfaceC3549gk interfaceC3549gk = (InterfaceC3549gk) obj;
                InterfaceC3373ek interfaceC3373ek2 = (InterfaceC3373ek) obj2;
                AbstractC2995aW.q(interfaceC3549gk, "acc");
                AbstractC2995aW.q(interfaceC3373ek2, "element");
                InterfaceC3549gk interfaceC3549gkMinusKey = interfaceC3549gk.minusKey(interfaceC3373ek2.getKey());
                C2734Rq c2734Rq = C2734Rq.f3684a;
                if (interfaceC3549gkMinusKey == c2734Rq) {
                    return interfaceC3373ek2;
                }
                G7 g7 = G7.d;
                InterfaceC2909Yj interfaceC2909Yj = (InterfaceC2909Yj) interfaceC3549gkMinusKey.get(g7);
                if (interfaceC2909Yj == null) {
                    c3629hg = new C3629hg(interfaceC3373ek2, interfaceC3549gkMinusKey);
                } else {
                    InterfaceC3549gk interfaceC3549gkMinusKey2 = interfaceC3549gkMinusKey.minusKey(g7);
                    if (interfaceC3549gkMinusKey2 == c2734Rq) {
                        return new C3629hg(interfaceC2909Yj, interfaceC3373ek2);
                    }
                    c3629hg = new C3629hg(interfaceC2909Yj, new C3629hg(interfaceC3373ek2, interfaceC3549gkMinusKey2));
                }
                return c3629hg;
        }
    }
}
