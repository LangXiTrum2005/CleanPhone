package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.y40, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC5073y40 extends A40 {
    public static C3738iu J0(InterfaceC4545s40 interfaceC4545s40, InterfaceC2766Sw interfaceC2766Sw) {
        AbstractC2995aW.q(interfaceC4545s40, "<this>");
        return new C3738iu(interfaceC4545s40, true, interfaceC2766Sw);
    }

    public static Object K0(InterfaceC4545s40 interfaceC4545s40) {
        AbstractC2995aW.q(interfaceC4545s40, "<this>");
        Iterator it = interfaceC4545s40.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static String L0(InterfaceC4545s40 interfaceC4545s40, String str, InterfaceC2766Sw interfaceC2766Sw, int i) {
        if ((i & 32) != 0) {
            interfaceC2766Sw = null;
        }
        AbstractC2995aW.q(interfaceC4545s40, "<this>");
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int i2 = 0;
        for (Object obj : interfaceC4545s40) {
            i2++;
            if (i2 > 1) {
                sb.append((CharSequence) str);
            }
            AbstractC3375el.f(sb, obj, interfaceC2766Sw);
        }
        sb.append((CharSequence) "");
        String string = sb.toString();
        AbstractC2995aW.p(string, "joinTo(StringBuilder(), …ed, transform).toString()");
        return string;
    }

    public static Ld0 M0(InterfaceC4545s40 interfaceC4545s40, InterfaceC2766Sw interfaceC2766Sw) {
        AbstractC2995aW.q(interfaceC4545s40, "<this>");
        return new Ld0(interfaceC4545s40, interfaceC2766Sw);
    }

    public static C3738iu N0(InterfaceC4545s40 interfaceC4545s40, InterfaceC2766Sw interfaceC2766Sw) {
        AbstractC2995aW.q(interfaceC2766Sw, "transform");
        return new C3738iu(new Ld0(interfaceC4545s40, interfaceC2766Sw), false, C5161z40.i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static InterfaceC4545s40 O0(Ld0 ld0, int i) {
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC5044xl.g("Requested element count ", i, " is less than zero.").toString());
        }
        if (i == 0) {
            return C2916Yq.f4045a;
        }
        return ld0 instanceof InterfaceC3998lq ? ((InterfaceC3998lq) ld0).b(i) : new C3648hq(ld0, i, 1);
    }

    public static List P0(InterfaceC4545s40 interfaceC4545s40) {
        Iterator it = interfaceC4545s40.iterator();
        if (!it.hasNext()) {
            return C2812Uq.f3846a;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return AbstractC2340Cl.J(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
