package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: loaded from: classes2.dex */
public final class P30 {
    public static final P30 c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f3534a;
    public final long b;

    static {
        P30 p30 = new P30(0L, 0L);
        new P30(Long.MAX_VALUE, Long.MAX_VALUE);
        new P30(Long.MAX_VALUE, 0L);
        new P30(0L, Long.MAX_VALUE);
        c = p30;
    }

    public P30(long j, long j2) {
        FW.h(j >= 0);
        FW.h(j2 >= 0);
        this.f3534a = j;
        this.b = j2;
    }

    public final long a(long j, long j2, long j3) {
        long j4 = this.b;
        long j5 = this.f3534a;
        if (j5 == 0 && j4 == 0) {
            return j;
        }
        int i = Ug0.f3833a;
        long j6 = j - j5;
        if (((j5 ^ j) & (j ^ j6)) < 0) {
            j6 = Long.MIN_VALUE;
        }
        long j7 = j + j4;
        if (((j4 ^ j7) & (j ^ j7)) < 0) {
            j7 = Long.MAX_VALUE;
        }
        boolean z = false;
        boolean z2 = j6 <= j2 && j2 <= j7;
        if (j6 <= j3 && j3 <= j7) {
            z = true;
        }
        if (z2 && z) {
            return Math.abs(j2 - j) <= Math.abs(j3 - j) ? j2 : j3;
        }
        if (z2) {
            return j2;
        }
        return z ? j3 : j6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || P30.class != obj.getClass()) {
            return false;
        }
        P30 p30 = (P30) obj;
        return this.f3534a == p30.f3534a && this.b == p30.b;
    }

    public final int hashCode() {
        return (((int) this.f3534a) * 31) + ((int) this.b);
    }
}
