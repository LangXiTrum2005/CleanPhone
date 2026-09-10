package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: loaded from: classes4.dex */
public final class Bc0 implements InterfaceC5203zc0, Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f2880a;

    public /* synthetic */ Bc0(long j) {
        this.f2880a = j;
    }

    public static long a(long j) {
        long jA = IP.a();
        EnumC4613sq enumC4613sq = EnumC4613sq.NANOSECONDS;
        AbstractC2995aW.q(enumC4613sq, "unit");
        return (1 | (j - 1)) == Long.MAX_VALUE ? C4350pq.i(AbstractC2340Cl.E(j)) : AbstractC2340Cl.Q(jA, j, enumC4613sq);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long jE;
        Bc0 bc0 = (Bc0) obj;
        AbstractC2995aW.q(bc0, "other");
        int i = IP.b;
        EnumC4613sq enumC4613sq = EnumC4613sq.NANOSECONDS;
        AbstractC2995aW.q(enumC4613sq, "unit");
        long j = bc0.f2880a;
        long j2 = (j - 1) | 1;
        long j3 = this.f2880a;
        if (j2 != Long.MAX_VALUE) {
            jE = (1 | (j3 - 1)) == Long.MAX_VALUE ? AbstractC2340Cl.E(j3) : AbstractC2340Cl.Q(j3, j, enumC4613sq);
        } else if (j3 == j) {
            int i2 = C4350pq.d;
            jE = 0;
        } else {
            jE = C4350pq.i(AbstractC2340Cl.E(j));
        }
        return C4350pq.c(jE, 0L);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Bc0) {
            return this.f2880a == ((Bc0) obj).f2880a;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f2880a;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return "ValueTimeMark(reading=" + this.f2880a + ')';
    }
}
