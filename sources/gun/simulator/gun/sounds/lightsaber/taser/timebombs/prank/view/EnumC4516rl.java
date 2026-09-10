package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.rl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC4516rl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final EnumC4516rl f4942a;
    public static final EnumC4516rl b;
    public static final EnumC4516rl c;
    public static final EnumC4516rl d;
    public static final EnumC4516rl e;
    public static final /* synthetic */ EnumC4516rl[] f;

    static {
        EnumC4516rl enumC4516rl = new EnumC4516rl("LOCAL", 0);
        f4942a = enumC4516rl;
        EnumC4516rl enumC4516rl2 = new EnumC4516rl("REMOTE", 1);
        b = enumC4516rl2;
        EnumC4516rl enumC4516rl3 = new EnumC4516rl("DATA_DISK_CACHE", 2);
        c = enumC4516rl3;
        EnumC4516rl enumC4516rl4 = new EnumC4516rl("RESOURCE_DISK_CACHE", 3);
        d = enumC4516rl4;
        EnumC4516rl enumC4516rl5 = new EnumC4516rl("MEMORY_CACHE", 4);
        e = enumC4516rl5;
        f = new EnumC4516rl[]{enumC4516rl, enumC4516rl2, enumC4516rl3, enumC4516rl4, enumC4516rl5};
    }

    public static EnumC4516rl valueOf(String str) {
        return (EnumC4516rl) Enum.valueOf(EnumC4516rl.class, str);
    }

    public static EnumC4516rl[] values() {
        return (EnumC4516rl[]) f.clone();
    }
}
