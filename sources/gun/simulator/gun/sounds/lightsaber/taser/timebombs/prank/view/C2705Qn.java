package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Qn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2705Qn implements InterfaceC2774Te {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PI f3625a;
    public final int b;
    public final InterfaceC2618Ne[] c;
    public final InterfaceC4429ql d;
    public InterfaceC3299dt e;
    public R80 f;
    public int g;
    public C3529ga h;

    public C2705Qn(PI pi, R80 r80, int i, InterfaceC3299dt interfaceC3299dt, InterfaceC4429ql interfaceC4429ql) {
        C3798jd0[] c3798jd0Arr;
        this.f3625a = pi;
        this.f = r80;
        this.b = i;
        this.e = interfaceC3299dt;
        this.d = interfaceC4429ql;
        Q80 q80 = r80.f[i];
        this.c = new InterfaceC2618Ne[interfaceC3299dt.length()];
        for (int i2 = 0; i2 < this.c.length; i2++) {
            int indexInTrackGroup = interfaceC3299dt.getIndexInTrackGroup(i2);
            C4619sw c4619sw = q80.j[indexInTrackGroup];
            if (c4619sw.o != null) {
                P80 p80 = r80.e;
                p80.getClass();
                c3798jd0Arr = p80.c;
            } else {
                c3798jd0Arr = null;
            }
            C3798jd0[] c3798jd0Arr2 = c3798jd0Arr;
            int i3 = q80.f3592a;
            this.c[i2] = new C2589Mb(new C2455Gw(3, null, new C3712id0(indexInTrackGroup, i3, q80.c, com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET, r80.g, c4619sw, 0, c3798jd0Arr2, i3 == 2 ? 4 : 0, null, null), Collections.emptyList(), null), q80.f3592a, c4619sw);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2774Te
    public final long b(long j, P30 p30) {
        Q80 q80 = this.f.f[this.b];
        int iF = Ug0.f(q80.o, j, true);
        long[] jArr = q80.o;
        long j2 = jArr[iF];
        return p30.a(j, j2, (j2 >= j || iF >= q80.k - 1) ? j2 : jArr[iF + 1]);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2774Te
    public final boolean c(long j, AbstractC2567Le abstractC2567Le, List list) {
        if (this.h != null) {
            return false;
        }
        return this.e.b(j, abstractC2567Le, list);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2774Te
    public final boolean e(AbstractC2567Le abstractC2567Le, boolean z, BR br, G7 g7) {
        C3483g0 c3483g0W = FW.w(this.e);
        g7.getClass();
        C2868Wu c2868WuY = G7.y(c3483g0W, br);
        if (z && c2868WuY != null && c2868WuY.f3945a == 2) {
            InterfaceC3299dt interfaceC3299dt = this.e;
            if (interfaceC3299dt.blacklist(interfaceC3299dt.d(abstractC2567Le.d), c2868WuY.b)) {
                return true;
            }
        }
        return false;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2774Te
    public final void f(long j, long j2, List list, C4581sZ c4581sZ) {
        int iA;
        long jB;
        if (this.h != null) {
            return;
        }
        R80 r80 = this.f;
        Q80[] q80Arr = r80.f;
        int i = this.b;
        Q80 q80 = q80Arr[i];
        if (q80.k == 0) {
            c4581sZ.f4984a = !r80.d;
            return;
        }
        boolean zIsEmpty = list.isEmpty();
        long[] jArr = q80.o;
        if (zIsEmpty) {
            iA = Ug0.f(jArr, j2, true);
        } else {
            iA = (int) (((AbstractC3866kN) DM.f(list, 1)).a() - ((long) this.g));
            if (iA < 0) {
                this.h = new C3529ga();
                return;
            }
        }
        int i2 = iA;
        if (i2 >= q80.k) {
            c4581sZ.f4984a = !this.f.d;
            return;
        }
        long j3 = j2 - j;
        R80 r81 = this.f;
        if (r81.d) {
            Q80 q81 = r81.f[i];
            int i3 = q81.k - 1;
            jB = (q81.b(i3) + q81.o[i3]) - j;
        } else {
            jB = -9223372036854775807L;
        }
        int length = this.e.length();
        InterfaceC3954lN[] interfaceC3954lNArr = new InterfaceC3954lN[length];
        for (int i4 = 0; i4 < length; i4++) {
            this.e.getIndexInTrackGroup(i4);
            interfaceC3954lNArr[i4] = new C2679Pn(q80, i2);
        }
        this.e.c(j, j3, jB, list, interfaceC3954lNArr);
        long j4 = jArr[i2];
        long jB2 = q80.b(i2) + j4;
        long j5 = list.isEmpty() ? j2 : -9223372036854775807L;
        int i5 = i2 + this.g;
        int selectedIndex = this.e.getSelectedIndex();
        InterfaceC2618Ne interfaceC2618Ne = this.c[selectedIndex];
        int indexInTrackGroup = this.e.getIndexInTrackGroup(selectedIndex);
        C4619sw[] c4619swArr = q80.j;
        FW.s(c4619swArr != null);
        List list2 = q80.n;
        FW.s(list2 != null);
        FW.s(i2 < list2.size());
        String string = Integer.toString(c4619swArr[indexInTrackGroup].h);
        String string2 = ((Long) list2.get(i2)).toString();
        c4581sZ.b = new C2520Jj(this.d, new C4868vl(FW.X(q80.l, q80.m.replace("{bitrate}", string).replace("{Bitrate}", string).replace("{start time}", string2).replace("{start_time}", string2))), this.e.getSelectedFormat(), this.e.getSelectionReason(), this.e.getSelectionData(), j4, jB2, j5, com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET, i5, 1, j4, interfaceC2618Ne);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2774Te
    public final int getPreferredQueueSize(long j, List list) {
        return (this.h != null || this.e.length() < 2) ? list.size() : this.e.evaluateQueueSize(j, list);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2774Te
    public final void maybeThrowError() throws C3529ga {
        C3529ga c3529ga = this.h;
        if (c3529ga != null) {
            throw c3529ga;
        }
        this.f3625a.maybeThrowError();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2774Te
    public final void release() {
        for (InterfaceC2618Ne interfaceC2618Ne : this.c) {
            ((C2589Mb) interfaceC2618Ne).c();
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2774Te
    public final void d(AbstractC2567Le abstractC2567Le) {
    }
}
