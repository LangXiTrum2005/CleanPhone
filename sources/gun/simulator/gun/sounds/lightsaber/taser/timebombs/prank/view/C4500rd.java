package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.rd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4500rd {
    public static final C4500rd c = new C4500rd(AbstractC2853Wf.x0(new ArrayList()), null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f4937a;
    public final AbstractC3375el b;

    public C4500rd(Set set, AbstractC3375el abstractC3375el) {
        AbstractC2995aW.q(set, "pins");
        this.f4937a = set;
        this.b = abstractC3375el;
    }

    public final void a(String str, InterfaceC2714Qw interfaceC2714Qw) {
        AbstractC2995aW.q(str, "hostname");
        Iterator it = this.f4937a.iterator();
        if (it.hasNext()) {
            AbstractC3950lJ.z(it.next());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C4500rd) {
            C4500rd c4500rd = (C4500rd) obj;
            if (AbstractC2995aW.i(c4500rd.f4937a, this.f4937a) && AbstractC2995aW.i(c4500rd.b, this.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f4937a.hashCode() + 1517) * 41;
        AbstractC3375el abstractC3375el = this.b;
        return iHashCode + (abstractC3375el != null ? abstractC3375el.hashCode() : 0);
    }
}
