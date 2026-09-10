package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class Xb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Xb0 f3978a;
    public static final Xb0 b;
    public static final /* synthetic */ Xb0[] c;

    static {
        Xb0 xb0 = new Xb0("PERCENT", 0);
        f3978a = xb0;
        Xb0 xb1 = new Xb0("INDEX", 1);
        b = xb1;
        c = new Xb0[]{xb0, xb1};
    }

    public static Xb0 valueOf(String str) {
        return (Xb0) Enum.valueOf(Xb0.class, str);
    }

    public static Xb0[] values() {
        return (Xb0[]) c.clone();
    }
}
