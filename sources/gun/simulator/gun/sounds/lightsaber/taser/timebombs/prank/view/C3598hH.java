package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.hH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3598hH {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4451a;

    public C3598hH(String str) {
        this.f4451a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C3598hH) {
            return this.f4451a.equals(((C3598hH) obj).f4451a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4451a.hashCode();
    }

    public final String toString() {
        return DM.m(new StringBuilder("StringHeaderFactory{value='"), this.f4451a, "'}");
    }
}
