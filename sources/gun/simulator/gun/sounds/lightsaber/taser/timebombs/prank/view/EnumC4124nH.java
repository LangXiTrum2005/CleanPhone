package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.nH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC4124nH {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final EnumC4124nH f4736a;
    public static final EnumC4124nH b;
    public static final EnumC4124nH c;
    public static final /* synthetic */ EnumC4124nH[] d;

    static {
        EnumC4124nH enumC4124nH = new EnumC4124nH("SYNCHRONIZED", 0);
        f4736a = enumC4124nH;
        EnumC4124nH enumC4124nH2 = new EnumC4124nH("PUBLICATION", 1);
        b = enumC4124nH2;
        EnumC4124nH enumC4124nH3 = new EnumC4124nH("NONE", 2);
        c = enumC4124nH3;
        d = new EnumC4124nH[]{enumC4124nH, enumC4124nH2, enumC4124nH3};
    }

    public static EnumC4124nH valueOf(String str) {
        return (EnumC4124nH) Enum.valueOf(EnumC4124nH.class, str);
    }

    public static EnumC4124nH[] values() {
        return (EnumC4124nH[]) d.clone();
    }
}
