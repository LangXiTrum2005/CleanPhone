package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.nf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4153nf {
    private final int x;
    private final int y;

    public C4153nf(int i, int i2) {
        this.x = i;
        this.y = i2;
    }

    public static /* synthetic */ C4153nf copy$default(C4153nf c4153nf, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = c4153nf.x;
        }
        if ((i3 & 2) != 0) {
            i2 = c4153nf.y;
        }
        return c4153nf.copy(i, i2);
    }

    public final int component1() {
        return this.x;
    }

    public final int component2() {
        return this.y;
    }

    public final C4153nf copy(int i, int i2) {
        return new C4153nf(i, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4153nf)) {
            return false;
        }
        C4153nf c4153nf = (C4153nf) obj;
        return this.x == c4153nf.x && this.y == c4153nf.y;
    }

    public final int getX() {
        return this.x;
    }

    public final int getY() {
        return this.y;
    }

    public int hashCode() {
        return (this.x * 31) + this.y;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Coordinate(x=");
        sb.append(this.x);
        sb.append(", y=");
        return DM.k(sb, this.y, ')');
    }
}
