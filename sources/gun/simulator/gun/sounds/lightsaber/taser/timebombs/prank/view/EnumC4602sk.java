package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.sk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC4602sk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final EnumC4602sk f4993a;
    public static final EnumC4602sk b;
    public static final EnumC4602sk c;
    public static final /* synthetic */ EnumC4602sk[] d;

    static {
        EnumC4602sk enumC4602sk = new EnumC4602sk("COROUTINE_SUSPENDED", 0);
        f4993a = enumC4602sk;
        EnumC4602sk enumC4602sk2 = new EnumC4602sk("UNDECIDED", 1);
        b = enumC4602sk2;
        EnumC4602sk enumC4602sk3 = new EnumC4602sk("RESUMED", 2);
        c = enumC4602sk3;
        d = new EnumC4602sk[]{enumC4602sk, enumC4602sk2, enumC4602sk3};
    }

    public static EnumC4602sk valueOf(String str) {
        return (EnumC4602sk) Enum.valueOf(EnumC4602sk.class, str);
    }

    public static EnumC4602sk[] values() {
        return (EnumC4602sk[]) d.clone();
    }
}
