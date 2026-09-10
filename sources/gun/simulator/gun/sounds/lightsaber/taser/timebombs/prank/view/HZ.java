package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public final class HZ implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f3176a;

    public HZ(Throwable th) {
        AbstractC2995aW.q(th, "exception");
        this.f3176a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof HZ) {
            if (AbstractC2995aW.i(this.f3176a, ((HZ) obj).f3176a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f3176a.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f3176a + ')';
    }
}
