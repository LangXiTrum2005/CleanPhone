package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public final class IZ implements Serializable {
    public static final /* synthetic */ int b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f3222a;

    public static final Throwable a(Object obj) {
        if (obj instanceof HZ) {
            return ((HZ) obj).f3176a;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof IZ) {
            return AbstractC2995aW.i(this.f3222a, ((IZ) obj).f3222a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f3222a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.f3222a;
        if (obj instanceof HZ) {
            return ((HZ) obj).toString();
        }
        return "Success(" + obj + ')';
    }
}
