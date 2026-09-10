package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Kt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC2556Kt {
    SCALAR(false),
    VECTOR(true),
    PACKED_VECTOR(true),
    MAP(false);

    private final boolean isList;

    EnumC2556Kt(boolean z) {
        this.isList = z;
    }

    public boolean isList() {
        return this.isList;
    }
}
