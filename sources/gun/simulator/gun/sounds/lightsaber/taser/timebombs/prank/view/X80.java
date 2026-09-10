package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class X80 implements InterfaceC4395qO, InterfaceC4897w40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2497Im f3959a;
    public final Bd0 b;
    public final PI c;
    public final InterfaceC3296dq d;
    public final C3031aq e;
    public final G7 f;
    public final DO g;
    public final C2833Vl h;
    public final C4062md0 i;
    public final C4710tz j;
    public InterfaceC4307pO k;
    public R80 l;
    public C2748Se[] m;
    public Wm0 n;

    public X80(R80 r80, C2497Im c2497Im, Bd0 bd0, C4710tz c4710tz, InterfaceC3296dq interfaceC3296dq, C3031aq c3031aq, G7 g7, DO r9, PI pi, C2833Vl c2833Vl) {
        this.l = r80;
        this.f3959a = c2497Im;
        this.b = bd0;
        this.c = pi;
        this.d = interfaceC3296dq;
        this.e = c3031aq;
        this.f = g7;
        this.g = r9;
        this.h = c2833Vl;
        this.j = c4710tz;
        C3974ld0[] c3974ld0Arr = new C3974ld0[r80.f.length];
        int i = 0;
        while (true) {
            Q80[] q80Arr = r80.f;
            if (i >= q80Arr.length) {
                this.i = new C4062md0(c3974ld0Arr);
                C2748Se[] c2748SeArr = new C2748Se[0];
                this.m = c2748SeArr;
                c4710tz.getClass();
                this.n = C4710tz.i(c2748SeArr);
                return;
            }
            C4619sw[] c4619swArr = q80Arr[i].j;
            C4619sw[] c4619swArr2 = new C4619sw[c4619swArr.length];
            for (int i2 = 0; i2 < c4619swArr.length; i2++) {
                C4619sw c4619sw = c4619swArr[i2];
                int iG = interfaceC3296dq.g(c4619sw);
                C4531rw c4531rwA = c4619sw.a();
                c4531rwA.F = iG;
                c4619swArr2[i2] = c4531rwA.a();
            }
            c3974ld0Arr[i] = new C3974ld0(Integer.toString(i), c4619swArr2);
            i++;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4395qO
    public final long b(long j, P30 p30) {
        for (C2748Se c2748Se : this.m) {
            if (c2748Se.f3724a == 2) {
                return c2748Se.e.b(j, p30);
            }
        }
        return j;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4985x40
    public final boolean continueLoading(long j) {
        return this.n.continueLoading(j);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4985x40
    public final long getBufferedPositionUs() {
        return this.n.getBufferedPositionUs();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4985x40
    public final long getNextLoadPositionUs() {
        return this.n.getNextLoadPositionUs();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4395qO
    public final C4062md0 getTrackGroups() {
        return this.i;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4985x40
    public final boolean isLoading() {
        return this.n.isLoading();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4395qO
    public final long k(InterfaceC3299dt[] interfaceC3299dtArr, boolean[] zArr, W20[] w20Arr, boolean[] zArr2, long j) {
        int i;
        InterfaceC3299dt interfaceC3299dt;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (i2 < interfaceC3299dtArr.length) {
            W20 w20 = w20Arr[i2];
            if (w20 != null) {
                C2748Se c2748Se = (C2748Se) w20;
                InterfaceC3299dt interfaceC3299dt2 = interfaceC3299dtArr[i2];
                if (interfaceC3299dt2 == null || !zArr[i2]) {
                    c2748Se.m(null);
                    w20Arr[i2] = null;
                } else {
                    ((C2705Qn) c2748Se.e).e = interfaceC3299dt2;
                    arrayList.add(c2748Se);
                }
            }
            if (w20Arr[i2] != null || (interfaceC3299dt = interfaceC3299dtArr[i2]) == null) {
                i = i2;
            } else {
                int iB = this.i.b(interfaceC3299dt.getTrackGroup());
                R80 r80 = this.l;
                InterfaceC4429ql interfaceC4429qlCreateDataSource = this.f3959a.f3238a.createDataSource();
                Bd0 bd0 = this.b;
                if (bd0 != null) {
                    interfaceC4429qlCreateDataSource.c(bd0);
                }
                i = i2;
                C2748Se c2748Se2 = new C2748Se(this.l.f[iB].f3592a, null, null, new C2705Qn(this.c, r80, iB, interfaceC3299dt, interfaceC4429qlCreateDataSource), this, this.h, j, this.d, this.e, this.f, this.g);
                arrayList.add(c2748Se2);
                w20Arr[i] = c2748Se2;
                zArr2[i] = true;
            }
            i2 = i + 1;
        }
        C2748Se[] c2748SeArr = new C2748Se[arrayList.size()];
        this.m = c2748SeArr;
        arrayList.toArray(c2748SeArr);
        C2748Se[] c2748SeArr2 = this.m;
        this.j.getClass();
        this.n = C4710tz.i(c2748SeArr2);
        return j;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4395qO
    public final void maybeThrowPrepareError() {
        this.c.maybeThrowError();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4897w40
    public final void o(InterfaceC4985x40 interfaceC4985x40) {
        this.k.o(this);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4395qO
    public final void q(long j) {
        for (C2748Se c2748Se : this.m) {
            c2748Se.q(j);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4395qO
    public final void r(InterfaceC4307pO interfaceC4307pO, long j) {
        this.k = interfaceC4307pO;
        interfaceC4307pO.p(this);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4395qO
    public final long readDiscontinuity() {
        return com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4985x40
    public final void reevaluateBuffer(long j) {
        this.n.reevaluateBuffer(j);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4395qO
    public final long seekToUs(long j) {
        for (C2748Se c2748Se : this.m) {
            c2748Se.n(j);
        }
        return j;
    }
}
