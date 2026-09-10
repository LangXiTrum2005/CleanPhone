package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class KJ {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final KJ f3310a;
    public static final KJ b;
    public static final KJ c;
    public static final KJ d;
    public static final KJ e;
    public static final KJ f;
    public static final /* synthetic */ KJ[] g;

    static {
        KJ kj = new KJ("SET_ANIMATION", 0);
        f3310a = kj;
        KJ kj2 = new KJ("SET_PROGRESS", 1);
        b = kj2;
        KJ kj3 = new KJ("SET_REPEAT_MODE", 2);
        c = kj3;
        KJ kj4 = new KJ("SET_REPEAT_COUNT", 3);
        d = kj4;
        KJ kj5 = new KJ("SET_IMAGE_ASSETS", 4);
        e = kj5;
        KJ kj6 = new KJ("PLAY_OPTION", 5);
        f = kj6;
        g = new KJ[]{kj, kj2, kj3, kj4, kj5, kj6};
    }

    public static KJ valueOf(String str) {
        return (KJ) Enum.valueOf(KJ.class, str);
    }

    public static KJ[] values() {
        return (KJ[]) g.clone();
    }
}
