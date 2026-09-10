package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.e30, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC3314e30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final EnumC3314e30 f4305a;
    public static final EnumC3314e30 b;
    public static final EnumC3314e30 c;
    public static final /* synthetic */ EnumC3314e30[] d;

    static {
        EnumC3314e30 enumC3314e30 = new EnumC3314e30("NETWORK_UNMETERED", 0);
        f4305a = enumC3314e30;
        EnumC3314e30 enumC3314e31 = new EnumC3314e30("DEVICE_IDLE", 1);
        b = enumC3314e31;
        EnumC3314e30 enumC3314e32 = new EnumC3314e30("DEVICE_CHARGING", 2);
        c = enumC3314e32;
        d = new EnumC3314e30[]{enumC3314e30, enumC3314e31, enumC3314e32};
    }

    public static EnumC3314e30 valueOf(String str) {
        return (EnumC3314e30) Enum.valueOf(EnumC3314e30.class, str);
    }

    public static EnumC3314e30[] values() {
        return (EnumC3314e30[]) d.clone();
    }
}
