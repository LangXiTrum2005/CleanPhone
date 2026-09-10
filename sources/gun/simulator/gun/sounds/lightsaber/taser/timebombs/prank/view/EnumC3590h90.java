package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.h90, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC3590h90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final EnumC3590h90 f4448a;
    public static final EnumC3590h90 b;
    public static final EnumC3590h90 c;
    public static final /* synthetic */ EnumC3590h90[] d;

    static {
        EnumC3590h90 enumC3590h90 = new EnumC3590h90("ALWAYS", 0);
        f4448a = enumC3590h90;
        EnumC3590h90 enumC3590h91 = new EnumC3590h90("ADAPTIVE", 1);
        b = enumC3590h91;
        EnumC3590h90 enumC3590h92 = new EnumC3590h90("NEVER", 2);
        c = enumC3590h92;
        d = new EnumC3590h90[]{enumC3590h90, enumC3590h91, enumC3590h92};
    }

    public static EnumC3590h90 valueOf(String str) {
        return (EnumC3590h90) Enum.valueOf(EnumC3590h90.class, str);
    }

    public static EnumC3590h90[] values() {
        return (EnumC3590h90[]) d.clone();
    }
}
