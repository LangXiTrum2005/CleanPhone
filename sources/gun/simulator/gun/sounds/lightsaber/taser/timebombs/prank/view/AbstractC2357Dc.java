package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Dc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC2357Dc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f2977a;

    static {
        Object objV;
        try {
            objV = Class.forName("java.lang.ClassValue");
        } catch (Throwable th) {
            objV = AbstractC3375el.v(th);
        }
        if (!(objV instanceof HZ)) {
            objV = Boolean.TRUE;
        }
        Object obj = Boolean.FALSE;
        if (objV instanceof HZ) {
            objV = obj;
        }
        f2977a = ((Boolean) objV).booleanValue();
    }
}
