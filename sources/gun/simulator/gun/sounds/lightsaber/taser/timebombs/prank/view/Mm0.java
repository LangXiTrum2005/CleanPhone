package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.Collections;
import java.util.Date;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class Mm0 implements Rn0 {
    public static final Mm0 f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C2498In f3423a;
    public Date b;
    public boolean c;
    public Xn0 d;
    public boolean e;

    static {
        Xn0 xn0 = new Xn0(0);
        Mm0 mm0 = new Mm0();
        mm0.f3423a = new C2498In(7);
        mm0.d = xn0;
        f = mm0;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Rn0
    public final void a(boolean z) {
        if (!this.e && z) {
            Date dateB = this.f3423a.b();
            Date date = this.b;
            if (date == null || dateB.after(date)) {
                this.b = dateB;
                if (this.c) {
                    Iterator it = Collections.unmodifiableCollection(Cn0.c.b).iterator();
                    while (it.hasNext()) {
                        W2 w2 = ((C3203cn0) it.next()).e;
                        Date date2 = this.b;
                        w2.d(date2 != null ? (Date) date2.clone() : null);
                    }
                }
            }
        }
        this.e = z;
    }
}
