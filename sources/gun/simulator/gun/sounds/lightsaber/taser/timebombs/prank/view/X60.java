package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class X60 implements InterfaceC4395qO, JI {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4868vl f3957a;
    public final InterfaceC4341pl b;
    public final Bd0 c;
    public final G7 d;
    public final DO e;
    public final C4062md0 f;
    public final long h;
    public final C4619sw j;
    public final boolean k;
    public boolean l;
    public byte[] m;
    public int n;
    public final ArrayList g = new ArrayList();
    public final OI i = new OI("SingleSampleMediaPeriod");

    public X60(C4868vl c4868vl, InterfaceC4341pl interfaceC4341pl, Bd0 bd0, C4619sw c4619sw, long j, G7 g7, DO r8, boolean z) {
        this.f3957a = c4868vl;
        this.b = interfaceC4341pl;
        this.c = bd0;
        this.j = c4619sw;
        this.h = j;
        this.d = g7;
        this.e = r8;
        this.k = z;
        this.f = new C4062md0(new C3974ld0("", c4619sw));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.JI
    public final void c(LI li, long j, long j2) {
        W60 w60 = (W60) li;
        this.n = (int) w60.b.b;
        byte[] bArr = w60.c;
        bArr.getClass();
        this.m = bArr;
        this.l = true;
        Uri uri = w60.b.c;
        FI fi = new FI();
        this.d.getClass();
        this.e.g(fi, 1, -1, this.j, 0, null, 0L, this.h);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4985x40
    public final boolean continueLoading(long j) {
        if (this.l) {
            return false;
        }
        OI oi = this.i;
        if (oi.d() || oi.c()) {
            return false;
        }
        InterfaceC4429ql interfaceC4429qlCreateDataSource = this.b.createDataSource();
        Bd0 bd0 = this.c;
        if (bd0 != null) {
            interfaceC4429qlCreateDataSource.c(bd0);
        }
        C4868vl c4868vl = this.f3957a;
        oi.f(new W60(interfaceC4429qlCreateDataSource, c4868vl), this, this.d.A(1));
        this.e.l(new FI(c4868vl), 1, -1, this.j, 0, null, 0L, this.h);
        return true;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.JI
    public final void d(LI li, long j, long j2, boolean z) {
        Uri uri = ((W60) li).b.c;
        FI fi = new FI();
        this.d.getClass();
        this.e.d(fi, 1, -1, null, 0, null, 0L, this.h);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.JI
    public final C2868Wu e(LI li, long j, long j2, IOException iOException, int i) {
        long jMin;
        C2868Wu c2868WuB;
        Uri uri = ((W60) li).b.c;
        FI fi = new FI();
        int i2 = Ug0.f3833a;
        G7 g7 = this.d;
        g7.getClass();
        if (!(iOException instanceof KT) && !(iOException instanceof FileNotFoundException) && !(iOException instanceof OA) && !(iOException instanceof NI)) {
            int i3 = C4604sl.b;
            Throwable cause = iOException;
            while (true) {
                if (cause == null) {
                    jMin = Math.min((i - 1) * 1000, 5000);
                    break;
                }
                if ((cause instanceof C4604sl) && ((C4604sl) cause).f4995a == 2008) {
                    jMin = -9223372036854775807L;
                    break;
                }
                cause = cause.getCause();
            }
        } else {
            jMin = -9223372036854775807L;
            break;
        }
        boolean z = jMin == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET || i >= g7.A(1);
        if (this.k && z) {
            AbstractC4038mJ.g("Loading failed, treating as end-of-stream.", iOException);
            this.l = true;
            c2868WuB = OI.e;
        } else {
            c2868WuB = jMin != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET ? OI.b(jMin, false) : OI.f;
        }
        C2868Wu c2868Wu = c2868WuB;
        this.e.i(fi, 1, -1, this.j, 0, null, 0L, this.h, iOException, !c2868Wu.c());
        return c2868Wu;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4985x40
    public final long getBufferedPositionUs() {
        return this.l ? Long.MIN_VALUE : 0L;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4985x40
    public final long getNextLoadPositionUs() {
        return (this.l || this.i.d()) ? Long.MIN_VALUE : 0L;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4395qO
    public final C4062md0 getTrackGroups() {
        return this.f;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4985x40
    public final boolean isLoading() {
        return this.i.d();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4395qO
    public final long k(InterfaceC3299dt[] interfaceC3299dtArr, boolean[] zArr, W20[] w20Arr, boolean[] zArr2, long j) {
        for (int i = 0; i < interfaceC3299dtArr.length; i++) {
            W20 w20 = w20Arr[i];
            ArrayList arrayList = this.g;
            if (w20 != null && (interfaceC3299dtArr[i] == null || !zArr[i])) {
                arrayList.remove(w20);
                w20Arr[i] = null;
            }
            if (w20Arr[i] == null && interfaceC3299dtArr[i] != null) {
                V60 v60 = new V60(this);
                arrayList.add(v60);
                w20Arr[i] = v60;
                zArr2[i] = true;
            }
        }
        return j;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4395qO
    public final void r(InterfaceC4307pO interfaceC4307pO, long j) {
        interfaceC4307pO.p(this);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4395qO
    public final long readDiscontinuity() {
        return com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4395qO
    public final long seekToUs(long j) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.g;
            if (i >= arrayList.size()) {
                return j;
            }
            V60 v60 = (V60) arrayList.get(i);
            if (v60.f3860a == 2) {
                v60.f3860a = 1;
            }
            i++;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4395qO
    public final void maybeThrowPrepareError() {
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4395qO
    public final void q(long j) {
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4985x40
    public final void reevaluateBuffer(long j) {
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4395qO
    public final long b(long j, P30 p30) {
        return j;
    }
}
