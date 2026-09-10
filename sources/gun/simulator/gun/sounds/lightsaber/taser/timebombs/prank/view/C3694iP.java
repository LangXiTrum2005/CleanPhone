package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.iP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3694iP extends AbstractC4860vh {
    public static final C3693iO r;
    public final G9[] k;
    public final Gc0[] l;
    public final ArrayList m;
    public final C4710tz n;
    public int o;
    public long[][] p;
    public C3124bu q;

    static {
        WN wn = new WN();
        C5086yC c5086yC = AC.b;
        C3965lY c3965lY = C3965lY.e;
        Collections.emptyList();
        C3965lY c3965lY2 = C3965lY.e;
        r = new C3693iO("MergingMediaSource", new YN(wn), null, new C3164cO(com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET, com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET, com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET, -3.4028235E38f, -3.4028235E38f), C3955lO.I, C3429fO.d);
    }

    public C3694iP(G9... g9Arr) {
        C4710tz c4710tz = new C4710tz(28);
        this.k = g9Arr;
        this.n = c4710tz;
        this.m = new ArrayList(Arrays.asList(g9Arr));
        this.o = -1;
        this.l = new Gc0[g9Arr.length];
        this.p = new long[0][];
        new HashMap();
        FW.n(8, "expectedKeys");
        new C3343eQ().j().G0();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.G9
    public final InterfaceC4395qO b(C5186zO c5186zO, C2833Vl c2833Vl, long j) {
        G9[] g9Arr = this.k;
        int length = g9Arr.length;
        InterfaceC4395qO[] interfaceC4395qOArr = new InterfaceC4395qO[length];
        Gc0[] gc0Arr = this.l;
        int iB = gc0Arr[0].b(c5186zO.f4977a);
        for (int i = 0; i < length; i++) {
            interfaceC4395qOArr[i] = g9Arr[i].b(c5186zO.b(gc0Arr[i].m(iB)), c2833Vl, j - this.p[iB][i]);
        }
        return new C3606hP(this.n, this.p[iB], interfaceC4395qOArr);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.G9
    public final C3693iO k() {
        G9[] g9Arr = this.k;
        return g9Arr.length > 0 ? g9Arr[0].k() : r;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4860vh, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.G9
    public final void m() throws C3124bu {
        C3124bu c3124bu = this.q;
        if (c3124bu != null) {
            throw c3124bu;
        }
        super.m();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.G9
    public final void o(Bd0 bd0) {
        this.j = bd0;
        this.i = Ug0.m(null);
        int i = 0;
        while (true) {
            G9[] g9Arr = this.k;
            if (i >= g9Arr.length) {
                return;
            }
            z(Integer.valueOf(i), g9Arr[i]);
            i++;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.G9
    public final void q(InterfaceC4395qO interfaceC4395qO) {
        C3606hP c3606hP = (C3606hP) interfaceC4395qO;
        int i = 0;
        while (true) {
            G9[] g9Arr = this.k;
            if (i >= g9Arr.length) {
                return;
            }
            G9 g9 = g9Arr[i];
            InterfaceC4395qO interfaceC4395qO2 = c3606hP.f4455a[i];
            if (interfaceC4395qO2 instanceof C3430fP) {
                interfaceC4395qO2 = ((C3430fP) interfaceC4395qO2).f4366a;
            }
            g9.q(interfaceC4395qO2);
            i++;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4860vh, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.G9
    public final void s() {
        super.s();
        Arrays.fill(this.l, (Object) null);
        this.o = -1;
        this.q = null;
        ArrayList arrayList = this.m;
        arrayList.clear();
        Collections.addAll(arrayList, this.k);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4860vh
    public final C5186zO v(Object obj, C5186zO c5186zO) {
        if (((Integer) obj).intValue() == 0) {
            return c5186zO;
        }
        return null;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4860vh
    public final void y(Object obj, G9 g9, Gc0 gc0) {
        Integer num = (Integer) obj;
        if (this.q != null) {
            return;
        }
        if (this.o == -1) {
            this.o = gc0.i();
        } else if (gc0.i() != this.o) {
            this.q = new C3124bu(0, 1);
            return;
        }
        int length = this.p.length;
        Gc0[] gc0Arr = this.l;
        if (length == 0) {
            this.p = (long[][]) Array.newInstance((Class<?>) Long.TYPE, this.o, gc0Arr.length);
        }
        ArrayList arrayList = this.m;
        arrayList.remove(g9);
        gc0Arr[num.intValue()] = gc0;
        if (arrayList.isEmpty()) {
            p(gc0Arr[0]);
        }
    }
}
