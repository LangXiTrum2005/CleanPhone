package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: loaded from: classes4.dex */
public final class We0 implements Comparable {
    public static final /* synthetic */ int b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f3931a;

    public /* synthetic */ We0(long j) {
        this.f3931a = j;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j = ((We0) obj).f3931a;
        long j2 = this.f3931a ^ Long.MIN_VALUE;
        long j3 = j ^ Long.MIN_VALUE;
        if (j2 < j3) {
            return -1;
        }
        return j2 == j3 ? 0 : 1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof We0) {
            return this.f3931a == ((We0) obj).f3931a;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f3931a;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        long j = this.f3931a;
        if (j >= 0) {
            WD.k(10);
            String string = Long.toString(j, 10);
            AbstractC2995aW.p(string, "toString(this, checkRadix(radix))");
            return string;
        }
        long j2 = 10;
        long j3 = ((j >>> 1) / j2) << 1;
        long j4 = j - (j3 * j2);
        if (j4 >= j2) {
            j4 -= j2;
            j3++;
        }
        WD.k(10);
        String string2 = Long.toString(j3, 10);
        AbstractC2995aW.p(string2, "toString(this, checkRadix(radix))");
        WD.k(10);
        String string3 = Long.toString(j4, 10);
        AbstractC2995aW.p(string3, "toString(this, checkRadix(radix))");
        return string2.concat(string3);
    }
}
