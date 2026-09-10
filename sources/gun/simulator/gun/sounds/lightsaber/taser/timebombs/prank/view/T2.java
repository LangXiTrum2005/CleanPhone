package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class T2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final T2 f3748a;
    public static final T2 b;
    public static final T2 c;
    public static final /* synthetic */ T2[] d;

    static {
        T2 t2 = new T2("AD_STATE_IDLE", 0);
        f3748a = t2;
        T2 t3 = new T2("AD_STATE_VISIBLE", 1);
        b = t3;
        T2 t4 = new T2("AD_STATE_NOTVISIBLE", 2);
        c = t4;
        d = new T2[]{t2, t3, t4};
    }

    public static T2 valueOf(String str) {
        return (T2) Enum.valueOf(T2.class, str);
    }

    public static T2[] values() {
        return (T2[]) d.clone();
    }
}
