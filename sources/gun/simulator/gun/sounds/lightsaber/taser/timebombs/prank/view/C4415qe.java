package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.qe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4415qe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C4415qe f4892a = new C4415qe();
    public static final S5 b = new S5();
    public static int c;
    public static final int d;

    static {
        Object objV;
        try {
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            AbstractC2995aW.p(property, "getProperty(\"kotlinx.ser…lization.json.pool.size\")");
            objV = Z90.i0(property);
        } catch (Throwable th) {
            objV = AbstractC3375el.v(th);
        }
        if (objV instanceof HZ) {
            objV = null;
        }
        Integer num = (Integer) objV;
        d = num != null ? num.intValue() : 1048576;
    }
}
