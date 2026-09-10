package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.aq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3031aq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4145a;
    public final C5186zO b;
    public final CopyOnWriteArrayList c;

    public C3031aq(CopyOnWriteArrayList copyOnWriteArrayList, int i, C5186zO c5186zO) {
        this.c = copyOnWriteArrayList;
        this.f4145a = i;
        this.b = c5186zO;
    }

    public final void a() {
        for (C2941Zp c2941Zp : this.c) {
            Ug0.P(c2941Zp.f4094a, new RunnableC2915Yp(this, c2941Zp.b, 3));
        }
    }

    public final void b() {
        for (C2941Zp c2941Zp : this.c) {
            Ug0.P(c2941Zp.f4094a, new RunnableC2915Yp(this, c2941Zp.b, 1));
        }
    }

    public final void c() {
        for (C2941Zp c2941Zp : this.c) {
            Ug0.P(c2941Zp.f4094a, new RunnableC2915Yp(this, c2941Zp.b, 2));
        }
    }

    public final void d(int i) {
        for (C2941Zp c2941Zp : this.c) {
            Ug0.P(c2941Zp.f4094a, new RunnableC2602Mo(this, c2941Zp.b, i, 2));
        }
    }

    public final void e(Exception exc) {
        for (C2941Zp c2941Zp : this.c) {
            Ug0.P(c2941Zp.f4094a, new RunnableC4746uO(this, c2941Zp.b, exc, 3));
        }
    }

    public final void f() {
        for (C2941Zp c2941Zp : this.c) {
            Ug0.P(c2941Zp.f4094a, new RunnableC2915Yp(this, c2941Zp.b, 0));
        }
    }
}
