package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.pA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4293pA extends AbstractC4029mA {
    public long d;
    public final /* synthetic */ C4556sA e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4293pA(C4556sA c4556sA, long j) {
        super(c4556sA);
        AbstractC2995aW.q(c4556sA, "this$0");
        this.e = c4556sA;
        this.d = j;
        if (j == 0) {
            h();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.b) {
            return;
        }
        if (this.d != 0 && !Vg0.g(this, TimeUnit.MILLISECONDS)) {
            this.e.b.l();
            h();
        }
        this.b = true;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4029mA, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3588h80
    public final long read(C4848vb c4848vb, long j) throws ProtocolException {
        AbstractC2995aW.q(c4848vb, "sink");
        if (j < 0) {
            throw new IllegalArgumentException(AbstractC2995aW.v0(Long.valueOf(j), "byteCount < 0: ").toString());
        }
        if (!(!this.b)) {
            throw new IllegalStateException("closed".toString());
        }
        long j2 = this.d;
        if (j2 == 0) {
            return -1L;
        }
        long j3 = super.read(c4848vb, Math.min(j2, j));
        if (j3 == -1) {
            this.e.b.l();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            h();
            throw protocolException;
        }
        long j4 = this.d - j3;
        this.d = j4;
        if (j4 == 0) {
            h();
        }
        return j3;
    }
}
