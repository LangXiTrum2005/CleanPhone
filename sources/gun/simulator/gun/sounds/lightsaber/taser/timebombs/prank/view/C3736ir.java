package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.ir, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3736ir {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4524a;

    public C3736ir(String str) {
        if (str == null) {
            throw new NullPointerException("name is null");
        }
        this.f4524a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3736ir)) {
            return false;
        }
        return this.f4524a.equals(((C3736ir) obj).f4524a);
    }

    public final int hashCode() {
        return this.f4524a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return DM.m(new StringBuilder("Encoding{name=\""), this.f4524a, "\"}");
    }
}
