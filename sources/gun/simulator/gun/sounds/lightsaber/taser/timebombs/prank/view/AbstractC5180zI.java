package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.List;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.zI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC5180zI implements D40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final D40 f5322a;
    public final int b = 1;

    public AbstractC5180zI(D40 d40) {
        this.f5322a = d40;
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
        throw new IllegalArgumentException(str.concat(" is not a valid list index"));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.D40
    public final int d() {
        return this.b;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.D40
    public final String e(int i) {
        return String.valueOf(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC5180zI)) {
            return false;
        }
        AbstractC5180zI abstractC5180zI = (AbstractC5180zI) obj;
        return AbstractC2995aW.i(this.f5322a, abstractC5180zI.f5322a) && AbstractC2995aW.i(h(), abstractC5180zI.h());
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.D40
    public final List f(int i) {
        if (i >= 0) {
            return C2812Uq.f3846a;
        }
        StringBuilder sbQ = AbstractC5044xl.q("Illegal index ", i, ", ");
        sbQ.append(h());
        sbQ.append(" expects only non-negative indices");
        throw new IllegalArgumentException(sbQ.toString().toString());
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.D40
    public final D40 g(int i) {
        if (i >= 0) {
            return this.f5322a;
        }
        StringBuilder sbQ = AbstractC5044xl.q("Illegal index ", i, ", ");
        sbQ.append(h());
        sbQ.append(" expects only non-negative indices");
        throw new IllegalArgumentException(sbQ.toString().toString());
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.D40
    public final List getAnnotations() {
        return C2812Uq.f3846a;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.D40
    public final L40 getKind() {
        return C3442fa0.b;
    }

    public final int hashCode() {
        return h().hashCode() + (this.f5322a.hashCode() * 31);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.D40
    public final boolean i(int i) {
        if (i >= 0) {
            return false;
        }
        StringBuilder sbQ = AbstractC5044xl.q("Illegal index ", i, ", ");
        sbQ.append(h());
        sbQ.append(" expects only non-negative indices");
        throw new IllegalArgumentException(sbQ.toString().toString());
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.D40
    public final boolean isInline() {
        return false;
    }

    public final String toString() {
        return h() + '(' + this.f5322a + ')';
    }
}
