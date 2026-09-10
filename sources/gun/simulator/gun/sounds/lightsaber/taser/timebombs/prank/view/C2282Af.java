package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Af, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2282Af implements W20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final W20 f2826a;
    public boolean b;
    public final /* synthetic */ C2308Bf c;

    public C2282Af(C2308Bf c2308Bf, W20 w20) {
        this.c = c2308Bf;
        this.f2826a = w20;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.W20
    public final int a(C3692iN c3692iN, C2677Pl c2677Pl, int i) {
        C2308Bf c2308Bf = this.c;
        if (c2308Bf.a()) {
            return -3;
        }
        if (this.b) {
            c2677Pl.b = 4;
            return -4;
        }
        int iA = this.f2826a.a(c3692iN, c2677Pl, i);
        if (iA != -5) {
            long j = c2308Bf.f;
            if (j == Long.MIN_VALUE || ((iA != -4 || c2677Pl.f < j) && !(iA == -3 && c2308Bf.getBufferedPositionUs() == Long.MIN_VALUE && !c2677Pl.e))) {
                return iA;
            }
            c2677Pl.e();
            c2677Pl.b = 4;
            this.b = true;
            return -4;
        }
        C4619sw c4619sw = (C4619sw) c3692iN.c;
        c4619sw.getClass();
        int i2 = c4619sw.C;
        int i3 = c4619sw.B;
        if (i3 != 0 || i2 != 0) {
            if (c2308Bf.e != 0) {
                i3 = 0;
            }
            if (c2308Bf.f != Long.MIN_VALUE) {
                i2 = 0;
            }
            C4531rw c4531rwA = c4619sw.a();
            c4531rwA.A = i3;
            c4531rwA.B = i2;
            c3692iN.c = c4531rwA.a();
        }
        return -5;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.W20
    public final boolean isReady() {
        return !this.c.a() && this.f2826a.isReady();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.W20
    public final void maybeThrowError() {
        this.f2826a.maybeThrowError();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.W20
    public final int skipData(long j) {
        if (this.c.a()) {
            return -3;
        }
        return this.f2826a.skipData(j);
    }
}
