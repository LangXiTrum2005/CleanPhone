package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Dl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC2366Dl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final EnumC2366Dl f2987a;
    public static final EnumC2366Dl b;
    public static final EnumC2366Dl c;
    public static final /* synthetic */ EnumC2366Dl[] d;

    static {
        EnumC2366Dl enumC2366Dl = new EnumC2366Dl("PREFER_ARGB_8888", 0);
        f2987a = enumC2366Dl;
        EnumC2366Dl enumC2366Dl2 = new EnumC2366Dl("PREFER_RGB_565", 1);
        b = enumC2366Dl2;
        d = new EnumC2366Dl[]{enumC2366Dl, enumC2366Dl2};
        c = enumC2366Dl;
    }

    public static EnumC2366Dl valueOf(String str) {
        return (EnumC2366Dl) Enum.valueOf(EnumC2366Dl.class, str);
    }

    public static EnumC2366Dl[] values() {
        return (EnumC2366Dl[]) d.clone();
    }
}
