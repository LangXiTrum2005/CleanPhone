package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.List;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.jM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC3777jM implements D40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4550a;
    public final D40 b;
    public final D40 c;
    public final int d = 2;

    public AbstractC3777jM(String str, D40 d40, D40 d41) {
        this.f4550a = str;
        this.b = d40;
        this.c = d41;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.D40
    public final boolean b() {
        return false;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.D40
    public final int c(String str) {
        AbstractC2995aW.q(str, "name");
        Integer numI0 = Z90.i0(str);
        if (numI0 != null) {
            return numI0.intValue();
        }
        throw new IllegalArgumentException(str.concat(" is not a valid map index"));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.D40
    public final int d() {
        return this.d;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.D40
    public final String e(int i) {
        return String.valueOf(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC3777jM)) {
            return false;
        }
        AbstractC3777jM abstractC3777jM = (AbstractC3777jM) obj;
        return AbstractC2995aW.i(this.f4550a, abstractC3777jM.f4550a) && AbstractC2995aW.i(this.b, abstractC3777jM.b) && AbstractC2995aW.i(this.c, abstractC3777jM.c);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.D40
    public final List f(int i) {
        if (i >= 0) {
            return C2812Uq.f3846a;
        }
        throw new IllegalArgumentException(DM.m(AbstractC5044xl.q("Illegal index ", i, ", "), this.f4550a, " expects only non-negative indices").toString());
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.D40
    public final D40 g(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(DM.m(AbstractC5044xl.q("Illegal index ", i, ", "), this.f4550a, " expects only non-negative indices").toString());
        }
        int i2 = i % 2;
        if (i2 == 0) {
            return this.b;
        }
        if (i2 == 1) {
            return this.c;
        }
        throw new IllegalStateException("Unreached".toString());
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.D40
    public final List getAnnotations() {
        return C2812Uq.f3846a;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.D40
    public final L40 getKind() {
        return C3442fa0.c;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.D40
    public final String h() {
        return this.f4550a;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f4550a.hashCode() * 31)) * 31);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.D40
    public final boolean i(int i) {
        if (i >= 0) {
            return false;
        }
        throw new IllegalArgumentException(DM.m(AbstractC5044xl.q("Illegal index ", i, ", "), this.f4550a, " expects only non-negative indices").toString());
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.D40
    public final boolean isInline() {
        return false;
    }

    public final String toString() {
        return this.f4550a + '(' + this.b + ", " + this.c + ')';
    }
}
