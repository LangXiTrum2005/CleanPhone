package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.uT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4751uT implements InterfaceC3098bf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f5080a;

    public C4751uT(Class cls) {
        AbstractC2995aW.q(cls, "jClass");
        this.f5080a = cls;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3098bf
    public final Class a() {
        return this.f5080a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C4751uT) {
            if (AbstractC2995aW.i(this.f5080a, ((C4751uT) obj).f5080a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f5080a.hashCode();
    }

    public final String toString() {
        return this.f5080a.toString() + " (Kotlin reflection is not available)";
    }
}
