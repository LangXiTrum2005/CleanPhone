package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Lp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2578Lp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2552Kp f3375a = new C2552Kp(4);
    public static final C2552Kp b = new C2552Kp(2);
    public static final C2552Kp c;
    public static final C2552Kp d;
    public static final C2552Kp e;
    public static final VS f;
    public static final boolean g;

    static {
        C2552Kp c2552Kp = new C2552Kp(3);
        c = c2552Kp;
        d = new C2552Kp(5);
        e = c2552Kp;
        f = VS.a(c2552Kp, "com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy");
        g = true;
    }

    public abstract int a(int i, int i2, int i3, int i4);

    public abstract float b(int i, int i2, int i3, int i4);
}
