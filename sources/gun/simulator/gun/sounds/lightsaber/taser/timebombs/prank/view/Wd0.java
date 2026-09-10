package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class Wd0 implements Vd0 {
    public static volatile C2624Nk e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC2438Gf f3929a;
    public final InterfaceC2438Gf b;
    public final InterfaceC3226d30 c;
    public final C5123yg0 d;

    public Wd0(InterfaceC2438Gf interfaceC2438Gf, InterfaceC2438Gf interfaceC2438Gf2, InterfaceC3226d30 interfaceC3226d30, C5123yg0 c5123yg0, C3290dm0 c3290dm0) {
        this.f3929a = interfaceC2438Gf;
        this.b = interfaceC2438Gf2;
        this.c = interfaceC3226d30;
        this.d = c5123yg0;
        c3290dm0.getClass();
        c3290dm0.f4290a.execute(new RunnableC2928Zc(c3290dm0, 5));
    }

    public static Wd0 a() {
        C2624Nk c2624Nk = e;
        if (c2624Nk != null) {
            return (Wd0) c2624Nk.f.get();
        }
        throw new IllegalStateException("Not initialized!");
    }

    public static void b(Context context) {
        if (e == null) {
            synchronized (Wd0.class) {
                try {
                    if (e == null) {
                        C2758So c2758So = new C2758So(0);
                        context.getClass();
                        c2758So.b = context;
                        e = c2758So.d();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
