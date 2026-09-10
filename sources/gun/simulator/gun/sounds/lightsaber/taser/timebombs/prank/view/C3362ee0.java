package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.ee0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3362ee0 implements InterfaceC2546Kj, InterfaceC4818v9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f4327a;
    public final ArrayList b = new ArrayList();
    public final int c;
    public final C3915kv d;
    public final C3915kv e;
    public final C3915kv f;

    public C3362ee0(B9 b9, C4110n60 c4110n60) {
        c4110n60.getClass();
        this.f4327a = c4110n60.e;
        this.c = c4110n60.f4728a;
        C3915kv c3915kvD = c4110n60.b.d();
        this.d = c3915kvD;
        C3915kv c3915kvD2 = c4110n60.c.d();
        this.e = c3915kvD2;
        C3915kv c3915kvD3 = c4110n60.d.d();
        this.f = c3915kvD3;
        b9.e(c3915kvD);
        b9.e(c3915kvD2);
        b9.e(c3915kvD3);
        c3915kvD.a(this);
        c3915kvD2.a(this);
        c3915kvD3.a(this);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4818v9
    public final void a() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                return;
            }
            ((InterfaceC4818v9) arrayList.get(i)).a();
            i++;
        }
    }

    public final void c(InterfaceC4818v9 interfaceC4818v9) {
        this.b.add(interfaceC4818v9);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2546Kj
    public final void b(List list, List list2) {
    }
}
