package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Bf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2308Bf implements InterfaceC4395qO, InterfaceC4307pO {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC4395qO f2883a;
    public InterfaceC4307pO b;
    public C2282Af[] c = new C2282Af[0];
    public long d;
    public long e;
    public long f;
    public C2360Df g;

    public C2308Bf(InterfaceC4395qO interfaceC4395qO, boolean z, long j, long j2) {
        this.f2883a = interfaceC4395qO;
        this.d = z ? j : com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        this.e = j;
        this.f = j2;
    }

    public final boolean a() {
        return this.d != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4395qO
    public final long b(long j, P30 p30) {
        long j2 = this.e;
        if (j == j2) {
            return j2;
        }
        long jK = Ug0.k(p30.f3534a, 0L, j - j2);
        long j3 = this.f;
        long jK2 = Ug0.k(p30.b, 0L, j3 == Long.MIN_VALUE ? Long.MAX_VALUE : j3 - j);
        if (jK != p30.f3534a || jK2 != p30.b) {
            p30 = new P30(jK, jK2);
        }
        return this.f2883a.b(j, p30);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4985x40
    public final boolean continueLoading(long j) {
        return this.f2883a.continueLoading(j);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4985x40
    public final long getBufferedPositionUs() {
        long bufferedPositionUs = this.f2883a.getBufferedPositionUs();
        if (bufferedPositionUs != Long.MIN_VALUE) {
            long j = this.f;
            if (j == Long.MIN_VALUE || bufferedPositionUs < j) {
                return bufferedPositionUs;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4985x40
    public final long getNextLoadPositionUs() {
        long nextLoadPositionUs = this.f2883a.getNextLoadPositionUs();
        if (nextLoadPositionUs != Long.MIN_VALUE) {
            long j = this.f;
            if (j == Long.MIN_VALUE || nextLoadPositionUs < j) {
                return nextLoadPositionUs;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4395qO
    public final C4062md0 getTrackGroups() {
        return this.f2883a.getTrackGroups();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4985x40
    public final boolean isLoading() {
        return this.f2883a.isLoading();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x005d A[EDGE_INSN: B:23:0x005d->B:24:0x0062 BREAK  A[LOOP:1: B:16:0x0044->B:22:0x005a]] */
    /* JADX WARN: Code duplicated, block: B:34:0x007d  */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4395qO
    public final long k(InterfaceC3299dt[] interfaceC3299dtArr, boolean[] zArr, W20[] w20Arr, boolean[] zArr2, long j) {
        long j2;
        boolean z;
        this.c = new C2282Af[w20Arr.length];
        W20[] w20Arr2 = new W20[w20Arr.length];
        int i = 0;
        while (true) {
            W20 w20 = null;
            if (i >= w20Arr.length) {
                break;
            }
            C2282Af[] c2282AfArr = this.c;
            C2282Af c2282Af = (C2282Af) w20Arr[i];
            c2282AfArr[i] = c2282Af;
            if (c2282Af != null) {
                w20 = c2282Af.f2826a;
            }
            w20Arr2[i] = w20;
            i++;
        }
        long jK = this.f2883a.k(interfaceC3299dtArr, zArr, w20Arr2, zArr2, j);
        if (!a()) {
            j2 = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
            break;
        }
        long j3 = this.e;
        if (j != j3 || j3 == 0) {
            j2 = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
            break;
        }
        int length = interfaceC3299dtArr.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                j2 = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
                break;
            }
            InterfaceC3299dt interfaceC3299dt = interfaceC3299dtArr[i2];
            if (interfaceC3299dt != null) {
                C4619sw selectedFormat = interfaceC3299dt.getSelectedFormat();
                if (!AbstractC5011xP.a(selectedFormat.l, selectedFormat.i)) {
                    j2 = jK;
                    break;
                }
            }
            i2++;
        }
        this.d = j2;
        if (jK != j) {
            if (jK >= this.e) {
                long j4 = this.f;
                z = j4 == Long.MIN_VALUE || jK <= j4;
            }
        }
        FW.s(z);
        for (int i3 = 0; i3 < w20Arr.length; i3++) {
            W20 w21 = w20Arr2[i3];
            if (w21 == null) {
                this.c[i3] = null;
            } else {
                C2282Af[] c2282AfArr2 = this.c;
                C2282Af c2282Af2 = c2282AfArr2[i3];
                if (c2282Af2 == null || c2282Af2.f2826a != w21) {
                    c2282AfArr2[i3] = new C2282Af(this, w21);
                }
            }
            w20Arr[i3] = this.c[i3];
        }
        return jK;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4395qO
    public final void maybeThrowPrepareError() throws C2360Df {
        C2360Df c2360Df = this.g;
        if (c2360Df != null) {
            throw c2360Df;
        }
        this.f2883a.maybeThrowPrepareError();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4897w40
    public final void o(InterfaceC4985x40 interfaceC4985x40) {
        InterfaceC4307pO interfaceC4307pO = this.b;
        interfaceC4307pO.getClass();
        interfaceC4307pO.o(this);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4307pO
    public final void p(InterfaceC4395qO interfaceC4395qO) {
        if (this.g != null) {
            return;
        }
        InterfaceC4307pO interfaceC4307pO = this.b;
        interfaceC4307pO.getClass();
        interfaceC4307pO.p(this);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4395qO
    public final void q(long j) {
        this.f2883a.q(j);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4395qO
    public final void r(InterfaceC4307pO interfaceC4307pO, long j) {
        this.b = interfaceC4307pO;
        this.f2883a.r(this, j);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4395qO
    public final long readDiscontinuity() {
        if (a()) {
            long j = this.d;
            this.d = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
            long discontinuity = readDiscontinuity();
            return discontinuity != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET ? discontinuity : j;
        }
        long discontinuity2 = this.f2883a.readDiscontinuity();
        if (discontinuity2 == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
            return com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        }
        FW.s(discontinuity2 >= this.e);
        long j2 = this.f;
        FW.s(j2 == Long.MIN_VALUE || discontinuity2 <= j2);
        return discontinuity2;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4985x40
    public final void reevaluateBuffer(long j) {
        this.f2883a.reevaluateBuffer(j);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0033  */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4395qO
    public final long seekToUs(long j) {
        this.d = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        boolean z = false;
        for (C2282Af c2282Af : this.c) {
            if (c2282Af != null) {
                c2282Af.b = false;
            }
        }
        long jSeekToUs = this.f2883a.seekToUs(j);
        if (jSeekToUs == j) {
            z = true;
        } else if (jSeekToUs >= this.e) {
            long j2 = this.f;
            if (j2 == Long.MIN_VALUE || jSeekToUs <= j2) {
                z = true;
            }
        }
        FW.s(z);
        return jSeekToUs;
    }
}
