package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.InterruptedIOException;

/* JADX INFO: loaded from: classes4.dex */
public final class KA implements InterfaceC4463r70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f3306a;
    public final C4848vb b;
    public boolean c;
    public final /* synthetic */ MA d;

    public KA(MA ma, boolean z) {
        AbstractC2995aW.q(ma, "this$0");
        this.d = ma;
        this.f3306a = z;
        this.b = new C4848vb();
    }

    public final void a(boolean z) throws InterruptedIOException {
        long jMin;
        boolean z2;
        MA ma = this.d;
        synchronized (ma) {
            ma.l.h();
            while (ma.e >= ma.f && !this.f3306a && !this.c && ma.f() == null) {
                try {
                    ma.l();
                } catch (Throwable th) {
                    ma.l.l();
                    throw th;
                }
            }
            ma.l.l();
            ma.b();
            jMin = Math.min(ma.f - ma.e, this.b.b);
            ma.e += jMin;
            z2 = z && jMin == this.b.b;
        }
        this.d.l.h();
        try {
            MA ma2 = this.d;
            ma2.b.k(ma2.f3396a, z2, this.b, jMin);
        } finally {
            this.d.l.l();
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4463r70, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        MA ma = this.d;
        byte[] bArr = Vg0.f3884a;
        synchronized (ma) {
            if (this.c) {
                return;
            }
            boolean z = ma.f() == null;
            MA ma2 = this.d;
            if (!ma2.j.f3306a) {
                if (this.b.b > 0) {
                    while (this.b.b > 0) {
                        a(true);
                    }
                } else if (z) {
                    ma2.b.k(ma2.f3396a, true, null, 0L);
                }
            }
            synchronized (this.d) {
                this.c = true;
            }
            this.d.b.flush();
            this.d.a();
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4463r70
    public final void d(C4848vb c4848vb, long j) throws InterruptedIOException {
        AbstractC2995aW.q(c4848vb, "source");
        byte[] bArr = Vg0.f3884a;
        C4848vb c4848vb2 = this.b;
        c4848vb2.d(c4848vb, j);
        while (c4848vb2.b >= PlaybackStateCompat.ACTION_PREPARE) {
            a(false);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4463r70, java.io.Flushable
    public final void flush() throws InterruptedIOException {
        MA ma = this.d;
        byte[] bArr = Vg0.f3884a;
        synchronized (ma) {
            ma.b();
        }
        while (this.b.b > 0) {
            a(false);
            this.d.b.flush();
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4463r70
    public final Ic0 timeout() {
        return this.d.l;
    }
}
