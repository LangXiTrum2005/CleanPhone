package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.io.IOException;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.hj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3635hj implements JD {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C3635hj f4466a = new C3635hj();

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.JD
    public final C5021xZ intercept(ID id) throws IOException {
        MX mx = (MX) id;
        IX ix = mx.f3407a;
        ix.getClass();
        synchronized (ix) {
            try {
                if (!ix.o) {
                    throw new IllegalStateException("released".toString());
                }
                if (!(!ix.n)) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                if (!(!ix.m)) {
                    throw new IllegalStateException("Check failed.".toString());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C4352ps c4352ps = ix.i;
        AbstractC2995aW.n(c4352ps);
        C4838vS c4838vS = ix.f3221a;
        AbstractC2995aW.q(c4838vS, "client");
        try {
            C4813v60 c4813v60 = new C4813v60(ix, ix.e, c4352ps, c4352ps.a(mx.f, mx.g, mx.h, c4838vS.B, c4838vS.f, !AbstractC2995aW.i(mx.e.b, "GET")).k(c4838vS, mx));
            ix.l = c4813v60;
            ix.q = c4813v60;
            synchronized (ix) {
                ix.m = true;
                ix.n = true;
            }
            if (ix.p) {
                throw new IOException("Canceled");
            }
            return MX.a(mx, 0, c4813v60, null, 61).b(mx.e);
        } catch (C3922l00 e) {
            c4352ps.c(e.b);
            throw e;
        } catch (IOException e2) {
            c4352ps.c(e2);
            throw new C3922l00(e2);
        }
    }
}
