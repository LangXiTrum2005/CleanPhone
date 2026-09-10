package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.je, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3799je extends C3975le {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f4562a;

    public C3799je(Throwable th) {
        this.f4562a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C3799je) {
            if (AbstractC2995aW.i(this.f4562a, ((C3799je) obj).f4562a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Throwable th = this.f4562a;
        if (th != null) {
            return th.hashCode();
        }
        return 0;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3975le
    public final String toString() {
        return "Closed(" + this.f4562a + ')';
    }
}
