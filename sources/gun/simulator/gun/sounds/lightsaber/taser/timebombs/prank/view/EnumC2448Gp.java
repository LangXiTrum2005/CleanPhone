package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Gp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC2448Gp {
    CRITICAL(-2147483647),
    HIGHEST(0),
    HIGH(1),
    LOWEST(Integer.MAX_VALUE);

    private final int priority;

    EnumC2448Gp(int i) {
        this.priority = i;
    }

    public final int getPriority() {
        return this.priority;
    }
}
