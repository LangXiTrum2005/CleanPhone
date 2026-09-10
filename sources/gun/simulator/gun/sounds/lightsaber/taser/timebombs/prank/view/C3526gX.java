package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.gX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3526gX {
    public static final C3526gX INSTANCE = new C3526gX();

    private C3526gX() {
    }

    public static /* synthetic */ boolean isInRange$default(C3526gX c3526gX, float f, float f2, float f3, int i, Object obj) {
        if ((i & 4) != 0) {
            f3 = Float.MAX_VALUE;
        }
        return c3526gX.isInRange(f, f2, f3);
    }

    public final boolean isInRange(float f, float f2, float f3) {
        return f2 <= f && f <= f3;
    }

    public final boolean isInRange(int i, int i2, int i3) {
        return i2 <= i && i <= i3;
    }

    public static /* synthetic */ boolean isInRange$default(C3526gX c3526gX, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            i3 = Integer.MAX_VALUE;
        }
        return c3526gX.isInRange(i, i2, i3);
    }
}
