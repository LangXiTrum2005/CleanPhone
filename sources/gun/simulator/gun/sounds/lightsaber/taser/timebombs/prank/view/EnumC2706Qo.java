package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Qo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC2706Qo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final EnumC2706Qo f3627a;
    public static final EnumC2706Qo b;
    public static final EnumC2706Qo c;
    public static final /* synthetic */ EnumC2706Qo[] d;

    static {
        EnumC2706Qo enumC2706Qo = new EnumC2706Qo("POSITIVE", 0);
        f3627a = enumC2706Qo;
        EnumC2706Qo enumC2706Qo2 = new EnumC2706Qo("NEUTRAL", 1);
        b = enumC2706Qo2;
        EnumC2706Qo enumC2706Qo3 = new EnumC2706Qo("NEGATIVE", 2);
        c = enumC2706Qo3;
        d = new EnumC2706Qo[]{enumC2706Qo, enumC2706Qo2, enumC2706Qo3};
    }

    public static EnumC2706Qo valueOf(String str) {
        return (EnumC2706Qo) Enum.valueOf(EnumC2706Qo.class, str);
    }

    public static EnumC2706Qo[] values() {
        return (EnumC2706Qo[]) d.clone();
    }
}
