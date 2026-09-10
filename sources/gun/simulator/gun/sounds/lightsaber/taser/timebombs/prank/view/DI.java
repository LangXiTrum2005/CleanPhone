package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: loaded from: classes2.dex */
public final class DI {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f2965a;
    public C4581sZ b = new C4581sZ(3);
    public boolean c;
    public boolean d;

    public DI(Object obj) {
        this.f2965a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DI.class != obj.getClass()) {
            return false;
        }
        return this.f2965a.equals(((DI) obj).f2965a);
    }

    public final int hashCode() {
        return this.f2965a.hashCode();
    }
}
