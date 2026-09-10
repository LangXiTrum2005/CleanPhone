package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.rG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC4474rG {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final EnumC4474rG f4924a;
    public static final /* synthetic */ EnumC4474rG[] b;

    static {
        EnumC4474rG enumC4474rG = new EnumC4474rG("INVARIANT", 0);
        f4924a = enumC4474rG;
        b = new EnumC4474rG[]{enumC4474rG, new EnumC4474rG("IN", 1), new EnumC4474rG("OUT", 2)};
    }

    public static EnumC4474rG valueOf(String str) {
        return (EnumC4474rG) Enum.valueOf(EnumC4474rG.class, str);
    }

    public static EnumC4474rG[] values() {
        return (EnumC4474rG[]) b.clone();
    }
}
