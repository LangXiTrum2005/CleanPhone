package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.iU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC3699iU {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final EnumC3699iU f4502a;
    public static final EnumC3699iU b;
    public static final EnumC3699iU c;
    public static final EnumC3699iU d;
    public static final EnumC3699iU e;
    public static final /* synthetic */ EnumC3699iU[] f;

    static {
        EnumC3699iU enumC3699iU = new EnumC3699iU("ATTEMPT_MIGRATION", 0);
        f4502a = enumC3699iU;
        EnumC3699iU enumC3699iU2 = new EnumC3699iU("NOT_GENERATED", 1);
        b = enumC3699iU2;
        EnumC3699iU enumC3699iU3 = new EnumC3699iU("UNREGISTERED", 2);
        c = enumC3699iU3;
        EnumC3699iU enumC3699iU4 = new EnumC3699iU("REGISTERED", 3);
        d = enumC3699iU4;
        EnumC3699iU enumC3699iU5 = new EnumC3699iU("REGISTER_ERROR", 4);
        e = enumC3699iU5;
        f = new EnumC3699iU[]{enumC3699iU, enumC3699iU2, enumC3699iU3, enumC3699iU4, enumC3699iU5};
    }

    public static EnumC3699iU valueOf(String str) {
        return (EnumC3699iU) Enum.valueOf(EnumC3699iU.class, str);
    }

    public static EnumC3699iU[] values() {
        return (EnumC3699iU[]) f.clone();
    }
}
