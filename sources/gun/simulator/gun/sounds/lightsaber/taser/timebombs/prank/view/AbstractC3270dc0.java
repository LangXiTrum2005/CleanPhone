package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.dc0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC3270dc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f4278a = new ThreadLocal();

    public static AbstractC3210cs a() {
        ThreadLocal threadLocal = f4278a;
        AbstractC3210cs abstractC3210cs = (AbstractC3210cs) threadLocal.get();
        if (abstractC3210cs != null) {
            return abstractC3210cs;
        }
        C2640Oa c2640Oa = new C2640Oa(Thread.currentThread());
        threadLocal.set(c2640Oa);
        return c2640Oa;
    }
}
