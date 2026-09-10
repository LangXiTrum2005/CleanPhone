package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.lf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3977lf {
    private C4153nf downCoordinate;
    private C4153nf upCoordinate;

    public C3977lf(C4153nf c4153nf, C4153nf c4153nf2) {
        AbstractC2995aW.q(c4153nf, "downCoordinate");
        AbstractC2995aW.q(c4153nf2, "upCoordinate");
        this.downCoordinate = c4153nf;
        this.upCoordinate = c4153nf2;
    }

    public static /* synthetic */ C3977lf copy$default(C3977lf c3977lf, C4153nf c4153nf, C4153nf c4153nf2, int i, Object obj) {
        if ((i & 1) != 0) {
            c4153nf = c3977lf.downCoordinate;
        }
        if ((i & 2) != 0) {
            c4153nf2 = c3977lf.upCoordinate;
        }
        return c3977lf.copy(c4153nf, c4153nf2);
    }

    public final C4153nf component1() {
        return this.downCoordinate;
    }

    public final C4153nf component2() {
        return this.upCoordinate;
    }

    public final C3977lf copy(C4153nf c4153nf, C4153nf c4153nf2) {
        AbstractC2995aW.q(c4153nf, "downCoordinate");
        AbstractC2995aW.q(c4153nf2, "upCoordinate");
        return new C3977lf(c4153nf, c4153nf2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3977lf)) {
            return false;
        }
        C3977lf c3977lf = (C3977lf) obj;
        return AbstractC2995aW.i(this.downCoordinate, c3977lf.downCoordinate) && AbstractC2995aW.i(this.upCoordinate, c3977lf.upCoordinate);
    }

    public final C4153nf getDownCoordinate() {
        return this.downCoordinate;
    }

    public final C4153nf getUpCoordinate() {
        return this.upCoordinate;
    }

    public int hashCode() {
        return this.upCoordinate.hashCode() + (this.downCoordinate.hashCode() * 31);
    }

    public final boolean ready() {
        return (this.downCoordinate.getX() == Integer.MIN_VALUE || this.downCoordinate.getY() == Integer.MIN_VALUE || this.upCoordinate.getX() == Integer.MIN_VALUE || this.upCoordinate.getY() == Integer.MIN_VALUE) ? false : true;
    }

    public final void setDownCoordinate(C4153nf c4153nf) {
        AbstractC2995aW.q(c4153nf, "<set-?>");
        this.downCoordinate = c4153nf;
    }

    public final void setUpCoordinate(C4153nf c4153nf) {
        AbstractC2995aW.q(c4153nf, "<set-?>");
        this.upCoordinate = c4153nf;
    }

    public String toString() {
        return "ClickCoordinate(downCoordinate=" + this.downCoordinate + ", upCoordinate=" + this.upCoordinate + ')';
    }
}
