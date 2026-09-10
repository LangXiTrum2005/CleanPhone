package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.pE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC4297pE {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Integer f4827a;

    static {
        Integer num;
        Integer num2 = null;
        try {
            Object obj = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
            num = obj instanceof Integer ? (Integer) obj : null;
        } catch (Throwable unused) {
        }
        if (num != null && num.intValue() > 0) {
            num2 = num;
        }
        f4827a = num2;
    }
}
