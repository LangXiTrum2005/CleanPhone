package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.wV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC4929wV {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final EnumC4929wV f5182a;
    public static final /* synthetic */ EnumC4929wV[] b;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC4929wV EF2;

    static {
        EnumC4929wV enumC4929wV = new EnumC4929wV("SRGB", 0);
        EnumC4929wV enumC4929wV2 = new EnumC4929wV("DISPLAY_P3", 1);
        f5182a = enumC4929wV2;
        b = new EnumC4929wV[]{enumC4929wV, enumC4929wV2};
    }

    public static EnumC4929wV valueOf(String str) {
        return (EnumC4929wV) Enum.valueOf(EnumC4929wV.class, str);
    }

    public static EnumC4929wV[] values() {
        return (EnumC4929wV[]) b.clone();
    }
}
