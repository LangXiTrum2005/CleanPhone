package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Mk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2598Mk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RW f3418a;
    public final boolean b;

    public C2598Mk(RW rw, boolean z) {
        this.f3418a = rw;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2598Mk)) {
            return false;
        }
        C2598Mk c2598Mk = (C2598Mk) obj;
        return c2598Mk.f3418a.equals(this.f3418a) && c2598Mk.b == this.b;
    }

    public final int hashCode() {
        return ((this.f3418a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.b).hashCode();
    }
}
