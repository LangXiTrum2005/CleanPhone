package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.zip.CRC32;
import java.util.zip.Deflater;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Py, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2690Py implements InterfaceC4463r70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DX f3581a;
    public final Deflater b;
    public final C4381qA c;
    public boolean d;
    public final CRC32 e;

    public C2690Py(C4848vb c4848vb) {
        DX dx = new DX(c4848vb);
        this.f3581a = dx;
        Deflater deflater = new Deflater(-1, true);
        this.b = deflater;
        this.c = new C4381qA(dx, deflater);
        this.e = new CRC32();
        C4848vb c4848vb2 = dx.b;
        c4848vb2.V(8075);
        c4848vb2.R(8);
        c4848vb2.R(0);
        c4848vb2.U(0);
        c4848vb2.R(0);
        c4848vb2.R(0);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4463r70, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() throws Throwable {
        Deflater deflater = this.b;
        DX dx = this.f3581a;
        if (this.d) {
            return;
        }
        C4381qA c4381qA = this.c;
        ((Deflater) c4381qA.d).finish();
        c4381qA.a(false);
        dx.i((int) this.e.getValue());
        dx.i((int) deflater.getBytesRead());
        th = null;
        try {
            deflater.end();
        } catch (Throwable th) {
            if (th == null) {
                th = th;
            }
        }
        try {
            dx.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.d = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4463r70
    public final void d(C4848vb c4848vb, long j) {
        AbstractC2995aW.q(c4848vb, "source");
        if (!(j >= 0)) {
            throw new IllegalArgumentException(AbstractC2995aW.v0(Long.valueOf(j), "byteCount < 0: ").toString());
        }
        if (j == 0) {
            return;
        }
        V30 v30 = c4848vb.f5139a;
        AbstractC2995aW.n(v30);
        long j2 = j;
        while (j2 > 0) {
            int iMin = (int) Math.min(j2, v30.c - v30.b);
            this.e.update(v30.f3857a, v30.b, iMin);
            j2 -= (long) iMin;
            v30 = v30.f;
            AbstractC2995aW.n(v30);
        }
        this.c.d(c4848vb, j);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4463r70, java.io.Flushable
    public final void flush() {
        this.c.flush();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4463r70
    public final Ic0 timeout() {
        return this.f3581a.f2973a.timeout();
    }
}
