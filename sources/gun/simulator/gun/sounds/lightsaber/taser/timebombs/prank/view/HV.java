package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class HV {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HV f3174a;
    public static final HV b;
    public static final HV c;
    public static final /* synthetic */ HV[] d;

    static {
        HV hv = new HV("DEFAULT", 0);
        f3174a = hv;
        HV hv2 = new HV("VERY_LOW", 1);
        b = hv2;
        HV hv3 = new HV("HIGHEST", 2);
        c = hv3;
        d = new HV[]{hv, hv2, hv3};
    }

    public static HV valueOf(String str) {
        return (HV) Enum.valueOf(HV.class, str);
    }

    public static HV[] values() {
        return (HV[]) d.clone();
    }
}
