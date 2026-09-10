package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.os.SystemClock;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Lm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2575Lm implements InterfaceC2650Ok {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PI f3372a;
    public final C3844k50 b;
    public final int[] c;
    public final int d;
    public final InterfaceC4429ql e;
    public final long f;
    public final TU g;
    public final C2523Jm[] h;
    public InterfaceC3299dt i;
    public C2676Pk j;
    public int k;
    public C3529ga l;
    public boolean m;

    public C2575Lm(PI pi, C2676Pk c2676Pk, C3844k50 c3844k50, int i, int[] iArr, InterfaceC3299dt interfaceC3299dt, int i2, InterfaceC4429ql interfaceC4429ql, long j, boolean z, ArrayList arrayList, TU tu) {
        this.f3372a = pi;
        this.j = c2676Pk;
        this.b = c3844k50;
        this.c = iArr;
        this.i = interfaceC3299dt;
        this.d = i2;
        this.e = interfaceC4429ql;
        this.k = i;
        this.f = j;
        this.g = tu;
        long jC = c2676Pk.c(i);
        ArrayList arrayListA = a();
        this.h = new C2523Jm[interfaceC3299dt.length()];
        int i3 = 0;
        while (i3 < this.h.length) {
            FY fy = (FY) arrayListA.get(interfaceC3299dt.getIndexInTrackGroup(i3));
            U9 u9Q = c3844k50.q(fy.b);
            int i4 = i3;
            this.h[i4] = new C2523Jm(jC, fy, u9Q == null ? (U9) fy.b.get(0) : u9Q, C2911Yl.c(i2, fy.f3070a, z, arrayList, tu), 0L, fy.b());
            i3 = i4 + 1;
        }
    }

    public final ArrayList a() {
        List list = this.j.a(this.k).c;
        ArrayList arrayList = new ArrayList();
        for (int i : this.c) {
            arrayList.addAll(((X2) list.get(i)).c);
        }
        return arrayList;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2774Te
    public final long b(long j, P30 p30) {
        for (C2523Jm c2523Jm : this.h) {
            InterfaceC3021al interfaceC3021al = c2523Jm.d;
            if (interfaceC3021al != null) {
                long j2 = c2523Jm.e;
                long jH = interfaceC3021al.h(j, j2);
                long j3 = c2523Jm.f;
                long j4 = jH + j3;
                long jD = c2523Jm.d(j4);
                InterfaceC3021al interfaceC3021al2 = c2523Jm.d;
                long jM = interfaceC3021al2.m(j2);
                return p30.a(j, jD, (jD >= j || (jM != -1 && j4 >= ((interfaceC3021al2.u() + j3) + jM) - 1)) ? jD : c2523Jm.d(j4 + 1));
            }
        }
        return j;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2774Te
    public final boolean c(long j, AbstractC2567Le abstractC2567Le, List list) {
        if (this.l != null) {
            return false;
        }
        return this.i.b(j, abstractC2567Le, list);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2774Te
    public final void d(AbstractC2567Le abstractC2567Le) {
        if (abstractC2567Le instanceof C3594hD) {
            int iD = this.i.d(((C3594hD) abstractC2567Le).d);
            C2523Jm[] c2523JmArr = this.h;
            C2523Jm c2523Jm = c2523JmArr[iD];
            if (c2523Jm.d == null) {
                InterfaceC2618Ne interfaceC2618Ne = c2523Jm.f3282a;
                O30 o30 = ((C2589Mb) interfaceC2618Ne).h;
                C2644Oe c2644Oe = o30 instanceof C2644Oe ? (C2644Oe) o30 : null;
                if (c2644Oe != null) {
                    FY fy = c2523Jm.b;
                    c2523JmArr[iD] = new C2523Jm(c2523Jm.e, fy, c2523Jm.c, interfaceC2618Ne, c2523Jm.f, new FG(c2644Oe, fy.c));
                }
            }
        }
        TU tu = this.g;
        if (tu != null) {
            long j = tu.d;
            if (j == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET || abstractC2567Le.h > j) {
                tu.d = abstractC2567Le.h;
            }
            tu.e.g = true;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2774Te
    public final boolean e(AbstractC2567Le abstractC2567Le, boolean z, BR br, G7 g7) {
        long jMax;
        if (!z) {
            return false;
        }
        TU tu = this.g;
        if (tu != null) {
            long j = tu.d;
            boolean z2 = j != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET && j < abstractC2567Le.g;
            UU uu = tu.e;
            if (uu.f.d) {
                if (!uu.h) {
                    if (z2) {
                        if (uu.g) {
                            uu.h = true;
                            uu.g = false;
                            C2936Zk c2936Zk = (C2936Zk) uu.b.b;
                            c2936Zk.D.removeCallbacks(c2936Zk.w);
                            c2936Zk.y();
                        }
                    }
                }
                return true;
            }
        }
        boolean z3 = this.j.d;
        C2523Jm[] c2523JmArr = this.h;
        if (!z3 && (abstractC2567Le instanceof AbstractC3866kN)) {
            IOException iOException = (IOException) br.d;
            if ((iOException instanceof SA) && ((SA) iOException).d == 404) {
                C2523Jm c2523Jm = c2523JmArr[this.i.d(abstractC2567Le.d)];
                long jM = c2523Jm.d.m(c2523Jm.e);
                if (jM != -1 && jM != 0) {
                    if (((AbstractC3866kN) abstractC2567Le).a() > ((c2523Jm.d.u() + c2523Jm.f) + jM) - 1) {
                        this.m = true;
                        return true;
                    }
                }
            }
        }
        C2523Jm c2523Jm2 = c2523JmArr[this.i.d(abstractC2567Le.d)];
        AC ac = c2523Jm2.b.b;
        C3844k50 c3844k50 = this.b;
        U9 u9Q = c3844k50.q(ac);
        U9 u9 = c2523Jm2.c;
        if (u9Q != null && !u9.equals(u9Q)) {
            return true;
        }
        InterfaceC3299dt interfaceC3299dt = this.i;
        AC ac2 = c2523Jm2.b.b;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int length = interfaceC3299dt.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (interfaceC3299dt.a(i2, jElapsedRealtime)) {
                i++;
            }
        }
        HashSet hashSet = new HashSet();
        for (int i3 = 0; i3 < ac2.size(); i3++) {
            hashSet.add(Integer.valueOf(((U9) ac2.get(i3)).c));
        }
        int size = hashSet.size();
        HashSet hashSet2 = new HashSet();
        ArrayList arrayListB = c3844k50.b(ac2);
        for (int i4 = 0; i4 < arrayListB.size(); i4++) {
            hashSet2.add(Integer.valueOf(((U9) arrayListB.get(i4)).c));
        }
        C3483g0 c3483g0 = new C3483g0(size, size - hashSet2.size(), length, i);
        if (!c3483g0.a(2) && !c3483g0.a(1)) {
            return false;
        }
        g7.getClass();
        C2868Wu c2868WuY = G7.y(c3483g0, br);
        if (c2868WuY == null) {
            return false;
        }
        int i5 = c2868WuY.f3945a;
        if (!c3483g0.a(i5)) {
            return false;
        }
        long j2 = c2868WuY.b;
        if (i5 == 2) {
            InterfaceC3299dt interfaceC3299dt2 = this.i;
            return interfaceC3299dt2.blacklist(interfaceC3299dt2.d(abstractC2567Le.d), j2);
        }
        if (i5 != 1) {
            return false;
        }
        long jElapsedRealtime2 = SystemClock.elapsedRealtime() + j2;
        String str = u9.b;
        Map map = (Map) c3844k50.b;
        if (map.containsKey(str)) {
            Long l = (Long) map.get(str);
            int i6 = Ug0.f3833a;
            jMax = Math.max(jElapsedRealtime2, l.longValue());
        } else {
            jMax = jElapsedRealtime2;
        }
        map.put(str, Long.valueOf(jMax));
        int i7 = u9.c;
        if (i7 != Integer.MIN_VALUE) {
            Integer numValueOf = Integer.valueOf(i7);
            Map map2 = (Map) c3844k50.c;
            if (map2.containsKey(numValueOf)) {
                Long l2 = (Long) map2.get(numValueOf);
                int i8 = Ug0.f3833a;
                jElapsedRealtime2 = Math.max(jElapsedRealtime2, l2.longValue());
            }
            map2.put(numValueOf, Long.valueOf(jElapsedRealtime2));
        }
        return true;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2774Te
    public final void f(long j, long j2, List list, C4581sZ c4581sZ) {
        C2523Jm[] c2523JmArr;
        long jMax;
        C4619sw c4619sw;
        Object c2520Jj;
        long j3;
        boolean z;
        if (this.l != null) {
            return;
        }
        long j4 = j2 - j;
        long jL = Ug0.L(this.j.a(this.k).b) + Ug0.L(this.j.f3569a) + j2;
        TU tu = this.g;
        if (tu != null) {
            UU uu = tu.e;
            C2676Pk c2676Pk = uu.f;
            if (c2676Pk.d) {
                if (uu.h) {
                    return;
                }
                Map.Entry entryCeilingEntry = uu.e.ceilingEntry(Long.valueOf(c2676Pk.h));
                Wm0 wm0 = uu.b;
                if (entryCeilingEntry == null || ((Long) entryCeilingEntry.getValue()).longValue() >= jL) {
                    z = false;
                } else {
                    long jLongValue = ((Long) entryCeilingEntry.getKey()).longValue();
                    C2936Zk c2936Zk = (C2936Zk) wm0.b;
                    long j5 = c2936Zk.N;
                    if (j5 == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET || j5 < jLongValue) {
                        c2936Zk.N = jLongValue;
                    }
                    z = true;
                }
                if (z && uu.g) {
                    uu.h = true;
                    uu.g = false;
                    C2936Zk c2936Zk2 = (C2936Zk) wm0.b;
                    c2936Zk2.D.removeCallbacks(c2936Zk2.w);
                    c2936Zk2.y();
                }
                if (z) {
                    return;
                }
            }
        }
        long jL2 = Ug0.L(Ug0.x(this.f));
        C2676Pk c2676Pk2 = this.j;
        long j6 = c2676Pk2.f3569a;
        long jL3 = j6 == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET ? -9223372036854775807L : jL2 - Ug0.L(j6 + c2676Pk2.a(this.k).b);
        AbstractC3866kN abstractC3866kN = list.isEmpty() ? null : (AbstractC3866kN) DM.f(list, 1);
        int length = this.i.length();
        InterfaceC3954lN[] interfaceC3954lNArr = new InterfaceC3954lN[length];
        int i = 0;
        while (true) {
            c2523JmArr = this.h;
            if (i >= length) {
                break;
            }
            C2523Jm c2523Jm = c2523JmArr[i];
            InterfaceC3021al interfaceC3021al = c2523Jm.d;
            Qm0 qm0 = InterfaceC3954lN.q1;
            if (interfaceC3021al == null) {
                interfaceC3954lNArr[i] = qm0;
                j3 = j4;
            } else {
                j3 = j4;
                long j7 = c2523Jm.e;
                long jE = interfaceC3021al.e(j7, jL2);
                long j8 = c2523Jm.f;
                long j9 = jE + j8;
                long jB = c2523Jm.b(jL2);
                long jA = abstractC3866kN != null ? abstractC3866kN.a() : Ug0.k(c2523Jm.d.h(j2, j7) + j8, j9, jB);
                if (jA < j9) {
                    interfaceC3954lNArr[i] = qm0;
                } else {
                    interfaceC3954lNArr[i] = new C2549Km(g(i), jA, jB);
                }
            }
            i++;
            j4 = j3;
        }
        long j10 = j4;
        if (this.j.d) {
            long jC = c2523JmArr[0].c(c2523JmArr[0].b(jL2));
            C2676Pk c2676Pk3 = this.j;
            long j11 = c2676Pk3.f3569a;
            jMax = Math.max(0L, Math.min(j11 == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET ? -9223372036854775807L : jL2 - Ug0.L(j11 + c2676Pk3.a(this.k).b), jC) - j);
        } else {
            jMax = -9223372036854775807L;
        }
        this.i.c(j, j10, jMax, list, interfaceC3954lNArr);
        C2523Jm c2523JmG = g(this.i.getSelectedIndex());
        InterfaceC3021al interfaceC3021al2 = c2523JmG.d;
        U9 u9 = c2523JmG.c;
        InterfaceC2618Ne interfaceC2618Ne = c2523JmG.f3282a;
        FY fy = c2523JmG.b;
        if (interfaceC2618Ne != null) {
            C3614hX c3614hX = ((C2589Mb) interfaceC2618Ne).i == null ? fy.g : null;
            C3614hX c3614hXD = interfaceC3021al2 == null ? fy.d() : null;
            if (c3614hX != null || c3614hXD != null) {
                C4619sw selectedFormat = this.i.getSelectedFormat();
                int selectionReason = this.i.getSelectionReason();
                Object selectionData = this.i.getSelectionData();
                if (c3614hX != null) {
                    C3614hX c3614hXA = c3614hX.a(c3614hXD, u9.f3813a);
                    if (c3614hXA != null) {
                        c3614hX = c3614hXA;
                    }
                } else {
                    c3614hX = c3614hXD;
                }
                c4581sZ.b = new C3594hD(this.e, AbstractC2871Wx.P(fy, u9.f3813a, c3614hX, 0), selectedFormat, selectionReason, selectionData, c2523JmG.f3282a);
                return;
            }
        }
        long j12 = c2523JmG.e;
        boolean z2 = j12 != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        if (interfaceC3021al2.m(j12) == 0) {
            c4581sZ.f4984a = z2;
            return;
        }
        long jE2 = interfaceC3021al2.e(j12, jL2);
        long j13 = c2523JmG.f;
        long j14 = jE2 + j13;
        long jB2 = c2523JmG.b(jL2);
        long jA2 = abstractC3866kN != null ? abstractC3866kN.a() : Ug0.k(interfaceC3021al2.h(j2, j12) + j13, j14, jB2);
        if (jA2 < j14) {
            this.l = new C3529ga();
            return;
        }
        if (jA2 > jB2 || (this.m && jA2 >= jB2)) {
            c4581sZ.f4984a = z2;
            return;
        }
        if (z2 && c2523JmG.d(jA2) >= j12) {
            c4581sZ.f4984a = true;
            return;
        }
        int iMin = (int) Math.min(1, (jB2 - jA2) + 1);
        if (j12 != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
            while (iMin > 1 && c2523JmG.d((((long) iMin) + jA2) - 1) >= j12) {
                iMin--;
            }
        }
        long j15 = list.isEmpty() ? j2 : com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        C4619sw selectedFormat2 = this.i.getSelectedFormat();
        int selectionReason2 = this.i.getSelectionReason();
        Object selectionData2 = this.i.getSelectionData();
        long jD = c2523JmG.d(jA2);
        C3614hX c3614hXG = interfaceC3021al2.g(jA2 - j13);
        InterfaceC4429ql interfaceC4429ql = this.e;
        if (interfaceC2618Ne == null) {
            c2520Jj = new U60(interfaceC4429ql, AbstractC2871Wx.P(fy, u9.f3813a, c3614hXG, (interfaceC3021al2.t() || jL3 == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET || c2523JmG.c(jA2) <= jL3) ? 0 : 8), selectedFormat2, selectionReason2, selectionData2, jD, c2523JmG.c(jA2), jA2, this.d, selectedFormat2);
        } else {
            int i2 = 1;
            int i3 = 1;
            while (true) {
                c4619sw = selectedFormat2;
                if (i3 >= iMin) {
                    break;
                }
                int i4 = iMin;
                C3614hX c3614hXA2 = c3614hXG.a(interfaceC3021al2.g((((long) i3) + jA2) - j13), u9.f3813a);
                if (c3614hXA2 == null) {
                    break;
                }
                i2++;
                i3++;
                c3614hXG = c3614hXA2;
                iMin = i4;
                selectedFormat2 = c4619sw;
            }
            long j16 = (((long) i2) + jA2) - 1;
            long jC2 = c2523JmG.c(j16);
            c2520Jj = new C2520Jj(interfaceC4429ql, AbstractC2871Wx.P(fy, u9.f3813a, c3614hXG, (interfaceC3021al2.t() || jL3 == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET || c2523JmG.c(j16) <= jL3) ? 0 : 8), c4619sw, selectionReason2, selectionData2, jD, jC2, j15, (j12 == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET || j12 > jC2) ? com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET : j12, jA2, i2, -fy.c, c2523JmG.f3282a);
        }
        c4581sZ.b = c2520Jj;
    }

    public final C2523Jm g(int i) {
        C2523Jm[] c2523JmArr = this.h;
        C2523Jm c2523Jm = c2523JmArr[i];
        U9 u9Q = this.b.q(c2523Jm.b.b);
        if (u9Q == null || u9Q.equals(c2523Jm.c)) {
            return c2523Jm;
        }
        C2523Jm c2523Jm2 = new C2523Jm(c2523Jm.e, c2523Jm.b, u9Q, c2523Jm.f3282a, c2523Jm.f, c2523Jm.d);
        c2523JmArr[i] = c2523Jm2;
        return c2523Jm2;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2774Te
    public final int getPreferredQueueSize(long j, List list) {
        return (this.l != null || this.i.length() < 2) ? list.size() : this.i.evaluateQueueSize(j, list);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2774Te
    public final void maybeThrowError() throws C3529ga {
        C3529ga c3529ga = this.l;
        if (c3529ga != null) {
            throw c3529ga;
        }
        this.f3372a.maybeThrowError();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2774Te
    public final void release() {
        for (C2523Jm c2523Jm : this.h) {
            InterfaceC2618Ne interfaceC2618Ne = c2523Jm.f3282a;
            if (interfaceC2618Ne != null) {
                ((C2589Mb) interfaceC2618Ne).c();
            }
        }
    }
}
