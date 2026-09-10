package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.cD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3153cD {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4212a;
    public final Object b;

    public C3153cD(int i, Object obj) {
        this.f4212a = i;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3153cD)) {
            return false;
        }
        C3153cD c3153cD = (C3153cD) obj;
        return this.f4212a == c3153cD.f4212a && AbstractC2995aW.i(this.b, c3153cD.b);
    }

    public final int hashCode() {
        int i = this.f4212a * 31;
        Object obj = this.b;
        return i + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "IndexedValue(index=" + this.f4212a + ", value=" + this.b + ')';
    }
}
