package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.me, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4063me {
    public static final C3975le b = new C3975le();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f4704a;

    public final boolean equals(Object obj) {
        if (obj instanceof C4063me) {
            return AbstractC2995aW.i(this.f4704a, ((C4063me) obj).f4704a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f4704a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.f4704a;
        if (obj instanceof C3799je) {
            return ((C3799je) obj).toString();
        }
        return "Value(" + obj + ')';
    }
}
