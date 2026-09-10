package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: loaded from: classes3.dex */
public final class RW {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f3660a;
    public final Class b;

    public RW(Class cls, Class cls2) {
        this.f3660a = cls;
        this.b = cls2;
    }

    public static RW a(Class cls) {
        return new RW(QW.class, cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || RW.class != obj.getClass()) {
            return false;
        }
        RW rw = (RW) obj;
        if (this.b.equals(rw.b)) {
            return this.f3660a.equals(rw.f3660a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f3660a.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        Class cls = this.b;
        Class cls2 = this.f3660a;
        if (cls2 == QW.class) {
            return cls.getName();
        }
        return "@" + cls2.getName() + " " + cls.getName();
    }
}
