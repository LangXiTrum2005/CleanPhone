package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.net.Uri;
import android.os.Bundle;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class Fc0 implements InterfaceC2538Kb {
    public static final String A;
    public static final String B;
    public static final String C;
    public static final String D;
    public static final String E;
    public static final String F;
    public static final String G;
    public static final Object r = new Object();
    public static final Object s = new Object();
    public static final C3693iO t;
    public static final String u;
    public static final String v;
    public static final String w;
    public static final String x;
    public static final String y;
    public static final String z;
    public Object b;
    public Object d;
    public long e;
    public long f;
    public long g;
    public boolean h;
    public boolean i;
    public boolean j;
    public C3164cO k;
    public boolean l;
    public long m;
    public long n;
    public int o;
    public int p;
    public long q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f3074a = r;
    public C3693iO c = t;

    static {
        C3341eO c3341eO;
        WN wn = new WN();
        ZN zn = new ZN();
        List listEmptyList = Collections.emptyList();
        C3965lY c3965lY = C3965lY.e;
        C3429fO c3429fO = C3429fO.d;
        Uri uri = Uri.EMPTY;
        FW.s(zn.b == null || zn.f4068a != null);
        if (uri != null) {
            c3341eO = new C3341eO(uri, null, zn.f4068a != null ? new C2987aO(zn) : null, listEmptyList, null, c3965lY, null);
        } else {
            c3341eO = null;
        }
        t = new C3693iO("com.google.android.exoplayer2.Timeline", new YN(wn), c3341eO, new C3164cO(com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET, com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET, com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET, -3.4028235E38f, -3.4028235E38f), C3955lO.I, c3429fO);
        int i = Ug0.f3833a;
        u = Integer.toString(1, 36);
        v = Integer.toString(2, 36);
        w = Integer.toString(3, 36);
        x = Integer.toString(4, 36);
        y = Integer.toString(5, 36);
        z = Integer.toString(6, 36);
        A = Integer.toString(7, 36);
        B = Integer.toString(8, 36);
        C = Integer.toString(9, 36);
        D = Integer.toString(10, 36);
        E = Integer.toString(11, 36);
        F = Integer.toString(12, 36);
        G = Integer.toString(13, 36);
    }

    public final boolean a() {
        FW.s(this.j == (this.k != null));
        return this.k != null;
    }

    public final void b(Object obj, C3693iO c3693iO, Object obj2, long j, long j2, long j3, boolean z2, boolean z3, C3164cO c3164cO, long j4, long j5, int i, int i2, long j6) {
        C3341eO c3341eO;
        this.f3074a = obj;
        this.c = c3693iO != null ? c3693iO : t;
        this.b = (c3693iO == null || (c3341eO = c3693iO.b) == null) ? null : c3341eO.g;
        this.d = obj2;
        this.e = j;
        this.f = j2;
        this.g = j3;
        this.h = z2;
        this.i = z3;
        this.j = c3164cO != null;
        this.k = c3164cO;
        this.m = j4;
        this.n = j5;
        this.o = i;
        this.p = i2;
        this.q = j6;
        this.l = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Fc0.class.equals(obj.getClass())) {
            return false;
        }
        Fc0 fc0 = (Fc0) obj;
        return Ug0.a(this.f3074a, fc0.f3074a) && Ug0.a(this.c, fc0.c) && Ug0.a(this.d, fc0.d) && Ug0.a(this.k, fc0.k) && this.e == fc0.e && this.f == fc0.f && this.g == fc0.g && this.h == fc0.h && this.i == fc0.i && this.l == fc0.l && this.m == fc0.m && this.n == fc0.n && this.o == fc0.o && this.p == fc0.p && this.q == fc0.q;
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + ((this.f3074a.hashCode() + EnumC4719u30.AD_RESPONSE_TIMED_OUT_VALUE) * 31)) * 31;
        Object obj = this.d;
        int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        C3164cO c3164cO = this.k;
        int iHashCode3 = (iHashCode2 + (c3164cO != null ? c3164cO.hashCode() : 0)) * 31;
        long j = this.e;
        int i = (iHashCode3 + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.f;
        int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.g;
        int i3 = (((((((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.h ? 1 : 0)) * 31) + (this.i ? 1 : 0)) * 31) + (this.l ? 1 : 0)) * 31;
        long j4 = this.m;
        int i4 = (i3 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        long j5 = this.n;
        int i5 = (((((i4 + ((int) (j5 ^ (j5 >>> 32)))) * 31) + this.o) * 31) + this.p) * 31;
        long j6 = this.q;
        return i5 + ((int) (j6 ^ (j6 >>> 32)));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2538Kb
    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        if (!C3693iO.g.equals(this.c)) {
            bundle.putBundle(u, this.c.toBundle());
        }
        long j = this.e;
        if (j != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
            bundle.putLong(v, j);
        }
        long j2 = this.f;
        if (j2 != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
            bundle.putLong(w, j2);
        }
        long j3 = this.g;
        if (j3 != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
            bundle.putLong(x, j3);
        }
        boolean z2 = this.h;
        if (z2) {
            bundle.putBoolean(y, z2);
        }
        boolean z3 = this.i;
        if (z3) {
            bundle.putBoolean(z, z3);
        }
        C3164cO c3164cO = this.k;
        if (c3164cO != null) {
            bundle.putBundle(A, c3164cO.toBundle());
        }
        boolean z4 = this.l;
        if (z4) {
            bundle.putBoolean(B, z4);
        }
        long j4 = this.m;
        if (j4 != 0) {
            bundle.putLong(C, j4);
        }
        long j5 = this.n;
        if (j5 != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
            bundle.putLong(D, j5);
        }
        int i = this.o;
        if (i != 0) {
            bundle.putInt(E, i);
        }
        int i2 = this.p;
        if (i2 != 0) {
            bundle.putInt(F, i2);
        }
        long j6 = this.q;
        if (j6 != 0) {
            bundle.putLong(G, j6);
        }
        return bundle;
    }
}
