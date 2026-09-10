package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.a3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2959a3 extends T9 {
    public final F8 g;
    public final long h;
    public final long i;
    public final long j;
    public final int k;
    public final int l;
    public final float m;
    public final float n;
    public final AC o;
    public final InterfaceC2412Ff p;
    public float q;
    public int r;
    public int s;
    public long t;
    public AbstractC3866kN u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2959a3(C3974ld0 c3974ld0, int[] iArr, int i, F8 f8, long j, long j2, long j3, AC ac) {
        super(c3974ld0, iArr);
        Oa0 oa0 = InterfaceC2412Ff.f3077a;
        if (j3 < j) {
            AbstractC4038mJ.f();
            j3 = j;
        }
        this.g = f8;
        this.h = j * 1000;
        this.i = j2 * 1000;
        this.j = j3 * 1000;
        this.k = 1279;
        this.l = 719;
        this.m = 0.7f;
        this.n = 0.75f;
        this.o = AC.j(ac);
        this.p = oa0;
        this.q = 1.0f;
        this.s = 0;
        this.t = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
    }

    public static C3965lY h(C3123bt[] c3123btArr) {
        int i;
        int i2;
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        while (true) {
            i = 1;
            if (i3 >= c3123btArr.length) {
                break;
            }
            C3123bt c3123bt = c3123btArr[i3];
            if (c3123bt == null || c3123bt.b.length <= 1) {
                arrayList.add(null);
            } else {
                C4998xC c4998xCI = AC.i();
                c4998xCI.H0(new Z2(0L, 0L));
                arrayList.add(c4998xCI);
            }
            i3++;
        }
        int length = c3123btArr.length;
        long[][] jArr = new long[length][];
        for (int i4 = 0; i4 < c3123btArr.length; i4++) {
            C3123bt c3123bt2 = c3123btArr[i4];
            if (c3123bt2 == null) {
                jArr[i4] = new long[0];
            } else {
                int[] iArr = c3123bt2.b;
                jArr[i4] = new long[iArr.length];
                for (int i5 = 0; i5 < iArr.length; i5++) {
                    long j = c3123bt2.f4193a.d[iArr[i5]].h;
                    long[] jArr2 = jArr[i4];
                    if (j == -1) {
                        j = 0;
                    }
                    jArr2[i5] = j;
                }
                Arrays.sort(jArr[i4]);
            }
        }
        int[] iArr2 = new int[length];
        long[] jArr3 = new long[length];
        for (int i6 = 0; i6 < length; i6++) {
            long[] jArr4 = jArr[i6];
            jArr3[i6] = jArr4.length == 0 ? 0L : jArr4[0];
        }
        i(arrayList, jArr3);
        C4222oR c4222oR = C4222oR.f4790a;
        c4222oR.getClass();
        C3695iQ c3695iQG0 = new C3431fQ(c4222oR).j().G0();
        int i7 = 0;
        while (i7 < length) {
            long[] jArr5 = jArr[i7];
            if (jArr5.length <= i) {
                i2 = length;
            } else {
                int length2 = jArr5.length;
                double[] dArr = new double[length2];
                int i8 = 0;
                while (true) {
                    long[] jArr6 = jArr[i7];
                    double dLog = 0.0d;
                    if (i8 >= jArr6.length) {
                        break;
                    }
                    int i9 = length;
                    long j2 = jArr6[i8];
                    if (j2 != -1) {
                        dLog = Math.log(j2);
                    }
                    dArr[i8] = dLog;
                    i8++;
                    length = i9;
                }
                i2 = length;
                int i10 = length2 - 1;
                double d = dArr[i10] - dArr[0];
                int i11 = 0;
                while (i11 < i10) {
                    double d2 = dArr[i11];
                    i11++;
                    c3695iQG0.h(Double.valueOf(d == 0.0d ? 1.0d : (((d2 + dArr[i11]) * 0.5d) - dArr[0]) / d), Integer.valueOf(i7));
                }
            }
            i7++;
            length = i2;
            i = 1;
        }
        AC acJ = AC.j(c3695iQG0.i());
        for (int i12 = 0; i12 < acJ.size(); i12++) {
            int iIntValue = ((Integer) acJ.get(i12)).intValue();
            int i13 = iArr2[iIntValue] + 1;
            iArr2[iIntValue] = i13;
            jArr3[iIntValue] = jArr[iIntValue][i13];
            i(arrayList, jArr3);
        }
        for (int i14 = 0; i14 < c3123btArr.length; i14++) {
            if (arrayList.get(i14) != null) {
                jArr3[i14] = jArr3[i14] * 2;
            }
        }
        i(arrayList, jArr3);
        C4998xC c4998xCI2 = AC.i();
        for (int i15 = 0; i15 < arrayList.size(); i15++) {
            C4998xC c4998xC = (C4998xC) arrayList.get(i15);
            c4998xCI2.H0(c4998xC == null ? AC.n() : c4998xC.J0());
        }
        return c4998xCI2.J0();
    }

    public static void i(ArrayList arrayList, long[] jArr) {
        long j = 0;
        for (long j2 : jArr) {
            j += j2;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            C4998xC c4998xC = (C4998xC) arrayList.get(i);
            if (c4998xC != null) {
                c4998xC.H0(new Z2(j, jArr[i]));
            }
        }
    }

    public static long k(List list) {
        if (list.isEmpty()) {
            return com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        }
        AbstractC3866kN abstractC3866kN = (AbstractC3866kN) FW.H(list);
        long j = abstractC3866kN.g;
        if (j == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
            return com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        }
        long j2 = abstractC3866kN.h;
        return j2 != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET ? j2 - j : com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0049  */
    /* JADX WARN: Code duplicated, block: B:19:0x0053  */
    /* JADX WARN: Code duplicated, block: B:21:0x005c  */
    /* JADX WARN: Code duplicated, block: B:22:0x005e  */
    /* JADX WARN: Code duplicated, block: B:24:0x006c  */
    /* JADX WARN: Code duplicated, block: B:27:0x007f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0091  */
    /* JADX WARN: Code duplicated, block: B:32:0x0095  */
    /* JADX WARN: Code duplicated, block: B:33:0x0098  */
    /* JADX WARN: Code duplicated, block: B:46:0x00bb  */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3299dt
    public final void c(long j, long j2, long j3, List list, InterfaceC3954lN[] interfaceC3954lNArr) {
        long jK;
        long jI;
        long jG;
        int i;
        int i2;
        int iD;
        int iJ;
        long jMin;
        int i3;
        int i4;
        long j4;
        ((Oa0) this.p).getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int i5 = this.r;
        if (i5 >= interfaceC3954lNArr.length || !interfaceC3954lNArr[i5].next()) {
            int length = interfaceC3954lNArr.length;
            int i6 = 0;
            while (true) {
                if (i6 >= length) {
                    jK = k(list);
                    break;
                }
                InterfaceC3954lN interfaceC3954lN = interfaceC3954lNArr[i6];
                if (interfaceC3954lN.next()) {
                    jI = interfaceC3954lN.i();
                    jG = interfaceC3954lN.g();
                } else {
                    i6++;
                }
            }
            i = this.s;
            if (i == 0) {
                this.s = 1;
                this.r = j(jElapsedRealtime);
                return;
            }
            i2 = this.r;
            if (list.isEmpty()) {
                iD = -1;
            } else {
                iD = d(((AbstractC3866kN) FW.H(list)).d);
            }
            if (iD != -1) {
                i = ((AbstractC3866kN) FW.H(list)).e;
                i2 = iD;
            }
            iJ = j(jElapsedRealtime);
            if (!a(i2, jElapsedRealtime)) {
                C4619sw[] c4619swArr = this.d;
                C4619sw c4619sw = c4619swArr[i2];
                C4619sw c4619sw2 = c4619swArr[iJ];
                jMin = this.h;
                if (j3 != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                    if (jK != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                        j4 = j3 - jK;
                    } else {
                        j4 = j3;
                    }
                    jMin = Math.min((long) (j4 * this.n), jMin);
                }
                i3 = c4619sw2.h;
                i4 = c4619sw.h;
                if ((i3 <= i4 && j2 < jMin) || (i3 < i4 && j2 >= this.i)) {
                }
            }
            if (iJ != i2) {
                i = 3;
            }
            this.s = i;
            this.r = iJ;
        }
        InterfaceC3954lN interfaceC3954lN2 = interfaceC3954lNArr[this.r];
        jI = interfaceC3954lN2.i();
        jG = interfaceC3954lN2.g();
        jK = jI - jG;
        i = this.s;
        if (i == 0) {
            this.s = 1;
            this.r = j(jElapsedRealtime);
            return;
        }
        i2 = this.r;
        if (list.isEmpty()) {
            iD = -1;
        } else {
            iD = d(((AbstractC3866kN) FW.H(list)).d);
        }
        if (iD != -1) {
            i = ((AbstractC3866kN) FW.H(list)).e;
            i2 = iD;
        }
        iJ = j(jElapsedRealtime);
        if (!a(i2, jElapsedRealtime)) {
            C4619sw[] c4619swArr2 = this.d;
            C4619sw c4619sw3 = c4619swArr2[i2];
            C4619sw c4619sw4 = c4619swArr2[iJ];
            jMin = this.h;
            if (j3 != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                if (jK != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                    j4 = j3 - jK;
                } else {
                    j4 = j3;
                }
                jMin = Math.min((long) (j4 * this.n), jMin);
            }
            i3 = c4619sw4.h;
            i4 = c4619sw3.h;
            iJ = i3 <= i4 ? i2 : i2;
        }
        if (iJ != i2) {
            i = 3;
        }
        this.s = i;
        this.r = iJ;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.T9, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3299dt
    public final void disable() {
        this.u = null;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.T9, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3299dt
    public final void enable() {
        this.t = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        this.u = null;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.T9, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3299dt
    public final int evaluateQueueSize(long j, List list) {
        int i;
        int i2;
        ((Oa0) this.p).getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j2 = this.t;
        if (j2 != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET && jElapsedRealtime - j2 < 1000 && (list.isEmpty() || ((AbstractC3866kN) FW.H(list)).equals(this.u))) {
            return list.size();
        }
        this.t = jElapsedRealtime;
        this.u = list.isEmpty() ? null : (AbstractC3866kN) FW.H(list);
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long jA = Ug0.A(((AbstractC3866kN) list.get(size - 1)).g - j, this.q);
        long j3 = this.j;
        if (jA < j3) {
            return size;
        }
        k(list);
        C4619sw c4619sw = this.d[j(jElapsedRealtime)];
        for (int i3 = 0; i3 < size; i3++) {
            AbstractC3866kN abstractC3866kN = (AbstractC3866kN) list.get(i3);
            C4619sw c4619sw2 = abstractC3866kN.d;
            if (Ug0.A(abstractC3866kN.g - j, this.q) >= j3 && c4619sw2.h < c4619sw.h && (i = c4619sw2.r) != -1 && i <= this.l && (i2 = c4619sw2.q) != -1 && i2 <= this.k && i < c4619sw.r) {
                return i3;
            }
        }
        return size;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3299dt
    public final int getSelectedIndex() {
        return this.r;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3299dt
    public final Object getSelectionData() {
        return null;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3299dt
    public final int getSelectionReason() {
        return this.s;
    }

    public final int j(long j) {
        long j2;
        C2419Fm c2419Fm = (C2419Fm) this.g;
        synchronized (c2419Fm) {
            j2 = c2419Fm.l;
        }
        long j3 = (long) (j2 * this.m);
        this.g.getClass();
        long j4 = (long) (j3 / this.q);
        if (!this.o.isEmpty()) {
            int i = 1;
            while (i < this.o.size() - 1 && ((Z2) this.o.get(i)).f4053a < j4) {
                i++;
            }
            Z2 z2 = (Z2) this.o.get(i - 1);
            Z2 z3 = (Z2) this.o.get(i);
            long j5 = z2.f4053a;
            float f = (j4 - j5) / (z3.f4053a - j5);
            long j6 = z2.b;
            j4 = j6 + ((long) (f * (z3.b - j6)));
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.b; i3++) {
            if (j == Long.MIN_VALUE || !a(i3, j)) {
                if (getFormat(i3).h <= j4) {
                    return i3;
                }
                i2 = i3;
            }
        }
        return i2;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.T9, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3299dt
    public final void onPlaybackSpeed(float f) {
        this.q = f;
    }
}
