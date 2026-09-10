package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: loaded from: classes2.dex */
public abstract class L9 implements YU {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3341a;
    public C5196zY c;
    public int d;
    public WU e;
    public int f;
    public W20 g;
    public C4619sw[] h;
    public long i;
    public boolean k;
    public boolean l;
    public final C3692iN b = new C3692iN(28);
    public long j = Long.MIN_VALUE;

    public L9(int i) {
        this.f3341a = i;
    }

    public final C2321Bs b(int i, C4619sw c4619sw, Exception exc, boolean z) {
        int iU;
        if (c4619sw == null || this.l) {
            iU = 4;
        } else {
            this.l = true;
            try {
                iU = u(c4619sw) & 7;
                this.l = false;
            } catch (C2321Bs unused) {
                this.l = false;
                iU = 4;
            } catch (Throwable th) {
                this.l = false;
                throw th;
            }
        }
        return new C2321Bs(1, exc, i, e(), this.d, c4619sw, c4619sw == null ? 4 : iU, z);
    }

    public final C2321Bs c(DN dn, C4619sw c4619sw) {
        return b(4002, c4619sw, dn, false);
    }

    public InterfaceC4042mN d() {
        return null;
    }

    public abstract String e();

    public final boolean f() {
        return this.j == Long.MIN_VALUE;
    }

    public abstract boolean g();

    public abstract boolean h();

    public abstract void i();

    public abstract void k(long j, boolean z);

    public abstract void o(C4619sw[] c4619swArr, long j, long j2);

    public final int p(C3692iN c3692iN, C2677Pl c2677Pl, int i) {
        W20 w20 = this.g;
        w20.getClass();
        int iA = w20.a(c3692iN, c2677Pl, i);
        if (iA == -4) {
            if (c2677Pl.c(4)) {
                this.j = Long.MIN_VALUE;
                return this.k ? -4 : -3;
            }
            long j = c2677Pl.f + this.i;
            c2677Pl.f = j;
            this.j = Math.max(this.j, j);
        } else if (iA == -5) {
            C4619sw c4619sw = (C4619sw) c3692iN.c;
            c4619sw.getClass();
            long j2 = c4619sw.p;
            if (j2 != Long.MAX_VALUE) {
                C4531rw c4531rwA = c4619sw.a();
                c4531rwA.o = j2 + this.i;
                c3692iN.c = c4531rwA.a();
            }
        }
        return iA;
    }

    public abstract void q(long j, long j2);

    public final void r(C4619sw[] c4619swArr, W20 w20, long j, long j2) {
        FW.s(!this.k);
        this.g = w20;
        if (this.j == Long.MIN_VALUE) {
            this.j = j;
        }
        this.h = c4619swArr;
        this.i = j2;
        o(c4619swArr, j, j2);
    }

    public final void s() {
        FW.s(this.f == 0);
        this.b.m();
        l();
    }

    public abstract int u(C4619sw c4619sw);

    public int v() {
        return 0;
    }

    public void l() {
    }

    public void m() {
    }

    public void n() {
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.YU
    public void handleMessage(int i, Object obj) {
    }

    public void j(boolean z, boolean z2) {
    }

    public void t(float f, float f2) {
    }
}
