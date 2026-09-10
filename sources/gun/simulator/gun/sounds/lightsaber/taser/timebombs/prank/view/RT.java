package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class RT {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final RT f3658a;
    public static final RT b;
    public static final RT c;
    public static final RT[] d;
    public static final /* synthetic */ RT[] e;

    static {
        RT rt = new RT("tangent", 0);
        f3658a = rt;
        RT rt2 = new RT("chain", 1);
        b = rt2;
        RT rt3 = new RT("chainScale", 2);
        c = rt3;
        e = new RT[]{rt, rt2, rt3};
        d = values();
    }

    public static RT valueOf(String str) {
        return (RT) Enum.valueOf(RT.class, str);
    }

    public static RT[] values() {
        return (RT[]) e.clone();
    }
}
