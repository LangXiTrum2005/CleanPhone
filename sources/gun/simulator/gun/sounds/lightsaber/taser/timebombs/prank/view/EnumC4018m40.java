package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.m40, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC4018m40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final EnumC4018m40 f4678a;
    public static final EnumC4018m40 b;
    public static final EnumC4018m40 c;
    public static final /* synthetic */ EnumC4018m40[] d;

    static {
        EnumC4018m40 enumC4018m40 = new EnumC4018m40("UP", 0);
        f4678a = enumC4018m40;
        EnumC4018m40 enumC4018m41 = new EnumC4018m40("DOWN", 1);
        b = enumC4018m41;
        EnumC4018m40 enumC4018m42 = new EnumC4018m40("SIDE", 2);
        c = enumC4018m42;
        d = new EnumC4018m40[]{enumC4018m40, enumC4018m41, enumC4018m42};
    }

    public static EnumC4018m40 valueOf(String str) {
        return (EnumC4018m40) Enum.valueOf(EnumC4018m40.class, str);
    }

    public static EnumC4018m40[] values() {
        return (EnumC4018m40[]) d.clone();
    }
}
