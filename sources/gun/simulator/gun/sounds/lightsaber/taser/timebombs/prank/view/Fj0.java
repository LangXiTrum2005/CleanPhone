package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: loaded from: classes2.dex */
public final class Fj0 implements Ej0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC4353pt f3083a;
    public final InterfaceC4326pd0 b;
    public final C3219d0 c;
    public final C4619sw d;
    public final int e;
    public long f;
    public int g;
    public long h;

    public Fj0(InterfaceC4353pt interfaceC4353pt, InterfaceC4326pd0 interfaceC4326pd0, C3219d0 c3219d0, String str, int i) throws KT {
        this.f3083a = interfaceC4353pt;
        this.b = interfaceC4326pd0;
        this.c = c3219d0;
        int i2 = (c3219d0.c * c3219d0.g) / 8;
        if (c3219d0.f != i2) {
            StringBuilder sbQ = AbstractC5044xl.q("Expected block size: ", i2, "; got: ");
            sbQ.append(c3219d0.f);
            throw KT.a(sbQ.toString(), null);
        }
        int i3 = c3219d0.d * i2;
        int i4 = i3 * 8;
        int iMax = Math.max(i2, i3 / 10);
        this.e = iMax;
        C4531rw c4531rw = new C4531rw();
        c4531rw.k = str;
        c4531rw.f = i4;
        c4531rw.g = i4;
        c4531rw.l = iMax;
        c4531rw.x = c3219d0.c;
        c4531rw.y = c3219d0.d;
        c4531rw.z = i;
        this.d = new C4619sw(c4531rw);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ej0
    public final boolean a(InterfaceC4265ot interfaceC4265ot, long j) {
        int i;
        int i2;
        long j2 = j;
        while (j2 > 0 && (i = this.g) < (i2 = this.e)) {
            int iC = this.b.c(interfaceC4265ot, (int) Math.min(i2 - i, j2), true);
            if (iC == -1) {
                j2 = 0;
            } else {
                this.g += iC;
                j2 -= (long) iC;
            }
        }
        C3219d0 c3219d0 = this.c;
        int i3 = c3219d0.f;
        int i4 = this.g / i3;
        if (i4 > 0) {
            long jR = this.f + Ug0.R(this.h, 1000000L, c3219d0.d);
            int i5 = i4 * i3;
            int i6 = this.g - i5;
            this.b.a(jR, 1, i5, i6, null);
            this.h += (long) i4;
            this.g = i6;
        }
        return j2 <= 0;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ej0
    public final void b(int i, long j) {
        this.f3083a.a(new Hj0(this.c, 1, i, j));
        this.b.e(this.d);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ej0
    public final void c(long j) {
        this.f = j;
        this.g = 0;
        this.h = 0L;
    }
}
