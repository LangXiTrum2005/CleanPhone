package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public final class Ec0 implements InterfaceC2538Kb {
    public static final String h;
    public static final String i;
    public static final String j;
    public static final String k;
    public static final String l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f3030a;
    public Object b;
    public int c;
    public long d;
    public long e;
    public boolean f;
    public C2 g = C2.g;

    static {
        int i2 = Ug0.f3833a;
        h = Integer.toString(0, 36);
        i = Integer.toString(1, 36);
        j = Integer.toString(2, 36);
        k = Integer.toString(3, 36);
        l = Integer.toString(4, 36);
    }

    public final long a(int i2, int i3) {
        B2 b2A = this.g.a(i2);
        return b2A.b != -1 ? b2A.f[i3] : com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
    }

    public final int b(long j2) {
        int i2;
        B2 b2A;
        int i3;
        C2 c2 = this.g;
        long j3 = this.d;
        c2.getClass();
        if (j2 == Long.MIN_VALUE) {
            return -1;
        }
        if (j3 != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET && j2 >= j3) {
            return -1;
        }
        int i4 = c2.e;
        while (true) {
            i2 = c2.b;
            if (i4 >= i2 || ((c2.a(i4).f2849a == Long.MIN_VALUE || c2.a(i4).f2849a > j2) && ((i3 = (b2A = c2.a(i4)).b) == -1 || b2A.a(-1) < i3))) {
                break;
            }
            i4++;
        }
        if (i4 < i2) {
            return i4;
        }
        return -1;
    }

    public final int c(long j2) {
        C2 c2 = this.g;
        long j3 = this.d;
        int i2 = c2.b - 1;
        while (i2 >= 0 && j2 != Long.MIN_VALUE) {
            long j4 = c2.a(i2).f2849a;
            if (j4 != Long.MIN_VALUE) {
                if (j2 >= j4) {
                    break;
                }
                i2--;
            } else {
                if (j3 != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET && j2 >= j3) {
                    break;
                }
                i2--;
            }
        }
        if (i2 >= 0) {
            B2 b2A = c2.a(i2);
            int i3 = b2A.b;
            if (i3 == -1) {
                return i2;
            }
            for (int i4 = 0; i4 < i3; i4++) {
                int i5 = b2A.e[i4];
                if (i5 == 0 || i5 == 1) {
                    return i2;
                }
            }
        }
        return -1;
    }

    public final long d(int i2) {
        return this.g.a(i2).f2849a;
    }

    public final int e(int i2, int i3) {
        B2 b2A = this.g.a(i2);
        if (b2A.b != -1) {
            return b2A.e[i3];
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Ec0.class.equals(obj.getClass())) {
            return false;
        }
        Ec0 ec0 = (Ec0) obj;
        return Ug0.a(this.f3030a, ec0.f3030a) && Ug0.a(this.b, ec0.b) && this.c == ec0.c && this.d == ec0.d && this.e == ec0.e && this.f == ec0.f && Ug0.a(this.g, ec0.g);
    }

    public final int f(int i2) {
        return this.g.a(i2).a(-1);
    }

    public final long g() {
        return this.e;
    }

    public final boolean h(int i2) {
        return this.g.a(i2).h;
    }

    public final int hashCode() {
        Object obj = this.f3030a;
        int iHashCode = (EnumC4719u30.AD_RESPONSE_TIMED_OUT_VALUE + (obj == null ? 0 : obj.hashCode())) * 31;
        Object obj2 = this.b;
        int iHashCode2 = (((iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.c) * 31;
        long j2 = this.d;
        int i2 = (iHashCode2 + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.e;
        return this.g.hashCode() + ((((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.f ? 1 : 0)) * 31);
    }

    public final void i(Object obj, Object obj2, int i2, long j2, long j3, C2 c2, boolean z) {
        this.f3030a = obj;
        this.b = obj2;
        this.c = i2;
        this.d = j2;
        this.e = j3;
        this.g = c2;
        this.f = z;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2538Kb
    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        int i2 = this.c;
        if (i2 != 0) {
            bundle.putInt(h, i2);
        }
        long j2 = this.d;
        if (j2 != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
            bundle.putLong(i, j2);
        }
        long j3 = this.e;
        if (j3 != 0) {
            bundle.putLong(j, j3);
        }
        boolean z = this.f;
        if (z) {
            bundle.putBoolean(k, z);
        }
        if (!this.g.equals(C2.g)) {
            bundle.putBundle(l, this.g.toBundle());
        }
        return bundle;
    }
}
