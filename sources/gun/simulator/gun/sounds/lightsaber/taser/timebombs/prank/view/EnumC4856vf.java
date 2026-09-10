package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.vf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC4856vf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final EnumC4856vf f5145a;
    public static final /* synthetic */ EnumC4856vf[] b;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC4856vf EF2;

    static {
        EnumC4856vf enumC4856vf = new EnumC4856vf("UNKNOWN", 0);
        EnumC4856vf enumC4856vf2 = new EnumC4856vf("ANDROID_FIREBASE", 1);
        f5145a = enumC4856vf2;
        b = new EnumC4856vf[]{enumC4856vf, enumC4856vf2};
    }

    public static EnumC4856vf valueOf(String str) {
        return (EnumC4856vf) Enum.valueOf(EnumC4856vf.class, str);
    }

    public static EnumC4856vf[] values() {
        return (EnumC4856vf[]) b.clone();
    }
}
