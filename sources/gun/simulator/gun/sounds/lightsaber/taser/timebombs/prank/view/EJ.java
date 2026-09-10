package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: loaded from: classes4.dex */
public final class EJ extends CJ implements InterfaceC2490If {
    public final boolean a(long j) {
        return this.f2916a <= j && j <= this.b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof EJ) {
            long j = this.f2916a;
            long j2 = this.b;
            if (j > j2) {
                EJ ej = (EJ) obj;
                if (ej.f2916a <= ej.b) {
                }
                return true;
            }
            EJ ej2 = (EJ) obj;
            if (j == ej2.f2916a && j2 == ej2.b) {
                return true;
            }
        }
        return false;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2490If
    public final Comparable getEndInclusive() {
        return Long.valueOf(this.b);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2490If
    public final Comparable getStart() {
        return Long.valueOf(this.f2916a);
    }

    public final int hashCode() {
        long j = this.f2916a;
        long j2 = this.b;
        if (j > j2) {
            return -1;
        }
        return (int) ((((long) 31) * (j ^ (j >>> 32))) + ((j2 >>> 32) ^ j2));
    }

    public final String toString() {
        return this.f2916a + ".." + this.b;
    }
}
