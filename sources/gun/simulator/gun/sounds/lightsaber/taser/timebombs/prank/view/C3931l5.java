package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.l5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3931l5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C3493g5 f4630a;
    public C3493g5 b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        C3931l5 c3931l5 = (C3931l5) obj;
        C3493g5 c3493g5 = this.f4630a;
        if (c3493g5 == null) {
            if (c3931l5.f4630a != null) {
                return false;
            }
        } else if (!c3493g5.equals(c3931l5.f4630a)) {
            return false;
        }
        C3493g5 c3493g6 = this.b;
        if (c3493g6 == null) {
            if (c3931l5.b != null) {
                return false;
            }
        } else if (!c3493g6.equals(c3931l5.b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode() + ((this.f4630a.hashCode() + 31) * 31);
    }

    public final String toString() {
        return this.f4630a.f4402a + "->" + this.b.f4402a;
    }
}
