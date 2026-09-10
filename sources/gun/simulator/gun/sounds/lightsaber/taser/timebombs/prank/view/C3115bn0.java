package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.Collections;
import java.util.Date;
import java.util.Iterator;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.bn0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3115bn0 implements On0 {
    public static final C3115bn0 f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C2498In f4190a;
    public Date b;
    public boolean c;
    public Xn0 d;
    public boolean e;

    static {
        Xn0 xn0 = new Xn0(1);
        C3115bn0 c3115bn0 = new C3115bn0();
        c3115bn0.f4190a = new C2498In(9);
        c3115bn0.d = xn0;
        f = c3115bn0;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.On0
    public final void a(boolean z) {
        if (!this.e && z) {
            Date dateB = this.f4190a.b();
            Date date = this.b;
            if (date == null || dateB.after(date)) {
                this.b = dateB;
                if (this.c) {
                    Iterator it = Collections.unmodifiableCollection(Fn0.c.b).iterator();
                    while (it.hasNext()) {
                        V2 v2 = ((C3026an0) it.next()).e;
                        Date date2 = this.b;
                        v2.h(date2 != null ? (Date) date2.clone() : null);
                    }
                }
            }
        }
        this.e = z;
    }
}
