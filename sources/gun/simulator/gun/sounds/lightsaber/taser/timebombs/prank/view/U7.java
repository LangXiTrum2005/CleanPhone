package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class U7 extends AbstractC3441fa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f3812a;

    public U7(ArrayList arrayList) {
        this.f3812a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC3441fa)) {
            return false;
        }
        return this.f3812a.equals(((U7) ((AbstractC3441fa) obj)).f3812a);
    }

    public final int hashCode() {
        return this.f3812a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "BatchedLogRequest{logRequests=" + this.f3812a + "}";
    }
}
