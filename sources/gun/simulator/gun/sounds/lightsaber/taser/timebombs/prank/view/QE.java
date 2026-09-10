package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: loaded from: classes4.dex */
public abstract class QE {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SE f3595a = new SE("COMPLETING_ALREADY", 1);
    public static final SE b = new SE("COMPLETING_WAITING_CHILDREN", 1);
    public static final SE c = new SE("COMPLETING_RETRY", 1);
    public static final SE d = new SE("TOO_LATE_TO_CANCEL", 1);
    public static final SE e = new SE("SEALED", 1);
    public static final C2708Qq f = new C2708Qq(false);
    public static final C2708Qq g = new C2708Qq(true);

    public static final Object a(Object obj) {
        XC xc;
        YC yc = obj instanceof YC ? (YC) obj : null;
        return (yc == null || (xc = yc.f4009a) == null) ? obj : xc;
    }
}
