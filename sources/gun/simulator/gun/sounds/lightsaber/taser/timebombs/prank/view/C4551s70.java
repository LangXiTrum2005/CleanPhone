package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.s70, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4551s70 {
    public static final C4551s70 c = new C4551s70(-1, -1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4963a;
    public final int b;

    static {
        new C4551s70(0, 0);
    }

    public C4551s70(int i, int i2) {
        FW.h((i == -1 || i >= 0) && (i2 == -1 || i2 >= 0));
        this.f4963a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4551s70)) {
            return false;
        }
        C4551s70 c4551s70 = (C4551s70) obj;
        return this.f4963a == c4551s70.f4963a && this.b == c4551s70.b;
    }

    public final int hashCode() {
        int i = this.f4963a;
        return ((i >>> 16) | (i << 16)) ^ this.b;
    }

    public final String toString() {
        return this.f4963a + "x" + this.b;
    }
}
