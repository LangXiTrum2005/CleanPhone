package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.gb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC3531gb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final EnumC3531gb f4419a;
    public static final EnumC3531gb b;
    public static final EnumC3531gb c;
    public static final EnumC3531gb[] d;
    public static final /* synthetic */ EnumC3531gb[] e;

    static {
        EnumC3531gb enumC3531gb = new EnumC3531gb("normal", 0);
        f4419a = enumC3531gb;
        EnumC3531gb enumC3531gb2 = new EnumC3531gb("onlyTranslation", 1);
        b = enumC3531gb2;
        EnumC3531gb enumC3531gb3 = new EnumC3531gb("noRotationOrReflection", 2);
        EnumC3531gb enumC3531gb4 = new EnumC3531gb("noScale", 3);
        c = enumC3531gb4;
        e = new EnumC3531gb[]{enumC3531gb, enumC3531gb2, enumC3531gb3, enumC3531gb4, new EnumC3531gb("noScaleOrReflection", 4)};
        d = values();
    }

    public static EnumC3531gb valueOf(String str) {
        return (EnumC3531gb) Enum.valueOf(EnumC3531gb.class, str);
    }

    public static EnumC3531gb[] values() {
        return (EnumC3531gb[]) e.clone();
    }
}
