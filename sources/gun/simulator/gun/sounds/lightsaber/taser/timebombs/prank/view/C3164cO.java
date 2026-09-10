package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.os.Bundle;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.cO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3164cO implements InterfaceC2538Kb {
    public static final C3164cO f = new C3164cO(com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET, com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET, com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET, -3.4028235E38f, -3.4028235E38f);
    public static final String g;
    public static final String h;
    public static final String i;
    public static final String j;
    public static final String k;
    public static final Nd0 l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f4220a;
    public final long b;
    public final long c;
    public final float d;
    public final float e;

    static {
        int i2 = Ug0.f3833a;
        g = Integer.toString(0, 36);
        h = Integer.toString(1, 36);
        i = Integer.toString(2, 36);
        j = Integer.toString(3, 36);
        k = Integer.toString(4, 36);
        l = new Nd0(27);
    }

    public C3164cO(long j2, long j3, long j4, float f2, float f3) {
        this.f4220a = j2;
        this.b = j3;
        this.c = j4;
        this.d = f2;
        this.e = f3;
    }

    public final C3076bO a() {
        C3076bO c3076bO = new C3076bO();
        c3076bO.f4168a = this.f4220a;
        c3076bO.b = this.b;
        c3076bO.c = this.c;
        c3076bO.d = this.d;
        c3076bO.e = this.e;
        return c3076bO;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3164cO)) {
            return false;
        }
        C3164cO c3164cO = (C3164cO) obj;
        return this.f4220a == c3164cO.f4220a && this.b == c3164cO.b && this.c == c3164cO.c && this.d == c3164cO.d && this.e == c3164cO.e;
    }

    public final int hashCode() {
        long j2 = this.f4220a;
        long j3 = this.b;
        int i2 = ((((int) (j2 ^ (j2 >>> 32))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        long j4 = this.c;
        int i3 = (i2 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        float f2 = this.d;
        int iFloatToIntBits = (i3 + (f2 != 0.0f ? Float.floatToIntBits(f2) : 0)) * 31;
        float f3 = this.e;
        return iFloatToIntBits + (f3 != 0.0f ? Float.floatToIntBits(f3) : 0);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2538Kb
    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        long j2 = this.f4220a;
        if (j2 != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
            bundle.putLong(g, j2);
        }
        long j3 = this.b;
        if (j3 != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
            bundle.putLong(h, j3);
        }
        long j4 = this.c;
        if (j4 != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
            bundle.putLong(i, j4);
        }
        float f2 = this.d;
        if (f2 != -3.4028235E38f) {
            bundle.putFloat(j, f2);
        }
        float f3 = this.e;
        if (f3 != -3.4028235E38f) {
            bundle.putFloat(k, f3);
        }
        return bundle;
    }
}
