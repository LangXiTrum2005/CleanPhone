package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.os.Handler;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.vh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4860vh extends G9 {
    public final HashMap h = new HashMap();
    public Handler i;
    public Bd0 j;

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.G9
    public void g() {
        for (C4772uh c4772uh : this.h.values()) {
            c4772uh.f5094a.f(c4772uh.b);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.G9
    public void i() {
        for (C4772uh c4772uh : this.h.values()) {
            c4772uh.f5094a.h(c4772uh.b);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.G9
    public void m() {
        Iterator it = this.h.values().iterator();
        while (it.hasNext()) {
            ((C4772uh) it.next()).f5094a.m();
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.G9
    public void s() {
        HashMap map = this.h;
        for (C4772uh c4772uh : map.values()) {
            c4772uh.f5094a.r(c4772uh.b);
            G9 g9 = c4772uh.f5094a;
            C3844k50 c3844k50 = c4772uh.c;
            g9.u(c3844k50);
            g9.t(c3844k50);
        }
        map.clear();
    }

    public abstract C5186zO v(Object obj, C5186zO c5186zO);

    public abstract void y(Object obj, G9 g9, Gc0 gc0);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AO, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.th] */
    public final void z(final Object obj, G9 g9) {
        HashMap map = this.h;
        FW.h(!map.containsKey(obj));
        ?? r1 = new AO() { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.th
            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AO
            public final void a(G9 g10, Gc0 gc0) {
                this.f5046a.y(obj, g10, gc0);
            }
        };
        C3844k50 c3844k50 = new C3844k50(this, obj);
        map.put(obj, new C4772uh(g9, r1, c3844k50));
        Handler handler = this.i;
        handler.getClass();
        DO r0 = g9.c;
        r0.getClass();
        CO co = new CO();
        co.f2918a = handler;
        co.b = c3844k50;
        r0.c.add(co);
        Handler handler2 = this.i;
        handler2.getClass();
        C3031aq c3031aq = g9.d;
        c3031aq.getClass();
        C2941Zp c2941Zp = new C2941Zp();
        c2941Zp.f4094a = handler2;
        c2941Zp.b = c3844k50;
        c3031aq.c.add(c2941Zp);
        Bd0 bd0 = this.j;
        WU wu = this.g;
        FW.t(wu);
        g9.n(r1, bd0, wu);
        if (!this.b.isEmpty()) {
            return;
        }
        g9.f(r1);
    }

    public long w(Object obj, long j) {
        return j;
    }

    public int x(Object obj, int i) {
        return i;
    }
}
