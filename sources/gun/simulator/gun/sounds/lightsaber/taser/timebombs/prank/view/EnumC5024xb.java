package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.xb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC5024xb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final EnumC5024xb f5229a;
    public static final EnumC5024xb b;
    public static final EnumC5024xb c;
    public static final /* synthetic */ EnumC5024xb[] d;

    static {
        EnumC5024xb enumC5024xb = new EnumC5024xb("SUSPEND", 0);
        f5229a = enumC5024xb;
        EnumC5024xb enumC5024xb2 = new EnumC5024xb("DROP_OLDEST", 1);
        b = enumC5024xb2;
        EnumC5024xb enumC5024xb3 = new EnumC5024xb("DROP_LATEST", 2);
        c = enumC5024xb3;
        d = new EnumC5024xb[]{enumC5024xb, enumC5024xb2, enumC5024xb3};
    }

    public static EnumC5024xb valueOf(String str) {
        return (EnumC5024xb) Enum.valueOf(EnumC5024xb.class, str);
    }

    public static EnumC5024xb[] values() {
        return (EnumC5024xb[]) d.clone();
    }
}
