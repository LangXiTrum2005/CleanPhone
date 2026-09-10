package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class Q40 extends WG implements InterfaceC3567gx {
    public static final Q40 g = new Q40(0);
    public static final Q40 h = new Q40(1);
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Q40(int i) {
        super(2);
        this.f = i;
    }

    public final InterfaceC4123nG a(InterfaceC3156cG interfaceC3156cG, List list) {
        switch (this.f) {
            case 0:
                AbstractC2995aW.q(interfaceC3156cG, "clazz");
                AbstractC2995aW.q(list, "types");
                ArrayList arrayListW = AbstractC3375el.W(T40.f3752a, list, true);
                AbstractC2995aW.n(arrayListW);
                return AbstractC3375el.R(interfaceC3156cG, list, arrayListW);
            default:
                AbstractC2995aW.q(interfaceC3156cG, "clazz");
                AbstractC2995aW.q(list, "types");
                ArrayList arrayListW2 = AbstractC3375el.W(T40.f3752a, list, true);
                AbstractC2995aW.n(arrayListW2);
                InterfaceC4123nG interfaceC4123nGR = AbstractC3375el.R(interfaceC3156cG, list, arrayListW2);
                if (interfaceC4123nGR != null) {
                    return WD.u(interfaceC4123nGR);
                }
                return null;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f) {
            case 0:
                break;
        }
        return a((InterfaceC3156cG) obj, (List) obj2);
    }
}
