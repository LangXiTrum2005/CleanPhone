package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.net.Uri;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class S60 extends Gc0 {
    public static final Object q = new Object();
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final long i;
    public final long j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final Object n;
    public final C3693iO o;
    public final C3164cO p;

    static {
        WN wn = new WN();
        ZN zn = new ZN();
        List listEmptyList = Collections.emptyList();
        C3965lY c3965lY = C3965lY.e;
        C3429fO c3429fO = C3429fO.d;
        Uri uri = Uri.EMPTY;
        FW.s(zn.b == null || zn.f4068a != null);
        if (uri != null) {
            new C3341eO(uri, null, zn.f4068a != null ? new C2987aO(zn) : null, listEmptyList, null, c3965lY, null);
        }
        wn.a();
        C3955lO c3955lO = C3955lO.I;
    }

    public S60(long j, long j2, long j3, long j4, long j5, long j6, boolean z, boolean z2, boolean z3, Object obj, C3693iO c3693iO, C3164cO c3164cO) {
        this.e = j;
        this.f = j2;
        this.g = j3;
        this.h = j4;
        this.i = j5;
        this.j = j6;
        this.k = z;
        this.l = z2;
        this.m = z3;
        this.n = obj;
        c3693iO.getClass();
        this.o = c3693iO;
        this.p = c3164cO;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Gc0
    public final int b(Object obj) {
        return q.equals(obj) ? 0 : -1;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Gc0
    public final Ec0 g(int i, Ec0 ec0, boolean z) {
        FW.m(i, 1);
        Object obj = z ? q : null;
        long j = -this.i;
        ec0.getClass();
        ec0.i(null, obj, 0, this.g, j, C2.g, false);
        return ec0;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Gc0
    public final int i() {
        return 1;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Gc0
    public final Object m(int i) {
        FW.m(i, 1);
        return q;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002d A[PHI: r1
  0x002d: PHI (r1v2 long) = (r1v1 long), (r1v1 long), (r1v1 long), (r1v5 long) binds: [B:3:0x000c, B:5:0x0010, B:7:0x0016, B:12:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Gc0
    public final Fc0 n(int i, Fc0 fc0, long j) {
        long j2;
        FW.m(i, 1);
        long j3 = this.j;
        boolean z = this.l;
        if (!z || this.m || j == 0) {
            j2 = j3;
        } else {
            long j4 = this.h;
            if (j4 != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                j3 += j;
                if (j3 <= j4) {
                    j2 = j3;
                }
            }
            j2 = -9223372036854775807L;
        }
        fc0.b(Fc0.r, this.o, this.n, this.e, this.f, com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET, this.k, z, this.p, j2, this.h, 0, 0, this.i);
        return fc0;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Gc0
    public final int p() {
        return 1;
    }

    public S60(long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3, R80 r80, C3693iO c3693iO) {
        this(com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET, com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET, j, j2, j3, j4, z, z2, false, r80, c3693iO, z3 ? c3693iO.c : null);
    }

    public S60(long j, boolean z, boolean z2, C3693iO c3693iO) {
        this(j, j, 0L, 0L, z, false, z2, null, c3693iO);
    }
}
