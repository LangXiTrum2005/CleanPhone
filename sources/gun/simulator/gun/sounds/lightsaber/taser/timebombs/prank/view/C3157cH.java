package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.cH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3157cH implements AW {
    public static final Object c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile Object f4213a = c;
    public volatile AW b;

    public C3157cH(AW aw) {
        this.b = aw;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AW
    public final Object get() {
        Object obj = this.f4213a;
        Object obj2 = c;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.f4213a;
                    if (obj == obj2) {
                        obj = this.b.get();
                        this.f4213a = obj;
                        this.b = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return obj;
    }
}
