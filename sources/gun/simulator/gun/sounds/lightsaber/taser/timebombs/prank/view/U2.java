package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class U2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final U2 f3807a;
    public static final U2 b;
    public static final U2 c;
    public static final /* synthetic */ U2[] d;

    static {
        U2 u2 = new U2("AD_STATE_IDLE", 0);
        f3807a = u2;
        U2 u3 = new U2("AD_STATE_VISIBLE", 1);
        b = u3;
        U2 u4 = new U2("AD_STATE_NOTVISIBLE", 2);
        c = u4;
        d = new U2[]{u2, u3, u4};
    }

    public static U2 valueOf(String str) {
        return (U2) Enum.valueOf(U2.class, str);
    }

    public static U2[] values() {
        return (U2[]) d.clone();
    }
}
