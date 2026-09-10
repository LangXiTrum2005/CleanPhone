package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.net.Uri;
import android.os.Handler;
import java.io.IOException;
import java.util.ArrayList;
import javax.net.SocketFactory;

/* JADX INFO: loaded from: classes2.dex */
public final class Y00 implements InterfaceC4395qO {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2833Vl f4002a;
    public final Handler b = Ug0.m(null);
    public final U00 c;
    public final R00 d;
    public final ArrayList e;
    public final ArrayList f;
    public final C4559sD g;
    public final InterfaceC4889w00 h;
    public InterfaceC4307pO i;
    public C3965lY j;
    public IOException k;
    public C3124bu l;
    public long m;
    public long n;
    public long o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public int u;
    public boolean v;

    public Y00(C2833Vl c2833Vl, InterfaceC4889w00 interfaceC4889w00, Uri uri, C4559sD c4559sD, String str, SocketFactory socketFactory, boolean z) {
        this.f4002a = c2833Vl;
        this.h = interfaceC4889w00;
        this.g = c4559sD;
        U00 u00 = new U00(this);
        this.c = u00;
        this.d = new R00(u00, u00, str, uri, socketFactory, z);
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.n = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        this.m = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        this.o = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
    }

    public static boolean h(Y00 y00) {
        return y00.n != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
    }

    public static C5065y00 m(Y00 y00, Uri uri) {
        int i = 0;
        while (true) {
            ArrayList arrayList = y00.e;
            if (i >= arrayList.size()) {
                return null;
            }
            if (!((W00) arrayList.get(i)).d) {
                V00 v00 = ((W00) arrayList.get(i)).f3903a;
                if (v00.a().equals(uri)) {
                    return v00.b;
                }
            }
            i++;
        }
    }

    public static void o(Y00 y00) {
        if (y00.r || y00.s) {
            return;
        }
        int i = 0;
        while (true) {
            ArrayList arrayList = y00.e;
            if (i >= arrayList.size()) {
                y00.s = true;
                AC acJ = AC.j(arrayList);
                C4998xC c4998xC = new C4998xC();
                for (int i2 = 0; i2 < acJ.size(); i2++) {
                    V20 v20 = ((W00) acJ.get(i2)).c;
                    String string = Integer.toString(i2);
                    C4619sw c4619swT = v20.t();
                    FW.o(c4619swT);
                    c4998xC.H0(new C3974ld0(string, c4619swT));
                }
                y00.j = c4998xC.J0();
                InterfaceC4307pO interfaceC4307pO = y00.i;
                FW.o(interfaceC4307pO);
                interfaceC4307pO.p(y00);
                return;
            }
            if (((W00) arrayList.get(i)).c.t() == null) {
                return;
            } else {
                i++;
            }
        }
    }

