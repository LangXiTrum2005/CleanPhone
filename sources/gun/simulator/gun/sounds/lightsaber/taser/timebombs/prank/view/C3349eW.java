package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.eW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3349eW {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4322a;
    public final boolean b;

    public C3349eW(int i, boolean z) {
        this.f4322a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3349eW.class != obj.getClass()) {
            return false;
        }
        C3349eW c3349eW = (C3349eW) obj;
        return this.f4322a == c3349eW.f4322a && this.b == c3349eW.b;
    }

    public final int hashCode() {
        return (this.f4322a * 31) + (this.b ? 1 : 0);
    }
}
