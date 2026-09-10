package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.io.Serializable;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.vT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4839vT implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f5132a;
    public final Object b;

    public C4839vT(Object obj, Object obj2) {
        this.f5132a = obj;
        this.b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4839vT)) {
            return false;
        }
        C4839vT c4839vT = (C4839vT) obj;
        return AbstractC2995aW.i(this.f5132a, c4839vT.f5132a) && AbstractC2995aW.i(this.b, c4839vT.b);
    }

    public final int hashCode() {
        Object obj = this.f5132a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.b;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f5132a + ", " + this.b + ')';
    }
}
