package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.mm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4079mm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ec0 f4714a;
    public AC b;
    public C4405qY c;
    public C5186zO d;
    public C5186zO e;
    public C5186zO f;

    public C4079mm(Ec0 ec0) {
        this.f4714a = ec0;
        C5086yC c5086yC = AC.b;
        this.b = C3965lY.e;
        this.c = C4405qY.g;
    }

    public static C5186zO b(LU lu, AC ac, C5186zO c5186zO, Ec0 ec0) {
        C2736Rs c2736Rs = (C2736Rs) lu;
        Gc0 gc0T = c2736Rs.t();
        int iQ = c2736Rs.q();
        Object objM = gc0T.q() ? null : gc0T.m(iQ);
        int iB = (c2736Rs.z() || gc0T.q()) ? -1 : gc0T.f(iQ, ec0).b(Ug0.L(c2736Rs.r()) - ec0.g());
        for (int i = 0; i < ac.size(); i++) {
            C5186zO c5186zO2 = (C5186zO) ac.get(i);
            if (c(c5186zO2, objM, c2736Rs.z(), c2736Rs.n(), c2736Rs.o(), iB)) {
                return c5186zO2;
            }
        }
        if (ac.isEmpty() && c5186zO != null) {
            if (c(c5186zO, objM, c2736Rs.z(), c2736Rs.n(), c2736Rs.o(), iB)) {
                return c5186zO;
            }
        }
        return null;
    }

    public static boolean c(C5186zO c5186zO, Object obj, boolean z, int i, int i2, int i3) {
        if (!c5186zO.f4977a.equals(obj)) {
            return false;
        }
        int i4 = c5186zO.b;
        return (z && i4 == i && c5186zO.c == i2) || (!z && i4 == -1 && c5186zO.e == i3);
    }

    public final void a(EC ec, C5186zO c5186zO, Gc0 gc0) {
        if (c5186zO == null) {
            return;
        }
        if (gc0.b(c5186zO.f4977a) != -1) {
            ec.b(c5186zO, gc0);
            return;
        }
        Gc0 gc1 = (Gc0) this.c.get(c5186zO);
        if (gc1 != null) {
            ec.b(c5186zO, gc1);
        }
    }

    public final void d(Gc0 gc0) {
        EC ecA = FC.a();
        if (this.b.isEmpty()) {
            a(ecA, this.e, gc0);
            if (!FW.B(this.f, this.e)) {
                a(ecA, this.f, gc0);
            }
            if (!FW.B(this.d, this.e) && !FW.B(this.d, this.f)) {
                a(ecA, this.d, gc0);
            }
        } else {
            for (int i = 0; i < this.b.size(); i++) {
                a(ecA, (C5186zO) this.b.get(i), gc0);
            }
            if (!this.b.contains(this.d)) {
                a(ecA, this.d, gc0);
            }
        }
        this.c = ecA.a();
    }
}
