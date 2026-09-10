package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.io.IOException;
import java.net.Socket;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.ip, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3734ip extends AbstractC3882kb0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3734ip(int i, Object obj, String str) {
        super(str, true);
        this.e = i;
        this.f = obj;
    }

    private void b() {
        C3821jp c3821jp = (C3821jp) this.f;
        synchronized (c3821jp) {
            if (!c3821jp.o || c3821jp.p) {
                return;
            }
            try {
                c3821jp.v();
            } catch (IOException unused) {
                c3821jp.q = true;
            }
            try {
                if (c3821jp.o()) {
                    c3821jp.t();
                    c3821jp.l = 0;
                }
            } catch (IOException unused2) {
                c3821jp.r = true;
                c3821jp.j = AbstractC4496rb.e(new C2537Ka());
            }
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3882kb0
    public final long a() {
        switch (this.e) {
            case 0:
                b();
                return -1L;
            default:
                LX lx = (LX) this.f;
                long jNanoTime = System.nanoTime();
                int i = 0;
                long j = Long.MIN_VALUE;
                KX kx = null;
                int i2 = 0;
                for (KX kx2 : lx.e) {
                    AbstractC2995aW.p(kx2, "connection");
                    synchronized (kx2) {
                        if (lx.b(kx2, jNanoTime) > 0) {
                            i2++;
                        } else {
                            i++;
                            long j2 = jNanoTime - kx2.q;
                            if (j2 > j) {
                                kx = kx2;
                                j = j2;
                            }
                        }
                    }
                }
                long j3 = lx.b;
                if (j < j3 && i <= lx.f3355a) {
                    if (i > 0) {
                        return j3 - j;
                    }
                    if (i2 > 0) {
                        return j3;
                    }
                    return -1L;
                }
                AbstractC2995aW.n(kx);
                synchronized (kx) {
                    if (!(!kx.p.isEmpty()) && kx.q + j == jNanoTime) {
                        kx.j = true;
                        lx.e.remove(kx);
                        Socket socket = kx.d;
                        AbstractC2995aW.n(socket);
                        Vg0.d(socket);
                        if (lx.e.isEmpty()) {
                            lx.c.a();
                        }
                    }
                }
                return 0L;
        }
    }
}
