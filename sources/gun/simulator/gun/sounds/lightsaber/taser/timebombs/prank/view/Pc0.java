package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class Pc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pc0 f3559a;
    public static final Pc0 b;
    public static final Pc0 c;
    public static final /* synthetic */ Pc0[] d;

    static {
        Pc0 pc0 = new Pc0("OK", 0);
        f3559a = pc0;
        Pc0 pc1 = new Pc0("BAD_CONFIG", 1);
        b = pc1;
        Pc0 pc2 = new Pc0("AUTH_ERROR", 2);
        c = pc2;
        d = new Pc0[]{pc0, pc1, pc2};
    }

    public static Pc0 valueOf(String str) {
        return (Pc0) Enum.valueOf(Pc0.class, str);
    }

    public static Pc0[] values() {
        return (Pc0[]) d.clone();
    }
}
