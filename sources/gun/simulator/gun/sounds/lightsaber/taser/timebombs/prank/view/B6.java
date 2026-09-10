package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class B6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final B6 f2856a;
    public static final B6 b;
    public static final /* synthetic */ B6[] c;

    static {
        B6 b6 = new B6("AUTOMATIC", 0);
        f2856a = b6;
        B6 b7 = new B6("ENABLED", 1);
        b = b7;
        c = new B6[]{b6, b7, new B6("DISABLED", 2)};
    }

    public static B6 valueOf(String str) {
        return (B6) Enum.valueOf(B6.class, str);
    }

    public static B6[] values() {
        return (B6[]) c.clone();
    }
}
