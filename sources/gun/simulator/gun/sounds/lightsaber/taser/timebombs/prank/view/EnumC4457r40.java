package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.r40, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC4457r40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final EnumC4457r40 f4914a;
    public static final EnumC4457r40[] b;
    public static final /* synthetic */ EnumC4457r40[] c;

    static {
        EnumC4457r40 enumC4457r40 = new EnumC4457r40("hold", 0);
        f4914a = enumC4457r40;
        c = new EnumC4457r40[]{enumC4457r40, new EnumC4457r40("once", 1), new EnumC4457r40("loop", 2), new EnumC4457r40("pingpong", 3), new EnumC4457r40("onceReverse", 4), new EnumC4457r40("loopReverse", 5), new EnumC4457r40("pingpongReverse", 6)};
        b = values();
    }

    public static EnumC4457r40 valueOf(String str) {
        return (EnumC4457r40) Enum.valueOf(EnumC4457r40.class, str);
    }

    public static EnumC4457r40[] values() {
        return (EnumC4457r40[]) c.clone();
    }
}