    public static void t(Y00 y00) {
        y00.d.w();
        C2868Wu c2868WuB = ((C2868Wu) y00.h).b();
        if (c2868WuB == null) {
            y00.l = new C3124bu("No fallback data channel factory for TCP retry");
            return;
        }
        ArrayList arrayList = y00.e;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        ArrayList arrayList3 = y00.f;
        ArrayList arrayList4 = new ArrayList(arrayList3.size());
        for (int i = 0; i < arrayList.size(); i++) {
            W00 w00 = (W00) arrayList.get(i);
            if (w00.d) {
                arrayList2.add(w00);
            } else {
                V00 v00 = w00.f3903a;
                W00 w01 = new W00(y00, v00.f3854a, i, c2868WuB);
                arrayList2.add(w01);
                w01.d();
                if (arrayList3.contains(v00)) {
                    arrayList4.add(w01.f3903a);
                }
            }
        }
        AC acJ = AC.j(arrayList);
        arrayList.clear();
        arrayList.addAll(arrayList2);
        arrayList3.clear();
        arrayList3.addAll(arrayList4);
        for (int i2 = 0; i2 < acJ.size(); i2++) {
            ((W00) acJ.get(i2)).c();
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4985x40
    public final boolean continueLoading(long j) {
        return !this.p;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4985x40
    public final long getBufferedPositionUs() {
        if (!this.p) {
            ArrayList arrayList = this.e;
            if (!arrayList.isEmpty()) {
                long j = this.m;
                if (j != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                    return j;
                }
                boolean z = true;
                long jMin = Long.MAX_VALUE;
                for (int i = 0; i < arrayList.size(); i++) {
                    W00 w00 = (W00) arrayList.get(i);
                    if (!w00.d) {
                        jMin = Math.min(jMin, w00.c.n());
                        z = false;
                    }
                }
                if (z || jMin == Long.MIN_VALUE) {
                    return 0L;
                }
                return jMin;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4985x40
    public final long getNextLoadPositionUs() {
        return getBufferedPositionUs();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4395qO
    public final C4062md0 getTrackGroups() {
        FW.s(this.s);
        C3965lY c3965lY = this.j;
        c3965lY.getClass();
        return new C4062md0((C3974ld0[]) c3965lY.toArray(new C3974ld0[0]));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4985x40
    public final boolean isLoading() {
        return !this.p;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4395qO
    public final long k(InterfaceC3299dt[] interfaceC3299dtArr, boolean[] zArr, W20[] w20Arr, boolean[] zArr2, long j) {
        ArrayList arrayList;
        for (int i = 0; i < interfaceC3299dtArr.length; i++) {
            if (w20Arr[i] != null && (interfaceC3299dtArr[i] == null || !zArr[i])) {
                w20Arr[i] = null;
            }
        }
        ArrayList arrayList2 = this.f;
        arrayList2.clear();
        int i2 = 0;
        while (true) {
            int length = interfaceC3299dtArr.length;
            arrayList = this.e;
            if (i2 >= length) {
                break;
            }
            InterfaceC3299dt interfaceC3299dt = interfaceC3299dtArr[i2];
            if (interfaceC3299dt != null) {
                C3974ld0 trackGroup = interfaceC3299dt.getTrackGroup();
                C3965lY c3965lY = this.j;
                c3965lY.getClass();
                int iIndexOf = c3965lY.indexOf(trackGroup);
                W00 w00 = (W00) arrayList.get(iIndexOf);
                w00.getClass();
                arrayList2.add(w00.f3903a);
                if (this.j.contains(trackGroup) && w20Arr[i2] == null) {
                    w20Arr[i2] = new X00(this, iIndexOf);
                    zArr2[i2] = true;
                }
            }
            i2++;
        }
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            W00 w01 = (W00) arrayList.get(i3);
            if (!arrayList2.contains(w01.f3903a)) {
                w01.c();
            }
        }
        this.t = true;
        if (j != 0) {
            this.m = j;
            this.n = j;
            this.o = j;
        }
        u();
        return j;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4395qO
    public final void maybeThrowPrepareError() throws IOException {
        IOException iOException = this.k;
        if (iOException != null) {
            throw iOException;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4395qO
    public final void q(long j) {
        if (this.n != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
            return;
        }
        int i = 0;
        while (true) {
            ArrayList arrayList = this.e;
            if (i >= arrayList.size()) {
                return;
            }
            W00 w00 = (W00) arrayList.get(i);
            if (!w00.d) {
                w00.c.h(j, true);
            }
            i++;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4395qO
    public final void r(InterfaceC4307pO interfaceC4307pO, long j) {
        R00 r00 = this.d;
        this.i = interfaceC4307pO;
        try {
            r00.getClass();
            try {
                r00.j.a(r00.v(r00.i));
                A70 a70 = r00.h;
                a70.k(a70.e(4, r00.l, C4405qY.g, r00.i));
            } catch (IOException e) {
                Ug0.h(r00.j);
                throw e;
            }
        } catch (IOException e2) {
            this.k = e2;
            Ug0.h(r00);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4395qO
    public final long readDiscontinuity() {
        if (!this.q) {
            return com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        }
        this.q = false;
        return 0L;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4395qO
    public final long seekToUs(long j) {
        if (getBufferedPositionUs() == 0 && !this.v) {
            this.o = j;
            return j;
        }
        q(j);
        this.m = j;
        if (this.n != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
            R00 r00 = this.d;
            int i = r00.o;
            if (i == 1) {
                return j;
            }
            if (i != 2) {
                throw new IllegalStateException();
            }
            this.n = j;
            r00.x(j);
            return j;
        }
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.e;
            if (i2 >= arrayList.size()) {
                return j;
            }
            if (!((W00) arrayList.get(i2)).c.F(j, false)) {
                this.n = j;
                this.d.x(j);
                for (int i3 = 0; i3 < this.e.size(); i3++) {
                    W00 w00 = (W00) this.e.get(i3);
                    if (!w00.d) {
                        C5153z00 c5153z00 = w00.f3903a.b.g;
                        c5153z00.getClass();
                        synchronized (c5153z00.e) {
                            c5153z00.k = true;
                        }
                        w00.c.C(false);
                        w00.c.t = j;
                    }
                }
                return j;
            }
            i2++;
        }
    }

    public final void u() {
        ArrayList arrayList;
        int i = 0;
        boolean z = true;
        while (true) {
            arrayList = this.f;
            if (i >= arrayList.size()) {
                break;
            }
            z &= ((V00) arrayList.get(i)).c != null;
            i++;
        }
        if (z && this.t) {
            R00 r00 = this.d;
            r00.f.addAll(arrayList);
            r00.u();
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4985x40
    public final void reevaluateBuffer(long j) {
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4395qO
    public final long b(long j, P30 p30) {
        return j;
    }
}
