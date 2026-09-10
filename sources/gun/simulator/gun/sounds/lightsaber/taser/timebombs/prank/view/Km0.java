package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.Collections;
import java.util.Date;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class Km0 implements Pn0 {
    public static final Km0 f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C2498In f3326a;
    public Date b;
    public boolean c;
    public Xn0 d;
    public boolean e;

    static {
        Xn0 xn0 = new Xn0(2);
        Km0 km0 = new Km0();
        km0.f3326a = new C2498In(11);
        km0.d = xn0;
        f = km0;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Pn0
    public final void a(boolean z) {
        if (!this.e && z) {
            Date dateB = this.f3326a.b();
            Date date = this.b;
            if (date == null || dateB.after(date)) {
                this.b = dateB;
                if (this.c) {
                    Iterator it = Collections.unmodifiableCollection(Hn0.c.b).iterator();
                    while (it.hasNext()) {
                        V2 v2 = ((Jm0) it.next()).e;
                        Date date2 = this.b;
                        v2.h(date2 != null ? (Date) date2.clone() : null);
                    }
                }
            }
        }
        this.e = z;
    }
}
