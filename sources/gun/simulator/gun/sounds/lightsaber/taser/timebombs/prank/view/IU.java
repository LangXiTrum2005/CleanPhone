package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: loaded from: classes2.dex */
public final class IU {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3125bv f3218a;

    public IU(C3125bv c3125bv) {
        this.f3218a = c3125bv;
    }

    public final boolean a(int... iArr) {
        C3125bv c3125bv = this.f3218a;
        c3125bv.getClass();
        for (int i : iArr) {
            if (c3125bv.f4194a.get(i)) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof IU) {
            return this.f3218a.equals(((IU) obj).f3218a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f3218a.hashCode();
    }
}
