package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import androidx.core.util.Pair;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.lQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3957lQ {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f4645a;
    public Object b;

    public final boolean equals(Object obj) {
        if (!(obj instanceof Pair)) {
            return false;
        }
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = this.f4645a;
        if (obj2 != obj3 && (obj2 == null || !obj2.equals(obj3))) {
            return false;
        }
        Object obj4 = pair.second;
        Object obj5 = this.b;
        return obj4 == obj5 || (obj4 != null && obj4.equals(obj5));
    }

    public final int hashCode() {
        Object obj = this.f4645a;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.b;
        return iHashCode ^ (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "Pair{" + this.f4645a + " " + this.b + "}";
    }
}
