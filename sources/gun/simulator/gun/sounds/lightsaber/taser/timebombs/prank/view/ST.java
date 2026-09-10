package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class ST {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ST f3715a;
    public static final ST b;
    public static final ST[] c;
    public static final /* synthetic */ ST[] d;

    static {
        ST st = new ST("length", 0);
        f3715a = st;
        ST st2 = new ST("fixed", 1);
        b = st2;
        d = new ST[]{st, st2, new ST("percent", 2), new ST("proportional", 3)};
        c = values();
    }

    public static ST valueOf(String str) {
        return (ST) Enum.valueOf(ST.class, str);
    }

    public static ST[] values() {
        return (ST[]) d.clone();
    }
}
