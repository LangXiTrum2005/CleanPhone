package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Fn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2420Fn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3087a;
    public int b;
    public long c;
    public final C5186zO d;
    public boolean e;
    public boolean f;
    public final /* synthetic */ C2446Gn g;

    public C2420Fn(C2446Gn c2446Gn, String str, int i, C5186zO c5186zO) {
        this.g = c2446Gn;
        this.f3087a = str;
        this.b = i;
        this.c = c5186zO == null ? -1L : c5186zO.d;
        if (c5186zO == null || !c5186zO.a()) {
            return;
        }
        this.d = c5186zO;
    }

    public final boolean a(C3403f4 c3403f4) {
        C5186zO c5186zO = c3403f4.d;
        if (c5186zO == null) {
            return this.b != c3403f4.c;
        }
        long j = this.c;
        if (j == -1) {
            return false;
        }
        if (c5186zO.d > j) {
            return true;
        }
        C5186zO c5186zO2 = this.d;
        if (c5186zO2 == null) {
            return false;
        }
        Gc0 gc0 = c3403f4.b;
        int iB = gc0.b(c5186zO.f4977a);
        int iB2 = gc0.b(c5186zO2.f4977a);
        if (c5186zO.d < c5186zO2.d || iB < iB2) {
            return false;
        }
        if (iB > iB2) {
            return true;
        }
        boolean zA = c5186zO.a();
        int i = c5186zO2.b;
        if (!zA) {
            int i2 = c5186zO.e;
            return i2 == -1 || i2 > i;
        }
        int i3 = c5186zO.b;
        if (i3 > i) {
            return true;
        }
        if (i3 == i) {
            if (c5186zO.c > c5186zO2.c) {
                return true;
            }
        }
        return false;
    }

    public final boolean b(Gc0 gc0, Gc0 gc1) {
        int i = this.b;
        if (i < gc0.p()) {
            C2446Gn c2446Gn = this.g;
            gc0.o(i, c2446Gn.f3139a);
            Fc0 fc0 = c2446Gn.f3139a;
            int i2 = fc0.o;
            while (true) {
                if (i2 > fc0.p) {
                    i = -1;
                    break;
                }
                int iB = gc1.b(gc0.m(i2));
                if (iB != -1) {
                    i = gc1.g(iB, c2446Gn.b, false).c;
                    break;
                }
                i2++;
            }
        } else if (i >= gc1.p()) {
            i = -1;
            break;
        }
        this.b = i;
        if (i == -1) {
            return false;
        }
        C5186zO c5186zO = this.d;
        return c5186zO == null || gc1.b(c5186zO.f4977a) != -1;
    }
}
