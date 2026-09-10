package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: loaded from: classes4.dex */
public final class Re0 implements Comparable {
    public static final /* synthetic */ int b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3667a;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return AbstractC2995aW.s(this.f3667a ^ Integer.MIN_VALUE, ((Re0) obj).f3667a ^ Integer.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Re0) {
            return this.f3667a == ((Re0) obj).f3667a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f3667a;
    }

    public final String toString() {
        return String.valueOf(((long) this.f3667a) & 4294967295L);
    }
}
