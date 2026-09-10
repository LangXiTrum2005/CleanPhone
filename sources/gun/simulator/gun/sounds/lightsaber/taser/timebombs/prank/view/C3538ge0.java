package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.io.Serializable;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.ge0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3538ge0 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f4424a;
    public final Object b;
    public final Object c;

    public C3538ge0(Object obj, Object obj2, Object obj3) {
        this.f4424a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3538ge0)) {
            return false;
        }
        C3538ge0 c3538ge0 = (C3538ge0) obj;
        return AbstractC2995aW.i(this.f4424a, c3538ge0.f4424a) && AbstractC2995aW.i(this.b, c3538ge0.b) && AbstractC2995aW.i(this.c, c3538ge0.c);
    }

    public final int hashCode() {
        Object obj = this.f4424a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.b;
        int iHashCode2 = (iHashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Object obj3 = this.c;
        return iHashCode2 + (obj3 != null ? obj3.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f4424a + ", " + this.b + ", " + this.c + ')';
    }
}
