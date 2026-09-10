package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.rD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC4471rD {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final EnumC4471rD f4922a;
    public static final EnumC4471rD b;
    public static final /* synthetic */ EnumC4471rD[] c;

    static {
        EnumC4471rD enumC4471rD = new EnumC4471rD("OK", 0);
        f4922a = enumC4471rD;
        EnumC4471rD enumC4471rD2 = new EnumC4471rD("BAD_CONFIG", 1);
        b = enumC4471rD2;
        c = new EnumC4471rD[]{enumC4471rD, enumC4471rD2};
    }

    public static EnumC4471rD valueOf(String str) {
        return (EnumC4471rD) Enum.valueOf(EnumC4471rD.class, str);
    }

    public static EnumC4471rD[] values() {
        return (EnumC4471rD[]) c.clone();
    }
}
