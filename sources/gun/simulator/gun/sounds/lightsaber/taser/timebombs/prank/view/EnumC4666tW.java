package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.tW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC4666tW {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final EnumC4666tW f5036a;
    public static final /* synthetic */ EnumC4666tW[] b;

    static {
        EnumC4666tW enumC4666tW = new EnumC4666tW("DEFAULT", 0);
        f5036a = enumC4666tW;
        b = new EnumC4666tW[]{enumC4666tW, new EnumC4666tW("SIGNED", 1), new EnumC4666tW("FIXED", 2)};
    }

    public static EnumC4666tW valueOf(String str) {
        return (EnumC4666tW) Enum.valueOf(EnumC4666tW.class, str);
    }

    public static EnumC4666tW[] values() {
        return (EnumC4666tW[]) b.clone();
    }
}
