package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.yY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC5108yY {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final EnumC5108yY f5280a;
    public static final EnumC5108yY b;
    public static final EnumC5108yY c;
    public static final /* synthetic */ EnumC5108yY[] d;

    static {
        EnumC5108yY enumC5108yY = new EnumC5108yY("AUTOMATIC", 0);
        f5280a = enumC5108yY;
        EnumC5108yY enumC5108yY2 = new EnumC5108yY("HARDWARE", 1);
        b = enumC5108yY2;
        EnumC5108yY enumC5108yY3 = new EnumC5108yY("SOFTWARE", 2);
        c = enumC5108yY3;
        d = new EnumC5108yY[]{enumC5108yY, enumC5108yY2, enumC5108yY3};
    }

    public static EnumC5108yY valueOf(String str) {
        return (EnumC5108yY) Enum.valueOf(EnumC5108yY.class, str);
    }

    public static EnumC5108yY[] values() {
        return (EnumC5108yY[]) d.clone();
    }
}
