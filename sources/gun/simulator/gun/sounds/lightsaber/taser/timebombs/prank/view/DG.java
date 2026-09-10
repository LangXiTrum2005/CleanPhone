package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: loaded from: classes4.dex */
public final class DG implements Comparable {
    public static final DG b = new DG();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2963a;

    public DG() {
        if (!new C5175zD(0, 255, 1).b(1) || !new C5175zD(0, 255, 1).b(9) || !new C5175zD(0, 255, 1).b(0)) {
            throw new IllegalArgumentException("Version components are out of range: 1.9.0".toString());
        }
        this.f2963a = 67840;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        DG dg = (DG) obj;
        AbstractC2995aW.q(dg, "other");
        return this.f2963a - dg.f2963a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        DG dg = obj instanceof DG ? (DG) obj : null;
        return dg != null && this.f2963a == dg.f2963a;
    }

    public final int hashCode() {
        return this.f2963a;
    }

    public final String toString() {
        return "1.9.0";
    }
}
