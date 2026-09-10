package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.io.Closeable;
import java.io.File;
import java.io.Flushable;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.vc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4850vc implements Closeable, Flushable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3821jp f5141a;

    public C4850vc(File file, long j) {
        AbstractC2995aW.q(file, "directory");
        this.f5141a = new C3821jp(file, j, C4497rb0.h);
    }

    public final void a(HY hy) {
        AbstractC2995aW.q(hy, J0.REQUEST_KEY_EXTRA);
        C3821jp c3821jp = this.f5141a;
        String strO = C3336eJ.o(hy.f3175a);
        synchronized (c3821jp) {
            AbstractC2995aW.q(strO, "key");
            c3821jp.n();
            c3821jp.h();
            C3821jp.w(strO);
            C3383ep c3383ep = (C3383ep) c3821jp.k.get(strO);
            if (c3383ep == null) {
                return;
            }
            c3821jp.u(c3383ep);
            if (c3821jp.i <= c3821jp.e) {
                c3821jp.q = false;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f5141a.close();
    }

    @Override // java.io.Flushable
    public final void flush() {
        this.f5141a.flush();
    }

    public final synchronized void h() {
    }
}
