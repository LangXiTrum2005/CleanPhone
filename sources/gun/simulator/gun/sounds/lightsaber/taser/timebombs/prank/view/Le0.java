package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: loaded from: classes4.dex */
public final class Le0 implements Comparable {
    public static final /* synthetic */ int b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f3365a;

    public /* synthetic */ Le0(byte b2) {
        this.f3365a = b2;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return AbstractC2995aW.s(this.f3365a & 255, ((Le0) obj).f3365a & 255);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Le0) {
            return this.f3365a == ((Le0) obj).f3365a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f3365a;
    }

    public final String toString() {
        return String.valueOf(this.f3365a & 255);
    }
}
