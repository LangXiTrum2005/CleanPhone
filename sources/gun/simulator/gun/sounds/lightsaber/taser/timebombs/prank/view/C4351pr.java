package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.pr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4351pr implements InterfaceC3656hy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile Object f4854a;
    public final Object b;

    public /* synthetic */ C4351pr(Object obj) {
        this.b = obj;
    }

    public final InterfaceC2888Xo a() {
        if (((InterfaceC2888Xo) this.f4854a) == null) {
            synchronized (this) {
                try {
                    if (((InterfaceC2888Xo) this.f4854a) == null) {
                        this.f4854a = ((AbstractC3997lp) this.b).a();
                    }
                    if (((InterfaceC2888Xo) this.f4854a) == null) {
                        this.f4854a = new C4710tz(6);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return (InterfaceC2888Xo) this.f4854a;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3656hy
    public final Object get() {
        if (this.f4854a == null) {
            synchronized (this) {
                try {
                    if (this.f4854a == null) {
                        Object obj = ((InterfaceC3656hy) this.b).get();
                        AbstractC2871Wx.V(obj, "Argument must not be null");
                        this.f4854a = obj;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f4854a;
    }
}
