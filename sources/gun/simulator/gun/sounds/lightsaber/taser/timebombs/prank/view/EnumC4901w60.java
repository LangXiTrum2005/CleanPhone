package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.w60, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC4901w60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final EnumC4901w60 f5168a;
    public static final /* synthetic */ EnumC4901w60[] b;

    static {
        EnumC4901w60 enumC4901w60 = new EnumC4901w60("START", 0);
        f5168a = enumC4901w60;
        b = new EnumC4901w60[]{enumC4901w60, new EnumC4901w60("STOP", 1), new EnumC4901w60("STOP_AND_RESET_REPLAY_CACHE", 2)};
    }

    public static EnumC4901w60 valueOf(String str) {
        return (EnumC4901w60) Enum.valueOf(EnumC4901w60.class, str);
    }

    public static EnumC4901w60[] values() {
        return (EnumC4901w60[]) b.clone();
    }
}
