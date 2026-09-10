package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class IV {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final IV f3219a;
    public static final IV b;
    public static final IV c;
    public static final IV d;
    public static final /* synthetic */ IV[] e;

    static {
        IV iv = new IV("IMMEDIATE", 0);
        f3219a = iv;
        IV iv2 = new IV("HIGH", 1);
        b = iv2;
        IV iv3 = new IV("NORMAL", 2);
        c = iv3;
        IV iv4 = new IV("LOW", 3);
        d = iv4;
        e = new IV[]{iv, iv2, iv3, iv4};
    }

    public static IV valueOf(String str) {
        return (IV) Enum.valueOf(IV.class, str);
    }

    public static IV[] values() {
        return (IV[]) e.clone();
    }
}
