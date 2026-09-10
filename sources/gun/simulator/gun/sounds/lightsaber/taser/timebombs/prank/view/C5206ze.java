package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.ze, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C5206ze extends AbstractC5030xe implements InterfaceC2490If {
    static {
        new C5206ze((char) 1, (char) 0);
    }

    public final boolean a(char c) {
        return AbstractC2995aW.s(this.f5235a, c) <= 0 && AbstractC2995aW.s(c, this.b) <= 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C5206ze) {
            char c = this.f5235a;
            char c2 = this.b;
            if (AbstractC2995aW.s(c, c2) > 0) {
                C5206ze c5206ze = (C5206ze) obj;
                if (AbstractC2995aW.s(c5206ze.f5235a, c5206ze.b) <= 0) {
                }
                return true;
            }
            C5206ze c5206ze2 = (C5206ze) obj;
            if (c == c5206ze2.f5235a && c2 == c5206ze2.b) {
                return true;
            }
        }
        return false;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2490If
    public final Comparable getEndInclusive() {
        return Character.valueOf(this.b);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2490If
    public final Comparable getStart() {
        return Character.valueOf(this.f5235a);
    }

    public final int hashCode() {
        char c = this.f5235a;
        char c2 = this.b;
        if (AbstractC2995aW.s(c, c2) > 0) {
            return -1;
        }
        return (c * 31) + c2;
    }

    public final String toString() {
        return this.f5235a + ".." + this.b;
    }
}
