package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.z40, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C5161z40 extends WG implements InterfaceC2766Sw {
    public static final C5161z40 g = new C5161z40(0);
    public static final C5161z40 h = new C5161z40(2);
    public static final C5161z40 i = new C5161z40(3);
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5161z40(int i2) {
        super(1);
        this.f = i2;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw
    public final Object invoke(Object obj) {
        switch (this.f) {
            case 0:
                InterfaceC4545s40 interfaceC4545s40 = (InterfaceC4545s40) obj;
                AbstractC2995aW.q(interfaceC4545s40, "it");
                return interfaceC4545s40.iterator();
            case 1:
                return obj;
            case 2:
                C3153cD c3153cD = (C3153cD) obj;
                AbstractC2995aW.q(c3153cD, "it");
                return c3153cD.b;
            default:
                return Boolean.valueOf(obj == null);
        }
    }
}
