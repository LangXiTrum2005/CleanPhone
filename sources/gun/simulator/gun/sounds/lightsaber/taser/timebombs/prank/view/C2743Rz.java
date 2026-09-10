package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.google.android.exoplayer2.drm.DrmInitData;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Rz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2743Rz extends AbstractC2873Wz {
    public final int d;
    public final long e;
    public final boolean f;
    public final boolean g;
    public final long h;
    public final boolean i;
    public final int j;
    public final long k;
    public final int l;
    public final long m;
    public final long n;
    public final boolean o;
    public final boolean p;
    public final DrmInitData q;
    public final AC r;
    public final AC s;
    public final FC t;
    public final long u;
    public final C2717Qz v;

    public C2743Rz(int i, String str, List list, long j, boolean z, long j2, boolean z2, int i2, long j3, int i3, long j4, long j5, boolean z3, boolean z4, boolean z5, DrmInitData drmInitData, List list2, List list3, C2717Qz c2717Qz, Map map) {
        super(str, list, z3);
        this.d = i;
        this.h = j2;
        this.g = z;
        this.i = z2;
        this.j = i2;
        this.k = j3;
        this.l = i3;
        this.m = j4;
        this.n = j5;
        this.o = z4;
        this.p = z5;
        this.q = drmInitData;
        this.r = AC.j(list2);
        this.s = AC.j(list3);
        this.t = FC.b(map);
        if (!list3.isEmpty()) {
            C2613Mz c2613Mz = (C2613Mz) FW.H(list3);
            this.u = c2613Mz.e + c2613Mz.c;
        } else if (list2.isEmpty()) {
            this.u = 0L;
        } else {
            C2665Oz c2665Oz = (C2665Oz) FW.H(list2);
            this.u = c2665Oz.e + c2665Oz.c;
        }
        this.e = j != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET ? j >= 0 ? Math.min(this.u, j) : Math.max(0L, this.u + j) : com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        this.f = j >= 0;
        this.v = c2717Qz;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3564gu
    public final Object copy(List list) {
        return this;
    }
}
