package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.jt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3825jt {
    private final int number;
    private final Object object;

    public C3825jt(Object obj, int i) {
        this.object = obj;
        this.number = i;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C3825jt)) {
            return false;
        }
        C3825jt c3825jt = (C3825jt) obj;
        return this.object == c3825jt.object && this.number == c3825jt.number;
    }

    public int hashCode() {
        return (System.identityHashCode(this.object) * 65535) + this.number;
    }
}
