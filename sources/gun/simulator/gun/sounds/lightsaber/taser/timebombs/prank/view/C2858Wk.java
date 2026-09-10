package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.List;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Wk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2858Wk extends Gc0 {
    public final long e;
    public final long f;
    public final long g;
    public final int h;
    public final long i;
    public final long j;
    public final long k;
    public final C2676Pk l;
    public final C3693iO m;
    public final C3164cO n;

    public C2858Wk(long j, long j2, long j3, int i, long j4, long j5, long j6, C2676Pk c2676Pk, C3693iO c3693iO, C3164cO c3164cO) {
        FW.s(c2676Pk.d == (c3164cO != null));
        this.e = j;
        this.f = j2;
        this.g = j3;
        this.h = i;
        this.i = j4;
        this.j = j5;
        this.k = j6;
        this.l = c2676Pk;
        this.m = c3693iO;
        this.n = c3164cO;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Gc0
    public final int b(Object obj) {
        int iIntValue;
        if ((obj instanceof Integer) && (iIntValue = ((Integer) obj).intValue() - this.h) >= 0 && iIntValue < i()) {
            return iIntValue;
        }
        return -1;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Gc0
    public final Ec0 g(int i, Ec0 ec0, boolean z) {
        FW.m(i, i());
        C2676Pk c2676Pk = this.l;
        String str = z ? c2676Pk.a(i).f4271a : null;
        Integer numValueOf = z ? Integer.valueOf(this.h + i) : null;
        long jC = c2676Pk.c(i);
        long jL = Ug0.L(c2676Pk.a(i).b - c2676Pk.a(0).b) - this.i;
        ec0.getClass();
        ec0.i(str, numValueOf, 0, jC, jL, C2.g, false);
        return ec0;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Gc0
    public final int i() {
        return this.l.m.size();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Gc0
    public final Object m(int i) {
        FW.m(i, i());
        return Integer.valueOf(this.h + i);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0027 A[PHI: r7
  0x0027: PHI (r7v4 long) = (r7v0 long), (r7v1 long), (r7v1 long), (r7v1 long) binds: [B:11:0x0025, B:32:0x007c, B:35:0x0093, B:37:0x009d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:18:0x003d A[PHI: r7
  0x003d: PHI (r7v1 long) = (r7v0 long), (r7v2 long) binds: [B:14:0x002f, B:16:0x0037] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:27:0x0068  */
    /* JADX WARN: Code duplicated, block: B:30:0x0076 A[LOOP:1: B:25:0x0065->B:30:0x0076, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:52:0x007b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x007c A[EDGE_INSN: B:53:0x007c->B:32:0x007c BREAK  A[LOOP:1: B:25:0x0065->B:30:0x0076], SYNTHETIC] */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Gc0
    public final Fc0 n(int i, Fc0 fc0, long j) {
        long j2;
        long jC;
        int i2;
        List list;
        int size;
        int i3;
        InterfaceC3021al interfaceC3021alB;
        long timeUs;
        FW.m(i, 1);
        C2676Pk c2676Pk = this.l;
        boolean z = c2676Pk.d && c2676Pk.e != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET && c2676Pk.b == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        long j3 = this.k;
        if (!z) {
            timeUs = j3;
        } else if (j > 0) {
            j3 += j;
            if (j3 > this.j) {
                timeUs = -9223372036854775807L;
            } else {
                j2 = this.i + j3;
                jC = c2676Pk.c(0);
                i2 = 0;
                while (i2 < c2676Pk.m.size() - 1 && j2 >= jC) {
                    j2 -= jC;
                    i2++;
                    jC = c2676Pk.c(i2);
                }
                C3259dU c3259dUA = c2676Pk.a(i2);
                list = c3259dUA.c;
                size = list.size();
                i3 = 0;
                while (true) {
                    if (i3 < size) {
                        i3 = -1;
                        break;
                    }
                    if (((X2) list.get(i3)).b == 2) {
                        break;
                    }
                    i3++;
                }
                if (i3 != -1 || (interfaceC3021alB = ((FY) ((X2) c3259dUA.c.get(i3)).c.get(0)).b()) == null || interfaceC3021alB.m(jC) == 0) {
                    timeUs = j3;
                } else {
                    timeUs = (interfaceC3021alB.getTimeUs(interfaceC3021alB.h(j2, jC)) + j3) - j2;
                }
            }
        } else {
            j2 = this.i + j3;
            jC = c2676Pk.c(0);
            i2 = 0;
            while (i2 < c2676Pk.m.size() - 1) {
                j2 -= jC;
                i2++;
                jC = c2676Pk.c(i2);
            }
            C3259dU c3259dUA2 = c2676Pk.a(i2);
            list = c3259dUA2.c;
            size = list.size();
            i3 = 0;
            while (true) {
                if (i3 < size) {
                    i3 = -1;
                    break;
                }
                if (((X2) list.get(i3)).b == 2) {
                    break;
                    break;
                }
                i3++;
            }
            if (i3 != -1) {
                timeUs = j3;
            } else {
                timeUs = (interfaceC3021alB.getTimeUs(interfaceC3021alB.h(j2, jC)) + j3) - j2;
            }
        }
        fc0.b(Fc0.r, this.m, c2676Pk, this.e, this.f, this.g, true, c2676Pk.d && c2676Pk.e != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET && c2676Pk.b == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET, this.n, timeUs, this.j, 0, i() - 1, this.i);
        return fc0;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Gc0
    public final int p() {
        return 1;
    }
}
