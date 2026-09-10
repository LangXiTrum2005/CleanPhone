package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: loaded from: classes.dex */
public final class XP {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Class f3967a;
    public Class b;
    public Class c;

    public XP(Class cls, Class cls2, Class cls3) {
        this.f3967a = cls;
        this.b = cls2;
        this.c = cls3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || XP.class != obj.getClass()) {
            return false;
        }
        XP xp = (XP) obj;
        return this.f3967a.equals(xp.f3967a) && this.b.equals(xp.b) && Tg0.b(this.c, xp.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.f3967a.hashCode() * 31)) * 31;
        Class cls = this.c;
        return iHashCode + (cls != null ? cls.hashCode() : 0);
    }

    public final String toString() {
        return "MultiClassKey{first=" + this.f3967a + ", second=" + this.b + '}';
    }
}
