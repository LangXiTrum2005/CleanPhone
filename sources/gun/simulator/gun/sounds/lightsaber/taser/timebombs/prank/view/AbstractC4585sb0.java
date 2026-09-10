package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.sb0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC4585sb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f4985a;
    public static final long b;
    public static final int c;
    public static final int d;
    public static final long e;
    public static final DQ f;
    public static final Qm0 g;
    public static final Qm0 h;

    static {
        String property;
        int i = Ta0.f3778a;
        try {
            property = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            property = "DefaultDispatcher";
        }
        f4985a = property;
        b = WD.U("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        int i2 = Ta0.f3778a;
        if (i2 < 2) {
            i2 = 2;
        }
        c = WD.V("kotlinx.coroutines.scheduler.core.pool.size", i2, 1, 0, 8);
        d = WD.V("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4);
        e = TimeUnit.SECONDS.toNanos(WD.U("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        f = DQ.e;
        g = new Qm0(0);
        h = new Qm0(1);
    }
}
