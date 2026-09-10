package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.zD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C5175zD extends C4999xD implements InterfaceC2490If {
    public static final C5175zD d = new C5175zD(1, 0, 1);

    public final boolean b(int i) {
        return this.f5212a <= i && i <= this.b;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4999xD
    public final boolean equals(Object obj) {
        if (obj instanceof C5175zD) {
            if (!isEmpty() || !((C5175zD) obj).isEmpty()) {
                C5175zD c5175zD = (C5175zD) obj;
                if (this.f5212a == c5175zD.f5212a) {
                    if (this.b == c5175zD.b) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2490If
    public final Comparable getEndInclusive() {
        return Integer.valueOf(this.b);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2490If
    public final Comparable getStart() {
        return Integer.valueOf(this.f5212a);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4999xD
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f5212a * 31) + this.b;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4999xD
    public final boolean isEmpty() {
        return this.f5212a > this.b;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4999xD
    public final String toString() {
        return this.f5212a + ".." + this.b;
    }
}
