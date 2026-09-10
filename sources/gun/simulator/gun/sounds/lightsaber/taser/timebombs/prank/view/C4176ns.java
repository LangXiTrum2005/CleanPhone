package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.io.IOException;
import java.net.ProtocolException;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.ns, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4176ns extends AbstractC4883vw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f4764a;
    public long b;
    public boolean c;
    public boolean d;
    public boolean e;
    public final /* synthetic */ C4813v60 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4176ns(C4813v60 c4813v60, InterfaceC3588h80 interfaceC3588h80, long j) {
        super(interfaceC3588h80);
        AbstractC2995aW.q(interfaceC3588h80, "delegate");
        this.f = c4813v60;
        this.f4764a = j;
        this.c = true;
        if (j == 0) {
            a(null);
        }
    }

    public final IOException a(IOException iOException) {
        if (this.d) {
            return iOException;
        }
        this.d = true;
        if (iOException == null && this.c) {
            this.c = false;
            C4813v60 c4813v60 = this.f;
            ((AbstractC2865Wr) c4813v60.c).responseBodyStart((IX) c4813v60.b);
        }
        return this.f.a(this.b, true, false, iOException);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4883vw, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.e) {
            return;
        }
        this.e = true;
        try {
            super.close();
            a(null);
        } catch (IOException e) {
            throw a(e);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4883vw, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3588h80
    public final long read(C4848vb c4848vb, long j) throws IOException {
        AbstractC2995aW.q(c4848vb, "sink");
        if (!(!this.e)) {
            throw new IllegalStateException("closed".toString());
        }
        try {
            long j2 = delegate().read(c4848vb, j);
            if (this.c) {
                this.c = false;
                C4813v60 c4813v60 = this.f;
                ((AbstractC2865Wr) c4813v60.c).responseBodyStart((IX) c4813v60.b);
            }
            if (j2 == -1) {
                a(null);
                return -1L;
            }
            long j3 = this.b + j2;
            long j4 = this.f4764a;
            if (j4 == -1 || j3 <= j4) {
                this.b = j3;
                if (j3 == j4) {
                    a(null);
                }
                return j2;
            }
            throw new ProtocolException("expected " + j4 + " bytes but received " + j3);
        } catch (IOException e) {
            throw a(e);
        }
    }
}
