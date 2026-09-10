package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.pK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4303pK implements InterfaceC4226oV {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final F4 f4831a;
    public int b;
    public Class c;

    public C4303pK(F4 f4) {
        this.f4831a = f4;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4226oV
    public final void a() {
        this.f4831a.h(this);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4303pK)) {
            return false;
        }
        C4303pK c4303pK = (C4303pK) obj;
        return this.b == c4303pK.b && this.c == c4303pK.c;
    }

    public final int hashCode() {
        int i = this.b * 31;
        Class cls = this.c;
        return i + (cls != null ? cls.hashCode() : 0);
    }

    public final String toString() {
        return "Key{size=" + this.b + "array=" + this.c + '}';
    }
}
