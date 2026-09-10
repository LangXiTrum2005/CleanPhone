package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.oA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4205oA extends AbstractC4029mA {
    public final ZA d;
    public long e;
    public boolean f;
    public final /* synthetic */ C4556sA g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4205oA(C4556sA c4556sA, ZA za) {
        super(c4556sA);
        AbstractC2995aW.q(c4556sA, "this$0");
        AbstractC2995aW.q(za, "url");
        this.g = c4556sA;
        this.d = za;
        this.e = -1L;
        this.f = true;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.b) {
            return;
        }
        if (this.f && !Vg0.g(this, TimeUnit.MILLISECONDS)) {
            this.g.b.l();
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
        if (!this.f) {
            return -1L;
        }
        long j2 = this.e;
        C4556sA c4556sA = this.g;
        if (j2 == 0 || j2 == -1) {
            if (j2 != -1) {
                c4556sA.c.C();
            }
            try {
                this.e = c4556sA.c.P();
                String string = AbstractC3089ba0.V0(c4556sA.c.C()).toString();
                if (this.e < 0 || (string.length() > 0 && !AbstractC3089ba0.N0(string, ";", false))) {
                    throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.e + string + '\"');
                }
                if (this.e == 0) {
                    this.f = false;
                    C4622sz c4622sz = c4556sA.f;
                    c4622sz.getClass();
                    C5036xh c5036xh = new C5036xh();
                    while (true) {
                        String strJ = c4622sz.f5007a.j(c4622sz.b);
                        c4622sz.b -= (long) strJ.length();
                        if (strJ.length() == 0) {
                            break;
                        }
                        c5036xh.b(strJ);
                    }
                    c4556sA.g = c5036xh.e();
                    C4838vS c4838vS = c4556sA.f4966a;
                    AbstractC2995aW.n(c4838vS);
                    C4447qz c4447qz = c4556sA.g;
                    AbstractC2995aW.n(c4447qz);
                    UA.b(c4838vS.j, this.d, c4447qz);
                    h();
                }
                if (!this.f) {
                    return -1L;
                }
            } catch (NumberFormatException e) {
                throw new ProtocolException(e.getMessage());
            }
        }
        long j3 = super.read(c4848vb, Math.min(j, this.e));
        if (j3 != -1) {
            this.e -= j3;
            return j3;
        }
        c4556sA.b.l();
        ProtocolException protocolException = new ProtocolException("unexpected end of stream");
        h();
        throw protocolException;
    }
}
