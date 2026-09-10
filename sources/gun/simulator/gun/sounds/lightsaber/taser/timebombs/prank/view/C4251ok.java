package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.ok, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4251ok extends AbstractC4008m {
    public static final G7 b = new G7();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4803a;

    public C4251ok(String str) {
        super(b);
        this.f4803a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4251ok) && AbstractC2995aW.i(this.f4803a, ((C4251ok) obj).f4803a);
    }

    public final int hashCode() {
        return this.f4803a.hashCode();
    }

    public final String toString() {
        return DM.l(new StringBuilder("CoroutineName("), this.f4803a, ')');
    }
}
