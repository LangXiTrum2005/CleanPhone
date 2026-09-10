package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Dp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2370Dp implements InterfaceC5194zW {
    public static final Object c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile InterfaceC5194zW f2991a;
    public volatile Object b;

    public static InterfaceC5194zW a(InterfaceC4968wt interfaceC4968wt) {
        if (interfaceC4968wt instanceof C2370Dp) {
            return interfaceC4968wt;
        }
        C2370Dp c2370Dp = new C2370Dp();
        c2370Dp.b = c;
        c2370Dp.f2991a = interfaceC4968wt;
        return c2370Dp;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5194zW
    public final Object get() {
        Object obj = this.b;
        Object obj2 = c;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.b;
                    if (obj == obj2) {
                        obj = this.f2991a.get();
                        Object obj3 = this.b;
                        if (obj3 != obj2 && obj3 != obj) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + obj + ". This is likely due to a circular dependency.");
                        }
                        this.b = obj;
                        this.f2991a = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return obj;
    }
}
