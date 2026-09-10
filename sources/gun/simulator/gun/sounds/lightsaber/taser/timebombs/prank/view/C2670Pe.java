package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Pe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2670Pe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC4326pd0 f3561a;
    public final int b;
    public final int c;
    public final long d;
    public final int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public long[] k;
    public int[] l;

    public C2670Pe(int i, int i2, long j, int i3, InterfaceC4326pd0 interfaceC4326pd0) {
        boolean z = true;
        if (i2 != 1 && i2 != 2) {
            z = false;
        }
        FW.h(z);
        this.d = j;
        this.e = i3;
        this.f3561a = interfaceC4326pd0;
        int i4 = (((i % 10) + 48) << 8) | ((i / 10) + 48);
        this.b = (i2 == 2 ? 1667497984 : 1651965952) | i4;
        this.c = i2 == 2 ? i4 | 1650720768 : -1;
        this.k = new long[512];
        this.l = new int[512];
    }

    public final Q30 a(int i) {
        return new Q30(((this.d * ((long) 1)) / ((long) this.e)) * ((long) this.l[i]), this.k[i]);
    }

    public final N30 b(long j) {
        int i = (int) (j / ((this.d * ((long) 1)) / ((long) this.e)));
        int iE = Ug0.e(this.l, i, true, true);
        if (this.l[iE] == i) {
            Q30 q30A = a(iE);
            return new N30(q30A, q30A);
        }
        Q30 q30A2 = a(iE);
        int i2 = iE + 1;
        return i2 < this.k.length ? new N30(q30A2, a(i2)) : new N30(q30A2, q30A2);
    }
}
